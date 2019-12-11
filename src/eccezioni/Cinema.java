package eccezioni;

import java.io.EOFException;
import java.util.Scanner;

public class Cinema extends Persona{


	String message;
	public boolean xxx;
	Scanner sc = new Scanner(System.in);

	public void ControlloEtà() throws AgeException, EOFException  {

		
		if(getEtà() < 18) throw new AgeException(getNome() + " Sei troppo piccolo per entrare " + getEtà() 
		+ " In questo cinema "); 
		if(getEtà() > 90) throw new EOFException(getNome() + " Sei troppo grande per entrare " + getEtà() 
		+ " In questo cinema "); 

		else System.out.println(" Benvenuto!! Buon Divertimento");

	}

	public boolean tipocinema() {

		xxx= sc.nextBoolean();
		if (xxx==true){
			System.out.println("****BENVENUTO NEL CINEMA A LUCI ROSSE***");
		} else 
			System.out.println("***BENVENUTO NEL CINEMA***");
		return xxx;
	}
	
	public void Modifica() {
		
	}
	public void Cancellazzione() {
		
	}

}
