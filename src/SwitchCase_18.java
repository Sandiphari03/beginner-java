import java.sql.SQLOutput;
import java.util.Scanner;

class SwitchCase_18{

    public static void main(String[] args) {
        int age;

        System.out.println("enter the age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

     /*   if (age > 56) {
        System.out.println("senior citizen");
    }
        else if(age>42){                                            //ladder form
        System.out.println("you are an adult");
    }
        else if(age>25){
            System.out.println("you are young ");
        }
        else{
            System.out.println("you are a baby");
        }
*/

        // SWITCH CASE

        switch(age){
            case 18:
                System.out.println("you are young");
                break;
            case 25:
                    System.out.println("you will get job");
                    break;
            case 50:
                System.out.println("you will get retired");
                break;
            default:
                System.out.println("enjoy your life");
        }


    }
}