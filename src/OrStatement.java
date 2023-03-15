public class OrStatement {
    public static void main(String[] args) {
        int number = -11;

        if (number>0 || number%2==0){
            System.out.println("Your number is a positive number OR an even number");
        } else {
            System.out.println("Out of bound");
        }
    }
}
