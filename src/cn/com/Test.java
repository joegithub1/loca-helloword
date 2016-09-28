package cn.com;

import java.lang.reflect.Array;

import org.apache.catalina.tribes.util.Arrays;

public class Test {

	public static void main(String[] args) {
		/**
		int num=1;//1-5
		int count=5;
		for (int i = 1; i <= count; i++) {
			for (int j = 1; j <= count; j++) {
				if(j!=i){
					System.out.print(j+"\t");
				}
			}
			System.out.println();
			num++;
		}
		*/
		int [] arr={12,2,10};
		int temp=0;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i] > arr[i+1]){
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}
	
	
}
