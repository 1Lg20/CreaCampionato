package CreaCampionato;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// definisco l'array che contiente la lista di squadre
		ArrayList<String> Squadre= new ArrayList<String>();
		
		System.out.println("Crea il tuo campionato");
		RichiediSquadre(Squadre);
		for (int i = 0; i < Squadre.size(); i++) {
			System.out.println(Squadre.get(i));
			
		}
	}
	
	/*
	 * Metedo RichiediSquadre
	 * 	riceve un arrayList
	 * 	carica all'interno dell'arrrayList i nomi delle squadre
	 * 	Controlla che sia stato inserito un numero pari di sqiadre maggiore di 6
	 * */
	private static void RichiediSquadre(ArrayList<String> squadre){
		for (int i = 0; i < 10; i++) {
			squadre.add("Squadra"+(i+1));
		}
	}

}
