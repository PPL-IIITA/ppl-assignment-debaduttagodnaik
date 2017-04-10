/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valentineweek9;

import valentineweek2.gift_exchange;
import java.io.*;

/**
 *
 * @author Debadutta Godnaik
 * Function main requires three arguments 
 * 1st argument - no. of boys
 * 2nd argument - no. of girls
 * 3rd argument - k
 */
public class ValentineWeek9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
                gift_exchangesecondary obj = new gift_exchangesecondary();
                obj.exchange(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
    }
    
}
