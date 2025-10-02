package kotlinx.serialization.internal;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/ConcurrentHashMapCache;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/serialization/internal/SerializerCache;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class ConcurrentHashMapCache<T> implements SerializerCache<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f24789a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public ConcurrentHashMapCache(Function1 function1) {
        this.f24789a = function1;
    }

    @Override // kotlinx.serialization.internal.SerializerCache
    public final KSerializer get(KClass kClass) {
        Object objPutIfAbsent;
        Class clsB = JvmClassMappingKt.b(kClass);
        ConcurrentHashMap concurrentHashMap = this.b;
        Object cacheEntry = concurrentHashMap.get(clsB);
        if (cacheEntry == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsB, (cacheEntry = new CacheEntry((KSerializer) this.f24789a.invoke(kClass))))) != null) {
            cacheEntry = objPutIfAbsent;
        }
        return ((CacheEntry) cacheEntry).f24782a;
    }
}
