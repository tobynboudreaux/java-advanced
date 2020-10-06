import java.util.Scanner;

public class MyClass {

    static void adminOptions() {
        System.out.println("Admin stuff");
    }

    static void runtime() {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter name: ");
    
        // String input
        String name = myObj.nextLine();
    
        System.out.println("Enter age: ");
    
        // Numerical input
        int age = myObj.nextInt();
    
        System.out.println("Enter salary: ");
    
        double salary = myObj.nextDouble();
    
        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
    
        if (age > 18) {
            System.out.println("Welcome to the site!");
        }
        else {
            System.out.println("You must be at least 18 to access this content!");
        }
    
        if (name.equals("Toby")) {
            System.out.println("What would you like to do?");
            System.out.println("Admin");
            System.out.println("Menu");
            System.out.println("Exit");
    
            if (myObj.nextLine().equals("Admin")) {
                adminOptions();
            } else if (myObj.nextLine().equals("Menu")) {
                System.out.println("Here are your options");
            } else if (myObj.nextLine().equals("Exit")) {
                System.out.println("Goodbye");
            }
        }
        else {
            System.out.println("What would you like to do?");
            System.out.println("Menu");
            System.out.println("Exit");
    
            if (myObj.nextLine().equals("Menu")) {
                System.out.println("Here are your options");
            } else if (myObj.nextLine().equals("Exit")) {
                System.out.println("Goodbye");
            }
        }
    }
    public static void main(String[] args) {
        runtime();
    
    }
}