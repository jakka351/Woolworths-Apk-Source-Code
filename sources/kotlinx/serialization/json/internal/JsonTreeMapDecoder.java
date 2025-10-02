package kotlinx.serialization.json.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/JsonTreeMapDecoder;", "Lkotlinx/serialization/json/internal/JsonTreeDecoder;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class JsonTreeMapDecoder extends JsonTreeDecoder {
    public final JsonObject k;
    public final List l;
    public final int m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeMapDecoder(Json json, JsonObject jsonObject) {
        super(json, jsonObject, (String) null, 12);
        Intrinsics.h(json, "json");
        this.k = jsonObject;
        List listG0 = CollectionsKt.G0(jsonObject.d.keySet());
        this.l = listG0;
        this.m = listG0.size() * 2;
        this.n = -1;
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeDecoder, kotlinx.serialization.internal.NamedValueDecoder
    public final String W(SerialDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        return (String) this.l.get(i / 2);
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeDecoder, kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    public final JsonElement Z(String tag) {
        Intrinsics.h(tag, "tag");
        return this.n % 2 == 0 ? JsonElementKt.b(tag) : (JsonElement) MapsKt.e(tag, this.k);
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeDecoder, kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    /* renamed from: b0 */
    public final JsonElement getG() {
        return this.k;
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeDecoder, kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public final void c(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeDecoder
    /* renamed from: e0, reason: from getter */
    public final JsonObject getK() {
        return this.k;
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public final int u(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        int i = this.n;
        if (i >= this.m - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.n = i2;
        return i2;
    }
}
