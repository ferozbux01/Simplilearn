package innerClass;

import innerClass.CPU.RAM;

public class InnerMain {
public static void main(String[] args) {
	CPU obj = new CPU();
	CPU.Processor p = obj.new Processor();
	CPU.RAM r = obj.new RAM();
	System.out.println("The speed of the processor is " + p.speed());
	System.out.println("The Capacity of the RAM is " + r.gb() + "GB");
}
}
class CPU{

	class Processor{
		double speed() {
			return 5.6;
		}
	}
	
	protected class RAM{
		int gb() {
			return 16;
		}
		}
	
}