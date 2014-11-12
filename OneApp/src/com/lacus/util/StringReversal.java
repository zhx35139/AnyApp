package com.lacus.util;

public class StringReversal {
	public String getString(String str){
		char[] s = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i = s.length-1;i>=0;i--){
			sb.append(s[i]);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		StringReversal sr = new StringReversal();
		String str = sr.getString("abcdyththdsdggter");
		System.out.println(str);
	}

}
