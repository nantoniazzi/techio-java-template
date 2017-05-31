// { autofold
package com.yourself;

import java.util.Arrays;

public class Example {
// }
/**
 * Returns the sum of elements in an array of integers.
 * 
 * @param ns
 *            an array of integers
 * @return the sum of elements
 */
public int sum(int... ns) {
	return Arrays.stream(ns).sum();
}
//{ autofold
}
//}