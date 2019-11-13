/** Grammars always start with a grammar header. This grammar is called
 *  ArrayInit and must match the filename: ArrayInit.g4
 */
grammar SRgrammar;

/** A rule called init that matches comma-separated values between {...}. */

combined_component: combined_specpart body_stmt_ls end_id;

separate_body: ;


spec_body: ;

combined_specpart: ;
body_stmt_ls: ;
end_id: ;


concurrent_invocation: explicit_call
                     | send_stmt
                     | expr;

separator_opt: separator_opt TK_SEPARATOR
             | ;

concurrent_cmd: quantifiers_opt separator_opt concurrent_invocation;

concurrent_cmd_lp: concurrent_cmd
                 | concurrent_cmd_lp TK_PARALLEL concurrent_cmd;

concurrent_stmt: TK_CO concurrent_cmd_lp TK_OC;

p_stmt: TK_P TK_LPAREN expr TK_RPAREN;

receive_stmt: TK_RECEIVE expr paren_list;

sync_expr_opt: TK_AND expr
              | TK_SUCHTHAT expr
              | ;

sched_expr_opt: TK_BY expr
             | ;
return_name_opt: TK_RETURNS TK_ID;

id_ls: id_lp;

param_names: TK_LPAREN id_ls TK_RPAREN return_name_opt;

subscripts: bracketed_list
          | bracketed_list subscriṕts;

in_op: qualified_id
     | qualified_id subscripts;

in_spec: in_op param_names;

quantifiers_opt: TK_LPAREN quantifier_lp TK_PAREN;

in_cmd: quantifiers_opt in_spec sync_expr_opt sched_expr_opt TK_ARROW block;

in_cmd_lp: in_cmd in_cmd_lp_aux;

in_cmd_lp_aux: TK_SQUARE in_cmd in_cmd_lp_aux
               | ;

input_stmt: TK_IN in_cmd_lp else_cmd_opt TK_IN;


v_stmt: TK_V TK_LPAREN expr TK_RPAREN;

such_that_opt: TK_SUCHTHAT expr
             | ;

step_opt: TK_BY expr
        | ;

direction: TK_TO
         | TK_DOWNTO;

quantifier: TK_ID TK_TK_ASSIGN expr direction expr step_opt such_that_opt;

quantifier_lp: quantifier
             | quantifier_lp TK_COMMA quantifier;

else_cmd_opt: TK_SQUARE TK_ELSE TK_ARROW block
            | ;

for_all_stmt: TK_FA quantifier_lp TK_ARROW block TK_AF;

do_stmt:TK_DO guarded_cmd_lp else_cmd_opt TK_OD;

guarded_cmd: expr TK_ARROW block;

guarded_cmd_lp: guarded_cmd
              | guarded_cmd_lp TK_SWAURE guarded_cmd;

if_stmt: TK_IF guarded_cmd_lp else_cmd_opt TK_FI;

block_item: decl
          | stmt
          | expr
          | import_clause;

block_items: block_item block_items_aux;

block_items_aux: TK_SEPARATOR block_item block_items_aux
                | ;

block: block_items;

begin_end: TK_BEGIN block TK_END;

destroy_stmt: TK_DESTROY expr;

explicit_call: TK_CALL invocation;

send_stmt: TK_SEND invocation;

forward_stmt: TK_FORWARD invocation;

reply_stmt: TK_REPLY;

return_stmt: TK_RETURN;

next_stmt: TK_NEXT;

exit_stmt: TK_EXIT;

exit_code_opt: TK_LPAREN expr TK_RPAREN;

stop_stmt: TK_STOP exit_code_opt;

skip_stmt: TK_SKIP;

stmt: skip_stmt
    | stop_stmt
    | exit_stmt
    | next_stmt
    | return_stmt
    | reply_stmt
    | forward_stmt
    | send_stmt
    | explicit_call
    | destroy_stmt
    | begin_end
    | if_stmt
    | do_stmt
    | for_all_stmt
    | v_stmt
    | input_stmt
    | receive_stmt
    | p_stmt
    | concurrent_stmt;

