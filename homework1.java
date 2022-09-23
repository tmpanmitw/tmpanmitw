public class homework1 {
    public static void main(String[] args){
//        문제 #1
//        int var1=5;
//        int var2=2;
//        double var3=var1/var2;
//        int var4=(int)(var3*var2);
//        System.out.println(var4);  //결과값 = 4

        int var1 = 5;
        int var2 = 2;
        System.out.println(var1/var2);
        //결과값 = 2 -> 정수형/정수형 = 정수형출력 -> 2.5에서 소수점 버리고 정수형 2출력
        System.out.println((double)(var1/var2));
        //결과값 = 2.0 -> 이미 2값을 갖는 정수형을 double로 할당하면 2.0출력
        //여기서 변수를 할당하기 전에 '변수에 할당되는 값의 연산을 우선적'으로 한다는 것을 알 수 있다.
        double var3 = var1/var2;
        System.out.println(var3);
        //결과값 = 2.0
        System.out.println((var3*var2));
        //결과값 = 4.0 -> 실수형 2.0과 정수형 2의 연산은 실수형을 출력한다는 것을 알 수 있다.
        System.out.println((int)(var3*var2));
        //결과값 = 4 -> 실수형 4.0에 int를 적용해 정수형 4를 출력한다.
//        java에서는 type변환을 할때 (int)(변환대상)과 같이 int양쪽에 괄호를 쳐준다. 타언어와 차이
        int var4=(int)(var3*var2);

//        변수명.getClass().getName() // 변수타입 출력함수
//        System.out.println((var1.getClass().getName());
    }

}

