import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		 Integer[] nums = {1,2,3,4,5,6,7,8,9,0};
		 Comparator comp = new Comparator<Integer>() {
			 @Override
			 public int compare(Integer o1, Integer o2) {
				 if(o1%2==0 && o2%2==0) {
					 if (o1 < 02)
						 return -1;
					 if (o1 == o2)
						 return 0;
					 return 1;
				 } else if(o1%2==1 && o2%2==1) {
					 if (o1 < 02)
						 return 1;
					 if (o1 == o2)
						 return 0;
					 return -1;
				 } else if (o1%2==1 && o2%2==0) {
					 return 1;
				 } else {
					 return -1;
				 }
			 }
		 };
		 Object output = Arrays.stream(nums).sorted(comp).collect(Collectors.toList());
		System.out.println(output.toString());
	}
}