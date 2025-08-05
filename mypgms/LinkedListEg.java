import java.util.LinkedList; //class in collections framework 
//Implements List Interface

import java.util.Collections; //has some common methods for several data Structures
//Like reverse() for LinkedList and ArrayList and even Vector


public class LinkedListEg{	

	public static void main (String...args){
		LinkedList<Integer> llist = new LinkedList<>();
		
		llist.add(12);
		llist.add(13);
		llist.add(23);
		llist.add(25);
		llist.add(28);
		llist.add(43);
		
		System.out.println("The LinkedList is : "+ llist);
	}
}