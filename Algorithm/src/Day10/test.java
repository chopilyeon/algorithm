package Day10;



import java.io.IOException;
import java.io.InputStream;

public class test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
		/*
		System.in; // 이게 키보드임 입력의 소스가 누구냐 -> 입력이었음.
		System.out // 이게 출력임
		*/

        //System.in System.out System.error 이런 것들이 있음

        InputStream is = System.in;
        System.out.print("키보드 입력을 하세요. ctrl+z 입력시 종료");


        while(true) {
            try {
                int c = is.read();
                if(c==-1)break;
                System.out.print((char)c);
                //System.out.print(c);

                // 원래는 치면 받고 치면 받고 해야되는데. 왜? -> 버퍼 사용하기 때문임.
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } // 숫자형태로 출력 겁나해줌. // 엔터나올때까지 입력받음 -> 버퍼 쓰기 때문임 키보드 자체는 버퍼
        //가나다라는 2byte임
        //bytestream이라 1byte씩 읽느라 이상하게 나옴 . ox34oxA5 면 ox34 만 읽어서 이상하게 나옴

        //읽을때 우리는 2byte씩 읽고 싶으므로 그런 filter class가 필요함





        //checked exception 임 -> 키보드가 빠져있을수도 있고 stream에서 문제가 생길수 있기 때문 -> 에러가 발생할수 있음
        //io exception에 대한 에러가 필요함
        //unhandled exception임
        //surround try-catch 쓰면 자동완성 만들어줌.





    }

}
