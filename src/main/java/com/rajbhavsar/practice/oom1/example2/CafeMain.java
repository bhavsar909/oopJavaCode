package com.rajbhavsar.practice.oom1.example2;

public class CafeMain {
    public static void main(String[] args) {
        Servant servant=new Servant();
        servant.setName("Prakash");
        Tea tea=new Tea();
        tea.setName("Green Tea");
        servant.serve(tea);
    }
}
