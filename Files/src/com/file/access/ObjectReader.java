package com.file.access;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.file.model.*;

public class ObjectReader {

	public static void main(String[] args) {

		try {
			FileInputStream iStream = new FileInputStream(
					"C:\\Users\\JusticeEngle\\eclipse-workspace\\Files\\src\\com\\file\\cars.txt");
			ObjectInputStream oiStream = new ObjectInputStream(iStream);

			Car car1 = (Car) oiStream.readObject();
			Car car2 = (Car) oiStream.readObject();
		}

		catch (IOException | ClassNotFoundException e) {
			System.out.println("Send error message to user");
			e.printStackTrace();
		}
		
		catch(Exception e) {
			System.out.println("Send notification to DevOps or Help Desk");
		}
	}

}
