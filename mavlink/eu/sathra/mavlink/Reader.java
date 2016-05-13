package eu.sathra.mavlink;

import eu.sathra.mavlink.MavLink.Message;

public class Reader {

	public void read(final SerialPortCommunicator spc) {
		Thread thread = new Thread(new Runnable(){
			@Override
			public void run() {
				while (true){
					byte[] data = spc.readData();
					for (byte aByte : data) {
						System.out.format("%02X ", aByte);
					}
					System.out.println();
					if (data[5] == 0) {
						//do nothing - heartbeat message
					} else {
						System.err.println("different message found!!@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
					}
				}
			}
		});
		thread.start();
	}
	
}
