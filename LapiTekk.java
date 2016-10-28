public class LapiTekk extends LisaHind{
	double riie, niit, rhind, nhind;
	public LapiTekk(double riie, double niit, double rhind, double nhind, double koefitsent){
		super(koefitsent);
		this.riie=riie;
		this.niit=niit;
		this.rhind=rhind;
		this.nhind=nhind;
	}
	public double omaHind(){
		return (riie*rhind)+(niit*nhind);
	}
}