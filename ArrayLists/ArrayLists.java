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

		for(int i=0; i<names.size(); i++){
			System.out.println(names.get(i));
		}

		names.remove(2); // Remove third element from the names ArrayList
		try{
			System.out.print("\nelement@index_2: "+names.get(2));
		} catch (IndexOutOfBoundsException e){
			System.out.println("\nelement@index_2: There's no element at index 2!");
		} finally {
			System.out.println("\n\nSigning out...");
		}
		
		System.out.println(names.size()); // Check size of names ArrayList

	}
}