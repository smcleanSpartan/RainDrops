import java.util.Scanner;

public class Converter{
    Scanner input = new Scanner(System.in);
    OutPut outPut = new OutPut();

    int num;
    boolean isIt = true;

    Converter() {
        do {
            try {
                System.out.println("Please enter a valid number : ");
                num = input.nextInt();
                Convert(num);
                isIt = false;
            } catch (Exception e) {
                System.out.println("Try again \n Please enter a valid number : ");
            }
        } while (isIt);
        input.close();
    }

    public void Convert(int num){
        int n = num;
        for (int i = 2; i < n; i++) {
            while (num % i == 0) {
                outPut.setDrops(i);
                num = num / i;
            }
        }

        outPut.printDrops(num);
    }
}
