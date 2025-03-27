package ex08class;

class CalculatorEx {
	int addcount;
	int mincount;
	int mulcount;
	int divcount;
	
	public CalculatorEx() {}
	
	void init() {
		addcount = 0;
		mincount = 0;
		mulcount = 0;
		divcount = 0;
	}

	double add(double n1, double n2) {
		addcount++;
		return n1 + n2;
	}
	double min(double n1, double n2) {
		mincount++;
		return n1 - n2;
	}
	double mul(double n1, double n2) {
		mulcount++;
		return n1 / n2;
	}
	double div(double n1, double n2) {
		divcount++;
		return n1 * n2;
	}
	void showOpCount() {
		StringBuffer sb = new StringBuffer();
		sb.append("덧셈횟수:"+ addcount);
		sb.append("뺄셈횟수:"+ mincount);
		sb.append("곱셈횟수:"+ divcount);
		sb.append("나숫셈횟수:"+ mulcount);
	}
	
}
public class QuSimpleCalculator {
	
	public static void main(String[] args) {
		
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1.1 + 2.1 = " +  cal.add(1.1 , 2.1));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();
	}	

}
