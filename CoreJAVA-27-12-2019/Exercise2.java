public class Exercise2 {
public int calculateDifference(int n){
	int sumOfSquares =0;
	int squareOfSum =0;
	int sum=0;
	int difference= 0;
	for(int i=1;i<=n;i++){
		sumOfSquares+=i*i;
		sum+=i;
	}
	squareOfSum = sum*sum;
	difference = sumOfSquares-squareOfSum;
	return difference;
}

public static void  main(String[] args){
	Exercise2 ex = new Exercise2();
	System.out.println("Difference between sum of Squares and Square of sum of 5 is = "+ex.calculateDifference(5));
}
}
