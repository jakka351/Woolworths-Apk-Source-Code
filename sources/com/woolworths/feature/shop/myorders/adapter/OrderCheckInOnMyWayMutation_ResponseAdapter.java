package com.woolworths.feature.shop.myorders.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.myorders.OrderCheckInOnMyWayMutation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/OrderCheckInOnMyWayMutation_ResponseAdapter;", "", "Data", "OrderCheckInOnMyWay", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrderCheckInOnMyWayMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/OrderCheckInOnMyWayMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/OrderCheckInOnMyWayMutation$Data;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<OrderCheckInOnMyWayMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20183a = new Data();
        public static final List b = CollectionsKt.Q("orderCheckInOnMyWay");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            OrderCheckInOnMyWayMutation.OrderCheckInOnMyWay orderCheckInOnMyWay = null;
            while (reader.o2(b) == 0) {
                orderCheckInOnMyWay = (OrderCheckInOnMyWayMutation.OrderCheckInOnMyWay) Adapters.c(OrderCheckInOnMyWay.f20184a, false).fromJson(reader, customScalarAdapters);
            }
            if (orderCheckInOnMyWay != null) {
                return new OrderCheckInOnMyWayMutation.Data(orderCheckInOnMyWay);
            }
            Assertions.a(reader, "orderCheckInOnMyWay");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OrderCheckInOnMyWayMutation.Data value = (OrderCheckInOnMyWayMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("orderCheckInOnMyWay");
            Adapters.c(OrderCheckInOnMyWay.f20184a, false).toJson(writer, customScalarAdapters, value.f20016a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/OrderCheckInOnMyWayMutation_ResponseAdapter$OrderCheckInOnMyWay;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/OrderCheckInOnMyWayMutation$OrderCheckInOnMyWay;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OrderCheckInOnMyWay implements Adapter<OrderCheckInOnMyWayMutation.OrderCheckInOnMyWay> {

        /* renamed from: a, reason: collision with root package name */
        public static final OrderCheckInOnMyWay f20184a = new OrderCheckInOnMyWay();
        public static final List b = CollectionsKt.R("success", "message", "reason");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (bool != null) {
                return new OrderCheckInOnMyWayMutation.OrderCheckInOnMyWay(bool.booleanValue(), str, str2);
            }
            Assertions.a(reader, "success");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OrderCheckInOnMyWayMutation.OrderCheckInOnMyWay value = (OrderCheckInOnMyWayMutation.OrderCheckInOnMyWay) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("success");
            d.B(value.f20017a, Adapters.f, writer, customScalarAdapters, "message");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("reason");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
        }
    }
}
