class AreaCasa{

	static void main(float lateral, float cquarto){
		float areaq;
		float areas;
		float areat;

			System.out.println("A area  da casa");
				areas = lateral * lateral;
			System.out.println("A area da sala " + areas);
				areaq = cquarto * (lateral/2);
			System.out.println("A area do quarto " + areaq);
			System.out.println("A area do banheiro " + areaq);
				areat = areas + 2*areaq;
			System.out.println("A area Total " + areat);	 

		// raio piscina
		double raio = 2;
		// area da piscina 
		double areap;
		// valor de pi
			areap = Math.PI * Math.pow(raio,2);
			System.out.println("A area  " + areap);	
	}
}	
	double areaPiscina(double raio)
	{	
		return (Math.PI * Math.pow(raio,2));
	 }

	public static void main(String[] args) 
	{ 	
		double areap;
		areaCasa(11,7);
			areap = areaPiscina(2);
			System.out.println("A area da piscina é " areap);
	}

