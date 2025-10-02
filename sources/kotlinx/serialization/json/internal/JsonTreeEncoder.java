package kotlinx.serialization.json.internal;

import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/JsonTreeEncoder;", "Lkotlinx/serialization/json/internal/AbstractJsonTreeEncoder;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
class JsonTreeEncoder extends AbstractJsonTreeEncoder {
    public final LinkedHashMap g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeEncoder(Json json, Function1 nodeConsumer) {
        super(json, nodeConsumer);
        Intrinsics.h(json, "json");
        Intrinsics.h(nodeConsumer, "nodeConsumer");
        this.g = new LinkedHashMap();
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public JsonElement Z() {
        return new JsonObject(this.g);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public void a0(String key, JsonElement element) {
        Intrinsics.h(key, "key");
        Intrinsics.h(element, "element");
        this.g.put(key, element);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public final void w(SerialDescriptor descriptor, int i, SerializationStrategy serializer, Object obj) {
        Intrinsics.h(descriptor, "descriptor");
        Intrinsics.h(serializer, "serializer");
        if (obj != null || this.d.c) {
            super.w(descriptor, i, serializer, obj);
        }
    }
}
