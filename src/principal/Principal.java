package principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int l, c;		
		
		System.out.print("Quantidade de linhas: ");
		l = sc.nextInt();
		System.out.print("Quantidade de colunas: ");
		c = sc.nextInt();
		
		int mat[][] = new int[l][c];
		
		for (int i = 0; i < l; i++)
		{
			for (int j = 0; j < c; j++)
			{
				System.out.print("mat["+i+"]["+j+"] =  ");
				mat[i][j] = sc.nextInt();				
			}
		}
		
		
		System.out.println();
		System.out.println("*******MATRIZ*******");
		for (int i = 0; i<l; i++)
		{	
			for (int j = 0; j<c; j++)
			{
				System.out.print(mat[i][j] + "  ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("Informe número para busca: ");
		int num = sc.nextInt();
		
		for (int i = 0; i<l; i++)
		{
			for (int j = 0; j<c; j++)
			{
				if (mat[i][j] == num) 
				{
					System.out.println("Posição: mat[" + i + "][" + j + "]");
					if (j > 0)
						System.out.println("Esquerda: " + mat[i][j-1]);
					
					if (j < (c-1))
						System.out.println("Direita: " + mat[i][j+1]);
					
					if (i > 0)
						System.out.println("Em cima: " + mat[i-1][j] );
					
					if (i < (l-1))
						System.out.println("Embaixo: " + mat[i+1][j] );
					
					System.out.println("---------------------");
				}
			}
		}
		
		
		sc.close();

	}

}

