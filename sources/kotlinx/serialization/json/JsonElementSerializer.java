package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/json/JsonElementSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonElement;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes7.dex */
public final class JsonElementSerializer implements KSerializer<JsonElement> {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonElementSerializer f24842a = new JsonElementSerializer();
    public static final SerialDescriptorImpl b = SerialDescriptorsKt.d("kotlinx.serialization.json.JsonElement", PolymorphicKind.SEALED.f24761a, new SerialDescriptor[0], new a(0));

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        return JsonElementSerializersKt.a(decoder).s();
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        JsonElement value = (JsonElement) obj;
        Intrinsics.h(value, "value");
        JsonElementSerializersKt.b(encoder);
        if (value instanceof JsonPrimitive) {
            encoder.e(JsonPrimitiveSerializer.f24848a, value);
        } else if (value instanceof JsonObject) {
            encoder.e(JsonObjectSerializer.f24846a, value);
        } else {
            if (!(value instanceof JsonArray)) {
                throw new NoWhenBranchMatchedException();
            }
            encoder.e(JsonArraySerializer.f24837a, value);
        }
    }
}
