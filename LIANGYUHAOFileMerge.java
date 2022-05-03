package 实验三;
import java.io.*;
public class LIANGYUHAOFileMerge  {
 public static void main(String[] args) throws IOException{
	 FileReader fr=null;
	 FileWriter fw=null;
	 File srcFile =new File("D:\\java\\实验三\\src\\实验三\\poem\\沁园春·雪.txt");
	 File srcFile2 =new File("D:\\java\\实验三\\src\\实验三\\poem\\虞美人.txt");
	 File destFile =new File("D:\\java\\实验三\\src\\实验三\\poem\\毛泽东选集.txt");
	 fr =new FileReader(srcFile);
	 fw =new FileWriter(destFile);
	 char[] cbuf = new char[5];
	 int len;
	 while((len =fr.read(cbuf))!=-1)
	 {
		 fw.write(cbuf,0,len);
	 }
	 fr =new FileReader(srcFile2);
	 while((len =fr.read(cbuf))!=-1)
	 {
		 fw.write(cbuf,0,len);
	 }
	 fw.close();
	 fw.close();
 }
}
