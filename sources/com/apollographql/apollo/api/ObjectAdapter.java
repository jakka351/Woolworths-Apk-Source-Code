package com.apollographql.apollo.api;

import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonReaders;
import com.apollographql.apollo.api.json.JsonWriter;
import com.apollographql.apollo.api.json.JsonWriters;
import com.apollographql.apollo.api.json.MapJsonReader;
import com.apollographql.apollo.api.json.MapJsonWriter;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo/api/ObjectAdapter;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/apollographql/apollo/api/Adapter;", "Lkotlin/jvm/JvmSuppressWildcards;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ObjectAdapter<T> implements Adapter<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Adapter f13520a;
    public final boolean b;

    public ObjectAdapter(Adapter wrappedAdapter, boolean z) {
        Intrinsics.h(wrappedAdapter, "wrappedAdapter");
        this.f13520a = wrappedAdapter;
        this.b = z;
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
        Intrinsics.h(reader, "reader");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        if (this.b) {
            if (reader instanceof MapJsonReader) {
                reader = (MapJsonReader) reader;
            } else {
                JsonReader.Token tokenPeek = reader.getF();
                if (tokenPeek != JsonReader.Token.f) {
                    throw new IllegalStateException(("Failed to buffer json reader, expected `BEGIN_OBJECT` but found `" + tokenPeek + "` json token").toString());
                }
                ArrayList path = reader.getPath();
                Object objB = JsonReaders.b(reader);
                Intrinsics.f(objB, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                reader = new MapJsonReader(path, (Map) objB);
            }
        }
        reader.G();
        Object objFromJson = this.f13520a.fromJson(reader, customScalarAdapters);
        reader.K();
        return objFromJson;
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        boolean z = this.b;
        Adapter adapter = this.f13520a;
        if (!z || (writer instanceof MapJsonWriter)) {
            writer.G();
            adapter.toJson(writer, customScalarAdapters, obj);
            writer.K();
            return;
        }
        MapJsonWriter mapJsonWriter = new MapJsonWriter();
        mapJsonWriter.G();
        adapter.toJson(mapJsonWriter, customScalarAdapters, obj);
        mapJsonWriter.K();
        if (!mapJsonWriter.e) {
            throw new IllegalStateException("Check failed.");
        }
        Object obj2 = mapJsonWriter.d;
        Intrinsics.e(obj2);
        JsonWriters.a(writer, obj2);
    }
}
