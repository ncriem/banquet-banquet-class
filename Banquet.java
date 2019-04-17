import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Banquet {

    ArrayList<String> companies = new ArrayList<>(Arrays.asList("WalMart","Kroger","Amazon","Lowes","BestWestern","KMart","Fusian","Heinz",
            "Gucci","Prada","Nike","Dodge","Maserati","Razor","AMD","Razer"));
    ArrayList<Attendee> attendees = new ArrayList<>();
    ArrayList<Integer> companiescount = new ArrayList<>(companies.size());
    int aIDcounter = 0;

    public void addCompany(String company){
        companies.add(company);
    }

    public void register() {
        if(aIDcounter<100){
            Scanner scan = new Scanner(System.in);
            int company = scan.nextInt();
            if(companiescount.get(company)<10) {
                String first = scan.next();
                String last = scan.next();
                String allergies = scan.nextLine();
                int aID = aIDcounter;
                attendees.add(new Attendee(first, last, company, allergies, aID));
                aIDcounter++;
            }
            else System.out.println("Each Company can only submit 10 attendees");
        }
        else System.out.println("REGISTRATION CLOSED");
    }
}
