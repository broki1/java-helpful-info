package com.file.access;

import java.io.*;

public class Writer {

	public static void main(String[] args) {

		// Write to files using File, FileWriter and PrintWriter objects
		
//		try {
//			File file = new File(
//					"C:\\Users\\JusticeEngle\\OneDrive - Xpanxion\\Desktop\\files\\the-meaning-of-life.txt");
//			FileWriter fw = new FileWriter(file);
//			PrintWriter pw = new PrintWriter(fw);
//			
//			for(int i = 1; i <= 10; i++) {
//				pw.println(i + " is the lonliest number.");
//			}
//			
//			pw.close();
//		}
//
//		catch (IOException e) {
//			System.out.println("File not found.");
//		}
		
		
		// Using BufferedWriter to write files

//		BufferedWriter writer = null;
//
//		try {
//			
//			String name = "Justice Engle";
//
//			File file = new File("C:\\Users\\JusticeEngle\\OneDrive - Xpanxion\\Desktop\\Files\\names.txt");
//
//			if (!file.exists()) {
//				file.createNewFile();
//			}
//
//			FileWriter fWriter = new FileWriter(file);
//			writer = new BufferedWriter(fWriter);
//			writer.write(name);
//
//			System.out.println("File written to successfully!");
//
//		}
//
//		catch (IOException e) {
//			System.out.println("\nIO Exception occured.");
//		}
//
//		finally {
//			
//			if(writer != null) {
//				try {
//					writer.close();
//				}
//				
//				catch(Exception e) {
//					System.out.println("Error in closing BufferedWriter.");
//				}
//			}
//		}

	}

}
