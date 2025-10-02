package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/JsonTreeListDecoder;", "Lkotlinx/serialization/json/internal/AbstractJsonTreeDecoder;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class JsonTreeListDecoder extends AbstractJsonTreeDecoder {
    public final JsonArray g;
    public final int h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeListDecoder(Json json, JsonArray value) {
        super(json, value, null);
        Intrinsics.h(json, "json");
        Intrinsics.h(value, "value");
        this.g = value;
        this.h = value.d.size();
        this.i = -1;
    }

    @Override // kotlinx.serialization.internal.NamedValueDecoder
    public final String W(SerialDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    public final JsonElement Z(String tag) throws NumberFormatException {
        Intrinsics.h(tag, "tag");
        return (JsonElement) this.g.d.get(Integer.parseInt(tag));
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    /* renamed from: b0 */
    public final JsonElement getD() {
        return this.g;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final int u(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        int i = this.i;
        if (i >= this.h - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.i = i2;
        return i2;
    }
}
