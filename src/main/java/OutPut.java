public class OutPut {
    String numberString = "";
    public void setDrops(int i) {
        if (i == 3) {
            numberString += "Pling";
        } else if (i == 5) {
            numberString += "Plang";
        } else if (i == 7) {
            numberString += "Plong";
        }
    }

    public void printDrops(int n){
        if(numberString == ""){
            System.out.println(n);
        } else {
            System.out.println(numberString);
        }
    }
}
