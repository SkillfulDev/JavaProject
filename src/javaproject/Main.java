package javaproject;

public class Main {

    public static void main(String[] args) {
        Member member = new Member('d', 3, "fdsf", 21.3);
        System.out.println(member.toString());
        SingleClubMember singleMember = new SingleClubMember('D', 33, "home", 1.3, 32);
        System.out.println(singleMember.toString());
    }
}
