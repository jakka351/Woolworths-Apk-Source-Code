package com.woolworths.feature.shop.myorders.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.BroadcastBannerType;
import au.com.woolworths.shop.graphql.type.OrderHelpItemType;
import au.com.woolworths.shop.graphql.type.OrderPaymentDetailsItemAmountStyle;
import au.com.woolworths.shop.graphql.type.OrderProductListProductPriceStyle;
import au.com.woolworths.shop.graphql.type.adapter.BroadcastBannerType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.OrderHelpItemType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.OrderPaymentDetailsItemAmountStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.OrderProductListProductPriceStyle_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.woolworths.feature.shop.myorders.GetYourGroceriesQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\bÇ\u0002\u0018\u00002\u00020\u0001:\u0018\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetYourGroceriesQuery_ResponseAdapter;", "", "Data", "OrderProductList", "Filter", "Item", "Feed", "OnOrderProductListProductCategory", "OnOrderProductListProduct", "Substitution", "OnOrderProductListFulfilmentStatus", "OnBroadcastBanner", "PaymentDetails", "Total", "SubTotal", "MarketSubtotal", "SavingsAndReward", "PaymentMethod", "Discount", "Refund", "RefundTotal", "HelpList", "Item1", "HelpItem", "ContactTimes", "ContactItem", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetYourGroceriesQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetYourGroceriesQuery_ResponseAdapter$ContactItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$ContactItem;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContactItem implements Adapter<GetYourGroceriesQuery.ContactItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final ContactItem f20150a = new ContactItem();
        public static final List b = CollectionsKt.R("day", "time");

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
                Assertions.a(reader, "day");
                throw null;
            }
            if (str2 != null) {
                return new GetYourGroceriesQuery.ContactItem(str, str2);
            }
            Assertions.a(reader, "time");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetYourGroceriesQuery.ContactItem value = (GetYourGroceriesQuery.ContactItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("day");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19980a);
            writer.F1("time");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetYourGroceriesQuery_ResponseAdapter$ContactTimes;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$ContactTimes;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContactTimes implements Adapter<GetYourGroceriesQuery.ContactTimes> {

        /* renamed from: a, reason: collision with root package name */
        public static final ContactTimes f20151a = new ContactTimes();
        public static final List b = CollectionsKt.R("title", "subTitle", "contactItems");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(ContactItem.f20150a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "subTitle");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new GetYourGroceriesQuery.ContactTimes(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, "contactItems");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetYourGroceriesQuery.ContactTimes value = (GetYourGroceriesQuery.ContactTimes) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19981a);
            writer.F1("subTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("contactItems");
            Adapters.a(Adapters.c(ContactItem.f20150a, false)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetYourGroceriesQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$Data;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<GetYourGroceriesQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20152a = new Data();
        public static final List b = CollectionsKt.Q("orderProductList");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            GetYourGroceriesQuery.OrderProductList orderProductList = null;
            while (reader.o2(b) == 0) {
                orderProductList = (GetYourGroceriesQuery.OrderProductList) Adapters.c(OrderProductList.f20165a, false).fromJson(reader, customScalarAdapters);
            }
            if (orderProductList != null) {
                return new GetYourGroceriesQuery.Data(orderProductList);
            }
            Assertions.a(reader, "orderProductList");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetYourGroceriesQuery.Data value = (GetYourGroceriesQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("orderProductList");
            Adapters.c(OrderProductList.f20165a, false).toJson(writer, customScalarAdapters, value.f19982a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetYourGroceriesQuery_ResponseAdapter$Discount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$Discount;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Discount implements Adapter<GetYourGroceriesQuery.Discount> {

        /* renamed from: a, reason: collision with root package name */
        public static final Discount f20153a = new Discount();
        public static final List b = CollectionsKt.R("title", "amount");

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
                return new GetYourGroceriesQuery.Discount(str, str2);
            }
            Assertions.a(reader, "amount");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetYourGroceriesQuery.Discount value = (GetYourGroceriesQuery.Discount) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19983a);
            writer.F1("amount");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetYourGroceriesQuery_ResponseAdapter$Feed;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$Feed;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Feed implements Adapter<GetYourGroceriesQuery.Feed> {

        /* renamed from: a, reason: collision with root package name */
        public static final Feed f20154a = new Feed();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            GetYourGroceriesQuery.OnOrderProductListProductCategory onOrderProductListProductCategoryA;
            GetYourGroceriesQuery.OnOrderProductListProduct onOrderProductListProductA;
            GetYourGroceriesQuery.OnOrderProductListFulfilmentStatus onOrderProductListFulfilmentStatusA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            GetYourGroceriesQuery.OnBroadcastBanner onBroadcastBannerA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("OrderProductListProductCategory"))) {
                reader.o();
                onOrderProductListProductCategoryA = OnOrderProductListProductCategory.a(reader, customScalarAdapters);
            } else {
                onOrderProductListProductCategoryA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("OrderProductListProduct"))) {
                reader.o();
                onOrderProductListProductA = OnOrderProductListProduct.a(reader, customScalarAdapters);
            } else {
                onOrderProductListProductA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("OrderProductListFulfilmentStatus"))) {
                reader.o();
                onOrderProductListFulfilmentStatusA = OnOrderProductListFulfilmentStatus.a(reader, customScalarAdapters);
            } else {
                onOrderProductListFulfilmentStatusA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("BroadcastBanner"))) {
                reader.o();
                onBroadcastBannerA = OnBroadcastBanner.a(reader, customScalarAdapters);
            }
            return new GetYourGroceriesQuery.Feed(str, onOrderProductListProductCategoryA, onOrderProductListProductA, onOrderProductListFulfilmentStatusA, onBroadcastBannerA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetYourGroceriesQuery.Feed value = (GetYourGroceriesQuery.Feed) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19984a);
            GetYourGroceriesQuery.OnOrderProductListProductCategory onOrderProductListProductCategory = value.b;
            if (onOrderProductListProductCategory != null) {
                OnOrderProductListProductCategory.b(writer, customScalarAdapters, onOrderProductListProductCategory);
            }
            GetYourGroceriesQuery.OnOrderProductListProduct onOrderProductListProduct = value.c;
            if (onOrderProductListProduct != null) {
                OnOrderProductListProduct.b(writer, customScalarAdapters, onOrderProductListProduct);
            }
            GetYourGroceriesQuery.OnOrderProductListFulfilmentStatus onOrderProductListFulfilmentStatus = value.d;
            if (onOrderProductListFulfilmentStatus != null) {
                OnOrderProductListFulfilmentStatus.b(writer, customScalarAdapters, onOrderProductListFulfilmentStatus);
            }
            GetYourGroceriesQuery.OnBroadcastBanner onBroadcastBanner = value.e;
            if (onBroadcastBanner != null) {
                OnBroadcastBanner.b(writer, customScalarAdapters, onBroadcastBanner);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetYourGroceriesQuery_ResponseAdapter$Filter;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$Filter;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Filter implements Adapter<GetYourGroceriesQuery.Filter> {

        /* renamed from: a, reason: collision with root package name */
        public static final Filter f20155a = new Filter();
        public static final List b = CollectionsKt.Q("items");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(b) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(Item.f20158a, false)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new GetYourGroceriesQuery.Filter(arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetYourGroceriesQuery.Filter value = (GetYourGroceriesQuery.Filter) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("items");
            Adapters.a(Adapters.c(Item.f20158a, false)).toJson(writer, customScalarAdapters, value.f19985a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetYourGroceriesQuery_ResponseAdapter$HelpItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$HelpItem;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HelpItem implements Adapter<GetYourGroceriesQuery.HelpItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final HelpItem f20156a = new HelpItem();
        public static final List b = CollectionsKt.R("iconUrl", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "url", "itemType");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            OrderHelpItemType orderHelpItemTypeA = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    orderHelpItemTypeA = OrderHelpItemType_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "iconUrl");
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
            if (orderHelpItemTypeA != null) {
                return new GetYourGroceriesQuery.HelpItem(str, str2, str3, str4, orderHelpItemTypeA);
            }
            Assertions.a(reader, "itemType");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetYourGroceriesQuery.HelpItem value = (GetYourGroceriesQuery.HelpItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("iconUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19986a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
            writer.F1("itemType");
            OrderHelpItemType_ResponseAdapter.b(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetYourGroceriesQuery_ResponseAdapter$HelpList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$HelpList;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HelpList implements Adapter<GetYourGroceriesQuery.HelpList> {

        /* renamed from: a, reason: collision with root package name */
        public static final HelpList f20157a = new HelpList();
        public static final List b = CollectionsKt.R("items", "imageUrl", "helpTitle", "helpItems", "contactTimes");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            String str = null;
            String str2 = null;
            List list = null;
            GetYourGroceriesQuery.ContactTimes contactTimes = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    arrayListFromJson = Adapters.a(Adapters.c(Item1.f20159a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    list = (List) Adapters.b(Adapters.a(Adapters.c(HelpItem.f20156a, false))).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    contactTimes = (GetYourGroceriesQuery.ContactTimes) Adapters.b(Adapters.c(ContactTimes.f20151a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new GetYourGroceriesQuery.HelpList(arrayListFromJson, str, str2, list, contactTimes);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetYourGroceriesQuery.HelpList value = (GetYourGroceriesQuery.HelpList) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("items");
            Adapters.a(Adapters.c(Item1.f20159a, false)).toJson(writer, customScalarAdapters, value.f19987a);
            writer.F1("imageUrl");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("helpTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("helpItems");
            Adapters.b(Adapters.a(Adapters.c(HelpItem.f20156a, false))).toJson(writer, customScalarAdapters, value.d);
            writer.F1("contactTimes");
            Adapters.b(Adapters.c(ContactTimes.f20151a, false)).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetYourGroceriesQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$Item;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<GetYourGroceriesQuery.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f20158a = new Item();
        public static final List b = CollectionsKt.R("key", "title", "isApplied", "count");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            Boolean bool = null;
            Integer num = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "key");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (bool == null) {
                Assertions.a(reader, "isApplied");
                throw null;
            }
            boolean zBooleanValue = bool.booleanValue();
            if (num != null) {
                return new GetYourGroceriesQuery.Item(str, num.intValue(), str2, zBooleanValue);
            }
            Assertions.a(reader, "count");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetYourGroceriesQuery.Item value = (GetYourGroceriesQuery.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("key");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19988a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("isApplied");
            d.B(value.c, Adapters.f, writer, customScalarAdapters, "count");
            Adapters.b.toJson(writer, customScalarAdapters, Integer.valueOf(value.d));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetYourGroceriesQuery_ResponseAdapter$Item1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$Item1;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item1 implements Adapter<GetYourGroceriesQuery.Item1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item1 f20159a = new Item1();
        public static final List b = CollectionsKt.R("iconUrl", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "url", "itemType");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            OrderHelpItemType orderHelpItemTypeA = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    orderHelpItemTypeA = OrderHelpItemType_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "iconUrl");
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
            if (orderHelpItemTypeA != null) {
                return new GetYourGroceriesQuery.Item1(str, str2, str3, str4, orderHelpItemTypeA);
            }
            Assertions.a(reader, "itemType");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetYourGroceriesQuery.Item1 value = (GetYourGroceriesQuery.Item1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("iconUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19989a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
            writer.F1("itemType");
            OrderHelpItemType_ResponseAdapter.b(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetYourGroceriesQuery_ResponseAdapter$MarketSubtotal;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$MarketSubtotal;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MarketSubtotal implements Adapter<GetYourGroceriesQuery.MarketSubtotal> {

        /* renamed from: a, reason: collision with root package name */
        public static final MarketSubtotal f20160a = new MarketSubtotal();
        public static final List b = CollectionsKt.R("title", "amount");

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
                return new GetYourGroceriesQuery.MarketSubtotal(str, str2);
            }
            Assertions.a(reader, "amount");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetYourGroceriesQuery.MarketSubtotal value = (GetYourGroceriesQuery.MarketSubtotal) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19990a);
            writer.F1("amount");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetYourGroceriesQuery_ResponseAdapter$OnBroadcastBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$OnBroadcastBanner;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnBroadcastBanner implements Adapter<GetYourGroceriesQuery.OnBroadcastBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20161a = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "deeplink", "type", "imageUrl", "actionLabel", "analyticsLabel", "dismissible", "bannerId");

        public static GetYourGroceriesQuery.OnBroadcastBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            BroadcastBannerType broadcastBannerTypeA = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            Boolean bool = null;
            String str7 = null;
            while (true) {
                switch (reader.o2(f20161a)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        broadcastBannerTypeA = BroadcastBannerType_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    case 4:
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str6 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        str7 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (broadcastBannerTypeA == null) {
                            Assertions.a(reader, "type");
                            throw null;
                        }
                        if (str4 != null) {
                            return new GetYourGroceriesQuery.OnBroadcastBanner(str, str2, str3, broadcastBannerTypeA, str4, str5, str6, bool, str7);
                        }
                        Assertions.a(reader, "imageUrl");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetYourGroceriesQuery.OnBroadcastBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19991a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("deeplink");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("type");
            BroadcastBannerType_ResponseAdapter.b(writer, customScalarAdapters, value.d);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("actionLabel");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
            writer.F1("analyticsLabel");
            nullableAdapter.toJson(writer, customScalarAdapters, value.g);
            writer.F1("dismissible");
            Adapters.l.toJson(writer, customScalarAdapters, value.h);
            writer.F1("bannerId");
            nullableAdapter.toJson(writer, customScalarAdapters, value.i);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (GetYourGroceriesQuery.OnBroadcastBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetYourGroceriesQuery_ResponseAdapter$OnOrderProductListFulfilmentStatus;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$OnOrderProductListFulfilmentStatus;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnOrderProductListFulfilmentStatus implements Adapter<GetYourGroceriesQuery.OnOrderProductListFulfilmentStatus> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20162a = CollectionsKt.R("title", "message");

        public static GetYourGroceriesQuery.OnOrderProductListFulfilmentStatus a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f20162a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new GetYourGroceriesQuery.OnOrderProductListFulfilmentStatus(str, str2);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetYourGroceriesQuery.OnOrderProductListFulfilmentStatus value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19992a);
            writer.F1("message");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (GetYourGroceriesQuery.OnOrderProductListFulfilmentStatus) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetYourGroceriesQuery_ResponseAdapter$OnOrderProductListProduct;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$OnOrderProductListProduct;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnOrderProductListProduct implements Adapter<GetYourGroceriesQuery.OnOrderProductListProduct> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20163a = CollectionsKt.R("productId", AppMeasurementSdk.ConditionalUserProperty.NAME, "productImage", "quantityTitle", "quantityValue", "priceLabel", "priceStyle", "substitutions");

        public static GetYourGroceriesQuery.OnOrderProductListProduct a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            OrderProductListProductPriceStyle orderProductListProductPriceStyleA = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                switch (reader.o2(f20163a)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str6 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        orderProductListProductPriceStyleA = OrderProductListProductPriceStyle_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    case 7:
                        arrayListFromJson = Adapters.a(Adapters.c(Substitution.f20172a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "productId");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, AppMeasurementSdk.ConditionalUserProperty.NAME);
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "quantityTitle");
                            throw null;
                        }
                        if (str5 == null) {
                            Assertions.a(reader, "quantityValue");
                            throw null;
                        }
                        if (str6 == null) {
                            Assertions.a(reader, "priceLabel");
                            throw null;
                        }
                        if (orderProductListProductPriceStyleA == null) {
                            Assertions.a(reader, "priceStyle");
                            throw null;
                        }
                        if (arrayListFromJson != null) {
                            return new GetYourGroceriesQuery.OnOrderProductListProduct(str, str2, str3, str4, str5, str6, orderProductListProductPriceStyleA, arrayListFromJson);
                        }
                        Assertions.a(reader, "substitutions");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetYourGroceriesQuery.OnOrderProductListProduct value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productId");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19993a);
            writer.F1(AppMeasurementSdk.ConditionalUserProperty.NAME);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("productImage");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1("quantityTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("quantityValue");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("priceLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1("priceStyle");
            writer.v0(value.g.d);
            writer.F1("substitutions");
            Adapters.a(Adapters.c(Substitution.f20172a, false)).toJson(writer, customScalarAdapters, value.h);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (GetYourGroceriesQuery.OnOrderProductListProduct) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetYourGroceriesQuery_ResponseAdapter$OnOrderProductListProductCategory;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$OnOrderProductListProductCategory;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnOrderProductListProductCategory implements Adapter<GetYourGroceriesQuery.OnOrderProductListProductCategory> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20164a = CollectionsKt.Q("title");

        public static GetYourGroceriesQuery.OnOrderProductListProductCategory a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f20164a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new GetYourGroceriesQuery.OnOrderProductListProductCategory(str);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetYourGroceriesQuery.OnOrderProductListProductCategory value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19994a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (GetYourGroceriesQuery.OnOrderProductListProductCategory) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetYourGroceriesQuery_ResponseAdapter$OrderProductList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$OrderProductList;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OrderProductList implements Adapter<GetYourGroceriesQuery.OrderProductList> {

        /* renamed from: a, reason: collision with root package name */
        public static final OrderProductList f20165a = new OrderProductList();
        public static final List b = CollectionsKt.R("filter", "feed", "countLabel", "totalLabel", "totalValue", "paymentDetails", "helpList");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            GetYourGroceriesQuery.Filter filter = null;
            ArrayList arrayListFromJson = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            GetYourGroceriesQuery.PaymentDetails paymentDetails = null;
            GetYourGroceriesQuery.HelpList helpList = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        filter = (GetYourGroceriesQuery.Filter) Adapters.b(Adapters.c(Filter.f20155a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        arrayListFromJson = Adapters.a(Adapters.b(Adapters.c(Feed.f20154a, true))).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        paymentDetails = (GetYourGroceriesQuery.PaymentDetails) Adapters.c(PaymentDetails.f20166a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        helpList = (GetYourGroceriesQuery.HelpList) Adapters.b(Adapters.c(HelpList.f20157a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (arrayListFromJson == null) {
                            Assertions.a(reader, "feed");
                            throw null;
                        }
                        if (str == null) {
                            Assertions.a(reader, "countLabel");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "totalLabel");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "totalValue");
                            throw null;
                        }
                        if (paymentDetails != null) {
                            return new GetYourGroceriesQuery.OrderProductList(filter, arrayListFromJson, str, str2, str3, paymentDetails, helpList);
                        }
                        Assertions.a(reader, "paymentDetails");
                        throw null;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetYourGroceriesQuery.OrderProductList value = (GetYourGroceriesQuery.OrderProductList) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("filter");
            Adapters.b(Adapters.c(Filter.f20155a, false)).toJson(writer, customScalarAdapters, value.f19995a);
            writer.F1("feed");
            Adapters.a(Adapters.b(Adapters.c(Feed.f20154a, true))).toJson(writer, customScalarAdapters, value.b);
            writer.F1("countLabel");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("totalLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("totalValue");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("paymentDetails");
            Adapters.c(PaymentDetails.f20166a, false).toJson(writer, customScalarAdapters, value.f);
            writer.F1("helpList");
            Adapters.b(Adapters.c(HelpList.f20157a, false)).toJson(writer, customScalarAdapters, value.g);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetYourGroceriesQuery_ResponseAdapter$PaymentDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$PaymentDetails;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PaymentDetails implements Adapter<GetYourGroceriesQuery.PaymentDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final PaymentDetails f20166a = new PaymentDetails();
        public static final List b = CollectionsKt.R("total", "subTotal", "marketSubtotal", "savingsAndRewards", "paymentMethods", "discounts", "refunds", "refundTotal", "disclaimer");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            ArrayList arrayListFromJson2 = null;
            ArrayList arrayListFromJson3 = null;
            ArrayList arrayListFromJson4 = null;
            ArrayList arrayListFromJson5 = null;
            ArrayList arrayListFromJson6 = null;
            ArrayList arrayListFromJson7 = null;
            ArrayList arrayListFromJson8 = null;
            String str = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        arrayListFromJson = Adapters.a(Adapters.c(Total.f20173a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        arrayListFromJson2 = Adapters.a(Adapters.b(Adapters.c(SubTotal.f20171a, false))).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        arrayListFromJson3 = Adapters.a(Adapters.b(Adapters.c(MarketSubtotal.f20160a, false))).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        arrayListFromJson4 = Adapters.a(Adapters.b(Adapters.c(SavingsAndReward.f20170a, false))).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        arrayListFromJson5 = Adapters.a(Adapters.c(PaymentMethod.f20167a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        arrayListFromJson6 = Adapters.a(Adapters.b(Adapters.c(Discount.f20153a, false))).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        arrayListFromJson7 = Adapters.a(Adapters.b(Adapters.c(Refund.f20168a, false))).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        arrayListFromJson8 = Adapters.a(Adapters.b(Adapters.c(RefundTotal.f20169a, false))).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (arrayListFromJson == null) {
                            Assertions.a(reader, "total");
                            throw null;
                        }
                        if (arrayListFromJson2 == null) {
                            Assertions.a(reader, "subTotal");
                            throw null;
                        }
                        if (arrayListFromJson3 == null) {
                            Assertions.a(reader, "marketSubtotal");
                            throw null;
                        }
                        if (arrayListFromJson4 == null) {
                            Assertions.a(reader, "savingsAndRewards");
                            throw null;
                        }
                        if (arrayListFromJson5 == null) {
                            Assertions.a(reader, "paymentMethods");
                            throw null;
                        }
                        if (arrayListFromJson6 == null) {
                            Assertions.a(reader, "discounts");
                            throw null;
                        }
                        if (arrayListFromJson7 == null) {
                            Assertions.a(reader, "refunds");
                            throw null;
                        }
                        if (arrayListFromJson8 != null) {
                            return new GetYourGroceriesQuery.PaymentDetails(arrayListFromJson, arrayListFromJson2, arrayListFromJson3, arrayListFromJson4, arrayListFromJson5, arrayListFromJson6, arrayListFromJson7, arrayListFromJson8, str);
                        }
                        Assertions.a(reader, "refundTotal");
                        throw null;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetYourGroceriesQuery.PaymentDetails value = (GetYourGroceriesQuery.PaymentDetails) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("total");
            Adapters.a(Adapters.c(Total.f20173a, false)).toJson(writer, customScalarAdapters, value.f19996a);
            writer.F1("subTotal");
            Adapters.a(Adapters.b(Adapters.c(SubTotal.f20171a, false))).toJson(writer, customScalarAdapters, value.b);
            writer.F1("marketSubtotal");
            Adapters.a(Adapters.b(Adapters.c(MarketSubtotal.f20160a, false))).toJson(writer, customScalarAdapters, value.c);
            writer.F1("savingsAndRewards");
            Adapters.a(Adapters.b(Adapters.c(SavingsAndReward.f20170a, false))).toJson(writer, customScalarAdapters, value.d);
            writer.F1("paymentMethods");
            Adapters.a(Adapters.c(PaymentMethod.f20167a, false)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("discounts");
            Adapters.a(Adapters.b(Adapters.c(Discount.f20153a, false))).toJson(writer, customScalarAdapters, value.f);
            writer.F1("refunds");
            Adapters.a(Adapters.b(Adapters.c(Refund.f20168a, false))).toJson(writer, customScalarAdapters, value.g);
            writer.F1("refundTotal");
            Adapters.a(Adapters.b(Adapters.c(RefundTotal.f20169a, false))).toJson(writer, customScalarAdapters, value.h);
            writer.F1("disclaimer");
            Adapters.i.toJson(writer, customScalarAdapters, value.i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetYourGroceriesQuery_ResponseAdapter$PaymentMethod;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$PaymentMethod;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PaymentMethod implements Adapter<GetYourGroceriesQuery.PaymentMethod> {

        /* renamed from: a, reason: collision with root package name */
        public static final PaymentMethod f20167a = new PaymentMethod();
        public static final List b = CollectionsKt.R("title", BarcodePickDeserializer.FIELD_ICON, "amount");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 != null) {
                return new GetYourGroceriesQuery.PaymentMethod(str, str2, str3);
            }
            Assertions.a(reader, "amount");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetYourGroceriesQuery.PaymentMethod value = (GetYourGroceriesQuery.PaymentMethod) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19997a);
            writer.F1(BarcodePickDeserializer.FIELD_ICON);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("amount");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetYourGroceriesQuery_ResponseAdapter$Refund;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$Refund;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Refund implements Adapter<GetYourGroceriesQuery.Refund> {

        /* renamed from: a, reason: collision with root package name */
        public static final Refund f20168a = new Refund();
        public static final List b = CollectionsKt.R("amount", "amountStyle", "title");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            OrderPaymentDetailsItemAmountStyle orderPaymentDetailsItemAmountStyle = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    orderPaymentDetailsItemAmountStyle = (OrderPaymentDetailsItemAmountStyle) Adapters.b(OrderPaymentDetailsItemAmountStyle_ResponseAdapter.f12091a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "amount");
                throw null;
            }
            if (str2 != null) {
                return new GetYourGroceriesQuery.Refund(str, orderPaymentDetailsItemAmountStyle, str2);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetYourGroceriesQuery.Refund value = (GetYourGroceriesQuery.Refund) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("amount");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19998a);
            writer.F1("amountStyle");
            Adapters.b(OrderPaymentDetailsItemAmountStyle_ResponseAdapter.f12091a).toJson(writer, customScalarAdapters, value.b);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetYourGroceriesQuery_ResponseAdapter$RefundTotal;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$RefundTotal;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RefundTotal implements Adapter<GetYourGroceriesQuery.RefundTotal> {

        /* renamed from: a, reason: collision with root package name */
        public static final RefundTotal f20169a = new RefundTotal();
        public static final List b = CollectionsKt.R("amount", "amountStyle", "title");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            OrderPaymentDetailsItemAmountStyle orderPaymentDetailsItemAmountStyle = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    orderPaymentDetailsItemAmountStyle = (OrderPaymentDetailsItemAmountStyle) Adapters.b(OrderPaymentDetailsItemAmountStyle_ResponseAdapter.f12091a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "amount");
                throw null;
            }
            if (str2 != null) {
                return new GetYourGroceriesQuery.RefundTotal(str, orderPaymentDetailsItemAmountStyle, str2);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetYourGroceriesQuery.RefundTotal value = (GetYourGroceriesQuery.RefundTotal) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("amount");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19999a);
            writer.F1("amountStyle");
            Adapters.b(OrderPaymentDetailsItemAmountStyle_ResponseAdapter.f12091a).toJson(writer, customScalarAdapters, value.b);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetYourGroceriesQuery_ResponseAdapter$SavingsAndReward;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$SavingsAndReward;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SavingsAndReward implements Adapter<GetYourGroceriesQuery.SavingsAndReward> {

        /* renamed from: a, reason: collision with root package name */
        public static final SavingsAndReward f20170a = new SavingsAndReward();
        public static final List b = CollectionsKt.R("title", "amount", "amountIcon", "amountStyle");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            OrderPaymentDetailsItemAmountStyle orderPaymentDetailsItemAmountStyle = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    orderPaymentDetailsItemAmountStyle = (OrderPaymentDetailsItemAmountStyle) Adapters.b(OrderPaymentDetailsItemAmountStyle_ResponseAdapter.f12091a).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 != null) {
                return new GetYourGroceriesQuery.SavingsAndReward(str, str2, str3, orderPaymentDetailsItemAmountStyle);
            }
            Assertions.a(reader, "amount");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetYourGroceriesQuery.SavingsAndReward value = (GetYourGroceriesQuery.SavingsAndReward) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20000a);
            writer.F1("amount");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("amountIcon");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1("amountStyle");
            Adapters.b(OrderPaymentDetailsItemAmountStyle_ResponseAdapter.f12091a).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetYourGroceriesQuery_ResponseAdapter$SubTotal;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$SubTotal;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SubTotal implements Adapter<GetYourGroceriesQuery.SubTotal> {

        /* renamed from: a, reason: collision with root package name */
        public static final SubTotal f20171a = new SubTotal();
        public static final List b = CollectionsKt.R("title", "amount");

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
                return new GetYourGroceriesQuery.SubTotal(str, str2);
            }
            Assertions.a(reader, "amount");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetYourGroceriesQuery.SubTotal value = (GetYourGroceriesQuery.SubTotal) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20001a);
            writer.F1("amount");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetYourGroceriesQuery_ResponseAdapter$Substitution;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$Substitution;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Substitution implements Adapter<GetYourGroceriesQuery.Substitution> {

        /* renamed from: a, reason: collision with root package name */
        public static final Substitution f20172a = new Substitution();
        public static final List b = CollectionsKt.R("productId", "productImage", "title", "priceLabel", "priceMatched", "productName", "productLabel", "priceMatchedLabel", "quantityTitle", "quantityValue", "showRating");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Boolean bool3 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        bool = bool2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bool = bool2;
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        bool = bool2;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool = bool2;
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 5:
                        bool = bool2;
                        str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = bool2;
                        str6 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        bool = bool2;
                        str7 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        bool = bool2;
                        str8 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        bool = bool2;
                        str9 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        bool = bool2;
                        bool3 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Boolean bool4 = bool2;
                        if (str == null) {
                            Assertions.a(reader, "productId");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "priceLabel");
                            throw null;
                        }
                        if (bool4 == null) {
                            Assertions.a(reader, "priceMatched");
                            throw null;
                        }
                        Boolean bool5 = bool3;
                        boolean zBooleanValue = bool4.booleanValue();
                        if (str5 == null) {
                            Assertions.a(reader, "productName");
                            throw null;
                        }
                        if (str6 == null) {
                            Assertions.a(reader, "productLabel");
                            throw null;
                        }
                        if (str7 == null) {
                            Assertions.a(reader, "priceMatchedLabel");
                            throw null;
                        }
                        if (str8 == null) {
                            Assertions.a(reader, "quantityTitle");
                            throw null;
                        }
                        if (str9 == null) {
                            Assertions.a(reader, "quantityValue");
                            throw null;
                        }
                        if (bool5 != null) {
                            return new GetYourGroceriesQuery.Substitution(str, str2, str3, str4, zBooleanValue, str5, str6, str7, str8, str9, bool5.booleanValue());
                        }
                        Assertions.a(reader, "showRating");
                        throw null;
                }
                bool2 = bool;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetYourGroceriesQuery.Substitution value = (GetYourGroceriesQuery.Substitution) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productId");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20002a);
            writer.F1("productImage");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("priceLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("priceMatched");
            Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
            d.B(value.e, adapters$BooleanAdapter$1, writer, customScalarAdapters, "productName");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1("productLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.g);
            writer.F1("priceMatchedLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.h);
            writer.F1("quantityTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.i);
            writer.F1("quantityValue");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.j);
            writer.F1("showRating");
            adapters$BooleanAdapter$1.toJson(writer, customScalarAdapters, Boolean.valueOf(value.k));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetYourGroceriesQuery_ResponseAdapter$Total;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$Total;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Total implements Adapter<GetYourGroceriesQuery.Total> {

        /* renamed from: a, reason: collision with root package name */
        public static final Total f20173a = new Total();
        public static final List b = CollectionsKt.R("title", "amount");

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
                return new GetYourGroceriesQuery.Total(str, str2);
            }
            Assertions.a(reader, "amount");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetYourGroceriesQuery.Total value = (GetYourGroceriesQuery.Total) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20003a);
            writer.F1("amount");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }
}
