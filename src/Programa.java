import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Programa {

    private ArrayList<Usuario> usuarios;
    private ArrayList<Atraccion> atracciones;
    private ArrayList<Promociones> promociones;

    public Programa() {
        usuarios = new ArrayList<Usuario>();
        atracciones = new ArrayList<Atraccion>();
        promociones = new ArrayList<Promociones>();
    }
    /**
     * @param Se debe pasar el nombre del archivo
     * Dentro del archivo los se debe usar: nombre usuario, tiempo disponible, dinero disponible, tipo de preferencia.
     * Todo en una misma linea.
    */
    public void agregarUsuarios (String nombreArchivo) {
        Scanner reader = new Scanner(System.in);
        System.out.println(" FILE: "  + nombreArchivo);
        try{
            FileReader archivo =  new FileReader(nombreArchivo);
            BufferedReader lector = new BufferedReader(archivo);

            String username = reader.next();
            Double setTime = reader.nextDouble();
            int setMoney = reader.nextInt();
            TipoDeAtraccion preference=null;
            int tipo = reader.nextInt();
            switch(tipo) {
            case 1:
                preference=TipoDeAtraccion.AVENTURA;
                break;
            case 2:
                preference=TipoDeAtraccion.GASTRONOMIA;
                break;
            case 3:
                preference=TipoDeAtraccion.PAISAJE;
                break;
            case 4:
                preference=TipoDeAtraccion.TERROR;
                break;
            }
            reader.next();
            Usuario nuevoUsuario = new Usuario(username, setTime, setMoney, preference);
            if (lector !=  null ) {
                lector.close();
            }
        } catch (Exception AlgoAndaMalConElArchivo) {
            System.out.println(AlgoAndaMalConElArchivo);
        }
    }
	
	public void agregarAtracciones (String nombreArchivo) {
        System.out.println(" FILE: "  + nombreArchivo);
        
        /* Reformular */
        try{
            FileReader archivo =  new FileReader(nombreArchivo);
            BufferedReader lector = new BufferedReader(archivo);
            String oneLine = lector.readLine();
            StringTokenizer st = new StringTokenizer(oneLine);
            String separador = ",";
            while (st.hasMoreTokens()) {
                Usuario usuarioNuevo = new Usuario(user, null, 0, null);
                usuarioNuevo.setNombreDelUsuario(st.nextToken(separador));
                String tiempoDisponibleEnString = st.nextToken(separador);
                double tiempoDisponibleEnDouble = Double.parseDouble(tiempoDisponibleEnString);
                usuarioNuevo.setTiempoDisponible(tiempoDisponibleEnDouble);
                String dineroDisponibleEnString = st.nextToken(separador);
                int dineroDisponibleEnInt = Integer.parseInt(dineroDisponibleEnString);
                usuarioNuevo.setDineroDisponible(dineroDisponibleEnInt);
                usuarioNuevo.setPreferenciaDelUsuario(st.nextToken(separador));
            }
            if (lector !=  null ) {
                lector.close();
            }
        } catch (Exception AlgoAndaMalConElArchivo) {
            System.out.println(AlgoAndaMalConElArchivo);
        }
    }


}