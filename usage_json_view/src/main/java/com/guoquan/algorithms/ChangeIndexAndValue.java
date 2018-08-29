package com.guoquan.algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ChangeIndexAndValue {
	/**
	 * 题目：一副从1到n的牌，每次从牌堆顶取一张放桌子上，再取一张放牌堆底，
	 * 直到手上没牌，最后桌子上的牌是从1到n有序，设计程序，输入n，输出牌堆的顺序数组。（题目来源于一篇知乎上的文章）
	 */
	List<Integer> result = new ArrayList<Integer>();

	public List<Integer> playGame(List<Integer> cards) {
		LinkedList<Integer> result_residual = new LinkedList<Integer>();
		int counts_i = 0, counts_j = 0;
		for (int i = 0; i < cards.size(); i = i + 2) {
			result.add(cards.get(i));
			counts_i++;
		}
		for (int i = 0; i < cards.size() - 1; i = i + 2) {
			result_residual.add(cards.get(i + 1));
			counts_j++;
		}
		if (counts_i != counts_j && result_residual.size() > 1) {
			Integer first = result_residual.pollFirst();
			result_residual.addLast(first);
		}
		System.out.println(result);
		System.out.println(result_residual);
		if (result_residual.size() != 0) {
			playGame(result_residual);
		}
		return result;
	}
	
	public List<Integer> playGameRefactor(List<Integer> cards) {
		LinkedList<Integer> result_residual = new LinkedList<Integer>();
		int counts_i = 0, counts_j = 0;
		
		for(int i = 0; i < cards.size(); i++) {
			if (i % 2 == 0) {
				result.add(cards.get(i));
				counts_i++;
			}else {
				result_residual.add(cards.get(i));
				counts_j++;
			}
		}

		if (counts_i != counts_j && result_residual.size() > 1) {
			Integer first = result_residual.pollFirst();
			result_residual.addLast(first);
		}
		System.out.println(result);
		System.out.println(result_residual);
		if (result_residual.size() != 0) {
			playGameRefactor(result_residual);
		}
		return result;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("/**");
		System.out.println("* 题目：一副从1到n的牌，每次从牌堆顶取一张放桌子上，再取一张放牌堆底，");
		System.out.println("* 直到手上没牌，最后桌子上的牌是从1到n有序，设计程序，输入n，输出牌堆的顺序数组。（题目来源于一篇知乎上的文章）");
		System.out.println("**/");
		Integer number = 0;
		System.out.println("Please input the maximum number of the given card:");
		number = new Scanner(System.in).nextInt();
		ChangeIndexAndValue cia = new ChangeIndexAndValue();

		int n = number;

		List<Integer> cards = new ArrayList<Integer>(n);
		Integer i = 1;
		while (i <= n) {
			cards.add(i);
			i++;
		}
		System.out.println(cia.playGameRefactor(cards));
	}
}
