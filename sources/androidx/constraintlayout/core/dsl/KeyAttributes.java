package androidx.constraintlayout.core.dsl;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class KeyAttributes extends Keys {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Fit {
        public static final /* synthetic */ Fit[] d = {new Fit("SPLINE", 0), new Fit("LINEAR", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        Fit EF5;

        public static Fit valueOf(String str) {
            return (Fit) Enum.valueOf(Fit.class, str);
        }

        public static Fit[] values() {
            return (Fit[]) d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Visibility {
        public static final /* synthetic */ Visibility[] d = {new Visibility("VISIBLE", 0), new Visibility("INVISIBLE", 1), new Visibility("GONE", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        Visibility EF5;

        public static Visibility valueOf(String str) {
            return (Visibility) Enum.valueOf(Visibility.class, str);
        }

        public static Visibility[] values() {
            return (Visibility[]) d.clone();
        }
    }

    public final String toString() {
        return "null:{\nframe:" + Arrays.toString((int[]) null) + ",\n},\n";
    }
}
