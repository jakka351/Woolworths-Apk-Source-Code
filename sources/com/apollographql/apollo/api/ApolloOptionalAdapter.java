package com.apollographql.apollo.api;

import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0013\u0012\u000f\u0012\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00040\u00030\u0002¨\u0006\u0005"}, d2 = {"Lcom/apollographql/apollo/api/ApolloOptionalAdapter;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/Optional;", "Lkotlin/jvm/JvmSuppressWildcards;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ApolloOptionalAdapter<T> implements Adapter<Optional<T>> {
    @Override // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
        Intrinsics.h(reader, "reader");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        if (reader.peek() != JsonReader.Token.m) {
            throw null;
        }
        reader.skipValue();
        return Optional.Absent.f13523a;
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
        Optional value = (Optional) obj;
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Intrinsics.h(value, "value");
        if (value instanceof Optional.Present) {
            ((Optional.Present) value).getClass();
            throw null;
        }
        writer.s2();
    }
}
