package desafio;

public class Jantar {
	public static void main(String[] args) {
		Comida c1 = new Comida ("Arroz", 0.290);
		Comida c2 = new Comida ("Bife", 0.280);
		
		Pessoa p = new Pessoa("Pedro", 69);
		System.out.println(p.apresentar());
		
		p.Comer(c1);
		System.out.println(p.apresentar());
		
		p.Comer(c2);
		System.out.println(p.apresentar());
	}
}
