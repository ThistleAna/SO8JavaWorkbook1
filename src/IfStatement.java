public class IfStatement {
    public static void main(String[] args) {
        int age = -10;
        if (age > 18){
            System.out.println("Access granted! Enjoy your game :)");
        } else if (age < 18 && age > 0){
            System.out.println("Access denied :(");
        } else {
            System.out.println("Wrong input. Only positive number.");
        }



    }
}
