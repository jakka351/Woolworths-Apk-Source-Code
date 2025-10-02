package com.woolworths.feature.shop.myorders.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.OrderStatus;
import au.com.woolworths.shop.graphql.type.adapter.OrderStatus_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.woolworths.feature.shop.myorders.MyOrdersQuery;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/MyOrdersQuery_ResponseAdapter;", "", "Data", "Orders", "Feed", "OnPickUpOrder", "OnDeliveryOrder", "OnCompactOrder", "Message", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MyOrdersQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/MyOrdersQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/MyOrdersQuery$Data;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<MyOrdersQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20174a = new Data();
        public static final List b = CollectionsKt.Q("orders");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            MyOrdersQuery.Orders orders = null;
            while (reader.o2(b) == 0) {
                orders = (MyOrdersQuery.Orders) Adapters.c(Orders.f20180a, false).fromJson(reader, customScalarAdapters);
            }
            if (orders != null) {
                return new MyOrdersQuery.Data(orders);
            }
            Assertions.a(reader, "orders");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MyOrdersQuery.Data value = (MyOrdersQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("orders");
            Adapters.c(Orders.f20180a, false).toJson(writer, customScalarAdapters, value.f20005a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/MyOrdersQuery_ResponseAdapter$Feed;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/MyOrdersQuery$Feed;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Feed implements Adapter<MyOrdersQuery.Feed> {

        /* renamed from: a, reason: collision with root package name */
        public static final Feed f20175a = new Feed();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            MyOrdersQuery.OnPickUpOrder onPickUpOrderA;
            MyOrdersQuery.OnDeliveryOrder onDeliveryOrderA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            MyOrdersQuery.OnCompactOrder onCompactOrderA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("PickUpOrder"))) {
                reader.o();
                onPickUpOrderA = OnPickUpOrder.a(reader, customScalarAdapters);
            } else {
                onPickUpOrderA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("DeliveryOrder"))) {
                reader.o();
                onDeliveryOrderA = OnDeliveryOrder.a(reader, customScalarAdapters);
            } else {
                onDeliveryOrderA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("CompactOrder"), BooleanExpressions.d("isOrdersHistoryEnabled")))) {
                reader.o();
                onCompactOrderA = OnCompactOrder.a(reader, customScalarAdapters);
            }
            return new MyOrdersQuery.Feed(str, onPickUpOrderA, onDeliveryOrderA, onCompactOrderA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MyOrdersQuery.Feed value = (MyOrdersQuery.Feed) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20006a);
            MyOrdersQuery.OnPickUpOrder onPickUpOrder = value.b;
            if (onPickUpOrder != null) {
                OnPickUpOrder.b(writer, customScalarAdapters, onPickUpOrder);
            }
            MyOrdersQuery.OnDeliveryOrder onDeliveryOrder = value.c;
            if (onDeliveryOrder != null) {
                OnDeliveryOrder.b(writer, customScalarAdapters, onDeliveryOrder);
            }
            MyOrdersQuery.OnCompactOrder onCompactOrder = value.d;
            if (onCompactOrder != null) {
                OnCompactOrder.b(writer, customScalarAdapters, onCompactOrder);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/MyOrdersQuery_ResponseAdapter$Message;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/MyOrdersQuery$Message;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Message implements Adapter<MyOrdersQuery.Message> {

        /* renamed from: a, reason: collision with root package name */
        public static final Message f20176a = new Message();
        public static final List b = CollectionsKt.R("title", "message");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 != null) {
                return new MyOrdersQuery.Message(str, str2);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MyOrdersQuery.Message value = (MyOrdersQuery.Message) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20007a);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/MyOrdersQuery_ResponseAdapter$OnCompactOrder;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/MyOrdersQuery$OnCompactOrder;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCompactOrder implements Adapter<MyOrdersQuery.OnCompactOrder> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20177a = CollectionsKt.R("id", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "status", "total", "date", "iconUrl");

        public static MyOrdersQuery.OnCompactOrder a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            OrderStatus orderStatus = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            while (true) {
                switch (reader.o2(f20177a)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        orderStatus = (OrderStatus) Adapters.b(OrderStatus_ResponseAdapter.f12092a).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str6 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "id");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "total");
                            throw null;
                        }
                        if (str5 == null) {
                            Assertions.a(reader, "date");
                            throw null;
                        }
                        if (str6 != null) {
                            return new MyOrdersQuery.OnCompactOrder(str, str2, str3, orderStatus, str4, str5, str6);
                        }
                        Assertions.a(reader, "iconUrl");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, MyOrdersQuery.OnCompactOrder value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20008a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("status");
            Adapters.b(OrderStatus_ResponseAdapter.f12092a).toJson(writer, customScalarAdapters, value.d);
            writer.F1("total");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("date");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1("iconUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.g);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (MyOrdersQuery.OnCompactOrder) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/MyOrdersQuery_ResponseAdapter$OnDeliveryOrder;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/MyOrdersQuery$OnDeliveryOrder;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnDeliveryOrder implements Adapter<MyOrdersQuery.OnDeliveryOrder> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20178a = CollectionsKt.R("id", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "date", "status", "total", "timeLabel", "timeValue", "location", "windowTime", "windowDate");

        public static MyOrdersQuery.OnDeliveryOrder a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            OrderStatus orderStatus = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            while (true) {
                switch (reader.o2(f20178a)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        orderStatus = (OrderStatus) Adapters.b(OrderStatus_ResponseAdapter.f12092a).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str6 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        str7 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        str8 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        str9 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        str10 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "id");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "date");
                            throw null;
                        }
                        if (str5 == null) {
                            Assertions.a(reader, "total");
                            throw null;
                        }
                        if (str6 == null) {
                            Assertions.a(reader, "timeLabel");
                            throw null;
                        }
                        if (str7 == null) {
                            Assertions.a(reader, "timeValue");
                            throw null;
                        }
                        if (str8 != null) {
                            return new MyOrdersQuery.OnDeliveryOrder(str, str2, str3, str4, orderStatus, str5, str6, str7, str8, str9, str10);
                        }
                        Assertions.a(reader, "location");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, MyOrdersQuery.OnDeliveryOrder value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20009a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("date");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("status");
            Adapters.b(OrderStatus_ResponseAdapter.f12092a).toJson(writer, customScalarAdapters, value.e);
            writer.F1("total");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1("timeLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.g);
            writer.F1("timeValue");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.h);
            writer.F1("location");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.i);
            writer.F1("windowTime");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.j);
            writer.F1("windowDate");
            nullableAdapter.toJson(writer, customScalarAdapters, value.k);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (MyOrdersQuery.OnDeliveryOrder) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/MyOrdersQuery_ResponseAdapter$OnPickUpOrder;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/MyOrdersQuery$OnPickUpOrder;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPickUpOrder implements Adapter<MyOrdersQuery.OnPickUpOrder> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20179a = CollectionsKt.R("id", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "date", "status", "total", "timeLabel", "timeValue", "actionPath", "actionTitle");

        public static MyOrdersQuery.OnPickUpOrder a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            OrderStatus orderStatus = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            while (true) {
                switch (reader.o2(f20179a)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        orderStatus = (OrderStatus) Adapters.b(OrderStatus_ResponseAdapter.f12092a).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str6 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        str7 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        str8 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        str9 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "id");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "date");
                            throw null;
                        }
                        if (str5 == null) {
                            Assertions.a(reader, "total");
                            throw null;
                        }
                        if (str6 == null) {
                            Assertions.a(reader, "timeLabel");
                            throw null;
                        }
                        if (str7 == null) {
                            Assertions.a(reader, "timeValue");
                            throw null;
                        }
                        if (str8 == null) {
                            Assertions.a(reader, "actionPath");
                            throw null;
                        }
                        if (str9 != null) {
                            return new MyOrdersQuery.OnPickUpOrder(str, str2, str3, str4, orderStatus, str5, str6, str7, str8, str9);
                        }
                        Assertions.a(reader, "actionTitle");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, MyOrdersQuery.OnPickUpOrder value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20010a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("date");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("status");
            Adapters.b(OrderStatus_ResponseAdapter.f12092a).toJson(writer, customScalarAdapters, value.e);
            writer.F1("total");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1("timeLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.g);
            writer.F1("timeValue");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.h);
            writer.F1("actionPath");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.i);
            writer.F1("actionTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.j);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (MyOrdersQuery.OnPickUpOrder) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/MyOrdersQuery_ResponseAdapter$Orders;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/MyOrdersQuery$Orders;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Orders implements Adapter<MyOrdersQuery.Orders> {

        /* renamed from: a, reason: collision with root package name */
        public static final Orders f20180a = new Orders();
        public static final List b = CollectionsKt.R("totalItemCount", "nextPage", "feed", "message");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Integer num2 = null;
            List list = null;
            MyOrdersQuery.Message message = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    num2 = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    list = (List) Adapters.b(Adapters.a(Adapters.c(Feed.f20175a, true))).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    message = (MyOrdersQuery.Message) Adapters.b(Adapters.c(Message.f20176a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (num != null) {
                return new MyOrdersQuery.Orders(num.intValue(), num2, list, message);
            }
            Assertions.a(reader, "totalItemCount");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MyOrdersQuery.Orders value = (MyOrdersQuery.Orders) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("totalItemCount");
            d.y(value.f20011a, Adapters.b, writer, customScalarAdapters, "nextPage");
            Adapters.k.toJson(writer, customScalarAdapters, value.b);
            writer.F1("feed");
            Adapters.b(Adapters.a(Adapters.c(Feed.f20175a, true))).toJson(writer, customScalarAdapters, value.c);
            writer.F1("message");
            Adapters.b(Adapters.c(Message.f20176a, false)).toJson(writer, customScalarAdapters, value.d);
        }
    }
}
