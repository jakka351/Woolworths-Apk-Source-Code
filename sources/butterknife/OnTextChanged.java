package butterknife;

import butterknife.internal.ListenerClass;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: callback */
/* JADX WARN: Method from annotation default annotation not found: value */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@ListenerClass
/* loaded from: classes4.dex */
public @interface OnTextChanged {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Callback {
        public static final Callback d;
        public static final /* synthetic */ Callback[] e;

        static {
            Callback callback = new Callback("TEXT_CHANGED", 0);
            d = callback;
            e = new Callback[]{callback, new Callback("BEFORE_TEXT_CHANGED", 1), new Callback("AFTER_TEXT_CHANGED", 2)};
        }

        public static Callback valueOf(String str) {
            return (Callback) Enum.valueOf(Callback.class, str);
        }

        public static Callback[] values() {
            return (Callback[]) e.clone();
        }
    }
}
