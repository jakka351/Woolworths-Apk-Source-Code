package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TreeJsonDecoderKt {
    public static final Object a(Json json, JsonElement element, DeserializationStrategy deserializer) {
        Decoder jsonPrimitiveDecoder;
        Intrinsics.h(element, "element");
        Intrinsics.h(deserializer, "deserializer");
        String str = null;
        if (element instanceof JsonObject) {
            jsonPrimitiveDecoder = new JsonTreeDecoder(json, (JsonObject) element, str, 12);
        } else if (element instanceof JsonArray) {
            jsonPrimitiveDecoder = new JsonTreeListDecoder(json, (JsonArray) element);
        } else {
            if (!(element instanceof JsonLiteral) && !element.equals(JsonNull.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            jsonPrimitiveDecoder = new JsonPrimitiveDecoder(json, (JsonPrimitive) element, null);
        }
        return jsonPrimitiveDecoder.E(deserializer);
    }

    public static final Object b(Json json, String discriminator, JsonObject jsonObject, DeserializationStrategy deserializationStrategy) {
        Intrinsics.h(json, "<this>");
        Intrinsics.h(discriminator, "discriminator");
        return new JsonTreeDecoder(json, jsonObject, discriminator, deserializationStrategy.getB()).E(deserializationStrategy);
    }
}
