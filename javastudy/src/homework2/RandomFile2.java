package src.homework2;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class RandomFile2 {
	public static void main(String[] args) {
		
		try {
			RandomAccessFile ra = new RandomAccessFile("C:\\test\\rand2.txt", "rw");
			ra.seek(9);
			ra.write("park".getBytes());
			while(ra.getFilePointer() < ra.length()) {
				String str=ra.readLine();
				str=new String(str.getBytes("8859_1"), "utf-8");
			}
			ra.close();//저장
			System.out.println("파일이 수정되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
