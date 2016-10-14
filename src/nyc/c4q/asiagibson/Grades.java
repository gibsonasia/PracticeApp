package nyc.c4q.asiagibson;
/**
 * Created by asiagibson on 9/18/16.
 */
public class Grades {
    String[] letterGrade = {"A+", "A","B","C","D","F"};
    int grade;

    public void setGrade(int letter){

        while (grade == 0 && grade <= 100){

            if (grade == 100){
                System.out.printf(letterGrade[0]);
            }
            else if (grade == 90 && grade <= 99){
                System.out.println(letterGrade[1]);
            }
            else if (grade == 80 && grade <= 89){
                System.out.println(letterGrade[2]);
            }
            else if (grade == 70 && grade <= 79){
                System.out.println(letterGrade[3]);
            }else if (grade == 60 && grade <= 69){
                System.out.println(letterGrade[4]);
            }else{
                System.out.println(letterGrade[5]);
            }

        }

    }


}
