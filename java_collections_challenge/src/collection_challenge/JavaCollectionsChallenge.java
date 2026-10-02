package collection_challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class JavaCollectionsChallenge {

	public static void main(String[] args) {
		
		
		//*************************Arraylist*********************************
		ArrayList<String> books=new ArrayList<>();
		
		books.add("Java Basics");
		books.add("OOp in Practice");
		books.add("Spring Boot");
		books.add("Hibernate");
		
		System.out.println("========ARRAYLIST============");
		System.out.println("Books");
		System.out.println(books);
		if(books.contains("Java  Basics")) {
			System.out.println("java Basics is available.");
			
		}
		books.set(2, "Advaced spring boot");
		books.remove("Hibernate");
		System.out.println("After removal.");
		System.out.println(books);
		
		System.out.println("Iterating:");
		for(String book: books) {
			System.out.println(book);
			
		}

		
		//*****************************Hashmap**********************************
		
		HashMap<Integer, String> students = new HashMap<>();
		students.put(101,"Amit");
		students.put(102, "Neha");
		students.put(103, "Rahul");
		
		System.out.println("\n=====Hashmap============");
		System.out.println(students);
		System.out.println(students.get(102));
		students.put(102, "priya");
		System.out.println("After update.");
		System.out.println(students);
		
		if (students.containsKey(103)) {
			System.out.println("Student ID 103 exists.");
		}
		
		System.out.println("Iterating.");
		
		for(Integer id:students.keySet()) {
			System.out.println(id+":"+students.get(id));
		}
		
		
		
		//************************************Queue*******************************
		
		Queue<String> queue= new LinkedList<>();
		
		queue.add("Customer1");
		queue.add("Customer2");
		queue.add("Customer3");
		
		
		System.out.println("\n==========Queue==========");
		System.out.println("Queue:");
		System.out.println(queue);
		
		System.out.println("First Customer:");
		System.out.println(queue.peek());
		
		System.out.println("Serving:");
		System.out.println(queue.remove());
		
		System.out.println("Remaining queue: ");
		System.out.println(queue);
	}

	
	
	
	

}
