import java.util.Scanner;

public class RainDrop {
    public static void main(String[] args) {
        Converter con = new Converter();

        boolean isIt = true;
        System.out.println("Please enter a number : ");

        do {
            try {
                Scanner input = new Scanner(System.in);
                int num = input.nextInt();
                con.Convert(num);
                isIt = false;
                input.close();
            } catch (Exception e) {
                System.out.println("Try again \nPlease enter a number : ");
            }
        } while (isIt);

    }
}
