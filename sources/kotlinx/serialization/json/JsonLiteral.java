package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.StringOpsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/JsonLiteral;", "Lkotlinx/serialization/json/JsonPrimitive;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class JsonLiteral extends JsonPrimitive {
    public final boolean d;
    public final SerialDescriptor e;
    public final String f;

    public JsonLiteral(Object body, boolean z, SerialDescriptor serialDescriptor) {
        Intrinsics.h(body, "body");
        this.d = z;
        this.e = serialDescriptor;
        this.f = body.toString();
        if (serialDescriptor != null && !serialDescriptor.getL()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    /* renamed from: b, reason: from getter */
    public final String getF() {
        return this.f;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    /* renamed from: d, reason: from getter */
    public final boolean getD() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JsonLiteral.class != obj.getClass()) {
            return false;
        }
        JsonLiteral jsonLiteral = (JsonLiteral) obj;
        return this.d == jsonLiteral.d && Intrinsics.c(this.f, jsonLiteral.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + (Boolean.hashCode(this.d) * 31);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final String toString() {
        boolean z = this.d;
        String str = this.f;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        StringOpsKt.a(sb, str);
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }
}
