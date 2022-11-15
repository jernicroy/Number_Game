import java.util.Scanner;
public class NumberGuessing {
	

	public static void main(String[] args) {
		

		int attempt=1;
		int userguessnumber=0;
		int compinput=(int)(Math.random()*99+1);
		//System.out.println(compinput);
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome to the Number Guessing Game\n"+
		"You have total 10 number of attempts to guess the number\n" );
		do{
			System.out.println("\nEnter a guess number between 1 to 100");
			if(sc.hasNextInt()){
				userguessnumber=sc.nextInt();
				if(userguessnumber==compinput){
					CrtGuess(attempt);
					break;
				}
				else if(userguessnumber < compinput){
					smallGuess();
				}
				else if(userguessnumber > compinput){
					greaterGuess();
				}
				if(attempt==10){
					maxattempt();
					break;
				}
				attempt++;
			}
			else{
				System.out.println("The number is exceeds the limit");
				break;
			}
		}
		while (userguessnumber!=compinput);
	}
	public static void CrtGuess(int attempt) {
		System.out.println("\nWELL DONE, YOU GUESSED THE RIGHT NUMBER");
		System.out.printf("\nCONGRATS!, You have guessed the number in %d attempts\n",attempt);
		int score=((11-attempt)*10);
		System.out.printf("\nYour score is %d out of 100",score);
	}
	public static void smallGuess() {
		System.out.println("The number you guessed is smaller than original number");
	}
	public static void greaterGuess() {
		System.out.println("The number you guessed is bigger than original number");
	}
	public static void maxattempt() {
		System.out.println("You have exceeded the maximum attempt. Try Again");
	}
}
