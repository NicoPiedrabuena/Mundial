package ar.edu.unlam.mundial;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Mundial {

	private String nombre;
	private Set<Equipo> equipos;
	private List<AsignacionEquipoGrupo> asignacionEquipoGrupo;

	public Mundial(String nombre) {
		this.nombre = nombre;
		equipos = new HashSet<Equipo>(); 
		this.asignacionEquipoGrupo = new ArrayList<AsignacionEquipoGrupo>();
	}

	public boolean agregarEquipo(Equipo arg) {
		this.equipos.add(arg);
		return true;
	}

	public Boolean agregarAsignacionEquipoGrupo(AsignacionEquipoGrupo asignacion) {
		Boolean sePudoAgregar = false;
		if(buscarEquipoAsignacion(asignacion) == null) {
		this.asignacionEquipoGrupo.add(asignacion);
		sePudoAgregar = true;
		
	}
		return sePudoAgregar;
}

	private Equipo buscarEquipoAsignacion(AsignacionEquipoGrupo asignacion) {
		for (AsignacionEquipoGrupo asignacionEquipoGrupo2 : asignacionEquipoGrupo) {
			if(asignacionEquipoGrupo2.getEquipo().equals(asignacion.getEquipo())) {
				return asignacionEquipoGrupo2.getEquipo();
				}
			}
		
		return null;
	}

	public TreeSet<Equipo> obtenerEquipoDeUnGrupo(String id) {
		TreeSet<Equipo> equipos = new TreeSet<>();
		for (AsignacionEquipoGrupo asignacion : this.asignacionEquipoGrupo) {
			if(asignacion.getId().equals(id)) {
				equipos.add(asignacion.getEquipo());
			}
		}
		return equipos;
	}

	public TreeSet<Equipo> obtenerEquipoDeUnGrupoNombreDescendente(String id) {
		TreeSet<Equipo> equipos = new TreeSet<>(new ordenDescendente());
		for (AsignacionEquipoGrupo asignacion : this.asignacionEquipoGrupo) {
			if(asignacion.getId().equals(id)) {
				equipos.add(asignacion.getEquipo());
			}
		}
		return equipos;
	}

	public TreeSet<AsignacionEquipoGrupo> obtenerAsignacionPorGrupoOrdenadaPorId() {
		TreeSet<AsignacionEquipoGrupo> ordenada = new TreeSet<>();
		 ordenada.addAll(asignacionEquipoGrupo);
		return ordenada;
	}

	
}
