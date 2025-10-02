package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes.dex */
public final class StorageKt {
    public static final Object a(NotNullLazyValue notNullLazyValue, KProperty p) {
        Intrinsics.h(notNullLazyValue, "<this>");
        Intrinsics.h(p, "p");
        return notNullLazyValue.invoke();
    }
}
