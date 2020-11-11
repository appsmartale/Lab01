package it.polito.tdp.parole.model;

public class ModelTest {
	
	public void run() {
		Parole par = new Parole();
		
		//--------------------Aggiungo tre parole------------------------------
		
		par.addParola("SecondaParola");
		par.addParola("PrimaParola");
		par.addParola("TerzaParola");
		
		System.out.println(par.getElenco());
		
		//--------------------Rimuovo "SecondaParola"---------------------------
		
		par.removeParola("SecondaParola");
		
		System.out.println(par.getElenco());
		
		//--------------------Elimino ogni stringa------------------------------
		
		par.reset();
				
		System.out.println(par.getElenco());
	}
	
	public static void main(String[] args) {
		ModelTest test = new ModelTest();
		test.run();
	}

}
