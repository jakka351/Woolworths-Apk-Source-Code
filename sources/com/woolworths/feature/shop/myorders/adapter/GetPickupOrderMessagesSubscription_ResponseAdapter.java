package com.woolworths.feature.shop.myorders.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.PickupOrderStatus;
import au.com.woolworths.shop.graphql.type.adapter.PickupOrderStatus_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.myorders.GetPickupOrderMessagesSubscription;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetPickupOrderMessagesSubscription_ResponseAdapter;", "", "Data", "PickupOrderMessages", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetPickupOrderMessagesSubscription_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetPickupOrderMessagesSubscription_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetPickupOrderMessagesSubscription$Data;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<GetPickupOrderMessagesSubscription.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20148a = new Data();
        public static final List b = CollectionsKt.Q("pickupOrderMessages");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            GetPickupOrderMessagesSubscription.PickupOrderMessages pickupOrderMessages = null;
            while (reader.o2(b) == 0) {
                pickupOrderMessages = (GetPickupOrderMessagesSubscription.PickupOrderMessages) Adapters.b(Adapters.c(PickupOrderMessages.f20149a, false)).fromJson(reader, customScalarAdapters);
            }
            return new GetPickupOrderMessagesSubscription.Data(pickupOrderMessages);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetPickupOrderMessagesSubscription.Data value = (GetPickupOrderMessagesSubscription.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("pickupOrderMessages");
            Adapters.b(Adapters.c(PickupOrderMessages.f20149a, false)).toJson(writer, customScalarAdapters, value.f19977a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetPickupOrderMessagesSubscription_ResponseAdapter$PickupOrderMessages;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetPickupOrderMessagesSubscription$PickupOrderMessages;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PickupOrderMessages implements Adapter<GetPickupOrderMessagesSubscription.PickupOrderMessages> {

        /* renamed from: a, reason: collision with root package name */
        public static final PickupOrderMessages f20149a = new PickupOrderMessages();
        public static final List b = CollectionsKt.R("orderId", "orderStatus");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            PickupOrderStatus pickupOrderStatusA = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    pickupOrderStatusA = PickupOrderStatus_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "orderId");
                throw null;
            }
            if (pickupOrderStatusA != null) {
                return new GetPickupOrderMessagesSubscription.PickupOrderMessages(str, pickupOrderStatusA);
            }
            Assertions.a(reader, "orderStatus");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetPickupOrderMessagesSubscription.PickupOrderMessages value = (GetPickupOrderMessagesSubscription.PickupOrderMessages) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("orderId");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19978a);
            writer.F1("orderStatus");
            writer.v0(value.b.d);
        }
    }
}
