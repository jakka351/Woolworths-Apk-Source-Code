package androidx.core.util;

/* loaded from: classes.dex */
public class ObjectsCompat {
    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
