package Testes;

import java.util.Random;

import Model.JogoIndiv�duo;

public class Testes {
	static Random random = new Random();
	static int vetor[] = new int[8];

	public static void main(String[] args) {
		JogoIndiv�duo jogo = new JogoIndiv�duo();
		
		for (int i = 0; i < 8; i++) {
			do {
				vetor[i] = numeroRandomico();
			} while (verificaRepeticao(i, vetor[i]));
			
		}
		jogo.colocaRainha(vetor);
		System.out.println(jogo.toString());
	}
	
	
	static boolean verificaRepeticao(int p, int n) {
		for (int i = 0; i < vetor.length; i++) {
			if (i != p) {
				if (vetor[i] == n) {
					return true;
				}
			}
		}
		return false;

	}
	static int numeroRandomico(){
		return random.nextInt(64);
	}

}
