

public class guidance {
	
	private String firsTwotLetter,lastTwoLetter;
	private int count = 0;

	
public int countLetterA(String word){
		
		for(int i=0;i<word.length();i++){
			if(word.charAt(i)=='a'|| word.charAt(i)=='A'){
				count++;
			}
		}
		return count;
	}

public boolean checkTwoLetter(String letter){
	
	if(letter.length()<=1){
		return false;
	}
	else if(letter.length()==2){
		return true;
	}
	firsTwotLetter = letter.substring(0,2);
	lastTwoLetter = letter.substring(letter.length()-2);
	
	return firsTwotLetter.equals(lastTwoLetter);	
}

}
