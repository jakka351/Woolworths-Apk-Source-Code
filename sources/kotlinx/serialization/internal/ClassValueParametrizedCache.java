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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/ClassValueParametrizedCache;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class ClassValueParametrizedCache<T> implements ParametrizedSerializerCache<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f24787a;
    public final ClassValueReferences b = new ClassValueReferences();

    public ClassValueParametrizedCache(Function2 function2) {
        this.f24787a = function2;
    }

    @Override // kotlinx.serialization.internal.ParametrizedSerializerCache
    public final Object a(KClass kClass, ArrayList arrayList) {
        Object objA;
        Object obj = this.b.get(JvmClassMappingKt.b(kClass));
        Intrinsics.g(obj, "get(...)");
        MutableSoftReference mutableSoftReference = (MutableSoftReference) obj;
        Object objA2 = mutableSoftReference.reference.get();
        if (objA2 == null) {
            objA2 = mutableSoftReference.a(new ClassValueParametrizedCache$getgIAlus$$inlined$getOrSet$1());
        }
        ParametrizedCacheEntry parametrizedCacheEntry = (ParametrizedCacheEntry) objA2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new KTypeWrapper((KType) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = parametrizedCacheEntry.f24812a;
        Object obj2 = concurrentHashMap.get(arrayList2);
        if (obj2 == null) {
            try {
                objA = (KSerializer) this.f24787a.invoke(kClass, arrayList);
            } catch (Throwable th) {
                objA = ResultKt.a(th);
            }
            Result result = new Result(objA);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, result);
            obj2 = objPutIfAbsent == null ? result : objPutIfAbsent;
        }
        return ((Result) obj2).d;
    }
}
