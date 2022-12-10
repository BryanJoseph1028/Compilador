package analexico;
import static analexico.Token.*;
import java_cup.runtime.Symbol;
import java.util.LinkedList;

%% 
%class Lexer
%type Token
L=[a-zA-ZÑñ]
Z=[a-zA-ZÑñ 0-9]{25,1000}
D=[0-9]* | "-"[0-9]*
F=[0-9]*"."[0-9]* | "-"[0-9]*"."[0-9]*
T=[4-9]{1} [1-9]{4} | [3]{1}[3-9]{1}[0-9]{3} | [3]{1} [2] {1} [8-9] {1} [0-9] {2} | [3]{1} [2]{1} [7]{1} [7-9] {1} [0-9]{1}
| [3]{1} [2]{1}[7]{1}[6]{1}[8-9]{1}| [1-9] {6,100} | "-"[4-9]{1} [1-9]{4} |"-" [3]{1}[3-9]{1}[0-9]{3} 
|"-" [3]{1} [2] {1} [8-9] {1} [0-9] {2} |"-" [3]{1} [2]{1} [7]{1} [7-9] {1} [0-9]{1}
|"-" [3]{1} [2]{1}[7]{1}[6]{1}[8-9]{1}| [1-9] {6,100}
K=[_]{1} [a-zA-ZÑn 0-9]* | [0-9] {1} [a-zA-ZÑn]{1} [a-zA-ZÑn 0-9]*

Operador = "*"|"+"|"-"|"/"|"="
Simbolo = "@"|"#"|"$"|"&"|"!"|"?"|"¡"|"¿"
Espacio = " "
guionbaj="_"
SaltoDeLinea = \n|\r|\r\n|"\n"
PALABRA_RESERVADA = "abstract" | "assert" | "boolean" | "break" | "byte" | "case" | "catch" | "char" | "class" | "const" |"continue"  
| "default" | "do" | "double" | "else" | "enum" | "extends" | "final" | "finally" | "float" | "for" | "goto" | "if" | "implements" 
| "import" | "instanceof" | "int" | "interface" | "long" | "native" | "new" | "package" | "private" | "protected" | "public" | "return" 
| "short" | "static" | "strictfp" | "super" | "switch" | "synchronized" | "this" | "throw" | "throws" | "transient" | "try" | "void" 
| "volatile" | "while" | "main" | "string" | "else" | "begin" | "end" | "end_if" | "print" 
Comilla="\""+

white=[ ,\n]
%{
    public String lexeme;
%}
%%
/****************************************
        REGLAS Y ACCIONES
****************************************/
{white} {/*Ignore*/}
"//".* {/*Ignore*/}
"***".* {/*Ignore*/}

"<" {return menque;}
">" {return mayque;}
"<>" {return diferencia;}
"<=" {return menIgualQue;}
"=>" {return mayorIgualQue;}
"==" {lexeme=yytext(); return IgualQue;}
"(" {return parentesisAp;}
")" {return parentesisCie;}
"{" {return llaveAp;}
"}" {return llaveCie;}
":" {return dospuntos;}
";" {return PyComa;}
-"=" {return igual;}
-"+" {return suma;}
-"*" {return multiplicacion;}
-"-" {return resta;}
"_" {return guionbaj;}
-"/" {return division;}
-"while" {lexeme=yytext (); return PALABRA_RESERVADA;} 
-"if" {lexeme=yytext (); return PALABRA_RESERVADA;} 
-"for" {lexeme=yytext (); return PALABRA_RESERVADA;} 
-"main" {lexeme=yytext (); return PALABRA_RESERVADA;} 

{PALABRA_RESERVADA} {lexeme=yytext (); return PALABRA_RESERVADA;}
{Z} {lexeme=yytext(); return ERROR;}
{T} {lexeme=yytext(); return ERROR;}
{K} {lexeme=yytext(); return ERROR;}
{L} {lexeme=yytext(); return Identificador;}
{F} {lexeme=yytext(); return Numero;}
{D} {lexeme=yytext(); return Numero;}

{D}{L} {lexeme=yytext(); return ERROR;}
{SaltoDeLinea} {lexeme=yytext(); return SaltoDeLinea;}
"/n" {lexeme=yytext(); return SaltoDeLinea;}
{Operador} {lexeme=yytext (); return Operador;}
{Simbolo} {lexeme=yytext (); return Simbolo;}
{Espacio} {lexeme=yytext (); return Espacio;}
{Comilla}({L}|{D}|{Operador}|{Simbolo}|{Espacio})*{Comilla}+ {lexeme=yytext(); return Cadena;}
{L}({L}|{D}|{guionbaj})* {lexeme=yytext(); return ID;}

. {lexeme=yytext (); return ERROR;}






