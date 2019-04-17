public class Attendee {

String aFirst;
String aLast;
int aCompany = 0;
String aAllergies;
int aID = 0;

public Attendee(String firstName, String lastName, int company, String allergies, int attendeeID) {
	aFirst = firstName;
	aLast = lastName;
	aCompany = company;
	if (allergies) {
		aAllergies = allergies;
	}
	aID = attendeeID;
}

public String returnFirst() {
	return aFirst;
}

public String returnLast() {
	return aLast;
}

public int returnCompany() {
	return aCompany;
}

public String returnAllergies() {
	return aAllergies;
}

public String returnName() {
	return (aFirst + " " + aLast);

}

public int returnAID() {
	return aID;
}
}




