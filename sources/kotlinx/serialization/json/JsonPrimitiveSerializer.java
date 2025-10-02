package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.internal.JsonExceptionsKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/json/JsonPrimitiveSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonPrimitive;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes7.dex */
public final class JsonPrimitiveSerializer implements KSerializer<JsonPrimitive> {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonPrimitiveSerializer f24848a = new JsonPrimitiveSerializer();
    public static final SerialDescriptorImpl b = SerialDescriptorsKt.e("kotlinx.serialization.json.JsonPrimitive", PrimitiveKind.STRING.f24770a, new SerialDescriptor[0]);

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        JsonElement jsonElementS = JsonElementSerializersKt.a(decoder).s();
        if (jsonElementS instanceof JsonPrimitive) {
            return (JsonPrimitive) jsonElementS;
        }
        StringBuilder sb = new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ");
        throw JsonExceptionsKt.c(-1, jsonElementS.toString(), kotlin.reflect.jvm.internal.impl.types.checker.a.i(Reflection.f24268a, jsonElementS.getClass(), sb));
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        JsonPrimitive value = (JsonPrimitive) obj;
        Intrinsics.h(value, "value");
        JsonElementSerializersKt.b(encoder);
        if (value instanceof JsonNull) {
            encoder.e(JsonNullSerializer.f24845a, JsonNull.INSTANCE);
        } else {
            encoder.e(JsonLiteralSerializer.f24844a, (JsonLiteral) value);
        }
    }
}
