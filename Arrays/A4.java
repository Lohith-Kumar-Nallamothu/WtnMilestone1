public class A4 {
public static void main(String[] args) {
	int[] a = new int [] {65,97,122,78,56,67};
	int n = a.length;
	char c;
	for ( int i = 0; i < n; i++) {
		c = (char)a[i];
		System.out.print(c+" ");
	}
}
}