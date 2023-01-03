/*Solicite ao usuário os comprimentos dos três lados de
um suposto triângulo e determinar, caso formem um triângulo, se o mesmo é eqüilátero,
isósceles ou escaleno. */

Scanner input = new Scanner (System.in);
    	int seg1, seg2, seg3;

	System.out.println("digite o primeiro segmento: ");
	seg1 = input.nextInt();
 	System.out.println("digite o segundo segmento: ");
	seg2 = input.nextInt();
   System.out.println("digite o terceiro segmento: ");
	seg3 = input.nextInt();

	if(seg1 + seg2 > seg3 && seg1 + seg3 > seg2 && seg2 + seg3 > seg1){
    	System.out.print("Os 3 lados formam um triangulo ");
	}
    	if(seg1 == seg2 && seg1 == seg3){
        	System.out.print(" equilatero ");
    	}
    	else {
        	if(seg1 == seg2 || seg1 == seg3 || seg2 == seg3){
            	System.out.print(" isosceles");
      	}
        	else{
            	System.out.print(" escaleno");
        	}
    	}
   	 
    }
}
