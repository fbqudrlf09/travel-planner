package controller;

import member.Member;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {

    //모든 고객 검색
    @GetMapping
    public List<Member> findAllMember() {

        List<Member> members = new ArrayList<>();

        return members;
    }

    @PostMapping
    public void addNewMember(@RequestBody Member member) {

        //리스트에 새로운 맴버 추가

        return;
    }

    @GetMapping("/{memberId}")
    public Member findMember(@PathVariable Long memberId) {
        //리스트에서 해당 멤버 찾기
        Member member = new Member();

        return member;
    }

    @PutMapping("/{memberId}")
    public void updateMember(@PathVariable Long memberId, Member member) {
        //리스트에서 해당 맴버 업데이트

        return;
    }
}
