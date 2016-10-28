public class Kindad extends LisaHind{
	double kogus;
	double hind;
	public Kindad(double kogus, double hind, double lisamaks){
		super(lisamaks);
		this.kogus=kogus;
		this.hind=hind;
	}
	public double omaHind(){
		return kogus*hind;
	}
	
}

/*100g lõnga 1 paar palmikutega kindaid (DROPS FABEL 50 g/205)*/