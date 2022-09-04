package Cast;

import Game.*;


import java.util.Scanner;

public class MainCast extends cast {




    public void introduce() throws InterruptedException {
        System.out.println("======================Introduce=======================");

        String s = "당신은 이제 마법사의 신분으로 다시 태어났습니다.\n"
                + "이 마법사의 세계엔 3명의 강한 마법사들이 있습니다.\n"
                + "당신은 지금부터 마법을 연마해 이 3명의 마법사들을 쓰러트려\n"
                + "이 세계 최고의 마법사가 되어주세요\n";

        System.out.println("=====================================================");

        for (int i = 0; i < s.length(); i++) { // 프롤로그 타이핑 효과
            Thread.sleep(25);
            System.out.print(s.charAt(i));
        }


    }

    public void CharacterShow(String Player) {



        System.out.println(" 환영합니다! " + Player + " 님 ! \n");

        System.out.println(" 호그와트에 입학하기 위해선 기숙사 선택이 필요합니다!\n");
        System.out.println("1. 슬리데린");
        System.out.println("2. 그리핀도르");
        System.out.println("3. 후플푸프");
        System.out.println("4. 레번클로\n");
        System.out.println("==========================================================");
        System.out.print("번호를 입력해주세요 : ");

    }

    public void menushow(){
        System.out.println("====================MENU=====================");
        System.out.println("1. 게임 소개");
        System.out.println("2. 현재 캐릭터 프로필");
        System.out.println("3. 인벤토리");
        System.out.println("4. 호그 와트");
        System.out.println("5. 다이건 앨리");
        System.out.println("6. 해그리드의 오두막");
        System.out.println("7. 게임 시작");
        System.out.println("8. 게임 끝내기");
        System.out.println("==============================================");
        System.out.print(" 선택할 메뉴를 입력하세요 : ");
    }

    public void show(String name) {

        System.out.println("=======================Profile========================");
        System.out.println("");
        System.out.println("이름: " + name);
        System.out.println("기숙사: " + domitory);
        System.out.println("hp: " + hp);
        System.out.println("mp:" + mp);
        System.out.println("level: " + level);
        System.out.println("주문력: " + MagicPoint);
        System.out.println("방어력: " + Defense);
        System.out.println("경험치: " + experience);
        System.out.println("돈: " + money + " 원");
        System.out.println("");
        System.out.println("======================================================");
    }

    public void show_fight() {
        System.out.println("========================================");
        System.out.println(" 	    Hp  : " + hp);
        System.out.println(" 	    Level  : " + level);
        System.out.println(" 	    경험치    : " + experience);
        System.out.println(" 	    돈    : " + money + " 원");
        System.out.println("========================================");
    }

    public void HeroWin (int experience2, int level2){



        if(experience2 >= level2 * 50)
        {
            level += 1;
            System.out.println("플레이어의 레벨이 " + level + "이 되었습니다.\n");


            experience = 0;
        }


    }



    }
