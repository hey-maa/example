package com.tns.day4;

public class access_modifier {
    //four types
	//default,private,protected,public
	 int varDef = 10;
	 public int varPub = 20;
	 private int varPri = 30;
	 protected int varProtected = 40;
	 
	 void methodDefault() {
		 System.out.println("Default access BAse class");
		 System.out.println("Default Variable:" + varDef);
	 }
	 public void methodPublic() {
		 System.out.println("Public access BAse class");
		 System.out.println("Public Variable:" + varPub);
	 }
	 private void methodPrivate() {
		 System.out.println("Private access BAse class");
		 System.out.println("Private Variable:" + varPri);
	 }
	 protected void methodProtected() {
		 System.out.println("Protected access BAse class");
		 System.out.println("Default Variable:" + varDef);
	 }
}
