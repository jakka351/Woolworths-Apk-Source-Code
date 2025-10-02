package com.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@JacksonAnnotation
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface JsonTypeInfo {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class As {
        public static final As d;
        public static final As e;
        public static final As f;
        public static final As g;
        public static final As h;
        public static final /* synthetic */ As[] i;

        static {
            As as = new As("PROPERTY", 0);
            d = as;
            As as2 = new As("WRAPPER_OBJECT", 1);
            e = as2;
            As as3 = new As("WRAPPER_ARRAY", 2);
            f = as3;
            As as4 = new As("EXTERNAL_PROPERTY", 3);
            g = as4;
            As as5 = new As("EXISTING_PROPERTY", 4);
            h = as5;
            i = new As[]{as, as2, as3, as4, as5};
        }

        public static As valueOf(String str) {
            return (As) Enum.valueOf(As.class, str);
        }

        public static As[] values() {
            return (As[]) i.clone();
        }
    }

    public enum Id {
        NONE(null),
        CLASS("@class"),
        MINIMAL_CLASS("@c"),
        /* JADX INFO: Fake field, exist only in values array */
        NAME("@type"),
        DEDUCTION(null),
        /* JADX INFO: Fake field, exist only in values array */
        CUSTOM(null);

        public final String d;

        Id(String str) {
            this.d = str;
        }
    }

    @Deprecated
    public static abstract class None {
    }

    Class defaultImpl() default JsonTypeInfo.class;

    As include() default As.d;

    String property() default "";

    Id use();

    boolean visible() default false;
}
