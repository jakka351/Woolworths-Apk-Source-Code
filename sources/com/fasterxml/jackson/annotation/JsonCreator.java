package com.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@JacksonAnnotation
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface JsonCreator {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Mode {
        public static final Mode d;
        public static final Mode e;
        public static final Mode f;
        public static final Mode g;
        public static final /* synthetic */ Mode[] h;

        static {
            Mode mode = new Mode("DEFAULT", 0);
            d = mode;
            Mode mode2 = new Mode("DELEGATING", 1);
            e = mode2;
            Mode mode3 = new Mode("PROPERTIES", 2);
            f = mode3;
            Mode mode4 = new Mode("DISABLED", 3);
            g = mode4;
            h = new Mode[]{mode, mode2, mode3, mode4};
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) h.clone();
        }
    }

    Mode mode() default Mode.d;
}
