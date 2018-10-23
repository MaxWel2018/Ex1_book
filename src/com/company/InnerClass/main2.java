package com.company.InnerClass;

public class main2 {
    public static void main(String[] args) {
        Network myFace = new Network();
        Network insta = new Network();
        Network VK = new Network();
        Network.Member fred = myFace.enroll("fred");
        Network.Member max = insta.enroll("max");
        Network.Member dimitry = VK.enroll("dima");
        System.out.println(fred.belongsTo(VK));
        System.out.println(max.belongsTo(insta));
        System.out.println(dimitry.belongsTo(myFace));
    }
}
