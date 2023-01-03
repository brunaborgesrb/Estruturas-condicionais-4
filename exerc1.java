/*Solicite ao usuário um número real que esteja na faixa
entre 1 e 9 (inclusive). Após a leitura do valor fornecido pelo usuário, o programa deve
exibir uma das duas mensagens: “O valor está dentro da faixa permitida.”, caso o valor
fornecido esteja na faixa solicitada, ou “O valor não está dentro da faixa permitida.”, caso
o usuário forneça valores não válidos. */

Scanner input = new Scanner (System.in);
		int num;
		System.out.println("informe um número de 1 a 9 ");
		num = (int) input.nextDouble();
		
		if (num <= 0 || num > 9) {
			System.out.println("O valor não está dentro da faixa permitida.");
		}
			else {
				System.out.println("O valor está dentro da faixa permitida.");
			}
	}

}
