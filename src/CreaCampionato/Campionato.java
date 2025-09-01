package CreaCampionato;

import java.util.ArrayList;

public class Campionato {
	
	private static String Nome;
	private static int NumeroSquadre;
	private static ArrayList<Squadra> Squadre= new ArrayList<Squadra>();

	public Campionato(String NomeCampionato, int NSquadre, ArrayList<String> SquadreString) {
		setNome(NomeCampionato);
		setNumeroSquadre(NSquadre);
		Addsquadre(SquadreString);
	}
	
	@Override
	/*
	 * Override del metodo toString per facilitare la stampa dei campi della classi
	 * */
	public String toString() {
		// TODO Auto-generated method stub
		String DaStampare="\n<----------------------------------------------------------------->\nIl campionato "+getNome()+" è composto da "+getNumeroSquadre()+" squadre\nLe squadre sono:\n";
		for (int i = 0; i < Squadre.size(); i++) {
			DaStampare=DaStampare+">"+Squadre.get(i).getNome()+"\n";
		}
		DaStampare=DaStampare+"<----------------------------------------------------------------->\n";
		return DaStampare;
	}
	
	/*
	 *Getter e setter per i campi della classe 
	 * */
	
	public int getNumeroSquadre() {
		return NumeroSquadre;
	}
	
	public String getNome() {
		return Nome;
	}

	public void setNumeroSquadre(int numeroSquadre) {
		NumeroSquadre = numeroSquadre;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
	
	public void Addsquadre(ArrayList<String> NomSquadre) {
		
		for (int i = 0; i < NomSquadre.size(); i++) {
			Squadre.add(new Squadra(NomSquadre.get(i)));
		}
		
	}
	
	

}
