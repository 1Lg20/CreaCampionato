package CreaCampionato;

import java.util.ArrayList;

public class Squadra {

	private String Nome="";
	private ArrayList<Squadra> Rivali= new ArrayList<Squadra>();
	
	public Squadra(String string) {
		this.setNome(string);
	}

	/*
	 * Override del metodo toString per facilitare la stampa dei campi della classi
	 * */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String Stampare="";
		
		Stampare="\n<----------------------------------------------------------------->\n";
		Stampare=Stampare+"Squadra:"+this.getNome()+"\n";
		Stampare=Stampare+"Rivali:\n";
		for (int i = 0; i < this.Rivali.size(); i++) {
			Stampare=Stampare+this.Rivali.get(i).getNome()+"|";
		}
		Stampare=Stampare+"\n<----------------------------------------------------------------->\n";
		
		return Stampare;
	}



	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}
	
	
	/*
	 * Ricave un Arraylist con tutte le squadre del campiopnato
	 * scorrendo l'array verifica se è una classe diversa da se stassa, se lo è la aggiunge all'ArrayList dei rivali
	 * */
	public void CreaRivali(ArrayList<Squadra> squadre) {
		for (int i = 0; i < squadre.size(); i++) {
			if(squadre.get(i) != this) {
				this.Rivali.add(squadre.get(i));
			}
		}
	}


}
