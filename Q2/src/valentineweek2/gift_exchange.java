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
import java.io.*;

public class gift_exchange {

    void exchange(int b_no,int g_no,int k) throws IOException
    {
        logging_util log = new logging_util();
        double[] happyb = new double[1000];
        double[] happyg = new double[1000];
        double[] tprice = new double[1000];
        double[] comp = new double[1000];
        double[] happycoup = new double[1000];
        make_couples obj = new make_couples();
        obj.make(b_no,g_no);
        random_gifts ran = new random_gifts();
        ran.generate();
        int i,j;
        for(i=0;i<g_no;i++)
        {
            happyb[i] = happyg[i] = 0;
            tprice[i] = 0;
            comp[i] = 0;
            happycoup[i] = 0;
        }
        int cnt1,cnt2,cnt3;
        for(i = 0;i<g_no;i++)
        {
            
            if(obj.commitgirls[i] == null)
            {
                continue;
            }
            if(obj.commitboys[i].commit_type.compareTo("generous") != 0 )
            {
                cnt1 = cnt2 = cnt3 = 0;
            }
            else
            {
                cnt1 = cnt2 = cnt3 = 999;
            }
            while(tprice[i]<(obj.commitgirls[i]).maintenance_budget)
            {
                if(obj.commitboys[i].commit_type.compareTo("generous") != 0 )
                {
                    if(ran.arr1[cnt1].price<=ran.arr2[cnt2].price&&ran.arr1[cnt1].price<=ran.arr3[cnt3].price)
                    {
                        tprice[i]+=ran.arr1[cnt1].price;
                        
                        happyg[i] += ran.arr1[cnt1].price; 
                        if(obj.commitgirls[i].commit_type.compareTo("normal") == 0)
                            happyg[i] += ran.arr1[cnt1].value;
                        
                        
                        log.add("gifting", obj.commitboys[i].name + " gifts " + obj.commitgirls[i].name + " essential gift valued " + String.valueOf(ran.arr1[cnt1].price));
                        System.out.println(obj.commitboys[i].name + " gifts " + obj.commitgirls[i].name + " essential gift valued " + String.valueOf(ran.arr1[cnt1].price));
                        cnt1++;
                    }
                    else if(ran.arr2[cnt2].price<=ran.arr1[cnt1].price&&ran.arr2[cnt2].price<=ran.arr3[cnt3].price)
                    {
                        tprice[i]+=ran.arr2[cnt2].price;
                        
                        happyg[i] += ran.arr2[cnt2].price; 
                        if(obj.commitgirls[i].commit_type.compareTo("normal") == 0)
                            happyg[i] += ran.arr2[cnt2].value;
                        else if(obj.commitgirls[i].commit_type.compareTo("choosy") == 0)
                            happyg[i] += 2*ran.arr2[cnt2].value;
                        
                        log.add("gifting", obj.commitboys[i].name + " gifts " + obj.commitgirls[i].name + " luxury gift valued " + String.valueOf(ran.arr2[cnt2].price));
                        System.out.println(obj.commitboys[i].name + " gifts " + obj.commitgirls[i].name + " luxury gift valued " + String.valueOf(ran.arr2[cnt2].price));
                        cnt2++;
                    }
                    else
                    {
                        tprice[i]+=ran.arr3[cnt3].price;
                        
                        happyg[i] += ran.arr3[cnt3].price; 
                        if(obj.commitgirls[i].commit_type.compareTo("normal") == 0)
                            happyg[i] += ran.arr3[cnt3].value;
                        
                        log.add("gifting", obj.commitboys[i].name + " gifts " + obj.commitgirls[i].name + " utility gift valued " + String.valueOf(ran.arr3[cnt3].price));
                        System.out.println(obj.commitboys[i].name + " gifts " + obj.commitgirls[i].name + " utility gift valued " + String.valueOf(ran.arr3[cnt3].price));
                        cnt3++;
                    }
                }
                else
                {
                    if(ran.arr1[cnt1].price>=ran.arr2[cnt2].price&&ran.arr1[cnt1].price>=ran.arr3[cnt3].price)
                    {
                        tprice[i]+=ran.arr1[cnt1].price;
                        
                        happyg[i] += ran.arr1[cnt1].price; 
                        if(obj.commitgirls[i].commit_type.compareTo("normal") == 0)
                            happyg[i] += ran.arr1[cnt1].value;
                        
                        
                        log.add("gifting", obj.commitboys[i].name + " gifts " + obj.commitgirls[i].name + " essential gift valued " + String.valueOf(ran.arr1[cnt1].price));
                        System.out.println(obj.commitboys[i].name + " gifts " + obj.commitgirls[i].name + " essential gift valued " + String.valueOf(ran.arr1[cnt1].price));
                        cnt1--;
                    }
                    else if(ran.arr2[cnt2].price>=ran.arr1[cnt1].price&&ran.arr2[cnt2].price>=ran.arr3[cnt3].price)
                    {
                        tprice[i]+=ran.arr2[cnt2].price;
                        
                        happyg[i] += ran.arr2[cnt2].price; 
                        if(obj.commitgirls[i].commit_type.compareTo("normal") == 0)
                            happyg[i] += ran.arr2[cnt2].value;
                        else if(obj.commitgirls[i].commit_type.compareTo("choosy") == 0)
                            happyg[i] += 2*ran.arr2[cnt2].value;
                        
                        log.add("gifting", obj.commitboys[i].name + " gifts " + obj.commitgirls[i].name + " luxury gift valued " + String.valueOf(ran.arr2[cnt2].price));
                        System.out.println(obj.commitboys[i].name + " gifts " + obj.commitgirls[i].name + " luxury gift valued " + String.valueOf(ran.arr2[cnt2].price));
                        cnt2--;
                    }
                    else
                    {
                        tprice[i]+=ran.arr3[cnt3].price;
                        
                        happyg[i] += ran.arr3[cnt3].price; 
                        if(obj.commitgirls[i].commit_type.compareTo("normal") == 0)
                            happyg[i] += ran.arr3[cnt3].value;
                        
                        log.add("gifting", obj.commitboys[i].name + " gifts " + obj.commitgirls[i].name + " utility gift valued " + String.valueOf(ran.arr3[cnt3].price));
                        System.out.println(obj.commitboys[i].name + " gifts " + obj.commitgirls[i].name + " utility gift valued " + String.valueOf(ran.arr3[cnt3].price));
                        cnt3--;
                    }
                }
                
            }
            if(obj.commitboys[i].maintenance_budget>tprice[i]&&obj.commitboys[i].commit_type.compareTo("geek")==0)
            {
                if(obj.commitboys[i].maintenance_budget-tprice[i]>=ran.arr2[cnt2].price)
                {
                    tprice[i]+=ran.arr2[cnt2].price;
                    
                    happyg[i] += ran.arr2[cnt2].price; 
                    if(obj.commitgirls[i].commit_type.compareTo("normal") == 0)
                        happyg[i] += ran.arr2[cnt2].value;
                    else if(obj.commitgirls[i].commit_type.compareTo("choosy") == 0)
                        happyg[i] += 2*ran.arr2[cnt2].value;
                        
                    log.add("gifting", obj.commitboys[i].name + " gifts " + obj.commitgirls[i].name + " luxury gift valued " + String.valueOf(ran.arr2[cnt2].price));
                    System.out.println(obj.commitboys[i].name + " gifts " + obj.commitgirls[i].name + " luxury gift valued " + String.valueOf(ran.arr2[cnt2].price));
                    cnt2++;
              
                }
            }
        
            if(obj.commitgirls[i].commit_type.compareTo("choosy")==0)
            {
                happyg[i] = Math.log(happyg[i]);
            }
            if(obj.commitgirls[i].commit_type.compareTo("desperate")==0)
            {
                happyg[i] = Math.exp(happyg[i]);
            }
            
            if(obj.commitboys[i].commit_type.compareTo("miser")==0)
            {
                happyb[i] = obj.commitboys[i].maintenance_budget-tprice[i];
            }
            if(obj.commitboys[i].commit_type.compareTo("generous")==0)
            {
                happyb[i] = happyg[i];
            }
            if(obj.commitboys[i].commit_type.compareTo("geek")==0)
            {
                happyb[i] = obj.commitgirls[i].intel_level;
            }
        }
        
        for(i=0;i<g_no;i++)
        {
            if(obj.commitgirls[i]==null)
            {
                happycoup[i] = 0;
                comp[i] = 0;
                continue;
            }
            happycoup[i] = happyb[i] + happyg[i];
            comp[i] = (obj.commitboys[i].maintenance_budget-obj.commitgirls[i].maintenance_budget) + Math.abs((obj.commitboys[i].attract_rating-obj.commitgirls[i].attract_rating)) + Math.abs((obj.commitboys[i].intel_level-obj.commitgirls[i].intel_level));
        }
        
        k_most object = new k_most();
        System.out.println("\n"+k+" happiest couples:");
        object.findk_most(k, obj.commitboys, obj.commitgirls,happycoup,g_no);
        System.out.println("\n"+k+" most compatible couples:");
        object.findk_most(k, obj.commitboys, obj.commitgirls,comp,g_no);
       
                
        
    }
    
    
}
