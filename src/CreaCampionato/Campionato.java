package CreaCampionato;

import java.util.ArrayList;
import java.util.Random;

public class Campionato {
	
	private String Nome;
	private int NumeroSquadre;
	private ArrayList<Squadra> Squadre= new ArrayList<Squadra>();
	private ArrayList<ArrayList<String>> Giornate= new ArrayList<ArrayList<String>>(); 

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
		String DaStampare="\n\u001B[33m\033[1;1mCampionato "+getNome()+"\u001B[0m \033[0;0m \nComposizione:"+getNumeroSquadre()+" squadre\nLe squadre sono:";
		for (int i = 0; i < Squadre.size(); i++) {
			DaStampare=DaStampare+Squadre.get(i).toString()+"\n";
		}
		return DaStampare;
	}
	
	/*
	 *Getter e setter per i campi della classe 
	 * */
	
	public int getNumeroSquadre() {
		return this.NumeroSquadre;
	}
	
	public String getNome() {
		return this.Nome;
	}

	public void setNumeroSquadre(int numeroSquadre) {
		this.NumeroSquadre = numeroSquadre;
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}
	
	/*
	 * Riceve l'arraylist con i nomi delle squadre
	 * Utilizza i nomi delle squadre per creare un Arraylist di classi squadra
	 * Carica i rivali delle varia squadre
	 * */
	public void Addsquadre(ArrayList<String> NomSquadre) {
		
		for (int i = 0; i < NomSquadre.size(); i++) {
			this.Squadre.add(new Squadra(NomSquadre.get(i)));
		}
		
		if(this.Squadre.size()!=this.getNumeroSquadre()) {
			System.err.println("Errore nella creazione delle squadre, programma terminato");
			System.exit(-1);
		}
		
		for (int i = 0; i < this.Squadre.size(); i++) {
			this.Squadre.get(i).CreaRivali(Squadre);
		}
	}
	
	/*
	 * ,etodo che crea le giornate del campionato
	 * */
	public void CreaGiornate() {
		
		ArrayList<Squadra> SquadreCopy= new ArrayList<Squadra>();
		Squadra sq1;
		Squadra sq2;
		Random rand = new Random(); 
		int SquadraEstratta; 
		String Abbinamento="";
		
		
		
		for (int n = 1; n < this.Squadre.size(); n++) {
			
			//Creo una copia dell'array iniziale
			for (int i = 0; i < this.Squadre.size(); i++) {
				SquadreCopy.add(this.Squadre.get(i));
			}
			
			System.out.println("Giornata"+n);
			//Creo le partite della giornata
			while(SquadreCopy.size() > 0) {
				SquadraEstratta= rand.nextInt(SquadreCopy.size());
				sq1=SquadreCopy.get(SquadraEstratta);
				SquadreCopy.remove(SquadraEstratta);
				sq2=sq1.EstraiRivale(SquadreCopy); 
				for (int i = 0; i < SquadreCopy.size(); i++) {
					if(SquadreCopy.get(i) == sq2) {
						SquadraEstratta=i;
					}
				}
				SquadreCopy.remove(SquadraEstratta);
				sq1.RimuoviRivali(sq2);
				sq2.RimuoviRivali(sq1);
				Abbinamento=sq1.getNome()+" - "+sq2.getNome();
				System.out.println(Abbinamento);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	

}
