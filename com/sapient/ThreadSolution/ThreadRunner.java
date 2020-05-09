package com.sapient.ThreadSolution;

import com.sapient.ThreadSolution.Tic;

class Tic extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(500);
				System.out.print("tic");
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadRunner {

	public static void main(String[] args) throws InterruptedException {
		Tic thread1=new Tic();
		thread1.start();
		for(int i=0;i<10;i++) {
			Thread.sleep(1000);
			System.out.print("-toc\n");
		}

	}

}
