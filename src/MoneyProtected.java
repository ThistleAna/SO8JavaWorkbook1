public class MoneyProtected {
    public static void main(String[] args) {
        int balance = 70000;

        // use if - else to determine whether the money is protected
        if(balance>0 && balance<85000){
            System.out.println("Your money is protected by our bank as it is less than £85000");
        } else {
            System.out.println("Sadly your balance is above what we can protect");
        }
    }
}
