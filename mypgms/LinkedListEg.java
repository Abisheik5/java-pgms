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

		//To reverse LinkedList

		LinkedList<Integer> llist2 = new LinkedList<>(llist);
		Collections.reverse(llist2);
		System.out.println("The LinkedList after reversing is : "+ llist2);

		//To insert at beginning 
		llist2.addFirst(41);
		llist2.addFirst(45);
		System.out.println("After inserting at begining : "+llist2);

		//To insert at end
		llist2.addLast(9);
		llist2.addLast(10);
		System.out.println("After inserting at end: "+llist2);
		
		//To get the Head Element 
		int head = llist2.getFirst();
		System.out.println("The head element is : "+head);

		//To get Last (tail) Element
		int tail = llist2.getLast();
		System.out.println("The last Element is : "+tail);

		//Cloning a LinkedList (Shallowcopy)
		LinkedList llist3 = new LinkedList();
		llist3 = (LinkedList)llist2.clone();
		System.out.println("The LinkedList llist3 after cloning llist2 is : "+llist3);

		llist3.clear(); //clearing llist3
		
		System.out.println("After clearing LinkedList llist3 : "+llist3);
		
	
		





	}
}