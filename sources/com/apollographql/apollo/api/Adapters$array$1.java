package com.apollographql.apollo.api;

import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001¨\u0006\u0003"}, d2 = {"com/apollographql/apollo/api/Adapters$array$1", "Lcom/apollographql/apollo/api/Adapter;", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 176)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class Adapters$array$1 implements Adapter<Object[]> {
    @Override // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
        Intrinsics.h(reader, "reader");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        reader.y();
        new ArrayList();
        if (reader.hasNext()) {
            throw null;
        }
        reader.w();
        Intrinsics.o();
        throw null;
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
        Object[] value = (Object[]) obj;
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Intrinsics.h(value, "value");
        writer.y();
        if (value.length <= 0) {
            writer.w();
        } else {
            Object obj2 = value[0];
            throw null;
        }
    }
}
