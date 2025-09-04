package CreaCampionato;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// definisco l'array che contiente la lista di squadre
		ArrayList<String> Squadre= new ArrayList<String>();
		
		//Array per i dati aggiuntivi
		String[] Dati= new String[2];
		
		System.out.println("Crea il tuo campionato\n");
		
		Richiedi(Squadre, Dati);
		
		Campionato Campionato1=new Campionato(Dati[0], Integer.parseInt(Dati[1]) , Squadre);
		System.out.println(Campionato1.toString());
		
		Campionato1.CreaGiornate();
		
		System.out.println(Campionato1.toString());
	}
	
	/*
	 * Metedo RichiediSquadre
	 * 	riceve un arrayList per contenere le square
	 * 	riceve un array per i dati extra
	 * 	chiede in input il nome del campionato
	 * 	chiede in input il numero di squadre
	 * 	carica all'interno dell'arrrayList i nomi delle squadre
	 * 	Controlla che sia stato inserito un numero pari di sqiadre maggiore di 5
	 * */
	private static void Richiedi(ArrayList<String> squadre, String[] dati){
		//definisco lo scanner per l'input dell'utente
		Scanner myScanner =new Scanner(System.in);
		int NumeroSquadre=1;
		
		System.out.println("Inserire il nome del campionato");
		dati[0]=myScanner.nextLine();
		while((NumeroSquadre % 2 != 0) || NumeroSquadre < 5) {
			System.out.println("Inserire il numero di squadre(almeno 6 e deve essere un numero pari");
			NumeroSquadre= Integer.parseInt(myScanner.nextLine());
		}
		dati[1]= String.valueOf(NumeroSquadre);
		
		for (int i = 0; i < NumeroSquadre; i++) {
			squadre.add("Squadra"+(i+1));
		}
	}

}