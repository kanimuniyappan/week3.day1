package org.system;

public class Desktop extends Computer {
	
	public void desktopSize() {
		
		System.out.println("Desktop top size is 2.2inch");
		
	}

	public static void main(String[] args) {
		
		Desktop system = new Desktop();
				
				system.computerModel();
		        system.desktopSize();

	}

}
