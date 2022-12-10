package analexico;
import static analexico.Token.*;
import java_cup.runtime.Symbol;
import java.util.LinkedList;

%% 
%class Lexer
%type Token
L=[a-zA-ZÑñ]+
D=[0-9]+
Operador = "*"|"+"|"-"|"/"|"="
Simbolo = "@"|"#"|"$"|"&"|"!"|"?"|"¡"|"¿"
Espacio = " "
guionbaj="_"
SaltoDeLinea = \n|\r|\r\n|"\n"
PALABRA_RESERVADA = "abstract" | "assert" | "boolean" | "break" | "byte" | "case" | "catch" | "char" | "class" | "const" |"continue"  
| "default" | "do" | "double" | "else" | "enum" | "extends" | "final" | "finally" | "float" | "for" | "goto" | "if" | "implements" 
| "import" | "instanceof" | "int" | "interface" | "long" | "native" | "new" | "package" | "private" | "protected" | "public" | "return" 
| "short" | "static" | "strictfp" | "super" | "switch" | "synchronized" | "this" | "throw" | "throws" | "transient" | "try" | "void" 
| "volatile" | "while" | "main" | "string"
Comilla="\""+

white=[ ,\n]
%{
    public String lexeme;
%}
%%
/****************************************
        REGLAS Y ACCIONES
****************************************/
"*".* {/Ignore/}
3*
{white} {/*Ignore*/}
"//".* {/*Ignore*/}
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
-"x" {return multiplicacion;}
-"-" {return resta;}
"_" {return guionbaj;}
-"/" {return division;}
-"while" {lexeme=yytext (); return PALABRA_RESERVADA;} 
-"if" {lexeme=yytext (); return PALABRA_RESERVADA;} 
-"for" {lexeme=yytext (); return PALABRA_RESERVADA;} 
-"main" {lexeme=yytext (); return PALABRA_RESERVADA;} 

{PALABRA_RESERVADA} {lexeme=yytext (); return PALABRA_RESERVADA;}

{L} {lexeme=yytext(); return Identificador;}
{D} {lexeme=yytext(); return Numero;}
{SaltoDeLinea} {lexeme=yytext(); return SaltoDeLinea;}
"/n" {lexeme=yytext(); return SaltoDeLinea;}
{Operador} {lexeme=yytext (); return Operador;}
{Simbolo} {lexeme=yytext (); return Simbolo;}
{Espacio} {lexeme=yytext (); return Espacio;}
{Comilla}({L}|{D}|{Operador}|{Simbolo}|{Espacio})*{Comilla}+ {lexeme=yytext(); return Cadena;}
{L}({L}|{D}|{guionbaj})* {lexeme=yytext(); return ID;}

. {lexeme=yytext (); return ERROR;}






