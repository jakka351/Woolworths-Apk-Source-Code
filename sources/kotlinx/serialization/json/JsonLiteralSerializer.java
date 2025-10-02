package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.UStringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PrimitiveSerialDescriptor;
import kotlinx.serialization.internal.ULongSerializer;
import kotlinx.serialization.json.internal.JsonExceptionsKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/json/JsonLiteralSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonLiteral;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class JsonLiteralSerializer implements KSerializer<JsonLiteral> {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonLiteralSerializer f24844a = new JsonLiteralSerializer();
    public static final PrimitiveSerialDescriptor b = SerialDescriptorsKt.a("kotlinx.serialization.json.JsonLiteral");

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        JsonElement jsonElementS = JsonElementSerializersKt.a(decoder).s();
        if (jsonElementS instanceof JsonLiteral) {
            return (JsonLiteral) jsonElementS;
        }
        StringBuilder sb = new StringBuilder("Unexpected JSON element, expected JsonLiteral, had ");
        throw JsonExceptionsKt.c(-1, jsonElementS.toString(), kotlin.reflect.jvm.internal.impl.types.checker.a.i(Reflection.f24268a, jsonElementS.getClass(), sb));
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        JsonLiteral value = (JsonLiteral) obj;
        Intrinsics.h(value, "value");
        String str = value.f;
        JsonElementSerializersKt.b(encoder);
        if (value.d) {
            encoder.u(str);
            return;
        }
        SerialDescriptor serialDescriptor = value.e;
        if (serialDescriptor != null) {
            encoder.j(serialDescriptor).u(str);
            return;
        }
        Long lJ0 = StringsKt.j0(str);
        if (lJ0 != null) {
            encoder.y(lJ0.longValue());
            return;
        }
        ULong uLongE = UStringsKt.e(str);
        if (uLongE != null) {
            encoder.j(ULongSerializer.b).y(uLongE.d);
            return;
        }
        Double dH0 = StringsKt.h0(str);
        if (dH0 != null) {
            encoder.v(dH0.doubleValue());
            return;
        }
        Boolean bool = str.equals("true") ? Boolean.TRUE : str.equals("false") ? Boolean.FALSE : null;
        if (bool != null) {
            encoder.m(bool.booleanValue());
        } else {
            encoder.u(str);
        }
    }
}
