package Game;

import Cast.*;
import OtherMenu.*;


import java.util.Arrays;
import java.util.Scanner;


public class main {


    public static MainCast maincast;
    public static Game.fight_time fight_time; //전역에서 사용하게끔.


    public static void main(String[] args) throws InterruptedException {


        maincast = new MainCast();
        Villain villain = new Villain();

        System.out.println("========================GAME START======================\n");
        System.out.println("환영합니다! 플레이어 님! 저희와 함께 게임을 즐길 준비가 되셨나요?\n");
        System.out.println("먼저 흘레이어 님의 이름을 입력해 주세요.\n");
        System.out.println("==========================================================\n");
        Scanner scr1 = new Scanner(System.in);
        String Player = scr1.nextLine();


        loop4:
        while (true) {


            maincast.CharacterShow(Player); //기숙사 선택
            Scanner scr = new Scanner(System.in);
            int num = scr.nextInt();

            maincast = new Student(); //학생 객체 생성

            if (num == 1) {
                System.out.println("===================================\n");
                System.out.println(" 슬리데린가 선택 되었습니다.");
                System.out.println(" 당신의 기숙사는 [슬리데린] 입니다.\n");
                System.out.println("===================================\n");
                maincast.domitory = "슬리데린";

                break;


            } else if (num == 2) {
                System.out.println("===================================\n");
                System.out.println(" 그리핀도르가 선택 되었습니다.");
                System.out.println(" 당신의 기숙사는 [그리핀도르] 입니다.\n");
                System.out.println("===================================\n");

                maincast.domitory = "그리핀도르";


                break;

            } else if (num == 3) {
                System.out.println("===================================\n");
                System.out.println(" 후플푸프가 선택 되었습니다.");
                System.out.println(" 당신의 기숙사는 [후플푸프] 입니다.\n");
                System.out.println("===================================\n");

                maincast.domitory = "후플푸프";

                break;

            } else if (num == 4) {
                System.out.println("===================================\n");
                System.out.println(" 레번클로이 선택 되었습니다.");
                System.out.println(" 당신의 기숙사는 [레번클로] 입니다.\n");
                System.out.println("===================================\n");

                maincast.domitory = "레번클로";

                break;
            } else {
                System.out.println("1부터 4까지 수를 입력해주세요");
                continue loop4;
            }
        }


        Thread.sleep(1000);

        System.out.println("캐릭터를 생성하는 중입니다...\n");
        String s = "████████████████████████████████████████████████████████████████████████\n";

        for (int i = 0; i < s.length(); i++) { // 로딩 효과 스레드
            Thread.sleep(10);
            System.out.print(s.charAt(i));    //한 문자씩 출력
        }

        DayTimer timer = new DayTimer(); // 시간 창 출력

        System.out.println("=============================================\n");
        System.out.println("마법사의 세계에 오신 당신을 진심으로 환영합니다.");
        System.out.println("=============================================\n");

        DiganAlley diganAlley = new DiganAlley();
        inventory inv = new inventory();

        Loop1:
        while (true) {

            maincast.menushow();

            Scanner menuscr = new Scanner(System.in);
            int menunum = menuscr.nextInt();

            if (menunum == 1) {

                maincast.introduce(); //게임 소개

                continue Loop1;

            } else if (menunum == 2) {

                maincast.show(Player); // 캐릭터 상황
                continue Loop1;

            } else if (menunum == 3) {

                inv.printInv();
                System.out.println("아이템을 장착하시겠습니까?");
                System.out.println("1. YES    2. NO");
                System.out.println("===========================");

                Scanner sc = new Scanner(System.in);
                int scnum = sc.nextInt();

                inv.Wearitem(scnum);

                Scanner itemscrr = new Scanner(System.in);
                String item = itemscrr.nextLine();


                for (int i = 0; i < inv.inv.length; i++) {

                    System.out.println(Arrays.asList(inv.inv).contains(item)); //배열이 특정 문자열을 포함하고 있는지 확인하는 메서드

                    if (Arrays.asList(inv.inv).contains(item)) {
                        maincast.MagicPoint = diganAlley.compareInvM(item, maincast.MagicPoint);

                        maincast.Defense = diganAlley.compareInvD(item, maincast.Defense);

                        break;
                    } else {
                        System.out.println("현재 인벤토리에 없음.");
                        break;
                    }

                }

                inv.removeItemFromInv(item);


            } else if (menunum == 4) {

                Hogwart hogwart = new Hogwart();

                if (timer.time() == 0) {

                    hogwart.DayCondition(timer.time()); //낮,밤에 따라서 호그와트 입장 멘트가 다르다.

                    Scanner scr3 = new Scanner(System.in);
                    hogwart.choice();
                    int choice_num = scr3.nextInt();


                    if (choice_num == 1) {
                        hogwart.show(); //  메뉴 보여주기
                        Scanner scanner = new Scanner(System.in);
                        int number = scanner.nextInt();

                        if (number == 0) {
                            continue;
                        } else {

                            maincast.money = hogwart.purchase(maincast.domitory, maincast.money, number);
                            System.out.println("현재 남은 돈은" + maincast.money + " 입니다.");

                            maincast.hp = hogwart.Potion_use_hp(maincast.domitory, number, maincast.hp);
                            maincast.mp = hogwart.Potion_use_mp(maincast.domitory, number, maincast.mp);

                        }


                    } else if (choice_num == 2) {
                        // 이전 메뉴로 돌아감.
                    }
                } else if (timer.time() == 1) {

                    hogwart.DayCondition(timer.time());

                }

            } else if (menunum == 5) {


                diganAlley.inv = inv;

                if (timer.time() == 0) {

                    diganAlley.DayCondition(timer.time());

                    loop4:
                    while (true) {

                        diganAlley.showMenu();
                        Scanner selscr = new Scanner(System.in);
                        int selnum = selscr.nextInt();

                        maincast.money = diganAlley.select(maincast.money, selnum);

                        System.out.println("현재 남은 돈은" + maincast.money + " 입니다.");

                        if (selnum == 0) {
                            break loop4;
                        }

                    }
                } else if (timer.time() == 1 || timer.time() == 2 || timer.time() == 3 || timer.time() == 4) {
                    diganAlley.DayCondition(timer.time());

                    // 밤에만 열리는 야시장 구현하기.
                    NightMarket nightMarket = new NightMarket();
                    nightMarket.Nightinv = inv;

                    nightMarket.야시장소개();

                    Scanner scr = new Scanner(System.in);
                    int accessnum = scr.nextInt();

                    nightMarket.야시장입장(accessnum, Player);

                }


            } else if (menunum == 6) {

                HagridHouse hagridHouse = new HagridHouse();
                hagridHouse.inv1 = inv;


                hagridHouse.show_menu(Player);
//                    System.out.println("1. 그냥 한번 들려봤어요");
//                    System.out.println("2. 혹시 제가 도와드릴 일이 있나요?");
//                    System.out.println("3. 요새 돌보시는 동물 있으세요?");
//                    System.out.println("4. 저랑 내기하실래요?\n");


                int ansnum;
                Scanner ansscr = new Scanner(System.in);
                ansnum = ansscr.nextInt();

                if (ansnum == 1) {
                    System.out.println("해그리드 曰 그냥 들러봤다고?! 난 한가한 사람이 아니야! 얼른 수업들으러 가렴!!");
                    System.out.println("해그리드의 오두막에서 쫓겨냤습니다.");
                } else if (ansnum == 2) {

                    maincast.money = hagridHouse.hagrid_money(Player, maincast.money);


                } else if (ansnum == 3) {
                    System.out.println("해그리드 曰 요새 돌보는 동물? 있긴 하지 그 동물은 지금 금지된 숲에서 지내고 있어");
                    System.out.println("해그리드 曰 같이 구경가보지 않을래?\n");
                    System.out.println("1. 네! 좋아요    2. 아니요 싫어요");

                    int aninum;
                    Scanner aniscr = new Scanner(System.in);
                    aninum = aniscr.nextInt();

                    if (aninum == 1) {

                        hagridHouse.DragonShow();

                        int petnum;
                        Scanner petscr = new Scanner(System.in);
                        petnum = petscr.nextInt();

                        if (petnum == 1) {

                            maincast.Defense = hagridHouse.hagrid_Dragon(Player, maincast.Defense);

                        } else {
                            hagridHouse.buck_money_show(Player, maincast.money);


                        }

                    } else {
                        System.out.println("해그리드 曰 아니 그러면 왜 물어본거야?! 난 지금 바쁘다고! 얼른 나가!\n");
                        System.out.println("해그리드의 오두막에서 쫓겨냤습니다.");
                    }


                } else if (ansnum == 4) {

                    hagridHouse.hagrid_gamble(Player, maincast.money);

                }


            } else if (menunum == 7) {


                villain.inv2 = inv;


                villain.stageshow(timer.time());
                Scanner scr3 = new Scanner(System.in);
                int stagenum = scr3.nextInt();

                if (stagenum == 1) {
                    villain = new Snape();
                    villain.name = "세베루스 스네이프";
                    villain.hp = 300;
                    villain.level = 1;
                    villain.MagicPoint = 20;
                    villain.Defense = 5;
                    villain.money = 10;
                    villain.experience = 20;

                    if (timer.time() == 1) {
                        villain.MagicPoint += 5;

                    }

                }
                if (stagenum == 2) {
                    villain = new Dumbledore();
                    villain.name = "알버스 덤블도어";
                    villain.hp = 350;
                    villain.level = 2;
                    villain.MagicPoint = 30;
                    villain.Defense = 10;
                    villain.money = 30;
                    villain.experience = 30;

                    if (timer.time() == 1) {
                        villain.MagicPoint += 5;

                    }

                }
                if (stagenum == 3) {

                    villain = new Voldemort();
                    villain.name = "볼드모드 경";
                    villain.hp = 400;
                    villain.level = 3;
                    villain.MagicPoint = 40;
                    villain.Defense = 15;
                    villain.money = 50;
                    villain.experience = 50;

                    if (timer.time() == 1) {
                        villain.MagicPoint += 5;

                    }

                }


                System.out.println("");
                System.out.println(villain.name + "과 대결을 시작합니다.");
                System.out.println("제한시간 10초안에 적을 물리치세요!\n");


                fight_time = new fight_time(); // 제한시간 20초 생성
                TimeOut timeout = new TimeOut();


                fight_time.start();// 제한시간 20초 시작
                timeout.start();

                villain.start(); // 빌런 자동공격 시작


                while (true) {

                    if (fight_time.time() == 20) { // 제한시간이 지났을 때

                        villain.Stop(true); // 빌런 자동공격 중단


                        break;
                    } {

                        int maincast_punch = maincast.attack(); // 플레이어 공격

                        villain.attacked(maincast_punch); // 빌런 데미지 깍임

                        int a;
                        if (villain.Defense >= maincast_punch) {
                            a = 0;
                        } else {
                            a = villain.Defense - maincast_punch;
                        }


                        System.out.println("빌런이 입은 실 데미지 : " + a);
                        System.out.println("빌런의 잔여 hp : " + villain.hp);


                        if (villain.hp > 0) {
                            System.out.println("아직 빌런의 hp가 0이 되지 않았습니다.");

                        }
                        System.out.println("");


                        if (villain.hp <= 0)            // 빌런이  죽었을 때
                        {

                                fight_time.threadStop(true); // 제한시간 중단
                                villain.Stop(true); // 빌런 자동공격 중단
                                timeout.threadStop(true);

                                villain.inv2 = inv;

                            if(timeout.time()<10) {

                                timeout.threadStop(true);

                                villain.Win(villain.name, Player, villain.money, villain.experience);


                                System.out.println(" 10초 안에 빌런을 무찌름 ");
                                maincast.experience += villain.experience * 3;
                                maincast.money += villain.money * 3;


                                maincast.HeroWin(maincast.experience, maincast.level);


                                maincast.show_fight();
                            }
                            else
                            {

                                villain.Win(villain.name, Player, villain.money, villain.experience);


                                maincast.experience += villain.experience;
                                maincast.money += villain.money;


                                maincast.HeroWin(maincast.experience, maincast.level);


                                maincast.show_fight();
                            }




                            break;
                        }

                    }
                }// while문 끝


            } else if (menunum == 8) {
                System.out.println("게임을 종료합니다.");

                break;


            }
        }
    }
}


