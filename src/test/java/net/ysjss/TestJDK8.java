package net.ysjss;


import org.junit.Test;

import java.util.Comparator;
import java.util.Date;

public class TestJDK8 {

    @Test
    public void TestLambda(){
        OneFuncNoParamNoReturn t1 = () -> System.out.println("------>testLambdas:OneFuncNoParamNoReturn");
        t1.Test();

        OneFuncOneParamNoReturn<Date> t21 = (x) -> System.out.println("----->testLambdas:OneFuncOneParamNoReturn:" + x);
        t21.Test(new Date());

        //一个参数不需要括号
        OneFuncOneParamNoReturn<String> t22 = x -> System.out.println("----->testLambdas:OneFuncOneParamNoReturn:" + x);
        t22.Test("一个参数，不需要括号了");

        //参数数据类型不用写，JVM编译器通过上下文推断出数据类型，即"类型推断"
        Comparator<Integer> c1 = (Integer x, Integer y) -> Integer.compare(x,y);
        Comparator<Integer> c2 = (x,y) -> Integer.compare(x,y);

        //2个以上参数,多条语句，有返回值
        OneFuncTwoParamHasReturn<Integer,Double> t3 = (x,y) ->
        {
            x += 27;
            y *= 67.89;
            return x*y;
        };
        System.out.println("-----estLambdas:OneFuncTwoParamHasReturn:" + t3.Test(50,34.567));
    }

    //匿名内部类实现方式
    @Test
    public void TestAnonymousInnerClass(){
        OneFuncNoParamNoReturn t1 = new OneFuncNoParamNoReturn(){
            @Override
            public void Test() {
                System.out.println("=======>AIC:OneFuncNoParamNoReturn");
            }
        };

        t1.Test();
    }
}
