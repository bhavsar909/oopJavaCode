package com.rajbhavsar.practice.problemsolvingdsalgo.immutablearraylist;

import java.util.*;

final class ImmutableArrayList{
    private List list=new ArrayList<>();;
    ImmutableArrayList(){
    }
    ImmutableArrayList(List list){
        this.list= new ArrayList(list);
    }
    public ImmutableArrayList add(Object o){
        ImmutableArrayList immutableArrayList= new ImmutableArrayList(list);
        immutableArrayList.list.add(o);
        return immutableArrayList;
    }

    public ImmutableArrayList remove(Object o){
        ImmutableArrayList immutableArrayList= new ImmutableArrayList(list);
        immutableArrayList.list.remove(o);
        return immutableArrayList;
    }
    public ImmutableArrayList remove(int i){
        ImmutableArrayList immutableArrayList= new ImmutableArrayList(list);
        immutableArrayList.list.remove(i);
        return immutableArrayList;
    }
    @Override
    public String toString() {
        return list+"";
    }
}
public class ImmutableArrayListMain {
    public static void main(String[] args) {
        ImmutableArrayList immutableArrayList=  new ImmutableArrayList();

        immutableArrayList.add(10);
        System.out.println(immutableArrayList);

        immutableArrayList=immutableArrayList.add(10);
        immutableArrayList=immutableArrayList.add(20);

        System.out.println(immutableArrayList);


        immutableArrayList.remove(new Integer(10));
        System.out.println(immutableArrayList);

        immutableArrayList=immutableArrayList.remove(new Integer(10));
        System.out.println(immutableArrayList);

    }
}
