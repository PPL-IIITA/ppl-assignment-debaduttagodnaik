/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valentineweek4;
import valentineweek2.*;
import valentineweek.*;
import java.io.*;
/**
 *
 * @author Debadutta Godnaik
 * Function breakup() - causes the breakup of least k happy couples
 */
public class breakupk {
    public void breakup(int k,boy[] boys,girl[] girls,double[] arr,int g_no) throws IOException
    {
        int i,j;
        boy b;
        girl g;
        double d;
        for(i=0;i<g_no;i++)
        {
            for(j = 0;j<g_no-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    d = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = d;
                    b = boys[j];
                    boys[j] = boys[j+1];
                    boys[j+1] = b;
                    g = girls[j];
                    girls[j] = girls[j+1];
                    girls[j+1] = g;
                }
            }
        }
        logging_util log = new logging_util();
        String log1;
        for(i=0;i<k;i++)
        {
            log1 = girls[i].name + " broke up with" + boys[i].name;
            girls[i].commit = 'N';
            boys[i].commit = 'N';
            log.add("Breakup",log1);
            System.out.println(log1);
        }
    }
    
}
