package kotlinx.serialization.internal;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/internal/NullableSerializer;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes7.dex */
public final class NullableSerializer<T> implements KSerializer<T> {

    /* renamed from: a, reason: collision with root package name */
    public final KSerializer f24810a;
    public final SerialDescriptorForNullable b;

    public NullableSerializer(KSerializer serializer) {
        Intrinsics.h(serializer, "serializer");
        this.f24810a = serializer;
        this.b = new SerialDescriptorForNullable(serializer.getB());
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        if (decoder.C()) {
            return decoder.E(this.f24810a);
        }
        decoder.h();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && NullableSerializer.class == obj.getClass() && Intrinsics.c(this.f24810a, ((NullableSerializer) obj).f24810a);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return this.b;
    }

    public final int hashCode() {
        return this.f24810a.hashCode();
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        if (obj == null) {
            encoder.z();
        } else {
            encoder.E();
            encoder.e(this.f24810a, obj);
        }
    }
}
