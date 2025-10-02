package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/NothingSerializer;", "Lkotlinx/serialization/KSerializer;", "", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes7.dex */
public final class NothingSerializer implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final NothingSerializer f24809a = new NothingSerializer();
    public static final NothingSerialDescriptor b = NothingSerialDescriptor.f24808a;

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        Void value = (Void) obj;
        Intrinsics.h(value, "value");
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }
}
