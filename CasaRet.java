class CasaRet
{

	public static void main(String[] args)
	{
		int lateral = 10; // comprimento lateral da cabana
		int cquarto = 7;  // comprimento da lateral maior do quarto
		int areaq; // area do quartos
		int areas; // ara da sala
		int areat; // area total

		System.out.println("Programa para Calculo\nda area da casa");
		areas = lateral*lateral;
		System.out.println("A area da Sala é " + areas);
		areaq = cquarto*(lateral/2);
		System.out.println("A area do Quarto é " + areaq);
		System.out.println("A area do Banheiro é " + areaq);
		areat = areas + 2*areaq;
		System.out.println("A area Total é " + areat);	


	}

}