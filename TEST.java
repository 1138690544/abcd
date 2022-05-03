package 实验三;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
 
public class TEST {
 
	public static void main(String[] args)throws IOException, ClassNotFoundException {
		File file = new File("D:\\java\\实验三\\src\\实验三\\student.txt");
		ObjectInputStream ois=null;
		
			ois = new ObjectInputStream(new FileInputStream(file));
			ArrayList<Student> arrayList = (ArrayList<Student>) ois.readObject();
			for (Student student : arrayList) {
				System.out.println(student);
			}
		        ois.close();
			
		}
 
	}
 

