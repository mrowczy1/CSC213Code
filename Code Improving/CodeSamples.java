void main() {
    oddNumbers2();
}

/**
 * Very long way to check if a String is "valid".
 */
boolean isValidCheck(final String input) {
    if (input == null) { return false; }
    if (input.trim().length() == 0) { return false; }
    return true;
}

/**
 * Creative way to make star pattern without nested for loop!
 */
void stars() {
    String star = "";
    for (int i = 1; i <= 5; i++) {
        star += "*";
        IO.println(star);
    }
}

/**
 * Printing all odd numbers from 1-19 inclusive.
 */
void oddNumbers1() {
    for (int i = 1; i <= 19; i++) {
        if (i % 2 == 1) { IO.println(i); }
    }
}

/**
 * Printing all odd numbers from 1-19 inclusive.
 */
void oddNumbers2() {
    int x = 1;
    while (x < 20) {
        IO.println(x);
        x++;
        x++;
    }
}

/**
 * Finding the minimum value in nums.
 */
void findMin(int[] nums) {
    int min = Integer.MAX_VALUE;
    for (int num : nums) { 
        if (num < min) { min = num; }
    }
}

/**
 * Returns the product of all given numbers.
 */
double product(double ... nums) {
    if (nums.length == 0) { return 0; }
    var prod = nums[0];
    for (int i = 1; i < nums.length; i++) { prod *= nums[i]; }
    return prod;
}

/**
 * Returns the average elapsed time in seconds given the number of start and stop times.
 */
double averageElapsedTimeComplex(final int numTimes, final long elapsedTime) {
	if (numTimes == 0) {
		return 0;
	} else {
		return ((double) elapsedTime / numTimes) / 1_000_000_000.0;
	}
}