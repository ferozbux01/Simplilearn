package fileHandling;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		try {
			File f = new File("D:\\FileHandling\\fileHandling.txt");
			
			if(f.createNewFile()) {
				System.out.println("New File Created");
				}
			else {
				if(f.exists())
				{
					System.out.println("File Already Exists. ");
					System.out.println("Absolute Path " +f.getAbsolutePath());
					System.out.println("File Name " + f.getName());
					System.out.println("File Class "+f.getClass());
					System.out.println("File Parent " +f.getParent());
					System.out.println("File Space " +f.getUsableSpace());
					System.out.println("File Length "+f.length());
					System.out.println("File List" + f.list());
				}
				else {
					System.out.println("File Doesn't Exists");
				}
				boolean b=f.delete();
				if(b==true)
				{
					System.out.println("Files is deleted");
				}
				else {
					System.out.println("File not Deleted");
				}
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
