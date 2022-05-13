import java.util.Scanner;

public class Phonebook {


    //creating a array to store contacts with maximum length of 200 contacts
    String[][] book = new String[200][2];
    Scanner scan = new Scanner(System.in);

    public static boolean isAlpha(String s)
    {
        if (s == null) {
            return false;
        }

        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
                return false;
            }
        }
        return true;
    }



    public static boolean isNumeric(String s)
    {
        if (s == null) {
            return false;
        }

        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }


    public String getString (String message)
    {
        System.out.print(message);
        String input = scan.nextLine();

        if (!isAlpha(input))
        {
            System.out.println("wrong input motherfucker, names should contain letters only");
            getString(message);
        }

        return input;

    }


    public String getInt (String message)
    {
        System.out.print(message);
        String input=scan.nextLine();

        if (!isNumeric(input) || input.length()!=11)
        {
            //we are assuming this is not a real phonebook
            System.out.println("wrong input motherfucker, input an eleven digit number");
            getInt(message);
        }
        return input;
    }

    public void populate(int index,String name,String number)
    {
        book[index][0]=name;
        book[index][1]=number;
    }

    public void nameSearch(String arr[][])
    {
        int valueIndex=-1;
        System.out.println("Please enter name: ");
        String value=scan.nextLine();
        for (int i=0; i<arr.length; i++)
        {
            if (value.equals(arr[i][0]))
            {
                valueIndex=i;
            }
        }

        if(valueIndex==-1)
        {
            System.out.println("Name not found, record doesn't exist."+arr[0][0]);
        }

        else
        {
            System.out.println("Contact found");
            System.out.println("name: "+arr[valueIndex][0]+" number: "+arr[valueIndex][1]);
        }

    }


    public void numberSearch(String arr[][])
    {
        int valueIndex=-1;
        System.out.println("Please enter number: ");
        String value=scan.nextLine();

        for (int i=0; i<arr.length; i++)
        {
            if (value.equals(arr[i][1]))
            {
                valueIndex=i;
            }
        }

        if(valueIndex==-1)
        {
            System.out.println("Number not found, record doesn't exist.");
        }

        else
        {
            System.out.println("Contact found");
            System.out.println("name: "+arr[valueIndex][0]+" number: "+arr[valueIndex][1]);
        }
    }

}
