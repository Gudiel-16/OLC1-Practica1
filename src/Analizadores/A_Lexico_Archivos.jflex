/*----------------- AREA 1: CODIGO DE USUARIO -----------------------*/
//-----------------> paquetes, importaciones 
package Analizadores;
import java_cup.runtime.*;
import javax.swing.table.DefaultTableModel;

/*----------------- AREA 2: OPCIONES Y DECLARACIONES -----------------------*/

%%
%{
    //--------> Codigo de usuario en sintaxis java

    public String errores = "";
    public String lexemas = "";
    public static Object [] encabezado={"","",""};
    public static DefaultTableModel tablaerroresA=new DefaultTableModel(encabezado,0);

    //para verificar si hay error lexico en archivo datos
    public boolean errorLexicoArchivo=false;
    

    public void addError(String cadena)
    {
    	errores += "\n" + cadena;        
    }
    public void addLexema(Symbol s)
    {
        lexemas+=Simbolos.terminalNames[s.sym] +"\t"+ s.value + "\t" + s.left + "\t" + s.right +"\n";
    }
   
%}

//-------=> Directivas
    %cupsym Simbolos
    %class Analizador_Lexico_Archivos
    %cup
    %public
    %unicode    
    %line    
    %column
    %char
    %ignorecase
    
    

//-----------> Expresiones Regulares

    Comentario = "//" [^\r\n]* [^\r\n]
    ComentarioMulti = "/*" [^/] ~"*/" | "/*" "/"+ "*/"    
    enteroPosit=[0-9]+
    espacio = \t|\f|" "|\r|\n
    letra = [a-zA-Z]
    id ={letra}({letra}|{enteroPosit}|"_")*
    cadena =[\"] [^\"\n]* [\"\n]


%%

/*----------------- AREA 3: REGLAS LEXICAS -----------------------*/

    {espacio}     {/*Se ignora*/}

    "=" {Symbol s = new  Symbol(Simbolos.igual,yycolumn,yyline,yytext()); addLexema(s); return s; }
    "[" {Symbol s = new Symbol(Simbolos.corchabre,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "]" {Symbol s = new Symbol(Simbolos.corchcierra,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "{" {Symbol s = new Symbol(Simbolos.llaveabre,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "}" {Symbol s = new Symbol(Simbolos.llavecierra,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "(" {Symbol s = new Symbol(Simbolos.parenabre,yycolumn,yyline,yytext()); addLexema(s); return s;}
    ")" {Symbol s = new Symbol(Simbolos.parencierra,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "," {Symbol s = new Symbol(Simbolos.coma,yycolumn,yyline,yytext()); addLexema(s); return s;}
    ";" {Symbol s = new Symbol(Simbolos.puntocoma,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "." {Symbol s = new Symbol(Simbolos.punto,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "-" {Symbol s = new Symbol(Simbolos.menos,yycolumn,yyline,yytext()); addLexema(s); return s;}

    ">" {Symbol s = new Symbol(Simbolos.mayor,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "<" {Symbol s = new Symbol(Simbolos.menor,yycolumn,yyline,yytext()); addLexema(s); return s;}
    ">=" {Symbol s = new Symbol(Simbolos.mayorigualque,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "<=" {Symbol s = new Symbol(Simbolos.menorigualque,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "==" {Symbol s = new Symbol(Simbolos.igualigual,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "!=" {Symbol s = new Symbol(Simbolos.diferenteque,yycolumn,yyline,yytext()); addLexema(s); return s;}

    "Claves" {Symbol s = new Symbol(Simbolos.claves,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "Registros" {Symbol s = new Symbol(Simbolos.registros,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "Archivo" {Symbol s = new Symbol(Simbolos.archivo,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "leerArchivo" {Symbol s = new Symbol(Simbolos.leerarchivo,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "Imprimir" {Symbol s = new Symbol(Simbolos.imprimir,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "Numerico" {Symbol s = new Symbol(Simbolos.numerico,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "Contar" {Symbol s = new Symbol(Simbolos.contar,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "Sumar"  {Symbol s = new Symbol(Simbolos.sumar,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "Promedio" {Symbol s = new Symbol(Simbolos.promedio,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "ContarSi" {Symbol s = new Symbol(Simbolos.contarsi,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "ObtenerSi" {Symbol s = new Symbol(Simbolos.obtenersi,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "Graficar" {Symbol s = new Symbol(Simbolos.graficar,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "Cadena" {Symbol s = new Symbol(Simbolos.cadenareserv,yycolumn,yyline,yytext()); addLexema(s); return s;}
    

    {id} {Symbol s = new  Symbol(Simbolos.id,yycolumn,yyline,yytext()); addLexema(s); return s; } 
    {enteroPosit} {Symbol s = new  Symbol(Simbolos.enteroposit,yycolumn,yyline,Integer.parseInt(yytext())); addLexema(s); return s;}    
    {cadena} {Symbol s = new Symbol(Simbolos.cadena,yycolumn,yyline,yytext()); addLexema(s); return s;}
    {Comentario} { /*Se ignora.*/}
    {ComentarioMulti} { /*Se ignora.*/}

//--------> Errores Lexicos
    .     
    {               
       addError("Error lexico: "+yytext()+ " Linea:"+(yyline+1)+" Columna:"+(yycolumn+1));
       Object[] cars = {yytext(), (yyline+1), (yycolumn+1)};
       tablaerroresA.addRow(cars);
       errorLexicoArchivo=true;
       //System.out.println("Error lexico Archivo: "+yytext()+ " Linea:"+(yyline+1)+" Columna:"+(yycolumn+1));
    }   
   