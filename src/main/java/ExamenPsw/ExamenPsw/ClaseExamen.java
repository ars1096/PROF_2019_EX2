package ExamenPsw.ExamenPsw;

import java.util.ArrayList;
import java.util.List;

public class ClaseExamen {
	
	public List<Integer> primos (int n){
		List<Integer> lista = new ArrayList<Integer>();
		
		if( n <= 1) {
			throw new RuntimeException("Entrada Inválida");
		}
		
		for(int i=2;i<=n;i++){
			
            while(n%i==0){
            	lista.add(i);
                n=n/i;  
            }
        }
		
		return lista;
	}
}
