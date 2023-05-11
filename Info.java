import java.util.Scanner;
public class Info
{
  public static void main(String[] args) {
    String name;
    String address;

    Scanner input = new Scanner(System.in);

    System.out.println("What is your name? ");
    name = input.nextLine();
    System.out.println("What is your current address? ");
    address = input.nextLine();
    displayInfo(name, address);

    }
    public static void displayInfo(String name, String address) {
        
        System.out.println("Your name is " + name);
        System.out.println("Your address is " + address);
    }

}
