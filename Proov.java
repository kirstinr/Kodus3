import java.util.*;
public class Proov{
	public static void main(String[] arg){
		Kindad k1=new Kindad(2, 3, 1.5);
		System.out.println(k1.MyygiHind());
		List<LisaHind> kasitoo=new ArrayList<LisaHind>();
		kasitoo.add(k1);
		kasitoo.add(new LapiTekk(3, 4, 5, 1.13, 1.5));
		for(LisaHind l: kasitoo){
			System.out.println(l.MyygiHind());
		}
	}
}