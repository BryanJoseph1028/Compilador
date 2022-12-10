/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package analexico;

import java.io.File;



/**
 *
 * @author
 */
public class Analexico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String path="C:/Users/Luis Patzan/Documents/NetBeansProjects/analexico/src/analexico/Lexer.flex";
        String path = "C://Users//jense//Dropbox//INGENIERIA//7mo_semestre//COMPILADORES//Proyecto//analexico 4//src//analexico//Lexer.flex";

        generarLexer(path);

    }

    public static void generarLexer(String path) {
        File file = new File(path);
        JFlex.Main.generate(file);
        
    }

    // TODO code application logic here
}
