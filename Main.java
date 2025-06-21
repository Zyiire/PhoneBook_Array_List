//Write a class named phonebookentry that has feilds for a person's name and phone number. The class should have a construtort
//and appropriate accessor and mutator methods. Then write a program that creates at least five phonebookentry objects and stores
//them in an ArrayList. Use a loop to display the contents of each object in the ArrayList.
import java.util.*;
class MainBook{

public static void main(String [] args){


	ArrayList<PhoneBookArrayList> info= new ArrayList<>();
	info.add(new PhoneBookArrayList("Austin", "732-988-3829"));
	info.add(new PhoneBookArrayList("Tommy", "868-564-2235"));
	info.add(new PhoneBookArrayList("James", "862-621-8842"));
	info.add(new PhoneBookArrayList("Fred", "732-649-9323"));
	info.add(new PhoneBookArrayList("DJ", "615-542-3325"));

	System.out.println("\nPhoneBook");
	System.out.println();
	System.out.printf("%1s%15s\n", "Name", "Number");
	System.out.println();

	for(PhoneBookArrayList book : info){
		System.out.printf("%1s%15s\n", book.getName(), book.getNumber());


	}

}



}