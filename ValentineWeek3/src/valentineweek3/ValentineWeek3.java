/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valentineweek3;


import java.io.*;
/**
 *
 * @author Debadutta Godnaik
 * Function main requires three arguments 
 * 1st argument - no. of boys
 * 2nd argument - no. of girls
 * 3rd argument - k 
 */
public class ValentineWeek3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        gift_exchange obj = new gift_exchange();
        obj.exchange(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
    }
    
}
