import java.util.Scanner;

//calculator for CBSE students to calculate their percentage in borad exams!!


public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Please enter your name below");
        String name = S.nextLine();

        System.out.println("PLease enter your age below");
        int age = S.nextInt();

        System.out.println("Your name is " + name + " and your age is " + age + " it is all saved inside our server now have a happy calculating");

        System.out.print("Please enter your marks in maths : ");
        byte maths = S.nextByte();

        System.out.print("Please enter your marks in science : ");
        byte science  = S.nextByte();

        System.out.print("Please enter your marks in english : ");
        byte english = S.nextByte();

        System.out.print("Please enter your marks in Social Science : ");
        byte socialScience = S.nextByte();

        System.out.print("Please enter your marks in Hindi : ");
        byte hindi = S.nextByte();

        double sum  = maths + english + socialScience + hindi + science;

        System.out.print("What is the total marks of all the five subjects : ");
        double total = S.nextDouble();

        double percentage = (sum/total)*100;

        System.out.println(name + "your percentage in CBSE board exams is " + percentage + "%");
    }
}
