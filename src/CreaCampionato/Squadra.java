package CreaCampionato;

import java.util.ArrayList;
import java.util.Random;

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
		Stampare=Stampare+"\n<----------------------------------------------------------------->";
		
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
	
	/*
	 * Ricave una classe squadra
	 * ricerca la classe passata e la rimuove dall'ArrayList rivali
	 * */
	public void RimuoviRivali(Squadra squadra) {
		int rimuovi=-1;
		
		for (int i = 0; i < this.Rivali.size(); i++) {
			if(this.Rivali.get(i) == squadra) {
				rimuovi=i;
			}
		}
		if(rimuovi==-1) {
			System.out.println("Errore nella rimozione del rivale");
		}else {
			this.Rivali.remove(rimuovi);
		}
	}
	
	/*
	 * Riceve un ArrayList di squadre
	 * Estrae il proprio rivale, estraendolo a sorte dall' ArrayList dei rivali, verificando che sia contenuto tra le squadre nell'arrayList passatogli
	 * */
	public Squadra EstraiRivale(ArrayList<Squadra> Disponibili) {
		Random rand = new Random(); 
		Squadra Rivale = null;
		while(!Disponibili.contains(Rivale)) {
			Rivale=this.Rivali.get(rand.nextInt(this.Rivali.size()));
		}
		
		return Rivale;
	}
}
