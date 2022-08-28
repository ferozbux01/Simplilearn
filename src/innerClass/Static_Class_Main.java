package innerClass;

public class Static_Class_Main {
	public static void main(String[] args) {
	CP .USB obj= new CP.USB();
	
	System.out.println("Total Ports are " + obj.totalPorts());
	}
		// TODO Auto-generated constructor stub
	}
class CP{
	static class USB{
		int usb2 = 2;
		int usb3 = 1;
		int totalPorts() {
			return usb2+usb3;
		}
		
	}
}