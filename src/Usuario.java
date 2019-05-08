import java.util.TreeSet;

public class Usuario {

	private String username;
	private TipoDeAtraccion preference;
	private int money;
	private double time;
	private TreeSet<Atraccion> atracciones = new TreeSet<Atraccion>();

	public Usuario(String username, Double time, int money,
			TipoDeAtraccion preference) { // Falta excepción
		if (time < 0 || money <= 0) {
			throw new Error("El dinero y tiempo deben ser positivo");
		}
		this.time = time;
		this.money = money;
		this.preference = preference;
		this.username = username;
	}

	public void agregarAtraccion(Atraccion atraccion) {
		atracciones.add(atraccion);
	}

	public String getNombreDelUsuario() {
		return username;
	}

	public void setNombreDelUsuario(String nombreDelUsuario) {
		this.username = nombreDelUsuario;
	}

	public TipoDeAtraccion getPreferenciaDelUsuario() {
		return preference;
	}

	public void setPreferenciaDelUsuario(TipoDeAtraccion preferenciaDelUsuario) {
		this.preference = preferenciaDelUsuario;
	}

	public int getDineroDisponible() {
		return money;
	}

	public void setDineroDisponible(int dineroDisponible) {
		if (dineroDisponible <= 0) {
			throw new Error("Ingrese un número mayor a 0");
		}
		this.money = dineroDisponible;
	}

	public double getTiempoDisponible() {
		return time;
	}

	public void setTiempoDisponible(double tiempoDisponible) {
		if (tiempoDisponible < 0) {
			throw new Error("El tiempo debe ser positivo");
		}
		this.time = tiempoDisponible;
	}
}
