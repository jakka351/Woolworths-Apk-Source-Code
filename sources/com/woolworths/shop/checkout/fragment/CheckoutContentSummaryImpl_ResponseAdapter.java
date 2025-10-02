package com.woolworths.shop.checkout.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFieldsImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.CheckoutProgressId;
import au.com.woolworths.shop.graphql.type.CheckoutSummaryValueType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.adapter.ButtonStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CheckoutProgressId_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CheckoutSummaryValueType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerDisplayType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$DoubleAdapter$1;
import com.apollographql.apollo.api.Adapters$IntAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpression;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.woolworths.shop.checkout.fragment.CheckoutContentSummary;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\bL\bÇ\u0002\u0018\u00002\u00020\u0001:K\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKL¨\u0006M"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter;", "", "CheckoutContentSummary", "ProductsInfo", "Message", "OnSnackBar", "LegacyError", "Progress", "Content", "OnInsetBanner", "OnCheckoutSummaryBillingAddress", "OnCheckoutSummaryBillingAddressEmpty", "OnCheckoutSummaryRewardsUnregistered", "OnCheckoutSummaryRewards", "RewardsSection", "OnCheckoutSummaryRewardsRegistered", "OnCheckoutSummaryRewardsRegisteredRedeemable", "RedeemInfo", "OnCheckoutOrderAddresses", "AddressSection", "OnCheckoutOrderGroceryAddress", "OnCheckoutOrderMarketAddress", "SellerInfo", "InsetBanner", "OnCheckoutOrderSummary", "Section", "Message1", "OnCheckoutTermsConditions", "OnCheckoutPromotionCode", "Discounts", "DiscountItem", "OnCheckoutRewardsAndDiscounts", "RewardsAndDiscount", "OnCheckoutRewards", "ActionClickAnalytics", "RewardsAction", "OnCheckoutRewardsRedeem", "RewardsRedeemInfo", "UnRedeemableBanner", "ImpressionAnalytics", "OnCheckoutRewardsInfo", "ImpressionAnalytics1", "ButtonClickAnalytics", "OnCheckoutRewardsLink", "OnCheckoutPromoCode", "ActionClickAnalytics1", "Detail", "PromoCode", "OnCheckoutPromoCodeItem", "OnCheckoutCredit", "ActionClickAnalytics2", "Detail1", "OnCheckoutCreditEmpty", "OnCheckoutCreditItems", "Item", "OnCheckoutCreditUnavailable", "ImpressionAnalytic", "OrderTotalDetails", "InlineMessage", "Section1", "Message2", "Total", "RefundInfo", "PrimaryCta", "ReviewProducts", "UnavailableOrderItem", "RestrictedOrderItem", "ExceededSupplyLimitProductGroup", "Product", "RestrictedProductsByDeliveryMethod", "RestrictedProductsByDeliPlatter", "AvailableOrderItem", "IdVerificationBottomSheet", "PrimaryButton", "SecondaryButton", "ImpressionAnalytic1", "RestrictionPrompt", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CheckoutContentSummaryImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$ActionClickAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$ActionClickAnalytics;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ActionClickAnalytics implements Adapter<CheckoutContentSummary.ActionClickAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ActionClickAnalytics f22297a = new ActionClickAnalytics();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            AnalyticsFields analyticsFieldsA = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new CheckoutContentSummary.ActionClickAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.ActionClickAnalytics value = (CheckoutContentSummary.ActionClickAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22223a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$ActionClickAnalytics1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$ActionClickAnalytics1;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ActionClickAnalytics1 implements Adapter<CheckoutContentSummary.ActionClickAnalytics1> {

        /* renamed from: a, reason: collision with root package name */
        public static final ActionClickAnalytics1 f22298a = new ActionClickAnalytics1();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            AnalyticsFields analyticsFieldsA = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new CheckoutContentSummary.ActionClickAnalytics1(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.ActionClickAnalytics1 value = (CheckoutContentSummary.ActionClickAnalytics1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22224a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$ActionClickAnalytics2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$ActionClickAnalytics2;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ActionClickAnalytics2 implements Adapter<CheckoutContentSummary.ActionClickAnalytics2> {

        /* renamed from: a, reason: collision with root package name */
        public static final ActionClickAnalytics2 f22299a = new ActionClickAnalytics2();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            AnalyticsFields analyticsFieldsA = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new CheckoutContentSummary.ActionClickAnalytics2(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.ActionClickAnalytics2 value = (CheckoutContentSummary.ActionClickAnalytics2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22225a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$AddressSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$AddressSection;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AddressSection implements Adapter<CheckoutContentSummary.AddressSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final AddressSection f22300a = new AddressSection();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            CheckoutContentSummary.OnCheckoutOrderGroceryAddress onCheckoutOrderGroceryAddressA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            CheckoutContentSummary.OnCheckoutOrderMarketAddress onCheckoutOrderMarketAddressA = null;
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
            return new CheckoutContentSummary.AddressSection(str, onCheckoutOrderGroceryAddressA, onCheckoutOrderMarketAddressA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.AddressSection value = (CheckoutContentSummary.AddressSection) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22226a);
            CheckoutContentSummary.OnCheckoutOrderGroceryAddress onCheckoutOrderGroceryAddress = value.b;
            if (onCheckoutOrderGroceryAddress != null) {
                OnCheckoutOrderGroceryAddress.b(writer, customScalarAdapters, onCheckoutOrderGroceryAddress);
            }
            CheckoutContentSummary.OnCheckoutOrderMarketAddress onCheckoutOrderMarketAddress = value.c;
            if (onCheckoutOrderMarketAddress != null) {
                OnCheckoutOrderMarketAddress.b(writer, customScalarAdapters, onCheckoutOrderMarketAddress);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$AvailableOrderItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$AvailableOrderItem;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AvailableOrderItem implements Adapter<CheckoutContentSummary.AvailableOrderItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final AvailableOrderItem f22301a = new AvailableOrderItem();
        public static final List b = CollectionsKt.Q(AppMeasurementSdk.ConditionalUserProperty.NAME);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
            }
            return new CheckoutContentSummary.AvailableOrderItem(str);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.AvailableOrderItem value = (CheckoutContentSummary.AvailableOrderItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AppMeasurementSdk.ConditionalUserProperty.NAME);
            Adapters.i.toJson(writer, customScalarAdapters, value.f22227a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$ButtonClickAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$ButtonClickAnalytics;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ButtonClickAnalytics implements Adapter<CheckoutContentSummary.ButtonClickAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ButtonClickAnalytics f22302a = new ButtonClickAnalytics();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            AnalyticsFields analyticsFieldsA = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new CheckoutContentSummary.ButtonClickAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.ButtonClickAnalytics value = (CheckoutContentSummary.ButtonClickAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22228a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$CheckoutContentSummary;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CheckoutContentSummary implements Adapter<com.woolworths.shop.checkout.fragment.CheckoutContentSummary> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22303a = CollectionsKt.R("productsInfo", "message", "legacyErrors", "progress", "content", "orderTotalDetails", "idVerificationBottomSheet", "impressionAnalytics", "isUserWPayMigrated", "restrictionPrompt");

        public static com.woolworths.shop.checkout.fragment.CheckoutContentSummary a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            List list = null;
            CheckoutContentSummary.Message message = null;
            ArrayList arrayListFromJson = null;
            ArrayList arrayListFromJson2 = null;
            ArrayList arrayListFromJson3 = null;
            CheckoutContentSummary.OrderTotalDetails orderTotalDetails = null;
            CheckoutContentSummary.IdVerificationBottomSheet idVerificationBottomSheet = null;
            List list2 = null;
            Boolean bool = null;
            CheckoutContentSummary.RestrictionPrompt restrictionPrompt = null;
            while (true) {
                switch (reader.o2(f22303a)) {
                    case 0:
                        list = (List) Adapters.b(Adapters.a(Adapters.c(ProductsInfo.f22351a, false))).fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        message = (CheckoutContentSummary.Message) Adapters.b(Adapters.c(Message.f22319a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        arrayListFromJson = Adapters.a(Adapters.c(LegacyError.f22318a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        arrayListFromJson2 = Adapters.a(Adapters.c(Progress.f22352a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        arrayListFromJson3 = Adapters.a(Adapters.c(Content.f22304a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        orderTotalDetails = (CheckoutContentSummary.OrderTotalDetails) Adapters.c(OrderTotalDetails.f22347a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        idVerificationBottomSheet = (CheckoutContentSummary.IdVerificationBottomSheet) Adapters.b(Adapters.c(IdVerificationBottomSheet.f22310a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        list2 = (List) Adapters.b(Adapters.a(Adapters.c(ImpressionAnalytic1.f22312a, true))).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        restrictionPrompt = (CheckoutContentSummary.RestrictionPrompt) Adapters.b(Adapters.c(RestrictionPrompt.f22359a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (arrayListFromJson == null) {
                            Assertions.a(reader, "legacyErrors");
                            throw null;
                        }
                        if (arrayListFromJson2 == null) {
                            Assertions.a(reader, "progress");
                            throw null;
                        }
                        if (arrayListFromJson3 == null) {
                            Assertions.a(reader, "content");
                            throw null;
                        }
                        if (orderTotalDetails != null) {
                            return new com.woolworths.shop.checkout.fragment.CheckoutContentSummary(list, message, arrayListFromJson, arrayListFromJson2, arrayListFromJson3, orderTotalDetails, idVerificationBottomSheet, list2, bool, restrictionPrompt);
                        }
                        Assertions.a(reader, "orderTotalDetails");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, com.woolworths.shop.checkout.fragment.CheckoutContentSummary value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productsInfo");
            Adapters.b(Adapters.a(Adapters.c(ProductsInfo.f22351a, false))).toJson(writer, customScalarAdapters, value.f22222a);
            writer.F1("message");
            Adapters.b(Adapters.c(Message.f22319a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("legacyErrors");
            Adapters.a(Adapters.c(LegacyError.f22318a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("progress");
            Adapters.a(Adapters.c(Progress.f22352a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("content");
            Adapters.a(Adapters.c(Content.f22304a, true)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("orderTotalDetails");
            Adapters.c(OrderTotalDetails.f22347a, false).toJson(writer, customScalarAdapters, value.f);
            writer.F1("idVerificationBottomSheet");
            Adapters.b(Adapters.c(IdVerificationBottomSheet.f22310a, false)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("impressionAnalytics");
            Adapters.b(Adapters.a(Adapters.c(ImpressionAnalytic1.f22312a, true))).toJson(writer, customScalarAdapters, value.h);
            writer.F1("isUserWPayMigrated");
            Adapters.l.toJson(writer, customScalarAdapters, value.i);
            writer.F1("restrictionPrompt");
            Adapters.b(Adapters.c(RestrictionPrompt.f22359a, false)).toJson(writer, customScalarAdapters, value.j);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (com.woolworths.shop.checkout.fragment.CheckoutContentSummary) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$Content;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$Content;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Content implements Adapter<CheckoutContentSummary.Content> {

        /* renamed from: a, reason: collision with root package name */
        public static final Content f22304a = new Content();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            CheckoutContentSummary.OnInsetBanner onInsetBannerA;
            CheckoutContentSummary.OnCheckoutSummaryBillingAddress onCheckoutSummaryBillingAddressA;
            CheckoutContentSummary.OnCheckoutSummaryBillingAddressEmpty onCheckoutSummaryBillingAddressEmptyA;
            CheckoutContentSummary.OnCheckoutSummaryRewardsUnregistered onCheckoutSummaryRewardsUnregisteredA;
            CheckoutContentSummary.OnCheckoutSummaryRewards onCheckoutSummaryRewardsA;
            CheckoutContentSummary.OnCheckoutOrderAddresses onCheckoutOrderAddressesA;
            CheckoutContentSummary.OnCheckoutOrderSummary onCheckoutOrderSummaryA;
            CheckoutContentSummary.OnCheckoutTermsConditions onCheckoutTermsConditionsA;
            CheckoutContentSummary.OnCheckoutPromotionCode onCheckoutPromotionCodeA;
            CheckoutContentSummary.OnCheckoutRewardsAndDiscounts onCheckoutRewardsAndDiscountsA;
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
            if (a.C(set2, set, null, str, BooleanExpressions.c("InsetBanner"))) {
                reader.o();
                onInsetBannerA = OnInsetBanner.a(reader, customScalarAdapters);
            } else {
                onInsetBannerA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CheckoutSummaryBillingAddress"))) {
                reader.o();
                onCheckoutSummaryBillingAddressA = OnCheckoutSummaryBillingAddress.a(reader, customScalarAdapters);
            } else {
                onCheckoutSummaryBillingAddressA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CheckoutSummaryBillingAddressEmpty"))) {
                reader.o();
                onCheckoutSummaryBillingAddressEmptyA = OnCheckoutSummaryBillingAddressEmpty.a(reader, customScalarAdapters);
            } else {
                onCheckoutSummaryBillingAddressEmptyA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("CheckoutSummaryRewardsUnregistered"), new BooleanExpression.Not(BooleanExpressions.d("isRewardsUplift"))))) {
                reader.o();
                onCheckoutSummaryRewardsUnregisteredA = OnCheckoutSummaryRewardsUnregistered.a(reader, customScalarAdapters);
            } else {
                onCheckoutSummaryRewardsUnregisteredA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("CheckoutSummaryRewards"), new BooleanExpression.Not(BooleanExpressions.d("isRewardsUplift"))))) {
                reader.o();
                onCheckoutSummaryRewardsA = OnCheckoutSummaryRewards.a(reader, customScalarAdapters);
            } else {
                onCheckoutSummaryRewardsA = null;
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
            if (a.C(set2, set, null, str, BooleanExpressions.c("CheckoutTermsConditions"))) {
                reader.o();
                onCheckoutTermsConditionsA = OnCheckoutTermsConditions.a(reader, customScalarAdapters);
            } else {
                onCheckoutTermsConditionsA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("CheckoutPromotionCode"), new BooleanExpression.Not(BooleanExpressions.d("isPromoCodeUplift"))))) {
                reader.o();
                onCheckoutPromotionCodeA = OnCheckoutPromotionCode.a(reader, customScalarAdapters);
            } else {
                onCheckoutPromotionCodeA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("CheckoutRewardsAndDiscounts"), BooleanExpressions.d("includeRewardsAndDiscounts")))) {
                reader.o();
                onCheckoutRewardsAndDiscountsA = OnCheckoutRewardsAndDiscounts.a(reader, customScalarAdapters);
            } else {
                onCheckoutRewardsAndDiscountsA = null;
            }
            return new CheckoutContentSummary.Content(str, onInsetBannerA, onCheckoutSummaryBillingAddressA, onCheckoutSummaryBillingAddressEmptyA, onCheckoutSummaryRewardsUnregisteredA, onCheckoutSummaryRewardsA, onCheckoutOrderAddressesA, onCheckoutOrderSummaryA, onCheckoutTermsConditionsA, onCheckoutPromotionCodeA, onCheckoutRewardsAndDiscountsA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.Content value = (CheckoutContentSummary.Content) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22229a);
            CheckoutContentSummary.OnInsetBanner onInsetBanner = value.b;
            if (onInsetBanner != null) {
                OnInsetBanner.b(writer, customScalarAdapters, onInsetBanner);
            }
            CheckoutContentSummary.OnCheckoutSummaryBillingAddress onCheckoutSummaryBillingAddress = value.c;
            if (onCheckoutSummaryBillingAddress != null) {
                OnCheckoutSummaryBillingAddress.b(writer, customScalarAdapters, onCheckoutSummaryBillingAddress);
            }
            CheckoutContentSummary.OnCheckoutSummaryBillingAddressEmpty onCheckoutSummaryBillingAddressEmpty = value.d;
            if (onCheckoutSummaryBillingAddressEmpty != null) {
                OnCheckoutSummaryBillingAddressEmpty.b(writer, customScalarAdapters, onCheckoutSummaryBillingAddressEmpty);
            }
            CheckoutContentSummary.OnCheckoutSummaryRewardsUnregistered onCheckoutSummaryRewardsUnregistered = value.e;
            if (onCheckoutSummaryRewardsUnregistered != null) {
                OnCheckoutSummaryRewardsUnregistered.b(writer, customScalarAdapters, onCheckoutSummaryRewardsUnregistered);
            }
            CheckoutContentSummary.OnCheckoutSummaryRewards onCheckoutSummaryRewards = value.f;
            if (onCheckoutSummaryRewards != null) {
                OnCheckoutSummaryRewards.b(writer, customScalarAdapters, onCheckoutSummaryRewards);
            }
            CheckoutContentSummary.OnCheckoutOrderAddresses onCheckoutOrderAddresses = value.g;
            if (onCheckoutOrderAddresses != null) {
                OnCheckoutOrderAddresses.b(writer, customScalarAdapters, onCheckoutOrderAddresses);
            }
            CheckoutContentSummary.OnCheckoutOrderSummary onCheckoutOrderSummary = value.h;
            if (onCheckoutOrderSummary != null) {
                OnCheckoutOrderSummary.b(writer, customScalarAdapters, onCheckoutOrderSummary);
            }
            CheckoutContentSummary.OnCheckoutTermsConditions onCheckoutTermsConditions = value.i;
            if (onCheckoutTermsConditions != null) {
                OnCheckoutTermsConditions.b(writer, customScalarAdapters, onCheckoutTermsConditions);
            }
            CheckoutContentSummary.OnCheckoutPromotionCode onCheckoutPromotionCode = value.j;
            if (onCheckoutPromotionCode != null) {
                OnCheckoutPromotionCode.b(writer, customScalarAdapters, onCheckoutPromotionCode);
            }
            CheckoutContentSummary.OnCheckoutRewardsAndDiscounts onCheckoutRewardsAndDiscounts = value.k;
            if (onCheckoutRewardsAndDiscounts != null) {
                OnCheckoutRewardsAndDiscounts.b(writer, customScalarAdapters, onCheckoutRewardsAndDiscounts);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$Detail;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$Detail;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Detail implements Adapter<CheckoutContentSummary.Detail> {

        /* renamed from: a, reason: collision with root package name */
        public static final Detail f22305a = new Detail();
        public static final List b = CollectionsKt.R("placeholderText", "buttonTitle", "promoCodes");

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
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(PromoCode.f22353a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 == null) {
                Assertions.a(reader, "buttonTitle");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new CheckoutContentSummary.Detail(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, "promoCodes");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.Detail value = (CheckoutContentSummary.Detail) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("placeholderText");
            Adapters.i.toJson(writer, customScalarAdapters, value.f22230a);
            writer.F1("buttonTitle");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("promoCodes");
            Adapters.a(Adapters.c(PromoCode.f22353a, true)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$Detail1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$Detail1;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Detail1 implements Adapter<CheckoutContentSummary.Detail1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Detail1 f22306a = new Detail1();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            CheckoutContentSummary.OnCheckoutCreditEmpty onCheckoutCreditEmptyA;
            CheckoutContentSummary.OnCheckoutCreditItems onCheckoutCreditItemsA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            CheckoutContentSummary.OnCheckoutCreditUnavailable onCheckoutCreditUnavailableA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CheckoutCreditEmpty"))) {
                reader.o();
                onCheckoutCreditEmptyA = OnCheckoutCreditEmpty.a(reader, customScalarAdapters);
            } else {
                onCheckoutCreditEmptyA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CheckoutCreditItems"))) {
                reader.o();
                onCheckoutCreditItemsA = OnCheckoutCreditItems.a(reader, customScalarAdapters);
            } else {
                onCheckoutCreditItemsA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CheckoutCreditUnavailable"))) {
                reader.o();
                onCheckoutCreditUnavailableA = OnCheckoutCreditUnavailable.a(reader, customScalarAdapters);
            }
            return new CheckoutContentSummary.Detail1(str, onCheckoutCreditEmptyA, onCheckoutCreditItemsA, onCheckoutCreditUnavailableA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.Detail1 value = (CheckoutContentSummary.Detail1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22231a);
            CheckoutContentSummary.OnCheckoutCreditEmpty onCheckoutCreditEmpty = value.b;
            if (onCheckoutCreditEmpty != null) {
                OnCheckoutCreditEmpty.b(writer, customScalarAdapters, onCheckoutCreditEmpty);
            }
            CheckoutContentSummary.OnCheckoutCreditItems onCheckoutCreditItems = value.c;
            if (onCheckoutCreditItems != null) {
                OnCheckoutCreditItems.b(writer, customScalarAdapters, onCheckoutCreditItems);
            }
            CheckoutContentSummary.OnCheckoutCreditUnavailable onCheckoutCreditUnavailable = value.d;
            if (onCheckoutCreditUnavailable != null) {
                OnCheckoutCreditUnavailable.b(writer, customScalarAdapters, onCheckoutCreditUnavailable);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$DiscountItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$DiscountItem;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DiscountItem implements Adapter<CheckoutContentSummary.DiscountItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final DiscountItem f22307a = new DiscountItem();
        public static final List b = CollectionsKt.R("title", "price");

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
                return new CheckoutContentSummary.DiscountItem(str, str2);
            }
            Assertions.a(reader, "price");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.DiscountItem value = (CheckoutContentSummary.DiscountItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22232a);
            writer.F1("price");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$Discounts;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$Discounts;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Discounts implements Adapter<CheckoutContentSummary.Discounts> {

        /* renamed from: a, reason: collision with root package name */
        public static final Discounts f22308a = new Discounts();
        public static final List b = CollectionsKt.R("discountItems", "buttonTitle");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    arrayListFromJson = Adapters.a(Adapters.c(DiscountItem.f22307a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "discountItems");
                throw null;
            }
            if (str != null) {
                return new CheckoutContentSummary.Discounts(str, arrayListFromJson);
            }
            Assertions.a(reader, "buttonTitle");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.Discounts value = (CheckoutContentSummary.Discounts) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("discountItems");
            Adapters.a(Adapters.c(DiscountItem.f22307a, false)).toJson(writer, customScalarAdapters, value.f22233a);
            writer.F1("buttonTitle");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$ExceededSupplyLimitProductGroup;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$ExceededSupplyLimitProductGroup;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ExceededSupplyLimitProductGroup implements Adapter<CheckoutContentSummary.ExceededSupplyLimitProductGroup> {

        /* renamed from: a, reason: collision with root package name */
        public static final ExceededSupplyLimitProductGroup f22309a = new ExceededSupplyLimitProductGroup();
        public static final List b = CollectionsKt.Q("products");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(b) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(Product.f22350a, false)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new CheckoutContentSummary.ExceededSupplyLimitProductGroup(arrayListFromJson);
            }
            Assertions.a(reader, "products");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.ExceededSupplyLimitProductGroup value = (CheckoutContentSummary.ExceededSupplyLimitProductGroup) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("products");
            Adapters.a(Adapters.c(Product.f22350a, false)).toJson(writer, customScalarAdapters, value.f22234a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$IdVerificationBottomSheet;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$IdVerificationBottomSheet;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IdVerificationBottomSheet implements Adapter<CheckoutContentSummary.IdVerificationBottomSheet> {

        /* renamed from: a, reason: collision with root package name */
        public static final IdVerificationBottomSheet f22310a = new IdVerificationBottomSheet();
        public static final List b = CollectionsKt.R("title", "body", "imageUrls", "primaryButton", "secondaryButton");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            CheckoutContentSummary.PrimaryButton primaryButton = null;
            CheckoutContentSummary.SecondaryButton secondaryButton = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    primaryButton = (CheckoutContentSummary.PrimaryButton) Adapters.b(Adapters.c(PrimaryButton.f22348a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    secondaryButton = (CheckoutContentSummary.SecondaryButton) Adapters.b(Adapters.c(SecondaryButton.f22365a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "body");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new CheckoutContentSummary.IdVerificationBottomSheet(str, str2, arrayListFromJson, primaryButton, secondaryButton);
            }
            Assertions.a(reader, "imageUrls");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.IdVerificationBottomSheet value = (CheckoutContentSummary.IdVerificationBottomSheet) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22235a);
            writer.F1("body");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("imageUrls");
            Adapters.a(adapters$StringAdapter$1).toJson(writer, customScalarAdapters, value.c);
            writer.F1("primaryButton");
            Adapters.b(Adapters.c(PrimaryButton.f22348a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("secondaryButton");
            Adapters.b(Adapters.c(SecondaryButton.f22365a, false)).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$ImpressionAnalytic;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$ImpressionAnalytic;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImpressionAnalytic implements Adapter<CheckoutContentSummary.ImpressionAnalytic> {

        /* renamed from: a, reason: collision with root package name */
        public static final ImpressionAnalytic f22311a = new ImpressionAnalytic();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            AnalyticsFields analyticsFieldsA = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new CheckoutContentSummary.ImpressionAnalytic(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.ImpressionAnalytic value = (CheckoutContentSummary.ImpressionAnalytic) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22236a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$ImpressionAnalytic1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$ImpressionAnalytic1;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImpressionAnalytic1 implements Adapter<CheckoutContentSummary.ImpressionAnalytic1> {

        /* renamed from: a, reason: collision with root package name */
        public static final ImpressionAnalytic1 f22312a = new ImpressionAnalytic1();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            AnalyticsFields analyticsFieldsA = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new CheckoutContentSummary.ImpressionAnalytic1(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.ImpressionAnalytic1 value = (CheckoutContentSummary.ImpressionAnalytic1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22237a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$ImpressionAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$ImpressionAnalytics;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImpressionAnalytics implements Adapter<CheckoutContentSummary.ImpressionAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ImpressionAnalytics f22313a = new ImpressionAnalytics();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            AnalyticsFields analyticsFieldsA = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new CheckoutContentSummary.ImpressionAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.ImpressionAnalytics value = (CheckoutContentSummary.ImpressionAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22238a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$ImpressionAnalytics1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$ImpressionAnalytics1;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImpressionAnalytics1 implements Adapter<CheckoutContentSummary.ImpressionAnalytics1> {

        /* renamed from: a, reason: collision with root package name */
        public static final ImpressionAnalytics1 f22314a = new ImpressionAnalytics1();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            AnalyticsFields analyticsFieldsA = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new CheckoutContentSummary.ImpressionAnalytics1(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.ImpressionAnalytics1 value = (CheckoutContentSummary.ImpressionAnalytics1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22239a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$InlineMessage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$InlineMessage;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InlineMessage implements Adapter<CheckoutContentSummary.InlineMessage> {

        /* renamed from: a, reason: collision with root package name */
        public static final InlineMessage f22315a = new InlineMessage();
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
                return new CheckoutContentSummary.InlineMessage(insetBannerDisplayTypeA, str);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.InlineMessage value = (CheckoutContentSummary.InlineMessage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.f22240a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$InsetBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$InsetBanner;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InsetBanner implements Adapter<CheckoutContentSummary.InsetBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final InsetBanner f22316a = new InsetBanner();
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
                return new CheckoutContentSummary.InsetBanner(insetBannerDisplayTypeA, str);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.InsetBanner value = (CheckoutContentSummary.InsetBanner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.f22241a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$Item;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<CheckoutContentSummary.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f22317a = new Item();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "primaryLabel", "secondaryLabel", "isApplied", "code", "amount");

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
            String str5 = null;
            String str6 = null;
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
                    default:
                        Boolean bool3 = bool2;
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "primaryLabel");
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "secondaryLabel");
                            throw null;
                        }
                        if (bool3 == null) {
                            Assertions.a(reader, "isApplied");
                            throw null;
                        }
                        boolean zBooleanValue = bool3.booleanValue();
                        if (str5 == null) {
                            Assertions.a(reader, "code");
                            throw null;
                        }
                        if (str6 != null) {
                            return new CheckoutContentSummary.Item(str, str2, str3, str4, zBooleanValue, str5, str6);
                        }
                        Assertions.a(reader, "amount");
                        throw null;
                }
                bool2 = bool;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.Item value = (CheckoutContentSummary.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22242a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("primaryLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("secondaryLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("isApplied");
            d.B(value.e, Adapters.f, writer, customScalarAdapters, "code");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1("amount");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.g);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$LegacyError;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$LegacyError;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LegacyError implements Adapter<CheckoutContentSummary.LegacyError> {

        /* renamed from: a, reason: collision with root package name */
        public static final LegacyError f22318a = new LegacyError();
        public static final List b = CollectionsKt.R("errorCode", "message", "key");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (num == null) {
                Assertions.a(reader, "errorCode");
                throw null;
            }
            int iIntValue = num.intValue();
            if (str == null) {
                Assertions.a(reader, "message");
                throw null;
            }
            if (str2 != null) {
                return new CheckoutContentSummary.LegacyError(iIntValue, str, str2);
            }
            Assertions.a(reader, "key");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.LegacyError value = (CheckoutContentSummary.LegacyError) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("errorCode");
            d.y(value.f22243a, Adapters.b, writer, customScalarAdapters, "message");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("key");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$Message;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$Message;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Message implements Adapter<CheckoutContentSummary.Message> {

        /* renamed from: a, reason: collision with root package name */
        public static final Message f22319a = new Message();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CheckoutContentSummary.OnSnackBar onSnackBarA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("SnackBar"))) {
                reader.o();
                onSnackBarA = OnSnackBar.a(reader, customScalarAdapters);
            }
            return new CheckoutContentSummary.Message(str, onSnackBarA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.Message value = (CheckoutContentSummary.Message) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22244a);
            CheckoutContentSummary.OnSnackBar onSnackBar = value.b;
            if (onSnackBar != null) {
                OnSnackBar.b(writer, customScalarAdapters, onSnackBar);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$Message1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$Message1;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Message1 implements Adapter<CheckoutContentSummary.Message1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Message1 f22320a = new Message1();
        public static final List b = CollectionsKt.R("title", "body", "type");

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
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        return new CheckoutContentSummary.Message1(str, str2, str3);
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.Message1 value = (CheckoutContentSummary.Message1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f22245a);
            writer.F1("body");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("type");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$Message2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$Message2;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Message2 implements Adapter<CheckoutContentSummary.Message2> {

        /* renamed from: a, reason: collision with root package name */
        public static final Message2 f22321a = new Message2();
        public static final List b = CollectionsKt.R("title", "body", "type");

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
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        return new CheckoutContentSummary.Message2(str, str2, str3);
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.Message2 value = (CheckoutContentSummary.Message2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f22246a);
            writer.F1("body");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("type");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$OnCheckoutCredit;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutCredit;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutCredit implements Adapter<CheckoutContentSummary.OnCheckoutCredit> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22322a = CollectionsKt.R("title", lqlqqlq.mmm006Dm006Dm, "appliedIcon", "actionClickAnalytics", "detail");

        public static CheckoutContentSummary.OnCheckoutCredit a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            CheckoutContentSummary.ActionClickAnalytics2 actionClickAnalytics2 = null;
            CheckoutContentSummary.Detail1 detail1 = null;
            while (true) {
                int iO2 = reader.o2(f22322a);
                if (iO2 == 0) {
                    bool = bool2;
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = bool2;
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    bool = bool2;
                    actionClickAnalytics2 = (CheckoutContentSummary.ActionClickAnalytics2) Adapters.b(Adapters.c(ActionClickAnalytics2.f22299a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    bool = bool2;
                    detail1 = (CheckoutContentSummary.Detail1) Adapters.c(Detail1.f22306a, true).fromJson(reader, customScalarAdapters);
                }
                bool2 = bool;
            }
            Boolean bool3 = bool2;
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
                throw null;
            }
            if (bool3 == null) {
                Assertions.a(reader, "appliedIcon");
                throw null;
            }
            boolean zBooleanValue = bool3.booleanValue();
            if (detail1 != null) {
                return new CheckoutContentSummary.OnCheckoutCredit(str, str2, zBooleanValue, actionClickAnalytics2, detail1);
            }
            Assertions.a(reader, "detail");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContentSummary.OnCheckoutCredit value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22247a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("appliedIcon");
            d.B(value.c, Adapters.f, writer, customScalarAdapters, "actionClickAnalytics");
            Adapters.b(Adapters.c(ActionClickAnalytics2.f22299a, true)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("detail");
            Adapters.c(Detail1.f22306a, true).toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContentSummary.OnCheckoutCredit) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$OnCheckoutCreditEmpty;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutCreditEmpty;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutCreditEmpty implements Adapter<CheckoutContentSummary.OnCheckoutCreditEmpty> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22323a = CollectionsKt.R("title", "message");

        public static CheckoutContentSummary.OnCheckoutCreditEmpty a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f22323a);
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
                return new CheckoutContentSummary.OnCheckoutCreditEmpty(str, str2);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContentSummary.OnCheckoutCreditEmpty value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22248a);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContentSummary.OnCheckoutCreditEmpty) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$OnCheckoutCreditItems;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutCreditItems;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutCreditItems implements Adapter<CheckoutContentSummary.OnCheckoutCreditItems> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22324a = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "items");

        public static CheckoutContentSummary.OnCheckoutCreditItems a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f22324a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Item.f22317a, false)).fromJson(reader, customScalarAdapters);
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
                return new CheckoutContentSummary.OnCheckoutCreditItems(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContentSummary.OnCheckoutCreditItems value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22249a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("items");
            Adapters.a(Adapters.c(Item.f22317a, false)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContentSummary.OnCheckoutCreditItems) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$OnCheckoutCreditUnavailable;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutCreditUnavailable;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutCreditUnavailable implements Adapter<CheckoutContentSummary.OnCheckoutCreditUnavailable> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22325a = CollectionsKt.R("title", "message", "retryButtonTitle");

        public static CheckoutContentSummary.OnCheckoutCreditUnavailable a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(f22325a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
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
            if (str2 == null) {
                Assertions.a(reader, "message");
                throw null;
            }
            if (str3 != null) {
                return new CheckoutContentSummary.OnCheckoutCreditUnavailable(str, str2, str3);
            }
            Assertions.a(reader, "retryButtonTitle");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContentSummary.OnCheckoutCreditUnavailable value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22250a);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("retryButtonTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContentSummary.OnCheckoutCreditUnavailable) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$OnCheckoutOrderAddresses;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutOrderAddresses;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutOrderAddresses implements Adapter<CheckoutContentSummary.OnCheckoutOrderAddresses> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22326a = CollectionsKt.R("title", "addressSections", "insetBanner");

        public static CheckoutContentSummary.OnCheckoutOrderAddresses a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            CheckoutContentSummary.InsetBanner insetBanner = null;
            while (true) {
                int iO2 = reader.o2(f22326a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson = Adapters.a(Adapters.c(AddressSection.f22300a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    insetBanner = (CheckoutContentSummary.InsetBanner) Adapters.b(Adapters.c(InsetBanner.f22316a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new CheckoutContentSummary.OnCheckoutOrderAddresses(str, arrayListFromJson, insetBanner);
            }
            Assertions.a(reader, "addressSections");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContentSummary.OnCheckoutOrderAddresses value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22251a);
            writer.F1("addressSections");
            Adapters.a(Adapters.c(AddressSection.f22300a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("insetBanner");
            Adapters.b(Adapters.c(InsetBanner.f22316a, false)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContentSummary.OnCheckoutOrderAddresses) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$OnCheckoutOrderGroceryAddress;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutOrderGroceryAddress;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutOrderGroceryAddress implements Adapter<CheckoutContentSummary.OnCheckoutOrderGroceryAddress> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22327a = CollectionsKt.R("title", "addressText", "imageUrl", "fulfilmentWindow");

        public static CheckoutContentSummary.OnCheckoutOrderGroceryAddress a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int iO2 = reader.o2(f22327a);
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
                return new CheckoutContentSummary.OnCheckoutOrderGroceryAddress(str, str2, str3, str4);
            }
            Assertions.a(reader, "fulfilmentWindow");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContentSummary.OnCheckoutOrderGroceryAddress value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22252a);
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
            b(jsonWriter, customScalarAdapters, (CheckoutContentSummary.OnCheckoutOrderGroceryAddress) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$OnCheckoutOrderMarketAddress;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutOrderMarketAddress;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutOrderMarketAddress implements Adapter<CheckoutContentSummary.OnCheckoutOrderMarketAddress> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22328a = CollectionsKt.R("title", "addressText", "imageUrl", "sellerInfo");

        public static CheckoutContentSummary.OnCheckoutOrderMarketAddress a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f22328a);
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
                    arrayListFromJson = Adapters.a(Adapters.c(SellerInfo.f22368a, false)).fromJson(reader, customScalarAdapters);
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
                return new CheckoutContentSummary.OnCheckoutOrderMarketAddress(str, str2, str3, arrayListFromJson);
            }
            Assertions.a(reader, "sellerInfo");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContentSummary.OnCheckoutOrderMarketAddress value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22253a);
            writer.F1("addressText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("sellerInfo");
            Adapters.a(Adapters.c(SellerInfo.f22368a, false)).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContentSummary.OnCheckoutOrderMarketAddress) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$OnCheckoutOrderSummary;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutOrderSummary;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutOrderSummary implements Adapter<CheckoutContentSummary.OnCheckoutOrderSummary> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22329a = CollectionsKt.R("title", "sections");

        public static CheckoutContentSummary.OnCheckoutOrderSummary a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f22329a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.a(Adapters.c(Section.f22366a, false))).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new CheckoutContentSummary.OnCheckoutOrderSummary(str, arrayListFromJson);
            }
            Assertions.a(reader, "sections");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContentSummary.OnCheckoutOrderSummary value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22254a);
            writer.F1("sections");
            Adapters.a(Adapters.a(Adapters.c(Section.f22366a, false))).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContentSummary.OnCheckoutOrderSummary) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$OnCheckoutPromoCode;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutPromoCode;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutPromoCode implements Adapter<CheckoutContentSummary.OnCheckoutPromoCode> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22330a = CollectionsKt.R("title", lqlqqlq.mmm006Dm006Dm, "appliedIcon", "actionClickAnalytics", "detail");

        public static CheckoutContentSummary.OnCheckoutPromoCode a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            CheckoutContentSummary.ActionClickAnalytics1 actionClickAnalytics1 = null;
            CheckoutContentSummary.Detail detail = null;
            while (true) {
                int iO2 = reader.o2(f22330a);
                if (iO2 == 0) {
                    bool = bool2;
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = bool2;
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    bool = bool2;
                    actionClickAnalytics1 = (CheckoutContentSummary.ActionClickAnalytics1) Adapters.b(Adapters.c(ActionClickAnalytics1.f22298a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    bool = bool2;
                    detail = (CheckoutContentSummary.Detail) Adapters.c(Detail.f22305a, false).fromJson(reader, customScalarAdapters);
                }
                bool2 = bool;
            }
            Boolean bool3 = bool2;
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
                throw null;
            }
            if (bool3 == null) {
                Assertions.a(reader, "appliedIcon");
                throw null;
            }
            boolean zBooleanValue = bool3.booleanValue();
            if (detail != null) {
                return new CheckoutContentSummary.OnCheckoutPromoCode(str, str2, zBooleanValue, actionClickAnalytics1, detail);
            }
            Assertions.a(reader, "detail");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContentSummary.OnCheckoutPromoCode value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22255a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("appliedIcon");
            d.B(value.c, Adapters.f, writer, customScalarAdapters, "actionClickAnalytics");
            Adapters.b(Adapters.c(ActionClickAnalytics1.f22298a, true)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("detail");
            Adapters.c(Detail.f22305a, false).toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContentSummary.OnCheckoutPromoCode) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$OnCheckoutPromoCodeItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutPromoCodeItem;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutPromoCodeItem implements Adapter<CheckoutContentSummary.OnCheckoutPromoCodeItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22331a = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "primaryLabel", "secondaryLabel", "isApplied", "code");

        public static CheckoutContentSummary.OnCheckoutPromoCodeItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (true) {
                int iO2 = reader.o2(f22331a);
                if (iO2 == 0) {
                    bool = bool2;
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = bool2;
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool = bool2;
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    bool = bool2;
                    str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    bool = bool2;
                    str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
                bool2 = bool;
            }
            Boolean bool3 = bool2;
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "primaryLabel");
                throw null;
            }
            if (str4 == null) {
                Assertions.a(reader, "secondaryLabel");
                throw null;
            }
            if (bool3 == null) {
                Assertions.a(reader, "isApplied");
                throw null;
            }
            boolean zBooleanValue = bool3.booleanValue();
            if (str5 != null) {
                return new CheckoutContentSummary.OnCheckoutPromoCodeItem(str, str2, str3, str4, zBooleanValue, str5);
            }
            Assertions.a(reader, "code");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContentSummary.OnCheckoutPromoCodeItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22256a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("primaryLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("secondaryLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("isApplied");
            d.B(value.e, Adapters.f, writer, customScalarAdapters, "code");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContentSummary.OnCheckoutPromoCodeItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$OnCheckoutPromotionCode;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutPromotionCode;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutPromotionCode implements Adapter<CheckoutContentSummary.OnCheckoutPromotionCode> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22332a = CollectionsKt.R("title", "placeholderText", "buttonTitle", "discounts");

        public static CheckoutContentSummary.OnCheckoutPromotionCode a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            CheckoutContentSummary.Discounts discounts = null;
            while (true) {
                int iO2 = reader.o2(f22332a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    discounts = (CheckoutContentSummary.Discounts) Adapters.b(Adapters.c(Discounts.f22308a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 != null) {
                return new CheckoutContentSummary.OnCheckoutPromotionCode(str, str2, str3, discounts);
            }
            Assertions.a(reader, "buttonTitle");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContentSummary.OnCheckoutPromotionCode value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22257a);
            writer.F1("placeholderText");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("buttonTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("discounts");
            Adapters.b(Adapters.c(Discounts.f22308a, false)).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContentSummary.OnCheckoutPromotionCode) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$OnCheckoutRewards;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutRewards;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutRewards implements Adapter<CheckoutContentSummary.OnCheckoutRewards> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22333a = CollectionsKt.R("title", lqlqqlq.mmm006Dm006Dm, "redeemedIcon", "actionClickAnalytics", "rewardsAction");

        public static CheckoutContentSummary.OnCheckoutRewards a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            CheckoutContentSummary.ActionClickAnalytics actionClickAnalytics = null;
            CheckoutContentSummary.RewardsAction rewardsAction = null;
            while (true) {
                int iO2 = reader.o2(f22333a);
                if (iO2 == 0) {
                    bool = bool2;
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = bool2;
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    bool = bool2;
                    actionClickAnalytics = (CheckoutContentSummary.ActionClickAnalytics) Adapters.b(Adapters.c(ActionClickAnalytics.f22297a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    bool = bool2;
                    rewardsAction = (CheckoutContentSummary.RewardsAction) Adapters.b(Adapters.c(RewardsAction.f22361a, true)).fromJson(reader, customScalarAdapters);
                }
                bool2 = bool;
            }
            Boolean bool3 = bool2;
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
                throw null;
            }
            if (bool3 != null) {
                return new CheckoutContentSummary.OnCheckoutRewards(str, str2, bool3.booleanValue(), actionClickAnalytics, rewardsAction);
            }
            Assertions.a(reader, "redeemedIcon");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContentSummary.OnCheckoutRewards value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22258a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("redeemedIcon");
            d.B(value.c, Adapters.f, writer, customScalarAdapters, "actionClickAnalytics");
            Adapters.b(Adapters.c(ActionClickAnalytics.f22297a, true)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("rewardsAction");
            Adapters.b(Adapters.c(RewardsAction.f22361a, true)).toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContentSummary.OnCheckoutRewards) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$OnCheckoutRewardsAndDiscounts;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutRewardsAndDiscounts;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutRewardsAndDiscounts implements Adapter<CheckoutContentSummary.OnCheckoutRewardsAndDiscounts> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22334a = CollectionsKt.R("title", "rewardsAndDiscounts", "impressionAnalytics");

        public static CheckoutContentSummary.OnCheckoutRewardsAndDiscounts a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            List list = null;
            while (true) {
                int iO2 = reader.o2(f22334a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson = Adapters.a(Adapters.c(RewardsAndDiscount.f22362a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    list = (List) Adapters.b(Adapters.a(Adapters.c(ImpressionAnalytic.f22311a, true))).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new CheckoutContentSummary.OnCheckoutRewardsAndDiscounts(str, arrayListFromJson, list);
            }
            Assertions.a(reader, "rewardsAndDiscounts");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContentSummary.OnCheckoutRewardsAndDiscounts value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22259a);
            writer.F1("rewardsAndDiscounts");
            Adapters.a(Adapters.c(RewardsAndDiscount.f22362a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("impressionAnalytics");
            Adapters.b(Adapters.a(Adapters.c(ImpressionAnalytic.f22311a, true))).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContentSummary.OnCheckoutRewardsAndDiscounts) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$OnCheckoutRewardsInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutRewardsInfo;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutRewardsInfo implements Adapter<CheckoutContentSummary.OnCheckoutRewardsInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22335a = CollectionsKt.R("title", lqlqqlq.mmm006Dm006Dm, "buttonTitle", "impressionAnalytics", "buttonClickAnalytics");

        public static CheckoutContentSummary.OnCheckoutRewardsInfo a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            CheckoutContentSummary.ImpressionAnalytics1 impressionAnalytics1 = null;
            CheckoutContentSummary.ButtonClickAnalytics buttonClickAnalytics = null;
            while (true) {
                int iO2 = reader.o2(f22335a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    impressionAnalytics1 = (CheckoutContentSummary.ImpressionAnalytics1) Adapters.b(Adapters.c(ImpressionAnalytics1.f22314a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    buttonClickAnalytics = (CheckoutContentSummary.ButtonClickAnalytics) Adapters.b(Adapters.c(ButtonClickAnalytics.f22302a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
                throw null;
            }
            if (str3 != null) {
                return new CheckoutContentSummary.OnCheckoutRewardsInfo(str, str2, str3, impressionAnalytics1, buttonClickAnalytics);
            }
            Assertions.a(reader, "buttonTitle");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContentSummary.OnCheckoutRewardsInfo value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22260a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("buttonTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("impressionAnalytics");
            Adapters.b(Adapters.c(ImpressionAnalytics1.f22314a, true)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("buttonClickAnalytics");
            Adapters.b(Adapters.c(ButtonClickAnalytics.f22302a, true)).toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContentSummary.OnCheckoutRewardsInfo) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$OnCheckoutRewardsLink;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutRewardsLink;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutRewardsLink implements Adapter<CheckoutContentSummary.OnCheckoutRewardsLink> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22336a = CollectionsKt.Q("__typename");

        public static CheckoutContentSummary.OnCheckoutRewardsLink a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f22336a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new CheckoutContentSummary.OnCheckoutRewardsLink(str);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContentSummary.OnCheckoutRewardsLink value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22261a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContentSummary.OnCheckoutRewardsLink) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$OnCheckoutRewardsRedeem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutRewardsRedeem;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutRewardsRedeem implements Adapter<CheckoutContentSummary.OnCheckoutRewardsRedeem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22337a = CollectionsKt.R("rewardsRedeemInfo", "title", lqlqqlq.mmm006Dm006Dm, "impressionAnalytics");

        public static CheckoutContentSummary.OnCheckoutRewardsRedeem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CheckoutContentSummary.RewardsRedeemInfo rewardsRedeemInfo = null;
            String str = null;
            String str2 = null;
            CheckoutContentSummary.ImpressionAnalytics impressionAnalytics = null;
            while (true) {
                int iO2 = reader.o2(f22337a);
                if (iO2 == 0) {
                    rewardsRedeemInfo = (CheckoutContentSummary.RewardsRedeemInfo) Adapters.c(RewardsRedeemInfo.f22363a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    impressionAnalytics = (CheckoutContentSummary.ImpressionAnalytics) Adapters.b(Adapters.c(ImpressionAnalytics.f22313a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (rewardsRedeemInfo == null) {
                Assertions.a(reader, "rewardsRedeemInfo");
                throw null;
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 != null) {
                return new CheckoutContentSummary.OnCheckoutRewardsRedeem(rewardsRedeemInfo, str, str2, impressionAnalytics);
            }
            Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContentSummary.OnCheckoutRewardsRedeem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("rewardsRedeemInfo");
            Adapters.c(RewardsRedeemInfo.f22363a, false).toJson(writer, customScalarAdapters, value.f22262a);
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("impressionAnalytics");
            Adapters.b(Adapters.c(ImpressionAnalytics.f22313a, true)).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContentSummary.OnCheckoutRewardsRedeem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$OnCheckoutSummaryBillingAddress;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutSummaryBillingAddress;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutSummaryBillingAddress implements Adapter<CheckoutContentSummary.OnCheckoutSummaryBillingAddress> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22338a = CollectionsKt.R("title", "addressText");

        public static CheckoutContentSummary.OnCheckoutSummaryBillingAddress a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f22338a);
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
                return new CheckoutContentSummary.OnCheckoutSummaryBillingAddress(str, str2);
            }
            Assertions.a(reader, "addressText");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContentSummary.OnCheckoutSummaryBillingAddress value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22263a);
            writer.F1("addressText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContentSummary.OnCheckoutSummaryBillingAddress) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$OnCheckoutSummaryBillingAddressEmpty;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutSummaryBillingAddressEmpty;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutSummaryBillingAddressEmpty implements Adapter<CheckoutContentSummary.OnCheckoutSummaryBillingAddressEmpty> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22339a = CollectionsKt.R("title", "displayName", "buttonText");

        public static CheckoutContentSummary.OnCheckoutSummaryBillingAddressEmpty a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(f22339a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
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
            if (str2 == null) {
                Assertions.a(reader, "displayName");
                throw null;
            }
            if (str3 != null) {
                return new CheckoutContentSummary.OnCheckoutSummaryBillingAddressEmpty(str, str2, str3);
            }
            Assertions.a(reader, "buttonText");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContentSummary.OnCheckoutSummaryBillingAddressEmpty value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22264a);
            writer.F1("displayName");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("buttonText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContentSummary.OnCheckoutSummaryBillingAddressEmpty) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$OnCheckoutSummaryRewards;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutSummaryRewards;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutSummaryRewards implements Adapter<CheckoutContentSummary.OnCheckoutSummaryRewards> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22340a = CollectionsKt.Q("rewardsSections");

        public static CheckoutContentSummary.OnCheckoutSummaryRewards a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(f22340a) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(RewardsSection.f22364a, true)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new CheckoutContentSummary.OnCheckoutSummaryRewards(arrayListFromJson);
            }
            Assertions.a(reader, "rewardsSections");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContentSummary.OnCheckoutSummaryRewards value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("rewardsSections");
            Adapters.a(Adapters.c(RewardsSection.f22364a, true)).toJson(writer, customScalarAdapters, value.f22265a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContentSummary.OnCheckoutSummaryRewards) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$OnCheckoutSummaryRewardsRegistered;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutSummaryRewardsRegistered;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutSummaryRewardsRegistered implements Adapter<CheckoutContentSummary.OnCheckoutSummaryRewardsRegistered> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22341a = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "imageUrl");

        public static CheckoutContentSummary.OnCheckoutSummaryRewardsRegistered a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(f22341a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
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
            if (str2 == null) {
                Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                throw null;
            }
            if (str3 != null) {
                return new CheckoutContentSummary.OnCheckoutSummaryRewardsRegistered(str, str2, str3);
            }
            Assertions.a(reader, "imageUrl");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContentSummary.OnCheckoutSummaryRewardsRegistered value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22266a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContentSummary.OnCheckoutSummaryRewardsRegistered) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$OnCheckoutSummaryRewardsRegisteredRedeemable;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutSummaryRewardsRegisteredRedeemable;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutSummaryRewardsRegisteredRedeemable implements Adapter<CheckoutContentSummary.OnCheckoutSummaryRewardsRegisteredRedeemable> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22342a = CollectionsKt.R("redeemText", "buttonTitle", "isRedeemed", "redeemInfo");

        public static CheckoutContentSummary.OnCheckoutSummaryRewardsRegisteredRedeemable a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            Boolean bool = null;
            CheckoutContentSummary.RedeemInfo redeemInfo = null;
            while (true) {
                int iO2 = reader.o2(f22342a);
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
                    redeemInfo = (CheckoutContentSummary.RedeemInfo) Adapters.b(Adapters.c(RedeemInfo.f22354a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "redeemText");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "buttonTitle");
                throw null;
            }
            if (bool != null) {
                return new CheckoutContentSummary.OnCheckoutSummaryRewardsRegisteredRedeemable(str, str2, bool.booleanValue(), redeemInfo);
            }
            Assertions.a(reader, "isRedeemed");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContentSummary.OnCheckoutSummaryRewardsRegisteredRedeemable value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("redeemText");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22267a);
            writer.F1("buttonTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("isRedeemed");
            d.B(value.c, Adapters.f, writer, customScalarAdapters, "redeemInfo");
            Adapters.b(Adapters.c(RedeemInfo.f22354a, false)).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContentSummary.OnCheckoutSummaryRewardsRegisteredRedeemable) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$OnCheckoutSummaryRewardsUnregistered;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutSummaryRewardsUnregistered;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutSummaryRewardsUnregistered implements Adapter<CheckoutContentSummary.OnCheckoutSummaryRewardsUnregistered> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22343a = CollectionsKt.Q("buttonTitle");

        public static CheckoutContentSummary.OnCheckoutSummaryRewardsUnregistered a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f22343a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new CheckoutContentSummary.OnCheckoutSummaryRewardsUnregistered(str);
            }
            Assertions.a(reader, "buttonTitle");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContentSummary.OnCheckoutSummaryRewardsUnregistered value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("buttonTitle");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22268a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContentSummary.OnCheckoutSummaryRewardsUnregistered) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$OnCheckoutTermsConditions;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutTermsConditions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutTermsConditions implements Adapter<CheckoutContentSummary.OnCheckoutTermsConditions> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22344a = CollectionsKt.Q("markdownText");

        public static CheckoutContentSummary.OnCheckoutTermsConditions a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f22344a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new CheckoutContentSummary.OnCheckoutTermsConditions(str);
            }
            Assertions.a(reader, "markdownText");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContentSummary.OnCheckoutTermsConditions value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("markdownText");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22269a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContentSummary.OnCheckoutTermsConditions) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$OnInsetBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnInsetBanner;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnInsetBanner implements Adapter<CheckoutContentSummary.OnInsetBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22345a = CollectionsKt.R("displayType", "message");

        public static CheckoutContentSummary.OnInsetBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(f22345a);
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
                return new CheckoutContentSummary.OnInsetBanner(insetBannerDisplayTypeA, str);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContentSummary.OnInsetBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.f22270a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContentSummary.OnInsetBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$OnSnackBar;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnSnackBar;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnSnackBar implements Adapter<CheckoutContentSummary.OnSnackBar> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22346a = CollectionsKt.R("message", "eventSource");

        public static CheckoutContentSummary.OnSnackBar a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f22346a);
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
                Assertions.a(reader, "message");
                throw null;
            }
            if (str2 != null) {
                return new CheckoutContentSummary.OnSnackBar(str, str2);
            }
            Assertions.a(reader, "eventSource");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContentSummary.OnSnackBar value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("message");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22271a);
            writer.F1("eventSource");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContentSummary.OnSnackBar) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$OrderTotalDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OrderTotalDetails;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OrderTotalDetails implements Adapter<CheckoutContentSummary.OrderTotalDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final OrderTotalDetails f22347a = new OrderTotalDetails();
        public static final List b = CollectionsKt.R("inlineMessage", "sections", "total", "refundInfo", "reviewProducts", "panelMarkdown");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CheckoutContentSummary.InlineMessage inlineMessage = null;
            ArrayList arrayListFromJson = null;
            CheckoutContentSummary.Total total = null;
            CheckoutContentSummary.RefundInfo refundInfo = null;
            CheckoutContentSummary.ReviewProducts reviewProducts = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    inlineMessage = (CheckoutContentSummary.InlineMessage) Adapters.b(Adapters.c(InlineMessage.f22315a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson = Adapters.a(Adapters.a(Adapters.c(Section1.f22367a, false))).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    total = (CheckoutContentSummary.Total) Adapters.c(Total.f22369a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    refundInfo = (CheckoutContentSummary.RefundInfo) Adapters.b(Adapters.c(RefundInfo.f22355a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    reviewProducts = (CheckoutContentSummary.ReviewProducts) Adapters.b(Adapters.c(ReviewProducts.f22360a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "sections");
                throw null;
            }
            if (total != null) {
                return new CheckoutContentSummary.OrderTotalDetails(inlineMessage, arrayListFromJson, total, refundInfo, reviewProducts, str);
            }
            Assertions.a(reader, "total");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.OrderTotalDetails value = (CheckoutContentSummary.OrderTotalDetails) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("inlineMessage");
            Adapters.b(Adapters.c(InlineMessage.f22315a, false)).toJson(writer, customScalarAdapters, value.f22272a);
            writer.F1("sections");
            Adapters.a(Adapters.a(Adapters.c(Section1.f22367a, false))).toJson(writer, customScalarAdapters, value.b);
            writer.F1("total");
            Adapters.c(Total.f22369a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("refundInfo");
            Adapters.b(Adapters.c(RefundInfo.f22355a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("reviewProducts");
            Adapters.b(Adapters.c(ReviewProducts.f22360a, false)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("panelMarkdown");
            Adapters.i.toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$PrimaryButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$PrimaryButton;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PrimaryButton implements Adapter<CheckoutContentSummary.PrimaryButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final PrimaryButton f22348a = new PrimaryButton();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "style", "enabled");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ButtonStyle buttonStyle = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool != null) {
                return new CheckoutContentSummary.PrimaryButton(str, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.PrimaryButton value = (CheckoutContentSummary.PrimaryButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22273a);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.b);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.c));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$PrimaryCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$PrimaryCta;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PrimaryCta implements Adapter<CheckoutContentSummary.PrimaryCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final PrimaryCta f22349a = new PrimaryCta();
        public static final List b = CollectionsKt.Q(AnnotatedPrivateKey.LABEL);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new CheckoutContentSummary.PrimaryCta(str);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.PrimaryCta value = (CheckoutContentSummary.PrimaryCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22274a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$Product;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$Product;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Product implements Adapter<CheckoutContentSummary.Product> {

        /* renamed from: a, reason: collision with root package name */
        public static final Product f22350a = new Product();
        public static final List b = CollectionsKt.Q(AppMeasurementSdk.ConditionalUserProperty.NAME);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
            }
            return new CheckoutContentSummary.Product(str);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.Product value = (CheckoutContentSummary.Product) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AppMeasurementSdk.ConditionalUserProperty.NAME);
            Adapters.i.toJson(writer, customScalarAdapters, value.f22275a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$ProductsInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$ProductsInfo;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductsInfo implements Adapter<CheckoutContentSummary.ProductsInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductsInfo f22351a = new ProductsInfo();
        public static final List b = CollectionsKt.R("productId", "productName", "price", "quantity", "subtotal", "isAvailable", "sellerName", "brandName", "dispatchNote");

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
                            return new CheckoutContentSummary.ProductsInfo(str, str2, dDoubleValue, dDoubleValue2, dDoubleValue3, bool2.booleanValue(), str3, str4, str5);
                        }
                        Assertions.a(reader, "isAvailable");
                        throw null;
                }
                d2 = d;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.ProductsInfo value = (CheckoutContentSummary.ProductsInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productId");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22276a);
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
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$Progress;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$Progress;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Progress implements Adapter<CheckoutContentSummary.Progress> {

        /* renamed from: a, reason: collision with root package name */
        public static final Progress f22352a = new Progress();
        public static final List b = CollectionsKt.R("index", "id", "title");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            CheckoutProgressId checkoutProgressIdA = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    checkoutProgressIdA = CheckoutProgressId_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "index");
                throw null;
            }
            if (checkoutProgressIdA == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (str2 != null) {
                return new CheckoutContentSummary.Progress(str, checkoutProgressIdA, str2);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.Progress value = (CheckoutContentSummary.Progress) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("index");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22277a);
            writer.F1("id");
            CheckoutProgressId_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$PromoCode;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$PromoCode;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PromoCode implements Adapter<CheckoutContentSummary.PromoCode> {

        /* renamed from: a, reason: collision with root package name */
        public static final PromoCode f22353a = new PromoCode();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CheckoutContentSummary.OnCheckoutPromoCodeItem onCheckoutPromoCodeItemA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("CheckoutPromoCodeItem"))) {
                reader.o();
                onCheckoutPromoCodeItemA = OnCheckoutPromoCodeItem.a(reader, customScalarAdapters);
            }
            return new CheckoutContentSummary.PromoCode(str, onCheckoutPromoCodeItemA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.PromoCode value = (CheckoutContentSummary.PromoCode) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22278a);
            CheckoutContentSummary.OnCheckoutPromoCodeItem onCheckoutPromoCodeItem = value.b;
            if (onCheckoutPromoCodeItem != null) {
                OnCheckoutPromoCodeItem.b(writer, customScalarAdapters, onCheckoutPromoCodeItem);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$RedeemInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$RedeemInfo;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RedeemInfo implements Adapter<CheckoutContentSummary.RedeemInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final RedeemInfo f22354a = new RedeemInfo();
        public static final List b = CollectionsKt.R("title", "message", "buttonTitle", "secondaryButtonTitle");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int iO2 = reader.o2(b);
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
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "message");
                throw null;
            }
            if (str3 != null) {
                return new CheckoutContentSummary.RedeemInfo(str, str2, str3, str4);
            }
            Assertions.a(reader, "buttonTitle");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.RedeemInfo value = (CheckoutContentSummary.RedeemInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22279a);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("buttonTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("secondaryButtonTitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$RefundInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$RefundInfo;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RefundInfo implements Adapter<CheckoutContentSummary.RefundInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final RefundInfo f22355a = new RefundInfo();
        public static final List b = CollectionsKt.R("bottomSheetTitle", "bottomSheetBody", "primaryCta");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            CheckoutContentSummary.PrimaryCta primaryCta = null;
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
                    primaryCta = (CheckoutContentSummary.PrimaryCta) Adapters.b(Adapters.c(PrimaryCta.f22349a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "bottomSheetTitle");
                throw null;
            }
            if (str2 != null) {
                return new CheckoutContentSummary.RefundInfo(str, str2, primaryCta);
            }
            Assertions.a(reader, "bottomSheetBody");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.RefundInfo value = (CheckoutContentSummary.RefundInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("bottomSheetTitle");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22280a);
            writer.F1("bottomSheetBody");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("primaryCta");
            Adapters.b(Adapters.c(PrimaryCta.f22349a, false)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$RestrictedOrderItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$RestrictedOrderItem;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RestrictedOrderItem implements Adapter<CheckoutContentSummary.RestrictedOrderItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final RestrictedOrderItem f22356a = new RestrictedOrderItem();
        public static final List b = CollectionsKt.Q(AppMeasurementSdk.ConditionalUserProperty.NAME);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
            }
            return new CheckoutContentSummary.RestrictedOrderItem(str);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.RestrictedOrderItem value = (CheckoutContentSummary.RestrictedOrderItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AppMeasurementSdk.ConditionalUserProperty.NAME);
            Adapters.i.toJson(writer, customScalarAdapters, value.f22281a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$RestrictedProductsByDeliPlatter;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$RestrictedProductsByDeliPlatter;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RestrictedProductsByDeliPlatter implements Adapter<CheckoutContentSummary.RestrictedProductsByDeliPlatter> {

        /* renamed from: a, reason: collision with root package name */
        public static final RestrictedProductsByDeliPlatter f22357a = new RestrictedProductsByDeliPlatter();
        public static final List b = CollectionsKt.Q(AppMeasurementSdk.ConditionalUserProperty.NAME);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
            }
            return new CheckoutContentSummary.RestrictedProductsByDeliPlatter(str);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.RestrictedProductsByDeliPlatter value = (CheckoutContentSummary.RestrictedProductsByDeliPlatter) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AppMeasurementSdk.ConditionalUserProperty.NAME);
            Adapters.i.toJson(writer, customScalarAdapters, value.f22282a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$RestrictedProductsByDeliveryMethod;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$RestrictedProductsByDeliveryMethod;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RestrictedProductsByDeliveryMethod implements Adapter<CheckoutContentSummary.RestrictedProductsByDeliveryMethod> {

        /* renamed from: a, reason: collision with root package name */
        public static final RestrictedProductsByDeliveryMethod f22358a = new RestrictedProductsByDeliveryMethod();
        public static final List b = CollectionsKt.Q(AppMeasurementSdk.ConditionalUserProperty.NAME);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
            }
            return new CheckoutContentSummary.RestrictedProductsByDeliveryMethod(str);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.RestrictedProductsByDeliveryMethod value = (CheckoutContentSummary.RestrictedProductsByDeliveryMethod) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AppMeasurementSdk.ConditionalUserProperty.NAME);
            Adapters.i.toJson(writer, customScalarAdapters, value.f22283a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$RestrictionPrompt;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$RestrictionPrompt;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RestrictionPrompt implements Adapter<CheckoutContentSummary.RestrictionPrompt> {

        /* renamed from: a, reason: collision with root package name */
        public static final RestrictionPrompt f22359a = new RestrictionPrompt();
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
                return new CheckoutContentSummary.RestrictionPrompt(str, str2);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.RestrictionPrompt value = (CheckoutContentSummary.RestrictionPrompt) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22284a);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$ReviewProducts;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$ReviewProducts;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ReviewProducts implements Adapter<CheckoutContentSummary.ReviewProducts> {

        /* renamed from: a, reason: collision with root package name */
        public static final ReviewProducts f22360a = new ReviewProducts();
        public static final List b = CollectionsKt.R("unavailableOrderItems", "restrictedOrderItems", "exceededSupplyLimitProductGroups", "restrictedProductsByDeliveryMethod", "restrictedProductsByDeliPlatter", "availableOrderItems");

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
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    arrayListFromJson = Adapters.a(Adapters.c(UnavailableOrderItem.f22371a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson2 = Adapters.a(Adapters.c(RestrictedOrderItem.f22356a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson3 = Adapters.a(Adapters.c(ExceededSupplyLimitProductGroup.f22309a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    arrayListFromJson4 = Adapters.a(Adapters.c(RestrictedProductsByDeliveryMethod.f22358a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    arrayListFromJson5 = Adapters.a(Adapters.c(RestrictedProductsByDeliPlatter.f22357a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    arrayListFromJson6 = Adapters.a(Adapters.c(AvailableOrderItem.f22301a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "unavailableOrderItems");
                throw null;
            }
            if (arrayListFromJson2 == null) {
                Assertions.a(reader, "restrictedOrderItems");
                throw null;
            }
            if (arrayListFromJson3 == null) {
                Assertions.a(reader, "exceededSupplyLimitProductGroups");
                throw null;
            }
            if (arrayListFromJson4 == null) {
                Assertions.a(reader, "restrictedProductsByDeliveryMethod");
                throw null;
            }
            if (arrayListFromJson5 == null) {
                Assertions.a(reader, "restrictedProductsByDeliPlatter");
                throw null;
            }
            if (arrayListFromJson6 != null) {
                return new CheckoutContentSummary.ReviewProducts(arrayListFromJson, arrayListFromJson2, arrayListFromJson3, arrayListFromJson4, arrayListFromJson5, arrayListFromJson6);
            }
            Assertions.a(reader, "availableOrderItems");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.ReviewProducts value = (CheckoutContentSummary.ReviewProducts) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("unavailableOrderItems");
            Adapters.a(Adapters.c(UnavailableOrderItem.f22371a, false)).toJson(writer, customScalarAdapters, value.f22285a);
            writer.F1("restrictedOrderItems");
            Adapters.a(Adapters.c(RestrictedOrderItem.f22356a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("exceededSupplyLimitProductGroups");
            Adapters.a(Adapters.c(ExceededSupplyLimitProductGroup.f22309a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("restrictedProductsByDeliveryMethod");
            Adapters.a(Adapters.c(RestrictedProductsByDeliveryMethod.f22358a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("restrictedProductsByDeliPlatter");
            Adapters.a(Adapters.c(RestrictedProductsByDeliPlatter.f22357a, false)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("availableOrderItems");
            Adapters.a(Adapters.c(AvailableOrderItem.f22301a, false)).toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$RewardsAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$RewardsAction;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsAction implements Adapter<CheckoutContentSummary.RewardsAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsAction f22361a = new RewardsAction();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            CheckoutContentSummary.OnCheckoutRewardsRedeem onCheckoutRewardsRedeemA;
            CheckoutContentSummary.OnCheckoutRewardsInfo onCheckoutRewardsInfoA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            CheckoutContentSummary.OnCheckoutRewardsLink onCheckoutRewardsLinkA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CheckoutRewardsRedeem"))) {
                reader.o();
                onCheckoutRewardsRedeemA = OnCheckoutRewardsRedeem.a(reader, customScalarAdapters);
            } else {
                onCheckoutRewardsRedeemA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CheckoutRewardsInfo"))) {
                reader.o();
                onCheckoutRewardsInfoA = OnCheckoutRewardsInfo.a(reader, customScalarAdapters);
            } else {
                onCheckoutRewardsInfoA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CheckoutRewardsLink"))) {
                reader.o();
                onCheckoutRewardsLinkA = OnCheckoutRewardsLink.a(reader, customScalarAdapters);
            }
            return new CheckoutContentSummary.RewardsAction(str, onCheckoutRewardsRedeemA, onCheckoutRewardsInfoA, onCheckoutRewardsLinkA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.RewardsAction value = (CheckoutContentSummary.RewardsAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22286a);
            CheckoutContentSummary.OnCheckoutRewardsRedeem onCheckoutRewardsRedeem = value.b;
            if (onCheckoutRewardsRedeem != null) {
                OnCheckoutRewardsRedeem.b(writer, customScalarAdapters, onCheckoutRewardsRedeem);
            }
            CheckoutContentSummary.OnCheckoutRewardsInfo onCheckoutRewardsInfo = value.c;
            if (onCheckoutRewardsInfo != null) {
                OnCheckoutRewardsInfo.b(writer, customScalarAdapters, onCheckoutRewardsInfo);
            }
            CheckoutContentSummary.OnCheckoutRewardsLink onCheckoutRewardsLink = value.d;
            if (onCheckoutRewardsLink != null) {
                OnCheckoutRewardsLink.b(writer, customScalarAdapters, onCheckoutRewardsLink);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$RewardsAndDiscount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$RewardsAndDiscount;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsAndDiscount implements Adapter<CheckoutContentSummary.RewardsAndDiscount> {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsAndDiscount f22362a = new RewardsAndDiscount();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            CheckoutContentSummary.OnCheckoutRewards onCheckoutRewardsA;
            CheckoutContentSummary.OnCheckoutPromoCode onCheckoutPromoCodeA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            CheckoutContentSummary.OnCheckoutCredit onCheckoutCreditA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("CheckoutRewards"), BooleanExpressions.d("isRewardsUplift")))) {
                reader.o();
                onCheckoutRewardsA = OnCheckoutRewards.a(reader, customScalarAdapters);
            } else {
                onCheckoutRewardsA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("CheckoutPromoCode"), BooleanExpressions.d("isPromoCodeUplift")))) {
                reader.o();
                onCheckoutPromoCodeA = OnCheckoutPromoCode.a(reader, customScalarAdapters);
            } else {
                onCheckoutPromoCodeA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("CheckoutCredit"), BooleanExpressions.d("includeCredit")))) {
                reader.o();
                onCheckoutCreditA = OnCheckoutCredit.a(reader, customScalarAdapters);
            }
            return new CheckoutContentSummary.RewardsAndDiscount(str, onCheckoutRewardsA, onCheckoutPromoCodeA, onCheckoutCreditA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.RewardsAndDiscount value = (CheckoutContentSummary.RewardsAndDiscount) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22287a);
            CheckoutContentSummary.OnCheckoutRewards onCheckoutRewards = value.b;
            if (onCheckoutRewards != null) {
                OnCheckoutRewards.b(writer, customScalarAdapters, onCheckoutRewards);
            }
            CheckoutContentSummary.OnCheckoutPromoCode onCheckoutPromoCode = value.c;
            if (onCheckoutPromoCode != null) {
                OnCheckoutPromoCode.b(writer, customScalarAdapters, onCheckoutPromoCode);
            }
            CheckoutContentSummary.OnCheckoutCredit onCheckoutCredit = value.d;
            if (onCheckoutCredit != null) {
                OnCheckoutCredit.b(writer, customScalarAdapters, onCheckoutCredit);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$RewardsRedeemInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$RewardsRedeemInfo;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsRedeemInfo implements Adapter<CheckoutContentSummary.RewardsRedeemInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsRedeemInfo f22363a = new RewardsRedeemInfo();
        public static final List b = CollectionsKt.R("minimum", "maximum", "maximumRedeemable", "increment", "current", "unRedeemableBanner");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            Integer num5 = null;
            CheckoutContentSummary.UnRedeemableBanner unRedeemableBanner = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    num3 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    num4 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    num5 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    unRedeemableBanner = (CheckoutContentSummary.UnRedeemableBanner) Adapters.b(Adapters.c(UnRedeemableBanner.f22370a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (num == null) {
                Assertions.a(reader, "minimum");
                throw null;
            }
            int iIntValue = num.intValue();
            if (num2 == null) {
                Assertions.a(reader, "maximum");
                throw null;
            }
            int iIntValue2 = num2.intValue();
            if (num3 == null) {
                Assertions.a(reader, "maximumRedeemable");
                throw null;
            }
            int iIntValue3 = num3.intValue();
            if (num4 == null) {
                Assertions.a(reader, "increment");
                throw null;
            }
            int iIntValue4 = num4.intValue();
            if (num5 != null) {
                return new CheckoutContentSummary.RewardsRedeemInfo(iIntValue, iIntValue2, iIntValue3, iIntValue4, num5.intValue(), unRedeemableBanner);
            }
            Assertions.a(reader, "current");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.RewardsRedeemInfo value = (CheckoutContentSummary.RewardsRedeemInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("minimum");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.f22288a, adapters$IntAdapter$1, writer, customScalarAdapters, "maximum");
            d.y(value.b, adapters$IntAdapter$1, writer, customScalarAdapters, "maximumRedeemable");
            d.y(value.c, adapters$IntAdapter$1, writer, customScalarAdapters, "increment");
            d.y(value.d, adapters$IntAdapter$1, writer, customScalarAdapters, "current");
            d.y(value.e, adapters$IntAdapter$1, writer, customScalarAdapters, "unRedeemableBanner");
            Adapters.b(Adapters.c(UnRedeemableBanner.f22370a, false)).toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$RewardsSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$RewardsSection;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsSection implements Adapter<CheckoutContentSummary.RewardsSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsSection f22364a = new RewardsSection();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            CheckoutContentSummary.OnCheckoutSummaryRewardsRegistered onCheckoutSummaryRewardsRegisteredA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            CheckoutContentSummary.OnCheckoutSummaryRewardsRegisteredRedeemable onCheckoutSummaryRewardsRegisteredRedeemableA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CheckoutSummaryRewardsRegistered"))) {
                reader.o();
                onCheckoutSummaryRewardsRegisteredA = OnCheckoutSummaryRewardsRegistered.a(reader, customScalarAdapters);
            } else {
                onCheckoutSummaryRewardsRegisteredA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CheckoutSummaryRewardsRegisteredRedeemable"))) {
                reader.o();
                onCheckoutSummaryRewardsRegisteredRedeemableA = OnCheckoutSummaryRewardsRegisteredRedeemable.a(reader, customScalarAdapters);
            }
            return new CheckoutContentSummary.RewardsSection(str, onCheckoutSummaryRewardsRegisteredA, onCheckoutSummaryRewardsRegisteredRedeemableA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.RewardsSection value = (CheckoutContentSummary.RewardsSection) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22289a);
            CheckoutContentSummary.OnCheckoutSummaryRewardsRegistered onCheckoutSummaryRewardsRegistered = value.b;
            if (onCheckoutSummaryRewardsRegistered != null) {
                OnCheckoutSummaryRewardsRegistered.b(writer, customScalarAdapters, onCheckoutSummaryRewardsRegistered);
            }
            CheckoutContentSummary.OnCheckoutSummaryRewardsRegisteredRedeemable onCheckoutSummaryRewardsRegisteredRedeemable = value.c;
            if (onCheckoutSummaryRewardsRegisteredRedeemable != null) {
                OnCheckoutSummaryRewardsRegisteredRedeemable.b(writer, customScalarAdapters, onCheckoutSummaryRewardsRegisteredRedeemable);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$SecondaryButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$SecondaryButton;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SecondaryButton implements Adapter<CheckoutContentSummary.SecondaryButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final SecondaryButton f22365a = new SecondaryButton();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "style", "enabled");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ButtonStyle buttonStyle = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool != null) {
                return new CheckoutContentSummary.SecondaryButton(str, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.SecondaryButton value = (CheckoutContentSummary.SecondaryButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22290a);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.b);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.c));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$Section;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$Section;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Section implements Adapter<CheckoutContentSummary.Section> {

        /* renamed from: a, reason: collision with root package name */
        public static final Section f22366a = new Section();
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
            CheckoutContentSummary.Message1 message1 = null;
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
                    message1 = (CheckoutContentSummary.Message1) Adapters.b(Adapters.c(Message1.f22320a, false)).fromJson(reader, customScalarAdapters);
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
                return new CheckoutContentSummary.Section(str, checkoutSummaryValueTypeA, str2, checkoutSummaryValueTypeA2, str3, message1);
            }
            Assertions.a(reader, "valueType");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.Section value = (CheckoutContentSummary.Section) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22291a);
            writer.F1("titleType");
            CheckoutSummaryValueType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1("value");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("valueType");
            CheckoutSummaryValueType_ResponseAdapter.b(writer, customScalarAdapters, value.d);
            writer.F1("imageUrl");
            Adapters.i.toJson(writer, customScalarAdapters, value.e);
            writer.F1("message");
            Adapters.b(Adapters.c(Message1.f22320a, false)).toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$Section1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$Section1;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Section1 implements Adapter<CheckoutContentSummary.Section1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Section1 f22367a = new Section1();
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
            CheckoutContentSummary.Message2 message2 = null;
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
                    message2 = (CheckoutContentSummary.Message2) Adapters.b(Adapters.c(Message2.f22321a, false)).fromJson(reader, customScalarAdapters);
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
                return new CheckoutContentSummary.Section1(str, checkoutSummaryValueTypeA, str2, checkoutSummaryValueTypeA2, str3, message2);
            }
            Assertions.a(reader, "valueType");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.Section1 value = (CheckoutContentSummary.Section1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22292a);
            writer.F1("titleType");
            CheckoutSummaryValueType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1("value");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("valueType");
            CheckoutSummaryValueType_ResponseAdapter.b(writer, customScalarAdapters, value.d);
            writer.F1("imageUrl");
            Adapters.i.toJson(writer, customScalarAdapters, value.e);
            writer.F1("message");
            Adapters.b(Adapters.c(Message2.f22321a, false)).toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$SellerInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$SellerInfo;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SellerInfo implements Adapter<CheckoutContentSummary.SellerInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final SellerInfo f22368a = new SellerInfo();
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
                return new CheckoutContentSummary.SellerInfo(str, str2);
            }
            Assertions.a(reader, "dispatchNote");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.SellerInfo value = (CheckoutContentSummary.SellerInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("sellerName");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22293a);
            writer.F1("dispatchNote");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$Total;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$Total;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Total implements Adapter<CheckoutContentSummary.Total> {

        /* renamed from: a, reason: collision with root package name */
        public static final Total f22369a = new Total();
        public static final List b = CollectionsKt.R("title", "value", "balanceToPay", "buttonTitle", "progressId", "isEnabled");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Double d;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Double d2 = null;
            String str = null;
            String str2 = null;
            Boolean bool = null;
            String str3 = null;
            CheckoutProgressId checkoutProgressId = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    d = d2;
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    d = d2;
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    d2 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    d = d2;
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    d = d2;
                    checkoutProgressId = (CheckoutProgressId) Adapters.b(CheckoutProgressId_ResponseAdapter.f12052a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    d = d2;
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
                d2 = d;
            }
            Double d3 = d2;
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "value");
                throw null;
            }
            if (d3 == null) {
                Assertions.a(reader, "balanceToPay");
                throw null;
            }
            Boolean bool2 = bool;
            double dDoubleValue = d3.doubleValue();
            if (str3 == null) {
                Assertions.a(reader, "buttonTitle");
                throw null;
            }
            if (bool2 != null) {
                return new CheckoutContentSummary.Total(str, str2, dDoubleValue, str3, checkoutProgressId, bool2.booleanValue());
            }
            Assertions.a(reader, "isEnabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.Total value = (CheckoutContentSummary.Total) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22294a);
            writer.F1("value");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("balanceToPay");
            Adapters.c.toJson(writer, customScalarAdapters, Double.valueOf(value.c));
            writer.F1("buttonTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("progressId");
            Adapters.b(CheckoutProgressId_ResponseAdapter.f12052a).toJson(writer, customScalarAdapters, value.e);
            writer.F1("isEnabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.f));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$UnRedeemableBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$UnRedeemableBanner;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnRedeemableBanner implements Adapter<CheckoutContentSummary.UnRedeemableBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final UnRedeemableBanner f22370a = new UnRedeemableBanner();
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
                return new CheckoutContentSummary.UnRedeemableBanner(insetBannerDisplayTypeA, str);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.UnRedeemableBanner value = (CheckoutContentSummary.UnRedeemableBanner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.f22295a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummaryImpl_ResponseAdapter$UnavailableOrderItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$UnavailableOrderItem;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnavailableOrderItem implements Adapter<CheckoutContentSummary.UnavailableOrderItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final UnavailableOrderItem f22371a = new UnavailableOrderItem();
        public static final List b = CollectionsKt.Q(AppMeasurementSdk.ConditionalUserProperty.NAME);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
            }
            return new CheckoutContentSummary.UnavailableOrderItem(str);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContentSummary.UnavailableOrderItem value = (CheckoutContentSummary.UnavailableOrderItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AppMeasurementSdk.ConditionalUserProperty.NAME);
            Adapters.i.toJson(writer, customScalarAdapters, value.f22296a);
        }
    }
}
