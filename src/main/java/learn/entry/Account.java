package learn.entry;

import learn.annonation.Log;

import java.lang.reflect.Field;

@Log
public class Account {

    private String name;
    private String sex;

    public static void main(String[] args) {
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
