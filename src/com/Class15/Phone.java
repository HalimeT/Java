package com.Class15;

public class Phone {
	boolean cam;
	int button,screen;
	String color,brand;

	public static void main(String[] args) {
		// Create a Class “Phone”.
		//Create 3 Objects of it: iPhone, Android, Nokia with specific  attributes and behaviours.
		Phone ip=new Phone();
		ip.cam=true;
		ip.button=5;
		ip.screen=2;
		ip.color="rose";
		ip.brand="Apple";
		
		ip.capturePhoto();
		ip.communicate();
		ip.listenMusic();
		 
		Phone and=new Phone();
        and.cam=true;
        and.button=4;
        and.screen=1;
        and.color="Black";
        and.brand="Samsung";

		and.capturePhoto();
		and.communicate();
		and.listenMusic();
        
        Phone nok=new Phone();
        nok.cam=true;
        nok.button=2;
        nok.screen=2;
        nok.color="grey";
        nok.brand="Nokia";

		nok.capturePhoto();
		nok.communicate();
		nok.listenMusic();
	}
        
        void capturePhoto() {
        	System.out.println("capture photo by "+brand);
        	  }
        void communicate() {
        	System.out.println("communicate by "+brand);
        }
        void listenMusic() {
        	System.out.println("listen musics by "+brand);
        }
        

	}


