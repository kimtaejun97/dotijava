package CollectionEX.treemap;

import CollectionEX.Member;

import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {
    private TreeMap<Integer, Member> treeMap;

    public MemberTreeMap() {
        treeMap = new TreeMap<Integer, Member>();
    }

    public void addMember(Member member){
        treeMap.put(member.getMemberID(), member);
    }

    public boolean removeMember(int memberId){
        if(treeMap.containsKey(memberId)){
            treeMap.remove(memberId);
            return true;
        }
        return false;
    }
    public void showAll(){
        Iterator<Member> it = treeMap.values().iterator();

        Member member;
        int id;
        while(it.hasNext()){
            member = it.next();
            System.out.println(member);
        }
    }
}
