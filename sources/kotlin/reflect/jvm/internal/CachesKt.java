package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*0\b\u0002\u0010\u0004\"\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/Pair;", "", "Lkotlin/reflect/KTypeProjection;", "", "Key", "kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CachesKt {

    /* renamed from: a, reason: collision with root package name */
    public static final CacheByClass f24276a;
    public static final CacheByClass b;
    public static final CacheByClass c;
    public static final CacheByClass d;
    public static final CacheByClass e;

    static {
        int i = CacheByClassKt.f24275a;
        f24276a = new ConcurrentHashMapCache(CachesKt$$Lambda$0.d);
        b = new ConcurrentHashMapCache(CachesKt$$Lambda$1.d);
        c = new ConcurrentHashMapCache(CachesKt$$Lambda$2.d);
        d = new ConcurrentHashMapCache(CachesKt$$Lambda$3.d);
        e = new ConcurrentHashMapCache(CachesKt$$Lambda$4.d);
    }

    public static final KClassImpl a(Class jClass) {
        Intrinsics.h(jClass, "jClass");
        Object objA = f24276a.a(jClass);
        Intrinsics.f(objA, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (KClassImpl) objA;
    }
}
