/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valentineweek8;

import valentineweek.make_couples;
import java.io.*;
/**
 *
 * @author Debadutta Godnaik
 * Function main requires two arguments 
 * 1st argument - no. of boys
 * 2nd argument - no. of girls
 */
public class ValentineWeek8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        make_couples obj = new make_couples();
        obj.make(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        newgiftalloc obj4 = new newgiftalloc();
        obj4.exchange(Integer.parseInt(args[0]),Integer.parseInt(args[1]),obj);
        
    }
    
}
