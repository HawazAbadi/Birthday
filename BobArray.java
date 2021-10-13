import java.util.HashMap;
import java.util.Scanner;

public class BobArray {
    public Integer size() {
         return null;
}
 
public BobObject get(Integer i) {
  return null; }
// creat hash map list of people frineds name and birthday

    public static void main(String[] args) {

        HashMap<String, String> birthdays = new HashMap<>();
        birthdays.put("Roben", "1/27/1999");
        birthdays.put("Rahel", "3/21/1998");
        birthdays.put("Jon", "5/24/1997");
        birthdays.put("Nati", "11/15/1992");
        birthdays.put("Sahra", "3/12/1993");
        birthdays.put("Medi", "6/10/1995");
        birthdays.put("Abi", "12/11/1998");
        birthdays.put("Aman", "10/12/1990");
        birthdays.put("Dni", "9/8/2009");
        birthdays.put("Rey", "2/14/1991");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        if(birthdays.get(name) != null)
            System.out.println(name + " your birth date is: " + birthdays.get(name));
        else
            System.out.println("Birth date not found");
    }
}