package project;
import java.util.Random;
import java.util.ArrayList;

public class FortuneCookie implements ISurprise{
	private static boolean first = true;
	private static ArrayList<FortuneCookie> fortune= new ArrayList();

	private String mesaj;
	public FortuneCookie(String mesaj){
		this.mesaj=mesaj;
	}
	public void enjoy(){
		System.out.println("Mesajul din Fortune cookie este: " + mesaj);
	}
	static {
		fortune.add(new FortuneCookie("Bine faci, bine gasesti."));
		fortune.add(new FortuneCookie("Calul de dar nu se cauta la dinti."));
		fortune.add(new FortuneCookie("Calatorului îi sade bine cu drumul."));
		fortune.add(new FortuneCookie("Cine râde la urma râde mai bine."));
		fortune.add(new FortuneCookie("Cum îti asterni asa dormi."));
		
		fortune.add(new FortuneCookie("Graba strica treaba."));
		fortune.add(new FortuneCookie("Haina nu îl face pe om."));
		fortune.add(new FortuneCookie("Încet, încet, departe ajungi."));
		fortune.add(new FortuneCookie("Fiecare matura intai inaintea portii lui."));
		fortune.add(new FortuneCookie("La pomul laudat sa nu te duci cu sacul."));
		
		fortune.add(new FortuneCookie("Fiecare oaie isi duce lana ei"));
		fortune.add(new FortuneCookie("Lucrul, odata început, e pe jumatate facut."));
		fortune.add(new FortuneCookie("Meseria e bratara de aur."));
		fortune.add(new FortuneCookie("Nemultumitului i se ia darul."));
		fortune.add(new FortuneCookie("Fiecare este stapan pe capul lui."));
		
		fortune.add(new FortuneCookie("Fiecare trage acolo unde cunoaste. "));
		fortune.add(new FortuneCookie("Prietenul la nevoie se cunoaste."));
		fortune.add(new FortuneCookie("Rabdarea trece marea."));
		fortune.add(new FortuneCookie("si tacerea e un raspuns."));
		fortune.add(new FortuneCookie("Unde-s multi, puterea creste."));		
	}

	
	
	public static FortuneCookie generate(){
		new FortuneCookie("");
	    Random random = new Random();	    
	    int n = random.nextInt(fortune.size());
	    return fortune.get(n);
	}
}

