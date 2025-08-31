package CreaCampionato;

import java.util.ArrayList;

public class Campionato {
	
	private static String Nome;
	private static int NumeroSquadre;
	private ArrayList<Squadra> Squadre= new ArrayList<Squadra>();

	public Campionato(String NomeCampionato, int NSquadre, ArrayList<String> SquadreString) {
		setNome(NomeCampionato);
		setNumeroSquadre(NSquadre);
	}

	public static void main(String[] args) {

	}
	
	@Override
	/*
	 * Override del metodo toString per facilitare la stampa dei campi della classi
	 * */
	public String toString() {
		// TODO Auto-generated method stub
		return "\nIl campionato "+getNome()+" è composto da "+getNumeroSquadre()+" squadre\n";
	}
	
	/*
	 *Getter e setter per i campi della classe 
	 * */
	
	public int getNumeroSquadre() {
		return NumeroSquadre;
	}
	
	public static String getNome() {
		return Nome;
	}

	public static void setNumeroSquadre(int numeroSquadre) {
		NumeroSquadre = numeroSquadre;
	}

	public static void setNome(String nome) {
		Nome = nome;
	}
	
	

}
