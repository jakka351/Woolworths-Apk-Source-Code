package com.tealium.core.persistence;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/core/persistence/a;", "Array", "Lcom/tealium/core/persistence/Serializer;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
final class a<Array> implements Serializer<Array> {
    @Override // com.tealium.core.persistence.Serializer
    public final String serialize(Object obj) {
        String string = new JSONArray(obj).toString();
        Intrinsics.g(string, "JSONArray(value).toString()");
        return string;
    }
}
