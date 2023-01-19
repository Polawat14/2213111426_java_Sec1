
public class Time {
	//attributes
	private int second;
	private int minute;
	private int hour;
	
	//Constructor method
	public Time() {
		this.second = 0;
		this.minute = 0;
		this.hour = 0;
	}
	//Constructor with parameter
	public Time(int second,int minute,int hour) {
		this.second = second;
		this.minute = minute;
		this.hour = hour;
	}
	
	//The public getters/setters for the private variables.
	public int getHour() {
		return this.hour;
	}
	public int getMinute() {
		return this.minute;
	}
	public int getSecond() {
		return this.second;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	//toString method in the form of "hh:mm:ss" with leading zeros
	public String toString() {
		//use built-in function String.format()
		return String.format("%02d:%02d:%02d",hour,minute,second);//%02d = 2 decimal points
	}
	
	public void setTime(int second,int minute,int hour) {
		this.second=second;
		this.minute=minute;
		this.hour=hour;
	}
	
	//Advances this Time instance by one second
	public Time nextSecond() {
		++second;
		if(second>=60) {
			second = 0;
			
			++minute;
			if(minute>=60) {
				minute=0;
				++hour;
				if(hour>=24) {
					hour=0;
				}//end if hour
			}//end if minute
			
		}//end if second
		
		//Return "this" instance, to support chaining operations
		//
		return this;
	}
}
