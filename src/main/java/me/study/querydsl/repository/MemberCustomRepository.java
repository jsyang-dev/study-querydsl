package me.study.querydsl.repository;

import me.study.querydsl.dto.MemberSearchCondition;
import me.study.querydsl.dto.MemberTeamDto;

import java.util.List;

public interface MemberCustomRepository {

    List<MemberTeamDto> search(MemberSearchCondition condition);
}
