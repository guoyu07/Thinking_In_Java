package com.elephant.thinkinginjava;

/**
 * Four types of initializations
 * 								1. initialize when they were defined.				like s1 and s2
 * 								2. initialize in constructor.						like s3,toy,and castille
 * 								3. lazy initialize(initialize when they have to).	like s4
 *								4. initialize in non-static block.					like i
 */
class Soap{
	private String s;
	Soap(){
		System.out.println("Soap()");
		s="Constructed";
	}
	public String toString(){
		return s;
	}
}
public class Bath {
	private String s1="Happy",s2="Happy",s3,s4;
	private Soap castille;
	private int i;
	private float toy;
	public Bath(){
		System.out.println("Inside Bath()");
		s3="Joy";
		toy=3.14f;
		castille=new Soap();
	}
	{i=47;}
	public String toString(){
		if(s4==null)
			s4="Joy";
		s1="haha";
		return
				"s1="+s1+"\n"+
				"s2="+s2+"\n"+
				"s3="+s3+"\n"+
				"s4="+s4+"\n"+
				"i ="+i+ "\n"+
				"toy="+toy+"\n"+
				"castille="+castille;
	}
	public static void main(String[] args){
		Bath bath=new Bath();
		System.out.println(bath);
	}
}
