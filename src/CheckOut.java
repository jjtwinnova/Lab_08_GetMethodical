import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double total = 0;
        double price = 0;

            price = SafeInput.getRangedDouble(in, "Price of item", .5, 9.99);

            total += price;


        while(SafeInput.getYNConfirm(in, "Would you like to continue? Enter Y or N: ") == true)
        {
            price = SafeInput.getRangedDouble(in, "Price of item", .5, 9.99);

            total += price;
        }

        System.out.print("Your total is: "+total);


    }
}
