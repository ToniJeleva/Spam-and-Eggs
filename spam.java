
public class spam {

	public static void main(String[] args) {
		int number=45;
		spamAndEggs(number);

	}

	public static void spamAndEggs(int number){
		int br=0;
		int number1=number;
		if((number1%3)==0){
			while((number1/3!=0)&&(number1%3)==0){
				number1=number1/3;
				br++;
			}
			for(int i=1;i<=br;i++){
				System.out.print("spam ");
			}
		}
		
		if(((number%5)==0)&&((number%3)==0)){
			System.out.print("and eggs");
		}else if((number%5)==0){
			System.out.print("eggs");
		}
	}
		
}
