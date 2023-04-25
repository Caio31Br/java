package javaProv;
import java.util.*;
// -------Nomes: Caio Vinícius, Gustavo Saraiva

public class exes {

		private double H[];
		private String Sexo[];
		
		public exes() {
			H= new double[10];
			Sexo= new String[10];
		}
		
		public void set() {
			Scanner input = new Scanner(System.in);

			double h;
			String sexo;
			
			for(int i= 0; i < H.length; i++) {
				System.out.println("insira a altura");
				h= input.nextDouble();
				H[i]= h;
				
				System.out.println("isnira o sexo F/M");
				sexo = input.next();
				Sexo[i]= sexo;
			}//fim for
			
			for(int i = 0; i< H.length; i++) {
				System.out.println("altura "+ H[i] + "sexo: " + Sexo[i]);
			}//fim for
	}
		//exe1
		public void maiorAltura() {
			double maiorH = 0.0;
			
			for(int i = 0; i< H.length; i++) {
				if(H[i] > maiorH) {
					maiorH = H[i];
				}//fim se
			}//fim for
			
			System.out.println("a maior altura foi " + maiorH);
		}
		
		//exe2
		public void menorAltura() {
			double menorH = 300.0;
			
			for(int i = 0; i< H.length; i++) {
				if(H[i] < menorH) {
					menorH = H[i];
				}//fim se
			}//fim for
			
			System.out.println("a menor altura foi " + menorH);
		}
		
		//exe3
		public void mediaM() {
			double media = 0.0;
			int quant = 0;
			
			for(int i = 0; i< H.length; i++) {
				if(Sexo[i].equals("M")) {
					quant = quant + 1;
				}
			}
			
			for(int i = 0; i< H.length; i++) {
				if(Sexo[i].equals("M")) {
					media += H[i]/quant;
				}
			}
	
			System.out.println("a media da altura dos homens foi de: "+ media);
		}
		
		//exe4
		public void toatlF() {
			int quantF = 0;
			
			for(int i = 0; i< H.length; i++) {
				if(Sexo[i].equals("F")) {
					quantF += 1;
				}
			}
			System.out.println("a quatidade de mulheres foi de: "+ quantF);
		}
}
