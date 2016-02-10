package com.sapient.executive;
import java.util.*;
public class PerfectNumberGenerator {
	public boolean isPerfectNumber(int p){
		if(p<0)
			throw new IllegalArgumentException();
		
		Set<Integer> lst=new HashSet<Integer>();
		int i=1;
		int temp=0;
		while(i<p){
			if(p%i==0)
				lst.add(i);
			i++;
		}
		for(Integer l:lst){
			temp+=l;
		}
		if(temp==p)
			return true;
		return false;
	}
	public Set<Integer> printPerfectNumbers(int p){
		if(p<0)
			throw new RuntimeException();
		Set<Integer> lst=new HashSet<Integer>();
		int i=1;
		while(i<=p){
			if(isPerfectNumber(i))
				lst.add(i);
			i++;
		}
		return lst;
	}
	
	public static void main(String[] args){
		PerfectNumberGenerator pg=new PerfectNumberGenerator();
		System.out.println(pg.isPerfectNumber(29));
		System.out.println(pg.printPerfectNumbers(100));
	}
}
