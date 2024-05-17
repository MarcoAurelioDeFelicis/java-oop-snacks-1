package javaSnack3;

public class Studente {
	
		private String  name;
		
		private String surname; 
		
		private int age;
		
		//COSTRUTTORE
		public Studente(String name, String surname, int age ) {
			//INIZIALIZZAZIONE
			
			this.name = name;
			this.surname = surname;
			this.age = age;
		}
		
		//CREAZIONE METODO
		public String studentStringified () {
			return name + " " + surname + ", " + age + " anni";
		}
	
}
