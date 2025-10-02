package com.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@JacksonAnnotation
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface JsonSubTypes {

    public @interface Type {
        String name() default "";

        String[] names() default {};

        Class value();
    }

    boolean failOnRepeatedNames() default false;

    Type[] value();
}
