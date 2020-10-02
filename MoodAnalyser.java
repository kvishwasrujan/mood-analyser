
public class MoodAnalyser {
	private String message;
	 MoodAnalyser(){
		
	}
	MoodAnalyser(String message){
		this.message= message;
	}
	
public String analyseMood(){
	try {
	message=message.toLowerCase();
	if(message.contains("sad")) 
		return "SAD";
	
	else 
		return "HAPPY";
	}
	catch(NullPointerException e){
		return "HAPPY";
		
	}
	
	
	
}
}
