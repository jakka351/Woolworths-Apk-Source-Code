package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ReflectJavaClassFinderKt {
    public static final Class a(ClassLoader classLoader, String fqName) {
        Intrinsics.h(fqName, "fqName");
        try {
            return Class.forName(fqName, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
