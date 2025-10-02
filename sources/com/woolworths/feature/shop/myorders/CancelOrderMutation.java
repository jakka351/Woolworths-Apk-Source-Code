package com.woolworths.feature.shop.myorders;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.graphql.type.CancelOrderReason;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.myorders.adapter.CancelOrderMutation_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/myorders/CancelOrderMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/feature/shop/myorders/CancelOrderMutation$Data;", "Data", "CancelOrder", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CancelOrderMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f19852a;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/CancelOrderMutation$CancelOrder;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CancelOrder {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f19853a;
        public final String b;
        public final CancelOrderReason c;

        public CancelOrder(boolean z, String str, CancelOrderReason cancelOrderReason) {
            this.f19853a = z;
            this.b = str;
            this.c = cancelOrderReason;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CancelOrder)) {
                return false;
            }
            CancelOrder cancelOrder = (CancelOrder) obj;
            return this.f19853a == cancelOrder.f19853a && Intrinsics.c(this.b, cancelOrder.b) && this.c == cancelOrder.c;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f19853a) * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            CancelOrderReason cancelOrderReason = this.c;
            return iHashCode2 + (cancelOrderReason != null ? cancelOrderReason.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbT = a.t("CancelOrder(success=", ", message=", this.b, ", reason=", this.f19853a);
            sbT.append(this.c);
            sbT.append(")");
            return sbT.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/myorders/CancelOrderMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/CancelOrderMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final CancelOrder f19854a;

        public Data(CancelOrder cancelOrder) {
            this.f19854a = cancelOrder;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f19854a, ((Data) obj).f19854a);
        }

        public final int hashCode() {
            return this.f19854a.hashCode();
        }

        public final String toString() {
            return "Data(cancelOrder=" + this.f19854a + ")";
        }
    }

    public CancelOrderMutation(String orderId) {
        Intrinsics.h(orderId, "orderId");
        this.f19852a = orderId;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(CancelOrderMutation_ResponseAdapter.Data.f20029a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation cancelOrder($orderId: ID!) { cancelOrder(orderId: $orderId) { success message reason } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CancelOrderMutation) && Intrinsics.c(this.f19852a, ((CancelOrderMutation) obj).f19852a);
    }

    public final int hashCode() {
        return this.f19852a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "7bd1bf93e8b88db93cc6a09fb98856523706a365884e54026bc4fbcb38db1927";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "cancelOrder";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("orderId");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f19852a);
    }

    public final String toString() {
        return YU.a.h("CancelOrderMutation(orderId=", this.f19852a, ")");
    }
}
