import java.util.Scanner;

public class PhonebookController {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Phonebook phone = new Phonebook();
        int indexController = 0;
        String input;

            starter();
        while (true) {
            input = scan.nextLine();
            if (phone.isNumeric(input)) {
                if (input.equals("1")) {

                    String name = phone.getString("Please enter name: ").toLowerCase();
                    String number = phone.getInt("Please enter number: ");
                    phone.populate(indexController, name, number);
                    indexController++;
                    System.out.println("\nContact Saved");
                    System.out.println("Name: " + name);
                    System.out.println("Phone Number: " + number);

                    contStarter();
                } else if (input.equals("2")) {
                    phone.nameSearch(phone.book);
                    contStarter();
                } else if (input.equals("3")) {
                    phone.numberSearch(phone.book);
                    contStarter();
                } else if (input.equals("4")) {
                    System.exit(0);
                } else {
                    System.out.println("Invalid input, restarting the program.\nAll saved data would be lost");
                    main(null);
                }
            }

            else
            {
                System.out.println("Invalid input, restarting the program.\nAll saved data would be lost");
                main(null);
            }
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
