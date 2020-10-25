package com.javacode.day06;

import java.util.ArrayList;

/**
 * @ClassName ReceptTest
 * @Description TODO
 * @Author apple
 * @Date 2020/10/25
 *
 * 模拟接待员接待客户，根据用户id，给用户分组。定义接口Filter
 * 提供抽象方法，filterUser(User u)定义用户
 * 属性：用户类型，用户id
 * 提供基本的构造方法，get和set方法，定义接待员类
 * 属性，结构Filter，提供基本的构造方法，get和set方法
 * 成员方法；接到用户方法，设置用户类型
 *
 * 测试类
 * 初始化50个User 对象，id为1-50，创建三个接待员对象
 * 第一个接待员，设置接待规则，将10-19号用户类型设置为v1
 * 第二个接待员，设置接待规则，将20-29号用户类型设置为v2。最后遍历用户集合，给用户分区
 *
 *
 **/
interface Filter {
    /**
     * 过滤用户
     */
    void filterUser(User u);
}

public class ReceptTest {
    private static final int V1 = 10;
    private static final int V2 = 20;
    private static final int V3 = 30;
    private static final int MAX = 50;

    public static void main(String[] args) {
        ArrayList<User> ulist = new ArrayList<>();
        for (int i = 1; i < MAX; i++) {
            ulist.add(new User(i));
        }
        System.out.println("未分组");
        System.out.println(ulist);
        Reception r1 = new Reception();
        Reception r2 = new Reception();
        Reception r3 = new Reception();
        //内部匿名类，更好的方式是使用Lambda表达式
        r1.setF(new Filter() {
            @Override
            public void filterUser(User u) {
                if (u.getId() >= V1 && u.getId() < V2) {
                    u.setType("v1");
                }
            }
        });

        //Lambda表达式写法
        r2.setF(u ->{
            if (u.getId() >= V2 && u.getId() < V3) {
                u.setType("v2");
            }
        });
        for (User user:ulist){
            r1.recept(user);
            r2.recept(user);
            r3.recept(user);
        }
        System.out.println("未分组：");
        for (int i=0;i<ulist.size();i++){
            User user=ulist.get(i);
            //每到九个换行
            if (i%9==0){
                System.out.println();
            }
            System.out.println(user + " ");
        }
    }

}

class User {
    private String type;
    private final int id;

    public User(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + "-" + type;
    }
}

class Reception {
    Filter f;

    public Filter getF() {
        return f;
    }

    public void setF(Filter f) {
        this.f = f;
    }

    public void recept(User u) {
        if (u.getType() != null) {
            return;
        }
        if (f != null) {
            f.filterUser(u);
        } else {
            u.setType("A");
        }
    }
}
