package CollectionEX;

import CollectionEX.ArrayListEX.MemberArrayList;
import CollectionEX.HashSetEx.MemberHashSet;
import CollectionEX.hashmap.MemberHashMap;
import CollectionEX.treemap.MemberTreeMap;
import CollectionEX.treeset.MemberTreeSet;

public class MemberTest {
    public static void main(String[] args){
        Member kim = new Member(101, "kim");
        Member park = new Member(102, "park");
        Member Lee = new Member(103, "Lee");
        Member kim2 = new Member(101,"kim2");

        //ArrayList Test
        System.out.println("============Array List Test=============");
        MemberArrayList memberArrayList = new MemberArrayList();

        memberArrayList.addMember(kim);
        memberArrayList.addMember(park);
        memberArrayList.addMember(Lee);
        memberArrayList.addMember(kim2);

        memberArrayList.showAll();
        System.out.println("Remove kim");
        memberArrayList.removeMember(kim.getMemberID());
        memberArrayList.showAll();

        //HashSet Test
        System.out.println("============Hash set Test=============");

        MemberHashSet memberHashSet = new MemberHashSet();

        memberHashSet.addMember(kim);
        memberHashSet.addMember(park);
        memberHashSet.addMember(Lee);
        memberHashSet.addMember(kim2);

        memberHashSet.showAll();

//        System.out.println("============Tree set Test=============");
//
//        MemberTreeSet memberTreeSet = new MemberTreeSet();
//
//        memberTreeSet.addMember(kim);
//        memberTreeSet.addMember(park);
//        memberTreeSet.addMember(Lee);
//        memberTreeSet.addMember(kim2);
//
//        memberTreeSet.showAll();

        System.out.println("============HashMap Test=============");

        MemberHashMap memberhashmap = new MemberHashMap();

        memberhashmap.addMember(kim);
        memberhashmap.addMember(park);
        memberhashmap.addMember(Lee);
        memberhashmap.addMember(kim2);

        memberhashmap.showAll();

        System.out.println("============TreeMap Test=============");

        MemberTreeMap memberTreeMap = new MemberTreeMap();

        memberTreeMap.addMember(kim);
        memberTreeMap.addMember(park);
        memberTreeMap.addMember(Lee);
        memberTreeMap.addMember(kim2);

        memberTreeMap.showAll();



    }
}
