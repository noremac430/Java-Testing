
public enum tuna {
	bucky("Nice", "22"),
	kelsey("Cutie", "10"),
	julia("bigmistake", "12"),
	nicole("Italian", "13"),
	candy("Different", "14"),
	erin("iwish","16");
	
	private final String desc;
	private final String year;
	
	tuna (String description, String birthday){
		desc = description;
		year = birthday;
	}
	
	public String getDesc(){
		return desc;
	}
	public String getYear(){
		return year;
	}
}
