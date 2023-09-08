package ej1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Mazo {
	
	private List<Naipe> naipes;

	public Mazo() {
		this.naipes = new ArrayList<Naipe>();
		inicializar();
	}
	
	public List<Naipe> getNaipes() {
		return naipes;
	}

	private void inicializar() {		
		for(int i = 1; i <= 12; i++) {
			naipes.add(new Naipe(i, Palo.ORO));
			naipes.add(new Naipe(i, Palo.COPA));
			naipes.add(new Naipe(i, Palo.BASTO));
			naipes.add(new Naipe(i, Palo.ESPADA));
		}		
	}
	
	public void barajar() {
		Collections.shuffle(naipes);
	}
	
	public Naipe getNaipeArriba() {
		if(naipes.isEmpty())
			return null;
		else
			return naipes.remove(0);	
	}
	
	public Naipe getNaipeAbajo() {
		if(naipes.isEmpty())
			return null;
		else
			return naipes.remove(naipes.size()-1);		
	}

	@Override
	public String toString() {
		
		String resultado = "";
		
		for(Naipe n : this.naipes) {
			resultado += n + "\n";
		}
		
		return resultado;
	}
	
	public void cortar() {
		
	}
	
	public Integer cantidad() {
		return naipes.size();
	}
	
	public void sacarCopas() {
	/*	for(Naipe naipe : naipes) {
			if(naipe.getPalo().name().equals(Palo.COPA.name())) {
				naipes.remove(naipe);
			}
		}
	
		//int length = naipes.size();
		for(int i = 0; i < naipes.size(); i++) {
			Naipe naipe = naipes.get(i);
			if(naipe.getPalo().name().equals(Palo.COPA.name())) {
				naipes.remove(naipe);
				//length = naipes.size();
			}
		}
	*/	
		Iterator<Naipe> iterator = naipes.iterator();
		while(iterator.hasNext()) {
			Naipe naipe = iterator.next();
			if(naipe.getPalo() == Palo.COPA) {
				iterator.remove();
			}
		}
		
		
		
		
	}
	

}
