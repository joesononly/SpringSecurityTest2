package www.listener;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.annotation.Annotation;
import java.net.URI;

public class UrlSecurityListener {

    /*
    * Comment:获取当前运行中的类
    * */
    private String getCurrentRunClass(){
        String currentRunClass = new Exception().getStackTrace()[0].getClassName();
        System.out.println(String.format("The Current Class :%s",currentRunClass));
        return currentRunClass;
    }

    /*
    * Comment:根据当前运行中的类获取同级包
    * */
    private String getCurrentPackeByClass(){
        String currentClass = this.getCurrentRunClass();
        String parentPackage = currentClass.substring(0,currentClass.indexOf("."));

        System.out.println(String.format("The Current Parent Package :%s",parentPackage));

        return parentPackage;
    }

    /*
    * Comment:通过父包检索包下的所有Class文件
    * */
    private void getResources(){
        try {
            String currentPacke = this.getCurrentPackeByClass();
            String absolutePath = String.format("classpath*:%s/**/*.class",currentPacke);
            PathMatchingResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
            Resource[] resources = resourcePatternResolver.getResources(absolutePath);

            for(Resource resource:resources){
                URI uri = resource.getURI();
                System.out.println(String.format("This is Uri is %s",uri.toString()));
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    private void LoadClass(URI uri){
        try {
            ClassLoader loader = Thread.currentThread().getContextClassLoader();
            Class zClass = loader.loadClass("I:/SpringSecurityTest/target/classes/www/bean/Account.class");
            Annotation[] annotations = zClass.getAnnotations();
            for (Annotation annotation:annotations){
                System.out.println(String.format("The Annotation of this class:%s",annotation.annotationType()));
            }
            Field[] fields = zClass.getFields();
        }catch (ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

    }

    public static  void main(String[] args){
        UrlSecurityListener listener = new UrlSecurityListener();
        listener.getCurrentRunClass();
        listener.getCurrentPackeByClass();
        listener.getResources();
        listener.LoadClass(null);
    }
}
