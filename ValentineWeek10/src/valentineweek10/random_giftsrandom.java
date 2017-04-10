/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valentineweek10;

import java.util.Random;
import valentineweek2.egift;
import valentineweek2.lgift;
import valentineweek2.ugift;

/**
 *
 * @author Debadutta Godnaik
 * Function generate() - Creates attributes for 1000 gifts of each type .
 * Variable description
 * egift - essential gifts
 * lgift - luxury gifts
 * ugift - utility gifts
 */
public class random_giftsrandom {
    public egift[] arr1 = new egift[1000];
    public lgift[] arr2 = new lgift[1000];
    public ugift[] arr3 = new ugift[1000];
    
   public void generate() 
    {
        Random rn = new Random();
        int i,j;
        int tmp;
        for(i=0;i<1000;i++)
        {
            arr1[i] = new egift();
            arr1[i].price = rn.nextInt(100);
            arr1[i].value = rn.nextInt(100);
            arr2[i] = new lgift();
            arr2[i].price = rn.nextInt(100);
            arr2[i].value = rn.nextInt(100);
            arr2[i].lux_rate = rn.nextInt(100);
            arr2[i].difficulty = rn.nextInt(10);
            arr3[i] = new ugift();
            arr3[i].price = rn.nextInt(100);
            arr3[i].value = rn.nextInt(100);
            arr3[i].util_value = rn.nextInt(100);
            tmp = rn.nextInt(3);
            if(tmp == 0)
                arr3[i].util_class = "A";
            else if(tmp == 1)
                arr3[i].util_class = "B";
            else
                arr3[i].util_class = "C";
        }
        
        
        
        
    }
    
}
