package com.apollographql.apollo.api;

import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.apollographql.apollo.api.json.MapJsonReader;
import com.apollographql.apollo.api.json.MapJsonWriter;
import com.apollographql.apollo.exception.JsonDataException;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/api/PassThroughAdapter;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/apollographql/apollo/api/Adapter;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PassThroughAdapter<T> implements Adapter<T> {
    @Override // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
        Intrinsics.h(reader, "reader");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        if (!(reader instanceof MapJsonReader)) {
            throw new IllegalStateException("UnsafeAdapter only supports MapJsonReader");
        }
        MapJsonReader mapJsonReader = (MapJsonReader) reader;
        Object obj = mapJsonReader.g;
        if (obj != null) {
            mapJsonReader.a();
            return obj;
        }
        throw new JsonDataException("Expected a non-null value at path " + mapJsonReader.c());
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        if (!(writer instanceof MapJsonWriter)) {
            throw new IllegalStateException("UnsafeAdapter only supports MapJsonWriter");
        }
        ((MapJsonWriter) writer).b(obj);
    }
}
