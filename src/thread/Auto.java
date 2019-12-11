package thread;

import java.util.Random;
import java.util.Scanner;

public class Auto implements Runnable{

	String nome;
	Scanner sc = new Scanner (System.in);
	Random random = new Random();
	int[] numeriCasuali = new int[10];
	int cr;
	int es;
	static int c = 1;


	@Override
	public void run() {

		cr = random.nextInt(10);
		es = random.nextInt(10);
		System.out.println(Thread.currentThread().getName() +" Pronti , Partenza , Via!! " );
		for (int i = 0; i < 10; i++) {
			System.out.println("La macchina  : "+ Thread.currentThread().getName() +"  Ha eseguito  : " + i + " : Giri");
			if(i == cr) {
				cambioruote();
			}
			try {
				Thread.sleep(random.nextInt(10)*100);
				if (i == es) {
					effettosorpresa();

				}
			} catch (InterruptedException e) {
				e.printStackTrace();

			}

		}
		System.out.println("La macchina : " + Thread.currentThread().getName() + " E' arrivata : " + c);
		c++;


	}

	public String getNome() {
		return nome = sc.nextLine();
	}



	public void setNome(String nome) {

		this.nome = nome;
	}

	public void cambioruote() {
		System.out.println(" Pit Stop da parte di :  " + Thread.currentThread().getName() );
		for(int i=0; i<numeriCasuali.length; i++) {
			numeriCasuali[i]= random.nextInt(10)*100;
			System.out.println(i);
			try {
				Thread.sleep(i);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}

		}

	}
	public void effettosorpresa() {
		System.out.println(Thread.currentThread().getName() + " Ha avuto un problema! " );
		for(int i=0; i<numeriCasuali.length; i++) {
			numeriCasuali[i]= random.nextInt(10)*100;
			System.out.println(i);
			try {
				Thread.sleep(i);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}

		}

	}

}
