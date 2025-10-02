package com.woolworths.feature.shop.myorders;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.InvoiceErrorReason;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.myorders.adapter.GetOrderInvoiceQuery_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderInvoiceQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/feature/shop/myorders/GetOrderInvoiceQuery$Data;", "Data", "OrderInvoice", "OnOrderInvoiceDetail", "OnOrderInvoiceError", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetOrderInvoiceQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f19858a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderInvoiceQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderInvoiceQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final OrderInvoice f19859a;

        public Data(OrderInvoice orderInvoice) {
            this.f19859a = orderInvoice;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f19859a, ((Data) obj).f19859a);
        }

        public final int hashCode() {
            return this.f19859a.hashCode();
        }

        public final String toString() {
            return "Data(orderInvoice=" + this.f19859a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderInvoiceQuery$OnOrderInvoiceDetail;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOrderInvoiceDetail {

        /* renamed from: a, reason: collision with root package name */
        public final String f19860a;

        public OnOrderInvoiceDetail(String str) {
            this.f19860a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnOrderInvoiceDetail) && Intrinsics.c(this.f19860a, ((OnOrderInvoiceDetail) obj).f19860a);
        }

        public final int hashCode() {
            return this.f19860a.hashCode();
        }

        public final String toString() {
            return a.h("OnOrderInvoiceDetail(url=", this.f19860a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderInvoiceQuery$OnOrderInvoiceError;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOrderInvoiceError {

        /* renamed from: a, reason: collision with root package name */
        public final String f19861a;
        public final InvoiceErrorReason b;

        public OnOrderInvoiceError(String str, InvoiceErrorReason invoiceErrorReason) {
            this.f19861a = str;
            this.b = invoiceErrorReason;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnOrderInvoiceError)) {
                return false;
            }
            OnOrderInvoiceError onOrderInvoiceError = (OnOrderInvoiceError) obj;
            return Intrinsics.c(this.f19861a, onOrderInvoiceError.f19861a) && this.b == onOrderInvoiceError.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19861a.hashCode() * 31);
        }

        public final String toString() {
            return "OnOrderInvoiceError(message=" + this.f19861a + ", reason=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderInvoiceQuery$OrderInvoice;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OrderInvoice {

        /* renamed from: a, reason: collision with root package name */
        public final String f19862a;
        public final OnOrderInvoiceDetail b;
        public final OnOrderInvoiceError c;

        public OrderInvoice(String __typename, OnOrderInvoiceDetail onOrderInvoiceDetail, OnOrderInvoiceError onOrderInvoiceError) {
            Intrinsics.h(__typename, "__typename");
            this.f19862a = __typename;
            this.b = onOrderInvoiceDetail;
            this.c = onOrderInvoiceError;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderInvoice)) {
                return false;
            }
            OrderInvoice orderInvoice = (OrderInvoice) obj;
            return Intrinsics.c(this.f19862a, orderInvoice.f19862a) && Intrinsics.c(this.b, orderInvoice.b) && Intrinsics.c(this.c, orderInvoice.c);
        }

        public final int hashCode() {
            int iHashCode = this.f19862a.hashCode() * 31;
            OnOrderInvoiceDetail onOrderInvoiceDetail = this.b;
            int iHashCode2 = (iHashCode + (onOrderInvoiceDetail == null ? 0 : onOrderInvoiceDetail.f19860a.hashCode())) * 31;
            OnOrderInvoiceError onOrderInvoiceError = this.c;
            return iHashCode2 + (onOrderInvoiceError != null ? onOrderInvoiceError.hashCode() : 0);
        }

        public final String toString() {
            return "OrderInvoice(__typename=" + this.f19862a + ", onOrderInvoiceDetail=" + this.b + ", onOrderInvoiceError=" + this.c + ")";
        }
    }

    public GetOrderInvoiceQuery(String orderId) {
        Intrinsics.h(orderId, "orderId");
        this.f19858a = orderId;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(GetOrderInvoiceQuery_ResponseAdapter.Data.f20032a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query getOrderInvoice($orderId: ID!) { orderInvoice(orderId: $orderId) { __typename ... on OrderInvoiceDetail { url } ... on OrderInvoiceError { message reason } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetOrderInvoiceQuery) && Intrinsics.c(this.f19858a, ((GetOrderInvoiceQuery) obj).f19858a);
    }

    public final int hashCode() {
        return this.f19858a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "fdb017fb9abfc11bbef2c9de09d821653a133ff7e7fcb489d5636f6848ab717b";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "getOrderInvoice";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("orderId");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f19858a);
    }

    public final String toString() {
        return a.h("GetOrderInvoiceQuery(orderId=", this.f19858a, ")");
    }
}
