package com.woolworths.feature.shop.myorders;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.OrderCheckInOnMyWayInput;
import au.com.woolworths.shop.graphql.type.adapter.OrderCheckInOnMyWayInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.myorders.adapter.OrderCheckInOnMyWayMutation_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/myorders/OrderCheckInOnMyWayMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/feature/shop/myorders/OrderCheckInOnMyWayMutation$Data;", "Data", "OrderCheckInOnMyWay", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrderCheckInOnMyWayMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final OrderCheckInOnMyWayInput f20015a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/myorders/OrderCheckInOnMyWayMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/OrderCheckInOnMyWayMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final OrderCheckInOnMyWay f20016a;

        public Data(OrderCheckInOnMyWay orderCheckInOnMyWay) {
            this.f20016a = orderCheckInOnMyWay;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20016a, ((Data) obj).f20016a);
        }

        public final int hashCode() {
            return this.f20016a.hashCode();
        }

        public final String toString() {
            return "Data(orderCheckInOnMyWay=" + this.f20016a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/OrderCheckInOnMyWayMutation$OrderCheckInOnMyWay;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OrderCheckInOnMyWay {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f20017a;
        public final String b;
        public final String c;

        public OrderCheckInOnMyWay(boolean z, String str, String str2) {
            this.f20017a = z;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderCheckInOnMyWay)) {
                return false;
            }
            OrderCheckInOnMyWay orderCheckInOnMyWay = (OrderCheckInOnMyWay) obj;
            return this.f20017a == orderCheckInOnMyWay.f20017a && Intrinsics.c(this.b, orderCheckInOnMyWay.b) && Intrinsics.c(this.c, orderCheckInOnMyWay.c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f20017a) * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return a.o(au.com.woolworths.android.onesite.a.t("OrderCheckInOnMyWay(success=", ", message=", this.b, ", reason=", this.f20017a), this.c, ")");
        }
    }

    public OrderCheckInOnMyWayMutation(OrderCheckInOnMyWayInput orderCheckInOnMyWayInput) {
        this.f20015a = orderCheckInOnMyWayInput;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(OrderCheckInOnMyWayMutation_ResponseAdapter.Data.f20183a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation orderCheckInOnMyWay($orderCheckInOnMyWayInput: OrderCheckInOnMyWayInput!) { orderCheckInOnMyWay(orderCheckInOnMyWayInput: $orderCheckInOnMyWayInput) { success message reason } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OrderCheckInOnMyWayMutation) && Intrinsics.c(this.f20015a, ((OrderCheckInOnMyWayMutation) obj).f20015a);
    }

    public final int hashCode() {
        return this.f20015a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "acfc89e8bcf6fb8b147ed432780a08000a9f1fd7314b95baa4d91485fd2f80d0";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "orderCheckInOnMyWay";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("orderCheckInOnMyWayInput");
        Adapters.c(OrderCheckInOnMyWayInput_InputAdapter.f12090a, false).toJson(jsonWriter, customScalarAdapters, this.f20015a);
    }

    public final String toString() {
        return "OrderCheckInOnMyWayMutation(orderCheckInOnMyWayInput=" + this.f20015a + ")";
    }
}
