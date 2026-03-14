package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})

public @interface UrlTemplate {

    String value();

    String name() default "";
<<<<<<< HEAD
}
=======
}
>>>>>>> 4f50a07e6427193872621e3257ef942a79a86db2
