package pert8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	String userDir = System.getProperty("user.dir");
	String fileDir = userDir.concat(File.separator + "src" + File.separator + "pert8");
	
	// File handling = Create file, list file, read, write(, Delete File, Replace(Update).
	
	void CreateFile() throws IOException {	
		System.out.println("File dir : " + fileDir);
		
		File f = new File(fileDir, "Testing1.txt");
		
		File Dir = new File(fileDir, "filehandlingFolder");
		
		if (!Dir.exists()) {
			Dir.mkdir();
			System.out.println("Directory berhasil dibuat");
		}
		
		File fDir = new File(Dir, "TextFile1.txt");
		
		if(fDir.createNewFile()) {
			System.out.println("File berhasil dibuat");
		} else {
			System.out.println("File tidak berhasil di buat");
		}
		try {
			System.out.println("File path : " + f.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File[] files = new File[10];
		
		for (int i = 0; i < 10; i++) {
			files[i] = new File(Dir, ("file" + i + ".txt"));
		}
		
		for (File file : files) {
			if(!file.createNewFile()) {
				System.out.println("file tidak berhasil dibuat");
			}
		}
		
		if (!f.exists()) {
			System.out.println("File ini belom ada");
			if (f.createNewFile())
			System.out.println("File telah berhasil di buat");
		}
	}
	
	public void listFiles(File dir) throws IOException {
		File[] files = dir.listFiles();
		String[] fileNames = dir.list();		
		
		int idx= 1;
		for (String string : fileNames) {
			System.out.printf("%d. nama File : %s\n", idx++, string);
		}
		boolean allfilesE = true;
		for (File f : files) {
			if (!f.exists()) {
				System.out.println("file name : " + f.getName() + "Isn't exists");
				allfilesE = false;
			}			
		}
		if (allfilesE) {
			System.out.println("Semua File hadir");
		}
	}
	
	void read(File f) throws IOException {
//		FileReader fr = new FileReader(f);
//		fr.
		if (f.exists()) {
			Scanner sc = new Scanner(f);
			
			Vector<String> Data = new Vector<>();
			
			while (sc.hasNextLine()) {
				Data.add(sc.nextLine());
			}
			
			int idx =1;
			for (String string : Data) {
				System.out.printf("Baris ke %d. adalah %s\n", idx++, string);
			}
			
			Data.add("Raihan");
			
			FileWriter fw = new FileWriter(f);
			for (String string : Data) {
				fw.write(string.concat("\n"));
			}
			
			fw.close();
		} else {
			write(f);
			read(f);
		}
		
		
	}
	
	void handleImage(String path) throws IOException {
		byte[] bytes = Files.readAllBytes(new File(path).toPath());
		File outputFile = new File(fileDir, "output.png");
		FileOutputStream fos = new FileOutputStream(outputFile);
		fos.write(bytes);
		
	
		for (byte b : bytes) {
			System.out.println(b);
		}
		
		
	}
	
	void write(File f) throws IOException {
		if (f.canWrite()) {
			System.out.println("You are free to write in ");
			
			FileWriter fw = new FileWriter(f);
			
//			Write();
//			flush();
//			close();
			
			fw.write("Elvin\n" + 
					"Chato\n" + 
					"Kelvin\n" + 
					"Richard\n" + 
					"Nadia\n" + 
					"Alexander\n" + 
					"Huandika");
			fw.flush();
			
			
			
			fw.write("\nnew Line After the flush");
			fw.write("\nProbably will be flushed later");
			
			fw.close();
			
//			try {
//				FileWriter fw2 = new FileWriter(f);
//				fw2.write("Testing Write after close");
//				fw2.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				System.out.println("Error : " + e.getMessage());
//			}
			
			System.out.println("Writing ended-");
		} else if (!f.exists()) {
			System.out.println("Masuk sini");
			CreateFile();
			write(f);
		} 
		else if(!f.canWrite()) {
			System.out.println("the file isn't writable");
		} 
		
		
	}
	
	public Main() {
		// TODO Auto-generated constructor stub
		File f = new File(fileDir, "fileHandlingFolder"), wf = new File(f, "TextFile1.txt");
//		wf.setWritable(false);
		try {
//			CreateFile();
//			listFiles(f);
//			write(wf);
//			read(wf);
			
			handleImage("C:\\Users\\user\\OneDrive\\Pictures\\Flowchart ES.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
