package com.fasterxml.jackson.databind.annotation;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.util.Converter;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@JacksonAnnotation
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface JsonSerialize {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Deprecated
    public static final class Inclusion {
        public static final Inclusion d;
        public static final /* synthetic */ Inclusion[] e;

        /* JADX INFO: Fake field, exist only in values array */
        Inclusion EF0;

        static {
            Inclusion inclusion = new Inclusion("ALWAYS", 0);
            Inclusion inclusion2 = new Inclusion("NON_NULL", 1);
            Inclusion inclusion3 = new Inclusion("NON_DEFAULT", 2);
            Inclusion inclusion4 = new Inclusion("NON_EMPTY", 3);
            Inclusion inclusion5 = new Inclusion("DEFAULT_INCLUSION", 4);
            d = inclusion5;
            e = new Inclusion[]{inclusion, inclusion2, inclusion3, inclusion4, inclusion5};
        }

        public static Inclusion valueOf(String str) {
            return (Inclusion) Enum.valueOf(Inclusion.class, str);
        }

        public static Inclusion[] values() {
            return (Inclusion[]) e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Typing {
        public static final Typing d;
        public static final Typing e;
        public static final Typing f;
        public static final /* synthetic */ Typing[] g;

        static {
            Typing typing = new Typing("DYNAMIC", 0);
            d = typing;
            Typing typing2 = new Typing("STATIC", 1);
            e = typing2;
            Typing typing3 = new Typing("DEFAULT_TYPING", 2);
            f = typing3;
            g = new Typing[]{typing, typing2, typing3};
        }

        public static Typing valueOf(String str) {
            return (Typing) Enum.valueOf(Typing.class, str);
        }

        public static Typing[] values() {
            return (Typing[]) g.clone();
        }
    }

    Class as() default Void.class;

    Class contentAs() default Void.class;

    Class contentConverter() default Converter.None.class;

    Class contentUsing() default JsonSerializer.None.class;

    Class converter() default Converter.None.class;

    Inclusion include() default Inclusion.d;

    Class keyAs() default Void.class;

    Class keyUsing() default JsonSerializer.None.class;

    Class nullsUsing() default JsonSerializer.None.class;

    Typing typing() default Typing.f;

    Class using() default JsonSerializer.None.class;
}