proc: TK_PROC TK_ID param_names block end_id;

process:  TK_PROCESS TK_ID return_spec_null quantifiers_opt block end_id;

procedure: TK_PROCEDURE TK_ID prototype block end_id;

initial_opt: | TK_INITIAL;

initial_block: TK_INITIAL block TK_END initial_opt;

final_opt: | TK_FINAL;
final_block: TK_FINAL block TK_END final_opt;


body_only: stmt
         | proc
         | process
         | procedure
         | initial_block
         | final_block;

import_name: TK_ID;

import_list: import_name
           | import_list TK_COMMA import_name;

extend_clause: TK_EXTEND import_list;

import_clause: TK_IMPORT import_list;

colon_opt: TK_COLON
         | ;

oper_def : id_subs_lp op_prototype
         | id_subs_lp colon_opt qualified_id;

oper_def_lp: oper_def
            | oper_def_lp TK_COMMA oper_def;

op_or_ext: TK_OP
         | TK_EXTERNAL;

op_decl: op_or_ext oper_def_lp;

sem_init: TK_ASSIGN expr
        | ;

sem_def: id_subs sem_proto sem_init;

sem_def_lp: sem_def
           | sem_def_lp TK_COMMA sem_def;

sem_decl: TK_SEM sem_def_lp;

eq_opt: TK_EQ
      | ;

optype_decl: TK_OPTYPE TK_ID eq_opt op_prototype;

var_att: TK_COLON type
       | TK_COLON type
       | TK_COLON type TK_ASSIGN expr
       | TK_ASSIGN expr;

location_opt: TK_ON expr
            | ;

rsrc_name: TK_ID
         | TK_VM;

create_call: rsrc_name paren_list;


create_expr: TK_CREATE create_call location_opt;

suffix_expr: TK_INCR
            | TK_DECR
            | TK_HAT
            | TK_PERIOD TK_ID
            | TK_LBRACKET bound_lp TK_LBRACKET;

new_item: unsub_type
        | TK_SEM sem_proto
        | TK_OP op_prototype;

subscriṕts_opt: subscriṕts
              | ;

return_spec_null: ;

sem_proto: return_spec_null;

op_restriction: TK_CALL
              | TK_SEND
              | TK_CALL TK_COMMA TK_SEND
              | TK_SEND TK_COMMA TK_CALL;

op_restriction_opt: TK_LBRACE op_restriction TK_RBRACE;

return_spec_opt: TK_RETURNS type
               | TK_RETURNS id_subs TK_COLON type
               | TK_RETURNS TK_ID TK_BOGUS;

param_kind_opt: TK_VAL
              | TK_VAR
              | TK_RES
              | TK_REF
              | ;

param_spec: param_kind_opt type ;

param_spec_lp: param_spec
             | param_spec TK_SEPARATOR
             | param_spec TK_SEPARATOR param_spec_lp;

param_spec_ls: param_spec_lp
             | ;

parameters:TK_LPAREN param_spec_ls TK_RPAREN;

prototype: parameters return_spec_opt;

op_prototype: prototype op_restriction_opt;

qualified_id: TK_ID
            | TK_ID TK_PERIOD TK_ID;

cap_for: qualified_id
       | op_prototype
       | TK_SEM sem_proto
       | TK_VM;

capability_def: TK_CAP cap_for;

union_def: TK_UNION TK_LPAREN field_lp TK_RPAREN;

field: var_def_lp;

field_lp: field
        | field TK_SEPARATOR
        | field TK_SEPARATOR field;

record_def: TK_REC TK_LPAREN field_lp TK_RPAREN;

pointer_def: TK_PTR type
           | TK_PTR TK_ANY;

id_lp: TK_ID
     | id_lp TK_COMMA TK_ID;

enum_def:TK_ENUM TK_LPAREN id_lp TK_RPAREN;

string_lim: expr
          | TK_ASTER;

