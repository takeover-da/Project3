package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Gift;

@SpringBootTest
public class GiftRepositoryTest {

	@Autowired
	GiftRepository giftRepository;
	
	@Test
	public void 데이터일괄등록() {
		
		List<Gift> list = new ArrayList<>();
		Gift gift1 = new Gift(1,"참치세트", 10000, "식품");
		Gift gift2 = new Gift(2,"햄세트", 20000, "식품");
		Gift gift3 = new Gift(3,"샴푸세트", 30000, "생활용품");
		Gift gift4 = new Gift(4,"세차용품", 40000, "생활용품");
		Gift gift5 = new Gift(5,"주방용품", 50000, "생활용품");
		Gift gift6 = new Gift(6,"노트북", 60000, "가전제품");
		Gift gift7 = new Gift(7,"벽걸이TV", 70000, "가전제품");
		
		list.add(gift1);
		list.add(gift2);
		list.add(gift3);
		list.add(gift4);
		list.add(gift5);
		list.add(gift6);
		list.add(gift7);
		
		giftRepository.saveAll(list);
	}
	
	@Test
	public void 단건조회() {
		
		Optional<Gift> result = giftRepository.findById(7);
		
		if(result.isPresent()) {
			Gift gift = result.get();
			System.out.println(gift);
		}
	}
	
	@Test
	public void 전체조회() {
		
		List<Gift> list = giftRepository.findAll();
		
		for(Gift gift : list) {
			System.out.println(gift);
		}
	}
	
	@Test
	public void 수정() {
		
		Optional<Gift> result = giftRepository.findById(3);
		Gift gift = result.get();
		gift.setType("아몰랑");
		
		giftRepository.save(gift);
	}
	
	@Test
	public void 단건삭제() {
		giftRepository.deleteById(7);
	}
	
	@Test
	public void 전체삭제() {
		giftRepository.deleteAll();
	}
		
}
