package chencj.cc.fastdfs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class TestClient {

	public static void main(String[] args) {
		try {
			FastDFSClient fastDFSClient = new FastDFSClient("classpath:fdfs_client.conf");
			String uploadFile = fastDFSClient.uploadFile("e:/12.jpg","jpg");
			System.out.println(uploadFile);
			byte[] downloadFile = fastDFSClient.downloadFile(uploadFile);
			System.out.println(downloadFile);
			FileOutputStream fos = new FileOutputStream(new File("e:/12_bak.jpg"));
			fos.write(downloadFile);
			fos.flush();
			fos.close();
 			int i = fastDFSClient.deleteFile(uploadFile);
			System.out.println(i);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
