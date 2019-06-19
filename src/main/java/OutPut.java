public class OutPut {
    private String numberString = "";

    public String setDrops(int i) {
        if (i == 3) {
            numberString += "Pling";
        } else if (i == 5) {
            numberString += "Plang";
        } else if (i == 7) {
            numberString += "Plong";
        }

        return numberString;
    }

    public void printDrops(int n){
        if(numberString == ""){
            System.out.print(n);
        } else {
            System.out.print(numberString);
        }
    }
}
