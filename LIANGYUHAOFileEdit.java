package 实验三;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LIANGYUHAOFileEdit {
	public static void main(String[] args) throws IOException{
	FileReader fr=null;
	FileReader fr1=null;
	 FileWriter fw=null;
	 File srcFile =new File("D:\\java\\实验三\\src\\实验三\\source.txt");
	 File destFile =new File("D:\\java\\实验三\\src\\实验三\\target.txt");
	 fr =new FileReader(srcFile);
	 fw =new FileWriter(destFile);
	 char[] cbuf = new char[5];
	 int len;
	 while((len =fr.read(cbuf))!=-1)
	 {
		 fw.write(cbuf,0,len);
	 }
	System.out.printf("已成功拷贝文件，一共传输了"+srcFile.length()+"个字符");
	PrintWriter pw = new PrintWriter(fw);
	pw.println("但我最经常逛github！");
	pw.flush();
	fr1 =new FileReader(destFile);
	int len1;
	 while((len1 =fr1.read(cbuf))!=-1)
	 {
		 System.out.print((char)len1);
	 }
	 fr1.close();
	 fw.close();
	 fw.close();
     
}
}