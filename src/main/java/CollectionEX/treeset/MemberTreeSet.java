package CollectionEX.treeset;

import CollectionEX.Member;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
    private TreeSet<Member> member_treeset;

    public MemberTreeSet() {
        member_treeset = new TreeSet<Member>(new Member());

    }

    public boolean addMember(Member member){
            return member_treeset.add(member);
    }

    public boolean removeMember(int memberID){
        Iterator<Member> it = member_treeset.iterator();
        Member member;
        while(it.hasNext()){
            member = it.next();
            if(member.getMemberID() == memberID){
                member_treeset.remove(member);
                return true;
            }
        }
        return false;
    }

    public void showAll(){
        Iterator<Member> it = member_treeset.iterator();
        Member member;
        while(it.hasNext()){
            member = it.next();
            System.out.println(member);
        }
        System.out.println();
    }
}
