
package celsiustofahrenheit;

import java.util.Scanner;

public class CelsiusToFahrenheit {

  
    public static void main(String[] args) {
       
        Scanner k=new Scanner(System.in);
        
        System.out.println("Please select what you want to convert.. ");
        System.out.println("1-Celsius to Fehrenheit");
        System.out.println("2-Fehrenheit to Celsius");
        System.out.print("Write your answare here ");
        byte degree=k.nextByte();
        
        switch(degree){
            
            case 1:
                System.out.println("Please enter the degree you want to convert: ");
                double Degrees_C=k.nextDouble();
                double Degrees_F= (9*(Degrees_C))/5+32;
                System.out.println(Degrees_C+" degrees in celsius equals "+Degrees_F+" in fehrenheit");break;
                
                
            case 2:
                System.out.println("Please enter the degree you want to convert: ");
                double Degrees_f=k.nextDouble();
                double Degrees_c= (5*(Degrees_f-32))/9.0;
                System.out.println(Degrees_f+" degrees in fehrenheit equals "+Degrees_c+" in celsius");break;
               
            default :  
        }   
        
    }
    
}
