package com.bytesw.tyu.examen.primos;

public class Primos {

	public static void main(String[] args) {
		
		int numero = 0;
		int primo = 0;
		
		while ( primo < 10 ) {
			
			if ( numero > 1) {
				
				if (numero > 2) {
					
					if ( numero > 3 ) {
						
						if ( numero > 5 ) {
							
							if ( numero > 7 ) {
								
								if ( (numero % 2) == 0 ||
									 (numero % 3) == 0 ||
									 (numero % 5) == 0 ||
									 (numero % 7) == 0
								) {
									//Si es divisible en 2, 3, 5 y 7, no es primos.
								} else {
									System.out.println("Primo No. "+ (++primo) + ": " + numero);
								}
								
							} else {
								if ( (numero % 2) == 0 ||
										 (numero % 3) == 0 ||
										 (numero % 5) == 0 
									) {
										//Si es divisible en 2, 3, 5 no es primos.
									} else {
										System.out.println("Primo No. "+ (++primo) + ": " + numero);
									}
							}
							
						} else {
							
							if ( (numero % 2) == 0 ||
								 (numero % 3) == 0 ) {
								//Si es divisible en 2, 3 no es primos.
							} else {
								System.out.println("Primo No. "+ (++primo) + ": " + numero);
							}
						}
						
					} else {
						
						if ( (numero % 2) == 0 ) {
							//Si es divisible en 2 es primos.
						} else {
							System.out.println("Primo No. "+ (++primo) + ": " + numero);
						}
					}
					
				} else {
					System.out.println("Primo No. "+ (++primo) + ": " + numero);
				}
			}
			
			numero ++;
			
		}
			
		

	}

}
