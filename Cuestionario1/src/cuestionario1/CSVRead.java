package cuestionario1;
/**
 *
 * @author Nicolas Alveal
 */
/**
 *No funciono info en netbeans ya que si se usaba, no me dejaba tomar los valores de palta.csv
 * Se busco una manera alternativa , ya que el archivo solo abrio viniendo de descargas
 */


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVRead{
   
public static void main (String[] args) {

        String csvFile =  "C:\\Users\\rialv\\OneDrive\\Desktop\\palta.csv";;
        String line = "";
       
        try {
            BufferedReader br = new BufferedReader(new FileReader(csvFile)); 
   
            while ((line = br.readLine()) != null) {
               String[] values = line.split(",");
               Info[] arreglo = new Info[18249];
               
                System.out.println(line);
                
            }

        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } 
           
                
                
           
       }
    }

