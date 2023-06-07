public class ReverseInteger
{
    public static void main(String[] args)
    {
        int number = 123466;
        int reverse = 0;
        while(number != 0)
        {
            reverse = reverse * 10 + number % 10;
            number = number/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}
