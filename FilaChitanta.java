/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.proiect.poo;
import java.io.*;
import java.io.FileInputStream;
import java.util.Scanner;
/**
 *
 * @author soare
 */
public class FilaChitanta {
    private Scanner sc;
    private Scanner scan;
    private String name;
    private String price;
    private String quantity;
    private StringBuilder fullnames;
    private double dPrice;
    private int dQuantity;
    private double multi;
    private double sum=0;
    private PrintWriter pw;
    public FilaChitanta()
    {
        fullnames = new StringBuilder();
        openFile();
        readFile();
        closeFile();
    }

    public StringBuilder getFullNames()
    {
        return fullnames;
    }
    public String getSum(){
    
        return String.valueOf(sum);
    }

    private void openFile()
    {
        try
        {
            pw = new PrintWriter(new FileOutputStream("comanda.txt",true));
            scan = new Scanner(new File("temp.txt"));
            sc = new Scanner(new FileInputStream("articole.txt"));
            System.out.println("Fisierul a fost Gasit!");
        }

        catch(Exception e)
        {
            System.out.println("Fisierul nu a fost Gasit");
        }
    }

    private void readFile()
    {
        try{
            while(scan.hasNextLine())
            {
                sc = new Scanner(new FileInputStream("articole.txt"));
                
                name = scan.nextLine();
                System.out.println(name);
                // price = scan.nextLine();
                while(sc.hasNextLine()){
                    multi=1;
                    if(name.equalsIgnoreCase(sc.nextLine())){
                        price=sc.nextLine();
                        dPrice=Double.valueOf(price);
                        System.out.println(dPrice);
                        sc.nextLine();
                    }
                    
                }
                sc.close();
                
                quantity=scan.nextLine();
                dQuantity=Integer.decode(quantity);
                multi=dPrice*dQuantity;
                sum+=multi;
              
                fullnames.append(name + " \t"+quantity+"\t"+multi+ "\n");
               
             //   write();
                
                
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        
                
        
    }

    private void closeFile()
    {
        scan.close();
        sc.close();
        pw.close();
    }
    
    /*public void write(){
        try {
               pw = new PrintWriter(new FileOutputStream("order.txt",true));
                pw.println(name);
                pw.println(quantity);
                pw.println(multi);
                pw.close();
        } catch (Exception e) {
        }
    }
    */

    public String getName() {
        return name;
    }

    public String getQuantity() {
        return quantity;
    }

    public double getMulti() {
        return multi;
    }
    
}

