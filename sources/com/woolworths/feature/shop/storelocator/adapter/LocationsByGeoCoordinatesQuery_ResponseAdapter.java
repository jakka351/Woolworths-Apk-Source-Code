package com.woolworths.feature.shop.storelocator.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.woolworths.feature.shop.storelocator.LocationsByGeoCoordinatesQuery;
import com.woolworths.feature.shop.storelocator.fragment.Store;
import com.woolworths.feature.shop.storelocator.fragment.StoreImpl_ResponseAdapter;
import com.woolworths.feature.shop.storelocator.fragment.SuburbItem;
import com.woolworths.feature.shop.storelocator.fragment.SuburbItemImpl_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/feature/shop/storelocator/adapter/LocationsByGeoCoordinatesQuery_ResponseAdapter;", "", "Data", "LocationsByGeoCoordinates", "Result", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LocationsByGeoCoordinatesQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/storelocator/adapter/LocationsByGeoCoordinatesQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/storelocator/LocationsByGeoCoordinatesQuery$Data;", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<LocationsByGeoCoordinatesQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20334a = new Data();
        public static final List b = CollectionsKt.Q("locationsByGeoCoordinates");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            LocationsByGeoCoordinatesQuery.LocationsByGeoCoordinates locationsByGeoCoordinates = null;
            while (reader.o2(b) == 0) {
                locationsByGeoCoordinates = (LocationsByGeoCoordinatesQuery.LocationsByGeoCoordinates) Adapters.c(LocationsByGeoCoordinates.f20335a, false).fromJson(reader, customScalarAdapters);
            }
            if (locationsByGeoCoordinates != null) {
                return new LocationsByGeoCoordinatesQuery.Data(locationsByGeoCoordinates);
            }
            Assertions.a(reader, "locationsByGeoCoordinates");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            LocationsByGeoCoordinatesQuery.Data value = (LocationsByGeoCoordinatesQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("locationsByGeoCoordinates");
            Adapters.c(LocationsByGeoCoordinates.f20335a, false).toJson(writer, customScalarAdapters, value.f20324a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/storelocator/adapter/LocationsByGeoCoordinatesQuery_ResponseAdapter$LocationsByGeoCoordinates;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/storelocator/LocationsByGeoCoordinatesQuery$LocationsByGeoCoordinates;", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LocationsByGeoCoordinates implements Adapter<LocationsByGeoCoordinatesQuery.LocationsByGeoCoordinates> {

        /* renamed from: a, reason: collision with root package name */
        public static final LocationsByGeoCoordinates f20335a = new LocationsByGeoCoordinates();
        public static final List b = CollectionsKt.Q(lqlqqlq.m006Dm006Dm006Dm);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(b) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(Result.f20336a, true)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new LocationsByGeoCoordinatesQuery.LocationsByGeoCoordinates(arrayListFromJson);
            }
            Assertions.a(reader, lqlqqlq.m006Dm006Dm006Dm);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            LocationsByGeoCoordinatesQuery.LocationsByGeoCoordinates value = (LocationsByGeoCoordinatesQuery.LocationsByGeoCoordinates) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(lqlqqlq.m006Dm006Dm006Dm);
            Adapters.a(Adapters.c(Result.f20336a, true)).toJson(writer, customScalarAdapters, value.f20325a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/storelocator/adapter/LocationsByGeoCoordinatesQuery_ResponseAdapter$Result;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/storelocator/LocationsByGeoCoordinatesQuery$Result;", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Result implements Adapter<LocationsByGeoCoordinatesQuery.Result> {

        /* renamed from: a, reason: collision with root package name */
        public static final Result f20336a = new Result();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Store storeA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            SuburbItem suburbItemA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("Store"))) {
                reader.o();
                storeA = StoreImpl_ResponseAdapter.Store.a(reader, customScalarAdapters);
            } else {
                storeA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("SuburbItem"))) {
                reader.o();
                suburbItemA = SuburbItemImpl_ResponseAdapter.SuburbItem.a(reader, customScalarAdapters);
            }
            return new LocationsByGeoCoordinatesQuery.Result(str, storeA, suburbItemA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            LocationsByGeoCoordinatesQuery.Result value = (LocationsByGeoCoordinatesQuery.Result) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20326a);
            Store store = value.b;
            if (store != null) {
                StoreImpl_ResponseAdapter.Store.b(writer, customScalarAdapters, store);
            }
            SuburbItem suburbItem = value.c;
            if (suburbItem != null) {
                SuburbItemImpl_ResponseAdapter.SuburbItem.b(writer, customScalarAdapters, suburbItem);
            }
        }
    }
}
