/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valentineweek4;

import valentineweek.boy;
import valentineweek.girl;
import valentineweek.logging_util;
import java.io.*;

/**
 *
 * @author Debadutta Godnaik
 * Function commit() - commits the broken up girl with a different boy.
 */
public class commitagain {
    public void commit(int k,boy[] boys,girl[] girls,double[] arr,int g_no,int b_no,boy[] source) throws IOException
    {
        logging_util log = new logging_util();
        int i,j;
        girl tmp;
        boy tmp2;
        double maintenance;
        String log1;
        String name;
        int atr,intl;
        double mb;
        for(i = 0;i<k;i++)
        {
            tmp = girls[i];
            tmp2 = boys[i];
            maintenance = girls[i].maintenance_budget;
            atr = boys[i].attract_rating;
            intl = boys[i].intel_level;
            mb = boys[i].maintenance_budget;
            boys[i].attract_rating = 0;
            boys[i].intel_level = 0;
            boys[i].maintenance_budget = 0;
            name = boys[i].name;
            if(tmp.criteria == 'A')
            {
                for(j = 0;j<b_no;j++)
                {
                    if(source[j].min_attract<=tmp.attract_rating && source[j].maintenance_budget>=maintenance && source[j].commit == 'N')
                    {
                       
                            if(source[j].attract_rating>boys[i].attract_rating&&source[j].name!=name)
                            {
                                boys[i].commit = 'N';
                                boys[i] = source[j];
                                source[j].commit = 'Y';
                            }
                            
                        
                        
                    }
                
                }
                
            }
            else if(tmp.criteria == 'I')
            {
                for(j = 0;j<b_no;j++)
                {
                    if(source[j].min_attract<=tmp.attract_rating && source[j].maintenance_budget>=maintenance && source[j].commit == 'N')
                    {
                        
                            if(source[j].intel_level>boys[i].intel_level&&source[j].name!=name)
                            {
                                boys[i].commit = 'N';
                                boys[i] = source[j];
                                source[j].commit = 'Y';
                            }
                            
                        
                        
                    }
                
                }
                
            }
            else if(tmp.criteria == 'R')
            {
                for(j = 0;j<b_no;j++)
                {
                    if(source[j].min_attract<=tmp.attract_rating && source[j].maintenance_budget>=maintenance && source[j].commit == 'N')
                    {
                        
                            if(source[j].maintenance_budget>boys[i].maintenance_budget&&source[j].name!=name)
                            {
                                boys[i].commit = 'N';
                                boys[i] = source[j];
                                source[j].commit = 'Y';
                            }
                            
                        
                        
                    }
                
                }
                
            }
            tmp2.attract_rating = atr;
            tmp2.intel_level = intl;
            tmp2.maintenance_budget = mb;
            log1 = girls[i].name + " is committed to " + boys[i].name;
            log.add("Commitment",log1);
            System.out.println(log1);
        }
    }
}
