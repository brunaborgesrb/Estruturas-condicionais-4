/*Solicite ao usuário três números reais e determine qual
o menor deles. Considere que os três números podem ou não ser diferentes entre si. */

Scanner input1 = new Scanner (System.in);
			int num1, num2, num3;
			System.out.println("informe o primeiro número");
			num1 = (int) input1.nextDouble();
	        System.out.println ("informe o segundo número");
	        num2 = (int) input1.nextDouble();
	        System.out.println ("informe o terceiro número");
	        num3 = (int) input1.nextDouble();
	        
			if (num1 == num2 || num2 == num3 || num1 == num3) {
				System.out.println("os três números são iguais");
			}
			else if (num1 == num2 || num1 == num3 || num2 == num3) {
				if (num1 == num2) {
					if (num2 < num3) {
					System.out.println("o " + num1 + " é igual a o " + num2 + " e são menores que o  " + num3);
			}
					else {
						System.out.println("o " + num1 + " é igual a o " + num2 + " e o  " + num3 +"é o menor");
					}
					}
			else if (num1 == num3) {
					(num3 < num2) {
				System.out.println("o " + num1 + " é igual ao  " + num3 + " e são menores que o " + num2);
			}
			else {
				System.out.println("o  " + num1 + " é igual ao" + num3 + " e o s " + num2 + "é o menor");
			}
			}
			else {
				if (num3 < num1) {
				System.out.println("o " + num2 + " é igual ao  " + num3 + "e são menores que o " + num1 );
			}
			}	
			
				else {
					System.out.println("o  " + num2 + " é igual ao  " + num3 + "e o" + num1 + "é o menor ");
				}	
		}

	}
	}

}
	}

}
