package principal;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String array_entrada;
		
		
		
		ArrayList<String> array = new ArrayList<String>();
		
		for(String e="";e == "nao" || e == "Nao";e="") {
			System.out.println("Qual o novo valor a ser adicionaro a Lista? ");
			array_entrada=entrada.next();
			array.add(array_entrada);
			System.out.println("Deseja continuar");
			e=entrada.next();
		}
		
		for(int i=0; i<array.size();i++) {
			System.out.println(array.get(i));
		}
		
		
	}

}
