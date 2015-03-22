import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class ArrayLists{
	public static void main(String[] args){

		ArrayList randomArrayList = new ArrayList(); // Creates an ArrayList - it can store value of any type

		ArrayList<String> names = new ArrayList<String>(); // Creates an ArrayList - it can store String Values only!

		/*
		*	Integer averageJoe = new Integer(2);
		*	names.add(averageJoe); // Evidence to previous comment on ArrayList<String> - compiler will not allow this line!
		*/

		names.add("Jabba!");
		names.add("Trollo");
		names.add(1, "Jackie Chan");

		// A simple check		
		System.out.println("......................................................");
		Integer a = new Integer(1);
		Integer b = new Integer(3);

		System.out.println(a+b); // it's summing up (4)
		System.out.println(a-b); // It's substracted (-2)
		System.out.println(a+b-a*b); // the expression is calculated (1)
		System.out.println(a+b+"COIL"); // first two are added, (4COIL)
		System.out.println("COIL "+a+b); // none of Integers are added (!) they're only sent to stdo (COIL13)
		System.out.println("......................................................");
		//EO Simple check

		for(int i=0; i<names.size(); i++){
			System.out.println(names.get(i));
		}

		names.remove(2); // Remove third element from the names ArrayList
		try{
			System.out.print("\nelement@index_2: "+names.get(2));
		} catch (IndexOutOfBoundsException e){
			System.out.println("\nelement@index_2: There's no element at index 2!");
		} finally {
			System.out.println("Size of array: " + names.size()); // Check size of names ArrayList
			System.out.println("\n\nSigning out...");
		}
		
		

	}
}