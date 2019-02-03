/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.proiect.poo;
import java.io.FileInputStream;
import java.util.Scanner;
/**
 *
 * @author soare
 */
public class PretTotalInt {
    public Scanner scan;
    public double total=0;
    public String price;

    public String getTotal() {
        
         try{
              scan = new Scanner(new FileInputStream("comanda.txt"));
            while(scan.hasNextLine())
            {
                
                
                scan.nextLine();
               scan.nextLine();
               price = scan.nextLine();
               total+=Double.valueOf(price);
               
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return String.valueOf("Pretul total este : "+total);
    }
     
    
}
