/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valentineweek7;

import valentineweek.make_couples;
import java.io.*;
/**
 *
 * @author Debadutta Godnaik
 * Function main requires n arguments 
 * 1st argument - no. of boys
 * 2nd argument - no. of girls
 * 3rd argument - no. of searches 
 * 4th argument - name 1
 * 5th argument - name 2
 * .
 * .
 * .
 * .
 * nth argument - name n
 */
public class ValentineWeek7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        int num = Integer.parseInt(args[2]);
        int i;
        String[] arr = new String[1000];
        for(i = 0;i<num;i++)
        {
            arr[i] = args[i+3];
        }
        make_couples obj = new make_couples();
        obj.make(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        for(i = 0;i<num;i++)
        {
            for(int j= 0;j<Integer.parseInt(args[1]);j++)
            {
                if( arr[i].equals(obj.commitboys[j].name))
                {
                    System.out.println(arr[i]+" has girlfriend "+obj.commitgirls[j].name);
                }
            }
        }
        
    }
    
}
