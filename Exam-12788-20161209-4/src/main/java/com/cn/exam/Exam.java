package com.cn.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;


public class Exam {
	public static void main(String[] args) {
			show();
	}
	public static void show(){
		Random random = new Random();
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer,List<Integer>> map1=new HashMap<Integer,List<Integer>>(); 
		Map<Integer,List<Integer>> map2=new HashMap<Integer,List<Integer>>(); 
		List<Integer> sortList = new ArrayList<Integer>();
		System.out.print("随机生成50个小于100的整数，分别为：");
		for (int i = 0; i < 50; i++) {
			int num=random.nextInt(100);
			list.add(num);
			System.out.print(num+",");
		}
		
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			map1.put(Math.round(it.next()/10), list);
		}
		System.out.println();
		System.out.println("Map中的数据为："+map1.toString());
		
		Set<Integer> k = map1.keySet();
		Iterator<Integer> it1 = k.iterator();
		while(it1.hasNext()){
			sortList.add(it1.next());
		}
		
		Collections.sort(sortList);
		map1.clear();
		Iterator<Integer> it2 = sortList.iterator();
		while (it2.hasNext()) {
			map2.put(it2.next(), list);
		}
		System.out.println("排序后map为："+map2.toString());
	}

}

