package ar.edu.unlam.mundial;

import java.util.Objects;

public class Equipo implements Comparable<Equipo> {

	private int id;
	private String nombre;

	public Equipo(int i, String string) {
		this.id = i ;
		this.nombre = string;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return id == other.id;
	}

	@Override
	public int compareTo(Equipo e) {
		
		return this.nombre.compareTo(e.nombre);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
