package ar.edu.unlam.mundial;

import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.After;
import org.junit.Test;

public class testMundial {

	@Test
	public void queSePuedaCargarUnEquipoAUnMundial() {
		String nombre = "qatar";
		Mundial qatar  = new Mundial(nombre);
		Equipo arg = new Equipo(1,"Argentina");
		assertTrue(qatar.agregarEquipo(arg));
	}
	@Test
	public void queSePuedaFormarUnGrupoAlMundial() {
		String nombre = "qatar";
		Mundial qatar  = new Mundial(nombre);
		Equipo arg = new Equipo(1,"Argentina");
		Equipo arabia= new Equipo(2,"arabia");
		Equipo mexico= new Equipo(3,"mexico");
		Equipo polonia= new Equipo(4,"polonia");
		qatar.agregarEquipo(arg);
		qatar.agregarEquipo(arabia);
		qatar.agregarEquipo(mexico);
		qatar.agregarEquipo(polonia);
		
		String id = "c";
		
		
		AsignacionEquipoGrupo asignacionArg = new AsignacionEquipoGrupo(id,arg);
		assertTrue(qatar.agregarAsignacionEquipoGrupo(asignacionArg));
	
	}
	@Test
	public void queSeNoPuedaAgregarUnMismoGrupoADosGruposDistintosAlMundial() {
		String nombre = "qatar";
		Mundial qatar  = new Mundial(nombre);
		Equipo arg = new Equipo(1,"Argentina");
		Equipo arabia= new Equipo(2,"arabia");
		Equipo mexico= new Equipo(3,"mexico");
		Equipo polonia= new Equipo(4,"polonia");
		qatar.agregarEquipo(arg);
		qatar.agregarEquipo(arabia);
		qatar.agregarEquipo(mexico);
		qatar.agregarEquipo(polonia);
		
		String id = "c";
		
		
		AsignacionEquipoGrupo asignacionArg = new AsignacionEquipoGrupo(id,arg);
		assertTrue(qatar.agregarAsignacionEquipoGrupo(asignacionArg));
		AsignacionEquipoGrupo asignacionArg2 = new AsignacionEquipoGrupo("d",arg);
		assertFalse(qatar.agregarAsignacionEquipoGrupo(asignacionArg));
	
	}
	@Test
	public void queSePuedaobtenerUnaListaDeUnGrupoDeUnGRupoOrdenadaPorNombreDeEquipoAscendente() {
		String nombre = "qatar";
		Mundial qatar  = new Mundial(nombre);
		Equipo arg = new Equipo(1,"Argentina");
		Equipo arabia= new Equipo(2,"Arabia");
		Equipo mexico= new Equipo(3,"Mexico");
		Equipo polonia= new Equipo(4,"Polonia");
		qatar.agregarEquipo(arg);
		qatar.agregarEquipo(arabia);
		qatar.agregarEquipo(mexico);
		qatar.agregarEquipo(polonia);
		
		String id = "c";
		
		
		AsignacionEquipoGrupo asignacionArg = new AsignacionEquipoGrupo(id,arg);
		AsignacionEquipoGrupo asignacionMex = new AsignacionEquipoGrupo(id,mexico);
		AsignacionEquipoGrupo asignacionAra = new AsignacionEquipoGrupo(id,arabia);
		AsignacionEquipoGrupo asignacionPol = new AsignacionEquipoGrupo(id,polonia);
		
		qatar.agregarAsignacionEquipoGrupo(asignacionArg);
		qatar.agregarAsignacionEquipoGrupo(asignacionMex);
		qatar.agregarAsignacionEquipoGrupo(asignacionAra);
		qatar.agregarAsignacionEquipoGrupo(asignacionPol);
		
		TreeSet<Equipo> listaObtenida = qatar.obtenerEquipoDeUnGrupo(id);
		assertEquals(arabia,listaObtenida.first());
		assertEquals(polonia,listaObtenida.last());
	}
	@Test
	public void queSePuedaobtenerUnaListaDeUnGrupoDeUnGRupoOrdenadaPorNombreDeEquipoDescendente() {
		String nombre = "qatar";
		Mundial qatar  = new Mundial(nombre);
		Equipo arg = new Equipo(1,"Argentina");
		Equipo arabia= new Equipo(2,"Arabia");
		Equipo mexico= new Equipo(3,"Mexico");
		Equipo polonia= new Equipo(4,"Polonia");
		qatar.agregarEquipo(arg);
		qatar.agregarEquipo(arabia);
		qatar.agregarEquipo(mexico);
		qatar.agregarEquipo(polonia);
		
		String id = "c";
		
		
		AsignacionEquipoGrupo asignacionArg = new AsignacionEquipoGrupo(id,arg);
		AsignacionEquipoGrupo asignacionMex = new AsignacionEquipoGrupo(id,mexico);
		AsignacionEquipoGrupo asignacionAra = new AsignacionEquipoGrupo(id,arabia);
		AsignacionEquipoGrupo asignacionPol = new AsignacionEquipoGrupo(id,polonia);
		
		qatar.agregarAsignacionEquipoGrupo(asignacionArg);
		qatar.agregarAsignacionEquipoGrupo(asignacionMex);
		qatar.agregarAsignacionEquipoGrupo(asignacionAra);
		qatar.agregarAsignacionEquipoGrupo(asignacionPol);
		
		TreeSet<Equipo> listaObtenidaDescendente = qatar.obtenerEquipoDeUnGrupoNombreDescendente(id);
		assertEquals(polonia,listaObtenidaDescendente.first());
		assertEquals(arabia,listaObtenidaDescendente.last());
	}
	@Test
	public void queSePuedaobtenerUnaListaDeAsignacionDeEquipoOrdenadaPorId() {
		String nombre = "qatar";
		Mundial qatar  = new Mundial(nombre);
		Equipo arg = new Equipo(1,"Argentina");
		Equipo arabia= new Equipo(2,"Arabia");
		Equipo mexico= new Equipo(3,"Mexico");
		Equipo polonia= new Equipo(4,"Polonia");
		qatar.agregarEquipo(arg);
		qatar.agregarEquipo(arabia);
		qatar.agregarEquipo(mexico);
		qatar.agregarEquipo(polonia);
		
		String id = "c";
		
		
		AsignacionEquipoGrupo asignacionArg = new AsignacionEquipoGrupo(id,arg);
		AsignacionEquipoGrupo asignacionMex = new AsignacionEquipoGrupo(id,mexico);
		AsignacionEquipoGrupo asignacionAra = new AsignacionEquipoGrupo(id,arabia);
		AsignacionEquipoGrupo asignacionPol = new AsignacionEquipoGrupo(id,polonia);
		
		qatar.agregarAsignacionEquipoGrupo(asignacionArg);
		qatar.agregarAsignacionEquipoGrupo(asignacionMex);
		qatar.agregarAsignacionEquipoGrupo(asignacionAra);
		qatar.agregarAsignacionEquipoGrupo(asignacionPol);
		String id2="a";
		Equipo qat = new Equipo(5,"Qatar");
		Equipo ecuador= new Equipo(6,"Ecuadro");
		
		AsignacionEquipoGrupo asignacionQat = new AsignacionEquipoGrupo(id2,qat);
		AsignacionEquipoGrupo asignacionEcu = new AsignacionEquipoGrupo(id2,ecuador);
		qatar.agregarAsignacionEquipoGrupo(asignacionQat);
		qatar.agregarAsignacionEquipoGrupo(asignacionEcu);
		
		
		TreeSet<AsignacionEquipoGrupo> listaObtenida = qatar.obtenerAsignacionPorGrupoOrdenadaPorId();
		
	}
}
