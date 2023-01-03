/*Solicite ao usuário o tamanho de três segmentos de
reta e verifique se com eles podemos formar um triângulo. Para que isso ocorra, é
necessário que cada segmento dado seja menor que a soma dos outros dois segmentos. */

Scanner input = new Scanner (System.in);
    	int seg1, seg2, seg3;

	System.out.println("digite o primeiro segmento: ");
	seg1 = input.nextInt();
 	System.out.println("digite o segundo segmento: ");
	seg2 = input.nextInt();
   System.out.println("digite o terceiro segmento: ");
	seg3 = input.nextInt();

	if(seg1 + seg2 < seg3 || seg1 + seg3 < seg2 || seg2 + seg3 < seg1){
    	System.out.print("Os 3 lados formam um triangulo");
   	 
	}
	else{
    	System.out.print("Os 3 lados NAO formam um triangulo");
	}

}
}

