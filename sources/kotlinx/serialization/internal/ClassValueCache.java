package kotlinx.serialization.internal;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/ClassValueCache;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/serialization/internal/SerializerCache;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class ClassValueCache<T> implements SerializerCache<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f24786a;
    public final ClassValueReferences b = new ClassValueReferences();

    public ClassValueCache(Function1 function1) {
        this.f24786a = function1;
    }

    @Override // kotlinx.serialization.internal.SerializerCache
    public final KSerializer get(final KClass kClass) {
        Object obj = this.b.get(JvmClassMappingKt.b(kClass));
        Intrinsics.g(obj, "get(...)");
        MutableSoftReference mutableSoftReference = (MutableSoftReference) obj;
        Object objA = mutableSoftReference.reference.get();
        if (objA == null) {
            objA = mutableSoftReference.a(new Function0<Object>() { // from class: kotlinx.serialization.internal.ClassValueCache$get$$inlined$getOrSet$1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new CacheEntry((KSerializer) this.d.f24786a.invoke(kClass));
                }
            });
        }
        return ((CacheEntry) objA).f24782a;
    }
}
