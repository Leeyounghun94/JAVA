package ch07.mbcCar;

import ch07.hankook.SnowTire;
import ch07.hankook.Tire;
import ch07.hyudai.Engine;
import ch07.kumho.EcoTire;
import ch07.nexen.*;	// *기입하면 넥센에서 만든 클래스 다 가져와라 라는 뜻(단, 같은 이름이 있으면 안되니 조심)


public class Car {
	// 필드
	
	Tire hTier = new Tire();	//한국 타이어 패키지에서 가져옴. -> import ch07.hankook.Tire;
	ch07.kumho.Tire kTire = new ch07.kumho.Tire();	// 금호 타이어 패키지에서 가져옴.(요즘 트렌드는 이렇게 쓰니까 참고 할것 !) ★기억★
	SnowTire stier = new SnowTire();
	EcoTire eTier = new EcoTire();

	
	
	BigWidthTire bTire = new BigWidthTire();
	SportTire spTire = new SportTire();
	
	
	
	
	Engine hEngine = new Engine();
	
	
	
	
	//생성자
	
	
	
	
	//메서드
	
	
	
	
	
}
