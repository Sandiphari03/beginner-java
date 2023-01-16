import java.util.Scanner;

public class practiceQuestion_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" CALCULATE PERCENTAGE ");

        System.out.println("MARKS IN PHYSICS");
        Float A = sc.nextFloat();
     //   System.out.println(A);

        System.out.println("MARKS IN MATH");
        Float B = sc.nextFloat();
     //   System.out.println(B);


        System.out.println("MARKS IN BIO");
        Float C = sc.nextFloat();
   //     System.out.println(C);

        System.out.println("MARKS IN ENGLISH");
        Float D = sc.nextFloat();
    //    System.out.println(D);

        System.out.println("MARKS IN CHEMISTRY");
        Float E = sc.nextFloat();
  //      System.out.println(E);

        System.out.println("TOTAL MARKS OBTAINED ");
        Float sum =(A + B + C + D + E);
        System.out.println(sum);

        System.out.print(" TOTAL PERCENTAGE : ");
        System.out.println(sum/500*100);
    }
}