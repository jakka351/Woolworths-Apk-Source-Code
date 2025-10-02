package com.woolworths.feature.shop.myorders;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.PickupOrderStatus;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Subscription;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.myorders.adapter.GetPickupOrderMessagesSubscription_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetPickupOrderMessagesSubscription;", "Lcom/apollographql/apollo/api/Subscription;", "Lcom/woolworths/feature/shop/myorders/GetPickupOrderMessagesSubscription$Data;", "Data", "PickupOrderMessages", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetPickupOrderMessagesSubscription implements Subscription<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f19976a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetPickupOrderMessagesSubscription$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetPickupOrderMessagesSubscription$Data;", "Lcom/apollographql/apollo/api/Subscription$Data;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Subscription.Data {

        /* renamed from: a, reason: collision with root package name */
        public final PickupOrderMessages f19977a;

        public Data(PickupOrderMessages pickupOrderMessages) {
            this.f19977a = pickupOrderMessages;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f19977a, ((Data) obj).f19977a);
        }

        public final int hashCode() {
            PickupOrderMessages pickupOrderMessages = this.f19977a;
            if (pickupOrderMessages == null) {
                return 0;
            }
            return pickupOrderMessages.hashCode();
        }

        public final String toString() {
            return "Data(pickupOrderMessages=" + this.f19977a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetPickupOrderMessagesSubscription$PickupOrderMessages;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PickupOrderMessages {

        /* renamed from: a, reason: collision with root package name */
        public final String f19978a;
        public final PickupOrderStatus b;

        public PickupOrderMessages(String str, PickupOrderStatus pickupOrderStatus) {
            this.f19978a = str;
            this.b = pickupOrderStatus;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PickupOrderMessages)) {
                return false;
            }
            PickupOrderMessages pickupOrderMessages = (PickupOrderMessages) obj;
            return Intrinsics.c(this.f19978a, pickupOrderMessages.f19978a) && this.b == pickupOrderMessages.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19978a.hashCode() * 31);
        }

        public final String toString() {
            return "PickupOrderMessages(orderId=" + this.f19978a + ", orderStatus=" + this.b + ")";
        }
    }

    public GetPickupOrderMessagesSubscription(Optional optional) {
        this.f19976a = optional;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(GetPickupOrderMessagesSubscription_ResponseAdapter.Data.f20148a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "subscription getPickupOrderMessages($orderId: ID) { pickupOrderMessages(orderId: $orderId) { orderId orderStatus } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetPickupOrderMessagesSubscription) && Intrinsics.c(this.f19976a, ((GetPickupOrderMessagesSubscription) obj).f19976a);
    }

    public final int hashCode() {
        return this.f19976a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "dfc2aac112751069fe621197207df3ae6a5e287291989fc6a558a124fd85905e";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "getPickupOrderMessages";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Optional optional = this.f19976a;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("orderId");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
    }

    public final String toString() {
        return "GetPickupOrderMessagesSubscription(orderId=" + this.f19976a + ")";
    }
}
