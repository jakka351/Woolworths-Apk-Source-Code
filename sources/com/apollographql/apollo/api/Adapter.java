package com.apollographql.apollo.api;

import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/api/Adapter;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Adapter<T> {
    Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters);

    void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj);
}
