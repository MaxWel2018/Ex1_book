package com.company.InnerClass;

import java.util.ArrayList;

public class Network {
    public class Member { // Класс Member является внутренним
        public boolean belongsTo(Network network) {
            return Network.this == network;

        }

        public void leave() {
            members.remove(this);
        }
        // для класса Network
        private String name;
        private ArrayList<Member> friends;

        public Member(String name) {
            this.name = name;
            friends = new ArrayList();
        }

    }

    private ArrayList<Member> members = new ArrayList();

    public Member enroll(String name) {
        Member newMember = new Member(name);
        members.add(newMember);
        return newMember;
    }


}
