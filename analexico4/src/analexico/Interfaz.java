package analexico;

import static analexico.Token.SaltoDeLinea;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 
 */

public class Interfaz extends javax.swing.JFrame {
    /**
     * Creates new form Interfaz
     */
    ////////codigo editor///////
    FileNameExtensionFilter filtro= new FileNameExtensionFilter("Archivos Word y txt","docx","txt");
    File f;
    JFileChooser j= new JFileChooser();
    String data1 [][]={};
    private String dirNuevo="";
   String cabecera1[]={"No."," Token "," Tipo"};
    String path;
    int cont=0;
    ////////////////////////////////////////////////////////////////////
    
    public Interfaz() {
        initComponents();
    }

        @SuppressWarnings("unchecked")
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTxt_Simbolos = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTexError = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTexNReales = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTexOperador = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTexPalabrasRes = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTexToken = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTexCadena = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTexDefault = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        txtATexto1 = new javax.swing.JEditorPane();
        Lineas = new javax.swing.JEditorPane();
        LineaError = new javax.swing.JEditorPane();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        Error = new javax.swing.JEditorPane();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTexPalabrasRes1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        jButton1.setText("Analiza");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Simbolos");

        jTxt_Simbolos.setColumns(20);
        jTxt_Simbolos.setRows(5);
        jScrollPane2.setViewportView(jTxt_Simbolos);

        jTexError.setColumns(20);
        jTexError.setRows(5);
        jScrollPane4.setViewportView(jTexError);

        jLabel3.setText("Operadores");

        jLabel4.setText("Errores");

        jLabel5.setText("Identificadores");

        jTexNReales.setColumns(20);
        jTexNReales.setRows(5);
        jScrollPane5.setViewportView(jTexNReales);

        jTexOperador.setColumns(20);
        jTexOperador.setRows(5);
        jScrollPane6.setViewportView(jTexOperador);

        jTexPalabrasRes.setEditable(false);
        jTexPalabrasRes.setColumns(20);
        jTexPalabrasRes.setRows(5);
        jScrollPane7.setViewportView(jTexPalabrasRes);

        jTexToken.setColumns(20);
        jTexToken.setRows(5);
        jScrollPane8.setViewportView(jTexToken);

        jLabel6.setText("Numero Reales");

        jLabel7.setText("Palabras Reservadas");

        jTexCadena.setColumns(20);
        jTexCadena.setRows(5);
        jScrollPane9.setViewportView(jTexCadena);

        jLabel8.setText("Cadena");

        jTexDefault.setColumns(20);
        jTexDefault.setRows(5);
        jScrollPane10.setViewportView(jTexDefault);

        jLabel9.setText("General");

