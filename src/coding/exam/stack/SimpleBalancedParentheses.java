package coding.exam.stack;


/*
  
 아래는 괄호를 이용한 연산식이다.

(5+6)∗(7+8)/(4+3)
우리는 여는 괄호가 있으면 닫는 괄호가 반드시 있어야 한다는 것을 잘 알고 있다.

다음은 정상적인(balanced) 괄호 사용의 예이다.

(()()()())
(((())))
(()((())()))
다음은 비정상적인(not balanced) 괄호 사용의 예이다.

((((((())
()))
(()()(()
(()))(
())(()
괄호의 사용이 잘 되었는지 잘못 되었는지 판별 해 주는 프로그램을 작성하시오.

*/
public class SimpleBalancedParentheses {

	String[] src;
	int count = 0;
	
	public SimpleBalancedParentheses(int length){
		src = new String[length];
	}
	
	public void push(String ch){
		src[count++] = ch;
	}
	
	public boolean pop(){
		if (count == 0) return false;
		
		src[--count] = null;
		return true;
	}
	
	public boolean vaild(){
		
		for (String string : src) {
			if (string != null) return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String test = "())(()";
		SimpleBalancedParentheses stack = new SimpleBalancedParentheses(test.length());
		
		for(int i=0; i<test.length(); i++){
			String ch = String.format("%c", test.charAt(i));
			if ("(".equals(ch)){
				stack.push(ch);
			} else if(")".equals(ch) && !stack.pop()){
				System.out.println("Wrong");
				return;
			}
		}
		if(!stack.vaild()){
			System.out.println("Wrong");
		}
	}
}
