// Computer Shop System
// Created by : Christiane A. Bacani
import java.util.Scanner;
public class ComputerShopSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Welcome to Bacani`s Internet Cafe!\n");
        
        System.out.print("Username : ");
        String username = input.nextLine();
        
        System.out.print("Password : ");
        String password = input.nextLine();
        
        
        System.out.print("Promo\n1 hour = P 15\n2 hours = P 25\n4 hours = P 50\n6 hours = P 75\n8 hours = P 100\n");
        System.out.print("Enter how many hours you want : ");
        int hours = input.nextInt();
        
       switch (hours){
           case 0:
               System.out.print("Invalid Hours!");
               break;
               
           case 1:
               System.out.print("1 hours Sucessfully Loaded to your Account\n");
               int total = 15;
               
               System.out.print("\nThe total is : P " + total);
               System.out.print("\nEnter your payment : P ");
               int payment = input.nextInt();
               int change = payment - total;
               
               System.out.print("\nChange : P " + change);
               break;
               
           case 2:
                System.out.print("2 hours Sucessfully Loaded to your Account\n");
                int total2 = 25;
               
               System.out.print("\nThe total is : P " + total2);
               System.out.print("\nEnter your payment : P ");
               int payment2 = input.nextInt();
               int change2 = payment2 - total2;
               
               System.out.print("\nChange : P" + change2);
                break;
                
           case 3 :   
                System.out.print("3 hours Sucessfully Loaded to your Account\n");
                int total3 = 40;
                
                System.out.print("\nThe total is : P " + total3);
                System.out.print("\nEnter your payment : P ");
                int payment3 = input.nextInt();
                int change3 = payment3 - total3;
               
                System.out.print("\nChange : P " + change3);
                break;
                
           case 4:   
                System.out.print("4 hours Sucessfully Loaded to your Account\n");
                int total4 = 50;
                
                System.out.print("\nThe total is : P " + total4);
                System.out.print("\nEnter your payment : P ");
                int payment4 = input.nextInt();
                int change4 = payment4 - total4;
                
                System.out.print("\nChange : P " + change4);
                break;
           case 5:   
                System.out.print("5 hours Sucessfully Loaded to your Account\n");
                int total5 = 65;
                
                System.out.print("\nThe total is : P " + total5);
                System.out.print("\nEnter your payment : P ");
                int payment5 = input.nextInt();
                int change5 = payment5 - total5;
                
                System.out.print("\nChange : P " + change5);
                break;
           case 6:   
                System.out.print("6 hours Sucessfully Loaded to your Account\n");
                int total6 = 75;
                
                System.out.print("\nThe total is : P " + total6);
                System.out.print("\nEnter your payment : P ");
                int payment6 = input.nextInt();
                int change6 = payment6 - total6;
                
                System.out.print("\nChange : P " + change6);
                break;  
           case 7:   
                System.out.print("7 hours Sucessfully Loaded to your Account\n");
                int total7 = 90;
                
                System.out.print("\nThe total is : P " + total7);
                System.out.print("\nEnter your payment : P ");
                int payment7 = input.nextInt();
                int change7 = payment7 - total7;
                
                System.out.print("\nChange : P " + change7);
                break; 
                
           case 8:   
                System.out.print("8 hous Sucessfully Loaded to your Account\n");
                int total8 = 100;
                
                System.out.print("\nThe total is : P " + total8);
                System.out.print("\nEnter your payment : P ");
                int payment8 = input.nextInt();
                int change8 = payment8 - total8;
                
                System.out.print("\nChange : P " + change8);
                break;
                
           default :
               System.out.print("\nMaximum Load Capacity Is Only 8 Hours\n");
               break;
                  
       }     
    }
}   
