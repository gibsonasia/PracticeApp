package nyc.c4q.asiagibson;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your test score: ");
        int grade = sc.nextInt();

    String[] letterGrade = {"A+", "A","B","C","D","F"};
   // int grade = 0;


            if (grade == 100){
                System.out.printf("Your grade is: " + letterGrade[0]);
            }
            else if (grade >= 90 && grade <= 99){
                System.out.println("Your grade is: " + letterGrade[1]);
            }
            else if (grade >= 80 && grade <= 89){
                System.out.println("Your grade is: " + letterGrade[2]);
            }
            else if (grade >= 70 && grade <= 79){
                System.out.println("Your grade is: " + letterGrade[3]);

            }else if (grade >= 60 && grade <= 69){
                System.out.println("Your grade is: " + letterGrade[4]);

            }else{
                System.out.println("Your grade is: " + letterGrade[5]);
            }

        }

    }




 /*  Time timeObject = new Time();
        System.out.println(timeObject.toMilitarty());
        System.out.println(timeObject.toString());

        timeObject.setTime(13,27,6);
        System.out.println(timeObject.toMilitarty());
        System.out.println(timeObject.toString());

        // timeObject.setTime(13,27,6);
       // System.out.println(timeObject.toMilitarty()); */