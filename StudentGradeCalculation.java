import java.util.Scanner;

public class StudentGradeCalculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter How many Subject ");
        int subjects=sc.nextInt();
        int total=0;
        int average;
        int arr[]=new int[subjects];
        for (int i=0;i<arr.length;i++){
            System.out.println("Enter Subject "+(i+1)+" Mark");
            int mark=sc.nextInt();
            if(mark>=0 && mark<=100){
                arr[i]=mark;
            }
            else{
                System.out.println("Mark Should be 0 to 100 range");
                i--;
            }
        }
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
        }
        average=total/subjects;
        if(average>=90 && average<=100){
            System.out.println("Total marks in all Subjects   : "+total);
            System.out.println("Average marks in all Subjects : "+average);
            System.out.println("Grade O");
        }
        else if (average>=80 && average<90) {
            System.out.println("Total marks in all Subjects   : "+total);
            System.out.println("Average marks in all Subjects : "+average);
            System.out.println("Grade A+");
        }
        else if (average>=70 && average<80) {
            System.out.println("Total marks in all Subjects   : "+total);
            System.out.println("Average marks in all Subjects : "+average);
            System.out.println("Grade A");
        }
        else if (average>=60 && average<70) {
            System.out.println("Total marks in all Subjects   : "+total);
            System.out.println("Average marks in all Subjects : "+average);
            System.out.println("Grade B+");
        }
        else if (average>=55 && average<60) {
            System.out.println("Total marks in all Subjects   : "+total);
            System.out.println("Average marks in all Subjects : "+average);
            System.out.println("Grade B");
        }
        else if (average>=50 && average<55) {
            System.out.println("Total marks in all Subjects   : "+total);
            System.out.println("Average marks in all Subjects : "+average);
            System.out.println("Grade C");
        }
        else {
            System.out.println("Total marks in all Subjects   : "+total);
            System.out.println("Average marks in all Subjects : "+average);
            System.out.println("No Grade");
        }
    }
}
