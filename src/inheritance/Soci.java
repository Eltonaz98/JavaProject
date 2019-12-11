package inheritance;

import java.util.Scanner;

public class Soci {
	
	private static int count=0;
	private int id, tassaIscrizione, sconto;
	private String nome, dataIscrizione, pwd="p";

	
	public Soci(String n, String d, int t) {
		this.setNome(n);
		this.setDataIscrizione(d);
		this.setTassaIscrizione(t);
	    count++;
		this.id=count;
	}
	
	public Soci(String n, String d, int t, int s) {
		this(n, d, t);
		this.setSconto(s);
	}
	
	
	private int getId() {
		return id;
	}
	
	private void setId() {
		this.id = id;
	}

	private String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private String getDataIscrizione() {
		return dataIscrizione;
	}

	private void setDataIscrizione(String dataIscrizione) {
		this.dataIscrizione = dataIscrizione;
	}

	private int getTassaIscrizione() {
		return tassaIscrizione;
	}

	private void setTassaIscrizione(int tassaIscrizione) {
		this.tassaIscrizione = tassaIscrizione;
	}
	
	private int getSconto() {
		return sconto;
	}
	
	private void setSconto(int sconto) {
		this.sconto = sconto;
	}
	
	public void metodoPwd() {
		
		Scanner tastiera=new Scanner(System.in);
		
		do {
			System.out.print("\nInserire la password amministrativa per applicare lo sconto ");
			String pwdIn=tastiera.nextLine();
			
			if (pwdIn.equalsIgnoreCase(pwd)) {
			System.out.println("La password è corretta, proseguiamo... ");
			metodoSconto();
			} else System.out.println("La password è errata, riprova! ");
			break;
			} while(true);
		}
	
	public void metodoSconto() {
		
		sconto=(tassaIscrizione*20)/100;
		System.out.println("Lo sconto applicabile del 20% è: " + sconto + "\n");
		System.out.println(" -------------------- \n");
	}
	
	public void metodoStampa() {
		
		System.out.println("L'ID del socio n°: " + this.getId());
		System.out.println("Il nome del socio è: " + this.getNome());
		System.out.println("La data di iscrizione del socio è: " + this.getDataIscrizione());
		System.out.println("La tassa di iscrizione del socio è: " + this.getTassaIscrizione() + " €");
		
	}
	
	public void metodoCalcolaTassa() {
		
	}

	
}
