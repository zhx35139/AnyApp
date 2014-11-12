package com.lacus.util;

public class Recursive {

	void hano(int num,String from,String temp,String to){
		if(num==1){
			System.out.println(from+"=>"+to);
		}else{
			hano(num-1,from,to,temp);
			hano(1,from,temp,to);
			hano(num-1,temp,from,to);
		}
		
	}
	public static void main(String[] args) {
		Recursive r = new Recursive();
		r.hano(3,"A","B","C");
	}
}
