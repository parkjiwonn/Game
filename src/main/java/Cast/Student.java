package Cast;

import java.util.Scanner;

public class Student extends MainCast {

    int sum =0;
    public Boolean 스킬사용 = true;
    MagicAttack Magic = new MagicAttack();


    public int attack()
    {

            Scanner scanner = new Scanner(System.in);
            System.out.println("");
            System.out.println("                              ===============================");
            System.out.println("                                      1. 인센디오");
            System.out.println("                                      2. 엑스펠리아르무스              ");
            System.out.println("                             ==============================\n");
            System.out.println("                                    공격 번호를 입력하세요 : ");
            System.out.println("");
            int number = scanner.nextInt();


            if (number == 1) {

                if (스킬사용 == true || Magic.쿨타임.getState() == Thread.State.TERMINATED) {
                    sum += MagicPoint * 2;
                    mp = mp - 3;
                    System.out.println("");
                    System.out.println("                  =============================================\n");
                    System.out.println("                      [ 인센디오   ] 를 사용하였습니다.");
                    System.out.println("                      플레이어가 준 데미지는 " + sum + "입니다.\n");
                    System.out.println("                    =============================================\n");
                    System.out.println("");
                    Magic.주문1();

                    스킬사용 = false;
                } else if (스킬사용 == false) {
                    if (Magic.쿨타임.getState() == Thread.State.TIMED_WAITING) {
                        System.out.println("                        [인센디오] 의 쿨타임이 종료되지 않았습니다.");

                        스킬사용 = false;
                    }
                }
                return sum;


            }
            if (number == 2) {

                if (스킬사용 == true || Magic.쿨타임.getState() == Thread.State.TERMINATED) {
                    sum += MagicPoint;
                    mp = mp - 1;
                    System.out.println("");
                    System.out.println("                  =============================================\n");
                    System.out.println("                      [ 엑스펠리아르무스   ] 를 사용하였습니다.");
                    System.out.println("                      플레이어가 준 데미지는 " + sum + "입니다.\n");
                    System.out.println("                    =============================================\n");
                    System.out.println("");
                    Magic.주문2();

                    스킬사용 = false;
                } else if (스킬사용 == false) {
                    if (Magic.쿨타임.getState() == Thread.State.TIMED_WAITING) {
                        System.out.println("                               [엑스펠리아르무스  ] 의 쿨타임이 종료되지 않았습니다.");

                        스킬사용 = false;
                    }
                }
                return sum;

            }

            return sum;


    }



}
