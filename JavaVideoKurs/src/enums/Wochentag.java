package enums;

public enum Wochentag {

	MONTAG, DIENSTAG, MITTWOCH, DONNERSTAG, FREITAG, SAMSTAG, SONNTAG;
	
	private final String inEnglish;
	private final String inChinese;

	Wochentag(String inEnglish, String inChinese){
		this.inEnglish = inEnglish;
		this.inChinese = inChinese;
	}
	
	Wochentag(){
		this("Not defined", "Not defined too");
	}
	
	public String getInEnglish(){
		return inEnglish;
	}
	
	public String getInChinese(){
		return inChinese;
	}

}
