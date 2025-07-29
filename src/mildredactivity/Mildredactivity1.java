
package mildredactivity;

import java.util.Scanner;


public class Mildredactivity1 {
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

   
        String name;
        int science, history, math, soc, arts, totalMarks;
        double percentage;

      
        System.out.print("Enter name: ");
        name = scanner.nextLine();

        System.out.print("Enter marks in Science: ");
        science = scanner.nextInt();

        System.out.print("Enter marks in History: ");
        history = scanner.nextInt();

        System.out.print("Enter marks in Math: ");
        math = scanner.nextInt();

        System.out.print("Enter marks in Soc: ");
        soc = scanner.nextInt();

        System.out.print("Enter marks in Arts: ");
        arts = scanner.nextInt();

             totalMarks = science + history + math + soc + arts;
        percentage = (totalMarks / 500.0) * 100; 

      
        String remarks;
        if (percentage < 70) {
            remarks = "Fail";
            System.out.println("Try Again");
        } else if (percentage < 76) {
            remarks = "Poor";
        } else if (percentage < 81) {
            remarks = "Fair";
        } else if (percentage < 86) {
            remarks = "Good";
        } else if (percentage < 91) {
            remarks = "Very Good";
        } else {
            remarks = "Excellent";
        }

        
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.printf("Total percentage: %.2f\n", percentage);
        System.out.println("Remarks: " + remarks);

        if (percentage >= 70) {
            System.out.println("Congrats " + name + ", you Passed.");
        }
    }
}