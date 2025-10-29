package h2;

public class H2_main {
public static void main(String[] args) {
	int i = 7;
	int j = 14;
	int k = 21;
	int min;
	int max;
	
	if (i<j && i<k) {
		min = j;
	} else if (j<i && j<k) {
		min = j;
	} else {
		min=k;
	}
	if (i>j && i>k) {
		max = j;
	} else if (j>i && j>k) {
		max = j;
	} else {
		max=k;
	}
	System.out.println("Das Maximun beträgt " +max+ ". Das Minimum beträgt " +min+ ".");
}
}
