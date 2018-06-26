import java.util.*;
class solution1m{
	public static void main(String[] args) {
		int a[]={9,6,4,2};
		int minprice=a[0];
		int maxprofit=a[1]-a[0];
		for(int i=1;i<a.length;i++){
			int minprice2=a[i];
			int currentprofit=minprice2-minprice;
			maxprofit=Math.max(maxprofit,currentprofit);
			minprice=Math.min(minprice,minprice2);
		}
		System.out.println(maxprofit);
	}
}