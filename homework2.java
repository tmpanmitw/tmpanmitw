public class homework2 {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        int z = (++x) + (y--);
//        증감연산자 ++, --가 변수 앞에 붙으면 1을 더하거나 뺀 값을 변수가 재할당한 후 연산수행
//                                 변수 뒤에 붙으면 연산 수행 이후 1을 더하거나 뺀값을 재할당함
//                                 결과적으로 변수에는 1을 더하거나 뺀값이 재할당됨
//        z = 11+20 = 31, x = 11, y = 19
        System.out.println(z);
        System.out.println(x);
        System.out.println(y);

    }
}
