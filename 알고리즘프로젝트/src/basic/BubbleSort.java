package basic;

public class BubbleSort {

	public static void main(String[] args) {
		int temp;
		int arr[] = {10,9,8,7,6,5,4,3,2,1};
		for(int i=0;i<10;i++) {
			for(int j=0;j<9-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		
		for(int z=0;z<10;z++) {
			System.out.println(arr[z]);
		}
		
	}

}
