package com.fasterxml.jackson.databind.annotation;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@JacksonAnnotation
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface JsonAppend {

    public @interface Attr {
        JsonInclude.Include include() default JsonInclude.Include.e;

        String propName() default "";

        String propNamespace() default "";

        boolean required() default false;

        String value();
    }

    public @interface Prop {
        JsonInclude.Include include() default JsonInclude.Include.e;

        String name() default "";

        String namespace() default "";

        boolean required() default false;

        Class type() default Object.class;

        Class value();
    }

    Attr[] attrs() default {};

    boolean prepend() default false;

    Prop[] props() default {};
}
