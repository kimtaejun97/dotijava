package CollectionEX.HashSetEx;

import CollectionEX.Member;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> member_hashset;

    public MemberHashSet() {
        member_hashset = new HashSet<Member>();

    }

    public boolean addMember(Member member){
            return member_hashset.add(member);
    }

    public boolean removeMember(int memberID){
        Iterator<Member> it = member_hashset.iterator();
        Member member;
        while(it.hasNext()){
            member = it.next();
            if(member.getMemberID() == memberID){
                member_hashset.remove(member);
                return true;
            }
        }
        return false;
    }

    public void showAll(){
        Iterator<Member> it = member_hashset.iterator();
        Member member;
        while(it.hasNext()){
            member = it.next();
            System.out.println(member);
        }
        System.out.println();
    }
}
