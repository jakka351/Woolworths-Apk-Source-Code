package com.fasterxml.jackson.databind.annotation;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@JacksonAnnotation
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface JsonPOJOBuilder {

    public static class Value {

        /* renamed from: a, reason: collision with root package name */
        public final String f14232a;
        public final String b;

        public Value(JsonPOJOBuilder jsonPOJOBuilder) {
            String strBuildMethodName = jsonPOJOBuilder.buildMethodName();
            String strWithPrefix = jsonPOJOBuilder.withPrefix();
            this.f14232a = strBuildMethodName;
            this.b = strWithPrefix;
        }
    }

    String buildMethodName() default "build";

    String withPrefix() default "with";
}
