package Steppingglass;

import java.util.Scanner;

public class Ilnam extends Player implements RandomNumber{


    public void pick() {
        System.out.println("추가 능력 : 모든 확률을 무시하고 전진합니다.");
        System.out.println("그만해.. 이러다 다죽어..! 나 무서워...");
    }

    @Override
    public void randomnum() {
        int i = 1;
        label:
        while (i <= 9) {
            int random = (int) ((Math.random() * 100) + 1);
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.print("1 , 2 , 3 , 4 중 선택(게임종료 5번) : ");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                case 2:
                case 3:
                case 4:
                    if (true) {
                        i++;
                        System.out.println("===1칸 전진===\n" + "현재 " + i + " 번째 칸 입니다.");
                    }
                    break;

                case 5 :
                    System.out.println("포기하고 종료하시겠습니까? ㅋ 'y' or 'n' ");
                    sc.nextLine();
                    char ch = sc.nextLine().charAt(0);
                    switch (ch){
                        case 'y' : break label;
                        case 'n' :
                            System.out.println("게속 진행합니다.");
                            continue label;
                    }
                default:
                    System.out.println("숫자를 잘못 입력 하셨습니다. 재대로 건너세요. ");
                    break;

            }

        }
        System.out.println("축하드립니다. 탈출하셨습니다 !!");
    }
}
