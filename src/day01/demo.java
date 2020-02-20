package day01;

import java.util.Arrays;
public class demo {

	public static void main(String[] args) {
//		int[] arr = {40, 92, 1, 54, 22, 22, 33,88, 18};
//		String[] names = {"Oscar", "Edgar", "Frank", "Laurent", "Hugo", "Jacob", "Aaron", "Gino", "Angus", "Ken"};
//		//按照数值大小顺序排序
//		Arrays.sort(arr);
//		//按照字典顺序排序
//		Arrays.sort(names);
//
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(names));
		
		//二分法查找
//		Arrays.sort(arr);
//		int index = Arrays.binarySearch(arr, 88);
//		System.out.println(index);
//		index = Arrays.binarySearch(arr, 90);
//		System.out.println(index);
//		index = Arrays.binarySearch(arr, 22);
//		System.out.println(index);
		

		int[] arr = {1,2,3,4,5,6};
		int[] arr1 = arr;
//		arr = new int[arr.length + 1];
//		System.arraycopy(arr1, 0, arr, 0, arr1.length);
		arr = Arrays.copyOf(arr1, arr1.length + 1);
		arr[6] = 7;
		System.out.println(Arrays.toString(arr));
	}

}
