package ej1;

import java.util.HashSet;
import java.util.Set;

public class JuegoDeNaipes {
	
	private final Integer LIMITE = 20;
	private Integer puntajeGanador;
	private Integer cantidadJugadores;
	private Set<Jugador> jugadores = new HashSet<Jugador>();
	private Mazo mazo;
	
	public JuegoDeNaipes() {
		
	}
		
	public JuegoDeNaipes(Integer puntajeGanador, Integer cantidadJugadores) {
		this.puntajeGanador = puntajeGanador;
		this.cantidadJugadores = cantidadJugadores;
		this.mazo = new Mazo();
		mazo.barajar();
	}
	
	public void agregar(Jugador jugador) {
		jugadores.add(jugador);
	}

	public Set<Jugador> getJugadores() {
		return jugadores;
	}
	
	public void mezclar() {
		mazo.barajar();
	}
	
	public Naipe jugar() {
		if (mazo.cantidad() == LIMITE) {
			this.mazo = new Mazo();
			mazo.barajar();
		}
		
		Naipe naipe = mazo.getNaipeArriba();
		
		for(Jugador jugador : jugadores) {
			if(jugador.getNaipe().equals(naipe)) {
				jugador.setPuntos(jugador.getPuntos() + 1);
			}
		}
		
		return naipe;
	}
	
	public Boolean tieneGanador() {
		for(Jugador jugador : jugadores) {
			if(this.puntajeGanador == jugador.getPuntos()) {
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}
	
	public Jugador ganador() {
		for(Jugador jugador : jugadores) {
			if(this.puntajeGanador == jugador.getPuntos()) {
				return jugador;
			}
		}
		return null;
	}

}
