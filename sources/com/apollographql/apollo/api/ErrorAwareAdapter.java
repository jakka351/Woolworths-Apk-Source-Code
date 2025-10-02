package com.apollographql.apollo.api;

import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.apollographql.apollo.exception.ApolloGraphQLException;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/api/ErrorAwareAdapter;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/apollographql/apollo/api/Adapter;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ErrorAwareAdapter<T> implements Adapter<T> {
    @Override // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
        Error error;
        T next;
        int i;
        Intrinsics.h(reader, "reader");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        if (reader.peek() != JsonReader.Token.m) {
            throw null;
        }
        ArrayList path = reader.getPath();
        List list = customScalarAdapters.c;
        if (list != null) {
            Iterator<T> it = list.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    next = (T) null;
                    break;
                }
                next = it.next();
                List list2 = ((Error) next).c;
                if (list2 != null) {
                    int size = path.size();
                    while (i < size) {
                        int i2 = i - 1;
                        i = (i2 < list2.size() && Intrinsics.c(path.get(i), list2.get(i2))) ? i + 1 : 1;
                    }
                    break loop0;
                }
            }
            error = next;
        } else {
            error = null;
        }
        if (error == null) {
            throw null;
        }
        reader.skipValue();
        throw new ApolloGraphQLException(error);
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        throw null;
    }
}
