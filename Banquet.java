import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Banquet {

    // companies is an arraylist of every company in attendance. their comanyID is their index in the arrayList
    ArrayList<String> companies = new ArrayList<>(Arrays.asList("WalMart", "Kroger", "Amazon", "Lowes", "BestWestern", "KMart", "Fusian", "Heinz",
            "Gucci", "Prada", "Nike", "Dodge", "Maserati", "Razor", "AMD", "Razer"));

    //an arraylistof 100 attendees
    ArrayList<Attendee> attendees = new ArrayList<>();

    //an array that tracks the number of attendees sent by each company
    int[] companiescounter = new int[companies.size()];

    //attendeeID 0-99 incremented by the register method. allows attendees to be found within the 100 attendee arraylist
    int aIDcounter = 0;

    /*overloaded method that with no parameters that allows an individual to submit him or herself.
     * With the parameter of company, a company can submit multiple attendees at once.
     * All variables are
     */

    public void register() {
        // if the number of attendees made is under 100, take input. otherwise quit
        if (aIDcounter < 99) {
            Scanner scan = new Scanner(System.in);
            System.out.println("give company ID");
            int companyID = scan.nextInt();
            int counter = companiescounter[companyID];
            if (counter < 10) {
                System.out.println("Give first name");
                String first = scan.next();
                System.out.println("Give last name");
                String last = scan.next();
                System.out.println("Give allergies");
                String allergies = scan.next();
                int aID = aIDcounter;
                attendees.add(new Attendee(first, last, companyID, allergies, aID));
                companiescounter[companyID]++;
                aIDcounter++;
            } else System.out.println("Each Company can only submit 10 attendees");
        } else System.out.println("REGISTRATION CLOSED");
    }
//Allows a given company to submit multiple attendees at once, sort of
    public void register(int company) {
        if (aIDcounter<99) {
            Scanner scan = new Scanner(System.in);
            System.out.println("give number of applicants");
            int counter = scan.nextInt();
            if (counter + companiescounter[company] <=10) {
                for(int i=0;i<counter;i++) {
                    System.out.println("Enter info for attendee#"+(i+1));
                    System.out.println("Give first name");
                    String first = scan.next();
                    System.out.println("Give last name");
                    String last = scan.next();
                    System.out.println("Give allergies");
                    String allergies = scan.next();
                    int aID = aIDcounter;
                    attendees.add(new Attendee(first, last, company, allergies, aID));
                    companiescounter[company]++;
                    aIDcounter++;
                }
            }else System.out.println("Maximum number of attendees per company is 10");
        }else System.out.println("REGISTRATION CLOSED");
    }


    public static void main(String[] args) {
        Banquet b1 = new Banquet();
        b1.register();
    }
}
