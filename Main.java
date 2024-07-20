import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt(), c;
        String d = "";
        
        while (a != 0)
        {
            c = a % b;

            if (c <= 9)
                d += (char)(c + 48);

            else
                d += (char)(c + 55);
                
            a /= b;
        }

        for (int i = d.length() - 1; i >= 0; i--)
        {
            System.out.print(d.charAt(i));
        }
    }
}