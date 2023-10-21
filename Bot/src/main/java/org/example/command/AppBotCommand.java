package org.example.command;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AppBotCommand {
    String name();
    String description();
    boolean showInHelp() default true;
    boolean showInKeyBoard() default true;
}
