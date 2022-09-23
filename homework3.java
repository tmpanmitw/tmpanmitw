public class homework3 {
    public static void main(String[] args) {
//        while문과 Math.random() 메소드를 이용해서 2개의 주사위를 던졌을 때 나오는 눈을
//        (눈1, 눈2) 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고,
//        눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요.
//        눈의 합이 5가 되는 조합은 (1,4), (4,1), (2,3), (3,2)입니다.
//        Math.random()함수는 위 예제처럼 0.xxxx ~ 0.9xxx 까지의 값을 반환한다.

//        랜덤함수를 이용해 변수가 저장한 후 반복문을 출력시키면,
//        랜덤함수가 먼저 돌아가고 결정된 수가 변수에 저장한 후 반복문에 들어가기 때문에
//        동일한 숫자만 계속해서 출력되는 것을 알 수 있다.
//        반복문안에 랜덤함수를 넣어야 한다.

//        Q  2개 이상의 변수를 출력할때 방법 // ""의 의미??

        while (true){
            int dice1 = (int)(Math.random()*6)+1;
            int dice2 = (int)(Math.random()*6)+1;
//            System.out.println("("+dice1+")");
            System.out.println("(" + dice1 + "," + dice2 + ")");
//              System.out.println(String.format(("%d, %d"), dice1, dice2));
            if(dice1+dice2==5){
                break;
        }
    }
    }
}
