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
    public void postMembers(@RequestBody Member member) {

        //리스트에 새로운 맴버 추가

        return;
    }

    @GetMapping("/{memberId}")
    public Member getMember(@PathVariable Long memberId) {
        //리스트에서 해당 멤버 찾기
        Member member = new Member();

        return member;
    }

    @PutMapping("/{memberId}")
    public void putMember(@PathVariable Long memberId, Member member) {
        //리스트에서 해당 맴버 업데이트

        return;
    }
}
