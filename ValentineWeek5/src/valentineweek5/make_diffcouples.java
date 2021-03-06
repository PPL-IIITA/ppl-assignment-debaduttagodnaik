/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valentineweek5;

import valentineweek.boy;
import valentineweek.girl;
import valentineweek.logging_util;
import valentineweek.random_generator;
import valentineweek.read_data;
import java.io.*;

/**
 *
 * @author Debadutta Godnaik
 * Function make() takes 2 arguments i.e. no. of boys and no. of girls
 * It generates two arrays, commitgirls and commitboys by alternate mechanism i.e. one boy and one girl.
 * Corresponding elements of both arrays represent a couple.
 * Variable description
 * commitgirls - stores the committed girls
 * commitboys - stores the committed boys
 * boys - stores all boys
 * girls - stores all girls
 * count - count variable for no. of couples
 */
public class make_diffcouples {
    public girl[] commitgirls = new girl[1000];
    public boy[] commitboys = new boy[10000];
    public boy[] boys;
    public int count = 0;
    void make(int b_no,int g_no) throws IOException
    {
        random_generator obj = new random_generator();
        obj.generate(b_no, g_no);
        read_data obj2 = new read_data();
        boys = obj2.get_boys(b_no);
        girl[] girls = obj2.get_girls(g_no);
        logging_util log = new logging_util();
        int i,j;
        girl tmp;
        boy tmp2;
        double maintenance;
        String log1;
        for(i=0;i<g_no;i++)
        {
            for(j=0;j<g_no-1-i;j++)
            {
                if(girls[i].maintenance_budget>girls[i+1].maintenance_budget)
                {
                    tmp = girls[i];
                    girls[i] = girls[i+1];
                    girls[i+1] = tmp;
                }
            }
        }
        for(i=0;i<b_no;i++)
        {
            for(j=0;j<b_no-1-i;j++)
            {
                if(boys[i].attract_rating>boys[i+1].attract_rating)
                {
                    tmp2 = boys[i];
                    boys[i] = boys[i+1];
                    boys[i+1] = tmp2;
                }
            }
        }
        int gcount = 0;
        int bcount = 0;
        for(i=0;i<g_no;i++)
        {
            if(i%2 == 0)
            {
                while(girls[gcount].commit == 'Y')
                    gcount++;
                tmp = girls[gcount++];
                maintenance = girls[i].maintenance_budget;
                commitgirls[count] = null;
                if(tmp.criteria == 'A')
                {
                    for(j = 0;j<b_no;j++)
                    {
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
                    for(j = 0;j<b_no;j++)
                    {
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
                    for(j = 0;j<b_no;j++)
                    {
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
            else
            {

                while(boys[bcount].commit=='Y')
                    bcount++;
                tmp2 = boys[bcount];
                commitboys[count]= null;
                tmp = null;
                for(j=0;j<g_no;j++)
                {
                    if(girls[j].commit=='N'&&girls[j].maintenance_budget<=tmp2.maintenance_budget)
                    {
                        if(tmp==null)
                        {
                            tmp = girls[j];
                            
                        }
                        else if(tmp.attract_rating<girls[j].attract_rating)
                        {
                            tmp = girls[j];
                        }
                    }
                }
                if(tmp==null)
                {
                    i--;
                    bcount++;
                }
                else
                {
                    commitboys[count] = tmp2;
                    tmp2.commit = 'Y';
                    commitgirls[count] = tmp;
                    tmp.commit = 'Y';

                    log1 = commitboys[count].name + " is committed to " + commitgirls[count].name;
                    log.add("Commitment",log1);
                    System.out.println(log1);
                    count++;
                }
            }
            
            
        }
        
    }
    
}
