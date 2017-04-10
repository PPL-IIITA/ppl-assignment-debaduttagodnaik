/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valentineweek6;


import java.io.*;
import valentineweek.make_couples;
import valentineweek4.*;

/**
 *
 * @author Debadutta Godnaik
 * Function main requires four arguments 
 * 1st argument - no. of boys
 * 2nd argument - no. of girls
 * 3rd argument - k 
 * 4th argument - t
 */
public class ValentineWeek6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        make_couples obj = new make_couples();
        obj.make(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        gift_exchangeonly obj4 = new gift_exchangeonly();
        breakupk obj2 = new breakupk();
        commitagain obj3 = new commitagain();
        obj4.exchange(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]),obj);
        System.out.println();
        int t = Integer.parseInt(args[3]);
        int count = 1;
        while(true)
        {
            if(count%t==0)
            {
                obj2.breakup(Integer.parseInt(args[2]),obj.commitboys,obj.commitgirls,obj4.happycoup,Integer.parseInt(args[1]));
                System.out.println();
                obj3.commit(Integer.parseInt(args[2]),obj.commitboys,obj.commitgirls,obj4.happycoup,Integer.parseInt(args[1]),Integer.parseInt(args[0]),obj.boys);
            }
            obj4.exchange(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]),obj);
            
            count++;
        }
    }
    
}
