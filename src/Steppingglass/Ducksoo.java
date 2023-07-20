package Steppingglass;

import java.util.Scanner;

public class Ducksoo extends Player implements RandomNumber {
    public void pick() {
        System.out.println("추가 능력 : 전진확률이 줄고 뒤로가기 확률이 증가합니다.");
        System.out.println("여긴 지옥이야. 지옥에 규칙이 어딨어? "  );
    }

    @Override
    public void randomnum() {
        int i = 1;
        label:
        while (i <= 9) {
            int random = (int) ((Math.random() * 85) + 1);
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.print("1 , 2 , 3 , 4 중 선택(게임종료 5번) : ");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                case 2:
                case 3:
                case 4:
                    if (0 < random && 40 >= random) {
                        i++;
                        System.out.println("===1칸 전진===\n" + "현재 " + i + " 번째 칸 입니다.");
                    } else if (35 < random && 45 >= random) {
                        i = i + 2;
                        System.out.println("===2칸 전진===\n" + "현재 " + i + " 번째 칸 입니다.");
                    } else if (45 < random && 80 >= random) {
                        i--;
                        if(i==0){
                            System.out.println("처음부터 뒤로 한칸이 걸려서 다시 하셔야합니다. 분발하세요 !");
                            i=1;
                            continue;
                        }else {
                            System.out.println("===뒤로 가기===\n" + "현재 " + i + " 번째 칸 입니다.");}
                    } else {
                        i = 0;
                        System.out.println(" 떨어지셨습니다. 처음으로 돌아갑니다. ㅋ");
                        continue ;
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
