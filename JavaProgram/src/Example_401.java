import java.util.*;

public class Example_401 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String inputtext = "";
		String wordtoDisplay = "";
		while(true) {
			System.out.print("Enter word: ");
			inputtext = kb.next();
			if(inputtext.equalsIgnoreCase("stop")) {
				break;
			
			}
			wordtoDisplay = wordtoDisplay+inputtext+" ";
			//‡¢’¬π‰¥È Õß·∫∫wordToDisplay +=inpuTtext+" ";
			
		}
		System.out.println(wordtoDisplay.toUpperCase());
	}
}
