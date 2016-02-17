class BasicTest{
	public static int noOfTest = 0;
	public static int noOfPassingTest = 0;

	public static void assertTrue(boolean stat) throws Exception{
		if(stat == false){
			throw new Exception("test are failing!!!!");
		}
	}
	public static void testIsEven(Basic b) throws Exception{
		noOfTest++;
		assertTrue(b.isEven(4)==true);
		assertTrue(b.isEven(5)==false);
		assertTrue(b.isEven(0)==true);
		noOfPassingTest++;
	}
	public static void testIsOdd(Basic b) throws Exception{
		noOfTest++;
		assertTrue(b.isOdd(3)==true);
		assertTrue(b.isOdd(2)==false);
		assertTrue(b.isOdd(0)==false);
		noOfPassingTest++;
	}
	public static void testSquare(Basic b) throws Exception{
		noOfTest++;
		assertTrue(b.square(3)==9);
		assertTrue(b.square(2)==4);
		assertTrue(b.square(0)==0);
		noOfPassingTest++;
	}
	public static void testCube(Basic b) throws Exception{
		noOfTest++;
		assertTrue(b.cube(3)==27);
		assertTrue(b.cube(2)==8);
		assertTrue(b.cube(0)==0);
		noOfPassingTest++;	
	}
	public static void testGCD(Basic b) throws Exception{
		noOfTest++;
		assertTrue(b.gcd(12 ,15)==3);
		assertTrue(b.gcd(22,72)==2);
		assertTrue(b.gcd(11 ,1)==1);
		noOfPassingTest++;
	}
	public static void testLCM(Basic b) throws Exception{
		noOfTest++;
		assertTrue(b.lcm(12 ,15)==60);
		assertTrue(b.lcm(22,72)==792);
		assertTrue(b.lcm(11 ,1)==11);
		noOfPassingTest++;	
	}
	public static void testSimpleInterest(Basic b) throws Exception{
		noOfTest++;
		assertTrue(b.simpleInterest(1200 ,2,3)==72);
		assertTrue(b.simpleInterest(1000,5,3)==150);
		assertTrue(b.simpleInterest(1250,3,1)==37.5);
		noOfPassingTest++;		
	}
	public static void testCompoundInterest(Basic b) throws Exception{
		noOfTest++;
		assertTrue(b.compoundInterest(1200 ,2,3)==73.44959999999992);
		assertTrue(b.compoundInterest(1000,5,3)==157.625);
		assertTrue(b.compoundInterest(1250,3,1)==37.5);
		noOfPassingTest++;		
	}
   //===================================================================
	public static void main(String[] args) {
		Basic b = new Basic();
		try{
			testIsEven(b);
			testIsOdd(b);
			testSquare(b);
			testCube(b);
			testGCD(b);
			testLCM(b);
			testSimpleInterest(b);
			testCompoundInterest(b);
			System.out.println(noOfPassingTest+" of "+noOfTest+" tests are passing");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}