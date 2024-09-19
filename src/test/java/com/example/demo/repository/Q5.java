package com.example.demo.repository;

public class Q5 {

}

//1. SQL을 그대로 작성한다.
//2. 변경될 수 있는 값(파라미터)을 매개변수로 선언한다.
//예를 들어 제목은 '자바~' 또는 '스프링~' 또는 '빈문자열'가 될 수 있다.
//이런 값들은 외부에서 입력받아 SQL에 동적으로 적용될 수 있도록 처리한다.
//3. 파라미터로 전달된 값을 SQL에 바인딩한다.
//@Query(value = "", nativeQuery = true)
//List<Book> get1();

//@Query(value = "SELECT * FROM tbl_book WHERE title = :param", nativeQuery = true)
//List<Book> get1(@Param("param") String tit);

