package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/JsonPrimitiveEncoder;", "Lkotlinx/serialization/json/internal/AbstractJsonTreeEncoder;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class JsonPrimitiveEncoder extends AbstractJsonTreeEncoder {
    public JsonElement g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonPrimitiveEncoder(Json json, Function1 nodeConsumer) {
        super(json, nodeConsumer);
        Intrinsics.h(json, "json");
        Intrinsics.h(nodeConsumer, "nodeConsumer");
        this.f24823a.add("primitive");
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public final JsonElement Z() {
        JsonElement jsonElement = this.g;
        if (jsonElement != null) {
            return jsonElement;
        }
        throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public final void a0(String key, JsonElement element) {
        Intrinsics.h(key, "key");
        Intrinsics.h(element, "element");
        if (key != "primitive") {
            throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag");
        }
        if (this.g != null) {
            throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
        }
        this.g = element;
        this.c.invoke(element);
    }
}
