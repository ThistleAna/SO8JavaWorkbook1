public class NotStatement {
    public static void main(String[] args) {
        String answer = "Sunny";

        if (!(answer.equals("Rain"))){
            System.out.println("We can take a walk to Snowdonia!");
        } else {
            System.out.println("Better to go back to sleep");
        }

        // extension : use Scanner to get the user answer
    }
}
