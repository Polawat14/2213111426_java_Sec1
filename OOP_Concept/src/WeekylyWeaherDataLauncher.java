
public class WeekylyWeaherDataLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] rain = { 5.34, 2.34, 0.0, 0.0, 3.23, 0.0, 2.42 };
		double[] pressure = { 99.3, 95.34, 101.3, 98.42, 103.4, 100.0, 102.87 };
		
		WeeklyWeatherData wd = new WeeklyWeatherData();
		
		wd.setData(rain,pressure);
		wd.calculateStats();
		
		System.out.println("Maximum Rainfall: "+ wd.getMaxRain());
		System.out.println("Average Rainfall: "+ wd.getAvgRain());

	}

}
