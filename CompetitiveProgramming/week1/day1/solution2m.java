import java.util.*;
class solution2m{
	public static void main(String[] args) {
		int a[]={2,3,4,5};
		int l=a.length;
		int b[]=new int[l];
		int c[]=new int[l];
		int p=1;
		

		for(int i=0;i<l;i++){
			b[i]=p;
			p=p*a[i];
		}
		p=1;
		for(int j=l-1;j>=0;j--){
			c[j]=p*b[j];
			p=p*a[j];
		}

	for(int i=0;i<l;i++){
		System.out.println(c[i]);
	}
	}
}