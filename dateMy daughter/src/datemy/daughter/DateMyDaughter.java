/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datemy.daughter;

import java.util.Scanner;

/**
 *
 * @author ticho
 */
public class DateMyDaughter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
     Scanner input=new Scanner(System.in);
     
     System.out.println("Hello,if you want to date my daughter you must answer some questions, let see if you can answer");
     System.out.println("What is your age?");
     int age=input.nextInt();
     boolean ageOk=(age>25) &&(age<45);
     
     System.out.println("How much is your income?");
     int income=input.nextInt();
     boolean incomeOk=income>15000;
     
     System.out.println("How cute you are?Please enter a number between 0.0 and 10.0");
     double cute=input.nextDouble();
     
     boolean cuteOk=cute>8.3;
    
     boolean permission=ageOk && (incomeOk)||(cuteOk);
      
     
      
     System.out.println( "permission to date is "+permission );
        
        
        
        
        
    }
    
}
