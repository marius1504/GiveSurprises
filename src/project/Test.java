package project;
import java.util.ArrayList;
import java.util.Random;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BagFactory b = new BagFactory();
		IBag a = b.makeBag("RANDOM");
		a.put(GatherSurprises.gather());
		a.put(GatherSurprises.gather());
		a.put(GatherSurprises.gather());
		a.put(GatherSurprises.gather());
		a.put(GatherSurprises.gather());
		a.put(GatherSurprises.gather());
		a.put(GatherSurprises.gather());
		a.put(GatherSurprises.gather());
		AbstractGiveSurprises c = new GiveSurpriseAndSing("RANDOM", 1);
		System.out.println("Felicitari, cele "+a.size() +" cadouri ale tale, sunt: \n");
		c.put(a);
		c.giveAll();
		c.giveWithPassion();
	}

}
