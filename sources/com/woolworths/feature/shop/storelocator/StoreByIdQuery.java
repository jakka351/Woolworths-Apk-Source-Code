package com.woolworths.feature.shop.storelocator;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.storelocator.adapter.StoreByIdQuery_ResponseAdapter;
import com.woolworths.feature.shop.storelocator.fragment.Store;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/storelocator/StoreByIdQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/feature/shop/storelocator/StoreByIdQuery$Data;", "Data", "StoreById", "Companion", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StoreByIdQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f20331a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/storelocator/StoreByIdQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/storelocator/StoreByIdQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final StoreById f20332a;

        public Data(StoreById storeById) {
            this.f20332a = storeById;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20332a, ((Data) obj).f20332a);
        }

        public final int hashCode() {
            StoreById storeById = this.f20332a;
            if (storeById == null) {
                return 0;
            }
            return storeById.hashCode();
        }

        public final String toString() {
            return "Data(storeById=" + this.f20332a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/storelocator/StoreByIdQuery$StoreById;", "", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StoreById {

        /* renamed from: a, reason: collision with root package name */
        public final String f20333a;
        public final Store b;

        public StoreById(String str, Store store) {
            this.f20333a = str;
            this.b = store;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StoreById)) {
                return false;
            }
            StoreById storeById = (StoreById) obj;
            return Intrinsics.c(this.f20333a, storeById.f20333a) && Intrinsics.c(this.b, storeById.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20333a.hashCode() * 31);
        }

        public final String toString() {
            return "StoreById(__typename=" + this.f20333a + ", store=" + this.b + ")";
        }
    }

    public StoreByIdQuery(String id) {
        Intrinsics.h(id, "id");
        this.f20331a = id;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(StoreByIdQuery_ResponseAdapter.Data.f20340a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query StoreById($id: String!) { storeById(id: $id) { __typename ...store } }  fragment store on Store { __typename id name address facilities phone instoreTradingHours { dayLabel hoursLabel } latitude longitude distanceInKm supportedShoppingModes pickupTypes { addressId shoppingModeId type label text } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoreByIdQuery) && Intrinsics.c(this.f20331a, ((StoreByIdQuery) obj).f20331a);
    }

    public final int hashCode() {
        return this.f20331a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "f2024bd520a24224cbf3b6914cb690b6914e52e4a3e897b734bcfe2d62f68e76";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "StoreById";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("id");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f20331a);
    }

    public final String toString() {
        return a.h("StoreByIdQuery(id=", this.f20331a, ")");
    }
}
