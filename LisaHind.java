public abstract class LisaHind{
	double koefitsent;
	public LisaHind(double uusHind){
		koefitsent=uusHind;
	}
	public abstract double omaHind();
	public double MyygiHind(){
		return omaHind()*koefitsent;
	}
}