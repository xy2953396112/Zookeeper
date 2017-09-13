package com.zk.Client_Server;


public class Test {
	public static void main(String[] args) {
		
		System.out.println("主线程开始了");
		
		Thread thread = new Thread(new Runnable() {
			
			public void run() {
				System.out.println("线程开始了");
				while(true){
					
				}
			}
		});
		//Daemon:守护
		thread.setDaemon(true);
		thread.start();
		
	}
	
	

}
