package com.airbnb.epoxy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: defaultBaseModelClass */
/* JADX WARN: Method from annotation default annotation not found: defaultLayoutPattern */
/* JADX WARN: Method from annotation default annotation not found: disableGenerateBuilderOverloads */
/* JADX WARN: Method from annotation default annotation not found: disableGenerateGetters */
/* JADX WARN: Method from annotation default annotation not found: disableGenerateReset */
/* JADX WARN: Method from annotation default annotation not found: generatedModelSuffix */
/* JADX WARN: Method from annotation default annotation not found: useLayoutOverloads */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes4.dex */
public @interface PackageModelViewConfig {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Option {
        public static final Option d;
        public static final /* synthetic */ Option[] e;

        static {
            Option option = new Option("Default", 0);
            d = option;
            e = new Option[]{option, new Option("Enabled", 1), new Option("Disabled", 2)};
        }

        public static Option valueOf(String str) {
            return (Option) Enum.valueOf(Option.class, str);
        }

        public static Option[] values() {
            return (Option[]) e.clone();
        }
    }
}
