/*
 * Greetings with string reader
 */

public class Greetings2 {
    public static void main(String[] args) {
        EasyReader console = new EasyReader();
        System.out.println("Enter your First Name");
        String firstname = console.readLine();
        System.out.println("Enter your last  Name");
        String lastname = console.readLine();
        System.out.println("Hello " + firstname + " " + lastname);
    }
}