        txtATexto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtATexto1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtATexto1KeyReleased(evt);
            }
        });

        Lineas.setEditable(false);
        Lineas.setText("1");
        Lineas.setName(""); // NOI18N

        LineaError.setEditable(false);
        LineaError.setForeground(new java.awt.Color(255, 0, 0));
        LineaError.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LineaError, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lineas, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtATexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lineas, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
            .addComponent(txtATexto1, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
            .addComponent(LineaError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
        );

        jScrollPane3.setViewportView(jPanel1);

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Tabla");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane11.setViewportView(jTable2);

        jScrollPane1.setViewportView(Error);

        jButton4.setText("S1");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel10.setText("Comentarios");

        jTexPalabrasRes1.setEditable(false);
        jTexPalabrasRes1.setColumns(20);
        jTexPalabrasRes1.setRows(5);
        jScrollPane13.setViewportView(jTexPalabrasRes1);

        jMenu1.setText("Opciones");

        jMenu2.setText("Abrir");

        jMenuItem1.setText("Abrir Archivo.txt");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenu1.add(jMenu2);

        jMenuItem2.setText("Guardar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(235, 235, 235))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(81, 81, 81))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(14, 14, 14)
                                                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(26, 26, 26))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel7))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(310, 310, 310))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(131, 131, 131))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(4, 4, 4)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3))
                                        .addGap(11, 11, 11))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel9)
                                        .addGap(6, 6, 6)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                    .addComponent(jScrollPane5)
                                    .addComponent(jScrollPane13)))
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try  {
        ProbarLexerFile();//llamando al metodo ProbarLexerFile();
         }
        catch(IOException ex){
        System.out.println(ex.getMessage());}
        // TODO add your handling code here:
                                   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
         //Se crea un jfilechooser
       j.setCurrentDirectory(new File("src\\lexicosintactico"));
       j.getSelectedFile();
        j.setFileFilter(filtro);//Añado el filtro
        j.showOpenDialog(j);
       
        int contPalabra=0;//Creo un contador para las palabras
       try{
         //Aqui se manda la ruta del archivo
        path= j.getSelectedFile().getAbsolutePath();//Obtiene la Ruta
        String name=j.getSelectedFile().getName();//Obtiene el nombre
        String lectura="";
        f = new File(path);
         
        try{

            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String aux;
       //Aqui cuento cuantas palabras hay
       StreamTokenizer st=new StreamTokenizer(new FileReader(f));
       while(st.nextToken()!=StreamTokenizer.TT_EOF){
          if(st.ttype==StreamTokenizer.TT_WORD){
              contPalabra++;
              
          } 
          //lblPalabras.setText("Total de Palabras:"+contPalabra);
          //txtNombre.setText(name);
          //txtRuta.setText(path);
         
       }
       
       
       //Aqui empieza a leer el archivo linea por linea hasta que en el texto ya no haya nada
       
            while((aux = br.readLine())!=null)

               lectura = lectura+aux+"\n";//Voy acumulando todo en un string

        }catch(IOException e){}

            txtATexto1.setText(lectura);//Mando lo que resulto de la lectura
            int contador=0;
        StringTokenizer st = new StringTokenizer(txtATexto1.getText(),"\n",true);
                String Text = "",token;
                contador = 1;

                while (st.hasMoreTokens()){
                    token= st.nextToken();
                    if("\n".equals(token)) contador++;
                }

                for(int i = 1; i <= contador; i++){
                    Text += i+"\n";
                }
                Lineas.setText(Text);    
            
             //contarCaracteres(lectura);//Mando llamar el metodo de contar caracteres
             //mayusculasyminusculas(lectura);
         }catch(NullPointerException e){

            javax.swing.JOptionPane.showMessageDialog(j, "Has seleccionado cerrar programa, saliendo...");

        System.exit(0);

}
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
            Guardar();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        txtATexto1.setText("");
        Lineas.setText("");
       LineaError.setText("");
       Error.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtATexto1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtATexto1KeyPressed
        // TODO add your handling code here:
           StringTokenizer st = new StringTokenizer(txtATexto1.getText(),"\n",true);
        String txt = "",token;
        LineaError.setText("");
       Error.setText("");
        cont = 1;

        while (st.hasMoreTokens()){
            token= st.nextToken();
            if("\n".equals(token)) cont++;
        }

        for(int i = 1; i <= cont; i++){
            txt += i+"\n";
        }
        Lineas.setText(txt);
        
        
    }//GEN-LAST:event_txtATexto1KeyPressed

    private void txtATexto1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtATexto1KeyReleased
        // TODO add your handling code here:
         StringTokenizer st = new StringTokenizer(txtATexto1.getText(),"\n",true);
        String txt = "",token;
        cont = 1;

        while (st.hasMoreTokens()){
            token= st.nextToken();
            if("\n".equals(token)) cont++;
        }

        for(int i = 1; i <= cont; i++){
            txt += i+"\n";
        }
        Lineas.setText(txt);
        
        
    }//GEN-LAST:event_txtATexto1KeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        /////////////////////////// generacion de tabla/////////////////////////////
        HashMap <String,Integer> r = new HashMap<>();
        HashMap <String,Integer> op = new HashMap<>();
        HashMap <String,Integer> id = new HashMap<>();
        HashMap <String,Integer> deli = new HashMap<>();
        HashMap <String,Integer> num = new HashMap<>();
        HashMap <String,Integer> simbol = new HashMap<>();
        HashMap <String,Integer> Igualque = new HashMap<>();
        LinkedList <String> texto = new LinkedList<>();

Igualque.put("==",1);


