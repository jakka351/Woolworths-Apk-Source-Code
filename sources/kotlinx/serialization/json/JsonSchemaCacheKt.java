package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.DescriptorSchemaCache;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class JsonSchemaCacheKt {
    public static final DescriptorSchemaCache a(Json json) {
        Intrinsics.h(json, "<this>");
        return json.c;
    }
}
