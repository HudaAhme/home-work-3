import java.util.Scanner;

/**
 * Created by DELL on 25/08/2022.
 */
public class negative {
    public static void main(String[] args) {
        int number;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        number=input.nextInt();

        if (number>0)
        {
            System.out.println("positive");
        }
        else
        {
            System.out.println("negative");
        }
    }
}
