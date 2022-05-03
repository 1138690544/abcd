package 实验三;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;


public class LIANGYUHAO {

	public static void main(String[] args) throws IOException{
		
		Student student1 = new Student(19, "Jim", 50,"Physics");
		Student student2 = new Student(20, "Jones", 27,"Maths");
		File file = new File("D:\\java\\实验三\\src\\实验三\\student.txt");
		ObjectOutputStream oos = null;
		
			oos = new ObjectOutputStream(new FileOutputStream(file));
			ArrayList<Student> arrayList = new ArrayList<>();
			Collections.addAll(arrayList, student1,student2);
			oos.writeObject(arrayList);
		    oos.close();
			
				
		
		}

	}


