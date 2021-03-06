package QuestionSort;

public class Question implements Comparable {

	String question;
	public Question(String qus){
		question=qus;
	}
	
	public String getQuestion(){
		return question;
	}
	
	/**
	 * it is overridden method used to compare 
	 * two string
	 */
	public int compareTo(Object qus){  
	String qusString=((Question)qus).getQuestion();
	int stringLength1=qusString.length();
	int stringLength2=question.length();
	
	int compared = 0;
    for (int index = 0; index<stringLength1 && index<stringLength2; index++){
        int fChar = question.charAt(index);
        int sChar = qusString.charAt(index);
        if(fChar < sChar){		//compare of two string
            compared = -1;
        }
        else if(fChar > sChar){
            compared = 1;
        }
    }
    return compared;
}
}