import static java.lang.Math.*;

/**
 * 테스트 코드를 보고, 아래 두 method 를 작성해주세요.
 */
class Questing {
	static int quest1(double d)  {
		d = floor(d);
		int result = (int)d/2;	
	
		return result;
	}

	static boolean quest2(String s) {
		return s.equals("({}[])");
	}
}
