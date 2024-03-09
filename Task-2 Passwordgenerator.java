package tasklist;
//import java.util.Random;
import java.util.*;

public class passwordgenerator {
	public static void main(String []args) {
		String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String symbols="!@#$%^&*(){}[]:<>?/.,-_=";
		String combination=upper+lower+numbers+symbols;
		int len = 8;
		char[] password = new char[len];
		Random r = new Random();
		for(int i=0;i<len;i++) {
			password[i] = combination.charAt(r.nextInt(combination.length()));
		}
		System.out.println("Generated Password is " + new String(password));
		
		
	}

}
