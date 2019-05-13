package corejava.yangyongfeng.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyText {

	public static void main(String[] args) {
		int temp = 0;
		// TODO Auto-generated method stub
		try {
			FileInputStream in = new FileInputStream("mF.BMP");
			FileOutputStream out = new FileOutputStream("mFCopy.BMP", true);
			while((temp = in.read()) != -1) {
				out.write(temp);
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
