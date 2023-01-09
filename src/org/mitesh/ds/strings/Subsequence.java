package org.mitesh.ds.strings;
import java.util.*;

public class Subsequence {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //subSeq("","abc");
        list = subSeqRet("","abc", list);
        System.out.println(list);
    }
    static void subSeq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeq(p, up.substring(1));
        subSeq(p+ch, up.substring(1));
    }
    static ArrayList<String> subSeqRet(String p, String up,ArrayList<String> list){
        if(up.isEmpty()){
            //System.out.println(p);
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        /*ArrayList<String> left =*/ subSeqRet(p+ch, up.substring(1),list);//subSeqRet(p,up.substring(1),list);
        /*ArrayList<String> right =*/ subSeqRet(p,up.substring(1),list);//subSeqRet(p+ch, up.substring(1),list);
        //left.addAll(right);
        return list;
    }
}
