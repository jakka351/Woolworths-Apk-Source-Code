package com.woolworths.shop.checkout.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.AddressType;
import au.com.woolworths.shop.graphql.type.BroadcastBannerType;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.CheckoutDeliveryPreferenceId;
import au.com.woolworths.shop.graphql.type.CheckoutProgressId;
import au.com.woolworths.shop.graphql.type.CheckoutSummaryValueType;
import au.com.woolworths.shop.graphql.type.CollectionModeId;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.MarketFulfilmentAddressStatus;
import au.com.woolworths.shop.graphql.type.SubstitutionState;
import au.com.woolworths.shop.graphql.type.adapter.AddressType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.BroadcastBannerType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ButtonStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CheckoutDeliveryPreferenceId_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CheckoutProgressId_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CheckoutSummaryValueType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CollectionModeId_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionPlacement_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerDisplayType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.MarketFulfilmentAddressStatus_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.SubstitutionState_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.Adapters$DoubleAdapter$1;
import com.apollographql.apollo.api.Adapters$IntAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.storage.db.i;
import com.woolworths.shop.checkout.fragment.CheckoutCollectionAddressDeliveryImpl_ResponseAdapter;
import com.woolworths.shop.checkout.fragment.CheckoutContent;
import com.woolworths.shop.checkout.fragment.CheckoutFulfilmentWindowsImpl_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\bQ\bÇ\u0002\u0018\u00002\u00020\u0001:P\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQ¨\u0006R"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter;", "", "CheckoutContent", "ProductsInfo", "Message", "OnSnackBar", "LegacyError", "Progress", "Content", "OnInsetBanner", "Action", "OnCheckoutCollectionAddressEmpty", "OnCheckoutMarketFulfilmentAddress", "AddressData", "OnCheckoutCollectionAddressDelivery", "ShoppingModeDetails", "OnCheckoutCollectionAddressDelivery1", "OnCheckoutCollectionMethod", "Option", "Address", "OnCheckoutCollectionAddressPickup", "InsetBanner", "MarketPickupSheet", "PrimaryCta", "SecondaryCta", "ShoppingModeDetails1", "OnCheckoutFulfilmentWindows", "OnCheckoutFulfilmentWindowsEmptyState", "OnCheckoutFulfilmentWindowsSelectedState", "InlineMessage", "Windows", "OnCheckoutPackagingMethod", "Option1", "OnCheckoutDeliveryPreferenceToggle", "InlineMessage1", "OnCheckoutContactDetails", "InlineMessage2", "OnCheckoutDeliveryPreferenceText", "InputLimit", "InlineMessage3", "OnCheckoutProducts", "Substitution", "Option2", "Info", "SubstitutionPreferences", "Info1", "Product", "Instruction", "InputLimit1", "Rewards", "RemoveInfo", "CartProductInfo", "SubstitutionPreference", "Action1", "SubstitutionPreferenceOnboardingBanner", "OnCheckoutMarketProducts", "SellerGroup", "Product1", "RemoveInfo1", "CartProductInfo1", "OnCheckoutProductCampaigns", "Campaign", "CampaignInfo", "OnCheckoutSectionHeader", "OrderTotalDetails", "InlineMessage4", "Analytics", "Section", "Message1", "Total", "ReviewProducts", "UnavailableOrderItem", "RestrictedOrderItem", "ExceededSupplyLimitProductGroup", "Product2", "RestrictedProductsByDeliveryMethod", "RestrictedProductsByDeliPlatter", "AvailableOrderItem", "IdVerificationBottomSheet", "PrimaryButton", "SecondaryButton", "RestrictionPrompt", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CheckoutContentImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$Action;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Action;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action implements Adapter<CheckoutContent.Action> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action f22142a = new Action();
        public static final List b = CollectionsKt.R("placement", "type", AnnotatedPrivateKey.LABEL, "url");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerActionPlacement insetBannerActionPlacementA = null;
            InsetBannerActionType insetBannerActionTypeA = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    insetBannerActionPlacementA = InsetBannerActionPlacement_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    insetBannerActionTypeA = InsetBannerActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerActionPlacementA == null) {
                Assertions.a(reader, "placement");
                throw null;
            }
            if (insetBannerActionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str != null) {
                return new CheckoutContent.Action(insetBannerActionPlacementA, insetBannerActionTypeA, str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.Action value = (CheckoutContent.Action) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("placement");
            InsetBannerActionPlacement_ResponseAdapter.b(writer, customScalarAdapters, value.f22063a);
            writer.F1("type");
            InsetBannerActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$Action1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Action1;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action1 implements Adapter<CheckoutContent.Action1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action1 f22143a = new Action1();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "enabled");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
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
                return new CheckoutContent.Action1(str, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.Action1 value = (CheckoutContent.Action1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22064a);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.b));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$Address;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Address;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Address implements Adapter<CheckoutContent.Address> {

        /* renamed from: a, reason: collision with root package name */
        public static final Address f22144a = new Address();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            CheckoutContent.OnCheckoutCollectionAddressPickup onCheckoutCollectionAddressPickupA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            CheckoutCollectionAddressDelivery checkoutCollectionAddressDeliveryA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CheckoutCollectionAddressPickup"))) {
                reader.o();
                onCheckoutCollectionAddressPickupA = OnCheckoutCollectionAddressPickup.a(reader, customScalarAdapters);
            } else {
                onCheckoutCollectionAddressPickupA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CheckoutCollectionAddressDelivery"))) {
                reader.o();
                checkoutCollectionAddressDeliveryA = CheckoutCollectionAddressDeliveryImpl_ResponseAdapter.CheckoutCollectionAddressDelivery.a(reader, customScalarAdapters);
            }
            return new CheckoutContent.Address(str, onCheckoutCollectionAddressPickupA, checkoutCollectionAddressDeliveryA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.Address value = (CheckoutContent.Address) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22065a);
            CheckoutContent.OnCheckoutCollectionAddressPickup onCheckoutCollectionAddressPickup = value.b;
            if (onCheckoutCollectionAddressPickup != null) {
                OnCheckoutCollectionAddressPickup.b(writer, customScalarAdapters, onCheckoutCollectionAddressPickup);
            }
            CheckoutCollectionAddressDelivery checkoutCollectionAddressDelivery = value.c;
            if (checkoutCollectionAddressDelivery != null) {
                CheckoutCollectionAddressDeliveryImpl_ResponseAdapter.CheckoutCollectionAddressDelivery.b(writer, customScalarAdapters, checkoutCollectionAddressDelivery);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$AddressData;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$AddressData;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AddressData implements Adapter<CheckoutContent.AddressData> {

        /* renamed from: a, reason: collision with root package name */
        public static final AddressData f22145a = new AddressData();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CheckoutContent.OnCheckoutCollectionAddressDelivery onCheckoutCollectionAddressDeliveryA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("CheckoutCollectionAddressDelivery"))) {
                reader.o();
                onCheckoutCollectionAddressDeliveryA = OnCheckoutCollectionAddressDelivery.a(reader, customScalarAdapters);
            }
            return new CheckoutContent.AddressData(str, onCheckoutCollectionAddressDeliveryA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.AddressData value = (CheckoutContent.AddressData) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22066a);
            CheckoutContent.OnCheckoutCollectionAddressDelivery onCheckoutCollectionAddressDelivery = value.b;
            if (onCheckoutCollectionAddressDelivery != null) {
                List list = OnCheckoutCollectionAddressDelivery.f22171a;
                writer.F1("modeId");
                CollectionModeId_ResponseAdapter.b(writer, customScalarAdapters, onCheckoutCollectionAddressDelivery.f22091a);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Analytics;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<CheckoutContent.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f22146a = new Analytics();
        public static final List b = CollectionsKt.R("eventLabel", "eventDescription", "eventValue");

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
                        return new CheckoutContent.Analytics(str, str2, str3);
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.Analytics value = (CheckoutContent.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("eventLabel");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f22067a);
            writer.F1("eventDescription");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("eventValue");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$AvailableOrderItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$AvailableOrderItem;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AvailableOrderItem implements Adapter<CheckoutContent.AvailableOrderItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final AvailableOrderItem f22147a = new AvailableOrderItem();
        public static final List b = CollectionsKt.Q(AppMeasurementSdk.ConditionalUserProperty.NAME);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
            }
            return new CheckoutContent.AvailableOrderItem(str);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.AvailableOrderItem value = (CheckoutContent.AvailableOrderItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AppMeasurementSdk.ConditionalUserProperty.NAME);
            Adapters.i.toJson(writer, customScalarAdapters, value.f22068a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$Campaign;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Campaign;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Campaign implements Adapter<CheckoutContent.Campaign> {

        /* renamed from: a, reason: collision with root package name */
        public static final Campaign f22148a = new Campaign();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "id", "imageUrl", "isOptedIn", "campaignInfo");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            String str4 = null;
            CheckoutContent.CampaignInfo campaignInfo = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        num = num2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        num = num2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        num = num2;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        continue;
                    case 4:
                        num = num2;
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        num = num2;
                        bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        campaignInfo = (CheckoutContent.CampaignInfo) Adapters.c(CampaignInfo.f22149a, false).fromJson(reader, customScalarAdapters);
                        num2 = num2;
                        bool = bool;
                        continue;
                    default:
                        Integer num3 = num2;
                        if (str == null) {
                            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
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
                        if (num3 == null) {
                            Assertions.a(reader, "id");
                            throw null;
                        }
                        Boolean bool2 = bool;
                        int iIntValue = num3.intValue();
                        if (str4 == null) {
                            Assertions.a(reader, "imageUrl");
                            throw null;
                        }
                        if (bool2 == null) {
                            Assertions.a(reader, "isOptedIn");
                            throw null;
                        }
                        boolean zBooleanValue = bool2.booleanValue();
                        if (campaignInfo != null) {
                            return new CheckoutContent.Campaign(str, str2, str3, iIntValue, str4, zBooleanValue, campaignInfo);
                        }
                        Assertions.a(reader, "campaignInfo");
                        throw null;
                }
                num2 = num;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.Campaign value = (CheckoutContent.Campaign) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22069a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("id");
            d.y(value.d, Adapters.b, writer, customScalarAdapters, "imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("isOptedIn");
            d.B(value.f, Adapters.f, writer, customScalarAdapters, "campaignInfo");
            Adapters.c(CampaignInfo.f22149a, false).toJson(writer, customScalarAdapters, value.g);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$CampaignInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$CampaignInfo;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CampaignInfo implements Adapter<CheckoutContent.CampaignInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final CampaignInfo f22149a = new CampaignInfo();
        public static final List b = CollectionsKt.R("message", "buttonTitle");

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
                Assertions.a(reader, "message");
                throw null;
            }
            if (str2 != null) {
                return new CheckoutContent.CampaignInfo(str, str2);
            }
            Assertions.a(reader, "buttonTitle");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.CampaignInfo value = (CheckoutContent.CampaignInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("message");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22070a);
            writer.F1("buttonTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$CartProductInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$CartProductInfo;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CartProductInfo implements Adapter<CheckoutContent.CartProductInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final CartProductInfo f22150a = new CartProductInfo();
        public static final List b = CollectionsKt.R("totalPrice", "totalOriginalPrice", "totalDiscount");

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
                        return new CheckoutContent.CartProductInfo(str, str2, str3);
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.CartProductInfo value = (CheckoutContent.CartProductInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("totalPrice");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f22071a);
            writer.F1("totalOriginalPrice");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("totalDiscount");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$CartProductInfo1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$CartProductInfo1;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CartProductInfo1 implements Adapter<CheckoutContent.CartProductInfo1> {

        /* renamed from: a, reason: collision with root package name */
        public static final CartProductInfo1 f22151a = new CartProductInfo1();
        public static final List b = CollectionsKt.R("totalPrice", "totalOriginalPrice", "totalDiscount");

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
                        return new CheckoutContent.CartProductInfo1(str, str2, str3);
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.CartProductInfo1 value = (CheckoutContent.CartProductInfo1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("totalPrice");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f22072a);
            writer.F1("totalOriginalPrice");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("totalDiscount");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$CheckoutContent;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CheckoutContent implements Adapter<com.woolworths.shop.checkout.fragment.CheckoutContent> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22152a = CollectionsKt.R("productsInfo", "message", "legacyErrors", "progress", "content", "orderTotalDetails", "idVerificationBottomSheet", "restrictionPrompt");

        public static com.woolworths.shop.checkout.fragment.CheckoutContent a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            List list = null;
            CheckoutContent.Message message = null;
            ArrayList arrayListFromJson = null;
            ArrayList arrayListFromJson2 = null;
            ArrayList arrayListFromJson3 = null;
            CheckoutContent.OrderTotalDetails orderTotalDetails = null;
            CheckoutContent.IdVerificationBottomSheet idVerificationBottomSheet = null;
            CheckoutContent.RestrictionPrompt restrictionPrompt = null;
            while (true) {
                switch (reader.o2(f22152a)) {
                    case 0:
                        list = (List) Adapters.b(Adapters.a(Adapters.c(ProductsInfo.f22199a, false))).fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        message = (CheckoutContent.Message) Adapters.b(Adapters.c(Message.f22169a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        arrayListFromJson = Adapters.a(Adapters.c(LegacyError.f22167a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        arrayListFromJson2 = Adapters.a(Adapters.c(Progress.f22200a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        arrayListFromJson3 = Adapters.a(Adapters.c(Content.f22153a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        orderTotalDetails = (CheckoutContent.OrderTotalDetails) Adapters.c(OrderTotalDetails.f22193a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        idVerificationBottomSheet = (CheckoutContent.IdVerificationBottomSheet) Adapters.b(Adapters.c(IdVerificationBottomSheet.f22155a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        restrictionPrompt = (CheckoutContent.RestrictionPrompt) Adapters.b(Adapters.c(RestrictionPrompt.f22206a, false)).fromJson(reader, customScalarAdapters);
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
                            return new com.woolworths.shop.checkout.fragment.CheckoutContent(list, message, arrayListFromJson, arrayListFromJson2, arrayListFromJson3, orderTotalDetails, idVerificationBottomSheet, restrictionPrompt);
                        }
                        Assertions.a(reader, "orderTotalDetails");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, com.woolworths.shop.checkout.fragment.CheckoutContent value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productsInfo");
            Adapters.b(Adapters.a(Adapters.c(ProductsInfo.f22199a, false))).toJson(writer, customScalarAdapters, value.f22062a);
            writer.F1("message");
            Adapters.b(Adapters.c(Message.f22169a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("legacyErrors");
            Adapters.a(Adapters.c(LegacyError.f22167a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("progress");
            Adapters.a(Adapters.c(Progress.f22200a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("content");
            Adapters.a(Adapters.c(Content.f22153a, true)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("orderTotalDetails");
            Adapters.c(OrderTotalDetails.f22193a, false).toJson(writer, customScalarAdapters, value.f);
            writer.F1("idVerificationBottomSheet");
            Adapters.b(Adapters.c(IdVerificationBottomSheet.f22155a, false)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("restrictionPrompt");
            Adapters.b(Adapters.c(RestrictionPrompt.f22206a, false)).toJson(writer, customScalarAdapters, value.h);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (com.woolworths.shop.checkout.fragment.CheckoutContent) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$Content;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Content;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Content implements Adapter<CheckoutContent.Content> {

        /* renamed from: a, reason: collision with root package name */
        public static final Content f22153a = new Content();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            CheckoutContent.OnInsetBanner onInsetBannerA;
            CheckoutContent.OnCheckoutCollectionAddressEmpty onCheckoutCollectionAddressEmptyA;
            CheckoutContent.OnCheckoutMarketFulfilmentAddress onCheckoutMarketFulfilmentAddressA;
            CheckoutContent.OnCheckoutCollectionAddressDelivery1 onCheckoutCollectionAddressDelivery1A;
            CheckoutContent.OnCheckoutCollectionMethod onCheckoutCollectionMethodA;
            CheckoutContent.OnCheckoutFulfilmentWindows onCheckoutFulfilmentWindowsA;
            CheckoutContent.OnCheckoutFulfilmentWindowsEmptyState onCheckoutFulfilmentWindowsEmptyStateA;
            CheckoutContent.OnCheckoutFulfilmentWindowsSelectedState onCheckoutFulfilmentWindowsSelectedStateA;
            CheckoutContent.OnCheckoutPackagingMethod onCheckoutPackagingMethodA;
            CheckoutContent.OnCheckoutDeliveryPreferenceToggle onCheckoutDeliveryPreferenceToggleA;
            CheckoutContent.OnCheckoutContactDetails onCheckoutContactDetailsA;
            CheckoutContent.OnCheckoutDeliveryPreferenceText onCheckoutDeliveryPreferenceTextA;
            CheckoutContent.OnCheckoutProducts onCheckoutProductsA;
            CheckoutContent.OnCheckoutMarketProducts onCheckoutMarketProductsA;
            CheckoutContent.OnCheckoutProductCampaigns onCheckoutProductCampaignsA;
            CheckoutContent.OnCheckoutSectionHeader onCheckoutSectionHeaderA;
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
            if (a.C(set2, set, null, str, BooleanExpressions.c("CheckoutCollectionAddressEmpty"))) {
                reader.o();
                onCheckoutCollectionAddressEmptyA = OnCheckoutCollectionAddressEmpty.a(reader, customScalarAdapters);
            } else {
                onCheckoutCollectionAddressEmptyA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CheckoutMarketFulfilmentAddress"))) {
                reader.o();
                onCheckoutMarketFulfilmentAddressA = OnCheckoutMarketFulfilmentAddress.a(reader, customScalarAdapters);
            } else {
                onCheckoutMarketFulfilmentAddressA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CheckoutCollectionAddressDelivery"))) {
                reader.o();
                onCheckoutCollectionAddressDelivery1A = OnCheckoutCollectionAddressDelivery1.a(reader, customScalarAdapters);
            } else {
                onCheckoutCollectionAddressDelivery1A = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CheckoutCollectionMethod"))) {
                reader.o();
                onCheckoutCollectionMethodA = OnCheckoutCollectionMethod.a(reader, customScalarAdapters);
            } else {
                onCheckoutCollectionMethodA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CheckoutFulfilmentWindows"))) {
                reader.o();
                onCheckoutFulfilmentWindowsA = OnCheckoutFulfilmentWindows.a(reader, customScalarAdapters);
            } else {
                onCheckoutFulfilmentWindowsA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CheckoutFulfilmentWindowsEmptyState"))) {
                reader.o();
                onCheckoutFulfilmentWindowsEmptyStateA = OnCheckoutFulfilmentWindowsEmptyState.a(reader, customScalarAdapters);
            } else {
                onCheckoutFulfilmentWindowsEmptyStateA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CheckoutFulfilmentWindowsSelectedState"))) {
                reader.o();
                onCheckoutFulfilmentWindowsSelectedStateA = OnCheckoutFulfilmentWindowsSelectedState.a(reader, customScalarAdapters);
            } else {
                onCheckoutFulfilmentWindowsSelectedStateA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CheckoutPackagingMethod"))) {
                reader.o();
                onCheckoutPackagingMethodA = OnCheckoutPackagingMethod.a(reader, customScalarAdapters);
            } else {
                onCheckoutPackagingMethodA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CheckoutDeliveryPreferenceToggle"))) {
                reader.o();
                onCheckoutDeliveryPreferenceToggleA = OnCheckoutDeliveryPreferenceToggle.a(reader, customScalarAdapters);
            } else {
                onCheckoutDeliveryPreferenceToggleA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("CheckoutContactDetails"), BooleanExpressions.d("includeContactDetails")))) {
                reader.o();
                onCheckoutContactDetailsA = OnCheckoutContactDetails.a(reader, customScalarAdapters);
            } else {
                onCheckoutContactDetailsA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CheckoutDeliveryPreferenceText"))) {
                reader.o();
                onCheckoutDeliveryPreferenceTextA = OnCheckoutDeliveryPreferenceText.a(reader, customScalarAdapters);
            } else {
                onCheckoutDeliveryPreferenceTextA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CheckoutProducts"))) {
                reader.o();
                onCheckoutProductsA = OnCheckoutProducts.a(reader, customScalarAdapters);
            } else {
                onCheckoutProductsA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CheckoutMarketProducts"))) {
                reader.o();
                onCheckoutMarketProductsA = OnCheckoutMarketProducts.a(reader, customScalarAdapters);
            } else {
                onCheckoutMarketProductsA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CheckoutProductCampaigns"))) {
                reader.o();
                onCheckoutProductCampaignsA = OnCheckoutProductCampaigns.a(reader, customScalarAdapters);
            } else {
                onCheckoutProductCampaignsA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CheckoutSectionHeader"))) {
                reader.o();
                onCheckoutSectionHeaderA = OnCheckoutSectionHeader.a(reader, customScalarAdapters);
            } else {
                onCheckoutSectionHeaderA = null;
            }
            return new CheckoutContent.Content(str, onInsetBannerA, onCheckoutCollectionAddressEmptyA, onCheckoutMarketFulfilmentAddressA, onCheckoutCollectionAddressDelivery1A, onCheckoutCollectionMethodA, onCheckoutFulfilmentWindowsA, onCheckoutFulfilmentWindowsEmptyStateA, onCheckoutFulfilmentWindowsSelectedStateA, onCheckoutPackagingMethodA, onCheckoutDeliveryPreferenceToggleA, onCheckoutContactDetailsA, onCheckoutDeliveryPreferenceTextA, onCheckoutProductsA, onCheckoutMarketProductsA, onCheckoutProductCampaignsA, onCheckoutSectionHeaderA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.Content value = (CheckoutContent.Content) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22073a);
            CheckoutContent.OnInsetBanner onInsetBanner = value.b;
            if (onInsetBanner != null) {
                OnInsetBanner.b(writer, customScalarAdapters, onInsetBanner);
            }
            CheckoutContent.OnCheckoutCollectionAddressEmpty onCheckoutCollectionAddressEmpty = value.c;
            if (onCheckoutCollectionAddressEmpty != null) {
                OnCheckoutCollectionAddressEmpty.b(writer, customScalarAdapters, onCheckoutCollectionAddressEmpty);
            }
            CheckoutContent.OnCheckoutMarketFulfilmentAddress onCheckoutMarketFulfilmentAddress = value.d;
            if (onCheckoutMarketFulfilmentAddress != null) {
                OnCheckoutMarketFulfilmentAddress.b(writer, customScalarAdapters, onCheckoutMarketFulfilmentAddress);
            }
            CheckoutContent.OnCheckoutCollectionAddressDelivery1 onCheckoutCollectionAddressDelivery1 = value.e;
            if (onCheckoutCollectionAddressDelivery1 != null) {
                OnCheckoutCollectionAddressDelivery1.b(writer, customScalarAdapters, onCheckoutCollectionAddressDelivery1);
            }
            CheckoutContent.OnCheckoutCollectionMethod onCheckoutCollectionMethod = value.f;
            if (onCheckoutCollectionMethod != null) {
                OnCheckoutCollectionMethod.b(writer, customScalarAdapters, onCheckoutCollectionMethod);
            }
            CheckoutContent.OnCheckoutFulfilmentWindows onCheckoutFulfilmentWindows = value.g;
            if (onCheckoutFulfilmentWindows != null) {
                OnCheckoutFulfilmentWindows.b(writer, customScalarAdapters, onCheckoutFulfilmentWindows);
            }
            CheckoutContent.OnCheckoutFulfilmentWindowsEmptyState onCheckoutFulfilmentWindowsEmptyState = value.h;
            if (onCheckoutFulfilmentWindowsEmptyState != null) {
                OnCheckoutFulfilmentWindowsEmptyState.b(writer, customScalarAdapters, onCheckoutFulfilmentWindowsEmptyState);
            }
            CheckoutContent.OnCheckoutFulfilmentWindowsSelectedState onCheckoutFulfilmentWindowsSelectedState = value.i;
            if (onCheckoutFulfilmentWindowsSelectedState != null) {
                OnCheckoutFulfilmentWindowsSelectedState.b(writer, customScalarAdapters, onCheckoutFulfilmentWindowsSelectedState);
            }
            CheckoutContent.OnCheckoutPackagingMethod onCheckoutPackagingMethod = value.j;
            if (onCheckoutPackagingMethod != null) {
                OnCheckoutPackagingMethod.b(writer, customScalarAdapters, onCheckoutPackagingMethod);
            }
            CheckoutContent.OnCheckoutDeliveryPreferenceToggle onCheckoutDeliveryPreferenceToggle = value.k;
            if (onCheckoutDeliveryPreferenceToggle != null) {
                OnCheckoutDeliveryPreferenceToggle.b(writer, customScalarAdapters, onCheckoutDeliveryPreferenceToggle);
            }
            CheckoutContent.OnCheckoutContactDetails onCheckoutContactDetails = value.l;
            if (onCheckoutContactDetails != null) {
                OnCheckoutContactDetails.b(writer, customScalarAdapters, onCheckoutContactDetails);
            }
            CheckoutContent.OnCheckoutDeliveryPreferenceText onCheckoutDeliveryPreferenceText = value.m;
            if (onCheckoutDeliveryPreferenceText != null) {
                OnCheckoutDeliveryPreferenceText.b(writer, customScalarAdapters, onCheckoutDeliveryPreferenceText);
            }
            CheckoutContent.OnCheckoutProducts onCheckoutProducts = value.n;
            if (onCheckoutProducts != null) {
                OnCheckoutProducts.b(writer, customScalarAdapters, onCheckoutProducts);
            }
            CheckoutContent.OnCheckoutMarketProducts onCheckoutMarketProducts = value.o;
            if (onCheckoutMarketProducts != null) {
                OnCheckoutMarketProducts.b(writer, customScalarAdapters, onCheckoutMarketProducts);
            }
            CheckoutContent.OnCheckoutProductCampaigns onCheckoutProductCampaigns = value.p;
            if (onCheckoutProductCampaigns != null) {
                OnCheckoutProductCampaigns.b(writer, customScalarAdapters, onCheckoutProductCampaigns);
            }
            CheckoutContent.OnCheckoutSectionHeader onCheckoutSectionHeader = value.q;
            if (onCheckoutSectionHeader != null) {
                OnCheckoutSectionHeader.b(writer, customScalarAdapters, onCheckoutSectionHeader);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$ExceededSupplyLimitProductGroup;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$ExceededSupplyLimitProductGroup;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ExceededSupplyLimitProductGroup implements Adapter<CheckoutContent.ExceededSupplyLimitProductGroup> {

        /* renamed from: a, reason: collision with root package name */
        public static final ExceededSupplyLimitProductGroup f22154a = new ExceededSupplyLimitProductGroup();
        public static final List b = CollectionsKt.Q("products");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(b) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(Product2.f22198a, false)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new CheckoutContent.ExceededSupplyLimitProductGroup(arrayListFromJson);
            }
            Assertions.a(reader, "products");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.ExceededSupplyLimitProductGroup value = (CheckoutContent.ExceededSupplyLimitProductGroup) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("products");
            Adapters.a(Adapters.c(Product2.f22198a, false)).toJson(writer, customScalarAdapters, value.f22074a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$IdVerificationBottomSheet;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$IdVerificationBottomSheet;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IdVerificationBottomSheet implements Adapter<CheckoutContent.IdVerificationBottomSheet> {

        /* renamed from: a, reason: collision with root package name */
        public static final IdVerificationBottomSheet f22155a = new IdVerificationBottomSheet();
        public static final List b = CollectionsKt.R("title", "body", "imageUrls", "primaryButton", "secondaryButton");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            CheckoutContent.PrimaryButton primaryButton = null;
            CheckoutContent.SecondaryButton secondaryButton = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    primaryButton = (CheckoutContent.PrimaryButton) Adapters.b(Adapters.c(PrimaryButton.f22194a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    secondaryButton = (CheckoutContent.SecondaryButton) Adapters.b(Adapters.c(SecondaryButton.f22209a, false)).fromJson(reader, customScalarAdapters);
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
                return new CheckoutContent.IdVerificationBottomSheet(str, str2, arrayListFromJson, primaryButton, secondaryButton);
            }
            Assertions.a(reader, "imageUrls");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.IdVerificationBottomSheet value = (CheckoutContent.IdVerificationBottomSheet) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22075a);
            writer.F1("body");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("imageUrls");
            Adapters.a(adapters$StringAdapter$1).toJson(writer, customScalarAdapters, value.c);
            writer.F1("primaryButton");
            Adapters.b(Adapters.c(PrimaryButton.f22194a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("secondaryButton");
            Adapters.b(Adapters.c(SecondaryButton.f22209a, false)).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$Info;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Info;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Info implements Adapter<CheckoutContent.Info> {

        /* renamed from: a, reason: collision with root package name */
        public static final Info f22156a = new Info();
        public static final List b = CollectionsKt.R("title", "message", "buttonTitle");

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
                return new CheckoutContent.Info(str, str2, str3);
            }
            Assertions.a(reader, "buttonTitle");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.Info value = (CheckoutContent.Info) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22076a);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("buttonTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$Info1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Info1;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Info1 implements Adapter<CheckoutContent.Info1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Info1 f22157a = new Info1();
        public static final List b = CollectionsKt.R("title", "message", "buttonTitle");

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
                return new CheckoutContent.Info1(str, str2, str3);
            }
            Assertions.a(reader, "buttonTitle");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.Info1 value = (CheckoutContent.Info1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22077a);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("buttonTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$InlineMessage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$InlineMessage;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InlineMessage implements Adapter<CheckoutContent.InlineMessage> {

        /* renamed from: a, reason: collision with root package name */
        public static final InlineMessage f22158a = new InlineMessage();
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
                return new CheckoutContent.InlineMessage(insetBannerDisplayTypeA, str);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.InlineMessage value = (CheckoutContent.InlineMessage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.f22078a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$InlineMessage1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$InlineMessage1;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InlineMessage1 implements Adapter<CheckoutContent.InlineMessage1> {

        /* renamed from: a, reason: collision with root package name */
        public static final InlineMessage1 f22159a = new InlineMessage1();
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
                return new CheckoutContent.InlineMessage1(insetBannerDisplayTypeA, str);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.InlineMessage1 value = (CheckoutContent.InlineMessage1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.f22079a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$InlineMessage2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$InlineMessage2;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InlineMessage2 implements Adapter<CheckoutContent.InlineMessage2> {

        /* renamed from: a, reason: collision with root package name */
        public static final InlineMessage2 f22160a = new InlineMessage2();
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
                return new CheckoutContent.InlineMessage2(insetBannerDisplayTypeA, str);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.InlineMessage2 value = (CheckoutContent.InlineMessage2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.f22080a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$InlineMessage3;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$InlineMessage3;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InlineMessage3 implements Adapter<CheckoutContent.InlineMessage3> {

        /* renamed from: a, reason: collision with root package name */
        public static final InlineMessage3 f22161a = new InlineMessage3();
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
                return new CheckoutContent.InlineMessage3(insetBannerDisplayTypeA, str);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.InlineMessage3 value = (CheckoutContent.InlineMessage3) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.f22081a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$InlineMessage4;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$InlineMessage4;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InlineMessage4 implements Adapter<CheckoutContent.InlineMessage4> {

        /* renamed from: a, reason: collision with root package name */
        public static final InlineMessage4 f22162a = new InlineMessage4();
        public static final List b = CollectionsKt.R("displayType", "message", "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            String str = null;
            CheckoutContent.Analytics analytics = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    insetBannerDisplayTypeA = InsetBannerDisplayType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    analytics = (CheckoutContent.Analytics) Adapters.b(Adapters.c(Analytics.f22146a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerDisplayTypeA == null) {
                Assertions.a(reader, "displayType");
                throw null;
            }
            if (str != null) {
                return new CheckoutContent.InlineMessage4(insetBannerDisplayTypeA, str, analytics);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.InlineMessage4 value = (CheckoutContent.InlineMessage4) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.f22082a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics.f22146a, false)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$InputLimit;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$InputLimit;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputLimit implements Adapter<CheckoutContent.InputLimit> {

        /* renamed from: a, reason: collision with root package name */
        public static final InputLimit f22163a = new InputLimit();
        public static final List b = CollectionsKt.R("maxLength", "warningOffset");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Integer num2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                }
            }
            if (num == null) {
                Assertions.a(reader, "maxLength");
                throw null;
            }
            int iIntValue = num.intValue();
            if (num2 != null) {
                return new CheckoutContent.InputLimit(iIntValue, num2.intValue());
            }
            Assertions.a(reader, "warningOffset");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.InputLimit value = (CheckoutContent.InputLimit) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("maxLength");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.f22083a, adapters$IntAdapter$1, writer, customScalarAdapters, "warningOffset");
            adapters$IntAdapter$1.toJson(writer, customScalarAdapters, Integer.valueOf(value.b));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$InputLimit1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$InputLimit1;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputLimit1 implements Adapter<CheckoutContent.InputLimit1> {

        /* renamed from: a, reason: collision with root package name */
        public static final InputLimit1 f22164a = new InputLimit1();
        public static final List b = CollectionsKt.R("maxLength", "warningOffset");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Integer num2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                }
            }
            if (num == null) {
                Assertions.a(reader, "maxLength");
                throw null;
            }
            int iIntValue = num.intValue();
            if (num2 != null) {
                return new CheckoutContent.InputLimit1(iIntValue, num2.intValue());
            }
            Assertions.a(reader, "warningOffset");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.InputLimit1 value = (CheckoutContent.InputLimit1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("maxLength");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.f22084a, adapters$IntAdapter$1, writer, customScalarAdapters, "warningOffset");
            adapters$IntAdapter$1.toJson(writer, customScalarAdapters, Integer.valueOf(value.b));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$InsetBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$InsetBanner;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InsetBanner implements Adapter<CheckoutContent.InsetBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final InsetBanner f22165a = new InsetBanner();
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
                return new CheckoutContent.InsetBanner(insetBannerDisplayTypeA, str);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.InsetBanner value = (CheckoutContent.InsetBanner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.f22085a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$Instruction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Instruction;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Instruction implements Adapter<CheckoutContent.Instruction> {

        /* renamed from: a, reason: collision with root package name */
        public static final Instruction f22166a = new Instruction();
        public static final List b = CollectionsKt.R(TextBundle.TEXT_ENTRY, "title", AnnotatedPrivateKey.LABEL, "placeholderText", "buttonTitle", "inputLimit");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            CheckoutContent.InputLimit1 inputLimit1 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    inputLimit1 = (CheckoutContent.InputLimit1) Adapters.b(Adapters.c(InputLimit1.f22164a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (str5 != null) {
                return new CheckoutContent.Instruction(str, str2, str3, str4, str5, inputLimit1);
            }
            Assertions.a(reader, "buttonTitle");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.Instruction value = (CheckoutContent.Instruction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f22086a);
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(AnnotatedPrivateKey.LABEL);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("placeholderText");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("buttonTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("inputLimit");
            Adapters.b(Adapters.c(InputLimit1.f22164a, false)).toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$LegacyError;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$LegacyError;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LegacyError implements Adapter<CheckoutContent.LegacyError> {

        /* renamed from: a, reason: collision with root package name */
        public static final LegacyError f22167a = new LegacyError();
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
                return new CheckoutContent.LegacyError(iIntValue, str, str2);
            }
            Assertions.a(reader, "key");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.LegacyError value = (CheckoutContent.LegacyError) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("errorCode");
            d.y(value.f22087a, Adapters.b, writer, customScalarAdapters, "message");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("key");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$MarketPickupSheet;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$MarketPickupSheet;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MarketPickupSheet implements Adapter<CheckoutContent.MarketPickupSheet> {

        /* renamed from: a, reason: collision with root package name */
        public static final MarketPickupSheet f22168a = new MarketPickupSheet();
        public static final List b = CollectionsKt.R("bottomSheetTitle", "bottomSheetBody", "showOnceOnly", "primaryCta", "secondaryCta");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            Boolean bool = null;
            CheckoutContent.PrimaryCta primaryCta = null;
            CheckoutContent.SecondaryCta secondaryCta = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    primaryCta = (CheckoutContent.PrimaryCta) Adapters.b(Adapters.c(PrimaryCta.f22195a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    secondaryCta = (CheckoutContent.SecondaryCta) Adapters.b(Adapters.c(SecondaryCta.f22210a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "bottomSheetTitle");
                throw null;
            }
            if (str2 != null) {
                return new CheckoutContent.MarketPickupSheet(str, str2, bool, primaryCta, secondaryCta);
            }
            Assertions.a(reader, "bottomSheetBody");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.MarketPickupSheet value = (CheckoutContent.MarketPickupSheet) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("bottomSheetTitle");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22088a);
            writer.F1("bottomSheetBody");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("showOnceOnly");
            Adapters.l.toJson(writer, customScalarAdapters, value.c);
            writer.F1("primaryCta");
            Adapters.b(Adapters.c(PrimaryCta.f22195a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("secondaryCta");
            Adapters.b(Adapters.c(SecondaryCta.f22210a, false)).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$Message;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Message;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Message implements Adapter<CheckoutContent.Message> {

        /* renamed from: a, reason: collision with root package name */
        public static final Message f22169a = new Message();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CheckoutContent.OnSnackBar onSnackBarA = null;
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
            return new CheckoutContent.Message(str, onSnackBarA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.Message value = (CheckoutContent.Message) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22089a);
            CheckoutContent.OnSnackBar onSnackBar = value.b;
            if (onSnackBar != null) {
                OnSnackBar.b(writer, customScalarAdapters, onSnackBar);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$Message1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Message1;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Message1 implements Adapter<CheckoutContent.Message1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Message1 f22170a = new Message1();
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
                        return new CheckoutContent.Message1(str, str2, str3);
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.Message1 value = (CheckoutContent.Message1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f22090a);
            writer.F1("body");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("type");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$OnCheckoutCollectionAddressDelivery;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutCollectionAddressDelivery;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutCollectionAddressDelivery implements Adapter<CheckoutContent.OnCheckoutCollectionAddressDelivery> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22171a = CollectionsKt.Q("modeId");

        public static CheckoutContent.OnCheckoutCollectionAddressDelivery a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CollectionModeId collectionModeIdA = null;
            while (reader.o2(f22171a) == 0) {
                collectionModeIdA = CollectionModeId_ResponseAdapter.a(reader, customScalarAdapters);
            }
            if (collectionModeIdA != null) {
                return new CheckoutContent.OnCheckoutCollectionAddressDelivery(collectionModeIdA);
            }
            Assertions.a(reader, "modeId");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.OnCheckoutCollectionAddressDelivery value = (CheckoutContent.OnCheckoutCollectionAddressDelivery) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("modeId");
            CollectionModeId_ResponseAdapter.b(writer, customScalarAdapters, value.f22091a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$OnCheckoutCollectionAddressDelivery1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutCollectionAddressDelivery1;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutCollectionAddressDelivery1 implements Adapter<CheckoutContent.OnCheckoutCollectionAddressDelivery1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22172a = CollectionsKt.Q("__typename");

        public static CheckoutContent.OnCheckoutCollectionAddressDelivery1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f22172a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            CheckoutCollectionAddressDelivery checkoutCollectionAddressDeliveryA = CheckoutCollectionAddressDeliveryImpl_ResponseAdapter.CheckoutCollectionAddressDelivery.a(reader, customScalarAdapters);
            if (str != null) {
                return new CheckoutContent.OnCheckoutCollectionAddressDelivery1(str, checkoutCollectionAddressDeliveryA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContent.OnCheckoutCollectionAddressDelivery1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22092a);
            List list = CheckoutCollectionAddressDeliveryImpl_ResponseAdapter.CheckoutCollectionAddressDelivery.f22061a;
            CheckoutCollectionAddressDeliveryImpl_ResponseAdapter.CheckoutCollectionAddressDelivery.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContent.OnCheckoutCollectionAddressDelivery1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$OnCheckoutCollectionAddressEmpty;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutCollectionAddressEmpty;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutCollectionAddressEmpty implements Adapter<CheckoutContent.OnCheckoutCollectionAddressEmpty> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22173a = CollectionsKt.R("title", "displayName", "buttonText");

        public static CheckoutContent.OnCheckoutCollectionAddressEmpty a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(f22173a);
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
                return new CheckoutContent.OnCheckoutCollectionAddressEmpty(str, str2, str3);
            }
            Assertions.a(reader, "buttonText");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContent.OnCheckoutCollectionAddressEmpty value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22093a);
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
            b(jsonWriter, customScalarAdapters, (CheckoutContent.OnCheckoutCollectionAddressEmpty) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$OnCheckoutCollectionAddressPickup;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutCollectionAddressPickup;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutCollectionAddressPickup implements Adapter<CheckoutContent.OnCheckoutCollectionAddressPickup> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22174a = CollectionsKt.R("title", "modeId", "storeId", TextBundle.TEXT_ENTRY, "addressId", "displayName", "addressImageUrl", "buttonText", AnnotatedPrivateKey.LABEL);

        public static CheckoutContent.OnCheckoutCollectionAddressPickup a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            String str = null;
            CollectionModeId collectionModeIdA = null;
            Integer num3 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            while (true) {
                switch (reader.o2(f22174a)) {
                    case 0:
                        num = num2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        collectionModeIdA = CollectionModeId_ResponseAdapter.a(reader, customScalarAdapters);
                        continue;
                    case 2:
                        num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        continue;
                    case 3:
                        num = num2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        num = num2;
                        num3 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        num = num2;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        num = num2;
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        num = num2;
                        str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        num = num2;
                        str6 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Integer num4 = num2;
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (collectionModeIdA == null) {
                            Assertions.a(reader, "modeId");
                            throw null;
                        }
                        if (num4 == null) {
                            Assertions.a(reader, "storeId");
                            throw null;
                        }
                        Integer num5 = num3;
                        int iIntValue = num4.intValue();
                        if (str2 == null) {
                            Assertions.a(reader, TextBundle.TEXT_ENTRY);
                            throw null;
                        }
                        if (num5 == null) {
                            Assertions.a(reader, "addressId");
                            throw null;
                        }
                        int iIntValue2 = num5.intValue();
                        if (str3 == null) {
                            Assertions.a(reader, "displayName");
                            throw null;
                        }
                        if (str5 == null) {
                            Assertions.a(reader, "buttonText");
                            throw null;
                        }
                        if (str6 != null) {
                            return new CheckoutContent.OnCheckoutCollectionAddressPickup(str, collectionModeIdA, iIntValue, str2, iIntValue2, str3, str4, str5, str6);
                        }
                        Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                        throw null;
                }
                num2 = num;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContent.OnCheckoutCollectionAddressPickup value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22094a);
            writer.F1("modeId");
            CollectionModeId_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1("storeId");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.c, adapters$IntAdapter$1, writer, customScalarAdapters, TextBundle.TEXT_ENTRY);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("addressId");
            d.y(value.e, adapters$IntAdapter$1, writer, customScalarAdapters, "displayName");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1("addressImageUrl");
            Adapters.i.toJson(writer, customScalarAdapters, value.g);
            writer.F1("buttonText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.h);
            writer.F1(AnnotatedPrivateKey.LABEL);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.i);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContent.OnCheckoutCollectionAddressPickup) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$OnCheckoutCollectionMethod;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutCollectionMethod;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutCollectionMethod implements Adapter<CheckoutContent.OnCheckoutCollectionMethod> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22175a = CollectionsKt.R("title", "options", "address", "insetBanner", "marketPickupSheet", "shoppingModeDetails");

        public static CheckoutContent.OnCheckoutCollectionMethod a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            CheckoutContent.Address address = null;
            CheckoutContent.InsetBanner insetBanner = null;
            CheckoutContent.MarketPickupSheet marketPickupSheet = null;
            CheckoutContent.ShoppingModeDetails1 shoppingModeDetails1 = null;
            while (true) {
                int iO2 = reader.o2(f22175a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson = Adapters.a(Adapters.c(Option.f22190a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    address = (CheckoutContent.Address) Adapters.c(Address.f22144a, true).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    insetBanner = (CheckoutContent.InsetBanner) Adapters.b(Adapters.c(InsetBanner.f22165a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    marketPickupSheet = (CheckoutContent.MarketPickupSheet) Adapters.b(Adapters.c(MarketPickupSheet.f22168a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    shoppingModeDetails1 = (CheckoutContent.ShoppingModeDetails1) Adapters.c(ShoppingModeDetails1.f22214a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "options");
                throw null;
            }
            if (address == null) {
                Assertions.a(reader, "address");
                throw null;
            }
            if (shoppingModeDetails1 != null) {
                return new CheckoutContent.OnCheckoutCollectionMethod(str, arrayListFromJson, address, insetBanner, marketPickupSheet, shoppingModeDetails1);
            }
            Assertions.a(reader, "shoppingModeDetails");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContent.OnCheckoutCollectionMethod value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22095a);
            writer.F1("options");
            Adapters.a(Adapters.c(Option.f22190a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("address");
            Adapters.c(Address.f22144a, true).toJson(writer, customScalarAdapters, value.c);
            writer.F1("insetBanner");
            Adapters.b(Adapters.c(InsetBanner.f22165a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("marketPickupSheet");
            Adapters.b(Adapters.c(MarketPickupSheet.f22168a, false)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("shoppingModeDetails");
            Adapters.c(ShoppingModeDetails1.f22214a, false).toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContent.OnCheckoutCollectionMethod) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$OnCheckoutContactDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutContactDetails;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutContactDetails implements Adapter<CheckoutContent.OnCheckoutContactDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22176a = CollectionsKt.R("title", "phoneNumberLabel", "phoneNumber", "placeholder", "buttonTitle", "inlineMessage");

        public static CheckoutContent.OnCheckoutContactDetails a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            CheckoutContent.InlineMessage2 inlineMessage2 = null;
            while (true) {
                int iO2 = reader.o2(f22176a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    inlineMessage2 = (CheckoutContent.InlineMessage2) Adapters.b(Adapters.c(InlineMessage2.f22160a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str4 == null) {
                Assertions.a(reader, "placeholder");
                throw null;
            }
            if (str5 != null) {
                return new CheckoutContent.OnCheckoutContactDetails(str, str2, str3, str4, str5, inlineMessage2);
            }
            Assertions.a(reader, "buttonTitle");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContent.OnCheckoutContactDetails value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22096a);
            writer.F1("phoneNumberLabel");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("phoneNumber");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("placeholder");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("buttonTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("inlineMessage");
            Adapters.b(Adapters.c(InlineMessage2.f22160a, false)).toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContent.OnCheckoutContactDetails) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$OnCheckoutDeliveryPreferenceText;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutDeliveryPreferenceText;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutDeliveryPreferenceText implements Adapter<CheckoutContent.OnCheckoutDeliveryPreferenceText> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22177a = CollectionsKt.R("preferenceId", "isEnabled", "title", "inputLimit", "descriptionText", "placeholderText", TextBundle.TEXT_ENTRY, "buttonTitle", "inlineMessage");

        public static CheckoutContent.OnCheckoutDeliveryPreferenceText a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            CheckoutDeliveryPreferenceId checkoutDeliveryPreferenceIdA = null;
            String str = null;
            CheckoutContent.InputLimit inputLimit = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            CheckoutContent.InlineMessage3 inlineMessage3 = null;
            while (true) {
                switch (reader.o2(f22177a)) {
                    case 0:
                        checkoutDeliveryPreferenceIdA = CheckoutDeliveryPreferenceId_ResponseAdapter.a(reader, customScalarAdapters);
                        continue;
                    case 1:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 2:
                        bool = bool2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool = bool2;
                        inputLimit = (CheckoutContent.InputLimit) Adapters.b(Adapters.c(InputLimit.f22163a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool = bool2;
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        bool = bool2;
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = bool2;
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        bool = bool2;
                        str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        bool = bool2;
                        inlineMessage3 = (CheckoutContent.InlineMessage3) Adapters.b(Adapters.c(InlineMessage3.f22161a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Boolean bool3 = bool2;
                        if (checkoutDeliveryPreferenceIdA == null) {
                            Assertions.a(reader, "preferenceId");
                            throw null;
                        }
                        if (bool3 == null) {
                            Assertions.a(reader, "isEnabled");
                            throw null;
                        }
                        boolean zBooleanValue = bool3.booleanValue();
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str5 != null) {
                            return new CheckoutContent.OnCheckoutDeliveryPreferenceText(checkoutDeliveryPreferenceIdA, zBooleanValue, str, inputLimit, str2, str3, str4, str5, inlineMessage3);
                        }
                        Assertions.a(reader, "buttonTitle");
                        throw null;
                }
                bool2 = bool;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContent.OnCheckoutDeliveryPreferenceText value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("preferenceId");
            CheckoutDeliveryPreferenceId_ResponseAdapter.b(writer, customScalarAdapters, value.f22097a);
            writer.F1("isEnabled");
            d.B(value.b, Adapters.f, writer, customScalarAdapters, "title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("inputLimit");
            Adapters.b(Adapters.c(InputLimit.f22163a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("descriptionText");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("placeholderText");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
            writer.F1(TextBundle.TEXT_ENTRY);
            nullableAdapter.toJson(writer, customScalarAdapters, value.g);
            writer.F1("buttonTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.h);
            writer.F1("inlineMessage");
            Adapters.b(Adapters.c(InlineMessage3.f22161a, false)).toJson(writer, customScalarAdapters, value.i);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContent.OnCheckoutDeliveryPreferenceText) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$OnCheckoutDeliveryPreferenceToggle;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutDeliveryPreferenceToggle;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutDeliveryPreferenceToggle implements Adapter<CheckoutContent.OnCheckoutDeliveryPreferenceToggle> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22178a = CollectionsKt.R("preferenceId", "isEnabled", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, AnnotatedPrivateKey.LABEL, "value", "inlineMessage");

        public static CheckoutContent.OnCheckoutDeliveryPreferenceToggle a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            CheckoutDeliveryPreferenceId checkoutDeliveryPreferenceIdA = null;
            Boolean bool3 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            CheckoutContent.InlineMessage1 inlineMessage1 = null;
            while (true) {
                switch (reader.o2(f22178a)) {
                    case 0:
                        checkoutDeliveryPreferenceIdA = CheckoutDeliveryPreferenceId_ResponseAdapter.a(reader, customScalarAdapters);
                        continue;
                    case 1:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 2:
                        bool = bool2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool = bool2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool = bool2;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        bool = bool2;
                        bool3 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        inlineMessage1 = (CheckoutContent.InlineMessage1) Adapters.b(Adapters.c(InlineMessage1.f22159a, false)).fromJson(reader, customScalarAdapters);
                        bool2 = bool2;
                        bool3 = bool3;
                        continue;
                    default:
                        Boolean bool4 = bool2;
                        if (checkoutDeliveryPreferenceIdA == null) {
                            Assertions.a(reader, "preferenceId");
                            throw null;
                        }
                        if (bool4 == null) {
                            Assertions.a(reader, "isEnabled");
                            throw null;
                        }
                        Boolean bool5 = bool3;
                        boolean zBooleanValue = bool4.booleanValue();
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                            throw null;
                        }
                        if (bool5 != null) {
                            return new CheckoutContent.OnCheckoutDeliveryPreferenceToggle(checkoutDeliveryPreferenceIdA, zBooleanValue, str, str2, str3, bool5.booleanValue(), inlineMessage1);
                        }
                        Assertions.a(reader, "value");
                        throw null;
                }
                bool2 = bool;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContent.OnCheckoutDeliveryPreferenceToggle value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("preferenceId");
            CheckoutDeliveryPreferenceId_ResponseAdapter.b(writer, customScalarAdapters, value.f22098a);
            writer.F1("isEnabled");
            Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
            d.B(value.b, adapters$BooleanAdapter$1, writer, customScalarAdapters, "title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1(AnnotatedPrivateKey.LABEL);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("value");
            d.B(value.f, adapters$BooleanAdapter$1, writer, customScalarAdapters, "inlineMessage");
            Adapters.b(Adapters.c(InlineMessage1.f22159a, false)).toJson(writer, customScalarAdapters, value.g);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContent.OnCheckoutDeliveryPreferenceToggle) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$OnCheckoutFulfilmentWindows;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutFulfilmentWindows;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutFulfilmentWindows implements Adapter<CheckoutContent.OnCheckoutFulfilmentWindows> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22179a = CollectionsKt.Q("__typename");

        public static CheckoutContent.OnCheckoutFulfilmentWindows a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f22179a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            CheckoutFulfilmentWindows checkoutFulfilmentWindowsA = CheckoutFulfilmentWindowsImpl_ResponseAdapter.CheckoutFulfilmentWindows.a(reader, customScalarAdapters);
            if (str != null) {
                return new CheckoutContent.OnCheckoutFulfilmentWindows(str, checkoutFulfilmentWindowsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContent.OnCheckoutFulfilmentWindows value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22099a);
            List list = CheckoutFulfilmentWindowsImpl_ResponseAdapter.CheckoutFulfilmentWindows.f22434a;
            CheckoutFulfilmentWindowsImpl_ResponseAdapter.CheckoutFulfilmentWindows.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContent.OnCheckoutFulfilmentWindows) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$OnCheckoutFulfilmentWindowsEmptyState;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutFulfilmentWindowsEmptyState;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutFulfilmentWindowsEmptyState implements Adapter<CheckoutContent.OnCheckoutFulfilmentWindowsEmptyState> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22180a = CollectionsKt.R("title", "message");

        public static CheckoutContent.OnCheckoutFulfilmentWindowsEmptyState a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f22180a);
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
                return new CheckoutContent.OnCheckoutFulfilmentWindowsEmptyState(str, str2);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContent.OnCheckoutFulfilmentWindowsEmptyState value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22100a);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContent.OnCheckoutFulfilmentWindowsEmptyState) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$OnCheckoutFulfilmentWindowsSelectedState;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutFulfilmentWindowsSelectedState;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutFulfilmentWindowsSelectedState implements Adapter<CheckoutContent.OnCheckoutFulfilmentWindowsSelectedState> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22181a = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "timeWindow", "price", "buttonTitle", "inlineMessage", "windows");

        public static CheckoutContent.OnCheckoutFulfilmentWindowsSelectedState a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            CheckoutContent.InlineMessage inlineMessage = null;
            CheckoutContent.Windows windows = null;
            while (true) {
                switch (reader.o2(f22181a)) {
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
                        str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        inlineMessage = (CheckoutContent.InlineMessage) Adapters.b(Adapters.c(InlineMessage.f22158a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        windows = (CheckoutContent.Windows) Adapters.c(Windows.f22221a, true).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "timeWindow");
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "price");
                            throw null;
                        }
                        if (str5 == null) {
                            Assertions.a(reader, "buttonTitle");
                            throw null;
                        }
                        if (windows != null) {
                            return new CheckoutContent.OnCheckoutFulfilmentWindowsSelectedState(str, str2, str3, str4, str5, inlineMessage, windows);
                        }
                        Assertions.a(reader, "windows");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContent.OnCheckoutFulfilmentWindowsSelectedState value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22101a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("timeWindow");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("price");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("buttonTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("inlineMessage");
            Adapters.b(Adapters.c(InlineMessage.f22158a, false)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("windows");
            Adapters.c(Windows.f22221a, true).toJson(writer, customScalarAdapters, value.g);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContent.OnCheckoutFulfilmentWindowsSelectedState) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$OnCheckoutMarketFulfilmentAddress;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutMarketFulfilmentAddress;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutMarketFulfilmentAddress implements Adapter<CheckoutContent.OnCheckoutMarketFulfilmentAddress> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22182a = CollectionsKt.R("title", "displayName", "addressButtonTitle", "addressStatus", "addressType", "addressData", "shoppingModeDetails");

        public static CheckoutContent.OnCheckoutMarketFulfilmentAddress a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            MarketFulfilmentAddressStatus marketFulfilmentAddressStatusA = null;
            AddressType addressTypeA = null;
            CheckoutContent.AddressData addressData = null;
            CheckoutContent.ShoppingModeDetails shoppingModeDetails = null;
            while (true) {
                switch (reader.o2(f22182a)) {
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
                        marketFulfilmentAddressStatusA = MarketFulfilmentAddressStatus_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    case 4:
                        addressTypeA = AddressType_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    case 5:
                        addressData = (CheckoutContent.AddressData) Adapters.b(Adapters.c(AddressData.f22145a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        shoppingModeDetails = (CheckoutContent.ShoppingModeDetails) Adapters.c(ShoppingModeDetails.f22213a, false).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "displayName");
                            throw null;
                        }
                        if (marketFulfilmentAddressStatusA == null) {
                            Assertions.a(reader, "addressStatus");
                            throw null;
                        }
                        if (addressTypeA == null) {
                            Assertions.a(reader, "addressType");
                            throw null;
                        }
                        if (shoppingModeDetails != null) {
                            return new CheckoutContent.OnCheckoutMarketFulfilmentAddress(str, str2, str3, marketFulfilmentAddressStatusA, addressTypeA, addressData, shoppingModeDetails);
                        }
                        Assertions.a(reader, "shoppingModeDetails");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContent.OnCheckoutMarketFulfilmentAddress value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22102a);
            writer.F1("displayName");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("addressButtonTitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1("addressStatus");
            writer.v0(value.d.d);
            writer.F1("addressType");
            writer.v0(value.e.d);
            writer.F1("addressData");
            Adapters.b(Adapters.c(AddressData.f22145a, true)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("shoppingModeDetails");
            Adapters.c(ShoppingModeDetails.f22213a, false).toJson(writer, customScalarAdapters, value.g);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContent.OnCheckoutMarketFulfilmentAddress) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$OnCheckoutMarketProducts;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutMarketProducts;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutMarketProducts implements Adapter<CheckoutContent.OnCheckoutMarketProducts> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22183a = CollectionsKt.R("title", "descriptionText", "sellerGroups");

        public static CheckoutContent.OnCheckoutMarketProducts a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f22183a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(SellerGroup.f22212a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new CheckoutContent.OnCheckoutMarketProducts(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, "sellerGroups");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContent.OnCheckoutMarketProducts value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22103a);
            writer.F1("descriptionText");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("sellerGroups");
            Adapters.a(Adapters.c(SellerGroup.f22212a, false)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContent.OnCheckoutMarketProducts) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$OnCheckoutPackagingMethod;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutPackagingMethod;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutPackagingMethod implements Adapter<CheckoutContent.OnCheckoutPackagingMethod> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22184a = CollectionsKt.R("title", "options");

        public static CheckoutContent.OnCheckoutPackagingMethod a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f22184a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Option1.f22191a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new CheckoutContent.OnCheckoutPackagingMethod(str, arrayListFromJson);
            }
            Assertions.a(reader, "options");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContent.OnCheckoutPackagingMethod value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22104a);
            writer.F1("options");
            Adapters.a(Adapters.c(Option1.f22191a, false)).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContent.OnCheckoutPackagingMethod) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$OnCheckoutProductCampaigns;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutProductCampaigns;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutProductCampaigns implements Adapter<CheckoutContent.OnCheckoutProductCampaigns> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22185a = CollectionsKt.Q("campaigns");

        public static CheckoutContent.OnCheckoutProductCampaigns a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(f22185a) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(Campaign.f22148a, false)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new CheckoutContent.OnCheckoutProductCampaigns(arrayListFromJson);
            }
            Assertions.a(reader, "campaigns");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContent.OnCheckoutProductCampaigns value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("campaigns");
            Adapters.a(Adapters.c(Campaign.f22148a, false)).toJson(writer, customScalarAdapters, value.f22105a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContent.OnCheckoutProductCampaigns) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$OnCheckoutProducts;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutProducts;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutProducts implements Adapter<CheckoutContent.OnCheckoutProducts> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22186a = CollectionsKt.R("title", "descriptionText", "substitution", "substitutionPreferences", "products", "useSubstitutionPreference", "substitutionPreferenceOnboardingBanner");

        public static CheckoutContent.OnCheckoutProducts a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            CheckoutContent.Substitution substitution = null;
            CheckoutContent.SubstitutionPreferences substitutionPreferences = null;
            ArrayList arrayListFromJson = null;
            CheckoutContent.SubstitutionPreferenceOnboardingBanner substitutionPreferenceOnboardingBanner = null;
            while (true) {
                switch (reader.o2(f22186a)) {
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
                        substitution = (CheckoutContent.Substitution) Adapters.b(Adapters.c(Substitution.f22215a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool = bool2;
                        substitutionPreferences = (CheckoutContent.SubstitutionPreferences) Adapters.b(Adapters.c(SubstitutionPreferences.f22218a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool = bool2;
                        arrayListFromJson = Adapters.a(Adapters.c(Product.f22196a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 6:
                        bool = bool2;
                        substitutionPreferenceOnboardingBanner = (CheckoutContent.SubstitutionPreferenceOnboardingBanner) Adapters.b(Adapters.c(SubstitutionPreferenceOnboardingBanner.f22217a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Boolean bool3 = bool2;
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (arrayListFromJson == null) {
                            Assertions.a(reader, "products");
                            throw null;
                        }
                        if (bool3 != null) {
                            return new CheckoutContent.OnCheckoutProducts(str, str2, substitution, substitutionPreferences, arrayListFromJson, bool3.booleanValue(), substitutionPreferenceOnboardingBanner);
                        }
                        Assertions.a(reader, "useSubstitutionPreference");
                        throw null;
                }
                bool2 = bool;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContent.OnCheckoutProducts value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22106a);
            writer.F1("descriptionText");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("substitution");
            Adapters.b(Adapters.c(Substitution.f22215a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("substitutionPreferences");
            Adapters.b(Adapters.c(SubstitutionPreferences.f22218a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("products");
            Adapters.a(Adapters.c(Product.f22196a, false)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("useSubstitutionPreference");
            d.B(value.f, Adapters.f, writer, customScalarAdapters, "substitutionPreferenceOnboardingBanner");
            Adapters.b(Adapters.c(SubstitutionPreferenceOnboardingBanner.f22217a, false)).toJson(writer, customScalarAdapters, value.g);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContent.OnCheckoutProducts) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$OnCheckoutSectionHeader;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutSectionHeader;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutSectionHeader implements Adapter<CheckoutContent.OnCheckoutSectionHeader> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22187a = CollectionsKt.R("title", "imageUrl");

        public static CheckoutContent.OnCheckoutSectionHeader a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f22187a);
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
                return new CheckoutContent.OnCheckoutSectionHeader(str, str2);
            }
            Assertions.a(reader, "imageUrl");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContent.OnCheckoutSectionHeader value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22107a);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContent.OnCheckoutSectionHeader) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$OnInsetBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnInsetBanner;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnInsetBanner implements Adapter<CheckoutContent.OnInsetBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22188a = CollectionsKt.R("displayType", "message", UrlHandler.ACTION);

        public static CheckoutContent.OnInsetBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            String str = null;
            CheckoutContent.Action action = null;
            while (true) {
                int iO2 = reader.o2(f22188a);
                if (iO2 == 0) {
                    insetBannerDisplayTypeA = InsetBannerDisplayType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    action = (CheckoutContent.Action) Adapters.b(Adapters.c(Action.f22142a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerDisplayTypeA == null) {
                Assertions.a(reader, "displayType");
                throw null;
            }
            if (str != null) {
                return new CheckoutContent.OnInsetBanner(insetBannerDisplayTypeA, str, action);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContent.OnInsetBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.f22108a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            Adapters.b(Adapters.c(Action.f22142a, false)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContent.OnInsetBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$OnSnackBar;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnSnackBar;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnSnackBar implements Adapter<CheckoutContent.OnSnackBar> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22189a = CollectionsKt.R("message", "eventSource");

        public static CheckoutContent.OnSnackBar a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f22189a);
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
                return new CheckoutContent.OnSnackBar(str, str2);
            }
            Assertions.a(reader, "eventSource");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CheckoutContent.OnSnackBar value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("message");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22109a);
            writer.F1("eventSource");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CheckoutContent.OnSnackBar) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$Option;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Option;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Option implements Adapter<CheckoutContent.Option> {

        /* renamed from: a, reason: collision with root package name */
        public static final Option f22190a = new Option();
        public static final List b = CollectionsKt.R("title", "modeId", "isSelected", "addressId");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            CollectionModeId collectionModeIdA = null;
            Boolean bool = null;
            Integer num = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    collectionModeIdA = CollectionModeId_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    num = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (collectionModeIdA == null) {
                Assertions.a(reader, "modeId");
                throw null;
            }
            if (bool != null) {
                return new CheckoutContent.Option(str, collectionModeIdA, bool.booleanValue(), num);
            }
            Assertions.a(reader, "isSelected");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.Option value = (CheckoutContent.Option) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22110a);
            writer.F1("modeId");
            CollectionModeId_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1("isSelected");
            d.B(value.c, Adapters.f, writer, customScalarAdapters, "addressId");
            Adapters.k.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$Option1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Option1;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Option1 implements Adapter<CheckoutContent.Option1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Option1 f22191a = new Option1();
        public static final List b = CollectionsKt.R("id", "isSelected", "title", "price", lqlqqlq.mmm006Dm006Dm, "imageUrl");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Boolean bool = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (num == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            int iIntValue = num.intValue();
            if (bool == null) {
                Assertions.a(reader, "isSelected");
                throw null;
            }
            boolean zBooleanValue = bool.booleanValue();
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "price");
                throw null;
            }
            if (str4 != null) {
                return new CheckoutContent.Option1(iIntValue, zBooleanValue, str, str2, str3, str4);
            }
            Assertions.a(reader, "imageUrl");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.Option1 value = (CheckoutContent.Option1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            d.y(value.f22111a, Adapters.b, writer, customScalarAdapters, "isSelected");
            d.B(value.b, Adapters.f, writer, customScalarAdapters, "title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("price");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            Adapters.i.toJson(writer, customScalarAdapters, value.e);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$Option2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Option2;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Option2 implements Adapter<CheckoutContent.Option2> {

        /* renamed from: a, reason: collision with root package name */
        public static final Option2 f22192a = new Option2();
        public static final List b = CollectionsKt.R("title", "id");

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
                return new CheckoutContent.Option2(str, str2);
            }
            Assertions.a(reader, "id");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.Option2 value = (CheckoutContent.Option2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22112a);
            writer.F1("id");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$OrderTotalDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OrderTotalDetails;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OrderTotalDetails implements Adapter<CheckoutContent.OrderTotalDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final OrderTotalDetails f22193a = new OrderTotalDetails();
        public static final List b = CollectionsKt.R("inlineMessage", "sections", "total", "reviewProducts", "panelMarkdown");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CheckoutContent.InlineMessage4 inlineMessage4 = null;
            ArrayList arrayListFromJson = null;
            CheckoutContent.Total total = null;
            CheckoutContent.ReviewProducts reviewProducts = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    inlineMessage4 = (CheckoutContent.InlineMessage4) Adapters.b(Adapters.c(InlineMessage4.f22162a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson = Adapters.a(Adapters.a(Adapters.c(Section.f22211a, false))).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    total = (CheckoutContent.Total) Adapters.c(Total.f22219a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    reviewProducts = (CheckoutContent.ReviewProducts) Adapters.b(Adapters.c(ReviewProducts.f22207a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
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
                return new CheckoutContent.OrderTotalDetails(inlineMessage4, arrayListFromJson, total, reviewProducts, str);
            }
            Assertions.a(reader, "total");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.OrderTotalDetails value = (CheckoutContent.OrderTotalDetails) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("inlineMessage");
            Adapters.b(Adapters.c(InlineMessage4.f22162a, false)).toJson(writer, customScalarAdapters, value.f22113a);
            writer.F1("sections");
            Adapters.a(Adapters.a(Adapters.c(Section.f22211a, false))).toJson(writer, customScalarAdapters, value.b);
            writer.F1("total");
            Adapters.c(Total.f22219a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("reviewProducts");
            Adapters.b(Adapters.c(ReviewProducts.f22207a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("panelMarkdown");
            Adapters.i.toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$PrimaryButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$PrimaryButton;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PrimaryButton implements Adapter<CheckoutContent.PrimaryButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final PrimaryButton f22194a = new PrimaryButton();
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
                return new CheckoutContent.PrimaryButton(str, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.PrimaryButton value = (CheckoutContent.PrimaryButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22114a);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.b);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.c));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$PrimaryCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$PrimaryCta;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PrimaryCta implements Adapter<CheckoutContent.PrimaryCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final PrimaryCta f22195a = new PrimaryCta();
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
                return new CheckoutContent.PrimaryCta(str);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.PrimaryCta value = (CheckoutContent.PrimaryCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22115a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$Product;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Product;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Product implements Adapter<CheckoutContent.Product> {

        /* renamed from: a, reason: collision with root package name */
        public static final Product f22196a = new Product();
        public static final List b = CollectionsKt.R("title", "quantity", "productId", "unitPrice", "totalPrice", "totalTitle", "imageUrl", "instruction", "rewards", "removeInfo", "allowSubstitution", i.e, "showSubstitution", "cartProductInfo", "substitutionPreference");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Double d;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Double d2 = null;
            String str = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            CheckoutContent.Instruction instruction = null;
            CheckoutContent.Rewards rewards = null;
            CheckoutContent.RemoveInfo removeInfo = null;
            ArrayList arrayListFromJson = null;
            CheckoutContent.CartProductInfo cartProductInfo = null;
            CheckoutContent.SubstitutionPreference substitutionPreference = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 1:
                        d2 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                        continue;
                    case 2:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 3:
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 4:
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 5:
                        str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 6:
                        str6 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 7:
                        d = d2;
                        instruction = (CheckoutContent.Instruction) Adapters.c(Instruction.f22166a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        d = d2;
                        rewards = (CheckoutContent.Rewards) Adapters.b(Adapters.c(Rewards.f22208a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        d = d2;
                        removeInfo = (CheckoutContent.RemoveInfo) Adapters.c(RemoveInfo.f22201a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 11:
                        arrayListFromJson = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                        continue;
                    case 12:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 13:
                        d = d2;
                        cartProductInfo = (CheckoutContent.CartProductInfo) Adapters.b(Adapters.c(CartProductInfo.f22150a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 14:
                        d = d2;
                        substitutionPreference = (CheckoutContent.SubstitutionPreference) Adapters.b(Adapters.c(SubstitutionPreference.f22216a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Double d3 = d2;
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (d3 == null) {
                            Assertions.a(reader, "quantity");
                            throw null;
                        }
                        Boolean bool3 = bool;
                        Boolean bool4 = bool2;
                        double dDoubleValue = d3.doubleValue();
                        if (str2 == null) {
                            Assertions.a(reader, "productId");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "unitPrice");
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "totalPrice");
                            throw null;
                        }
                        if (str5 == null) {
                            Assertions.a(reader, "totalTitle");
                            throw null;
                        }
                        if (str6 == null) {
                            Assertions.a(reader, "imageUrl");
                            throw null;
                        }
                        if (instruction == null) {
                            Assertions.a(reader, "instruction");
                            throw null;
                        }
                        if (removeInfo == null) {
                            Assertions.a(reader, "removeInfo");
                            throw null;
                        }
                        if (bool3 == null) {
                            Assertions.a(reader, "allowSubstitution");
                            throw null;
                        }
                        boolean zBooleanValue = bool3.booleanValue();
                        if (arrayListFromJson == null) {
                            Assertions.a(reader, i.e);
                            throw null;
                        }
                        if (bool4 != null) {
                            return new CheckoutContent.Product(str, dDoubleValue, str2, str3, str4, str5, str6, instruction, rewards, removeInfo, zBooleanValue, arrayListFromJson, bool4.booleanValue(), cartProductInfo, substitutionPreference);
                        }
                        Assertions.a(reader, "showSubstitution");
                        throw null;
                }
                d2 = d;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.Product value = (CheckoutContent.Product) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22116a);
            writer.F1("quantity");
            Adapters.c.toJson(writer, customScalarAdapters, Double.valueOf(value.b));
            writer.F1("productId");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("unitPrice");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("totalPrice");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("totalTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.g);
            writer.F1("instruction");
            Adapters.c(Instruction.f22166a, false).toJson(writer, customScalarAdapters, value.h);
            writer.F1("rewards");
            Adapters.b(Adapters.c(Rewards.f22208a, false)).toJson(writer, customScalarAdapters, value.i);
            writer.F1("removeInfo");
            Adapters.c(RemoveInfo.f22201a, false).toJson(writer, customScalarAdapters, value.j);
            writer.F1("allowSubstitution");
            Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
            d.B(value.k, adapters$BooleanAdapter$1, writer, customScalarAdapters, i.e);
            Adapters.a(adapters$StringAdapter$1).toJson(writer, customScalarAdapters, value.l);
            writer.F1("showSubstitution");
            d.B(value.m, adapters$BooleanAdapter$1, writer, customScalarAdapters, "cartProductInfo");
            Adapters.b(Adapters.c(CartProductInfo.f22150a, false)).toJson(writer, customScalarAdapters, value.n);
            writer.F1("substitutionPreference");
            Adapters.b(Adapters.c(SubstitutionPreference.f22216a, false)).toJson(writer, customScalarAdapters, value.o);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$Product1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Product1;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Product1 implements Adapter<CheckoutContent.Product1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Product1 f22197a = new Product1();
        public static final List b = CollectionsKt.R("title", "quantity", "productId", "unitPrice", "totalPrice", "totalTitle", "imageUrl", "brandName", "removeInfo", "cartProductInfo");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Double d;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Double d2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            CheckoutContent.RemoveInfo1 removeInfo1 = null;
            CheckoutContent.CartProductInfo1 cartProductInfo1 = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        d = d2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        d2 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                        continue;
                    case 2:
                        d = d2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        d = d2;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        d = d2;
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        d = d2;
                        str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        d = d2;
                        str6 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        d = d2;
                        str7 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        d = d2;
                        removeInfo1 = (CheckoutContent.RemoveInfo1) Adapters.c(RemoveInfo1.f22202a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        d = d2;
                        cartProductInfo1 = (CheckoutContent.CartProductInfo1) Adapters.b(Adapters.c(CartProductInfo1.f22151a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Double d3 = d2;
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (d3 == null) {
                            Assertions.a(reader, "quantity");
                            throw null;
                        }
                        double dDoubleValue = d3.doubleValue();
                        if (str2 == null) {
                            Assertions.a(reader, "productId");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "unitPrice");
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "totalPrice");
                            throw null;
                        }
                        if (str5 == null) {
                            Assertions.a(reader, "totalTitle");
                            throw null;
                        }
                        if (str6 == null) {
                            Assertions.a(reader, "imageUrl");
                            throw null;
                        }
                        if (str7 == null) {
                            Assertions.a(reader, "brandName");
                            throw null;
                        }
                        if (removeInfo1 != null) {
                            return new CheckoutContent.Product1(str, dDoubleValue, str2, str3, str4, str5, str6, str7, removeInfo1, cartProductInfo1);
                        }
                        Assertions.a(reader, "removeInfo");
                        throw null;
                }
                d2 = d;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.Product1 value = (CheckoutContent.Product1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22117a);
            writer.F1("quantity");
            Adapters.c.toJson(writer, customScalarAdapters, Double.valueOf(value.b));
            writer.F1("productId");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("unitPrice");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("totalPrice");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("totalTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.g);
            writer.F1("brandName");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.h);
            writer.F1("removeInfo");
            Adapters.c(RemoveInfo1.f22202a, false).toJson(writer, customScalarAdapters, value.i);
            writer.F1("cartProductInfo");
            Adapters.b(Adapters.c(CartProductInfo1.f22151a, false)).toJson(writer, customScalarAdapters, value.j);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$Product2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Product2;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Product2 implements Adapter<CheckoutContent.Product2> {

        /* renamed from: a, reason: collision with root package name */
        public static final Product2 f22198a = new Product2();
        public static final List b = CollectionsKt.Q(AppMeasurementSdk.ConditionalUserProperty.NAME);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
            }
            return new CheckoutContent.Product2(str);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.Product2 value = (CheckoutContent.Product2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AppMeasurementSdk.ConditionalUserProperty.NAME);
            Adapters.i.toJson(writer, customScalarAdapters, value.f22118a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$ProductsInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$ProductsInfo;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductsInfo implements Adapter<CheckoutContent.ProductsInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductsInfo f22199a = new ProductsInfo();
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
                            return new CheckoutContent.ProductsInfo(str, str2, dDoubleValue, dDoubleValue2, dDoubleValue3, bool2.booleanValue(), str3, str4, str5);
                        }
                        Assertions.a(reader, "isAvailable");
                        throw null;
                }
                d2 = d;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.ProductsInfo value = (CheckoutContent.ProductsInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productId");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22119a);
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
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$Progress;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Progress;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Progress implements Adapter<CheckoutContent.Progress> {

        /* renamed from: a, reason: collision with root package name */
        public static final Progress f22200a = new Progress();
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
                return new CheckoutContent.Progress(str, checkoutProgressIdA, str2);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.Progress value = (CheckoutContent.Progress) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("index");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22120a);
            writer.F1("id");
            CheckoutProgressId_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$RemoveInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$RemoveInfo;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RemoveInfo implements Adapter<CheckoutContent.RemoveInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final RemoveInfo f22201a = new RemoveInfo();
        public static final List b = CollectionsKt.R("title", "message", "buttonTitle");

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
                return new CheckoutContent.RemoveInfo(str, str2, str3);
            }
            Assertions.a(reader, "buttonTitle");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.RemoveInfo value = (CheckoutContent.RemoveInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22121a);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("buttonTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$RemoveInfo1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$RemoveInfo1;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RemoveInfo1 implements Adapter<CheckoutContent.RemoveInfo1> {

        /* renamed from: a, reason: collision with root package name */
        public static final RemoveInfo1 f22202a = new RemoveInfo1();
        public static final List b = CollectionsKt.R("title", "message", "buttonTitle");

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
                return new CheckoutContent.RemoveInfo1(str, str2, str3);
            }
            Assertions.a(reader, "buttonTitle");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.RemoveInfo1 value = (CheckoutContent.RemoveInfo1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22122a);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("buttonTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$RestrictedOrderItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$RestrictedOrderItem;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RestrictedOrderItem implements Adapter<CheckoutContent.RestrictedOrderItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final RestrictedOrderItem f22203a = new RestrictedOrderItem();
        public static final List b = CollectionsKt.Q(AppMeasurementSdk.ConditionalUserProperty.NAME);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
            }
            return new CheckoutContent.RestrictedOrderItem(str);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.RestrictedOrderItem value = (CheckoutContent.RestrictedOrderItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AppMeasurementSdk.ConditionalUserProperty.NAME);
            Adapters.i.toJson(writer, customScalarAdapters, value.f22123a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$RestrictedProductsByDeliPlatter;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$RestrictedProductsByDeliPlatter;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RestrictedProductsByDeliPlatter implements Adapter<CheckoutContent.RestrictedProductsByDeliPlatter> {

        /* renamed from: a, reason: collision with root package name */
        public static final RestrictedProductsByDeliPlatter f22204a = new RestrictedProductsByDeliPlatter();
        public static final List b = CollectionsKt.Q(AppMeasurementSdk.ConditionalUserProperty.NAME);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
            }
            return new CheckoutContent.RestrictedProductsByDeliPlatter(str);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.RestrictedProductsByDeliPlatter value = (CheckoutContent.RestrictedProductsByDeliPlatter) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AppMeasurementSdk.ConditionalUserProperty.NAME);
            Adapters.i.toJson(writer, customScalarAdapters, value.f22124a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$RestrictedProductsByDeliveryMethod;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$RestrictedProductsByDeliveryMethod;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RestrictedProductsByDeliveryMethod implements Adapter<CheckoutContent.RestrictedProductsByDeliveryMethod> {

        /* renamed from: a, reason: collision with root package name */
        public static final RestrictedProductsByDeliveryMethod f22205a = new RestrictedProductsByDeliveryMethod();
        public static final List b = CollectionsKt.Q(AppMeasurementSdk.ConditionalUserProperty.NAME);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
            }
            return new CheckoutContent.RestrictedProductsByDeliveryMethod(str);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.RestrictedProductsByDeliveryMethod value = (CheckoutContent.RestrictedProductsByDeliveryMethod) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AppMeasurementSdk.ConditionalUserProperty.NAME);
            Adapters.i.toJson(writer, customScalarAdapters, value.f22125a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$RestrictionPrompt;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$RestrictionPrompt;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RestrictionPrompt implements Adapter<CheckoutContent.RestrictionPrompt> {

        /* renamed from: a, reason: collision with root package name */
        public static final RestrictionPrompt f22206a = new RestrictionPrompt();
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
                return new CheckoutContent.RestrictionPrompt(str, str2);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.RestrictionPrompt value = (CheckoutContent.RestrictionPrompt) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22126a);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$ReviewProducts;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$ReviewProducts;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ReviewProducts implements Adapter<CheckoutContent.ReviewProducts> {

        /* renamed from: a, reason: collision with root package name */
        public static final ReviewProducts f22207a = new ReviewProducts();
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
                    arrayListFromJson = Adapters.a(Adapters.c(UnavailableOrderItem.f22220a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson2 = Adapters.a(Adapters.c(RestrictedOrderItem.f22203a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson3 = Adapters.a(Adapters.c(ExceededSupplyLimitProductGroup.f22154a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    arrayListFromJson4 = Adapters.a(Adapters.c(RestrictedProductsByDeliveryMethod.f22205a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    arrayListFromJson5 = Adapters.a(Adapters.c(RestrictedProductsByDeliPlatter.f22204a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    arrayListFromJson6 = Adapters.a(Adapters.c(AvailableOrderItem.f22147a, false)).fromJson(reader, customScalarAdapters);
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
                return new CheckoutContent.ReviewProducts(arrayListFromJson, arrayListFromJson2, arrayListFromJson3, arrayListFromJson4, arrayListFromJson5, arrayListFromJson6);
            }
            Assertions.a(reader, "availableOrderItems");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.ReviewProducts value = (CheckoutContent.ReviewProducts) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("unavailableOrderItems");
            Adapters.a(Adapters.c(UnavailableOrderItem.f22220a, false)).toJson(writer, customScalarAdapters, value.f22127a);
            writer.F1("restrictedOrderItems");
            Adapters.a(Adapters.c(RestrictedOrderItem.f22203a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("exceededSupplyLimitProductGroups");
            Adapters.a(Adapters.c(ExceededSupplyLimitProductGroup.f22154a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("restrictedProductsByDeliveryMethod");
            Adapters.a(Adapters.c(RestrictedProductsByDeliveryMethod.f22205a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("restrictedProductsByDeliPlatter");
            Adapters.a(Adapters.c(RestrictedProductsByDeliPlatter.f22204a, false)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("availableOrderItems");
            Adapters.a(Adapters.c(AvailableOrderItem.f22147a, false)).toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$Rewards;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Rewards;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Rewards implements Adapter<CheckoutContent.Rewards> {

        /* renamed from: a, reason: collision with root package name */
        public static final Rewards f22208a = new Rewards();
        public static final List b = CollectionsKt.R("points", "imageUrl");

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
                Assertions.a(reader, "points");
                throw null;
            }
            if (str2 != null) {
                return new CheckoutContent.Rewards(str, str2);
            }
            Assertions.a(reader, "imageUrl");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.Rewards value = (CheckoutContent.Rewards) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("points");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22128a);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$SecondaryButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$SecondaryButton;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SecondaryButton implements Adapter<CheckoutContent.SecondaryButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final SecondaryButton f22209a = new SecondaryButton();
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
                return new CheckoutContent.SecondaryButton(str, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.SecondaryButton value = (CheckoutContent.SecondaryButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22129a);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.b);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.c));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$SecondaryCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$SecondaryCta;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SecondaryCta implements Adapter<CheckoutContent.SecondaryCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final SecondaryCta f22210a = new SecondaryCta();
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
                return new CheckoutContent.SecondaryCta(str);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.SecondaryCta value = (CheckoutContent.SecondaryCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22130a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$Section;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Section;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Section implements Adapter<CheckoutContent.Section> {

        /* renamed from: a, reason: collision with root package name */
        public static final Section f22211a = new Section();
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
            CheckoutContent.Message1 message1 = null;
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
                    message1 = (CheckoutContent.Message1) Adapters.b(Adapters.c(Message1.f22170a, false)).fromJson(reader, customScalarAdapters);
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
                return new CheckoutContent.Section(str, checkoutSummaryValueTypeA, str2, checkoutSummaryValueTypeA2, str3, message1);
            }
            Assertions.a(reader, "valueType");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.Section value = (CheckoutContent.Section) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22131a);
            writer.F1("titleType");
            CheckoutSummaryValueType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1("value");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("valueType");
            CheckoutSummaryValueType_ResponseAdapter.b(writer, customScalarAdapters, value.d);
            writer.F1("imageUrl");
            Adapters.i.toJson(writer, customScalarAdapters, value.e);
            writer.F1("message");
            Adapters.b(Adapters.c(Message1.f22170a, false)).toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$SellerGroup;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$SellerGroup;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SellerGroup implements Adapter<CheckoutContent.SellerGroup> {

        /* renamed from: a, reason: collision with root package name */
        public static final SellerGroup f22212a = new SellerGroup();
        public static final List b = CollectionsKt.R("sellerName", "dispatchNote", "products");

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
                    arrayListFromJson = Adapters.a(Adapters.c(Product1.f22197a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "sellerName");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "dispatchNote");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new CheckoutContent.SellerGroup(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, "products");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.SellerGroup value = (CheckoutContent.SellerGroup) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("sellerName");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22132a);
            writer.F1("dispatchNote");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("products");
            Adapters.a(Adapters.c(Product1.f22197a, false)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$ShoppingModeDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$ShoppingModeDetails;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShoppingModeDetails implements Adapter<CheckoutContent.ShoppingModeDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final ShoppingModeDetails f22213a = new ShoppingModeDetails();
        public static final List b = CollectionsKt.R("displayName", "mode", "storeAddressId");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            Integer num = null;
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
                    num = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 != null) {
                return new CheckoutContent.ShoppingModeDetails(str, str2, num);
            }
            Assertions.a(reader, "mode");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.ShoppingModeDetails value = (CheckoutContent.ShoppingModeDetails) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayName");
            Adapters.i.toJson(writer, customScalarAdapters, value.f22133a);
            writer.F1("mode");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("storeAddressId");
            Adapters.k.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$ShoppingModeDetails1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$ShoppingModeDetails1;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShoppingModeDetails1 implements Adapter<CheckoutContent.ShoppingModeDetails1> {

        /* renamed from: a, reason: collision with root package name */
        public static final ShoppingModeDetails1 f22214a = new ShoppingModeDetails1();
        public static final List b = CollectionsKt.R("displayName", "mode", "storeAddressId");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            Integer num = null;
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
                    num = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 != null) {
                return new CheckoutContent.ShoppingModeDetails1(str, str2, num);
            }
            Assertions.a(reader, "mode");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.ShoppingModeDetails1 value = (CheckoutContent.ShoppingModeDetails1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayName");
            Adapters.i.toJson(writer, customScalarAdapters, value.f22134a);
            writer.F1("mode");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("storeAddressId");
            Adapters.k.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$Substitution;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Substitution;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Substitution implements Adapter<CheckoutContent.Substitution> {

        /* renamed from: a, reason: collision with root package name */
        public static final Substitution f22215a = new Substitution();
        public static final List b = CollectionsKt.R("title", "selectedOptionTitle", "options", "info");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            CheckoutContent.Info info = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson = Adapters.a(Adapters.b(Adapters.c(Option2.f22192a, false))).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    info = (CheckoutContent.Info) Adapters.c(Info.f22156a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "selectedOptionTitle");
                throw null;
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "options");
                throw null;
            }
            if (info != null) {
                return new CheckoutContent.Substitution(str, str2, arrayListFromJson, info);
            }
            Assertions.a(reader, "info");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.Substitution value = (CheckoutContent.Substitution) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22135a);
            writer.F1("selectedOptionTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("options");
            Adapters.a(Adapters.b(Adapters.c(Option2.f22192a, false))).toJson(writer, customScalarAdapters, value.c);
            writer.F1("info");
            Adapters.c(Info.f22156a, false).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$SubstitutionPreference;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$SubstitutionPreference;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SubstitutionPreference implements Adapter<CheckoutContent.SubstitutionPreference> {

        /* renamed from: a, reason: collision with root package name */
        public static final SubstitutionPreference f22216a = new SubstitutionPreference();
        public static final List b = CollectionsKt.R("state", "header", "title", UrlHandler.ACTION);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            SubstitutionState substitutionStateA = null;
            String str = null;
            String str2 = null;
            CheckoutContent.Action1 action1 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    substitutionStateA = SubstitutionState_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    action1 = (CheckoutContent.Action1) Adapters.c(Action1.f22143a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (substitutionStateA == null) {
                Assertions.a(reader, "state");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (action1 != null) {
                return new CheckoutContent.SubstitutionPreference(substitutionStateA, str, str2, action1);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.SubstitutionPreference value = (CheckoutContent.SubstitutionPreference) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("state");
            SubstitutionState_ResponseAdapter.b(writer, customScalarAdapters, value.f22136a);
            writer.F1("header");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
            writer.F1(UrlHandler.ACTION);
            Adapters.c(Action1.f22143a, false).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$SubstitutionPreferenceOnboardingBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$SubstitutionPreferenceOnboardingBanner;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SubstitutionPreferenceOnboardingBanner implements Adapter<CheckoutContent.SubstitutionPreferenceOnboardingBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final SubstitutionPreferenceOnboardingBanner f22217a = new SubstitutionPreferenceOnboardingBanner();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "deeplink", "type", "imageUrl", "actionLabel", "analyticsLabel", "dismissible", "bannerId");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
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
                switch (reader.o2(b)) {
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
                            return new CheckoutContent.SubstitutionPreferenceOnboardingBanner(str, str2, str3, broadcastBannerTypeA, str4, str5, str6, bool, str7);
                        }
                        Assertions.a(reader, "imageUrl");
                        throw null;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.SubstitutionPreferenceOnboardingBanner value = (CheckoutContent.SubstitutionPreferenceOnboardingBanner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22137a);
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
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$SubstitutionPreferences;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$SubstitutionPreferences;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SubstitutionPreferences implements Adapter<CheckoutContent.SubstitutionPreferences> {

        /* renamed from: a, reason: collision with root package name */
        public static final SubstitutionPreferences f22218a = new SubstitutionPreferences();
        public static final List b = CollectionsKt.R("title", "body", "state", "info");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            SubstitutionState substitutionStateA = null;
            CheckoutContent.Info1 info1 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    substitutionStateA = SubstitutionState_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    info1 = (CheckoutContent.Info1) Adapters.c(Info1.f22157a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (substitutionStateA == null) {
                Assertions.a(reader, "state");
                throw null;
            }
            if (info1 != null) {
                return new CheckoutContent.SubstitutionPreferences(str, str2, substitutionStateA, info1);
            }
            Assertions.a(reader, "info");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.SubstitutionPreferences value = (CheckoutContent.SubstitutionPreferences) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22138a);
            writer.F1("body");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("state");
            SubstitutionState_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1("info");
            Adapters.c(Info1.f22157a, false).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$Total;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Total;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Total implements Adapter<CheckoutContent.Total> {

        /* renamed from: a, reason: collision with root package name */
        public static final Total f22219a = new Total();
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
                return new CheckoutContent.Total(str, str2, dDoubleValue, str3, checkoutProgressId, bool2.booleanValue());
            }
            Assertions.a(reader, "isEnabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.Total value = (CheckoutContent.Total) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22139a);
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
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$UnavailableOrderItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$UnavailableOrderItem;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnavailableOrderItem implements Adapter<CheckoutContent.UnavailableOrderItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final UnavailableOrderItem f22220a = new UnavailableOrderItem();
        public static final List b = CollectionsKt.Q(AppMeasurementSdk.ConditionalUserProperty.NAME);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
            }
            return new CheckoutContent.UnavailableOrderItem(str);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.UnavailableOrderItem value = (CheckoutContent.UnavailableOrderItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AppMeasurementSdk.ConditionalUserProperty.NAME);
            Adapters.i.toJson(writer, customScalarAdapters, value.f22140a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentImpl_ResponseAdapter$Windows;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Windows;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Windows implements Adapter<CheckoutContent.Windows> {

        /* renamed from: a, reason: collision with root package name */
        public static final Windows f22221a = new Windows();
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
            CheckoutFulfilmentWindows checkoutFulfilmentWindowsA = CheckoutFulfilmentWindowsImpl_ResponseAdapter.CheckoutFulfilmentWindows.a(reader, customScalarAdapters);
            if (str != null) {
                return new CheckoutContent.Windows(str, checkoutFulfilmentWindowsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutContent.Windows value = (CheckoutContent.Windows) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22141a);
            List list = CheckoutFulfilmentWindowsImpl_ResponseAdapter.CheckoutFulfilmentWindows.f22434a;
            CheckoutFulfilmentWindowsImpl_ResponseAdapter.CheckoutFulfilmentWindows.b(writer, customScalarAdapters, value.b);
        }
    }
}
