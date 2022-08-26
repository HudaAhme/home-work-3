import java.util.Scanner;

/**
 * Created by DELL on 25/08/2022.
 */
public class placethenum {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner input=new Scanner(System.in);
        System.out.println("enter first number");
        num1=input.nextInt();
        System.out.println("enter seconed number");
        num2=input.nextInt();
        System.out.println("enter thired number");
        num3=input.nextInt();

        if (num1==num2)
        {
            System.out.println("all the same number ");
        }else
            System.out.println("neither");

    }
}
