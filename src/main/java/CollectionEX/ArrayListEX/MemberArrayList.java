package CollectionEX.ArrayListEX;

import CollectionEX.Member;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    private ArrayList<Member> member_list;

    public MemberArrayList() {
        member_list = new ArrayList<Member>();

    }

    public void addMember(Member member){
        Iterator<Member> it = member_list.iterator();
        Member m;
        boolean EXIST = false;
        while(it.hasNext() && !EXIST){
            EXIST = it.next().getMemberID() == member.getMemberID();
        }
        if(!EXIST)
            member_list.add(member);
    }

    public boolean removeMember(int memberID){
       Iterator<Member> it = member_list.iterator();
       Member member;
       while(it.hasNext()){
           member = it.next();
           if(member.getMemberID() == memberID){
               member_list.remove(member);
               return true;
           }
       }
       return false;
    }

    public void showAll(){
        Iterator<Member> it = member_list.iterator();
        Member member;
        while(it.hasNext()){
            member = it.next();
            System.out.println(member);
        }
        System.out.println();
//        System.out.println(member_list);
    }
}
