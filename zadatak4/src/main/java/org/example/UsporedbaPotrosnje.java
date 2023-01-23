package org.example;

public class UsporedbaPotrosnje {
    private static double potrosnja1, potrosnja2;

    public static void usporedi(TestAutomobila auto1, TestAutomobila auto2){
        potrosnja1 = (auto1.getPotrosioGoriva() * 100) / auto1.getPrijedjenPut();
        potrosnja2 = (auto2.getPotrosioGoriva() * 100) / auto2.getPrijedjenPut();

        System.out.println("Prvi auto ima prosjecnu potrosnju "+potrosnja1);
        System.out.println("Drugi auto ima prosjecnu potrosnju "+potrosnja2);

        if(potrosnja1 < potrosnja2){
            System.out.println("Prvi auto je stedljiviji");
        }else if(potrosnja1 > potrosnja2){
                System.out.println("Drugi auto je stedljiviji");
        }else{
            System.out.println("Oba auto su jednako stedljiva");
        }
    }
}

