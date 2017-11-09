package bj_1932;

//import java.lang.reflect.Array;


import java.util.ArrayList;
import java.util.Iterator;

import java.io.IOException;


public class Main {


    //parseInt는 String만 매개변수로 받으므로 객체를 String으로 바꿔서 형변환한다.
    static int convert(Object obj){
        return Integer.parseInt(obj.toString());
    }
    //이거의 원리를 모름..


    public static void main(String[] args) throws IOException {

        FileRead file = new FileRead("/Users/jhoon/workspace/hakium/algorithm/src/bj_1932/out.txt");
        ArrayList lists = file.read();

//        iterator 정의하기
        Iterator it = lists.iterator();

        int input = convert(it.next());

        int max = 0;

        int dp[][] = new int[input + 1][];
        int num[][] = new int[input + 1][];


//        동적할당
        for (int i = 1; i < input + 1; i++) {
            for (int j = 1; j < i + 1; j++) {
                num[i] = new int[i + 1];
            }
        }

        for (int i = 1; i < input + 1; i++) {
            for (int j = 1; j < i + 1; j++) {
                dp[i] = new int[i + 1];
            }
        }

//        값을 입력하는 부분
        for (int i = 1; i < input + 1; i++) {
            for (int j = 1; j < i + 1; j++) {
                num[i][j] = convert(it.next());
            }
        }

        dp[1][1] = num[1][1];

        for (int i = 2; i < input + 1; i++) {
            for (int j = 1; j < i + 1; j++) {

                try {
                    dp[i][j] = Math.max(dp[i - 1][j] + num[i][j], dp[i - 1][j - 1] + num[i][j]);
                } catch (ArrayIndexOutOfBoundsException e) {
//                    System.out.println("배열 초과");
                }

            }
        }


//        for (int i = 1; i < input + 1; i++) {
//            for (int j = 1; j < i + 1; j++) {
//                System.out.print(dp[i][j]);
//            }
//            System.out.println();
//        }


        for (int j = 1; j < input + 1; j++) {
            if (max < dp[input][j])
                max = dp[input][j];


        }

        System.out.print(max);


    }
}
