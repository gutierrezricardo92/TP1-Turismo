public class Atraccion {

	private String nombreDeAtraccion;
	private TipoDeAtraccion tipoDeAtraccion;
	private int costoDeAtraccion;
	private double tiempoDeAtraccion;
	private int cupoDeVisitantes;
	
	public Atraccion (String nombreDeAtraccion, TipoDeAtraccion tipoDeAtraccion, double tiempoDeAtraccion, int costoDeAtraccion, int cupoDeVisitantes){
		this.setNombreDeAtraccion(nombreDeAtraccion);
		this.setTipoDeAtraccion(tipoDeAtraccion);
		this.setCostoDeAtraccion(costoDeAtraccion);
		this.setTiempoDeAtraccion(tiempoDeAtraccion);
		this.setCostoDeAtraccion(costoDeAtraccion);
		this.setCupoDeVisitantes(cupoDeVisitantes);
	}

	public String getNombreDeAtraccion() {
		return nombreDeAtraccion;
	}

	public void setNombreDeAtraccion(String nombreDeAtraccion) {
		this.nombreDeAtraccion = nombreDeAtraccion;
	}

	public TipoDeAtraccion getTipoDeAtraccion() {
		return tipoDeAtraccion;
	}

	public void setTipoDeAtraccion(TipoDeAtraccion tipoDeAtraccion) {
		this.tipoDeAtraccion = tipoDeAtraccion;
	}

	public int getCostoDeAtraccion() {
		return costoDeAtraccion;
	}

	public void setCostoDeAtraccion(int costoDeAtraccion) {
		this.costoDeAtraccion = costoDeAtraccion;
	}

	public double getTiempoDeAtraccion() {
		return tiempoDeAtraccion;
	}

	public void setTiempoDeAtraccion(double tiempoDeAtraccion) {
		this.tiempoDeAtraccion = tiempoDeAtraccion;
	}

	public int getCupoDeVisitantes() {
		return cupoDeVisitantes;
	}

	public void setCupoDeVisitantes(int cupoDeVisitantes) {
		this.cupoDeVisitantes = cupoDeVisitantes;
	}
	
}
