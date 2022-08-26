import java.util.Scanner;

/**
 * Created by DELL on 25/08/2022.
 */
public class month {
    public static void main(String[] args) {
        int number;
        String month,spring,summer,fall,winter;
        Scanner input=new Scanner(System.in);
        System.out.println("choose number for month 1_12");
        number=input.nextInt();
        if (number<=12)
        {

        }
        else
        {

            System.out.println("erorr");
        }
        if (number==4 ||number==5||number==6||number==7)
        {
            System.out.println("spring");
        }
        else if (number==6||number==7||number==8||number==9)
        {
            System.out.println("summer");
        }
        else if (number==9||number==10||number==11||number==12)
        {
            System.out.println("fall");

        }
        else if (number==1||number==2||number==3)
        {
            System.out.println("winter");
        }


    }
}
