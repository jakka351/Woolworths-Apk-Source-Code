package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.uuid.ExperimentalUuidApi;
import kotlin.uuid.Uuid;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/UuidSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/uuid/Uuid;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
@ExperimentalUuidApi
/* loaded from: classes7.dex */
public final class UuidSerializer implements KSerializer<Uuid> {

    /* renamed from: a, reason: collision with root package name */
    public static final UuidSerializer f24835a = new UuidSerializer();
    public static final PrimitiveSerialDescriptor b = new PrimitiveSerialDescriptor("kotlin.uuid.Uuid", PrimitiveKind.STRING.f24770a);

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        return Uuid.Companion.b(decoder.p());
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        Uuid value = (Uuid) obj;
        Intrinsics.h(value, "value");
        encoder.u(value.toString());
    }
}
