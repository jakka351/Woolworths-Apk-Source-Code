package com.airbnb.epoxy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: hash */
/* JADX WARN: Method from annotation default annotation not found: setter */
/* JADX WARN: Method from annotation default annotation not found: value */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes4.dex */
public @interface EpoxyAttribute {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Option {
        public static final /* synthetic */ Option[] d = {new Option("NoGetter", 0), new Option("NoSetter", 1), new Option("DoNotHash", 2), new Option("IgnoreRequireHashCode", 3), new Option("DoNotUseInToString", 4)};

        /* JADX INFO: Fake field, exist only in values array */
        Option EF5;

        public static Option valueOf(String str) {
            return (Option) Enum.valueOf(Option.class, str);
        }

        public static Option[] values() {
            return (Option[]) d.clone();
        }
    }
}
