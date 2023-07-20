package Steppingglass;

import java.util.Scanner;

public class Start {

    public void start() {

        Player py1 = new Gihun();
        Player py2 = new SangWoo();
        Player py3 = new Ducksoo();
        Player py4 = new Ilnam();
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================================");
        System.out.println("=============캐릭터를 선택해주세요.============");
        System.out.println("======a.성기훈 b.조상우 c.장덕수 d.오일남======");
        System.out.println("===============================================");
        System.out.print("캐릭터선택 : ");
        char ch = sc.nextLine().charAt(0);
        switch (ch) {
            case 'a':
                System.out.println("성기훈을 선택하셨습니다.");
               py1.pick();
                break;
            case 'b':
                System.out.println("조상우를 선택하셨습니다.");
                py2.pick();
                break;
            case 'c':
                System.out.println("장덕수을 선택하셨습니다.");
                py3.pick();
                break;
            case 'd':
                System.out.println("오일남을 선택하셨습니다.");
                py4.pick();
                break;
            default:
                System.out.println("캐릭터를 다시 선택해주세요");
                break;
        }

    }
}


