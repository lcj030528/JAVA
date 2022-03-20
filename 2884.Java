import java.util.*;

public class main3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int H = input.nextInt();
		int M = input.nextInt();
		
		if(M<45) {
			M = 60 - (45 - M);
			H -= 1;
			if(H<0)
				H = 23;
			System.out.println(H + " " + M);
			
		}
		else {
			System.out.println(H + " " + (M - 45));
		}
	}
}
