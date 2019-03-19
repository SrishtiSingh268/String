package String;

public class toggleCaps {
	public static void main(String args[]){
		int  caps = 0;
		String input = " I met John on a bright and sunny, but a beautiful day";
		String str = "";
		for(char c: input.toCharArray()){
			if(c == 'a'|| c== 'A'){
				if(caps == 1)
					caps = 2;
				else 
					caps = 1;
			}
			else {
				if(caps == 1)
				str += (c+"").toUpperCase();
				else if(caps == 2)
					str += (c+"").toLowerCase();
				else str += c+"";
			}
		}
		System.out.println(str);
	}
}
