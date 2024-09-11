package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Book;

@SpringBootTest
public class BookRepositoryTest {
	
	@Autowired
	BookRepository bookRepository;
	
	@Test
	public void 확인() {
		System.out.println("bookRepository = " + bookRepository);
	}
	
	@Test
	public void 등록1() {
		Book book1 = Book.builder()
						 .bookNo(1)
						 .price(20000)
						 .publisher("한빛출판사")
						 .title("자바프로그래밍입문")
						 .build();
		bookRepository.save(book1);
	}

	@Test
	public void 등록2() {
		Book book2 = Book.builder()
						 .bookNo(2)
						 .price(25000)
						 .publisher("남가람북스")
						 .title("스프링부트프로젝트")
						 .build();
		bookRepository.save(book2);
	}
	
	@Test
	public void 등록3() {
		Book book3 = Book.builder()
						 .bookNo(3)
						 .price(40000)
						 .publisher("남가람북스")
						 .title("실무로 끝내는 PHP")
						 .build();
		bookRepository.save(book3);
	}
	
	@Test
	public void 등록4() {
		Book book4 = Book.builder()
						 .bookNo(4)
						 .price(35000)
						 .publisher("이지스퍼블리싱")
						 .title("알고리즘코딩테스트")
						 .build();
		bookRepository.save(book4);
	}
	
	@Test
	public void 단건조회() {
		
		Optional<Book> result = bookRepository.findById(1);
		
		if (result.isPresent()) {
			Book book = result.get();
			System.out.println(book);
		}
	}
	
	@Test
	public void 전체조회() {
		
		List<Book> list = bookRepository.findAll();
		
		for (Book book : list) {
			System.out.println(book);
		}
	}
	
	@Test
	public void 수정() {
		
		Optional<Book> result = bookRepository.findById(2);
		Book book = result.get();
		book.setPrice(50);
		
		bookRepository.save(book);
	}
	
	@Test
	public void 단건삭제() {
		bookRepository.deleteById(2);
	}
}
