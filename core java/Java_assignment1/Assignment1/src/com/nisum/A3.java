package com.nisum;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s=args[0];
     int count1=0;
     int count2=0;
     int count3=0;
     int count4=0;
     for(int i=0;i<s.length();i++)
     {
    	 if(s.charAt(i)>='A' && s.charAt(i)<='Z')
    	 {
    		 count1=count1+1;
    	 }
    	 else if(s.charAt(i)>='a' && s.charAt(i)<='z')
    	 {
    		 count2=count2+1;
    	 }
    	 else if(s.charAt(i)>= '0' && s.charAt(i)<= '9')
    	 {
    		 count4=count4+1;
    	 }
    	 else
    	 {
    		 count3=count3+1;
    	 }
     }
     int len=s.length();
   System.out.println("Percentage of Upperrcase is:"+(count1*100/len)+"%");
   System.out.println("Percentage of Lowercase is:"+(count2*100/len)+"%");
   System.out.println("Percentage of specialcharcter is:"+(count3*100/len)+"%");
   System.out.println("Percentage of Digits is:"+(count4*100/len)+"%");
	}
	}


