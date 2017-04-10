/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valentineweek10;

import java.io.IOException;
import java.util.Random;
import valentineweek.*;

/**
 *
 * @author Debadutta Godnaik
 * Function make() takes 2 arguments i.e. no. of boys and no. of girls
 * It generates two arrays, commitgirls and commitboys which are generated randomly
 * Corresponding elements of both arrays represent a couple.
 * Variable description
 * commitgirls - stores the committed girls
 * commitboys - stores the committed boys
 * boys - stores all boys
 * girls - stores all girls
 * count - count variable for no. of couples
 */
public class make_couplesrandom {
    public girl[] commitgirls = new girl[1000];
    public boy[] commitboys = new boy[10000];
    public boy[] boys;
    public int count = 0;
    Random rn = new Random();
    public void make(int b_no,int g_no) throws IOException
    {
        random_generator obj = new random_generator();
        obj.generate(b_no, g_no);
        read_data obj2 = new read_data();
        boys = obj2.get_boys(b_no);
        girl[] girls = obj2.get_girls(g_no);
        logging_util log = new logging_util();
        int i,j,k;
        girl tmp;
        double maintenance;
        String log1;
        for(i=0;i<g_no;i++)
        {
            tmp = girls[i];
            maintenance = girls[i].maintenance_budget;
            commitgirls[count] = null;
            if(tmp.criteria == 'A')
            {
                for(k = 0;k<b_no;k++)
                {
                    j = rn.nextInt(1000);
                    if(boys[j].min_attract<=tmp.attract_rating && boys[j].maintenance_budget>=maintenance && boys[j].commit == 'N')
                    {
                        if(commitgirls[count] == null)
                        {
                            commitgirls[count] = tmp;
                            commitboys[count] = boys[j];
                            boys[j].commit = 'Y';
                            tmp.commit = 'Y';
                        }
                        else
                        {
                            if(boys[j].attract_rating>commitboys[count].attract_rating)
                            {
                                commitboys[count].commit = 'N';
                                commitboys[count] = boys[j];
                                boys[j].commit = 'Y';
                            }
                            
                        }
                        
                    }
                
                }
                
            }
            else if(tmp.criteria == 'I')
            {
                for(k = 0;k<b_no;k++)
                {
                    j = rn.nextInt(1000);
                    if(boys[j].min_attract<=tmp.attract_rating && boys[j].maintenance_budget>=maintenance && boys[j].commit == 'N')
                    {
                        if(commitgirls[count] == null)
                        {
                            commitgirls[count] = tmp;
                            commitboys[count] = boys[j];
                            boys[j].commit = 'Y';
                            tmp.commit = 'Y';
                        }
                        else
                        {
                            if(boys[j].intel_level>commitboys[count].intel_level)
                            {
                                commitboys[count].commit = 'N';
                                commitboys[count] = boys[j];
                                boys[j].commit = 'Y';
                            }
                            
                        }
                        
                    }
                
                }
                
            }
            else if(tmp.criteria == 'R')
            {
                for(k = 0;k<b_no;k++)
                {
                    j = rn.nextInt(1000);
                    if(boys[j].min_attract<=tmp.attract_rating && boys[j].maintenance_budget>=maintenance && boys[j].commit == 'N')
                    {
                        if(commitgirls[count] == null)
                        {
                            commitgirls[count] = tmp;
                            commitboys[count] = boys[j];
                            boys[j].commit = 'Y';
                            tmp.commit = 'Y';
                        }
                        else
                        {
                            if(boys[j].maintenance_budget>commitboys[count].maintenance_budget)
                            {
                                commitboys[count].commit = 'N';
                                commitboys[count] = boys[j];
                                boys[j].commit = 'Y';
                            }
                            
                        }
                        
                    }
                
                }
                
            }
            if(commitgirls[count]!=null)
            {
                log1 = commitgirls[count].name + " is committed to " + commitboys[count].name;
                log.add("Commitment",log1);
                System.out.println(log1);
            }
            
            count++;
        }
    }
}