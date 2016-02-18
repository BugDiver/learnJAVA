import java.io.*;
import java.util.*;
import java.lang.*;

public class ArrayFunction{

	public int[] selectOdd(int[] list) {
		int[] odds = new int[0];
		for (int i=0;i<list.length ;i++ ) {
			if(list[i]% 2 != 0){
				odds = Arrays.copyOf(odds ,odds.length+1);
				odds[odds.length -1] = list[i];
			}
		}
		return odds;
	}
}
