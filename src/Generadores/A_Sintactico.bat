SET JAVA_HOME="C:\Program Files (x86)\Java\jdk1.8.0_51\bin"
SET PATH=%JAVA_HOME%;%PATH%
SET CLASSPATH=%JAVA_HOME%;
cd E:\CHIPECH\PROGRAMACION\COMPILADORES1\PRACTICA1\[OLC1]Practica1_201404278\src\Analizadores
java -jar E:\CHIPECH\PROGRAMACION\JAVA\HERRAMIENTAS_JFLEX_CUP\Fuentes\java-cup-11b.jar -parser analisis_sintactico -symbols Simbolos A_Sintactico.cup
pause

SET JAVA_HOME="C:\Program Files (x86)\Java\jdk1.8.0_51\bin"
SET PATH=%JAVA_HOME%;%PATH%
SET CLASSPATH=%JAVA_HOME%;
cd E:\CHIPECH\PROGRAMACION\COMPILADORES1\PRACTICA1\[OLC1]Practica1_201404278\src\Analizadores
java -jar E:\CHIPECH\PROGRAMACION\JAVA\HERRAMIENTAS_JFLEX_CUP\Fuentes\java-cup-11b.jar -parser analisis_sintactico_impri -symbols Simbolos_impri A_Sintactico_impri.cup
pause

SET JAVA_HOME="C:\Program Files (x86)\Java\jdk1.8.0_51\bin"
SET PATH=%JAVA_HOME%;%PATH%
SET CLASSPATH=%JAVA_HOME%;
cd E:\CHIPECH\PROGRAMACION\COMPILADORES1\PRACTICA1\[OLC1]Practica1_201404278\src\Analizadores
java -jar E:\CHIPECH\PROGRAMACION\JAVA\HERRAMIENTAS_JFLEX_CUP\Fuentes\java-cup-11b.jar -parser analisis_sintactico_funciones -symbols Simbolos_funciones A_Sintactico_Funciones.cup
pause
