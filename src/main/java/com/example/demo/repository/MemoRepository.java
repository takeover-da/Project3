package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Memo;

// 리파지토리: 엔티티를 사용하여 데이터를 처리 (crud, 페이징, 정렬)

public interface MemoRepository extends JpaRepository<Memo, Integer> {

}

// JpaRepository를 생성할 때는 엔터티와 해당엔터티의 PK타입 지정해야 한다.

// 메소드를 추가하는 방법
// 쿼리메소드 @Query (jpql문법, 순수한 sql)

