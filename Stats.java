import static java.lang.Math.pow;
import java.util.Arrays;

public class Stats {
	
	public static void main(String[] args) {
		int[] a ={1,2,3,4,5,6};
		int[] b ={1,2,3,4,5,6,7}; //Only used to test median.
		int[] c ={1,2,2,4,5}; //Only used to test mode.
	System.out.println("The max is " + max(a));
	System.out.println("The min is " + min(a));
	System.out.println("The mean is " + mean(a));
	System.out.println("The median is " + median(b));
	System.out.println("Here is the first quartile " + quartile1(a));
	System.out.println("Here is the third quartile " + quartile3(a));
	System.out.println("The mode is " + mode(c));
	System.out.println("The standard deviation is " + standardDeviation(a));

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
    Arrays.sort(b);

    if (b.length % 2 == 1) {
        return (b[(b.length / 2) - 1] + b[b.length / 2]) / 2.0;
    } else {
        return b[b.length / 2];
    }
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

	public static int mode(int[] c) {
    int maxValue = 0;
    int maxCount = 0;

    for (int i = 0; i < c.length; ++i) {
        int count = 0;
        for (int j = 0; j < c.length; ++j) {
            if (c[j] == c[i]) ++count;
        }
        if (count > maxCount) {
            maxCount = count;
            maxValue = c[i];
        }
    }

    return maxValue;
	}

	public static double standardDeviation(int[] a) {
		double x = 0;
		for (int i=0; i < a.length;i++) {
    		x = x + Math.pow(a[i] - a[i]/5, 2);
			}
		return x;
	}
	
}