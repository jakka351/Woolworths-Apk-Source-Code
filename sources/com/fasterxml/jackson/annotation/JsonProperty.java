package com.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@JacksonAnnotation
@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface JsonProperty {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Access {
        public static final Access d;
        public static final /* synthetic */ Access[] e;

        static {
            Access access = new Access("AUTO", 0);
            d = access;
            e = new Access[]{access, new Access("READ_ONLY", 1), new Access("WRITE_ONLY", 2), new Access("READ_WRITE", 3)};
        }

        public static Access valueOf(String str) {
            return (Access) Enum.valueOf(Access.class, str);
        }

        public static Access[] values() {
            return (Access[]) e.clone();
        }
    }

    Access access() default Access.d;

    String defaultValue() default "";

    int index() default -1;

    String namespace() default "";

    boolean required() default false;

    String value() default "";
}
