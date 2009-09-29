lexer grammar InternalService;
@header {
package org.mod4j.dsl.service.xtext.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'create' ;
T12 : 'read' ;
T13 : 'update' ;
T14 : 'delete' ;
T15 : 'listall' ;
T16 : 'find' ;
T17 : 'add' ;
T18 : 'remove' ;
T19 : 'get' ;
T20 : 'service' ;
T21 : ';' ;
T22 : 'reference' ;
T23 : 'from' ;
T24 : 'import' ;
T25 : 'method' ;
T26 : 'in' ;
T27 : '(' ;
T28 : ')' ;
T29 : ',' ;
T30 : 'out' ;
T31 : 'for' ;
T32 : 'crud' ;

// $ANTLR src "../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g" 1853
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g" 1855
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g" 1857
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g" 1859
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g" 1861
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g" 1863
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g" 1865
RULE_ANY_OTHER : .;


