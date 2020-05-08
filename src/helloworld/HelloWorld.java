package helloworld;

//클래스 정의 

/* 
작성자 JaewonP
작성일 2020.05.07
*/

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("hello World");
		
		// TODO Auto-generated method stub
		//값(value)
		int number = 10; // number라는 이름으로 10이라는 변수를 저장, 값을 그대로 표현하여 저장할 때 literal
		int number2 = 10 + 5; // number라는 이름으로 10이라는 변수를 저장, 연산식을 이용하여 저장
	    int number_ = ten(); // ten() 함수를 호출하여 해당 함수를 실행함
	    // 위의 3가지 경우를 두고 표현식이라고 함 (값을 표현한 식)

	    
		/*
		 * number = 10  
		 * number = number + 10
		 * 정수를 저장할 때 혹은 문자를 저장할 때 메모리를 할당하고 주소 줄 때 type을 안 주면 저장 공간 사이즈를 할당 못하니까 type을 정해주어야 함
		 * 숫자, 부울(참, 거짓), 문자
		 *  
		 */
	    
	    System.out.println(number + ":" + number2 + ":"+ number_);

	}
	
	public static int ten() {	
		return 10; // 10을 output
	}
	

}
