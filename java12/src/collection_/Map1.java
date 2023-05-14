package collection_;

import java.util.HashMap;
import java.util.Set;

public class Map1 {
	public static void main(String[] args) {
		// 배열, List, Set, Map
		// Map : 키와 값을 쌍으로 정해주고 싶을 때
		// {"일":"a","이","b",...} 키는 중복이 안된다!
		HashMap<Integer, String> hm = new HashMap<>();
		
		// 추가 put
		// 조회 get
		// 삭제 remove
		
		hm.put(1, "일");
		hm.put(2, "이");
		hm.put(2, "중복");
		hm.put(2, "중복2");					// 값을 덮어씀
		hm.put(3, "삼");
		
		System.out.println(hm.get(1));		// get에 key값을 넘겨줌
		System.out.println(hm.get(2));
		System.out.println(hm.get(3));
		
		hm.remove(3);
		
		// 전체조회
		Set<Integer> set = hm.keySet();
		for(int e : set) {
			System.out.println("key "+e);
			System.out.println("Value "+hm.get(e));
		}
		
		boolean isTrue = hm.containsKey(4);
		System.out.println(isTrue);
		isTrue = hm.containsValue("이중복2");
		System.out.println(isTrue);
	}
}
