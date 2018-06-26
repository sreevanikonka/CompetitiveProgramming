import java.util.*;
class solution3{
	public static void main(String[] args) {
		int p1=0;
		int p2=0;
		int arr[]={-10,-10,1,3,2};
		int l=arr.length;
		Arrays.sort(arr);
		p1=arr[0]*arr[1]*arr[l-1];
		p2=arr[l-1]*arr[l-2]*arr[l-3];
		if(p1>p2){
			System.out.println(p1);
		}
		else{
			System.out.println(p2);
		}

	}
}