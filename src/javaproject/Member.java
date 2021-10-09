package javaproject;

public class Member {
    private char memberType;
    private int memberId;
    private String name;
    private double fees;

    public Member(char pmemberType, int pmemberId, String pname, double pfees) {
        memberType = pmemberType;
        memberId = pmemberId;
        name = pname;
        fees = pfees;
    }

    public void setMemberType(char pmemberType) {
        memberType = pmemberType;
    }

    public char getMemberType() {
        return memberType;
    }

    public void setMemberId(int pmemberId) {
        memberId = pmemberId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setName(String pname) {
        name = pname;
    }

    public String getName() {
        return name;
    }

    public void setFees(double pfees) {
        fees = pfees;
    }

    public double getFees() {
        return fees;
    }
    @Override
    public String toString(){
        return memberType +", " + memberId+", " + name+", " + fees;
    }

}
