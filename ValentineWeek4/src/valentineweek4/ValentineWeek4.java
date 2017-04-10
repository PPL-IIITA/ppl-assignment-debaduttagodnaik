/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valentineweek4;

import valentineweek2.gift_exchange;
import valentineweek.*;
import java.io.*;
/**
 *
 * @author Debadutta Godnaik
 * Function main requires three arguments 
 * 1st argument - no. of boys
 * 2nd argument - no. of girls
 * 3rd argument - k 
 */
public class ValentineWeek4 {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        gift_exchange obj = new gift_exchange();
        obj.exchange(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
        System.out.println();
        breakupk obj2 = new breakupk();
        obj2.breakup(Integer.parseInt(args[2]),obj.obj.commitboys,obj.obj.commitgirls,obj.happycoup,Integer.parseInt(args[1]));
        System.out.println();
        commitagain obj3 = new commitagain();
        obj3.commit(Integer.parseInt(args[2]),obj.obj.commitboys,obj.obj.commitgirls,obj.happycoup,Integer.parseInt(args[1]),Integer.parseInt(args[0]),obj.obj.boys);
    }
    
}
