import javax.swing.*;

import javax.swing.JOptionPane;

public class Lab606 {

	public static void main(String[] args) {
		
		int[] nums = {25, 78, 41, 22, 36, 85,37};
		int index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array "));
		checkindex(nums,index);
		while(!checkindex(nums,index)) {
			index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array ,again "));
		}
		JOptionPane.showMessageDialog(null, 
							"Current data, nums["+currentData(nums,index)+"] is "+nums[index]+"\n"+
							(prevData(nums,index)!=-1?"Previous data, nums["+prevData(nums,index)+"] is "+nums[index-1]:"No previous data")+"\n"+
							(nextData(nums,index)!=7?"Next data, nums["+nextData(nums,index)+"] is "+ nums[index+1]:"No next data"));
			     
		}//end of main 
	
	public static boolean checkindex(int[]nums,int index) {
		return (index>=0&&index<=6);
	}//end of check
	public static int currentData(int[]nums,int index) {
		return index;
	}//end of current
	public static int prevData(int[]nums,int index){
		return index-1;
	}//end of prevdata
	public static int nextData(int[]nums,int index){
		return index+1;
	} //end of nextdata
}