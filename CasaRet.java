class CasaRet
{

	public static void main(String[] args)
	{
		float lateral = 11; // comprimento lateral da cabana
		float cquarto = 7;  // comprimento da lateral maior do quarto
		float areaq; // area do quartos
		float areas; // ara da sala
		float areat; // area total

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