import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int year = 0;

        year = SafeInput.getRangedInt(in, "What is your birth year", 1950, 2010);


        int month = 0;

        month = SafeInput.getRangedInt(in, "What is your birth month", 1, 12);


        int day = 0;

        int high = 0;

        switch(month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                high = 31;
            break;

            case 2:
                high = 29;
            break;

            case 4:
            case 6:
            case 9:
            case 11:
                high = 30;
            break;
        }

        day = SafeInput.getRangedInt(in, "What is your birth day", 1, high);

    }
}
