package ar.edu.unlam.mundial;

import java.util.Comparator;

public class ordenDescendente implements Comparator <Equipo> {

	@Override
	public int compare(Equipo o1, Equipo o2) {
		// TODO Auto-generated method stub
		return o2.getNombre().compareTo(o1.getNombre());
	}

}
