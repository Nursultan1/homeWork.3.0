package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	double[] nums=new double[15];
     nums[0]=0.3;
     nums[1]=9.8;
     nums[2]=4.7;
     nums[3]=3.8;
     nums[4]=6.78;
     nums[5]=6788.89;
     nums[6]=90.08;
     nums[7]=-2.5;
     nums[8]=3.1;
     nums[9]=0.6;
     nums[10]=-8.7;
     nums[11]=15.45;
     nums[13]=8.4;
     nums[14]=-8.98;
     System.out.println(Arrays.toString(nums));
     double result=0;
     for (double d:nums) {
      result+=d;

     }
     System.out.println("Среднее арифметическое значение "+ result/ nums.length);
    }
}
