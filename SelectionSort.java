package SelectionSort.java;
public class SelectionSort {
	private int temp;
	public SelectionSort() {
		
	}
	public int[] SelectionSort(int[] x) {
		for (int i = 0; i < x.length; ++i) {
			for (int j= i+1; j < x.length; ++j) {
				if (x[i] > x[j]) {
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
					}
				} // end of inner for loop        
			} // end of outer for loop return x;    
		return x;
		}
}