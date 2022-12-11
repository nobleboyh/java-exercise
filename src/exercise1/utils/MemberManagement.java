package exercise1.utils;

import exercise1.models.Member;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MemberManagement {

    private static final List<Member> memberList = new ArrayList<>();

    public static void addMember(Member member){
        memberList.add(member);
    }

    public static List<Member> getMemberByName(String name){
        return memberList.stream().filter(member -> member.getName().equals(name)).collect(Collectors.toList());
    }

    public static void showAllMembers(){
        memberList.forEach(System.out::println);
    }
}
