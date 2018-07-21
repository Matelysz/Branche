class Branche{
	public static void main (String[] args) {
		
		String a1;
		String b1;
		
		System.out.println("Podaj pierwsza liczbe: ");
			a1 = System.console().readLine();
			try {
				double number = Double.parseDouble(a1);
				} catch(NumberFormatException e) {
					System.out.println("Musisz podac liczbe!");
					System.exit(1);
					}
			
			
			System.out.println("Podaj druga liczbe: ");
			b1= System.console().readLine(); 
			try {
				double number = Double.parseDouble(b1);
				} catch(NumberFormatException e) {
					System.out.println("Musisz podac liczbe!");
					System.exit(1);
					}
		
		double a = Double.parseDouble(a1);
		double b = Double.parseDouble(b1);
		
		double c = a*b;
		
		System.out.println("Pole prostokata  to " + c);
		
	}
}	