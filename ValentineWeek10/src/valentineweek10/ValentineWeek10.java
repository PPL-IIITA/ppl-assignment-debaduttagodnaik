/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valentineweek10;

/**
 *
 * @author Debadutta Godnaik
 */
import java.io.*;
public class ValentineWeek10 {

    /**
     * @param args the command line arguments
     * Function main requires three arguments 
     * 1st argument - no. of boys
     * 2nd argument - no. of girls
     * 3rd argument - k
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        gift_exchangerandom obj = new gift_exchangerandom();
        obj.exchange(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
    }
    
}