string_def: TK_STRING TK_LBRACKET string_lim TK_RBRACKET
          | TK_STRING TK_LPAREN string_lim TK_RPAREN;

basic_type: TK_BOOL
          | TK_CHAR
          | TK_INT
          | TK_FILE
          | TK_REAL;

unsub_type: basic_type
          | string_def
          | enum_def
          | pointer_def
          | record_def
          | union_def
          | capability_def
          | qualified_id;

type: subscriṕts unsub_type
    | unsub_type;

paren_expr: TK_LPAREN expr TK_RPAREN;

prefix_expr: TK_NOT expr
           | TK_PLUS expr
           | TK_MINUS expr
           | TK_ADDR expr
           | TK_QMARK expr
           | TK_INCR expr
           | TK_DECR expr
           | TK_STRING paren_expr
           | TK_LOW TK_LPAREN type TK_RPAREN
           | TK_HIGH TK_LPAREN type TK_RPAREN
           | TK_NEW TK_LPAREN subscriṕts_opt new_item TK_RPAREN;

binary_expr: TK_EXPON expr
           | TK_ASTER expr
           | TK_DIV expr
           | TK_MOD expr
           | TK_REMDR expr
           | TK_PLUS expr
           | TK_MINUS expr
           | TK_CONCAT expr
           | TK_EQ expr
           | TK_NE expr
           | TK_GE expr
           | TK_LE expr
           | TK_GT expr
           | TK_LT expr
           | TK_AND expr
           | TK_OR expr
           | TK_XOR expr
           | TK_RSHIFT expr
           | TK_LSHIFT expr
           | TK_SWAP expr
           | TK_ASSIGN expr
           | TK_AUG_PLUS expr
           | TK_AUG_MINUS expr
           | TK_AUG_ASTER expr
           | TK_AUG_DIV expr
           | TK_AUG_REMDR expr
           | TK_AUG_EXPON expr
           | TK_AUG_OR expr
           | TK_AUG_AND expr
           | TK_AUG_CONCAT expr
           | TK_AUG_RSHIFT expr
           | TK_AUG_LSHIFT expr;

constr_item: expr
           | TK_LBRACKET expr TK_RBRACKET expr;

constr_item_lp: constr_item
               | constr_item_lp TK_COMMA constr_item;

constructor: TK_LPAREN constr_item_lp TK_RPAREN;

expr_lp: expr
       | expr_lp TK_COMMA expr;

paren_item_ls: expr_lp
             | ;

paren_list: TK_LPAREN paren_item_ls TK_RPAREN;

invocation: paren_list;

literal: TK_ILIT
       | TK_RLIT
       | TK_BLIT
       | TK_CLIT
       | TK_SLIT
       | TK_NLIT
       | TK_FLIT;

expr: TK_ID
    | literal
    | expr invocation
    | constructor
    | expr binary_expr
    | prefix_expr
    | expr suffix_expr
    | create_expr;

bounds: expr
      | TK_ASTER;

bound_lp: bounds
        | bound_lp TK_COMMA bounds;

bracketed_list: TK_LBRACKET bound_lp TK_RBRACKET;

subscriṕts: bracketed_list
           | bracketed_list subscriṕts;

id_subs: TK_ID
        | TK_ID subscriṕts;

id_subs_lp: id_subs
          | id_subs_lp TK_COMMA id_subs;

var_def: id_subs_lp var_att;

var_def_lp: var_def
            | var_def_lp TK_COMMA var_def;

var_or_const: TK_VAR
            | TK_CONST;

obj_decl: var_or_const var_def_lp ;

type_restriction: TK_LBRACE TK_ID TK_RBRACE
                | ;

type_decl: TK_TYPE TK_ID TK_EQ type_restriction ;

decl: type_decl
    | obj_decl
    | optype_decl
    | sem_decl
    | op_decl;

common_stmt: decl
           | import_clause
           | ;

spec_stmt: common_stmt
          | extend_clause
          | body_only;

spec_stmt_ls: spec_stmt
            | spec_stmt_ls TK_SEPARATOR spec_stmt;

