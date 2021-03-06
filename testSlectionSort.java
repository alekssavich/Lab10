package SelectionSort.java;

import static org.junit.Assert.*;
import org.junit.Assert;import org.junit.Test;
import org.junit.Test;

public class testSelectionSort  {
<<<<<<< HEAD
	private SelectionSort temp1;
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixes();
		testDuplicates();

		}
>>>>>>> PosNeg
	public void testPositive(){
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;
		
		
		int[] Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = 7;
		Sortedarr[2] = 8;
		Sortedarr[3] = 9;
		Sortedarr[4] = 10;
		
		SelectionSort temp1 = new SelectionSort();
		int[] maxValue = temp1.SelectionSort(arr);
		assertArrayEquals(Sortedarr,arr);
		  
		}

	
	public void testNegative(){        
		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = -9;
		arr[2] = -7;
		arr[3] = -10;
		arr[4] = -2;
		
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -2;
		Sortedarr[1] = -7;
		Sortedarr[2] = -8;
		Sortedarr[3] = -9;
		Sortedarr[4] = -10;
		
		SelectionSort temp1 = new SelectionSort();
		int[] maxValue = temp1.largest(arr);
		assert maxValue == -2;
		}

>>>>>>> MixDup
	public void testMixes(){        
		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = 9;
		arr[2] = -7;
		arr[3] = 10;
		arr[4] = -2;
		
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -2;
		Sortedarr[1] = 7;
		Sortedarr[2] = -8;
		Sortedarr[3] = 9;
		Sortedarr[4] = -10;
		
		SelectionSort temp1 = new SelectionSort();
		int[] maxValue = temp1.SelectionSort(arr);
		assertArrayEquals(Sortedarr,arr);
		}
	
	public void testDuplicates(){
		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = -8;
		arr[2] = 7;
		arr[3] = 7;
		arr[4] = 2;
		
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -2;
		Sortedarr[1] = -2;
		Sortedarr[2] = -8;
		Sortedarr[3] = -8;
		Sortedarr[4] = 10;
		
		SelectionSort temp1 = new SelectionSort();
		int[] maxValue = temp1.SelectionSort(arr);
		assertArrayEquals(Sortedarr,arr);
	}
	}
