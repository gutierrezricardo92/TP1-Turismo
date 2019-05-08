import java.util.Iterator;
import java.util.TreeSet;

public class Promociones {

	protected TreeSet<Atraccion> atracciones = new TreeSet<Atraccion>();
	
	public Promociones(TreeSet<Atraccion> atracciones){
		this.atracciones = atracciones;
	}
	
	public Promociones (Atraccion atraccion){
		atracciones.add(atraccion);
	}
	
	public boolean agregarAtraccion(Atraccion atraccion){
		return atracciones.add(atraccion);
	}
	
	public double getPrecio() {
		Iterator<Atraccion> itr = atracciones.iterator();
		double precio = 0;
		Atraccion aux;
		while(itr.hasNext()){
			aux = itr.next();
			precio += aux.getCostoDeAtraccion();
		}
		
		return precio;
	}
	
	public int getCupo() {
		Iterator<Atraccion> itr = atracciones.iterator();
		int cupo = 0;
		Atraccion aux;
		while(itr.hasNext()){
			aux = itr.next();
			cupo += aux.getCupoDeVisitantes();
		}
		
		return cupo;
	}
	
	public double getTiempo() {
		Iterator<Atraccion> itr = atracciones.iterator();
		double tiempo = 0;
		Atraccion aux;
		while(itr.hasNext()){
			aux = itr.next();
			tiempo += aux.getTiempoDeAtraccion();
		}
		
		return tiempo;
	}
	
	public void ListaDeAtracciones() {
		Iterator<Atraccion> itr = atracciones.iterator();
		Atraccion aux;
		while(itr.hasNext()){
			aux = itr.next();
			System.out.print(aux.toString());
		}
		
	}

}
