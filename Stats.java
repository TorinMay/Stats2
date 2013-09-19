public class Stats {
	
	public static void main(String[] args) {
		int[] a ={1,2,3,4,5,6};
	System.out.println("The max is " + max(a));
	System.out.println("The min is " + min(a));
	System.out.println("The mean is " + mean(a));

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

	public static int median(int [] a) {
		
	}
	
}