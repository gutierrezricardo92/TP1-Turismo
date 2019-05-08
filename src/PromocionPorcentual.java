import java.util.TreeSet;

public class PromocionPorcentual extends Promociones{
	
	private double descuento = 0;

	public PromocionPorcentual(TreeSet<Atraccion> atracciones, int descuento ) {
		super(atracciones);
		if(descuento < 0 || descuento > 100){
			throw new Error("descuento debe ser mayor a 0 y menor a 100");
		}
	}
	
	public double getPrecio(){
		return super.getPrecio() - super.getPrecio()*descuento/100;
	}
	
}
