/*Solicite ao usuário os comprimentos dos três lados de
um suposto triângulo (A, B e C) e determinar, caso formem um triângulo, que tipo de
triângulo temos, com base nos casos abaixo.
Suponha que A é o maior dos lados e B e C são os outros dois. Então:
Se A2 = B2 + C2, então temos um triângulo retângulo;

Se A2 > B2 + C2, então temos um triângulo obtusângulo;

Se A2 < B2 + C2, então temos um triângulo acutângulo. */

Scanner input = new Scanner (System.in);
    	int seg1, seg2, seg3;

	System.out.println("digite o primeiro segmento: ");
	seg1 = input.nextInt();
 	System.out.println("digite o segundo segmento: ");
	seg2 = input.nextInt();
   System.out.println("digite o terceiro segmento: ");
	seg3 = input.nextInt();


   	if(seg1 == seg2 + seg3){
      	System.out.print ("triângulo retângulo");
    	}
  	else if (seg1 > seg2 + seg3){
    	System.out.print ("triângulo obtusângulo");
  	}
  	else if (seg1 < seg2 + seg3){
    	System.out.print ("triângulo acutângulo");
  	}
	else{
    	System.out.print("Os 3 lados NAO formam um triangulo");
	}


    }
}
