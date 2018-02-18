package tests;

import java.io.IOException;

public class RunAllTests {
    public static void main(String[] args) throws IOException {
        System.out.println("Start all simple task tests");
        System.out.println(" \nEasy1: \n");
        Easy1.main(new String[]{});

        System.out.println(" \nEasy2: \n");
        Easy2.main(new String[]{});

        System.out.println(" \nEasy3: \n");
        Easy3.main(new String[]{});

        System.out.println(" \nEasy4: \n");
        Easy4.main(new String[]{});

        System.out.println(" \nEasy5: \n");
        Easy5.main(new String[]{});

        System.out.println("____________________________");
        System.out.println("Start all medium task tests");

        System.out.println(" \nMid1: \n");
        Mid1.main(new String[]{});
        System.out.println(" \nMid2: \n");
        Mid2.main(new String[]{});
        System.out.println(" \nMid3: \n");
        Mid3.main(new String[]{});
        System.out.println(" \nMid4: \n");
        Mid4.main(new String[]{});
        System.out.println("____________________________");
        System.out.println("Start hard task test\n");
        Hard.main(new String[]{System.getProperty("user.dir") + "\\hardTest.txt"});
    }
}
