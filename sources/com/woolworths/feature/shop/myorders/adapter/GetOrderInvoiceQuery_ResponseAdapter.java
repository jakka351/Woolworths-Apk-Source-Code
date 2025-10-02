package com.woolworths.feature.shop.myorders.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.shop.graphql.type.InvoiceErrorReason;
import au.com.woolworths.shop.graphql.type.adapter.InvoiceErrorReason_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.myorders.GetOrderInvoiceQuery;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderInvoiceQuery_ResponseAdapter;", "", "Data", "OrderInvoice", "OnOrderInvoiceDetail", "OnOrderInvoiceError", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetOrderInvoiceQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderInvoiceQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderInvoiceQuery$Data;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<GetOrderInvoiceQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20032a = new Data();
        public static final List b = CollectionsKt.Q("orderInvoice");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            GetOrderInvoiceQuery.OrderInvoice orderInvoice = null;
            while (reader.o2(b) == 0) {
                orderInvoice = (GetOrderInvoiceQuery.OrderInvoice) Adapters.c(OrderInvoice.f20035a, true).fromJson(reader, customScalarAdapters);
            }
            if (orderInvoice != null) {
                return new GetOrderInvoiceQuery.Data(orderInvoice);
            }
            Assertions.a(reader, "orderInvoice");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderInvoiceQuery.Data value = (GetOrderInvoiceQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("orderInvoice");
            Adapters.c(OrderInvoice.f20035a, true).toJson(writer, customScalarAdapters, value.f19859a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderInvoiceQuery_ResponseAdapter$OnOrderInvoiceDetail;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderInvoiceQuery$OnOrderInvoiceDetail;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnOrderInvoiceDetail implements Adapter<GetOrderInvoiceQuery.OnOrderInvoiceDetail> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20033a = CollectionsKt.Q("url");

        public static GetOrderInvoiceQuery.OnOrderInvoiceDetail a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f20033a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new GetOrderInvoiceQuery.OnOrderInvoiceDetail(str);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetOrderInvoiceQuery.OnOrderInvoiceDetail value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19860a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (GetOrderInvoiceQuery.OnOrderInvoiceDetail) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderInvoiceQuery_ResponseAdapter$OnOrderInvoiceError;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderInvoiceQuery$OnOrderInvoiceError;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnOrderInvoiceError implements Adapter<GetOrderInvoiceQuery.OnOrderInvoiceError> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20034a = CollectionsKt.R("message", "reason");

        public static GetOrderInvoiceQuery.OnOrderInvoiceError a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            InvoiceErrorReason invoiceErrorReasonA = null;
            while (true) {
                int iO2 = reader.o2(f20034a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    invoiceErrorReasonA = InvoiceErrorReason_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "message");
                throw null;
            }
            if (invoiceErrorReasonA != null) {
                return new GetOrderInvoiceQuery.OnOrderInvoiceError(str, invoiceErrorReasonA);
            }
            Assertions.a(reader, "reason");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetOrderInvoiceQuery.OnOrderInvoiceError value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19861a);
            writer.F1("reason");
            writer.v0(value.b.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (GetOrderInvoiceQuery.OnOrderInvoiceError) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderInvoiceQuery_ResponseAdapter$OrderInvoice;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderInvoiceQuery$OrderInvoice;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OrderInvoice implements Adapter<GetOrderInvoiceQuery.OrderInvoice> {

        /* renamed from: a, reason: collision with root package name */
        public static final OrderInvoice f20035a = new OrderInvoice();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            GetOrderInvoiceQuery.OnOrderInvoiceDetail onOrderInvoiceDetailA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            GetOrderInvoiceQuery.OnOrderInvoiceError onOrderInvoiceErrorA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("OrderInvoiceDetail"))) {
                reader.o();
                onOrderInvoiceDetailA = OnOrderInvoiceDetail.a(reader, customScalarAdapters);
            } else {
                onOrderInvoiceDetailA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("OrderInvoiceError"))) {
                reader.o();
                onOrderInvoiceErrorA = OnOrderInvoiceError.a(reader, customScalarAdapters);
            }
            return new GetOrderInvoiceQuery.OrderInvoice(str, onOrderInvoiceDetailA, onOrderInvoiceErrorA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderInvoiceQuery.OrderInvoice value = (GetOrderInvoiceQuery.OrderInvoice) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19862a);
            GetOrderInvoiceQuery.OnOrderInvoiceDetail onOrderInvoiceDetail = value.b;
            if (onOrderInvoiceDetail != null) {
                OnOrderInvoiceDetail.b(writer, customScalarAdapters, onOrderInvoiceDetail);
            }
            GetOrderInvoiceQuery.OnOrderInvoiceError onOrderInvoiceError = value.c;
            if (onOrderInvoiceError != null) {
                OnOrderInvoiceError.b(writer, customScalarAdapters, onOrderInvoiceError);
            }
        }
    }
}
