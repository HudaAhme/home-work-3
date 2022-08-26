import java.util.Scanner;

/**
 * Created by DELL on 26/08/2022.
 */
public class num {
    public static void main(String[] args) {
        long number;
        Scanner input=new Scanner(System.in);
        System.out.println("entr numbers");
        number=input.nextLong();

        if (number<=10||number<=100)
        {
            if (number<0)
                System.out.println(number*-1);

        }
        else
            System.out.println("erorr");

    }
}
