import java.util.Scanner;

public class step1{
	public static void main(String[] args) {
		
		String str;
		String inputDirection;
		int inputNum;
		int Position; 		//Num만큼 밀어냈을때 첫번째로 오는 문자의 index 값
		
		System.out.println("단어, 숫자(정수), 방향(L또는R)을 띄어쓰기로 구분하여 입력해주세요");
		Scanner sc = new Scanner(System.in);
				
		str = sc.next();
		inputNum = sc.nextInt();
		inputDirection = sc.next();
		
		if(inputDirection.equals("L") || inputDirection.equals("l")) {
			inputNum=-inputNum;
		}

		if(inputNum % str.length() == 0 || inputNum == 0) {
			Position = 0;
		} else {
			if(inputNum > 0) {
				Position = str.length()-(inputNum % str.length());
			} else {
				Position = -(inputNum % str.length());
			}
		}
		
		String change ="";
		char[] split=str.toCharArray();
		
		for(int i=Position; i<str.length(); i++) {
			change += split[i];
		}
		
		if(change.length()<str.length()) {
			int remainNum = str.length()-change.length();
			for(int i=0; i<remainNum; i++) {
				change += split[i];
			}
		}
		
		System.out.println(change);
	}
}