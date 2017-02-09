package Vehicle;

public class Vehicle {
	private int cilidrades;
	private int portes;
	private int velocitat_actual;
	private int  marxes = 5;
	private int marxaActual = 0;
	private static final int velocitat_maxima = 120;
	public int getCilidrades() {
		return cilidrades;
	}
	public void setCilidrades(int cilidrades) {
		this.cilidrades = cilidrades;
	}
	public int getPortes() {
		return portes;
	}
	public void setPortes(int portes) {
		this.portes = portes;
	}
	public int getVelocitat_actual() {
		return velocitat_actual;
	}
	public void setVelocitat_actual(int velocitat_actual) {
		this.velocitat_actual = velocitat_actual;
	}

	public void accelerar(){
		if(velocitat_actual < 120){
			velocitat_actual +=10;	
		}
	}
	public void decelerar(){
		if(velocitat_actual >= 10){
			velocitat_actual -=10;	
		}
	}
	
	public void pujarMarcha(){
		System.out.println("Sube");
	}
	public void baixarMarcha(){
		System.out.println("Baja");
	}
}
