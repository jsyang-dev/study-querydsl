package me.study.querydsl.repository;

import me.study.querydsl.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long>, MemberCustomRepository, QuerydslPredicateExecutor<Member> {

    List<Member> findByUsername(String username);
}