comp_kwd: TK_GLOBAL |
          TK_RESOURCE;

comp_label: comp_kwd TK_ID;

spec_component : comp_label spec_stmt_ls spec_body;

component  : spec_component TK_SEPARATOR
            | combined_component TK_SEPARATOR
            | separate_body TK_SEPARATOR; // must match at least one value

/** A value can be either a nested array/struct or a simple integer (INT) */

// parser rules start with lowercase letters, lexer rules with uppercase
INT :   [0-9]+ ;             // Define token INT as one or more digits
WS  :   [ \t\r\n]+ -> skip ; // Define whitespace rule, toss it out
TK_SEPARATOR: ';';
TK_RESOURCE: 'resource';
TK_GLOBAL: 'global';
TK_EXTEND: 'extend';
TK_IMPORT: 'import';

TK_COMMA: ',';
TK_VAR: 'var';
TK_CONST: 'const';
TK_LBRACE: '{';
TK_RBRACE: '}';
TK_TYPE: 'type';
TK_EQ: '=';
TK_ASTER: '*';
TK_ILIT: 'int literal';
TK_RLIT: 'real literal';
TK_BLIT: 'bool lteral';
TK_CLIT: 'char literal';
TK_SLIT: 'string literal';
TK_NLIT: 'null literal';
TK_FLIT: 'float literal';
TK_LPAREN: '(';
TK_RPAREN: ')';
TK_LBRACKET: '[';
TK_RBRACKET: ']';

TK_EXPON: '**';
TK_DIV: '/';
TK_REMDR: '%';
TK_PLUS: '+';
TK_MINUS: '-';
TK_CONCAT: '||';
TK_NE: '!=';
TK_GE: '>=';
TK_LE: '<=';
TK_GT: '>';
TK_LT: '<';
TK_AND: '&';
TK_OR: '|';
TK_XOR: 'xor';
TK_RSHIFT: '>>';
TK_LSHIFT: '<<';
TK_SWAP: ':=:';
TK_ASSIGN: ':=';
TK_AUG_PLUS: '+:=';
TK_AUG_MINUS: '-:=';
TK_AUG_ASTER: '*:=';
TK_AUG_DIV: '/:=';
TK_AUG_REMDR: '%:=';
TK_AUG_EXPON: '**:=';
TK_AUG_OR: '|:=';
TK_AUG_AND: '&:=';
TK_AUG_CONCAT: '||:=';
TK_AUG_RSHIFT: '>>:=';
TK_AUG_LSHIFT: '<<:=';

TK_RETURNS: 'returns';
TK_NEW: 'new';
TK_LOW: 'low';
TK_HIGH: 'high';
TK_COLON: ':';
TK_VAL:'val';
TK_RES: 'res';
TK_REF: 'ref';
TK_CAP: 'cap';
TK_CALL: 'call';
TK_BOGUS: 'bogus';
TK_PERIOD: '.';
TK_PROC: 'proc';

TK_SEND:'send';
TK_VM:'vm';
TK_SEM: 'sem';
TK_REC: 'rec';
TK_ANY: 'any';

TK_INCR: '++';
TK_DECR: '--';
TK_QMARK: '?';
TK_NOT: '~';
TK_FILE: 'file';
TK_UNION: 'union';
TK_BOOL: 'bool';
TK_INT: 'int';
TK_CHAR: 'char';
TK_REAL: 'real';
TK_ENUM: 'enum';
TK_STRING: 'string';
TK_PTR: 'ptr';
TK_ADDR: '@';
TK_MOD: 'mod';

TK_HAT: '^';
TK_CREATE: 'create';
TK_ON: 'on';
TK_OPTYPE: 'optype';
TK_EXTERNAL: 'external';
TK_OP: 'op';
TK_PROCESS: 'process';
TK_PROCEDURE: 'procedure';
TK_END: 'end';
TK_INITIAL: 'initial';
TK_FINAL: 'final';

TK_ID: [a-zA-z]+;