r.put("abstract", 0);
r.put("assert", 0);
r.put("boolean", 0);
r.put("break", 0);
r.put("byte", 0);
r.put("default", 0);
r.put("import", 0);
r.put("short", 0);
r.put("volatile", 0);
r.put("static", 0);
r.put("while", 0);
r.put("strictfp", 0);
r.put("main", 0);
r.put("double", 0);
r.put("do", 0);
r.put("instanceof", 0);
r.put("else", 0);
r.put("int", 0);
r.put("interface", 0);
r.put("super", 0);
r.put("enum", 0);
r.put("long", 0);
r.put("switch", 0);
r.put("extends", 0);
r.put("final", 0);
r.put("native", 0);
r.put("new", 0);
r.put("synchronized", 0);
r.put("this", 0);
r.put("finally", 0);
r.put("case", 0);
r.put("catch", 0);
r.put("float", 0);
r.put("package", 0);
r.put("throw", 0);
r.put("private", 0);
r.put("for", 0);
r.put("throws", 0);
r.put("transient", 0);
r.put("protected", 0);
r.put("char", 0);
r.put("goto", 0);
r.put("public", 0);
r.put("try", 0);
r.put("class", 0);
r.put("const", 0);
r.put("continue", 0);
r.put("if", 0);
r.put("implements", 0);
r.put("return", 0);
r.put("void", 0);
r.put("string", 0);
//r.put("==", 0);
        
        op.put("/", 0);
        op.put("*", 0);
        op.put("+", 0);
        op.put("-", 0);
        op.put("=", 0);
        op.put("^", 0);
        op.put("<", 0);
        op.put(">", 0);
        op.put("||", 0);
        op.put("&&", 0);
      //  op.put("==", 0);
        
        //deli.put("#", 0);
        deli.put(";", 0);
        deli.put("{", 0);
        deli.put("}", 0);
        deli.put(")", 0);
        deli.put(",", 0);
        deli.put("(", 0);
        deli.put("\"", 0);
        
        simbol.put("@", 0);
        simbol.put("$", 0);
        simbol.put("&", 0);
        simbol.put("!", 0);
        simbol.put("?", 0);
        simbol.put("¡", 0);
        simbol.put("¿", 0);
        simbol.put("#", 0);
        
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Token","Cantidad","Tipo"});
        
        StringTokenizer st = new StringTokenizer(txtATexto1.getText(),"@#$&!?¡¿{}();,\"+-*/><||&&#¡= \n\t",true);
      
        String token, text = "";
        while (st.hasMoreTokens()){
            token = st.nextToken();
            if(!" ".equals(token) && !"\n".equals(token) && !"\t".equals(token)){
                
                if (r.containsKey(token)) {
                    r.put(token, r.get(token)+1);            
                }
                else{
                if (simbol.containsKey(token)) {
                        simbol.put(token, simbol.get(token)+1);            
                    }
                
                 
                
                else{
                    if (Igualque.containsKey(token)) {
                        Igualque.put(token, Igualque.get(token)+1);            
                    }
                     else{
                    if (op.containsKey(token)) {
                        op.put(token, op.get(token)+1); 
                        
                     
       
                    }else {
                          if (deli.containsKey(token)){
                            deli.put(token, deli.get(token)+1);
                            
                            if("\"".equals(token)){
                                token = st.nextToken();
                                while (st.hasMoreTokens() && !"\"".equals(token)){
                                    text += token;
                                    token = st.nextToken();
                                }
                                texto.add(text);
                                deli.put(token, deli.get(token)+1);
                                text = "";
                            }
                            
                        }else {
                            if (id.containsKey(token)) {
                                id.put(token, id.get(token)+1); 
                            }else {
                                if(token.matches("([0-9]*)|([0-9]*.[0-9]+)")) {
                                    if (num.containsKey(token)) {
                                        num.put(token, num.get(token)+1);
                                    }else num.put(token, 1); 
                                }
                                else id.put(token, 1); 
                            }
                        }
                    }
                 
                }
                }
            }
          }
        }
        
        Iterator<String> itr = r.keySet().iterator();
        while(itr.hasNext()){
            token = itr.next();
            if(r.get(token) > 0)model.addRow(new Object[]{token, r.get(token),"Reservada"});
        } 
        itr = Igualque.keySet().iterator();
        while(itr.hasNext()){
            token = itr.next();
            if(Igualque.get(token) > 0) model.addRow(new Object[]{token,Igualque.get(token),"SigIgualdad"});
        } 
        itr = op.keySet().iterator();
        while(itr.hasNext()){
            token = itr.next();
            if(op.get(token) > 0) model.addRow(new Object[]{token, op.get(token),"Operador"});
        } 
        itr = simbol.keySet().iterator();
        while(itr.hasNext()){
            token = itr.next();
            if(simbol.get(token) > 0) model.addRow(new Object[]{token,simbol.get(token),"simbolo"});
        } 
        itr = deli.keySet().iterator();
        while(itr.hasNext()){
            token = itr.next();
            if(deli.get(token) > 0) model.addRow(new Object[]{token, deli.get(token),"Delimitador"});
        } 
        itr = id.keySet().iterator();
        while(itr.hasNext()){
            token = itr.next();
            if(id.get(token) > 0) model.addRow(new Object[]{token, id.get(token),"Identificador"});
        } 
        itr = num.keySet().iterator();
        while(itr.hasNext()){
            token = itr.next();
            if(num.get(token) > 0) {
                if(token.matches("[0-9]+"))model.addRow(new Object[]{token, num.get(token),"Número"});
                if(token.matches("[0-9]+.[0-9]+"))model.addRow(new Object[]{token, num.get(token),"N.Decimal"});
            }
        }
        itr = texto.iterator();
        while(itr.hasNext()){
            model.addRow(new Object[]{itr.next(), "1","Cadena"});
            
        }
        jTable2.setModel(model);
        ////////////////////////////////////////////////////////////////////////////
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        /////////////////////sintactico///////////////////////////////////////
        
        LinkedList <String> ENT = new LinkedList<>();
        LinkedList <String> DEC = new LinkedList<>();
        LinkedList <String> TEXT = new LinkedList<>();
        LinkedList <String> TAKE = new LinkedList<>();
        
        String
                simbolo = "([=<>])",
                id = "([(a-z)(A-Z)](\\w)*)",
                num = "((\\d)+)",
                dec = "((\\d)+(\\.)(\\d)+)",
                text = "((((#)[.\\W\\w\\s]*(#))|("+id+"))((\\s)*(\\+)((\\s)*((#)[.\\W\\w\\s]*(#))|("+id+")))*)",
                send = "((\\s)*System.out.println(\\s)*(\\()(\\s)*((((\")[.\\W\\w\\s]*(\"))|("+id+"))((\\s)*(\\+)((\\s)*((\")[.\\W\\w\\s]*())|("+id+")))*)(\\s)*(\\))(\\s)*(;))",
                take = "((\\s)*TAKE(\\b)(\\s)*"+id+"((\\s)*(,(\\s)*"+id+"))*(\\s)*(;))",
                operaciones = "(("+id+"|"+num+"|"+dec+")(\\s)*[+-/*](\\s)*("+id+"|"+num+"|"+dec+"))",
                defVal = "((\\s)*"+id+"(\\s)*=(\\s)*("+id+"|"+text+"|"+operaciones+"|"+num+"|"+dec+")(\\s)*(;))",
                defValVar = "((\\s)*"+id+"(\\s)*=(\\s)*("+id+"|"+text+"|"+operaciones+"|"+num+"|"+dec+")(\\s)*)",
               // condicion = id+"(\\s)*"+simbolo+"(\\s)*("+id+"|"+num+"|"+dec+")((\\s)*([(&&)(||)](\\s)*"+id+"(\\s)*"+simbolo+"(\\s)*("+id+"|"+num+"|"+dec+")))*",
               condicion = id+"(\\s)*"+simbolo+""+simbolo+"(\\s)*("+id+"|"+num+"|"+dec+")((\\s)*([(&&)(||)](\\s)*"+id+"(\\s)*"+simbolo+"*(\\s)*("+id+"|"+num+"|"+dec+")))*",
                var = "((\\s)*((int)|(decimal)|(word))(\\b)(\\s)*("+id+"|"+defValVar+")((\\s)*(,(\\s)*("+id+"|"+defValVar+")))*(\\s)*(;))",
                var2 = "((\\s)*(while)(\\b)(\\s)*(\\()(\\s)*("+id+"|"+defValVar+")((\\s)*(,(\\s)*("+id+"|"+defValVar+")))*(\\s)*(\\))(;))",
                main = "((\\s)*public class(\\s)*(\\s)*"+id+"(\\s)*(\\{)[.\\W\\w\\s]*((\\s)*(\\})(\\s)*)$)",
                main2 = "((\\s)*public class(\\s)*"+id+"(\\s)*(\\{))",
                main3 = "((\\s)*(\\s)*(\\})(\\s)*)",
                main1 = "((\\s)*public static void main(\\s)*(\\s)*(\\()[.\\W\\w\\s]*((\\s)*(\\))(\\s)*)*(\\{)[.\\W\\w\\s]*((\\s)*(\\})(\\s)*)$)",
                main4 = "((\\s)*public static void main(\\s)*(\\s)*(\\()[.\\W\\w\\s]*((\\s)*(\\))(\\s)*)*(\\{))",
                main5 = "((\\s)*(\\s)*(\\})(\\s)*)",
                
              
                
                
                start2 = "((\\s)*for(\\b)(\\s)*(\\()(\\s)*("+id+"|"+num+")(\\b)(\\s)*(=)(\\s)*("+num+")(\\b)(\\s)*(:)(\\s)*("+id+"|"+num+")(\\s)*(<)*(>)*(=)*(\\s)*("+num+")(\\b)(\\s)*[+-]?(\\s)*(:)(\\s)*("+id+"|"+num+")(\\s)*[.\\W\\w\\s]*((\\s)*[+-]?[+-]?(\\))+(\\s)*)*(\\{))",
                start3 = "((\\s)*end for(\\s)*(\\}))",
                when2 = "((\\s)*while(\\s)*(\\()(\\s)*"+condicion+"(\\s)*(\\))(\\s)*(\\{))",
                when3 = "((\\s)*end while(\\s)*(\\}))",
                it2 = "((\\s)*if(\\s)*(\\()(\\s)*"+condicion+"(\\s)*(\\))(\\s)*(\\{))",
                it3 = "((\\s)*end if(\\s)*(\\}))",
                
             
               it4 = "((\\s)*do(\\s)*(\\s)*(\\{))",
               it5 = "((\\s)*end do(\\s)*(\\})(\\s)*)",
                
              //it5 = "((\\s)*end do(\\s)*(\\()(\\s)*"+condicion+"(\\s)*(\\))(\\s)*(\\}))",
                
                 entero = "[0-9]*",
                decimal = "[0-9]*.[0-9]+";
                
                LinkedList <Integer> error = new LinkedList<>();
                StringTokenizer st = new StringTokenizer(txtATexto1.getText(),";{}",true);
                String token = "", txt = "", e;
                int i = 1, mainE = 0, start = 0, when = 0, it = 0, eB = 0;
                Error.setText("");
                
                if(txtATexto1.getText().matches(main)) {
                    while (st.hasMoreTokens()){
                        token = st.nextToken();
                        if(st.hasMoreTokens())token = token+st.nextToken();
                        if(token.matches("[.\\W\\w\\s]*(\\})") && st.countTokens() == 1){
                            String auxTok = st.nextToken();
                            token = token+(auxTok.substring(0,auxTok.indexOf("\n")));
                        }
                            StringTokenizer lin = new StringTokenizer(token,"\n",true);
                            while (lin.hasMoreTokens()){
                                e = lin.nextToken();
                                if("\n".equals(e)) i++;
                            }
                            
                            if(token.matches(start2)) start++;
                            if(token.matches(start3)) start--;
                            if(token.matches(when2)) when++;
                            if(token.matches(when3)) when--;
                            if(token.matches(it2)) it++;
                            if(token.matches(it3)) it--;
                            if(token.matches(it4)) it++;
                            if(token.matches(it5)) it--;
                            
                            if((st.hasMoreTokens() == false && (start > 0 || when > 0 || it > 0)) || (start < 0 || when < 0 || it < 0)) eB = 1;
                            
                            if((token.matches(send) || token.matches(take) || token.matches(var) || token.matches(var2) || token.matches(defVal) ||  token.matches(main2)  || token.matches(main3) || token.matches(main1) ||token.matches(main4) ||token.matches(main5) ||   token.matches("(\\s)*(\\$)") || token.matches(start2) || token.matches(start3) || token.matches(when2) || token.matches(when3) || token.matches(it2) || token.matches(it3)|| token.matches(it4) || token.matches(it5)) && eB == 0){
                               if(token.matches(var)){
                                    StringTokenizer stTipo = new StringTokenizer(token," ,;");
                                    String tipo = stTipo.nextToken();
                                    
                                    if(tipo.contains("int")){
                                        while(stTipo.hasMoreTokens()){
                                            tipo = stTipo.nextToken();
                                            
                                            if(ENT.contains(tipo) || DEC.contains(tipo) || TEXT.contains(tipo)|| TAKE.contains(tipo)){
                                                Error.setText("La Variable esta repetida ("+tipo+") "+i+": \n"
                                                               + "________________________________________________________________________\n"+token);
                                                for(int j = 1; j <i; j++){
                                                    txt += "\n";
                                                }
                                                LineaError.setText(txt+" ->");
                                                break;
                                            }
                                            
                                            ENT.add(tipo);
                                        }
                                    }
                                    if(tipo.contains("decimal")){
                                        while(stTipo.hasMoreTokens()){
                                            tipo = stTipo.nextToken();
                                            
                                            if(ENT.contains(tipo) || DEC.contains(tipo) || TEXT.contains(tipo)|| TAKE.contains(tipo)){
                                                Error.setText("La Variable esta repetida ("+tipo+") "+i+": \n"
                                                               + "________________________________________________________________________\n"+token);
                                                for(int j = 1; j <i; j++){
                                                    txt += "\n";
                                                }
                                                LineaError.setText(txt+" ->");
                                                break;
                                            }
                                            
                                            DEC.add(tipo);
                                        }
                                    }
                                    if(tipo.contains("TAKE")){
                                        while(stTipo.hasMoreTokens()){
                                            tipo = stTipo.nextToken();
                                            
                                            if(ENT.contains(tipo) || DEC.contains(tipo) || TEXT.contains(tipo)|| TAKE.contains(tipo)){
                                                Error.setText("La Variable esta repetida ("+tipo+") "+i+": \n"
                                                               + "________________________________________________________________________\n"+token);
                                                for(int j = 1; j <i; j++){
                                                    txt += "\n";
                                                }
                                                LineaError.setText(txt+" ->");
                                                break;
                                            }
                                            
                                            TAKE.add(tipo);
                                        }
                                    }
                                    if(tipo.contains("float")){
                                        while(stTipo.hasMoreTokens()){
                                            tipo = stTipo.nextToken();
                                            
                                            if(ENT.contains(tipo) || DEC.contains(tipo) || TEXT.contains(tipo)|| TAKE.contains(tipo)){
                                                Error.setText("La variable esta repetida ("+tipo+") "+i+": \n"
                                                               + "________________________________________________________________________\n"+token);
                                                for(int j = 1; j <i; j++){
                                                    txt += "\n";
                                                }
                                                LineaError.setText(txt+" ->");
                                                
                                                break;
                                            }
                                            
                                            TEXT.add(tipo);
                                        }
                                    }
                                }
                                if(token.matches(defVal)){
                                    StringTokenizer stComprobar = new StringTokenizer(token," \n\t=;");
                                    String ID = stComprobar.nextToken(), comprobar = "", tok = "";
                                    //System.out.print(ID);
                                    while(stComprobar.hasMoreTokens()){
                                            comprobar += stComprobar.nextToken();
                                        }
                                    
                                    if(ENT.contains(ID)){
                                        StringTokenizer stComprobarE = new StringTokenizer(comprobar,"+*/-");
                                        while(stComprobarE.hasMoreTokens()){
                                            tok = stComprobarE.nextToken();
                                            
                                            if(tok.matches(id)){
                                                if(ENT.contains(tok));
                                                else{
                                                    Error.setText("Tipos Incompatibles ("+tok+") "+i+": \n"
                                                                    + "________________________________________________________________________\n"+token);
                                                    for(int j = 1; j <i; j++){
                                                        txt += "\n";
                                                    }
                                                    LineaError.setText(txt+" ->");
                                                    break;
                                                }
                                            }
                                            else{
                                                if(tok.matches(entero));
                                                else{
                                                    Error.setText("Tipos Incompatibles ("+tok+") "+i+": \n"
                                                                    + "________________________________________________________________________\n"+token);
                                                    for(int j = 1; j <i; j++){
                                                        txt += "\n";
                                                    }
                                                    LineaError.setText(txt+" ->");
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    else {
                                        if(DEC.contains(ID)){
                                            StringTokenizer stComprobarD = new StringTokenizer(comprobar,"+*/-");
                                            while(stComprobarD.hasMoreTokens()){
                                                tok = stComprobarD.nextToken();

                                                if(tok.matches(id)){
                                                    if(DEC.contains(tok));
                                                    else{
                                                        Error.setText("Tipos Incompatibles ("+tok+") "+i+": \n"
                                                                        + "________________________________________________________________________\n"+token);
                                                        for(int j = 1; j <i; j++){
                                                            txt += "\n";
                                                        }
                                                        LineaError.setText(txt+" ->");
                                                        break;
                                                    }
                                                }
                                                else{
                                                    if(tok.matches(decimal));
                                                    else{
                                                        Error.setText("Tipos Incompatibles ("+tok+") "+i+": \n"
                                                                        + "________________________________________________________________________\n"+token);
                                                        for(int j = 1; j <i; j++){
                                                            txt += "\n";
                                                        }
                                                        LineaError.setText(txt+" ->");
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        else {
                                            if(TEXT.contains(ID)){
                                                   if(comprobar.matches("((((\")[.\\W\\w\\s]*(\"))|("+id+"))((\\s)*(\\+)((\\s)*((\")[.\\W\\w\\s]*(\"))|("+id+")))*)"));
                                                   else {
                                                       Error.setText("Tipos Incompatibles "+i+": \n"
                                                                        + "________________________________________________________________________\n"+token);
                                                        for(int j = 1; j <i; j++){
                                                            txt += "\n";
                                                        }
                                                        LineaError.setText(txt+" ->");
                                                        break;
                                                   }
                                            }
                                            else{
                                                Error.setText("Variable no declarada "+i+": \n"
                                                                + "________________________________________________________________________\n"+token);
                                                for(int j = 1; j <i; j++){
                                                   txt += "\n";
                                                }
                                                LineaError.setText(txt+" ->");
                                                break;
                                            } 
                                        }
                                    }     
                                }
                            }
                            
                            
                            else {
                                if(token.contains("System.out.println")){
                                    Error.setText("Error al declarar sentencia System.out.println; en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ->");
                                    break;
                                }
                                if(token.contains("int") || token.contains("decimal") || token.contains("float")){
                                    Error.setText("Error en declaracion de variables; en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ->");
                                    break;
                                }
                                if(token.contains("TAKE")){
                                    Error.setText("Error en lectura de valor TAKE  en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ->");
                                    break;
                                }
                                if(token.contains("end for}")){
                                    Error.setText("Cierre de Ciclo for incorrecto  en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ->");
                                    break;
                                }
                                if(token.contains("START")){
                                    Error.setText("Inicio de Ciclo for incorrecto  en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ->");
                                    break;
                                }
                                if(token.contains("end while")){
                                    Error.setText("Cierre de ciclo while incorrecto en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ->");
                                    break;
                                }
                                if(token.contains("while")){
                                    Error.setText("Inicio de ciclo while incorrecto en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ->");
                                    break;
                                }
                                if(token.contains("end if")){
                                    Error.setText("Cierre de condicion if incorrecto en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ->");
                                    break;
                                }
                                if(token.contains("if")){
                                    Error.setText("Inicio de if incorrecto; en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ->");
                                    break;
                                }
                                else {
                                    Error.setText("Sintaxis Erronea en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ->");
                                    break;
                                }
                            }
                            
                            
                    }
                }
                   
                else {
                    st = new StringTokenizer(txtATexto1.getText(),";{}",true);
                    while (st.hasMoreTokens()){
                        token = st.nextToken();
                        if(st.hasMoreTokens())token = token+st.nextToken();
                        if(token.matches("[.\\W\\w\\s]*(\\})") && st.countTokens() == 1){
                            String auxTok = st.nextToken();
                            token = token+(auxTok.substring(0,auxTok.indexOf("\n")));
                        }
                            StringTokenizer lin = new StringTokenizer(token,"\n",true);
                            while (lin.hasMoreTokens()){
                                e = lin.nextToken();
                                if("\n".equals(e)) i++;
                            }
                            if(eB == 1) break;
                            if(token.matches(start2)) start++;
                            if(token.matches(start3)) start--;
                            if(token.matches(when2)) when++;
                            if(token.matches(when3)) when--;
                            if(token.matches(it2)) it++;
                            if(token.matches(it3)) it--;
                            if(token.matches(it4)) it++;
                            if(token.matches(it5)) it--;
                            
                            if((st.hasMoreTokens() == false && (start > 0 || when > 0 || it > 0)) || (start < 0 || when < 0 || it < 0)) eB = 1;
                            
                            if((token.matches(send) || token.matches(take) || token.matches(var)|| token.matches(var2) || token.matches(defVal) ||    token.matches(main2) || token.matches(main3)  ||  token.matches(main1) ||token.matches(main4) ||token.matches(main5) ||token.matches("(\\s)*(\\$)") || token.matches(start2) || token.matches(start3) || token.matches(when2) || token.matches(when3) || token.matches(it2) || token.matches(it3)|| token.matches(it4) || token.matches(it5)) && eB == 0){
                                Error.setText("Compilado Exitosamente xD lml");
                                if(token.matches(main3)) eB = 1;
                            }
                             
                            else {
                                if(token.contains("System.out.println")){
                                    Error.setText("Error al declarar sentencia System.out.println  en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ->");
                                    break;
                                }
                                if(token.contains("int") || token.contains("decimal") || token.contains("float")){
                                    Error.setText("Error en declaracion de variables  en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ->");
                                    break;
                                }
                                if(token.contains("TAKE")){
                                    Error.setText("Error en lectura de valor TAKE en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ->");
                                    break;
                                }
                                if(token.contains("end for}")){
                                    Error.setText("Cierre de Ciclo for incorrecto en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ->");
                                    break;
                                }
                                if(token.contains("START")){
                                    Error.setText("Inicio de Ciclo for incorrecto  en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ->");
                                    break;
                                }
                                if(token.contains("end while")){
                                    Error.setText("Cierre de ciclo while incorrecto  en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ->");
                                    break;
                                }
                                if(token.contains("while")){
                                    Error.setText("Inicio de ciclo while incorrecto  en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ->");
                                    break;
                                }
                                if(token.contains("end if")){
                                    Error.setText("Cierre de condicion if incorrecto; en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ->");
                                    break;
                                }
                                // do while
                                  if(token.contains("while")){
                                    Error.setText("Cierre de condicion do incorrecto; en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ->");
                                    break;
                                }
                                
                                
                                
                                if(token.contains("if")){
                                    Error.setText("Inicio de if incorrecto en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ->");
                                    break;
                                }
                                
                                 if(token.contains("do")){
                                    Error.setText("Inicio de do incorrecto en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ->");
                                    break;
                                }
                                
                                
                                
                                
                                else {
                                    Error.setText("Sintaxis Erronea en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ->");
                                    break;
                                }
                            }
                    }
                    if(mainE == 0) {
                        Error.setText("Cierre de Clase incorrecto en la Linea "+i+": \n"
                                       + "\n"+token);
                        for(int j = 1; j <1; j++){
                            txt += "\n";
                        }
                        LineaError.setText(txt+" ->");
                    }
                }
               
            
        
        ////////////////////////////////////////////////////////////////////////
    }//GEN-LAST:event_jButton4ActionPerformed
    
    public static void main(String args[]) {
        ///////editor//////
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
          ///////////////////////
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Interfaz().setVisible(true);
//            }
//        });
    }
    
    
    ////////////editor //////////////////
          public void Guardar()
    {
        try
        {
            j = new JFileChooser();
           
            
            j.setFileSelectionMode( JFileChooser.FILES_ONLY );
            FileNameExtensionFilter filtroTxt=new FileNameExtensionFilter("Documento de Texto","txt");
            j.setFileFilter(filtroTxt);
            j.setFileHidingEnabled(false);
            int fin = this.getTitle().lastIndexOf('.');
            if(fin == -1)fin = this.getTitle().length();
            j.setSelectedFile(new File(this.getTitle().substring(0,fin)));
          
            int select = j.showSaveDialog(this);
            File guarda = j.getSelectedFile();
            
            if(select == JFileChooser.APPROVE_OPTION)
            {
                if(guarda !=null)
                {
                    FileWriter  save=new FileWriter(guarda+".txt");
                    save.write(txtATexto1.getText());
                    save.close();
                    JOptionPane.showMessageDialog(null,"Se ha guardado el archivo","Información",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        catch(IOException ex)
        {
            JOptionPane.showMessageDialog(null,"Su archivo no se ha guardado","Advertencia",JOptionPane.WARNING_MESSAGE);
        } 
    }         
       
          
          
          //////////////
                                        
//------------------------------- Empieza mi edicion -------------------------------------
          
public void ProbarLexerFile() throws IOException{
    
int var=0, var2=0, var3=0, var4=0;

    File fichero=new File("fichero.txt");//creando fichero txt en raiz
    PrintWriter writer;
    
try{
    writer=new PrintWriter(fichero);
    writer.print(txtATexto1.getText());//ingresado ecuacion
    writer.close();
}
catch(FileNotFoundException ex){
    Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
}
    Reader reader;
        reader = new BufferedReader(new FileReader("fichero.txt"));
    Lexer lexer = new Lexer(reader);
    String Resultados="", ResOperador="", ResNumero="", ResVariable="", ResError="",ResPalRes="",ResDefault="",
            ResSimbolo="",ResCadena="",ResLetra="";

//----------------------- Se comienza a evaluar cada caracter -------------------------------
    while(true){
                Token token=lexer.yylex();
                
            if(token==null){Resultados=Resultados+"FIN";
                    jTxt_Simbolos.setText(ResSimbolo);//mostrando los resultados
                     jTexNReales.setText(ResNumero);
                     jTexOperador.setText(ResOperador);
                     jTexToken.setText(ResLetra);
                     jTexError.setText(ResError);
                     jTexPalabrasRes.setText(ResPalRes);
                     jTexCadena.setText(ResCadena);
                     jTexDefault.setText(ResDefault);
                    return;
            }//termina evaluacion
            
            switch(token){
             
                    case Cadena:
                        Resultados=Resultados+"Token:"+token+" "+lexer.lexeme+"\n";
                        ResCadena=ResCadena+""+lexer.lexeme+"\n"; 
                      
                    break;
                    case SaltoDeLinea:
//                    if (!"".equals(ResNfumero)){ResNumero=ResNumero+"\n";}
                        Resultados=Resultados+"Token:"+token+" "+lexer.lexeme+"\n";
                    break;
                    case ID:
//                        if (!"".equals(ResNumero)){ResNumero=ResNumero+"\n";}
                        Resultados=Resultados+"Token:"+token+" "+lexer.lexeme+"\n";
                        ResVariable=ResVariable+""+lexer.lexeme+"\n";  
                        
                    case Identificador:
                        ResLetra=ResLetra+""+lexer.lexeme+"\n";  
                    break;                    
                    case Numero:
                        //ResNumero=ResNumero+""+token+" "+lexer.lexeme+"\n";
                        ResNumero=ResNumero+""+lexer.lexeme+"\n";
                        //auxnum=auxnum+ResNumero;
                    break;                    
                    case ERROR:                           
//                        if (!"".equals(ResNumero)){ResNumero=ResNumero+"\n";}
                            Resultados=Resultados+"Error, el simbolo no coincide \n";
                            ResError=ResError+token+" "+lexer.lexeme+"\n";
                        
                    break;      
                    case PALABRA_RESERVADA:
                        Resultados=Resultados+"Token:"+token+" "+lexer.lexeme+"\n";
                        ResPalRes=ResPalRes+""+lexer.lexeme+"\n";//lexer.lexeme+"\n";  
                    break;
                    case Simbolo:
                        Resultados=Resultados+"Token:"+token+" "+lexer.lexeme+"\n";
                        ResSimbolo=ResSimbolo+""+lexer.lexeme+"\n";//lexer.lexeme+"\n";  
                    break;
                    case IgualQue:
                       Resultados=Resultados+"Token:"+token+" "+lexer.lexeme+"\n";
//                       ResSimbolo=ResSimbolo+""+lexer.lexeme+"\n";//lexer.lexeme+"\n";
                       ResOperador=ResOperador+""+lexer.lexeme+"\n";                        
//                         Resultados=Resultados+"Token:"+token+" "+lexer.lexeme+"\n";
//                        ResPalRes=ResPalRes+""+lexer.lexeme+"\n";//lexer.lexeme+"\n";  
                    break;
                    case Operador:
                       Resultados=Resultados+"Token:"+token+" "+lexer.lexeme+"\n";
//                       ResSimbolo=ResSimbolo+""+lexer.lexeme+"\n";//lexer.lexeme+"\n";
                       ResOperador=ResOperador+""+lexer.lexeme+"\n";                        
//                         Resultados=Resultados+"Token:"+token+" "+lexer.lexeme+"\n";
//                        ResPalRes=ResPalRes+""+lexer.lexeme+"\n";//lexer.lexeme+"\n";  
                    break;
                    
                    default:
//                       if (!"".equals(ResNumero)){ResNumero=ResNumero+"\n";}
                       Resultados=Resultados+"Token:"+token+"\n";                    
//                       ResOperador=ResOperador+""+token+"\n";
                       ResDefault=ResDefault+""+token+"\n";
                    break;   
                    }	
            }
}//termina mi edicion



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane Error;
    private javax.swing.JEditorPane LineaError;
    private javax.swing.JEditorPane Lineas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTexCadena;
    private javax.swing.JTextArea jTexDefault;
    private javax.swing.JTextArea jTexError;
    private javax.swing.JTextArea jTexNReales;
    private javax.swing.JTextArea jTexOperador;
    private javax.swing.JTextArea jTexPalabrasRes;
    private javax.swing.JTextArea jTexPalabrasRes1;
    private javax.swing.JTextArea jTexToken;
    private javax.swing.JTextArea jTxt_Simbolos;
    private javax.swing.JEditorPane txtATexto1;
    // End of variables declaration//GEN-END:variables
}
