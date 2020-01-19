package project;
import java.util.ArrayList;

public class MinionToy implements ISurprise{
	private static boolean first = true;
	private String name;
	private static int n = 0;
	private static ArrayList<String> minion = new ArrayList();
	
	public MinionToy(String name){
		this.name = name;
		
		if(first){
			minion.clear();
			addTipuriminion();
		}
	}
	
	private static void addTipuriminion(){
		minion.clear();
		minion.add("dog");
		minion.add("cat");
		minion.add("tiger");
		minion.add("lion");
		minion.add("rhino");
		minion.add("bird");
	}
	
	public static MinionToy generate(){
		addTipuriminion();
		if(n == minion.size()){
			n = 0;
		}
		n++;
		return new MinionToy(minion.get(n-1));
	}
	
	public void enjoy(){
		System.out.println("Ai primit un minion de tipul " + this.name);
	}
}