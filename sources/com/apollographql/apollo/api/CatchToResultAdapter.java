package com.apollographql.apollo.api;

import com.apollographql.apollo.api.FieldResult;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo/api/CatchToResultAdapter;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/FieldResult;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class CatchToResultAdapter<T> implements Adapter<FieldResult<? extends T>> {
    @Override // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
        Intrinsics.h(reader, "reader");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        throw null;
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
        FieldResult value = (FieldResult) obj;
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Intrinsics.h(value, "value");
        boolean z = value instanceof FieldResult.Success;
        if (z) {
            if (z) {
                throw null;
            }
            if (!(value instanceof FieldResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            throw null;
        }
    }
}
