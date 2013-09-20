import static java.lang.Math.pow;

public class Stats {
	
	public static void main(String[] args) {
		int[] a ={1,2,3,4,5,6};
		int[] b ={1,2,3,4,5,6,7}; //Only used to test median
	System.out.println("Here are the numbers:\n 1,2,3,4,5,6");
	System.out.println("------------------------");
	System.out.println("The max is " + max(a));
	System.out.println("The min is " + min(a));
	System.out.println("The mean is " + mean(a));
	System.out.println("The median is " + median(b));
	System.out.println("Here is the first quartile " + quartile1(a));
	// System.out.println("The mode is " + mode(a));
	System.out.println("The standard deviation is " + standarddeviation(a));

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

	public static double quartile1(int[] a) {
		double quart1 = 0.0;
		for (int i=0; i < a.length; i++) {
			quart1 = a[i]/4;
		}
		return quart1;
	}

	public static double quartile3(int[] a) {
		double quart3 = 0.0;
		for (int i=0; i < a[2]; i++) {
			quart3 = a[5]/4;
		}
		return quart3;
	}

	// public static boolean mode(int[] a) {
	// 		boolean stat = 0;
	// 		for (int i=0; i < a.length;	i++) {
	// 		stat = a[i];
	// 		}
	// 		return stat;
	// }

	public static int standarddeviation(int[] a) {
		int sd = 0;
		for (int i=0; i < a.length;i++) {
    		sd = sd + Math.pow(a[i] - a[i]/5, 2);
			}
		return sd;
	}
	
}