public class PromocionAbsoluta extends Promociones{
	
	private double descuento = 0;
	
	public PromocionAbsoluta(Atraccion atraccion) {
		super(atraccion);
	}
	
	public PromocionAbsoluta(Atraccion atraccion, double descuento){
		super(atraccion);
		this.descuento = descuento;
	}
	
	public double getPrecio(){
		return super.getPrecio() - descuento;
	}

}
