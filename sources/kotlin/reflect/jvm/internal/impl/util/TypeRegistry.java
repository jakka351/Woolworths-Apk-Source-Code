package kotlin.reflect.jvm.internal.impl.util;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* loaded from: classes.dex */
public abstract class TypeRegistry<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f24648a = new ConcurrentHashMap();
    public final AtomicInteger b = new AtomicInteger(0);

    public abstract int a(ConcurrentHashMap concurrentHashMap, String str, Function1 function1);

    public final int b(KClass kClass) {
        Intrinsics.h(kClass, "kClass");
        String strX = kClass.x();
        Intrinsics.e(strX);
        return a(this.f24648a, strX, new TypeRegistry$$Lambda$0(this));
    }
}
