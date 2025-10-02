package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.internal.JsonDecodingException;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/json/JsonNullSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonNull;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes7.dex */
public final class JsonNullSerializer implements KSerializer<JsonNull> {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonNullSerializer f24845a = new JsonNullSerializer();
    public static final SerialDescriptorImpl b = SerialDescriptorsKt.e("kotlinx.serialization.json.JsonNull", SerialKind.ENUM.f24773a, new SerialDescriptor[0]);

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        JsonElementSerializersKt.a(decoder);
        if (decoder.C()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        decoder.h();
        return JsonNull.INSTANCE;
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        JsonNull value = (JsonNull) obj;
        Intrinsics.h(value, "value");
        JsonElementSerializersKt.b(encoder);
        encoder.z();
    }
}
