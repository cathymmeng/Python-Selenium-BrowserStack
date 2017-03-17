package au.id.mcmaster.playwithjbehave.common;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.xml.bind.annotation.XmlSchema;

@Retention(RUNTIME)
@Target({TYPE})
public @interface Story {
    String name();
    Class<?>[] steps();
}
