package collections;

import java.util.ArrayList;
import java.util.List;

public class Collection {
//Array,arrayList/Multidimensitional array
	public static void main(String[] args) {
		
	
		boolean res=hasDuplicates(new int[] {5,3,10,1,1});
		System.out.println(res);
		boolean res1=hasDuplicates(new int[] {5,3,10,1});
		System.out.println(res1);
	}
	public static   boolean hasDuplicates(int[] nums) {
		
        if (nums.length<=1) return false;
		for (int i = 0; i <= nums.length-1; i++) {
			for (int k=i+1;k<nums.length;k++) {
				System.out.println(nums[i]+"->"+nums[k]);
				if(nums[i]==nums[k]) {
					return true;
				}
				
			}
	}
	return false;
}
	public   boolean hasDuplicates(List <Integer>nums) {
		
	   if (nums.size()<=1) return false;
			for (int i = 0; i <= nums.size()-1; i++) {
				for (int k=i+1;k<nums.size();k++) {
					System.out.println(nums.get(i)+"->"+nums.get(i));
					if(nums.get(i)==nums.get(i)) {
						return true;

}}}return false;}}