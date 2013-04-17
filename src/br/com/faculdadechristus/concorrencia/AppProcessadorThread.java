package br.com.faculdadechristus.concorrencia;

import java.util.concurrent.Semaphore;

public class AppProcessadorThread {
	public static void main(String[] args) {
	    int numeroDePermicoes = 1;
	    int numeroDeProcessos = 10;
	    Semaphore semaphore = new Semaphore(numeroDePermicoes);
	    ProcessadorThread[] processos = new ProcessadorThread[numeroDeProcessos];
	    for (int i = 0; i < numeroDeProcessos; i++) {
	        processos[i] = new ProcessadorThread(i, semaphore);
	        processos[i].start();
	    }
	}
}
