import java.util.Scanner;

/**
 * Created by DELL on 25/08/2022.
 */
public class order {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        num1 = input.nextInt();
        System.out.println("enter seconed number");
        num2 = input.nextInt();
        System.out.println("enter thired number");
        num3 = input.nextInt();

       if ((num1>num2)&(num1>num3)&(num2>num3))
       {
           System.out.println("decreaing");
       }
       else if ((num1<num2)&(num1<num3)&(num2<num3))
       {
           System.out.println("increasing");
       }

       else
       {
           System.out.println("enither");
       }






    }
}
