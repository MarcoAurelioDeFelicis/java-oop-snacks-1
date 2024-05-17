package javaSnack3;

public class JavaSnack3MAIN {
	
	public static void main(String[] args) {
		
		RegistroStudenti registro = new RegistroStudenti();
		
		registro.addStudente(new Studente( "Marco", "De Felicis" , 22) );
		registro.addStudente(new Studente( "A", "a" , 18) );
		registro.addStudente(new Studente( "B", "b" , 23) );
		registro.addStudente(new Studente( "C", "c" , 20) );
		registro.addStudente(new Studente( "D", "d" , 24) );
		registro.addStudente(new Studente( "e", "E" , 24) );
		registro.stampaStudenti();
	}

}
