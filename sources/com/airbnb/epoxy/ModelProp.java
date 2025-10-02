package com.airbnb.epoxy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: defaultValue */
/* JADX WARN: Method from annotation default annotation not found: group */
/* JADX WARN: Method from annotation default annotation not found: options */
/* JADX WARN: Method from annotation default annotation not found: value */
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes4.dex */
public @interface ModelProp {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Option {
        public static final /* synthetic */ Option[] d = {new Option("DoNotHash", 0), new Option("IgnoreRequireHashCode", 1), new Option("GenerateStringOverloads", 2), new Option("NullOnRecycle", 3)};

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
