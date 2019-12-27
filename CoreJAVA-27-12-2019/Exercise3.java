public class Exercise3 {
	public boolean getResult(int num){
		boolean result=true;
		int previous=9;
		int current;
		while(num>0){
			current=num%10;
			num=num/10;
			if(current>previous){
				result=false;
				break;
			}previous=current;
		}return result;
	}
	public static void main(String[] args){
		int num=2357;
		Exercise3 obj=new Exercise3();
		if(obj.getResult(num)){
			System.out.println(num+" is an increasing number");
		}
		else{
			System.out.println(num+" is not an increasing number");
		}
	}
}