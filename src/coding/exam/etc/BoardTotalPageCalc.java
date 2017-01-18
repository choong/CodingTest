package coding.exam.etc;
/*
 A씨는 게시판 프로그램을 작성하고 있다.

 A씨는 게시물의 총 건수와 한 페이지에 보여줄 게시물수를 입력으로 주었을 때 총 페이지수를 리턴하는 프로그램이 필요하다고 한다.

  입력 : 총건수(m), 한페이지에 보여줄 게시물수(n) (단 n은 1보다 크거나 같다. n >= 1)
  출력 : 총페이지수

 */
public class BoardTotalPageCalc {

	public static int pageCount(int total, int pageCnt){
		if (total < 1) return 0;
		return total % pageCnt > 0 ? (total / pageCnt) + 1 : total / pageCnt ;
	}
	
	public static void main(String[] args) {
		int m = 2;
		int n = 1;
		System.out.println(pageCount(m, n));
				
	}
}
