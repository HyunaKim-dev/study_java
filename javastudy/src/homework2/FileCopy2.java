package src.homework2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStream;

public class FileCopy2 {
	public static void main(String[] args) {
		String str="";
		String file1="c:\\test\\abc.txt";
		String file2="c:\\test\\abcCopy.txt";
		OutputStream os=null;
		BufferedReader reader=null;
		BufferedWriter writer=null;

		try {
			os=new FileOutputStream(file1);
			System.out.println("입력하세요 : ");
			while(true) {
				int ch=System.in.read();
				if(ch==13) break;
				os.write(ch);

				reader = new BufferedReader(new FileReader(new File(file1)));
				writer = new BufferedWriter(new FileWriter(new File(file2)));
				while(true) {
					str = reader.readLine();//파일 내용 읽음
					if(str==null) break;
					writer.write(str+"\r\n");//파일에 작성
				}
			}
			System.out.println("파일이 저장되었습니다.");
			System.out.println("파일 복사가 완료되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(reader!= null) reader.close();//따로 처리
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(writer != null)writer.close();				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
