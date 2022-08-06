package _12_slot_machine;

import java.net.MalformedURLException;

public class sm_runner {
public static void main(String[] args) {
	try {
		new sm().run();
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}