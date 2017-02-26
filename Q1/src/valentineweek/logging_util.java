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
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.io.*;
public class logging_util {
    public void add(String event,String descp) throws IOException 
    {
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateobj = new Date();
        String time = (df.format(dateobj));
        File file =new File("log.txt");
        if(!file.exists()){
    	   file.createNewFile();
    	}
        FileWriter fw = new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(time);
        bw.newLine();
        bw.write(event);
        bw.newLine();
        bw.write(descp);
        bw.newLine();
        bw.newLine();
        bw.close();
    }
    
}
