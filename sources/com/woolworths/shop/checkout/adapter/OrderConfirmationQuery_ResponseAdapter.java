package com.woolworths.shop.checkout.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.graphql.TealiumAnalytics;
import au.com.woolworths.android.onesite.graphql.GoogleAdCustomTargeting;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.AdBannerNativeSize;
import au.com.woolworths.shop.graphql.type.BroadcastBannerType;
import au.com.woolworths.shop.graphql.type.CardHeight;
import au.com.woolworths.shop.graphql.type.CheckoutSummaryValueType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.adapter.AdBannerNativeSize_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.BroadcastBannerType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CardHeight_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CheckoutSummaryValueType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerDisplayType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.Adapters$DoubleAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpression;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.woolworths.shop.checkout.OrderConfirmationQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\bÇ\u0002\u0018\u00002\u00020\u0001:\u001b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/OrderConfirmationQuery_ResponseAdapter;", "", "Data", "OrderConfirmation", "Content", "OnOrderConfirmationBannerImage", "OnOrderConfirmationHeader", "Order", "OnCheckoutOrderAddresses", "AddressSection", "OnCheckoutOrderGroceryAddress", "OnCheckoutOrderMarketAddress", "SellerInfo", "InsetBanner", "OnCheckoutOrderSummary", "Section", "Message", "OnIconTextBanner", "OnOrderConfirmationFooterText", "OnActionableCard", "OnGoogleAdBannerCard", "OnUniversalInventoryContainer", "GoogleAdBannerCard", "NextBestAction", "OnActionableCard1", "OnOrderConfirmationCMOBroadcastBanner", "Banner", "OrderInfo", "ProductsInfo", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OrderConfirmationQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/OrderConfirmationQuery_ResponseAdapter$AddressSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/OrderConfirmationQuery$AddressSection;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AddressSection implements Adapter<OrderConfirmationQuery.AddressSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final AddressSection f21981a = new AddressSection();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            OrderConfirmationQuery.OnCheckoutOrderGroceryAddress onCheckoutOrderGroceryAddressA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            OrderConfirmationQuery.OnCheckoutOrderMarketAddress onCheckoutOrderMarketAddressA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CheckoutOrderGroceryAddress"))) {
                reader.o();
                onCheckoutOrderGroceryAddressA = OnCheckoutOrderGroceryAddress.a(reader, customScalarAdapters);
            } else {
                onCheckoutOrderGroceryAddressA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CheckoutOrderMarketAddress"))) {
                reader.o();
                onCheckoutOrderMarketAddressA = OnCheckoutOrderMarketAddress.a(reader, customScalarAdapters);
            }
            return new OrderConfirmationQuery.AddressSection(str, onCheckoutOrderGroceryAddressA, onCheckoutOrderMarketAddressA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OrderConfirmationQuery.AddressSection value = (OrderConfirmationQuery.AddressSection) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21845a);
            OrderConfirmationQuery.OnCheckoutOrderGroceryAddress onCheckoutOrderGroceryAddress = value.b;
            if (onCheckoutOrderGroceryAddress != null) {
                OnCheckoutOrderGroceryAddress.b(writer, customScalarAdapters, onCheckoutOrderGroceryAddress);
            }
            OrderConfirmationQuery.OnCheckoutOrderMarketAddress onCheckoutOrderMarketAddress = value.c;
            if (onCheckoutOrderMarketAddress != null) {
                OnCheckoutOrderMarketAddress.b(writer, customScalarAdapters, onCheckoutOrderMarketAddress);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/OrderConfirmationQuery_ResponseAdapter$Banner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/OrderConfirmationQuery$Banner;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Banner implements Adapter<OrderConfirmationQuery.Banner> {

        /* renamed from: a, reason: collision with root package name */
        public static final Banner f21982a = new Banner();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "type", "imageUrl", "analyticsLabel", "bannerId", "dismissible");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            BroadcastBannerType broadcastBannerTypeA = null;
            Boolean bool = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        broadcastBannerTypeA = BroadcastBannerType_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    case 3:
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
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
                        if (str3 != null) {
                            return new OrderConfirmationQuery.Banner(broadcastBannerTypeA, bool, str, str2, str3, str4, str5);
                        }
                        Assertions.a(reader, "imageUrl");
                        throw null;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OrderConfirmationQuery.Banner value = (OrderConfirmationQuery.Banner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21846a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("type");
            BroadcastBannerType_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("analyticsLabel");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("bannerId");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
            writer.F1("dismissible");
            Adapters.l.toJson(writer, customScalarAdapters, value.g);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/OrderConfirmationQuery_ResponseAdapter$Content;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/OrderConfirmationQuery$Content;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Content implements Adapter<OrderConfirmationQuery.Content> {

        /* renamed from: a, reason: collision with root package name */
        public static final Content f21983a = new Content();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            OrderConfirmationQuery.OnOrderConfirmationBannerImage onOrderConfirmationBannerImageA;
            OrderConfirmationQuery.OnOrderConfirmationHeader onOrderConfirmationHeaderA;
            OrderConfirmationQuery.OnCheckoutOrderAddresses onCheckoutOrderAddressesA;
            OrderConfirmationQuery.OnCheckoutOrderSummary onCheckoutOrderSummaryA;
            OrderConfirmationQuery.OnIconTextBanner onIconTextBannerA;
            OrderConfirmationQuery.OnOrderConfirmationFooterText onOrderConfirmationFooterTextA;
            OrderConfirmationQuery.OnActionableCard onActionableCardA;
            OrderConfirmationQuery.OnGoogleAdBannerCard onGoogleAdBannerCardA;
            OrderConfirmationQuery.OnUniversalInventoryContainer onUniversalInventoryContainerA;
            OrderConfirmationQuery.OnOrderConfirmationCMOBroadcastBanner onOrderConfirmationCMOBroadcastBannerA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("OrderConfirmationBannerImage"))) {
                reader.o();
                onOrderConfirmationBannerImageA = OnOrderConfirmationBannerImage.a(reader, customScalarAdapters);
            } else {
                onOrderConfirmationBannerImageA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("OrderConfirmationHeader"))) {
                reader.o();
                onOrderConfirmationHeaderA = OnOrderConfirmationHeader.a(reader, customScalarAdapters);
            } else {
                onOrderConfirmationHeaderA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CheckoutOrderAddresses"))) {
                reader.o();
                onCheckoutOrderAddressesA = OnCheckoutOrderAddresses.a(reader, customScalarAdapters);
            } else {
                onCheckoutOrderAddressesA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CheckoutOrderSummary"))) {
                reader.o();
                onCheckoutOrderSummaryA = OnCheckoutOrderSummary.a(reader, customScalarAdapters);
            } else {
                onCheckoutOrderSummaryA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("IconTextBanner"))) {
                reader.o();
                onIconTextBannerA = OnIconTextBanner.a(reader, customScalarAdapters);
            } else {
                onIconTextBannerA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("OrderConfirmationFooterText"))) {
                reader.o();
                onOrderConfirmationFooterTextA = OnOrderConfirmationFooterText.a(reader, customScalarAdapters);
            } else {
                onOrderConfirmationFooterTextA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ActionableCard"))) {
                reader.o();
                onActionableCardA = OnActionableCard.a(reader, customScalarAdapters);
            } else {
                onActionableCardA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("GoogleAdBannerCard"), new BooleanExpression.Not(BooleanExpressions.d("includeUniversalInventoryFallback"))))) {
                reader.o();
                onGoogleAdBannerCardA = OnGoogleAdBannerCard.a(reader, customScalarAdapters);
            } else {
                onGoogleAdBannerCardA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("UniversalInventoryContainer"), BooleanExpressions.d("includeUniversalInventoryFallback")))) {
                reader.o();
                onUniversalInventoryContainerA = OnUniversalInventoryContainer.a(reader, customScalarAdapters);
            } else {
                onUniversalInventoryContainerA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("OrderConfirmationCMOBroadcastBanner"), BooleanExpressions.d("includeCmoBanner")))) {
                reader.o();
                onOrderConfirmationCMOBroadcastBannerA = OnOrderConfirmationCMOBroadcastBanner.a(reader, customScalarAdapters);
            } else {
                onOrderConfirmationCMOBroadcastBannerA = null;
            }
            return new OrderConfirmationQuery.Content(str, onOrderConfirmationBannerImageA, onOrderConfirmationHeaderA, onCheckoutOrderAddressesA, onCheckoutOrderSummaryA, onIconTextBannerA, onOrderConfirmationFooterTextA, onActionableCardA, onGoogleAdBannerCardA, onUniversalInventoryContainerA, onOrderConfirmationCMOBroadcastBannerA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OrderConfirmationQuery.Content value = (OrderConfirmationQuery.Content) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21847a);
            OrderConfirmationQuery.OnOrderConfirmationBannerImage onOrderConfirmationBannerImage = value.b;
            if (onOrderConfirmationBannerImage != null) {
                OnOrderConfirmationBannerImage.b(writer, customScalarAdapters, onOrderConfirmationBannerImage);
            }
            OrderConfirmationQuery.OnOrderConfirmationHeader onOrderConfirmationHeader = value.c;
            if (onOrderConfirmationHeader != null) {
                OnOrderConfirmationHeader.b(writer, customScalarAdapters, onOrderConfirmationHeader);
            }
            OrderConfirmationQuery.OnCheckoutOrderAddresses onCheckoutOrderAddresses = value.d;
            if (onCheckoutOrderAddresses != null) {
                OnCheckoutOrderAddresses.b(writer, customScalarAdapters, onCheckoutOrderAddresses);
            }
            OrderConfirmationQuery.OnCheckoutOrderSummary onCheckoutOrderSummary = value.e;
            if (onCheckoutOrderSummary != null) {
                OnCheckoutOrderSummary.b(writer, customScalarAdapters, onCheckoutOrderSummary);
            }
            OrderConfirmationQuery.OnIconTextBanner onIconTextBanner = value.f;
            if (onIconTextBanner != null) {
                OnIconTextBanner.b(writer, customScalarAdapters, onIconTextBanner);
            }
            OrderConfirmationQuery.OnOrderConfirmationFooterText onOrderConfirmationFooterText = value.g;
            if (onOrderConfirmationFooterText != null) {
                OnOrderConfirmationFooterText.b(writer, customScalarAdapters, onOrderConfirmationFooterText);
            }
            OrderConfirmationQuery.OnActionableCard onActionableCard = value.h;
            if (onActionableCard != null) {
                OnActionableCard.b(writer, customScalarAdapters, onActionableCard);
            }
            OrderConfirmationQuery.OnGoogleAdBannerCard onGoogleAdBannerCard = value.i;
            if (onGoogleAdBannerCard != null) {
                OnGoogleAdBannerCard.b(writer, customScalarAdapters, onGoogleAdBannerCard);
            }
            OrderConfirmationQuery.OnUniversalInventoryContainer onUniversalInventoryContainer = value.j;
            if (onUniversalInventoryContainer != null) {
                OnUniversalInventoryContainer.b(writer, customScalarAdapters, onUniversalInventoryContainer);
            }
            OrderConfirmationQuery.OnOrderConfirmationCMOBroadcastBanner onOrderConfirmationCMOBroadcastBanner = value.k;
            if (onOrderConfirmationCMOBroadcastBanner != null) {
                OnOrderConfirmationCMOBroadcastBanner.b(writer, customScalarAdapters, onOrderConfirmationCMOBroadcastBanner);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/OrderConfirmationQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/OrderConfirmationQuery$Data;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<OrderConfirmationQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f21984a = new Data();
        public static final List b = CollectionsKt.Q("orderConfirmation");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            OrderConfirmationQuery.OrderConfirmation orderConfirmation = null;
            while (reader.o2(b) == 0) {
                orderConfirmation = (OrderConfirmationQuery.OrderConfirmation) Adapters.b(Adapters.c(OrderConfirmation.f22003a, false)).fromJson(reader, customScalarAdapters);
            }
            return new OrderConfirmationQuery.Data(orderConfirmation);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OrderConfirmationQuery.Data value = (OrderConfirmationQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("orderConfirmation");
            Adapters.b(Adapters.c(OrderConfirmation.f22003a, false)).toJson(writer, customScalarAdapters, value.f21848a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/OrderConfirmationQuery_ResponseAdapter$GoogleAdBannerCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/OrderConfirmationQuery$GoogleAdBannerCard;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GoogleAdBannerCard implements Adapter<OrderConfirmationQuery.GoogleAdBannerCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final GoogleAdBannerCard f21985a = new GoogleAdBannerCard();
        public static final List b = CollectionsKt.R("__typename", OutOfContextTestingActivity.AD_UNIT_KEY, "nativeCustomTemplateId", "iabSpec", "iabSize", "height", "targeting", "correlator", "_excluded");

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
            AdBannerNativeSize adBannerNativeSizeA = null;
            GoogleAdCustomTargeting googleAdCustomTargeting = null;
            String str5 = null;
            Boolean bool3 = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        bool = bool2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bool = bool2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        bool = bool2;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 4:
                        bool = bool2;
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        adBannerNativeSizeA = AdBannerNativeSize_ResponseAdapter.a(reader, customScalarAdapters);
                        continue;
                    case 6:
                        bool = bool2;
                        googleAdCustomTargeting = (GoogleAdCustomTargeting) d.k(customScalarAdapters, au.com.woolworths.shop.graphql.type.GoogleAdCustomTargeting.f11436a, reader, customScalarAdapters);
                        break;
                    case 7:
                        bool = bool2;
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        bool = bool2;
                        bool3 = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Boolean bool4 = bool2;
                        if (str == null) {
                            Assertions.a(reader, "__typename");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, OutOfContextTestingActivity.AD_UNIT_KEY);
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "nativeCustomTemplateId");
                            throw null;
                        }
                        if (bool4 == null) {
                            Assertions.a(reader, "iabSpec");
                            throw null;
                        }
                        boolean zBooleanValue = bool4.booleanValue();
                        if (adBannerNativeSizeA != null) {
                            return new OrderConfirmationQuery.GoogleAdBannerCard(str, str2, str3, zBooleanValue, str4, adBannerNativeSizeA, googleAdCustomTargeting, str5, bool3);
                        }
                        Assertions.a(reader, "height");
                        throw null;
                }
                bool2 = bool;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OrderConfirmationQuery.GoogleAdBannerCard value = (OrderConfirmationQuery.GoogleAdBannerCard) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21849a);
            writer.F1(OutOfContextTestingActivity.AD_UNIT_KEY);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("nativeCustomTemplateId");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("iabSpec");
            d.B(value.d, Adapters.f, writer, customScalarAdapters, "iabSize");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("height");
            AdBannerNativeSize_ResponseAdapter.b(writer, customScalarAdapters, value.f);
            writer.F1("targeting");
            Adapters.b(customScalarAdapters.e(au.com.woolworths.shop.graphql.type.GoogleAdCustomTargeting.f11436a)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("correlator");
            nullableAdapter.toJson(writer, customScalarAdapters, value.h);
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/OrderConfirmationQuery_ResponseAdapter$InsetBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/OrderConfirmationQuery$InsetBanner;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InsetBanner implements Adapter<OrderConfirmationQuery.InsetBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final InsetBanner f21986a = new InsetBanner();
        public static final List b = CollectionsKt.R("displayType", "message");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    insetBannerDisplayTypeA = InsetBannerDisplayType_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerDisplayTypeA == null) {
                Assertions.a(reader, "displayType");
                throw null;
            }
            if (str != null) {
                return new OrderConfirmationQuery.InsetBanner(insetBannerDisplayTypeA, str);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OrderConfirmationQuery.InsetBanner value = (OrderConfirmationQuery.InsetBanner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.f21850a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/OrderConfirmationQuery_ResponseAdapter$Message;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/OrderConfirmationQuery$Message;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Message implements Adapter<OrderConfirmationQuery.Message> {

        /* renamed from: a, reason: collision with root package name */
        public static final Message f21987a = new Message();
        public static final List b = CollectionsKt.R("title", "body");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new OrderConfirmationQuery.Message(str, str2);
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OrderConfirmationQuery.Message value = (OrderConfirmationQuery.Message) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f21851a);
            writer.F1("body");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/OrderConfirmationQuery_ResponseAdapter$NextBestAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/OrderConfirmationQuery$NextBestAction;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NextBestAction implements Adapter<OrderConfirmationQuery.NextBestAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final NextBestAction f21988a = new NextBestAction();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            OrderConfirmationQuery.OnActionableCard1 onActionableCard1A = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("ActionableCard"))) {
                reader.o();
                onActionableCard1A = OnActionableCard1.a(reader, customScalarAdapters);
            }
            return new OrderConfirmationQuery.NextBestAction(str, onActionableCard1A);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OrderConfirmationQuery.NextBestAction value = (OrderConfirmationQuery.NextBestAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21852a);
            OrderConfirmationQuery.OnActionableCard1 onActionableCard1 = value.b;
            if (onActionableCard1 != null) {
                OnActionableCard1.b(writer, customScalarAdapters, onActionableCard1);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/OrderConfirmationQuery_ResponseAdapter$OnActionableCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/OrderConfirmationQuery$OnActionableCard;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnActionableCard implements Adapter<OrderConfirmationQuery.OnActionableCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21989a = CollectionsKt.R("__typename", "link", "image", "altText", "cardHeight", "analytics", "_excluded");

        public static OrderConfirmationQuery.OnActionableCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            CardHeight cardHeightA = null;
            TealiumAnalytics tealiumAnalytics = null;
            Boolean bool = null;
            while (true) {
                switch (reader.o2(f21989a)) {
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
                        cardHeightA = CardHeight_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    case 5:
                        tealiumAnalytics = (TealiumAnalytics) d.k(customScalarAdapters, au.com.woolworths.shop.graphql.type.TealiumAnalytics.f11963a, reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "__typename");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "link");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "image");
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "altText");
                            throw null;
                        }
                        if (cardHeightA != null) {
                            return new OrderConfirmationQuery.OnActionableCard(str, str2, str3, str4, cardHeightA, tealiumAnalytics, bool);
                        }
                        Assertions.a(reader, "cardHeight");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OrderConfirmationQuery.OnActionableCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21853a);
            writer.F1("link");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("image");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("cardHeight");
            CardHeight_ResponseAdapter.b(writer, customScalarAdapters, value.e);
            writer.F1("analytics");
            Adapters.b(customScalarAdapters.e(au.com.woolworths.shop.graphql.type.TealiumAnalytics.f11963a)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.g);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OrderConfirmationQuery.OnActionableCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/OrderConfirmationQuery_ResponseAdapter$OnActionableCard1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/OrderConfirmationQuery$OnActionableCard1;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnActionableCard1 implements Adapter<OrderConfirmationQuery.OnActionableCard1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21990a = CollectionsKt.R("__typename", "link", "image", "altText", "cardHeight", "analytics", "_excluded");

        public static OrderConfirmationQuery.OnActionableCard1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            CardHeight cardHeightA = null;
            TealiumAnalytics tealiumAnalytics = null;
            Boolean bool = null;
            while (true) {
                switch (reader.o2(f21990a)) {
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
                        cardHeightA = CardHeight_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    case 5:
                        tealiumAnalytics = (TealiumAnalytics) d.k(customScalarAdapters, au.com.woolworths.shop.graphql.type.TealiumAnalytics.f11963a, reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "__typename");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "link");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "image");
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "altText");
                            throw null;
                        }
                        if (cardHeightA != null) {
                            return new OrderConfirmationQuery.OnActionableCard1(str, str2, str3, str4, cardHeightA, tealiumAnalytics, bool);
                        }
                        Assertions.a(reader, "cardHeight");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OrderConfirmationQuery.OnActionableCard1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21854a);
            writer.F1("link");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("image");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("cardHeight");
            CardHeight_ResponseAdapter.b(writer, customScalarAdapters, value.e);
            writer.F1("analytics");
            Adapters.b(customScalarAdapters.e(au.com.woolworths.shop.graphql.type.TealiumAnalytics.f11963a)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.g);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OrderConfirmationQuery.OnActionableCard1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/OrderConfirmationQuery_ResponseAdapter$OnCheckoutOrderAddresses;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/OrderConfirmationQuery$OnCheckoutOrderAddresses;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutOrderAddresses implements Adapter<OrderConfirmationQuery.OnCheckoutOrderAddresses> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21991a = CollectionsKt.R("title", "addressSections", "insetBanner");

        public static OrderConfirmationQuery.OnCheckoutOrderAddresses a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            OrderConfirmationQuery.InsetBanner insetBanner = null;
            while (true) {
                int iO2 = reader.o2(f21991a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson = Adapters.a(Adapters.c(AddressSection.f21981a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    insetBanner = (OrderConfirmationQuery.InsetBanner) Adapters.b(Adapters.c(InsetBanner.f21986a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new OrderConfirmationQuery.OnCheckoutOrderAddresses(str, arrayListFromJson, insetBanner);
            }
            Assertions.a(reader, "addressSections");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OrderConfirmationQuery.OnCheckoutOrderAddresses value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21855a);
            writer.F1("addressSections");
            Adapters.a(Adapters.c(AddressSection.f21981a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("insetBanner");
            Adapters.b(Adapters.c(InsetBanner.f21986a, false)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OrderConfirmationQuery.OnCheckoutOrderAddresses) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/OrderConfirmationQuery_ResponseAdapter$OnCheckoutOrderGroceryAddress;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/OrderConfirmationQuery$OnCheckoutOrderGroceryAddress;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutOrderGroceryAddress implements Adapter<OrderConfirmationQuery.OnCheckoutOrderGroceryAddress> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21992a = CollectionsKt.R("title", "addressText", "imageUrl", "fulfilmentWindow");

        public static OrderConfirmationQuery.OnCheckoutOrderGroceryAddress a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int iO2 = reader.o2(f21992a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "addressText");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "imageUrl");
                throw null;
            }
            if (str4 != null) {
                return new OrderConfirmationQuery.OnCheckoutOrderGroceryAddress(str, str2, str3, str4);
            }
            Assertions.a(reader, "fulfilmentWindow");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OrderConfirmationQuery.OnCheckoutOrderGroceryAddress value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21856a);
            writer.F1("addressText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("fulfilmentWindow");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OrderConfirmationQuery.OnCheckoutOrderGroceryAddress) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/OrderConfirmationQuery_ResponseAdapter$OnCheckoutOrderMarketAddress;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/OrderConfirmationQuery$OnCheckoutOrderMarketAddress;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutOrderMarketAddress implements Adapter<OrderConfirmationQuery.OnCheckoutOrderMarketAddress> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21993a = CollectionsKt.R("title", "addressText", "imageUrl", "sellerInfo");

        public static OrderConfirmationQuery.OnCheckoutOrderMarketAddress a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f21993a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(SellerInfo.f22007a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "addressText");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "imageUrl");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new OrderConfirmationQuery.OnCheckoutOrderMarketAddress(str, str2, str3, arrayListFromJson);
            }
            Assertions.a(reader, "sellerInfo");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OrderConfirmationQuery.OnCheckoutOrderMarketAddress value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21857a);
            writer.F1("addressText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("sellerInfo");
            Adapters.a(Adapters.c(SellerInfo.f22007a, false)).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OrderConfirmationQuery.OnCheckoutOrderMarketAddress) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/OrderConfirmationQuery_ResponseAdapter$OnCheckoutOrderSummary;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/OrderConfirmationQuery$OnCheckoutOrderSummary;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutOrderSummary implements Adapter<OrderConfirmationQuery.OnCheckoutOrderSummary> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21994a = CollectionsKt.R("title", "summaryText", "sections");

        public static OrderConfirmationQuery.OnCheckoutOrderSummary a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f21994a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.a(Adapters.c(Section.f22006a, false))).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new OrderConfirmationQuery.OnCheckoutOrderSummary(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, "sections");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OrderConfirmationQuery.OnCheckoutOrderSummary value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21858a);
            writer.F1("summaryText");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("sections");
            Adapters.a(Adapters.a(Adapters.c(Section.f22006a, false))).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OrderConfirmationQuery.OnCheckoutOrderSummary) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/OrderConfirmationQuery_ResponseAdapter$OnGoogleAdBannerCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/OrderConfirmationQuery$OnGoogleAdBannerCard;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnGoogleAdBannerCard implements Adapter<OrderConfirmationQuery.OnGoogleAdBannerCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21995a = CollectionsKt.R("__typename", OutOfContextTestingActivity.AD_UNIT_KEY, "nativeCustomTemplateId", "iabSpec", "iabSize", "height", "targeting", "_excluded");

        public static OrderConfirmationQuery.OnGoogleAdBannerCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            AdBannerNativeSize adBannerNativeSizeA = null;
            GoogleAdCustomTargeting googleAdCustomTargeting = null;
            String str4 = null;
            Boolean bool3 = null;
            while (true) {
                switch (reader.o2(f21995a)) {
                    case 0:
                        bool = bool2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bool = bool2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        bool = bool2;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 4:
                        bool = bool2;
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        adBannerNativeSizeA = AdBannerNativeSize_ResponseAdapter.a(reader, customScalarAdapters);
                        continue;
                    case 6:
                        bool = bool2;
                        googleAdCustomTargeting = (GoogleAdCustomTargeting) d.k(customScalarAdapters, au.com.woolworths.shop.graphql.type.GoogleAdCustomTargeting.f11436a, reader, customScalarAdapters);
                        break;
                    case 7:
                        bool = bool2;
                        bool3 = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Boolean bool4 = bool2;
                        if (str == null) {
                            Assertions.a(reader, "__typename");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, OutOfContextTestingActivity.AD_UNIT_KEY);
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "nativeCustomTemplateId");
                            throw null;
                        }
                        if (bool4 == null) {
                            Assertions.a(reader, "iabSpec");
                            throw null;
                        }
                        boolean zBooleanValue = bool4.booleanValue();
                        if (adBannerNativeSizeA != null) {
                            return new OrderConfirmationQuery.OnGoogleAdBannerCard(str, str2, zBooleanValue, str3, adBannerNativeSizeA, googleAdCustomTargeting, str4, bool3);
                        }
                        Assertions.a(reader, "height");
                        throw null;
                }
                bool2 = bool;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OrderConfirmationQuery.OnGoogleAdBannerCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21859a);
            writer.F1(OutOfContextTestingActivity.AD_UNIT_KEY);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("nativeCustomTemplateId");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("iabSpec");
            d.B(value.d, Adapters.f, writer, customScalarAdapters, "iabSize");
            Adapters.i.toJson(writer, customScalarAdapters, value.e);
            writer.F1("height");
            AdBannerNativeSize_ResponseAdapter.b(writer, customScalarAdapters, value.f);
            writer.F1("targeting");
            Adapters.b(customScalarAdapters.e(au.com.woolworths.shop.graphql.type.GoogleAdCustomTargeting.f11436a)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.h);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OrderConfirmationQuery.OnGoogleAdBannerCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/OrderConfirmationQuery_ResponseAdapter$OnIconTextBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/OrderConfirmationQuery$OnIconTextBanner;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnIconTextBanner implements Adapter<OrderConfirmationQuery.OnIconTextBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21996a = CollectionsKt.R("imageUrl", "title");

        public static OrderConfirmationQuery.OnIconTextBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f21996a);
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
                Assertions.a(reader, "imageUrl");
                throw null;
            }
            if (str2 != null) {
                return new OrderConfirmationQuery.OnIconTextBanner(str, str2);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OrderConfirmationQuery.OnIconTextBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("imageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21860a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OrderConfirmationQuery.OnIconTextBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/OrderConfirmationQuery_ResponseAdapter$OnOrderConfirmationBannerImage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/OrderConfirmationQuery$OnOrderConfirmationBannerImage;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnOrderConfirmationBannerImage implements Adapter<OrderConfirmationQuery.OnOrderConfirmationBannerImage> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21997a = CollectionsKt.R("imageUrl", "altText");

        public static OrderConfirmationQuery.OnOrderConfirmationBannerImage a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f21997a);
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
                Assertions.a(reader, "imageUrl");
                throw null;
            }
            if (str2 != null) {
                return new OrderConfirmationQuery.OnOrderConfirmationBannerImage(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OrderConfirmationQuery.OnOrderConfirmationBannerImage value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("imageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21861a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OrderConfirmationQuery.OnOrderConfirmationBannerImage) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/OrderConfirmationQuery_ResponseAdapter$OnOrderConfirmationCMOBroadcastBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/OrderConfirmationQuery$OnOrderConfirmationCMOBroadcastBanner;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnOrderConfirmationCMOBroadcastBanner implements Adapter<OrderConfirmationQuery.OnOrderConfirmationCMOBroadcastBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21998a = CollectionsKt.Q("banner");

        public static OrderConfirmationQuery.OnOrderConfirmationCMOBroadcastBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            OrderConfirmationQuery.Banner banner = null;
            while (reader.o2(f21998a) == 0) {
                banner = (OrderConfirmationQuery.Banner) Adapters.b(Adapters.c(Banner.f21982a, false)).fromJson(reader, customScalarAdapters);
            }
            return new OrderConfirmationQuery.OnOrderConfirmationCMOBroadcastBanner(banner);
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OrderConfirmationQuery.OnOrderConfirmationCMOBroadcastBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("banner");
            Adapters.b(Adapters.c(Banner.f21982a, false)).toJson(writer, customScalarAdapters, value.f21862a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OrderConfirmationQuery.OnOrderConfirmationCMOBroadcastBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/OrderConfirmationQuery_ResponseAdapter$OnOrderConfirmationFooterText;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/OrderConfirmationQuery$OnOrderConfirmationFooterText;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnOrderConfirmationFooterText implements Adapter<OrderConfirmationQuery.OnOrderConfirmationFooterText> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21999a = CollectionsKt.Q(TextBundle.TEXT_ENTRY);

        public static OrderConfirmationQuery.OnOrderConfirmationFooterText a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f21999a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new OrderConfirmationQuery.OnOrderConfirmationFooterText(str);
            }
            Assertions.a(reader, TextBundle.TEXT_ENTRY);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OrderConfirmationQuery.OnOrderConfirmationFooterText value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21863a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OrderConfirmationQuery.OnOrderConfirmationFooterText) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/OrderConfirmationQuery_ResponseAdapter$OnOrderConfirmationHeader;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/OrderConfirmationQuery$OnOrderConfirmationHeader;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnOrderConfirmationHeader implements Adapter<OrderConfirmationQuery.OnOrderConfirmationHeader> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22000a = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "order");

        public static OrderConfirmationQuery.OnOrderConfirmationHeader a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f22000a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Order.f22002a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                throw null;
            }
            if (arrayListFromJson != null) {
                return new OrderConfirmationQuery.OnOrderConfirmationHeader(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, "order");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OrderConfirmationQuery.OnOrderConfirmationHeader value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21864a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("order");
            Adapters.a(Adapters.c(Order.f22002a, false)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OrderConfirmationQuery.OnOrderConfirmationHeader) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/OrderConfirmationQuery_ResponseAdapter$OnUniversalInventoryContainer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/OrderConfirmationQuery$OnUniversalInventoryContainer;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnUniversalInventoryContainer implements Adapter<OrderConfirmationQuery.OnUniversalInventoryContainer> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22001a = CollectionsKt.R("googleAdBannerCard", "nextBestAction");

        public static OrderConfirmationQuery.OnUniversalInventoryContainer a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            OrderConfirmationQuery.GoogleAdBannerCard googleAdBannerCard = null;
            OrderConfirmationQuery.NextBestAction nextBestAction = null;
            while (true) {
                int iO2 = reader.o2(f22001a);
                if (iO2 == 0) {
                    googleAdBannerCard = (OrderConfirmationQuery.GoogleAdBannerCard) Adapters.b(Adapters.c(GoogleAdBannerCard.f21985a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new OrderConfirmationQuery.OnUniversalInventoryContainer(googleAdBannerCard, nextBestAction);
                    }
                    nextBestAction = (OrderConfirmationQuery.NextBestAction) Adapters.b(Adapters.c(NextBestAction.f21988a, true)).fromJson(reader, customScalarAdapters);
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OrderConfirmationQuery.OnUniversalInventoryContainer value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("googleAdBannerCard");
            Adapters.b(Adapters.c(GoogleAdBannerCard.f21985a, false)).toJson(writer, customScalarAdapters, value.f21865a);
            writer.F1("nextBestAction");
            Adapters.b(Adapters.c(NextBestAction.f21988a, true)).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OrderConfirmationQuery.OnUniversalInventoryContainer) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/OrderConfirmationQuery_ResponseAdapter$Order;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/OrderConfirmationQuery$Order;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Order implements Adapter<OrderConfirmationQuery.Order> {

        /* renamed from: a, reason: collision with root package name */
        public static final Order f22002a = new Order();
        public static final List b = CollectionsKt.R("title", "titleType", "value", "valueType", "imageUrl");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            CheckoutSummaryValueType checkoutSummaryValueTypeA = null;
            String str2 = null;
            CheckoutSummaryValueType checkoutSummaryValueTypeA2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    checkoutSummaryValueTypeA = CheckoutSummaryValueType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    checkoutSummaryValueTypeA2 = CheckoutSummaryValueType_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (checkoutSummaryValueTypeA == null) {
                Assertions.a(reader, "titleType");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "value");
                throw null;
            }
            if (checkoutSummaryValueTypeA2 != null) {
                return new OrderConfirmationQuery.Order(str, checkoutSummaryValueTypeA, str2, checkoutSummaryValueTypeA2, str3);
            }
            Assertions.a(reader, "valueType");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OrderConfirmationQuery.Order value = (OrderConfirmationQuery.Order) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21866a);
            writer.F1("titleType");
            CheckoutSummaryValueType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1("value");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("valueType");
            CheckoutSummaryValueType_ResponseAdapter.b(writer, customScalarAdapters, value.d);
            writer.F1("imageUrl");
            Adapters.i.toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/OrderConfirmationQuery_ResponseAdapter$OrderConfirmation;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/OrderConfirmationQuery$OrderConfirmation;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OrderConfirmation implements Adapter<OrderConfirmationQuery.OrderConfirmation> {

        /* renamed from: a, reason: collision with root package name */
        public static final OrderConfirmation f22003a = new OrderConfirmation();
        public static final List b = CollectionsKt.R("content", "buttonTitle", "orderInfo");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            String str = null;
            OrderConfirmationQuery.OrderInfo orderInfo = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    arrayListFromJson = Adapters.a(Adapters.c(Content.f21983a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    orderInfo = (OrderConfirmationQuery.OrderInfo) Adapters.c(OrderInfo.f22004a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "content");
                throw null;
            }
            if (orderInfo != null) {
                return new OrderConfirmationQuery.OrderConfirmation(arrayListFromJson, str, orderInfo);
            }
            Assertions.a(reader, "orderInfo");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OrderConfirmationQuery.OrderConfirmation value = (OrderConfirmationQuery.OrderConfirmation) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("content");
            Adapters.a(Adapters.c(Content.f21983a, true)).toJson(writer, customScalarAdapters, value.f21867a);
            writer.F1("buttonTitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("orderInfo");
            Adapters.c(OrderInfo.f22004a, false).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/OrderConfirmationQuery_ResponseAdapter$OrderInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/OrderConfirmationQuery$OrderInfo;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OrderInfo implements Adapter<OrderConfirmationQuery.OrderInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final OrderInfo f22004a = new OrderInfo();
        public static final List b = CollectionsKt.R("productsInfo", "isDeliveryNow", "isDirectToBootNow", "isDeliveryUnlimited", "shopperID", "orderNumber", "orderTotal", "deliveryFee", "deliveryCity", "deliveryMethod", "isCrowdSourced", "packagingFeeLabel", "hasRewards", "orderDiscount", "subtotal", "rewardsCreditsUsed", "fulfilmentMethod", "isEditedOrder", "orderReference", "rewardsDollarsAmount", "storeCreditAmount", "promoCodeCreditAmount", "discountSavingsTotal", "storeCreditCode", "promoCodeValue");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            ArrayList arrayListFromJson = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            Boolean bool6 = null;
            String str7 = null;
            Boolean bool7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        bool = bool2;
                        arrayListFromJson = Adapters.a(Adapters.c(ProductsInfo.f22005a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 2:
                        bool = bool2;
                        bool3 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool = bool2;
                        bool4 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool = bool2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        bool = bool2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = bool2;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        bool = bool2;
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        bool = bool2;
                        str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        bool = bool2;
                        str6 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        bool = bool2;
                        bool5 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        break;
                    case 11:
                        bool = bool2;
                        str7 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 12:
                        bool = bool2;
                        bool6 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        break;
                    case 13:
                        bool = bool2;
                        str8 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 14:
                        bool = bool2;
                        str9 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 15:
                        bool = bool2;
                        str10 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 16:
                        bool = bool2;
                        str11 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 17:
                        bool = bool2;
                        bool7 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        break;
                    case 18:
                        bool = bool2;
                        str12 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 19:
                        bool = bool2;
                        str13 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 20:
                        bool = bool2;
                        str14 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 21:
                        bool = bool2;
                        str15 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 22:
                        bool = bool2;
                        str16 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 23:
                        bool = bool2;
                        str17 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 24:
                        bool = bool2;
                        str18 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Boolean bool8 = bool2;
                        if (arrayListFromJson == null) {
                            Assertions.a(reader, "productsInfo");
                            throw null;
                        }
                        if (bool8 == null) {
                            Assertions.a(reader, "isDeliveryNow");
                            throw null;
                        }
                        Boolean bool9 = bool3;
                        boolean zBooleanValue = bool8.booleanValue();
                        if (bool9 == null) {
                            Assertions.a(reader, "isDirectToBootNow");
                            throw null;
                        }
                        Boolean bool10 = bool4;
                        boolean zBooleanValue2 = bool9.booleanValue();
                        if (bool10 == null) {
                            Assertions.a(reader, "isDeliveryUnlimited");
                            throw null;
                        }
                        Boolean bool11 = bool5;
                        boolean zBooleanValue3 = bool10.booleanValue();
                        if (str == null) {
                            Assertions.a(reader, "shopperID");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "orderNumber");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "orderTotal");
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "deliveryFee");
                            throw null;
                        }
                        if (str5 == null) {
                            Assertions.a(reader, "deliveryCity");
                            throw null;
                        }
                        if (str6 == null) {
                            Assertions.a(reader, "deliveryMethod");
                            throw null;
                        }
                        if (bool11 == null) {
                            Assertions.a(reader, "isCrowdSourced");
                            throw null;
                        }
                        Boolean bool12 = bool6;
                        boolean zBooleanValue4 = bool11.booleanValue();
                        if (str7 == null) {
                            Assertions.a(reader, "packagingFeeLabel");
                            throw null;
                        }
                        if (bool12 == null) {
                            Assertions.a(reader, "hasRewards");
                            throw null;
                        }
                        Boolean bool13 = bool7;
                        boolean zBooleanValue5 = bool12.booleanValue();
                        if (str8 == null) {
                            Assertions.a(reader, "orderDiscount");
                            throw null;
                        }
                        if (str9 == null) {
                            Assertions.a(reader, "subtotal");
                            throw null;
                        }
                        if (str10 == null) {
                            Assertions.a(reader, "rewardsCreditsUsed");
                            throw null;
                        }
                        if (str11 == null) {
                            Assertions.a(reader, "fulfilmentMethod");
                            throw null;
                        }
                        if (bool13 == null) {
                            Assertions.a(reader, "isEditedOrder");
                            throw null;
                        }
                        boolean zBooleanValue6 = bool13.booleanValue();
                        if (str12 == null) {
                            Assertions.a(reader, "orderReference");
                            throw null;
                        }
                        if (str13 == null) {
                            Assertions.a(reader, "rewardsDollarsAmount");
                            throw null;
                        }
                        if (str14 == null) {
                            Assertions.a(reader, "storeCreditAmount");
                            throw null;
                        }
                        if (str15 == null) {
                            Assertions.a(reader, "promoCodeCreditAmount");
                            throw null;
                        }
                        if (str16 == null) {
                            Assertions.a(reader, "discountSavingsTotal");
                            throw null;
                        }
                        if (str17 == null) {
                            Assertions.a(reader, "storeCreditCode");
                            throw null;
                        }
                        if (str18 != null) {
                            return new OrderConfirmationQuery.OrderInfo(arrayListFromJson, zBooleanValue, zBooleanValue2, zBooleanValue3, str, str2, str3, str4, str5, str6, zBooleanValue4, str7, zBooleanValue5, str8, str9, str10, str11, zBooleanValue6, str12, str13, str14, str15, str16, str17, str18);
                        }
                        Assertions.a(reader, "promoCodeValue");
                        throw null;
                }
                bool2 = bool;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OrderConfirmationQuery.OrderInfo value = (OrderConfirmationQuery.OrderInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productsInfo");
            Adapters.a(Adapters.c(ProductsInfo.f22005a, false)).toJson(writer, customScalarAdapters, value.f21868a);
            writer.F1("isDeliveryNow");
            Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
            d.B(value.b, adapters$BooleanAdapter$1, writer, customScalarAdapters, "isDirectToBootNow");
            d.B(value.c, adapters$BooleanAdapter$1, writer, customScalarAdapters, "isDeliveryUnlimited");
            d.B(value.d, adapters$BooleanAdapter$1, writer, customScalarAdapters, "shopperID");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("orderNumber");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1("orderTotal");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.g);
            writer.F1("deliveryFee");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.h);
            writer.F1("deliveryCity");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.i);
            writer.F1("deliveryMethod");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.j);
            writer.F1("isCrowdSourced");
            d.B(value.k, adapters$BooleanAdapter$1, writer, customScalarAdapters, "packagingFeeLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.l);
            writer.F1("hasRewards");
            d.B(value.m, adapters$BooleanAdapter$1, writer, customScalarAdapters, "orderDiscount");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.n);
            writer.F1("subtotal");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.o);
            writer.F1("rewardsCreditsUsed");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.p);
            writer.F1("fulfilmentMethod");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.q);
            writer.F1("isEditedOrder");
            d.B(value.r, adapters$BooleanAdapter$1, writer, customScalarAdapters, "orderReference");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.s);
            writer.F1("rewardsDollarsAmount");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.t);
            writer.F1("storeCreditAmount");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.u);
            writer.F1("promoCodeCreditAmount");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.v);
            writer.F1("discountSavingsTotal");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.w);
            writer.F1("storeCreditCode");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.x);
            writer.F1("promoCodeValue");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.y);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/OrderConfirmationQuery_ResponseAdapter$ProductsInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/OrderConfirmationQuery$ProductsInfo;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductsInfo implements Adapter<OrderConfirmationQuery.ProductsInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductsInfo f22005a = new ProductsInfo();
        public static final List b = CollectionsKt.R("productId", "productName", "price", "quantity", "subtotal", "isAvailable", "sellerName", "brandName", "dispatchNote", "source");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Double d;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Double d2 = null;
            String str = null;
            String str2 = null;
            Double d3 = null;
            Double d4 = null;
            Boolean bool = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        d = d2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        d = d2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        d2 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                        continue;
                    case 3:
                        d = d2;
                        d3 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        d = d2;
                        d4 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        d = d2;
                        bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        d = d2;
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        d = d2;
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        d = d2;
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        d = d2;
                        str6 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Double d5 = d2;
                        if (str == null) {
                            Assertions.a(reader, "productId");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "productName");
                            throw null;
                        }
                        if (d5 == null) {
                            Assertions.a(reader, "price");
                            throw null;
                        }
                        Double d6 = d3;
                        Double d7 = d4;
                        double dDoubleValue = d5.doubleValue();
                        if (d6 == null) {
                            Assertions.a(reader, "quantity");
                            throw null;
                        }
                        Boolean bool2 = bool;
                        double dDoubleValue2 = d6.doubleValue();
                        if (d7 == null) {
                            Assertions.a(reader, "subtotal");
                            throw null;
                        }
                        double dDoubleValue3 = d7.doubleValue();
                        if (bool2 != null) {
                            return new OrderConfirmationQuery.ProductsInfo(str, str2, dDoubleValue, dDoubleValue2, dDoubleValue3, bool2.booleanValue(), str3, str4, str5, str6);
                        }
                        Assertions.a(reader, "isAvailable");
                        throw null;
                }
                d2 = d;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OrderConfirmationQuery.ProductsInfo value = (OrderConfirmationQuery.ProductsInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productId");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21869a);
            writer.F1("productName");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("price");
            Adapters$DoubleAdapter$1 adapters$DoubleAdapter$1 = Adapters.c;
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.c));
            writer.F1("quantity");
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.d));
            writer.F1("subtotal");
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.e));
            writer.F1("isAvailable");
            d.B(value.f, Adapters.f, writer, customScalarAdapters, "sellerName");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.g);
            writer.F1("brandName");
            nullableAdapter.toJson(writer, customScalarAdapters, value.h);
            writer.F1("dispatchNote");
            nullableAdapter.toJson(writer, customScalarAdapters, value.i);
            writer.F1("source");
            nullableAdapter.toJson(writer, customScalarAdapters, value.j);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/OrderConfirmationQuery_ResponseAdapter$Section;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/OrderConfirmationQuery$Section;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Section implements Adapter<OrderConfirmationQuery.Section> {

        /* renamed from: a, reason: collision with root package name */
        public static final Section f22006a = new Section();
        public static final List b = CollectionsKt.R("title", "titleType", "value", "valueType", "imageUrl", "message");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            CheckoutSummaryValueType checkoutSummaryValueTypeA = null;
            String str2 = null;
            CheckoutSummaryValueType checkoutSummaryValueTypeA2 = null;
            String str3 = null;
            OrderConfirmationQuery.Message message = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    checkoutSummaryValueTypeA = CheckoutSummaryValueType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    checkoutSummaryValueTypeA2 = CheckoutSummaryValueType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    message = (OrderConfirmationQuery.Message) Adapters.b(Adapters.c(Message.f21987a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (checkoutSummaryValueTypeA == null) {
                Assertions.a(reader, "titleType");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "value");
                throw null;
            }
            if (checkoutSummaryValueTypeA2 != null) {
                return new OrderConfirmationQuery.Section(str, checkoutSummaryValueTypeA, str2, checkoutSummaryValueTypeA2, str3, message);
            }
            Assertions.a(reader, "valueType");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OrderConfirmationQuery.Section value = (OrderConfirmationQuery.Section) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21870a);
            writer.F1("titleType");
            CheckoutSummaryValueType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1("value");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("valueType");
            CheckoutSummaryValueType_ResponseAdapter.b(writer, customScalarAdapters, value.d);
            writer.F1("imageUrl");
            Adapters.i.toJson(writer, customScalarAdapters, value.e);
            writer.F1("message");
            Adapters.b(Adapters.c(Message.f21987a, false)).toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/OrderConfirmationQuery_ResponseAdapter$SellerInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/OrderConfirmationQuery$SellerInfo;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SellerInfo implements Adapter<OrderConfirmationQuery.SellerInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final SellerInfo f22007a = new SellerInfo();
        public static final List b = CollectionsKt.R("sellerName", "dispatchNote");

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
                Assertions.a(reader, "sellerName");
                throw null;
            }
            if (str2 != null) {
                return new OrderConfirmationQuery.SellerInfo(str, str2);
            }
            Assertions.a(reader, "dispatchNote");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OrderConfirmationQuery.SellerInfo value = (OrderConfirmationQuery.SellerInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("sellerName");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21871a);
            writer.F1("dispatchNote");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }
}
