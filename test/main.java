package test;
import java.util.Scanner;
public class main {
     public static void main (String [] args) { 
         
         Scanner s = new Scanner(System.in);
         
         System.out.println("***** WELCOME TO STUDENT OBJECT SIMULATION *****");
         System.out.println();
         
         System.out.print("Input first name    : ");
         String firstname = s.nextLine();
         
         System.out.print("Input last name     : ");
         String lastname = s.nextLine();
         
         System.out.print("Input year          : ");
         String year = s.nextLine();
         
         System.out.print("Input course        : ");
         String course = s.nextLine();
         
         System.out.print("Input section       : ");
         String section = s.nextLine();
         
         System.out.print("Input midterm grade : ");
         float midtermGrade = s.nextFloat();
         
         System.out.print("Input final grade   : ");
         float finalGrade = s.nextFloat();
         
         character c = new character(firstname, lastname, year, course, section, midtermGrade, finalGrade);
         
         c.introduceself();
         c.evaluateGrade();
             
         
         
         
     }
     
   }
        
         