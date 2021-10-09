package javaproject;

public class SingleClubMember extends Member {
    private int club;

    public SingleClubMember(char pmemberType, int pmemberId, String pname, double pfees, int pclub) {
        super(pmemberType, pmemberId, pname, pfees);
        club = pclub;
    }

    public int getClub() {
        return club;
    }

    public void setClub(int pclub) {
        club = pclub;
    }

    //    @Override
//    public String toString ()
//    {
//        return getMemberType() +", " + getMemberId()+", " + getName()+", " + getFees()+", " + club+ "." ;
//    }
    public String toString() {
        return super.toString()  + ", "+ club;
    }

}

