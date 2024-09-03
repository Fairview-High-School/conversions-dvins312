import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Devin Clark
 * @version 8/23/2024
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. Kilojoules to Watt-Hours");
        System.out.println("8. Watt-Hours to Kilojoules");
        System.out.println("9. Robux to USD");
        System.out.println("10. USD to Robux");
        //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
        //You can add even more if you would like.

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        if (selection == 2)
        {
            //add the code to ask the user to enter Fahrenheit and then convert to Celsius
            System.out.println("Enter Fahrenheit: ");
            double fahrenheit = keyboard.nextDouble();
            keyboard.nextLine();
            double celsius = fahrenheit * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees fahrenheit is " + celsius + " degrees Celsius");
        }
        //add more if statements here.

        keyboard.close();
    }
}