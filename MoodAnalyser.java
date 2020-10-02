
public class MoodAnalyser {
	private String message;
	 MoodAnalyser(){
		
	}
	MoodAnalyser(String message){
		this.message= message;
	}
	
public String analyseMood(){
	message=message.toLowerCase();
	if(message.contains("sad")) 
		return "SAD";
	
	else 
		return "HAPPY";
	
	
	
}
}
