package com.woolworths.feature.shop.myorders;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.OrderStatus;
import au.com.woolworths.shop.graphql.type.OrderType;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.myorders.adapter.MyOrdersQuery_ResponseAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/woolworths/feature/shop/myorders/MyOrdersQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/feature/shop/myorders/MyOrdersQuery$Data;", "Data", "Orders", "Feed", "OnPickUpOrder", "OnDeliveryOrder", "OnCompactOrder", "Message", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MyOrdersQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final int f20004a;
    public final OrderType b;
    public final boolean c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/myorders/MyOrdersQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/MyOrdersQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final Orders f20005a;

        public Data(Orders orders) {
            this.f20005a = orders;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20005a, ((Data) obj).f20005a);
        }

        public final int hashCode() {
            return this.f20005a.hashCode();
        }

        public final String toString() {
            return "Data(orders=" + this.f20005a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/MyOrdersQuery$Feed;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Feed {

        /* renamed from: a, reason: collision with root package name */
        public final String f20006a;
        public final OnPickUpOrder b;
        public final OnDeliveryOrder c;
        public final OnCompactOrder d;

        public Feed(String __typename, OnPickUpOrder onPickUpOrder, OnDeliveryOrder onDeliveryOrder, OnCompactOrder onCompactOrder) {
            Intrinsics.h(__typename, "__typename");
            this.f20006a = __typename;
            this.b = onPickUpOrder;
            this.c = onDeliveryOrder;
            this.d = onCompactOrder;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Feed)) {
                return false;
            }
            Feed feed = (Feed) obj;
            return Intrinsics.c(this.f20006a, feed.f20006a) && Intrinsics.c(this.b, feed.b) && Intrinsics.c(this.c, feed.c) && Intrinsics.c(this.d, feed.d);
        }

        public final int hashCode() {
            int iHashCode = this.f20006a.hashCode() * 31;
            OnPickUpOrder onPickUpOrder = this.b;
            int iHashCode2 = (iHashCode + (onPickUpOrder == null ? 0 : onPickUpOrder.hashCode())) * 31;
            OnDeliveryOrder onDeliveryOrder = this.c;
            int iHashCode3 = (iHashCode2 + (onDeliveryOrder == null ? 0 : onDeliveryOrder.hashCode())) * 31;
            OnCompactOrder onCompactOrder = this.d;
            return iHashCode3 + (onCompactOrder != null ? onCompactOrder.hashCode() : 0);
        }

        public final String toString() {
            return "Feed(__typename=" + this.f20006a + ", onPickUpOrder=" + this.b + ", onDeliveryOrder=" + this.c + ", onCompactOrder=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/MyOrdersQuery$Message;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Message {

        /* renamed from: a, reason: collision with root package name */
        public final String f20007a;
        public final String b;

        public Message(String str, String str2) {
            this.f20007a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Message)) {
                return false;
            }
            Message message = (Message) obj;
            return Intrinsics.c(this.f20007a, message.f20007a) && Intrinsics.c(this.b, message.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20007a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Message(title=", this.f20007a, ", message=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/MyOrdersQuery$OnCompactOrder;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCompactOrder {

        /* renamed from: a, reason: collision with root package name */
        public final String f20008a;
        public final String b;
        public final String c;
        public final OrderStatus d;
        public final String e;
        public final String f;
        public final String g;

        public OnCompactOrder(String str, String str2, String str3, OrderStatus orderStatus, String str4, String str5, String str6) {
            this.f20008a = str;
            this.b = str2;
            this.c = str3;
            this.d = orderStatus;
            this.e = str4;
            this.f = str5;
            this.g = str6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCompactOrder)) {
                return false;
            }
            OnCompactOrder onCompactOrder = (OnCompactOrder) obj;
            return Intrinsics.c(this.f20008a, onCompactOrder.f20008a) && Intrinsics.c(this.b, onCompactOrder.b) && Intrinsics.c(this.c, onCompactOrder.c) && this.d == onCompactOrder.d && Intrinsics.c(this.e, onCompactOrder.e) && Intrinsics.c(this.f, onCompactOrder.f) && Intrinsics.c(this.g, onCompactOrder.g);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f20008a.hashCode() * 31, 31, this.b), 31, this.c);
            OrderStatus orderStatus = this.d;
            return this.g.hashCode() + b.c(b.c((iC + (orderStatus == null ? 0 : orderStatus.hashCode())) * 31, 31, this.e), 31, this.f);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnCompactOrder(id=", this.f20008a, ", title=", this.b, ", subtitle=");
            sbV.append(this.c);
            sbV.append(", status=");
            sbV.append(this.d);
            sbV.append(", total=");
            androidx.constraintlayout.core.state.a.B(sbV, this.e, ", date=", this.f, ", iconUrl=");
            return a.o(sbV, this.g, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/MyOrdersQuery$OnDeliveryOrder;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnDeliveryOrder {

        /* renamed from: a, reason: collision with root package name */
        public final String f20009a;
        public final String b;
        public final String c;
        public final String d;
        public final OrderStatus e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final String j;
        public final String k;

        public OnDeliveryOrder(String str, String str2, String str3, String str4, OrderStatus orderStatus, String str5, String str6, String str7, String str8, String str9, String str10) {
            this.f20009a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = orderStatus;
            this.f = str5;
            this.g = str6;
            this.h = str7;
            this.i = str8;
            this.j = str9;
            this.k = str10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnDeliveryOrder)) {
                return false;
            }
            OnDeliveryOrder onDeliveryOrder = (OnDeliveryOrder) obj;
            return Intrinsics.c(this.f20009a, onDeliveryOrder.f20009a) && Intrinsics.c(this.b, onDeliveryOrder.b) && Intrinsics.c(this.c, onDeliveryOrder.c) && Intrinsics.c(this.d, onDeliveryOrder.d) && this.e == onDeliveryOrder.e && Intrinsics.c(this.f, onDeliveryOrder.f) && Intrinsics.c(this.g, onDeliveryOrder.g) && Intrinsics.c(this.h, onDeliveryOrder.h) && Intrinsics.c(this.i, onDeliveryOrder.i) && Intrinsics.c(this.j, onDeliveryOrder.j) && Intrinsics.c(this.k, onDeliveryOrder.k);
        }

        public final int hashCode() {
            int iC = b.c(b.c(b.c(this.f20009a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
            OrderStatus orderStatus = this.e;
            int iC2 = b.c(b.c(b.c(b.c((iC + (orderStatus == null ? 0 : orderStatus.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i);
            String str = this.j;
            int iHashCode = (iC2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.k;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnDeliveryOrder(id=", this.f20009a, ", title=", this.b, ", subtitle=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", date=", this.d, ", status=");
            sbV.append(this.e);
            sbV.append(", total=");
            sbV.append(this.f);
            sbV.append(", timeLabel=");
            androidx.constraintlayout.core.state.a.B(sbV, this.g, ", timeValue=", this.h, ", location=");
            androidx.constraintlayout.core.state.a.B(sbV, this.i, ", windowTime=", this.j, ", windowDate=");
            return a.o(sbV, this.k, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/MyOrdersQuery$OnPickUpOrder;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPickUpOrder {

        /* renamed from: a, reason: collision with root package name */
        public final String f20010a;
        public final String b;
        public final String c;
        public final String d;
        public final OrderStatus e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final String j;

        public OnPickUpOrder(String str, String str2, String str3, String str4, OrderStatus orderStatus, String str5, String str6, String str7, String str8, String str9) {
            this.f20010a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = orderStatus;
            this.f = str5;
            this.g = str6;
            this.h = str7;
            this.i = str8;
            this.j = str9;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPickUpOrder)) {
                return false;
            }
            OnPickUpOrder onPickUpOrder = (OnPickUpOrder) obj;
            return Intrinsics.c(this.f20010a, onPickUpOrder.f20010a) && Intrinsics.c(this.b, onPickUpOrder.b) && Intrinsics.c(this.c, onPickUpOrder.c) && Intrinsics.c(this.d, onPickUpOrder.d) && this.e == onPickUpOrder.e && Intrinsics.c(this.f, onPickUpOrder.f) && Intrinsics.c(this.g, onPickUpOrder.g) && Intrinsics.c(this.h, onPickUpOrder.h) && Intrinsics.c(this.i, onPickUpOrder.i) && Intrinsics.c(this.j, onPickUpOrder.j);
        }

        public final int hashCode() {
            int iC = b.c(b.c(b.c(this.f20010a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
            OrderStatus orderStatus = this.e;
            return this.j.hashCode() + b.c(b.c(b.c(b.c((iC + (orderStatus == null ? 0 : orderStatus.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnPickUpOrder(id=", this.f20010a, ", title=", this.b, ", subtitle=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", date=", this.d, ", status=");
            sbV.append(this.e);
            sbV.append(", total=");
            sbV.append(this.f);
            sbV.append(", timeLabel=");
            androidx.constraintlayout.core.state.a.B(sbV, this.g, ", timeValue=", this.h, ", actionPath=");
            return androidx.constraintlayout.core.state.a.l(sbV, this.i, ", actionTitle=", this.j, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/MyOrdersQuery$Orders;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Orders {

        /* renamed from: a, reason: collision with root package name */
        public final int f20011a;
        public final Integer b;
        public final List c;
        public final Message d;

        public Orders(int i, Integer num, List list, Message message) {
            this.f20011a = i;
            this.b = num;
            this.c = list;
            this.d = message;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Orders)) {
                return false;
            }
            Orders orders = (Orders) obj;
            return this.f20011a == orders.f20011a && Intrinsics.c(this.b, orders.b) && Intrinsics.c(this.c, orders.c) && Intrinsics.c(this.d, orders.d);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f20011a) * 31;
            Integer num = this.b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            List list = this.c;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            Message message = this.d;
            return iHashCode3 + (message != null ? message.hashCode() : 0);
        }

        public final String toString() {
            return "Orders(totalItemCount=" + this.f20011a + ", nextPage=" + this.b + ", feed=" + this.c + ", message=" + this.d + ")";
        }
    }

    public MyOrdersQuery(int i, OrderType orderType, boolean z) {
        this.f20004a = i;
        this.b = orderType;
        this.c = z;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(MyOrdersQuery_ResponseAdapter.Data.f20174a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query MyOrders($pageNumber: Int!, $orderType: OrderType!, $isOrdersHistoryEnabled: Boolean!) { orders(pageNumber: $pageNumber, orderType: $orderType) { totalItemCount nextPage feed { __typename ... on PickUpOrder { id title subtitle date status total timeLabel timeValue actionPath actionTitle } ... on DeliveryOrder { id title subtitle date status total timeLabel timeValue location windowTime windowDate } ... on CompactOrder @include(if: $isOrdersHistoryEnabled) { id title subtitle status total date iconUrl } } message { title message } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyOrdersQuery)) {
            return false;
        }
        MyOrdersQuery myOrdersQuery = (MyOrdersQuery) obj;
        return this.f20004a == myOrdersQuery.f20004a && this.b == myOrdersQuery.b && this.c == myOrdersQuery.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Integer.hashCode(this.f20004a) * 31)) * 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "1ebfde48ac8d8f56ed8cb6ddd7f452f613fee4ef6de48e11a35ee32f03586e06";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "MyOrders";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("pageNumber");
        d.y(this.f20004a, Adapters.b, jsonWriter, customScalarAdapters, "orderType");
        jsonWriter.v0(this.b.d);
        jsonWriter.F1("isOrdersHistoryEnabled");
        Adapters.f.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MyOrdersQuery(pageNumber=");
        sb.append(this.f20004a);
        sb.append(", orderType=");
        sb.append(this.b);
        sb.append(", isOrdersHistoryEnabled=");
        return a.k(")", sb, this.c);
    }
}
