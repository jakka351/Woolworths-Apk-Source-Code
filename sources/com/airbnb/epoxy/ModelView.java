package com.airbnb.epoxy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: autoLayout */
/* JADX WARN: Method from annotation default annotation not found: baseModelClass */
/* JADX WARN: Method from annotation default annotation not found: defaultLayout */
/* JADX WARN: Method from annotation default annotation not found: fullSpan */
/* JADX WARN: Method from annotation default annotation not found: saveViewState */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes4.dex */
public @interface ModelView {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Size {
        public static final Size d;
        public static final /* synthetic */ Size[] e;

        static {
            Size size = new Size("NONE", 0);
            d = size;
            e = new Size[]{size, new Size("MANUAL", 1), new Size("WRAP_WIDTH_WRAP_HEIGHT", 2), new Size("WRAP_WIDTH_MATCH_HEIGHT", 3), new Size("MATCH_WIDTH_WRAP_HEIGHT", 4), new Size("MATCH_WIDTH_MATCH_HEIGHT", 5)};
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) e.clone();
        }
    }
}
