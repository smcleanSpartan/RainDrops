import java.util.Scanner;

public class Converter{

    private OutPut outPut = new OutPut();

    public void Convert(int num){
        int n = num;

        for (int i = 2; i <= Math.abs(n); i++) {
            while (num % i == 0) {
                outPut.setDrops(i);
                num = num/i;
            }
        }

        outPut.printDrops(n);
    }
}
