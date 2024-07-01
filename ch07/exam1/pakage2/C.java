package ch07.exam1.pakage2;

import ch07.exam1.pakage1.A;
import ch07.exam1.pakage1.B;

public class C {
	A a;	// default은 다른 패키지는 안됨.
	B b;	// public은 import처리 하면 접근이 가능
	
	A a1 = new A(true);
//	A a2 = new A(2);
//	A a3 = new A("문자열");
	
}
