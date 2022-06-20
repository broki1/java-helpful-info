import java.io.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileReader fr = new FileReader("C:\\Users\\JusticeEngle\\OneDrive - Xpanxion\\Desktop\\output.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String line;
			
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
//		FileWriter fw;
//		
//		try {
//			
//			fw = new FileWriter("C:\\Users\\JusticeEngle\\OneDrive - Xpanxion\\Desktop\\output.txt");
//			BufferedWriter bw = new BufferedWriter(fw);
//			
//			bw.write("Karen\n");
//			bw.write("Chad\n");
//			bw.write("Justice\n");
//			
//			bw.close();
//			
//			System.out.println("Done writing!");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			
//		}

	}

}
