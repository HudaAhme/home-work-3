import java.util.Scanner;

/**
 * Created by DELL on 25/08/2022.
 */
public class positive {
    public static void main(String[] args) {
        int num;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        num=input.nextInt();


        if (num>0)
        {
            System.out.println("The number is positive");
        }else if (num<0)
        {
            System.out.println("The number is negative");
        }else
            System.out.println("zero");



    }
}
