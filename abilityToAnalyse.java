import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class abilityToAnalyse {

	@Test
	public void RespondHappy() {
		MoodAnalyser moodobj= new MoodAnalyser("Iam in a Happy mood");
		String mood = moodobj.analyseMood() ;
		String expected ="HAPPY";
		Assert.assertEquals(expected, mood);
	}
	@Test
	public void RespondSad() {
		MoodAnalyser moodobj= new MoodAnalyser("Iam in a Sad mood");
		String mood = moodobj.analyseMood() ;
		String expected ="SAD";
		Assert.assertEquals(expected, mood);
	}

}
