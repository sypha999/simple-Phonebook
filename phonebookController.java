import java.util.Scanner;

public class PhonebookController {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Phonebook phone = new Phonebook();
        int indexController = 0;
        int input;

            starter();
        while (true) {
            input = scan.nextInt();
            if (input == 1) {

                String name = phone.getString("Please enter name: ");
                String number = phone.getInt("Please enter number: ");
                phone.populate(indexController, name, number);
                indexController++;
                System.out.println("\nContact Saved");
                System.out.println("Name: " + name);
                System.out.println("Phone Number: " + number);

                contStarter();
            } else if (input == 2) {
                phone.nameSearch(phone.book);
                contStarter();
            } else if (input == 3) {
                phone.numberSearch(phone.book);
                contStarter();
            } else if (input == 4) {
                System.exit(0);
            } else{
            System.out.println("Invalid input, restarting the program");
            main(null);}
           

        }
    }

        public static void starter ()
        {
            System.out.println("\nWelcome, please input one of the following\n1 To populate phonebook\n2 To search phonebook by name\n3 To search phonebook by number\n4 To quit program\n");

        }

        public static void contStarter ()
        {
            System.out.println("\nInput \n1 To add more contacts to Phone Book\n2 To search phonebook by name\n3 To search phonebook by number\n4 To quit program\n");

        }


}
