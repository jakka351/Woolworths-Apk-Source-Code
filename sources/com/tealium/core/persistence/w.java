package com.tealium.core.persistence;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/tealium/core/persistence/w;", "Lcom/tealium/core/persistence/Deserializer;", "Lorg/json/JSONArray;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
final class w implements Deserializer<JSONArray> {
    @Override // com.tealium.core.persistence.Deserializer
    public final Object a(String value) {
        Intrinsics.h(value, "value");
        return new JSONArray(value);
    }
}
