package net.ysjss;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by tanlin on 2018-5-9.
 */
public class TestLambda02_exercise {

    @Test
    public void test01(){
    //    List<>
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("zhangsan",30));
        employees.add(new Employee("lisi",30));
        employees.add(new Employee("wangwu",22));
        employees.add(new Employee("tianqi",40));


        Collections.sort(employees,(Employee e1,Employee e2)->{
            if(e1.age != e2.age){
                return Integer.compare(e1.age,e2.age);
            }else{
                return e1.name.compareTo(e2.name);
            }
        });

        for(Employee emp : employees){
            System.out.println(emp.name + ":" + emp.age);
        }
    }
}

class Employee{
    String name;
    int age;

    Employee(String name,int age){
        this.name = name;
        this.age = age;
    }
}