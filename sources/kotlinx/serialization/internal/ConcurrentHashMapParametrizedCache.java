package kotlinx.serialization.internal;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/ConcurrentHashMapParametrizedCache;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class ConcurrentHashMapParametrizedCache<T> implements ParametrizedSerializerCache<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f24790a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public ConcurrentHashMapParametrizedCache(Function2 function2) {
        this.f24790a = function2;
    }

    @Override // kotlinx.serialization.internal.ParametrizedSerializerCache
    public final Object a(KClass kClass, ArrayList arrayList) {
        Object objA;
        Object objPutIfAbsent;
        Class clsB = JvmClassMappingKt.b(kClass);
        ConcurrentHashMap concurrentHashMap = this.b;
        Object parametrizedCacheEntry = concurrentHashMap.get(clsB);
        if (parametrizedCacheEntry == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsB, (parametrizedCacheEntry = new ParametrizedCacheEntry()))) != null) {
            parametrizedCacheEntry = objPutIfAbsent;
        }
        ParametrizedCacheEntry parametrizedCacheEntry2 = (ParametrizedCacheEntry) parametrizedCacheEntry;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new KTypeWrapper((KType) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = parametrizedCacheEntry2.f24812a;
        Object obj = concurrentHashMap2.get(arrayList2);
        if (obj == null) {
            try {
                objA = (KSerializer) this.f24790a.invoke(kClass, arrayList);
            } catch (Throwable th) {
                objA = ResultKt.a(th);
            }
            Result result = new Result(objA);
            Object objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList2, result);
            obj = objPutIfAbsent2 == null ? result : objPutIfAbsent2;
        }
        return ((Result) obj).d;
    }
}
