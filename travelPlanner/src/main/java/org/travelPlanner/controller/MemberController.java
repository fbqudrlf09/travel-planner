package org.travelPlanner.controller;

import org.travelPlanner.model.Member;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {

    //모든 고객 검색
    @GetMapping
    public List<Member> getMembers() {

        List<Member> members = new ArrayList<>();

        return members;
    }

    @PostMapping
    public Member postMembers(@RequestBody Member member) {

        //리스트에 새로운 맴버 추가

        return member;
    }

    @GetMapping("/{memberId}")
    public Member getMember(@PathVariable Long memberId) {
        //리스트에서 해당 멤버 찾기
        Member member = new Member();
        member.setId(1L);
        member.setName("Test1");

        return member;
    }

    @PutMapping("/{memberId}")
    public Member putMember(@PathVariable Long memberId, Member member) {
        //리스트에서 해당 맴버 업데이트

        return member;
    }
}
