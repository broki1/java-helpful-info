import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create ArrayList of Strings
		HashMap<String, Float> weatherInfo = new HashMap<String, Float>();
		weatherInfo.put("wind", 55f);
		weatherInfo.put("minTemperature", 20.5f);
		weatherInfo.put("maxTemperature", 50.8f);
		weatherInfo.put("humidity", 50.0f);
		weatherInfo.put("airPressure", 12f);
		
		System.out.println(weatherInfo.entrySet());
		System.out.println(weatherInfo.keySet());
		System.out.println(weatherInfo.values());
		
		System.out.println("\nIterating using keySet:");
		for(String key : weatherInfo.keySet()) {
			System.out.println(key + " : " + weatherInfo.get(key));
		}
		
		System.out.println("\nIterating using EntrySet:");
		for(HashMap.Entry<String, Float> entry : weatherInfo.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println("\nIterating using ForEach:");
		weatherInfo.forEach((k, v) -> System.out.println(k + " : " +  v));
		
		weatherInfo.put("wind", 66.7f);
		weatherInfo.remove("airPressure");
		
		System.out.println("\nUpdated weather information:");
		weatherInfo.forEach((k, v) -> System.out.println(k + " : " +  v));
		
		weatherInfo.clear();
		
		System.out.println("\nLast update:");
		for(HashMap.Entry<String, Float> entry : weatherInfo.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		
	}

}
