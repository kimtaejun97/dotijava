package CollectionEX.hashmap;

import CollectionEX.Member;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
    private HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        hashMap = new HashMap<Integer, Member>();
    }

    public void addMember(Member member){
        hashMap.put(member.getMemberID(), member);
    }

    public boolean removeMember(int memberId){
        if(hashMap.containsKey(memberId)){
            hashMap.remove(memberId);
            return true;
        }
        return false;
    }
    public void showAll(){
        Iterator<Member> it = hashMap.values().iterator();

        Member member;
        int id;
        while(it.hasNext()){
            member = it.next();
            System.out.println(member);
        }
    }
}
