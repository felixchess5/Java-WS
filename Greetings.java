/*
 * This program expects two command line arguments -- First Name and Last Name 
 */

public class Greetings {
    public static void main(String[] args) {
        String FirstName = args[0];
        String LastName = args[1];

        System.out.println("Hello " + FirstName + " " + LastName);
    }
}