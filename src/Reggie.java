import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String SSN = "";
        SSN = SafeInput.getRegExString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");

        String mNumber = "";
        mNumber = SafeInput.getRegExString(in, "Enter your M Number", "(M)\\d{8}");

        String menu = "";
        menu = SafeInput.getRegExString(in, "Menu Choice", "[OoSsVvQq]");


    }
}
