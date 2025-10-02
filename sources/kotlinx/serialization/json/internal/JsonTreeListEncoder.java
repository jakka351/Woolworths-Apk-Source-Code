package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/JsonTreeListEncoder;", "Lkotlinx/serialization/json/internal/AbstractJsonTreeEncoder;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class JsonTreeListEncoder extends AbstractJsonTreeEncoder {
    public final ArrayList g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeListEncoder(Json json, Function1 nodeConsumer) {
        super(json, nodeConsumer);
        Intrinsics.h(json, "json");
        Intrinsics.h(nodeConsumer, "nodeConsumer");
        this.g = new ArrayList();
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder, kotlinx.serialization.internal.NamedValueEncoder
    public final String Y(SerialDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public final JsonElement Z() {
        return new JsonArray(this.g);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public final void a0(String key, JsonElement element) throws NumberFormatException {
        Intrinsics.h(key, "key");
        Intrinsics.h(element, "element");
        this.g.add(Integer.parseInt(key), element);
    }
}
