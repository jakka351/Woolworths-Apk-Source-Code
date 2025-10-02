package com.apollographql.apollo.api;

import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonReaders;
import com.apollographql.apollo.api.json.JsonWriter;
import com.apollographql.apollo.api.json.JsonWriters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/apollographql/apollo/api/Adapters$AnyAdapter$1", "Lcom/apollographql/apollo/api/Adapter;", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Adapters$AnyAdapter$1 implements Adapter<Object> {
    @Override // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
        Intrinsics.h(reader, "reader");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Object objB = JsonReaders.b(reader);
        Intrinsics.e(objB);
        return objB;
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object value) {
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Intrinsics.h(value, "value");
        JsonWriters.a(writer, value);
    }
}
