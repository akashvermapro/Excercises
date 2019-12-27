public class Exercise1{
	public int calculateSum(int n){
		int sum=0;
		int i=1;
		int count=n;
		while(count!=0){
			if(i%3==0||i%5==0){
				sum+=i;
				i++;
				count--;
			}
			else{
				i++;
			}
		}
		return sum;
	}
	public static void main(String[] args){
		Exercise1 ex = new Exercise1();
		System.out.println("Sum of first 5 natural number which are divisible by 3 or 5 i = "+ex.calculateSum(5));
		}

}