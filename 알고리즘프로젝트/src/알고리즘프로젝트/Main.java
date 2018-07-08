package 알고리즘프로젝트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	ArrayList<String> list = new ArrayList<String>();
	
	boolean aa=false;
	while(st.hasMoreTokens()) {
			list.add(st.nextToken());
				
	}
	if(list.size()==8&&aa==true) {
	for(int a=0;a<list.size();a++) {
		if(1<=Integer.parseInt(list.get(a))&&Integer.parseInt(list.get(a))<=8) {
		if(Integer.parseInt(list.get(a))==(a+1)) {
			if(a==list.size()-1) {
				System.out.println("ascending");
			}
				
		}
		else if(Integer.parseInt(list.get(a))==(list.size()-a)) {
			if(a==list.size()-1) {
				System.out.println("descending");
			}
				
		}
		else {
			
				System.out.println("mixed");
				break;
			
		}
		}
			
	}
	}
		
	
}
}
/*
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[8];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }
        sc.close();
         
        String output = "";
        for (int i = 0; i < inputs.length - 1; i++) {
            if (inputs[i] == inputs[i + 1] - 1) {
                output = "ascending";
            } else if (inputs[i] == inputs[i + 1] + 1) {
                output = "descending";
            } else {
                output = "mixed";
                break;
            }
        }
        System.out.println(output);
    }
}
*/