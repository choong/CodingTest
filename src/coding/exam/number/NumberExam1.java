package coding.exam.number;

/*
 * 1~1000에서 각 숫자의 개수 구하기
 */
public class NumberExam1 {

	public static void main(String[] args) {
		int[] count = new int[10];
		for (int i = 0; i < count.length; i++) {
			count[i] = 0;
		} 
		for (int i = 1; i <= 1000; i++) {
			String num = String.valueOf(i);
			for (int j = 0; j < num.length(); j++) {
				int each = Integer.valueOf(String.format("%c", num.charAt(j)));
				count[each] = ++count[each];
			}
		}
		
		for (int i = 0; i < count.length; i++) {
			System.out.println(i + " : " + count[i]);
			 
		} 
	}
}
