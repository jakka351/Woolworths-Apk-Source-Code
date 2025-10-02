package kotlinx.serialization;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/PolymorphicSerializer;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PolymorphicSerializer<T> extends AbstractPolymorphicSerializer<T> {

    /* renamed from: a, reason: collision with root package name */
    public final KClass f24750a;
    public List b;
    public final Object c;

    public PolymorphicSerializer(KClass baseClass) {
        Intrinsics.h(baseClass, "baseClass");
        this.f24750a = baseClass;
        this.b = EmptyList.d;
        this.c = LazyKt.a(LazyThreadSafetyMode.d, new au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.c(this, 28));
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    /* renamed from: c, reason: from getter */
    public final KClass getF24750a() {
        return this.f24750a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return (SerialDescriptor) this.c.getD();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f24750a + ')';
    }
}
