package basic;

public class SelectSort {

	public static void main(String[] args) {
		int min,temp,index;
		index =0;
		int arr[] = {10,9,8,7,6,5,4,3,2,1};
		for(int i=0;i<10;i++) {
			min = 9999;
			for(int j=i;j<10;j++) {
				if(min>arr[j]) {
					min = arr[j];
					index = j;
				}
			}
			temp = arr[i];
			arr[i] = min;
			arr[index] = temp;  
		}
		for(int z=0;z<10;z++) {
			System.out.println(arr[z]);
		}
		
	}

}
