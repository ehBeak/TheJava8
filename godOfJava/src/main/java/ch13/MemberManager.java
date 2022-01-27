package ch13;

public interface MemberManager { // MemberManager.class
    public boolean addMember(MemberDTO member);

    public boolean removeMember(String name, String phone);

    public boolean updateMember(MemberDTO member);
}
