package p2;

import java.util.HashSet;

public class App01 {
	
	public static void main(String[] args) {
		
		HashSet<Data> hs=new HashSet<Data>(); // 16
		Data d1=new Data(12);
		Data d2=new Data(21);
		Data d3=new Data(22);
		Data d4=new Data(54);
		Data d5=new Data(66);
		Data d6=new Data(66);
		Data d7=new Data(46);
		Data d8=new Data(67);
		
		hs.add(d1);hs.add(d2);hs.add(d3);hs.add(d4);
		hs.add(d5);hs.add(d6);hs.add(d7);hs.add(d8);
		
		System.out.println(hs);
		
		
		
		
	}

}
