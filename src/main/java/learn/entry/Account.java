package learn.entry;

import learn.annonation.Log;

import java.lang.reflect.Field;

@Log
public class Account {

    private String name;
    private String sex;

    public static void main(String[] args) {

        Object i = 5/10;
        if(i instanceof  Integer)
            System.out.println(String.format("计算结果为整型，值为：%d",i));


        double a = new Double(5)/10;
        System.out.println(a);

        Class<Account> clazz = Account.class;

        Log log = clazz.getAnnotation(Log.class);

        System.out.println(String.format("Log:%s",log.level()));

        try {
            Class accountClass= Class.forName("learn.entry.Account");

            Object account= accountClass.newInstance();

            Field[] fields = accountClass.getDeclaredFields();

            for(Field field:fields)
            {
                System.out.println(String.format("class param %s,type:%s",field.getName(),field.getType()));
            }

        }catch (Exception e)
        {
            System.out.println("Exception content is %s"+e.getMessage());
        }
    }
}
