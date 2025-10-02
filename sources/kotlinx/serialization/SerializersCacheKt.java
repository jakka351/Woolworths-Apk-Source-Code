package kotlinx.serialization;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.CachingKt;
import kotlinx.serialization.internal.ParametrizedSerializerCache;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.SerializerCache;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SerializersCacheKt {

    /* renamed from: a, reason: collision with root package name */
    public static final SerializerCache f24752a;
    public static final SerializerCache b;
    public static final ParametrizedSerializerCache c = CachingKt.b(new au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.b(22));
    public static final ParametrizedSerializerCache d = CachingKt.b(new au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.b(23));

    static {
        final int i = 0;
        f24752a = CachingKt.a(new Function1() { // from class: kotlinx.serialization.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                KClass it = (KClass) obj;
                switch (i) {
                    case 0:
                        SerializerCache serializerCache = SerializersCacheKt.f24752a;
                        Intrinsics.h(it, "it");
                        KSerializer kSerializerD = SerializersKt.d(it);
                        if (kSerializerD != null) {
                            return kSerializerD;
                        }
                        if (PlatformKt.c(it)) {
                            return new PolymorphicSerializer(it);
                        }
                        return null;
                    default:
                        SerializerCache serializerCache2 = SerializersCacheKt.f24752a;
                        Intrinsics.h(it, "it");
                        KSerializer kSerializerD2 = SerializersKt.d(it);
                        if (kSerializerD2 == null) {
                            kSerializerD2 = PlatformKt.c(it) ? new PolymorphicSerializer(it) : null;
                        }
                        if (kSerializerD2 != null) {
                            return BuiltinSerializersKt.d(kSerializerD2);
                        }
                        return null;
                }
            }
        });
        final int i2 = 1;
        b = CachingKt.a(new Function1() { // from class: kotlinx.serialization.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                KClass it = (KClass) obj;
                switch (i2) {
                    case 0:
                        SerializerCache serializerCache = SerializersCacheKt.f24752a;
                        Intrinsics.h(it, "it");
                        KSerializer kSerializerD = SerializersKt.d(it);
                        if (kSerializerD != null) {
                            return kSerializerD;
                        }
                        if (PlatformKt.c(it)) {
                            return new PolymorphicSerializer(it);
                        }
                        return null;
                    default:
                        SerializerCache serializerCache2 = SerializersCacheKt.f24752a;
                        Intrinsics.h(it, "it");
                        KSerializer kSerializerD2 = SerializersKt.d(it);
                        if (kSerializerD2 == null) {
                            kSerializerD2 = PlatformKt.c(it) ? new PolymorphicSerializer(it) : null;
                        }
                        if (kSerializerD2 != null) {
                            return BuiltinSerializersKt.d(kSerializerD2);
                        }
                        return null;
                }
            }
        });
    }
}
