package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/JsonPrimitiveDecoder;", "Lkotlinx/serialization/json/internal/AbstractJsonTreeDecoder;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class JsonPrimitiveDecoder extends AbstractJsonTreeDecoder {
    public final JsonElement g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonPrimitiveDecoder(Json json, JsonElement value, String str) {
        super(json, value, str);
        Intrinsics.h(json, "json");
        Intrinsics.h(value, "value");
        this.g = value;
        this.f24822a.add("primitive");
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    public final JsonElement Z(String tag) {
        Intrinsics.h(tag, "tag");
        if (tag == "primitive") {
            return this.g;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    /* renamed from: b0, reason: from getter */
    public final JsonElement getD() {
        return this.g;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final int u(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        return 0;
    }
}
