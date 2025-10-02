package com.woolworths.feature.shop.storelocator.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.storelocator.StoreByIdQuery;
import com.woolworths.feature.shop.storelocator.fragment.Store;
import com.woolworths.feature.shop.storelocator.fragment.StoreImpl_ResponseAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/feature/shop/storelocator/adapter/StoreByIdQuery_ResponseAdapter;", "", "Data", "StoreById", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StoreByIdQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/storelocator/adapter/StoreByIdQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/storelocator/StoreByIdQuery$Data;", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<StoreByIdQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20340a = new Data();
        public static final List b = CollectionsKt.Q("storeById");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            StoreByIdQuery.StoreById storeById = null;
            while (reader.o2(b) == 0) {
                storeById = (StoreByIdQuery.StoreById) Adapters.b(Adapters.c(StoreById.f20341a, true)).fromJson(reader, customScalarAdapters);
            }
            return new StoreByIdQuery.Data(storeById);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            StoreByIdQuery.Data value = (StoreByIdQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("storeById");
            Adapters.b(Adapters.c(StoreById.f20341a, true)).toJson(writer, customScalarAdapters, value.f20332a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/storelocator/adapter/StoreByIdQuery_ResponseAdapter$StoreById;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/storelocator/StoreByIdQuery$StoreById;", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StoreById implements Adapter<StoreByIdQuery.StoreById> {

        /* renamed from: a, reason: collision with root package name */
        public static final StoreById f20341a = new StoreById();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            Store storeA = StoreImpl_ResponseAdapter.Store.a(reader, customScalarAdapters);
            if (str != null) {
                return new StoreByIdQuery.StoreById(str, storeA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            StoreByIdQuery.StoreById value = (StoreByIdQuery.StoreById) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20333a);
            List list = StoreImpl_ResponseAdapter.Store.f20347a;
            StoreImpl_ResponseAdapter.Store.b(writer, customScalarAdapters, value.b);
        }
    }
}
