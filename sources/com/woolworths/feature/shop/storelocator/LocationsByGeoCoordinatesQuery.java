package com.woolworths.feature.shop.storelocator;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.graphql.type.adapter.ShoppingModeId_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$DoubleAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.storage.db.h;
import com.woolworths.feature.shop.storelocator.adapter.LocationsByGeoCoordinatesQuery_ResponseAdapter;
import com.woolworths.feature.shop.storelocator.fragment.Store;
import com.woolworths.feature.shop.storelocator.fragment.SuburbItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/woolworths/feature/shop/storelocator/LocationsByGeoCoordinatesQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/feature/shop/storelocator/LocationsByGeoCoordinatesQuery$Data;", "Data", "LocationsByGeoCoordinates", "Result", "Companion", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LocationsByGeoCoordinatesQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final double f20323a;
    public final double b;
    public final List c;
    public final Optional d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/storelocator/LocationsByGeoCoordinatesQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/storelocator/LocationsByGeoCoordinatesQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final LocationsByGeoCoordinates f20324a;

        public Data(LocationsByGeoCoordinates locationsByGeoCoordinates) {
            this.f20324a = locationsByGeoCoordinates;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20324a, ((Data) obj).f20324a);
        }

        public final int hashCode() {
            return this.f20324a.f20325a.hashCode();
        }

        public final String toString() {
            return "Data(locationsByGeoCoordinates=" + this.f20324a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/storelocator/LocationsByGeoCoordinatesQuery$LocationsByGeoCoordinates;", "", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LocationsByGeoCoordinates {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f20325a;

        public LocationsByGeoCoordinates(ArrayList arrayList) {
            this.f20325a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LocationsByGeoCoordinates) && this.f20325a.equals(((LocationsByGeoCoordinates) obj).f20325a);
        }

        public final int hashCode() {
            return this.f20325a.hashCode();
        }

        public final String toString() {
            return a.k("LocationsByGeoCoordinates(result=", ")", this.f20325a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/storelocator/LocationsByGeoCoordinatesQuery$Result;", "", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Result {

        /* renamed from: a, reason: collision with root package name */
        public final String f20326a;
        public final Store b;
        public final SuburbItem c;

        public Result(String __typename, Store store, SuburbItem suburbItem) {
            Intrinsics.h(__typename, "__typename");
            this.f20326a = __typename;
            this.b = store;
            this.c = suburbItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Result)) {
                return false;
            }
            Result result = (Result) obj;
            return Intrinsics.c(this.f20326a, result.f20326a) && Intrinsics.c(this.b, result.b) && Intrinsics.c(this.c, result.c);
        }

        public final int hashCode() {
            int iHashCode = this.f20326a.hashCode() * 31;
            Store store = this.b;
            int iHashCode2 = (iHashCode + (store == null ? 0 : store.hashCode())) * 31;
            SuburbItem suburbItem = this.c;
            return iHashCode2 + (suburbItem != null ? suburbItem.hashCode() : 0);
        }

        public final String toString() {
            return "Result(__typename=" + this.f20326a + ", store=" + this.b + ", suburbItem=" + this.c + ")";
        }
    }

    public LocationsByGeoCoordinatesQuery(double d, double d2, List list, Optional optional) {
        this.f20323a = d;
        this.b = d2;
        this.c = list;
        this.d = optional;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(LocationsByGeoCoordinatesQuery_ResponseAdapter.Data.f20334a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query LocationsByGeoCoordinates($latitude: Float!, $longitude: Float!, $supportedShoppingModes: [ShoppingModeId!]!, $max: Int) { locationsByGeoCoordinates(latitude: $latitude, longitude: $longitude, supportedShoppingModes: $supportedShoppingModes, max: $max) { result { __typename ...store ...suburbItem } } }  fragment store on Store { __typename id name address facilities phone instoreTradingHours { dayLabel hoursLabel } latitude longitude distanceInKm supportedShoppingModes pickupTypes { addressId shoppingModeId type label text } }  fragment suburbItem on SuburbItem { __typename postcode state text }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationsByGeoCoordinatesQuery)) {
            return false;
        }
        LocationsByGeoCoordinatesQuery locationsByGeoCoordinatesQuery = (LocationsByGeoCoordinatesQuery) obj;
        return Double.compare(this.f20323a, locationsByGeoCoordinatesQuery.f20323a) == 0 && Double.compare(this.b, locationsByGeoCoordinatesQuery.b) == 0 && Intrinsics.c(this.c, locationsByGeoCoordinatesQuery.c) && Intrinsics.c(this.d, locationsByGeoCoordinatesQuery.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + b.d(android.support.v4.media.session.a.a(this.b, Double.hashCode(this.f20323a) * 31, 31), 31, this.c);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "3704464f7bb3749ff1f24ecabbf893c340c42b6928582182817f25276788f4d3";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "LocationsByGeoCoordinates";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1(h.a.b);
        Adapters$DoubleAdapter$1 adapters$DoubleAdapter$1 = Adapters.c;
        adapters$DoubleAdapter$1.toJson(jsonWriter, customScalarAdapters, Double.valueOf(this.f20323a));
        jsonWriter.F1(h.a.c);
        adapters$DoubleAdapter$1.toJson(jsonWriter, customScalarAdapters, Double.valueOf(this.b));
        jsonWriter.F1("supportedShoppingModes");
        Adapters.a(ShoppingModeId_ResponseAdapter.f12117a).toJson(jsonWriter, customScalarAdapters, this.c);
        Optional optional = this.d;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("max");
            Adapters.d(Adapters.k).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
    }

    public final String toString() {
        StringBuilder sbN = androidx.constraintlayout.core.state.a.n(this.f20323a, "LocationsByGeoCoordinatesQuery(latitude=", ", longitude=");
        sbN.append(this.b);
        sbN.append(", supportedShoppingModes=");
        sbN.append(this.c);
        sbN.append(", max=");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }
}
