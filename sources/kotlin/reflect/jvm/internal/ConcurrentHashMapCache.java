package kotlin.reflect.jvm.internal;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/ConcurrentHashMapCache;", "V", "Lkotlin/reflect/jvm/internal/CacheByClass;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class ConcurrentHashMapCache<V> extends CacheByClass<V> {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f24277a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public ConcurrentHashMapCache(Function1 function1) {
        this.f24277a = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.CacheByClass
    public final Object a(Class key) {
        Intrinsics.h(key, "key");
        ConcurrentHashMap concurrentHashMap = this.b;
        Object obj = concurrentHashMap.get(key);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = this.f24277a.invoke(key);
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(key, objInvoke);
        return objPutIfAbsent == null ? objInvoke : objPutIfAbsent;
    }
}
