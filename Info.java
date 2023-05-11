import java.util.Scanner;
public class Info
{
  public static void main(String[] args) {
    String name;
    String address;
    String car;

    Scanner input = new Scanner(System.in);

    System.out.println("What is your name? ");
    name = input.nextLine();
    System.out.println("What is your current address? ");
    address = input.nextLine();
    System.out.println("What kind of car do you drive? ");
    car = input.nextLine();
    displayInfo(name, address, car);

    }
    public static void displayInfo(String name, String address, String car) {
        
        System.out.println("Your name is " + name);
        System.out.println("Your address is " + address);
        System.out.println("The type of car you drive is a " + car);
    }

}
