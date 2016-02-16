class BasicTest{
	public static int noOfTest = 0;
	public static int noOfPassingTest = 0;

	public static void assertEqual(boolean stat) throws Exception{
		if(stat == false){
			throw new Exception("Something wrong!!!!");
		}
	}

	public static void testIsEven(Basic b) throws Exception{
		noOfTest++;
		assertEqual(b.isEven(4)==true);
		assertEqual(b.isEven(5)==false);
		assertEqual(b.isEven(0)==true);
		noOfPassingTest++;
	}



   //===================================================================
	public static void main(String[] args) {
		Basic b = new Basic();
		try{
			testIsEven(b);
			System.out.println(noOfPassingTest+" of "+noOfTest+" tests are passing");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}