public class Stats {
	
	public static void main(String[] args) {
		int[] a ={1,2,3,4,5,6};
		int[] b ={1,2,3,4,5,6,7}; //Only used to test median
	System.out.println("Here are the numbers:\n");
	System.out.println("------------------------");
	System.out.println("The max is " + max(a));
	System.out.println("The min is " + min(a));
	System.out.println("The mean is " + mean(a));
	System.out.println("The median is " + median(b));

	}

	public static int max(int[] a) {
		int max = a[0];
		for (int i=0; i < a.length; i++) {
			if(a[i] >= max) {
				max = a[i];
			}
		}
		return max;
	}

	public static int min(int[] a) {
		int min = a[0];
		for (int i=0; i < a.length; i++) {
			if (a[i] <= min) {
				min = a[i];
			}
		}
		return min;
	}

	public static double mean(int[] a) {
		double sum = 0.0;

		for (int i=0; i < a.length; i++) {
			sum += a[i];
		}
		return (sum / a.length);
	}

	public static double median(int[] b) {
		double median = 0.0;
		for (int i=0; i < b.length; i++) {
			median = b.length/2;
		}
		return median;
	}

	// public static quartile1(int[] a) {

	// }

	// public static quartile3(int[] a) {

	// }

	// public static mode(int[] a) {

	// }

	// public static standardeviation(int[] a) {

	// }
	
}