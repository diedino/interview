import java.util.Arrays;

public class ArrayProduct {

	public static void main(String[] args) {
		int[] numbers = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
		int multi = 1, zeroIndex=0;
		boolean hasZero = false;
		for(int i=0; i<numbers.length; i++)
			if (numbers[i]!=0)
				multi *= numbers[i];
			else {
				hasZero = true;
				zeroIndex = i;
			}
		int[] result = new int[numbers.length];
		if (hasZero)
			result[zeroIndex] = multi;
		else
			for(int i=0; i<numbers.length; i++) {
				if (numbers[i] != 0) 
					result[i] = multi/numbers[i];
				else
					result[i] = multi;
			}
		for (int i = 0; i < result.length; i++) {
			if (i > 0)
            	System.out.print(", ");
        	System.out.print(result[i]);
    	}
    	System.out.println();
	}
}