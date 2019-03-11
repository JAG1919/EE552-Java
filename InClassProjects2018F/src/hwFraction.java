public class hwFraction {
    private int num, den;
    
    hwFraction(int a, int b){
        num = a;
        den = b;
    }
    
    @Override
    public String toString() {
        return num + "/" + den;
    }

    public hwFraction add(hwFraction x) {
            return new hwFraction(num*x.den + x.num*den, x.den*den);
	}
	
	public hwFraction sub(hwFraction x) {
		return new hwFraction(num*x.den - x.num*den, x.den*den);
	}

	public hwFraction mult(hwFraction x) {
		return new hwFraction(num*x.num, den*x.den);
	}

	public hwFraction neg() {
		return new hwFraction(-num,den);
	}

    public static void main(String[] args) {
			hwFraction f1 = new hwFraction(1,2);

			hwFraction f2 = new hwFraction(2, 4);
            hwFraction f3 = f1.add(f2);
            System.out.println(f1 + " + " + f2 + " = " + f3);

           hwFraction f4 = f1.sub(f2);
           System.out.println(f1 + " - " + f2 + " = " + f4);

           hwFraction f5 = f1.mult(f2);
           System.out.println(f1 + " * " + f2 + " = " + f5);

		   hwFraction f6 = f1.neg(); // return -1/2 f1 is unchanged
		   System.out.println(f6);
    }

}
