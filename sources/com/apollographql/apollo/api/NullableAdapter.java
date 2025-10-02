package com.apollographql.apollo.api;

import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000f\u0012\u000b\u0012\t\u0018\u00018\u0000¢\u0006\u0002\b\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/apollographql/apollo/api/NullableAdapter;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/apollographql/apollo/api/Adapter;", "Lkotlin/jvm/JvmSuppressWildcards;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NullableAdapter<T> implements Adapter<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Adapter f13519a;

    public NullableAdapter(Adapter wrappedAdapter) {
        Intrinsics.h(wrappedAdapter, "wrappedAdapter");
        this.f13519a = wrappedAdapter;
        if (wrappedAdapter instanceof NullableAdapter) {
            throw new IllegalStateException("The adapter is already nullable");
        }
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
        Intrinsics.h(reader, "reader");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        if (reader.peek() != JsonReader.Token.m) {
            return this.f13519a.fromJson(reader, customScalarAdapters);
        }
        reader.skipValue();
        return null;
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        if (obj == null) {
            writer.s2();
        } else {
            this.f13519a.toJson(writer, customScalarAdapters, obj);
        }
    }
}
