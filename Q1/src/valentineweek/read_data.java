/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valentineweek;

/**
 *
 * @author Debadutta Godnaik
 */
import java.io.*;
public class read_data {
    
    boy[] get_boys(int num) throws IOException
    {
        BufferedReader br = null;
        br = new BufferedReader(new FileReader("boys.txt"));	
        int i;
        boy[] arr = new boy[num];
        String name;
        int attract_rating;
        double maintenance_budget;
        int intel_level;
        int min_attract;
        String commit_type;
        for(i = 0;i < num;i++)
        {
            name = br.readLine();
            attract_rating = Integer.parseInt(br.readLine());
            maintenance_budget = Double.parseDouble(br.readLine());
            intel_level = Integer.parseInt(br.readLine());
            min_attract = Integer.parseInt(br.readLine());
            commit_type = br.readLine();
            arr[i] = new boy(name,attract_rating,maintenance_budget,intel_level,min_attract,commit_type);
            
        }
        br.close();
        return arr;
    }
    
    girl[] get_girls(int num) throws IOException
    {
        BufferedReader br = null;
        br = new BufferedReader(new FileReader("girls.txt"));	
        int i;
        girl[] arr = new girl[num];
        String name;
        int attract_rating;
        double maintenance_budget;
        int intel_level;
        char criteria;
        String commit_type;
        for(i = 0;i < num;i++)
        {
            name = br.readLine();
            attract_rating = Integer.parseInt(br.readLine());
            maintenance_budget = Double.parseDouble(br.readLine());
            intel_level = Integer.parseInt(br.readLine());
            criteria = (br.readLine()).charAt(0);
            commit_type = br.readLine();
            arr[i] = new girl(name,attract_rating,maintenance_budget,intel_level,criteria,commit_type);
            
        }
        br.close();
        return arr;
    }
    
}
