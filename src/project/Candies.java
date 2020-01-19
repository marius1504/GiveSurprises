package project;

import java.util.ArrayList;
import java.util.Random;

public class Candies implements ISurprise{
	private static boolean first = false;
	private int n;
	private String str;
	private static ArrayList<String> candy= new ArrayList();

	public Candies(int n, String str){
		if(first){
			first = true;
			Candies.addCandyTypes();
		}
		this.n = n;
		this.str = str;
	}

	private static void addCandyTypes(){
		candy.add("chocolate");
		candy.add("jelly");
		candy.add("fruits");
		candy.add("with milk cream");
		candy.add("with vanilla cream");
		candy.add("sugarless");
		candy.add("with coconut");
	}
	
	public static Candies generate(){
		candy.clear();
		Candies.addCandyTypes();
	    Random random = new Random();
	    int n1 = random.nextInt(100);
	    int n2 = random.nextInt(candy.size());
	    return new Candies(n1, candy.get(n2));
	}
	
	public void enjoy(){
		System.out.println("Ai primit "+n+" candy de tipul "+str);
	}
}
