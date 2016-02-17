class Basic{
	public boolean isEven(int num){
		return (num % 2 ==0);
	}
	public boolean isOdd(int num){
		return (num % 2 != 0);
	}
	public int square(int num){
		return num * num;
	}
	public int cube(int num){
		return num*num*num;
	}
	public int gcd(int num1 ,int num2){
		int rem = num1 % num2;
		while(rem != 0){
			num1 = num2;
			num2 = rem;
			rem = num1 % num2;
		}
		return num2;
	}
	public int lcm(int num1 ,int num2){
		return (num1 * num2) / gcd(num1 ,num2);
	}
	public double simpleInterest(double principle ,double rate ,double time){
		return (principle * rate * time)/100;
	}
	public double compoundInterest(double principle ,double rate ,double time){
		double totalAmount = principle;
		for (int i = 0;i < time ;i++ ) {
			totalAmount = totalAmount + simpleInterest(totalAmount ,rate ,1);
		}
		return totalAmount - principle;
	}
}