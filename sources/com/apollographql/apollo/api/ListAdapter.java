package com.apollographql.apollo.api;

import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0013\u0012\u000f\u0012\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00040\u00030\u0002¨\u0006\u0005"}, d2 = {"Lcom/apollographql/apollo/api/ListAdapter;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/apollographql/apollo/api/Adapter;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ListAdapter<T> implements Adapter<List<T>> {

    /* renamed from: a, reason: collision with root package name */
    public final Adapter f13518a;

    public ListAdapter(Adapter wrappedAdapter) {
        Intrinsics.h(wrappedAdapter, "wrappedAdapter");
        this.f13518a = wrappedAdapter;
    }

    @Override // com.apollographql.apollo.api.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ArrayList fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
        Intrinsics.h(reader, "reader");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        reader.y();
        ArrayList arrayList = new ArrayList();
        while (reader.hasNext()) {
            arrayList.add(this.f13518a.fromJson(reader, customScalarAdapters));
        }
        reader.w();
        return arrayList;
    }

    @Override // com.apollographql.apollo.api.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, List value) {
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Intrinsics.h(value, "value");
        writer.y();
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            this.f13518a.toJson(writer, customScalarAdapters, it.next());
        }
        writer.w();
    }
}
