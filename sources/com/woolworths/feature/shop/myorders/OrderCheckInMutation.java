package com.woolworths.feature.shop.myorders;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.shop.graphql.type.CheckInType;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.myorders.adapter.OrderCheckInMutation_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/myorders/OrderCheckInMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/feature/shop/myorders/OrderCheckInMutation$Data;", "Data", "OrderCheckIn", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrderCheckInMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f20012a;
    public final CheckInType b;
    public final Optional c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/myorders/OrderCheckInMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/OrderCheckInMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final OrderCheckIn f20013a;

        public Data(OrderCheckIn orderCheckIn) {
            this.f20013a = orderCheckIn;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20013a, ((Data) obj).f20013a);
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f20013a.f20014a);
        }

        public final String toString() {
            return "Data(orderCheckIn=" + this.f20013a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/OrderCheckInMutation$OrderCheckIn;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OrderCheckIn {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f20014a;

        public OrderCheckIn(boolean z) {
            this.f20014a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OrderCheckIn) && this.f20014a == ((OrderCheckIn) obj).f20014a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f20014a);
        }

        public final String toString() {
            return a.n("OrderCheckIn(success=", ")", this.f20014a);
        }
    }

    public OrderCheckInMutation(String orderId, CheckInType checkInType, Optional optional) {
        Intrinsics.h(orderId, "orderId");
        Intrinsics.h(checkInType, "checkInType");
        this.f20012a = orderId;
        this.b = checkInType;
        this.c = optional;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(OrderCheckInMutation_ResponseAdapter.Data.f20181a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation orderCheckIn($orderId: ID!, $checkInType: CheckInType!, $bayNumberChoice: String) { orderCheckIn(orderId: $orderId, checkInType: $checkInType, bayNumberChoice: $bayNumberChoice) { success } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderCheckInMutation)) {
            return false;
        }
        OrderCheckInMutation orderCheckInMutation = (OrderCheckInMutation) obj;
        return Intrinsics.c(this.f20012a, orderCheckInMutation.f20012a) && this.b == orderCheckInMutation.b && Intrinsics.c(this.c, orderCheckInMutation.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f20012a.hashCode() * 31)) * 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "f8f22eeb72d93fa10306789fd7c33b752dfa78be3e00126497ac48bad9367207";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "orderCheckIn";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("orderId");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f20012a);
        jsonWriter.F1("checkInType");
        CheckInType value = this.b;
        Intrinsics.h(value, "value");
        jsonWriter.v0(value.d);
        Optional optional = this.c;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("bayNumberChoice");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderCheckInMutation(orderId=");
        sb.append(this.f20012a);
        sb.append(", checkInType=");
        sb.append(this.b);
        sb.append(", bayNumberChoice=");
        return au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.o(sb, this.c, ")");
    }
}
