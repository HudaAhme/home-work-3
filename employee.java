import java.util.Scanner;

/**
 * Created by DELL on 26/08/2022.
 */
public class employee {
    public static void main(String[] args) {
        double salary;
        String name;
        int hours;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the name");
        name = input.nextLine();
        System.out.println("enter the salary");
        salary = input.nextDouble();
        System.out.println("enter how many hour in the week");
        hours = input.nextInt();
        if (hours>=40)
        {
            System.out.println(salary=salary+150);
        }
        else
            System.out.println(salary);

    }

}
