import java.util.Scanner;

/**
 * Created by DELL on 25/08/2022.
 */
public class dayofmonth {
    public static void main(String[] args) {
        int num;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        num=input.nextInt();
        if (num==1||num==3||num==5||num==7||num==8||num==10||num==12)
        {
            System.out.println("31 days");
        }
        else if (num==4||num==6||num==9||num==11)
        {
            System.out.println("30 days");
        }
        else if (num==2)
        {
            System.out.println("29 days");
        }
        else
        {
            System.out.println("erorr");
        }




    }
}
