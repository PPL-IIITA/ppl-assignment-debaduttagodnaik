/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valentineweek2;

/**
 *
 * @author Debadutta Godnaik
 */
import valentineweek.*;
public class k_most {
    void findk_most(int k,boy[] boys,girl[] girls,double[] arr,int g_no)
    {
        int i,j;
        boy[] tmpboys = new boy[g_no];
        girl[] tmpgirls = new girl[g_no];
        double[] tmparr = new double[g_no];
        for(i=0;i<g_no;i++)
        {
            tmpboys[i] = boys[i];
            tmpgirls[i] = girls[i];
            tmparr[i] = arr[i];
        }
        boy b;
        girl g;
        double d;
        for(i=0;i<g_no;i++)
        {
            for(j = 0;j<g_no-1-i;j++)
            {
                if(tmparr[j]<tmparr[j+1])
                {
                    d = tmparr[j];
                    tmparr[j] = tmparr[j+1];
                    tmparr[j+1] = d;
                    b = tmpboys[j];
                    tmpboys[j] = tmpboys[j+1];
                    tmpboys[j+1] = b;
                    g = tmpgirls[j];
                    tmpgirls[j] = tmpgirls[j+1];
                    tmpgirls[j+1] = g;
                }
            }
        }
        for(i=0;i<k;i++)
        {
            System.out.println(tmpgirls[i].name+" and "+tmpboys[i].name);
        }
    }
}
