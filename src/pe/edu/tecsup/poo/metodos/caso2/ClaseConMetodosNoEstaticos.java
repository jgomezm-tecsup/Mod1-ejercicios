package pe.edu.tecsup.poo.metodos.caso2;

/**
 *  Usando metodos NO estaticos
 *  
 * @author mbtec22
 *
 */
public class ClaseConMetodosNoEstaticos {

	public static void main(String[] args) {

		int ope1 = 12;
		int ope2 = 14;
		
		// Instanciar una clase
		ClaseConMetodosNoEstaticos app 
				= new ClaseConMetodosNoEstaticos();
		
		//app.imprimirSuma(ope1,ope2);
		app.imprimirSuma(ope1,ope2);
		
		//int suma = app.retornarSuma(ope1,ope2);
		int suma = app.retornarSuma(ope1,ope2);
		System.out.println("La suma es " + suma);
		
		//
		System.out.println("la resta es: " + app.retornarResta(ope1, ope2));
		System.out.println("el signo es: " + app.retornarSignoDeResta(ope1, ope2));

	}

	/**
	 *  Metodo que recibe 2 parametros y no retorna ningun valor
	 * @param a
	 * @param b
	 */
	public  void imprimirSuma(int a, int b) {

		int suma = a + b ;
		System.out.println("La suma es " + suma);
		//System.out.format("La suma es %d",suma);
		
	}
	
	/**
	 *  Metodo que recibe 2 parametros y retorna la suma
	 * @param a
	 * @param b
	 */
	public  int retornarSuma(int a, int b) {

		int suma = a + b ;
		return suma ;
		
	}

	// Implementar un metodo que imprima 
	// la resta de dos numero y usarlo

	public int retornarResta(int a, int b) {
		return a - b;
	}
	
	

	// Implementar un metodo  que imprima
	// si la resta es positiva o negativa.
	public String retornarSignoDeResta(int a, int b) {
		String resultado = "";
		if (a - b > 0) {
			resultado= "positivo";
		} else if(a - b < 0) {
			resultado = "negativo";
		} else {
			resultado = "[sin signo]";
		}
		return resultado;
	}

}
