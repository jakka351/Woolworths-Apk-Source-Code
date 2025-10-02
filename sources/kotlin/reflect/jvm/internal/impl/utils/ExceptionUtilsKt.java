package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ExceptionUtilsKt {
    public static final boolean a(Throwable th) {
        Class<?> superclass = th.getClass();
        while (!Intrinsics.c(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static final void b(Throwable th) throws Throwable {
        throw th;
    }
}
