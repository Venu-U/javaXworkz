class Main{
	public static void main(String[] args)
	{
		System.out.println("Invoking main in Main");
		
		Helmet h1=new Helmet("Black",800);
		h1.printStatic();
		h1.printInstance();