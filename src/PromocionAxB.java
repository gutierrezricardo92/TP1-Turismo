import java.util.TreeSet;

//La ultima promocion agregada no se cobrara
public class PromocionAxB extends Promociones{

	public PromocionAxB(Atraccion atraccion) {
		super(atraccion);
	}
	
	public PromocionAxB(TreeSet<Atraccion> atracciones) {
		super(atracciones);
	}


	public double getPrecio(){
		return (super.getPrecio() - super.atracciones.last().getCostoDeAtraccion()) ;
	}
	
}
