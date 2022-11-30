
package Principal;
import Analizadores.Analizador_Lexico;
import Analizadores.Analizador_Lexico_Archivos;
import Analizadores.analisis_sintactico;
import Analizadores.analisis_sintactico_funciones;
import Analizadores.analisis_sintactico_impri;
import java.awt.Color;
import java.io.File;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;
import java.awt.Desktop;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author GUDIEL
 */

public class principal extends javax.swing.JFrame {
    int quePestaniaEstoy=0;
    
public static HashMap<String,DefaultTableModel> contenidoImpriArchivo= new HashMap<String,DefaultTableModel>();
public Object [] encabezado={"","",""};
public DefaultTableModel tablaErrSemanticos=new DefaultTableModel(encabezado,0);


public principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        txtAreaPes1.setForeground(Color.white);
        txtAreaPes2.setForeground(Color.white);
        txtAreaPes3.setForeground(Color.white);
        txtAreaConsola.setForeground(Color.white);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaConsola = new javax.swing.JTextArea();
        bttCompilar = new javax.swing.JButton();
        contenedorPesta = new javax.swing.JTabbedPane();
        pest1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaPes1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAreaPes2 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAreaPes3 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmAbrir = new javax.swing.JMenuItem();
        jmGuardar = new javax.swing.JMenuItem();
        jmGuardarComo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmAbrirReporte = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmManUs = new javax.swing.JMenuItem();
        jmManTec = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONSOLA DE SALIDA:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        txtAreaConsola.setBackground(new java.awt.Color(0, 0, 0));
        txtAreaConsola.setColumns(20);
        txtAreaConsola.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtAreaConsola.setForeground(new java.awt.Color(255, 255, 255));
        txtAreaConsola.setRows(5);
        jScrollPane2.setViewportView(txtAreaConsola);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 1200, 190));

        bttCompilar.setBackground(new java.awt.Color(0, 0, 0));
        bttCompilar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        bttCompilar.setForeground(new java.awt.Color(255, 255, 255));
        bttCompilar.setText("COMPILAR");
        bttCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCompilarActionPerformed(evt);
            }
        });
        jPanel1.add(bttCompilar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 40, -1, 50));

        contenedorPesta.setBackground(new java.awt.Color(255, 255, 255));

        pest1.setBackground(new java.awt.Color(102, 102, 102));
        pest1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAreaPes1.setBackground(new java.awt.Color(0, 0, 0));
        txtAreaPes1.setColumns(20);
        txtAreaPes1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtAreaPes1.setRows(5);
        jScrollPane3.setViewportView(txtAreaPes1);

        pest1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1040, 360));

        contenedorPesta.addTab("ARCHIVO1", pest1);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAreaPes2.setBackground(new java.awt.Color(0, 0, 0));
        txtAreaPes2.setColumns(20);
        txtAreaPes2.setRows(5);
        jScrollPane4.setViewportView(txtAreaPes2);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1040, 360));

        contenedorPesta.addTab("ARCHIVO2", jPanel2);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAreaPes3.setBackground(new java.awt.Color(0, 0, 0));
        txtAreaPes3.setColumns(20);
        txtAreaPes3.setRows(5);
        jScrollPane5.setViewportView(txtAreaPes3);

        jPanel3.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1040, 360));

        contenedorPesta.addTab("ARCHIVO3", jPanel3);

        jPanel1.add(contenedorPesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1070, 410));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 670));

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));

        jMenu1.setText("ARCHIVOS");

        jmAbrir.setText("ABRIR");
        jmAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(jmAbrir);

        jmGuardar.setText("GUARDAR");
        jmGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(jmGuardar);

        jmGuardarComo.setText("GUARDAR COMO");
        jmGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGuardarComoActionPerformed(evt);
            }
        });
        jMenu1.add(jmGuardarComo);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("REPORTES");

        jmAbrirReporte.setText("ABRIR REPORTE");
        jmAbrirReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAbrirReporteActionPerformed(evt);
            }
        });
        jMenu2.add(jmAbrirReporte);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("MANUALES");

        jmManUs.setText("MANUAL DE USUARIO");
        jmManUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmManUsActionPerformed(evt);
            }
        });
        jMenu3.add(jmManUs);

        jmManTec.setText("MANUAL TECNICO");
        jmManTec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmManTecActionPerformed(evt);
            }
        });
        jMenu3.add(jmManTec);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAbrirActionPerformed
        
        Scanner entrada = null;
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(fileChooser);
        try {
            String contenido="";
            String ruta = fileChooser.getSelectedFile().getAbsolutePath();
            File f = new File(ruta);
            entrada = new Scanner(f);
            while (entrada.hasNext()) {
                contenido+=entrada.nextLine() +"\n";
            }
            
            quePestaniaEstoy++;
            if (quePestaniaEstoy==1) {
               txtAreaPes1.setText(contenido);
               contenedorPesta.setSelectedIndex(0);
            }else if(quePestaniaEstoy==2){
                txtAreaPes2.setText(contenido); 
                contenedorPesta.setSelectedIndex(1);
            }else if(quePestaniaEstoy==3){
                txtAreaPes3.setText(contenido);
                contenedorPesta.setSelectedIndex(2);
            }else if(quePestaniaEstoy==4){
                txtAreaPes1.setText(contenido);
                contenedorPesta.setSelectedIndex(0);
                quePestaniaEstoy=1;
            }
            
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("No se ha seleccionado ningún fichero");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (entrada != null) {
                entrada.close();
            }
        }  
        
    }//GEN-LAST:event_jmAbrirActionPerformed

    private void jmGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGuardarActionPerformed
        
        if (contenedorPesta.getSelectedIndex()==0) 
        {
            try 
            {
                File archivo = new File("archivo_reporte_Guardado.rep"); // este es el archivo que insertaras caracteres
                FileOutputStream  escribir = new FileOutputStream (archivo);
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(escribir));
                String texto = txtAreaPes1.getText();
                for(int i=0; i<texto.length();i++){                
                    char character = texto.charAt(i);    
                    int ascii = (int) character;

                    if (ascii==10) {
                        bw.newLine();
                    }
                bw.write(texto.charAt(i));

                }
                bw.close();
            } catch (Exception e) 
            {
            }
        }else if (contenedorPesta.getSelectedIndex()==1) 
        {
            try 
            {
                File archivo = new File("archivo_reporte_Guardado.rep"); // este es el archivo que insertaras caracteres
                FileOutputStream  escribir = new FileOutputStream (archivo);
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(escribir));
                String texto = txtAreaPes2.getText();
                for(int i=0; i<texto.length();i++){                
                    char character = texto.charAt(i);    
                    int ascii = (int) character;

                    if (ascii==10) {
                        bw.newLine();
                    }
                bw.write(texto.charAt(i));

                }
                bw.close();
            } catch (Exception e) 
            {
            }
        }else if (contenedorPesta.getSelectedIndex()==2) 
        {
            try 
            {
                File archivo = new File("archivo_reporte_Guardado.rep"); // este es el archivo que insertaras caracteres
                FileOutputStream  escribir = new FileOutputStream (archivo);
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(escribir));
                String texto = txtAreaPes3.getText();
                for(int i=0; i<texto.length();i++){                
                    char character = texto.charAt(i);    
                    int ascii = (int) character;

                    if (ascii==10) {
                        bw.newLine();
                    }
                bw.write(texto.charAt(i));

                }
                bw.close();
            } catch (Exception e) 
            {
            }
        }        
        
    }//GEN-LAST:event_jmGuardarActionPerformed

    private void bttCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCompilarActionPerformed
       if (contenedorPesta.getSelectedIndex()==0) 
        {
            compilar(txtAreaPes1);
        }else if (contenedorPesta.getSelectedIndex()==1) 
        {
            compilar(txtAreaPes2);
        }else if (contenedorPesta.getSelectedIndex()==2) 
        {
            compilar(txtAreaPes3);
        }
         
    }//GEN-LAST:event_bttCompilarActionPerformed

    private void jmGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGuardarComoActionPerformed
        if (contenedorPesta.getSelectedIndex()==0) 
        {
            guardarComo(txtAreaPes1);
        }else if (contenedorPesta.getSelectedIndex()==1) 
        {
            guardarComo(txtAreaPes2);
        }else if (contenedorPesta.getSelectedIndex()==2) 
        {
             guardarComo(txtAreaPes3);
        }
    }//GEN-LAST:event_jmGuardarComoActionPerformed

    private void jmAbrirReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAbrirReporteActionPerformed
        abrirReporte();
    }//GEN-LAST:event_jmAbrirReporteActionPerformed

    private void jmManUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmManUsActionPerformed
         try 
        {
            File path = new File ("manual_usuario.pdf");
            if (path.exists()) {
                
                try 
                {
                Desktop.getDesktop().open(path);     
                }catch (IOException ex) 
                {
                ex.printStackTrace();
                }                
            }else
            {
               JOptionPane.showMessageDialog(null, "MANUAL NO ENCONTRADO", "ERROR", JOptionPane.ERROR_MESSAGE);  
            }   
        }catch (Exception ex) 
        {} 
    }//GEN-LAST:event_jmManUsActionPerformed

    private void jmManTecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmManTecActionPerformed
        try 
        {
            File path = new File ("manual_tecnico.pdf");
            if (path.exists()) {
                
                try 
                {
                Desktop.getDesktop().open(path);     
                }catch (IOException ex) 
                {
                ex.printStackTrace();
                }                
            }else
            {
               JOptionPane.showMessageDialog(null, "MANUAL NO ENCONTRADO", "ERROR", JOptionPane.ERROR_MESSAGE);  
            }   
        }catch (Exception ex) 
        {} 
    }//GEN-LAST:event_jmManTecActionPerformed

    void compilar(JTextArea areadetexto)
    {
        txtAreaConsola.setText("");
        try {
            Analizador_Lexico lexico= new Analizador_Lexico(new BufferedReader(new StringReader(areadetexto.getText())));
            Analizador_Lexico_Archivos lexicoA= new Analizador_Lexico_Archivos(new BufferedReader(new StringReader(areadetexto.getText())));
            analisis_sintactico_impri sintacticoImpri = new analisis_sintactico_impri(lexico);
            analisis_sintactico sintacticoPrincipal = new analisis_sintactico(lexico);
            analisis_sintactico_funciones sintacticoFunciones = new analisis_sintactico_funciones(lexico);

             //para limpiar lista
            sintacticoPrincipal.alExistenciaDeVariable.clear();
            sintacticoPrincipal.hmTablasArchivos.clear();
            sintacticoFunciones.alExistenciaDeVariable.clear();
            sintacticoFunciones.hmTablasArchivos.clear();
            sintacticoImpri.alExistenciaDeVariable.clear();
            sintacticoImpri.hmTablasArchivos.clear();

            sintacticoImpri.parserPrincipal(areadetexto.getText()); //para guardar todos los datos
            sintacticoImpri.parse(); //para impresion en pantalla, cuando ya guardo todo       

            
            //para errores lexicos y sintacticos en archivos (avisar que archivo contiene errores)   
            String errLexSintArchi="";
            while(!sintacticoPrincipal.pila_imprimirErroresLexSintArchi.empty())
            {
                 String err=sintacticoPrincipal.pila_imprimirErroresLexSintArchi.pop();
                 errLexSintArchi+=err+"\n";
                 Object[] er = {err, "Desconocida", "Desconocida"};
                 tablaErrSemanticos.addRow(er);
            }   
            txtAreaConsola.setText(errLexSintArchi);
            
            //imprimir errores lexicos, sintacticos y semanticos
            if (lexico.tablaerrores.getRowCount()>0) 
            {
                String cad=txtAreaConsola.getText();
                for (int i =0; i < lexico.tablaerrores.getRowCount(); i++) 
                {
                    cad+= "Error Lexico: Lexema: " + lexico.tablaerrores.getValueAt(i, 0).toString() + " Linea: " + lexico.tablaerrores.getValueAt(i, 1).toString() + " Columna: " + lexico.tablaerrores.getValueAt(i, 2).toString() + "\n";
                } 
                txtAreaConsola.setText(cad);
            }
            
            if (lexicoA.tablaerroresA.getRowCount()>0) 
            {
                String cad=txtAreaConsola.getText();
                for (int i =0; i < lexicoA.tablaerroresA.getRowCount(); i++) 
                {
                    cad+= "Error Lexico en Archivo Datos: Lexema: " + lexicoA.tablaerroresA.getValueAt(i, 0).toString() + " Linea: " + lexicoA.tablaerroresA.getValueAt(i, 1).toString() + " Columna: " + lexicoA.tablaerroresA.getValueAt(i, 2).toString() + "\n";
                } 
                txtAreaConsola.setText(cad);
            }

            if (sintacticoPrincipal.tablaerroresSintacticos.getRowCount()>0) 
            {
                String cad=txtAreaConsola.getText();
                for (int i =0; i < sintacticoPrincipal.tablaerroresSintacticos.getRowCount(); i++) 
                {
                    cad+= "Error Sintactico: Lexema: " + sintacticoPrincipal.tablaerroresSintacticos.getValueAt(i, 0).toString() + " Linea: " + sintacticoPrincipal.tablaerroresSintacticos.getValueAt(i, 1).toString() + " Columna: " + sintacticoPrincipal.tablaerroresSintacticos.getValueAt(i, 2).toString() + "\n";
                } 
                txtAreaConsola.setText(cad);
            }

            //para los errores semanticos
            String errores=txtAreaConsola.getText();
            while(!sintacticoImpri.pila_imprimirErrores.empty())
            {
                 String err=sintacticoImpri.pila_imprimirErrores.pop();
                 errores+=err+"\n";
                 Object[] er = {err, "Desconocida", "Desconocida"};
                 tablaErrSemanticos.addRow(er);
            }   
            txtAreaConsola.setText(errores);

            //para impresion en pantalla
            String impresion=txtAreaConsola.getText();

            while(!sintacticoImpri.pila_imprimirConsola.empty())
            {
                 impresion+=sintacticoImpri.pila_imprimirConsola.pop();
            }
            txtAreaConsola.setText(impresion);   

            html(lexico.tablaerrores,lexicoA.tablaerroresA,sintacticoPrincipal.tablaerroresSintacticos,tablaErrSemanticos);        

            //Limpiar tablas lexicas, sintacticas y semanticas
            for (int i = lexico.tablaerrores.getRowCount()-1; i >= 0; i--) 
            {
                lexico.tablaerrores.removeRow(i);
            } 

            for (int i = lexicoA.tablaerroresA.getRowCount()-1; i >= 0; i--) 
            {
                lexicoA.tablaerroresA.removeRow(i);
            } 

            for (int i = sintacticoPrincipal.tablaerroresSintacticos.getRowCount()-1; i >= 0; i--) 
            {
                sintacticoPrincipal.tablaerroresSintacticos.removeRow(i);
            } 

            for (int i = tablaErrSemanticos.getRowCount()-1; i >= 0; i--) 
            {
                tablaErrSemanticos.removeRow(i);
            }
        
        } catch (Exception e) {
            System.out.println("error: --> "+e.getMessage());
        }
    }
    
    void html(DefaultTableModel tbErrLex, DefaultTableModel tbErrLexArchi, DefaultTableModel tbErrSintac, DefaultTableModel tbErrSemant)
    {
        
        FileWriter filewriter = null;
        PrintWriter printw = null;
        
        try{
            filewriter = new FileWriter("reporte_errores.html");//declarar el archivo
            printw = new PrintWriter(filewriter);//declarar un impresor

            printw.println("<html>");
            printw.println("<head><title>REPORTE DE ERRORES</title></head>");     
            printw.println("<body bgcolor=white>");

            //----> TABLA1
            printw.println("<center><table class=\"egt\" border=\"10\">");
            
            printw.println("<tr bgcolor=\"#00FFFF\">");
            printw.println("<th>"+"LEXEMA"+"</th>");
            printw.println("<th>"+"LINEA"+"</th>");
            printw.println("<th>"+"COLUMNA"+"</th>");
            printw.println("</tr>");            
            
            printw.println("<h2><center>ERRORES LEXICOS</center></h2>");
            for (int i = 0; i < (tbErrLex.getRowCount()/3); i++) //dividido 3 porque son 3 veces que me agrega cada error
            {
                printw.println("<tr>");
                printw.println("<td>"+tbErrLex.getValueAt(i, 0).toString()+"</td>");
                printw.println("<td>"+tbErrLex.getValueAt(i, 1).toString()+"</td>");
                printw.println("<td>"+tbErrLex.getValueAt(i, 2).toString()+"</td>");
                printw.println("</tr>");                
            }           
                        
            printw.println("</table></center>");
            
            //----> TABLA2
            printw.println("<center><table class=\"egt\" border=\"10\">");
            
            printw.println("<tr bgcolor=\"#00FFFF\">");
            printw.println("<th>"+"LEXEMA"+"</th>");
            printw.println("<th>"+"LINEA"+"</th>");
            printw.println("<th>"+"COLUMNA"+"</th>");
            printw.println("</tr>");            
            
            printw.println("<h2><center>ERRORES LEXICOS DE ARCHIVOS</center></h2>");
            for (int i = 0; i < tbErrLexArchi.getRowCount(); i++) //dividido 3 porque son 3 veces que me agrega cada error
            {
                printw.println("<tr>");
                printw.println("<td>"+tbErrLexArchi.getValueAt(i, 0).toString()+"</td>");
                printw.println("<td>"+tbErrLexArchi.getValueAt(i, 1).toString()+"</td>");
                printw.println("<td>"+tbErrLexArchi.getValueAt(i, 2).toString()+"</td>");
                printw.println("</tr>");                
            }           
                        
            printw.println("</table></center>");
            
            //----> TABLA3
            printw.println("<h2><center>ERRORES SINTACTICOS</center></h2>");

            printw.println("<center><table class=\"egt\" border=\"10\">");
            
            printw.println("<tr bgcolor=\"#00FFFF\">");
            printw.println("<th>"+"LEXEMA"+"</th>");
            printw.println("<th>"+"LINEA"+"</th>");
            printw.println("<th>"+"COLUMNA"+"</th>");
            printw.println("</tr>");            
            
            for (int i = 0; i < tbErrSintac.getRowCount(); i++) //dividido 3 porque son 3 veces que me agrega cada error
            {
                printw.println("<tr>");
                printw.println("<td>"+tbErrSintac.getValueAt(i, 0).toString()+"</td>");
                printw.println("<td>"+tbErrSintac.getValueAt(i, 1).toString()+"</td>");
                printw.println("<td>"+tbErrSintac.getValueAt(i, 2).toString()+"</td>");
                printw.println("</tr>");                
            }           
                        
            printw.println("</table></center>");    
            
            //----> TABLA3
            printw.println("<h2><center>ERRORES SEMANTICOS</center></h2>");

            printw.println("<center><table class=\"egt\" border=\"10\">");
            
            printw.println("<tr bgcolor=\"#00FFFF\">");
            printw.println("<th>"+"DESCRIPCION"+"</th>");
            printw.println("<th>"+"LINEA"+"</th>");
            printw.println("<th>"+"COLUMNA"+"</th>");
            printw.println("</tr>");            
            
            for (int i = 0; i < tbErrSemant.getRowCount(); i++) //dividido 3 porque son 3 veces que me agrega cada error
            {
                printw.println("<tr>");
                printw.println("<td>"+tbErrSemant.getValueAt(i, 0).toString()+"</td>");
                printw.println("<td>"+tbErrSemant.getValueAt(i, 1).toString()+"</td>");
                printw.println("<td>"+tbErrSemant.getValueAt(i, 2).toString()+"</td>");
                printw.println("</tr>");                
            }           
                        
            printw.println("</table></center>");
            
            
            printw.println("</body>");
            printw.println("</html>");

            //no devemos olvidar cerrar el archivo para que su lectura sea correcta
            printw.close();//cerramos el archivo
           }catch(Exception e){
            System.out.println(e.getMessage());
           }
    }
    
    void abrirReporte(){
        try 
        {
            File path = new File ("reporte_errores.html");
            if (path.exists()) {
                
                try 
                {
                Desktop.getDesktop().open(path);     
                }catch (IOException ex) 
                {
                ex.printStackTrace();
                }                
            }else
            {
               JOptionPane.showMessageDialog(null, "REPORTE NO ENCONTRADO", "ERROR", JOptionPane.ERROR_MESSAGE);  
            }   
        }catch (Exception ex) 
        {} 
    }
    
     void guardarComo(JTextArea areatexto) 
     {
        try
        {
            JFileChooser file=new JFileChooser();
            file.showSaveDialog(this);
            File guarda =file.getSelectedFile();

            if(guarda !=null)
            {
              FileWriter  save=new FileWriter(guarda+".txt");
              save.write(areatexto.getText());
              save.close();
              JOptionPane.showMessageDialog(null,"El archivo se a guardado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
              }
        }
         catch(IOException ex)
         {
          JOptionPane.showMessageDialog(null,"Su archivo no se ha guardado","Advertencia",JOptionPane.WARNING_MESSAGE);
         }
    }
   
     

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttCompilar;
    private javax.swing.JTabbedPane contenedorPesta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JMenuItem jmAbrir;
    private javax.swing.JMenuItem jmAbrirReporte;
    private javax.swing.JMenuItem jmGuardar;
    private javax.swing.JMenuItem jmGuardarComo;
    private javax.swing.JMenuItem jmManTec;
    private javax.swing.JMenuItem jmManUs;
    private javax.swing.JPanel pest1;
    private javax.swing.JTextArea txtAreaConsola;
    private javax.swing.JTextArea txtAreaPes1;
    private javax.swing.JTextArea txtAreaPes2;
    private javax.swing.JTextArea txtAreaPes3;
    // End of variables declaration//GEN-END:variables
}
