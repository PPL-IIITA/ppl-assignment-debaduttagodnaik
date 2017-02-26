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
import java.util.Random;
public class random_generator  {
    void generate(int b_no,int g_no) throws IOException
    {
        BufferedWriter bw = null;
        File file = new File("boys.txt");
        
        if (!file.exists()) {
	     file.createNewFile();
	  }
        
        FileWriter fw = new FileWriter(file);
	bw = new BufferedWriter(fw);
        
        Random rn = new Random();
        int tmp;
        int i;
        String s = "boy";
        for(i = 1;i <= b_no;i++)
        {
            s = s + String.valueOf(i);
            bw.write(s);
            bw.newLine();
            tmp = rn.nextInt(100);  //Calculate attract_rating
            s = String.valueOf(tmp);
            bw.write(s);
            bw.newLine();
            tmp = 400 + rn.nextInt(600);  //Calculate maintenance_budget
            s = String.valueOf(tmp);
            bw.write(s);
            bw.newLine();
            tmp = rn.nextInt(100);  //Calculate intel_level
            s = String.valueOf(tmp);
            bw.write(s);
            bw.newLine();
            tmp = rn.nextInt(100);  //Calculate min_attract
            s = String.valueOf(tmp);
            bw.write(s);
            bw.newLine();
            tmp = rn.nextInt(3);  //Calculate commit_type
            if(tmp == 0)
            {
                s = "miser";
            }
            else if(tmp == 1)
            {
                s = "generous";
            }
            else
            {
                s = "geek";
            }
            bw.write(s);
            bw.newLine();
            s = "boy";
        }
        bw.close();
        
        file = new File("girls.txt");
        if (!file.exists()) {
	     file.createNewFile();
	  }
        
        fw = new FileWriter(file);
	bw = new BufferedWriter(fw);
        s = "girl";
        for(i = 1;i <= g_no;i++)
        {
            s = s + String.valueOf(i);
            bw.write(s);
            bw.newLine();
            tmp = rn.nextInt(100);  //Calculate attract_rating
            s = String.valueOf(tmp);
            bw.write(s);
            bw.newLine();
            tmp = 400 + rn.nextInt(600);  //Calculate maintenance_budget
            s = String.valueOf(tmp);
            bw.write(s);
            bw.newLine();
            tmp = rn.nextInt(100);  //Calculate intel_level
            s = String.valueOf(tmp);
            bw.write(s);
            bw.newLine();
            tmp = rn.nextInt(3);  //Calculate criteria
            if(tmp == 0)
            {
                s = "A";
            }
            else if(tmp == 1)
            {
                s = "I";
            }
            else
            {
                s = "R";
            }
            bw.write(s);
            bw.newLine();
            tmp = rn.nextInt(3);  //Calculate commit_type
            if(tmp == 0)
            {
                s = "choosy";
            }
            else if(tmp == 1)
            {
                s = "normal";
            }
            else
            {
                s = "desperate";
            }
            bw.write(s);
            bw.newLine();
            s = "girl";
        }
        bw.close();
    }
    
}
