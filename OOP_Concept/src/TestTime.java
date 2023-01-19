
public class TestTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1 = new Time(1,2,3);
		System.out.println(t1);//call toString() method
		
		Time t2 = new Time();//call default constructor
		System.out.println(t2);
		
		//Test setters and getters
		t1.setHour(4);
		t1.setMinute(5);
		t1.setSecond(6);
		System.out.println(t1);
		
		System.out.println("\nHour is:"+t1.getHour()+"hr.");
		System.out.println("Minute is:"+t1.getMinute()+"min.");
		System.out.println("Second is:"+t1.getSecond()+"sec.");
		
		//Test setTime()
		t1.setTime(58,59,23);
		System.out.println("\n"+t1);
		
		//Test nextSecond() and chining
		System.out.println(t1.nextSecond());
		//23:59:59
		System.out.println(t1.nextSecond().nextSecond().nextSecond());
		//00:00:02
	}

}
