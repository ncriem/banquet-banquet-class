import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Banquet {

    // companies is an arraylist of every company in attendance. their comanyID is their index in the arrayList
    ArrayList<String> companies = new ArrayList<>(Arrays.asList("WalMart","Kroger","Amazon","Lowes","BestWestern","KMart","Fusian","Heinz",
            "Gucci","Prada","Nike","Dodge","Maserati","Razor","AMD","Razer"));

    //an arraylistof 100 attendees
    ArrayList<Attendee> attendees = new ArrayList<>();

    //an arraylist that tracks the number of attendees sent by each company
    ArrayList<Integer> companiescount = new ArrayList<>(companies.size());

    //attendeeID 0-99 incremented by the register method
    int aIDcounter = 0;

/*overloaded method that with no parameters that allows an individual to submit him or herself.
* With the parameter of company, a company can submit multiple attendees at once.
* All variables are
 */

    public void register() {
        // if the number of attendees made is under 100, take input. otherwise quit
        if(aIDcounter<100){
            Scanner scan = new Scanner(System.in);
            int company = scan.nextInt();
            int counter = companiescount.get(company);
            if(counter<10) {
                String first = scan.next();
                String last = scan.next();
                String allergies = scan.nextLine();
                int aID = aIDcounter;
                attendees.add(new Attendee(first, last, company, allergies, aID));
                companiescount.set(company,counter+1);
                aIDcounter++;
            }
            else System.out.println("Each Company can only submit 10 attendees");
        }
        else System.out.println("REGISTRATION CLOSED");
    }
}
