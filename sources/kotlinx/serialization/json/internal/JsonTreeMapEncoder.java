package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import kotlinx.serialization.json.JsonPrimitive;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/JsonTreeMapEncoder;", "Lkotlinx/serialization/json/internal/JsonTreeEncoder;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class JsonTreeMapEncoder extends JsonTreeEncoder {
    public String h;
    public boolean i;

    @Override // kotlinx.serialization.json.internal.JsonTreeEncoder, kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public final JsonElement Z() {
        return new JsonObject(this.g);
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeEncoder, kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public final void a0(String key, JsonElement element) {
        Intrinsics.h(key, "key");
        Intrinsics.h(element, "element");
        if (!this.i) {
            String str = this.h;
            if (str == null) {
                Intrinsics.p("tag");
                throw null;
            }
            this.g.put(str, element);
            this.i = true;
            return;
        }
        if (element instanceof JsonPrimitive) {
            this.h = ((JsonPrimitive) element).getF();
            this.i = false;
        } else {
            if (element instanceof JsonObject) {
                throw JsonExceptionsKt.b(JsonObjectSerializer.b);
            }
            if (!(element instanceof JsonArray)) {
                throw new NoWhenBranchMatchedException();
            }
            throw JsonExceptionsKt.b(JsonArraySerializer.b);
        }
    }
}
