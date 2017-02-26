/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valentineweek;

/**
 *
 * @author Debadutta Godnaik
 */
import java.io.*;
public class ValentineWeek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        make_couples obj = new make_couples();
        obj.make(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
    }
    
}
