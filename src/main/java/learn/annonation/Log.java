package learn.annonation;

import javax.xml.bind.Element;
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
    String level() default "debug";
}
