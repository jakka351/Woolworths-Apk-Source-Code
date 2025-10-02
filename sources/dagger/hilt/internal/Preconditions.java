package dagger.hilt.internal;

/* loaded from: classes.dex */
public final class Preconditions {
    public static void a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
