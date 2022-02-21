package find;

public class FindTest {
	/**
	 * @pre | haystack != null
	 * 
	 * IntStream.range(a, b).anyMatch(i -> P(i))
	 * Er bestaat een i tss a (incl) en b (excl) zodat P(i) waar is
	 * 
	 * Arrays.stream(haystack).anyMatch(e -> e == needle)
	 * Er bestaat een element e in haystack zodat e == needle
	 * 
	 * Arrays.stream(myArray).anyMatch(e -> P(e))
	 * Er bestaat een e in myArray zodat P(e) waar is
	 * 
	 * @post Als 'needle' niet in 'haystack' voorkomt, is het resultaat -1.
	 * 		| IntStream.range(0, haystack.length).anymatch(i -> haystack[i] == needle)
	 * 		| || result == -1
	 * 
	 * @post
	 * 		|Arrays.stram(haystack).anyMatch(e -> e == needle
	 * 		| || result == -1
	 * 
	 * @post
	 * 		| result == -1 ||
	 * 		| 0 <= result && result < haystack.length && haystack[result] == needle
	 */
	int find(int[] haystack, int needle) {
		if (haystack == null) return -2;
		int index = 0;
		for(;;) {
			if (index == haystack.length)
				return -1;
			if (haystack[index] == needle)
				return index;
			//index++;
		}
	}

	/**
	 * Finds the given number 'needle' in the given array 'haystak' and returns its index,
	 * or -1 if the given number is not in the given array.
	 * The given array must be sorted in ascending order.
	 * @param haystack
	 * @param needle
	 * @return
	 * 
	 * @pre
	 * 		| haystack != null
	 * @pre The array 'haystack' is sorted.
	 * 		| IntStream.range(0, haystack.length - 1).allMatch(i ->
	 * 		|	IntStram.range(i+1, haystack.length).allMatch(j ->
	 *		|		haystack[i] <= haystack[j]
	 * 		|	 )
	 * 		| )
	 * 
	 *@post
	 * 		|Arrays.stream(haystack).anyMatch(e -> e == needle
	 * 		| || result == -1
	 * 
	 *@post
	 * 		| result == -1 ||
	 * 		| 0 <= result && result < haystack.length && haystack[result] == needle
	 */
	
	int binarySearch(int [] haystack, int needle) {
		int start = 0;
		int end = haystack.length;
		while (start < end) {
			int middle = start + (end - start) / 2; @dit voorkomt overflow
			if (needle < middle) {
				end = middle;
			} else {
				start = middle;
			}
		}
		if (start < haystack.length && haystack[start] == needle)
			return start;
		else
			return -1;
	}
	
	void sort(int [] array) {
		
	}
}

