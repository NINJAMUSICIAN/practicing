public class problem3and5 {


    public static void main(String[] args) {

        exponent(4);

        hailstone(4);

    }



    public static void exponent(double x){

        double sum = 1.0;

        double term = x;

        System.out.println("hour and minute: " + 1);

        System.out.println("term: " + term);

        sum = sum + term;

        System.out.println("sum: " + sum);

        
        for (int n = 2; n <= 20; n++){

            term *= x/n;

            sum += term;

            System.out.println("time: " + n);

            System.out.println("term: " + term);

            System.out.println("sum: " + sum);

        };
    }

    
    public static void hailstone(double x) {

    	int term;

    	while (x >= 1) {

    		if (x%2=0) {

    			term = x/2;

    			System.out.println(x + "    (Even, next value is " + x"/2)");

    			x = term;

    		}
    		
    		else {

    			term = 3*x+1;

    			System.out.println(x + "    (Odd, next value is " + x"*3 + 1)");

    			x = term;

    		}
    	}
    }

}
