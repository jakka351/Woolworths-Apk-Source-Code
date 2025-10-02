package com.woolworths.feature.shop.storelocator;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.graphql.type.adapter.ShoppingModeId_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.actions.SearchIntents;
import com.woolworths.feature.shop.storelocator.adapter.SearchLocationsQuery_ResponseAdapter;
import com.woolworths.feature.shop.storelocator.fragment.Store;
import com.woolworths.feature.shop.storelocator.fragment.SuburbItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/woolworths/feature/shop/storelocator/SearchLocationsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/feature/shop/storelocator/SearchLocationsQuery$Data;", "Data", "SearchLocations", "Result", "Companion", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SearchLocationsQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f20327a;
    public final List b;
    public final Optional c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/storelocator/SearchLocationsQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/storelocator/SearchLocationsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final SearchLocations f20328a;

        public Data(SearchLocations searchLocations) {
            this.f20328a = searchLocations;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20328a, ((Data) obj).f20328a);
        }

        public final int hashCode() {
            return this.f20328a.f20330a.hashCode();
        }

        public final String toString() {
            return "Data(searchLocations=" + this.f20328a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/storelocator/SearchLocationsQuery$Result;", "", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Result {

        /* renamed from: a, reason: collision with root package name */
        public final String f20329a;
        public final Store b;
        public final SuburbItem c;

        public Result(String __typename, Store store, SuburbItem suburbItem) {
            Intrinsics.h(__typename, "__typename");
            this.f20329a = __typename;
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
            return Intrinsics.c(this.f20329a, result.f20329a) && Intrinsics.c(this.b, result.b) && Intrinsics.c(this.c, result.c);
        }

        public final int hashCode() {
            int iHashCode = this.f20329a.hashCode() * 31;
            Store store = this.b;
            int iHashCode2 = (iHashCode + (store == null ? 0 : store.hashCode())) * 31;
            SuburbItem suburbItem = this.c;
            return iHashCode2 + (suburbItem != null ? suburbItem.hashCode() : 0);
        }

        public final String toString() {
            return "Result(__typename=" + this.f20329a + ", store=" + this.b + ", suburbItem=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/storelocator/SearchLocationsQuery$SearchLocations;", "", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SearchLocations {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f20330a;

        public SearchLocations(ArrayList arrayList) {
            this.f20330a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchLocations) && this.f20330a.equals(((SearchLocations) obj).f20330a);
        }

        public final int hashCode() {
            return this.f20330a.hashCode();
        }

        public final String toString() {
            return a.k("SearchLocations(result=", ")", this.f20330a);
        }
    }

    public SearchLocationsQuery(String query, List list, Optional optional) {
        Intrinsics.h(query, "query");
        this.f20327a = query;
        this.b = list;
        this.c = optional;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(SearchLocationsQuery_ResponseAdapter.Data.f20337a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query SearchLocations($query: String!, $supportedShoppingModes: [ShoppingModeId!]!, $max: Int) { searchLocations(query: $query, supportedShoppingModes: $supportedShoppingModes, max: $max) { result { __typename ...store ...suburbItem } } }  fragment store on Store { __typename id name address facilities phone instoreTradingHours { dayLabel hoursLabel } latitude longitude distanceInKm supportedShoppingModes pickupTypes { addressId shoppingModeId type label text } }  fragment suburbItem on SuburbItem { __typename postcode state text }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchLocationsQuery)) {
            return false;
        }
        SearchLocationsQuery searchLocationsQuery = (SearchLocationsQuery) obj;
        return Intrinsics.c(this.f20327a, searchLocationsQuery.f20327a) && Intrinsics.c(this.b, searchLocationsQuery.b) && Intrinsics.c(this.c, searchLocationsQuery.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b.d(this.f20327a.hashCode() * 31, 31, this.b);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "3818ef233b335d3e885821ca8492d0115fbfe6b75a228b53d93bb013ea1ee0b9";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "SearchLocations";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1(SearchIntents.EXTRA_QUERY);
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f20327a);
        jsonWriter.F1("supportedShoppingModes");
        Adapters.a(ShoppingModeId_ResponseAdapter.f12117a).toJson(jsonWriter, customScalarAdapters, this.b);
        Optional optional = this.c;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("max");
            Adapters.d(Adapters.k).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
    }

    public final String toString() {
        return au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.o(a.s("SearchLocationsQuery(query=", this.f20327a, ", supportedShoppingModes=", ", max=", this.b), this.c, ")");
    }
}
