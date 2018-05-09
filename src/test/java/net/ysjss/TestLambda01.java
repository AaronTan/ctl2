package net.ysjss;


import org.junit.Test;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestLambda01 {

    //=======================Consumer
    @Test
    public void testConsumer(){
        ConsumerInterface(new Date().toString(),(x) -> {
            System.out.println("Consumer:" + x.substring(3,x.length()-2).toUpperCase());
        });
    }

    public void ConsumerInterface(String s1, Consumer<String> consumer){
        consumer.accept(s1);
    }
    //=======================Supplier
    @Test
    public void testSupplier(){
     SupplierInterface(new String(),() -> {
            return "Supplier:" + new Date();
        });

    }

    public void SupplierInterface(String s1, Supplier<String> supplier){
        s1 = supplier.get();
        System.out.println(s1);
    }
    //=======================Function
    @Test
    public void testFunction(){
        Integer i = FunctionInterface(new Date().toString(),(x) -> {
            return x.length();
        });
        System.out.println("i------:" + i);
    }

    public Integer FunctionInterface(String s1,Function<String,Integer> function){
        return function.apply(s1);

    }
    //=======================Predicate

    @Test
    public void testPredicate(){
        Boolean b1;
        for(int i=0 ; i < 100 ; i++){
            b1 = PredicateInterface(i,x -> x % 3 == 0);
            System.out.println(i + ":" + b1);
        }

    }

    public Boolean PredicateInterface(Integer i, Predicate<Integer> predicate){
        return predicate.test(i);
    }

}
