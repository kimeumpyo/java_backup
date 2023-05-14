package operator;

// 파일명 변경 파일 클릭!F2 (일괄변경 진행!!꼭!!)
public class Oper1 {
	public static void main(String[] args) {
		// 프로그래밍은 기본적으로
		// 위에서 아래로, 왼쪽에서 오른쪽으로 진행합니다
		int 숫자1 = 3;		// 대입연산자 = : 오른쪽에 있는 값을 왼쪽에 있는 공간에 담아라
		int 숫자2 = 2;
		// 우선순위 계산식
		System.out.println(숫자1 - 숫자2 * 숫자2);
		System.out.println((숫자1 - 숫자2) * 숫자2);
		
		System.out.println(8/4/2);
		System.out.println(8/(4/2));
		
		// 자료형이 int (소수점 없는 숫자) 이기 때문에
		// 나누기를 한다음 소수점은 '삭제'
		System.out.println(3/2);		// 1.5(x), 1(o)
		
		System.out.println(3/2.0);		// 소수점있는숫자로 계산해야 소수점있는숫자로 나온다
			 
	}
}
