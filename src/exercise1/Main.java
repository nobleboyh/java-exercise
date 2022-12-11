package exercise1;

import exercise1.models.*;
import exercise1.utils.MemberManagement;

public class Main {
    public static void main(String[] args) {
        //Add members
        MemberManagement.addMember(new Employee("hoang", 12, Sex.Male, "Hanoi", "Play"));
        MemberManagement.addMember(new Engineer("hoang", 12, Sex.Male, "Hanoi", "PlaySmt"));
        MemberManagement.addMember(new Engineer("Hoang2", 13, Sex.Female, "Hanoi", "Mechatronics"));
        MemberManagement.addMember(new Worker("HoangWorker", 13, Sex.Female, "Hanoi", 13));

        //Show member
        System.out.println("All member: ");
        MemberManagement.showAllMembers();

        //Search member
        System.out.println("All member named hoang: ");
        MemberManagement.getMemberByName("hoang").forEach(System.out::println);
    }
}
