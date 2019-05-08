import org.junit.jupiter.api.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class ProgramaTest {


	@Test
	public void testCastStringToEnumAventura() {
		Usuario usuario = new Usuario();
		String preferencia = "AVENTURA";
		usuario.setPreferenciaDelUsuario(preferencia);
		Assert.assertEquals(TipoDeAtraccion.AVENTURA, usuario.getPreferenciaDelUsuario());
	}


	@Test
	public void testCastStringToEnumTerror() {
		Usuario usuario = new Usuario();
		String preferencia = "TERROR";
		usuario.setPreferenciaDelUsuario(preferencia);
		Assert.assertEquals(TipoDeAtraccion.TERROR, usuario.getPreferenciaDelUsuario());
	}
	

	@Test
	public void testCastStringToEnumNotEquals() {
		Usuario usuario = new Usuario();
		String preferencia = "AVENTURA";
		usuario.setPreferenciaDelUsuario(preferencia);
		Assert.assertNotSame(TipoDeAtraccion.TERROR, usuario.getPreferenciaDelUsuario());
	}
}
