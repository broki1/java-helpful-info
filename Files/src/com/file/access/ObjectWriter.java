package com.file.access;

import com.file.model.*;

import java.io.*;

public class ObjectWriter {

	public static void main(String[] args) {
		
		// car and engine #1

		Engine engine = new Engine(1000, "dank");

		Wheel[] wheels = { new Wheel("big", 24, "front-left"), new Wheel("small", 22, "front-right"),
				new Wheel("medium", 23, "back-left"), new Wheel("gigantic", 48, "back-right") };

		Car car = new Car("red", 250, "good", 20, "dankmobile", 2024, engine, wheels);
		
		// car and engine #2
		
		Engine engine2 = new Engine(50, "awesome");

		Wheel[] wheels2 = { new Wheel("normal", 20, "front-left"), new Wheel("normal", 20, "front-right"),
				new Wheel("normal/steel", 20, "back-left"), new Wheel("normal-spinning", 20, "back-right") };

		Car car2 = new Car("black", 160, "fantastic", 6, "Honda", 2022, engine2, wheels2);
		
		try {
			
			FileOutputStream fStream = new FileOutputStream(new File("C:\\Users\\JusticeEngle\\eclipse-workspace\\Files\\src\\com\\file\\cars.txt"));
			ObjectOutputStream oStream = new ObjectOutputStream(fStream);
			
			oStream.writeObject(car);
			oStream.writeObject(car2);
			
			System.out.println("Objects written to file successfully.");
			
			oStream.close();
			fStream.close();
		}
		
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
