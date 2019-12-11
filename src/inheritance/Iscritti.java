package inheritance;

import java.util.Scanner;

public class Iscritti {

	private final String password = "ciao" ;
	private int id;
	private String nome ;
	private String data ;
	private  int tassa ;
	private int sconto;
	private static int idProgressivo;
	String x;
	



	public  Iscritti(String nome, String data, int tassa) {

		this.setNome(nome);
		this.setData(data);
		this.setTassa(tassa);
		idProgressivo++;


		this.setId(idProgressivo);

	}
	public Iscritti(String nome,String data, int tassa, int sconto) {

		this(nome, data, tassa);
		this.setSconto(sconto);

	}
	
	    public int calcolatassaiscr(int cti) {
		return (this.getTassa() + cti);
		
	}


	protected int getId() {
		return id;
	}


	protected void setId(int id) {

		this.id = id;
	}


	protected String getNome() {
		return nome;
	}


	protected void setNome(String nome) {
		this.nome = nome;
	}


	protected String getData() {
		return data;
	}


	protected void setData(String data) {
		this.data = data;
	}


	protected int getTassa() {
		return tassa;
	}


	protected void setTassa(int tassa) {
		this.tassa = tassa;
	}


	protected int getSconto() {
		return sconto;
	}


	protected void  setSconto(int sconto) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("inserisci password per applicare sconto");
		x = sc.nextLine();

		if (x.equalsIgnoreCase(password)) {
			System.out.println("La password è corretta");

			this.sconto = sconto;
			
		} else { 
			System.out.println("La password è errata");
           
		}
		
	}

	public void stampa() {

		System.out.println("ID : " + this.getId());
		System.out.println("Nome : " + this.getNome());
		System.out.println("Data : " +this.getData());
		System.out.println("Tassa annua : " + this.getTassa());
		System.out.println("Sconto applicabile : " + this.getSconto());
		System.out.println("--------------------");

		

	}
}

