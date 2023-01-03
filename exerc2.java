/*Solicite ao usuário três números reais e determine qual
o maior deles. Considere que os três números são diferentes entre si. */

Scanner input = new Scanner (System.in);
		int num1, num2, num3;
		System.out.println("informe o primeiro número");
		num1 = (int) input.nextDouble();
        System.out.println ("informe o segundo número");
        num2 = (int) input.nextDouble();
        System.out.println ("informe o terceiro número");
        num3 = (int) input.nextDouble();
        
		if (num1 > num2 && num1 > num3) {
			System.out.println("o primeiro número: " + num1 + " é maior");
		}
			else if (num2 > num1 && num2 > num3) {
				System.out.println("o segundo número: " + num2 + " é maior");
			}
		
			else {
				System.out.println("o terceiro número: " + num3 + " é maior");
			}
	}

}
