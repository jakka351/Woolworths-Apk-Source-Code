package com.woolworths.shop.checkout.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFieldsImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.CoreAlertStyle;
import au.com.woolworths.shop.graphql.type.CoreBroadcastBannerStyle;
import au.com.woolworths.shop.graphql.type.ParagraphTextItemType;
import au.com.woolworths.shop.graphql.type.adapter.ActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CoreAlertStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CoreBroadcastBannerStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ParagraphTextItemType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.woolworths.shop.checkout.fragment.FulfilmentExtraInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\bÇ\u0002\u0018\u00002\u00020\u0001:\u001d\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfoImpl_ResponseAdapter;", "", "FulfilmentExtraInfo", "Content", "OnBasicInsetAlert", "InsetAlertUI", "InsetAlertAction", "Analytics", "OnBasicCoreBroadcastBanner", "ImpressionAnalytics", "BroadcastBannerDismissAnalytics", "BroadcastBannerUI", "Icon", "OnCoreIcon", "OnHostedIcon", "BroadcastBannerAction", "OnFulfilmentFeesInfoSection", "Item", "OnFulfilmentFeeItem", "Price", "OnFulfilmentFeePriceInfo", "OnCheckoutTermsConditions", "OnFulfilmentInfoRowAccordion", "OpenActionAnalytics", "CloseActionAnalytics", "RowUI", "LeadingAsset", "OnHostedIcon1", "OnCoreIcon1", "ExpandedContent", "OnParagraphTextItem", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FulfilmentExtraInfoImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfoImpl_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$Analytics;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<FulfilmentExtraInfo.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f22507a = new Analytics();
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
                return new FulfilmentExtraInfo.Analytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            FulfilmentExtraInfo.Analytics value = (FulfilmentExtraInfo.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22479a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfoImpl_ResponseAdapter$BroadcastBannerAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$BroadcastBannerAction;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BroadcastBannerAction implements Adapter<FulfilmentExtraInfo.BroadcastBannerAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final BroadcastBannerAction f22508a = new BroadcastBannerAction();
        public static final List b = CollectionsKt.R(UrlHandler.ACTION, "id", "type");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ActionType actionTypeA = null;
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
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, UrlHandler.ACTION);
                throw null;
            }
            if (actionTypeA != null) {
                return new FulfilmentExtraInfo.BroadcastBannerAction(actionTypeA, str, str2);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            FulfilmentExtraInfo.BroadcastBannerAction value = (FulfilmentExtraInfo.BroadcastBannerAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22480a);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfoImpl_ResponseAdapter$BroadcastBannerDismissAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$BroadcastBannerDismissAnalytics;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BroadcastBannerDismissAnalytics implements Adapter<FulfilmentExtraInfo.BroadcastBannerDismissAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final BroadcastBannerDismissAnalytics f22509a = new BroadcastBannerDismissAnalytics();
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
                return new FulfilmentExtraInfo.BroadcastBannerDismissAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            FulfilmentExtraInfo.BroadcastBannerDismissAnalytics value = (FulfilmentExtraInfo.BroadcastBannerDismissAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22481a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfoImpl_ResponseAdapter$BroadcastBannerUI;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$BroadcastBannerUI;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BroadcastBannerUI implements Adapter<FulfilmentExtraInfo.BroadcastBannerUI> {

        /* renamed from: a, reason: collision with root package name */
        public static final BroadcastBannerUI f22510a = new BroadcastBannerUI();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "style", BarcodePickDeserializer.FIELD_ICON);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            CoreBroadcastBannerStyle coreBroadcastBannerStyleA = null;
            FulfilmentExtraInfo.Icon icon = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    coreBroadcastBannerStyleA = CoreBroadcastBannerStyle_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    icon = (FulfilmentExtraInfo.Icon) Adapters.c(Icon.f22515a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (coreBroadcastBannerStyleA == null) {
                Assertions.a(reader, "style");
                throw null;
            }
            if (icon != null) {
                return new FulfilmentExtraInfo.BroadcastBannerUI(str, str2, coreBroadcastBannerStyleA, icon);
            }
            Assertions.a(reader, BarcodePickDeserializer.FIELD_ICON);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            FulfilmentExtraInfo.BroadcastBannerUI value = (FulfilmentExtraInfo.BroadcastBannerUI) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22482a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            CoreBroadcastBannerStyle_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1(BarcodePickDeserializer.FIELD_ICON);
            Adapters.c(Icon.f22515a, true).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfoImpl_ResponseAdapter$CloseActionAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$CloseActionAnalytics;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CloseActionAnalytics implements Adapter<FulfilmentExtraInfo.CloseActionAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final CloseActionAnalytics f22511a = new CloseActionAnalytics();
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
                return new FulfilmentExtraInfo.CloseActionAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            FulfilmentExtraInfo.CloseActionAnalytics value = (FulfilmentExtraInfo.CloseActionAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22483a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfoImpl_ResponseAdapter$Content;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$Content;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Content implements Adapter<FulfilmentExtraInfo.Content> {

        /* renamed from: a, reason: collision with root package name */
        public static final Content f22512a = new Content();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            FulfilmentExtraInfo.OnBasicInsetAlert onBasicInsetAlertA;
            FulfilmentExtraInfo.OnBasicCoreBroadcastBanner onBasicCoreBroadcastBannerA;
            FulfilmentExtraInfo.OnFulfilmentFeesInfoSection onFulfilmentFeesInfoSectionA;
            FulfilmentExtraInfo.OnCheckoutTermsConditions onCheckoutTermsConditionsA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            FulfilmentExtraInfo.OnFulfilmentInfoRowAccordion onFulfilmentInfoRowAccordionA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("BasicInsetAlert"))) {
                reader.o();
                onBasicInsetAlertA = OnBasicInsetAlert.a(reader, customScalarAdapters);
            } else {
                onBasicInsetAlertA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("BasicCoreBroadcastBanner"))) {
                reader.o();
                onBasicCoreBroadcastBannerA = OnBasicCoreBroadcastBanner.a(reader, customScalarAdapters);
            } else {
                onBasicCoreBroadcastBannerA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("FulfilmentFeesInfoSection"))) {
                reader.o();
                onFulfilmentFeesInfoSectionA = OnFulfilmentFeesInfoSection.a(reader, customScalarAdapters);
            } else {
                onFulfilmentFeesInfoSectionA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CheckoutTermsConditions"))) {
                reader.o();
                onCheckoutTermsConditionsA = OnCheckoutTermsConditions.a(reader, customScalarAdapters);
            } else {
                onCheckoutTermsConditionsA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("FulfilmentInfoRowAccordion"))) {
                reader.o();
                onFulfilmentInfoRowAccordionA = OnFulfilmentInfoRowAccordion.a(reader, customScalarAdapters);
            }
            return new FulfilmentExtraInfo.Content(str, onBasicInsetAlertA, onBasicCoreBroadcastBannerA, onFulfilmentFeesInfoSectionA, onCheckoutTermsConditionsA, onFulfilmentInfoRowAccordionA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            FulfilmentExtraInfo.Content value = (FulfilmentExtraInfo.Content) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22484a);
            FulfilmentExtraInfo.OnBasicInsetAlert onBasicInsetAlert = value.b;
            if (onBasicInsetAlert != null) {
                OnBasicInsetAlert.b(writer, customScalarAdapters, onBasicInsetAlert);
            }
            FulfilmentExtraInfo.OnBasicCoreBroadcastBanner onBasicCoreBroadcastBanner = value.c;
            if (onBasicCoreBroadcastBanner != null) {
                OnBasicCoreBroadcastBanner.b(writer, customScalarAdapters, onBasicCoreBroadcastBanner);
            }
            FulfilmentExtraInfo.OnFulfilmentFeesInfoSection onFulfilmentFeesInfoSection = value.d;
            if (onFulfilmentFeesInfoSection != null) {
                OnFulfilmentFeesInfoSection.b(writer, customScalarAdapters, onFulfilmentFeesInfoSection);
            }
            FulfilmentExtraInfo.OnCheckoutTermsConditions onCheckoutTermsConditions = value.e;
            if (onCheckoutTermsConditions != null) {
                OnCheckoutTermsConditions.b(writer, customScalarAdapters, onCheckoutTermsConditions);
            }
            FulfilmentExtraInfo.OnFulfilmentInfoRowAccordion onFulfilmentInfoRowAccordion = value.f;
            if (onFulfilmentInfoRowAccordion != null) {
                OnFulfilmentInfoRowAccordion.b(writer, customScalarAdapters, onFulfilmentInfoRowAccordion);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfoImpl_ResponseAdapter$ExpandedContent;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$ExpandedContent;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ExpandedContent implements Adapter<FulfilmentExtraInfo.ExpandedContent> {

        /* renamed from: a, reason: collision with root package name */
        public static final ExpandedContent f22513a = new ExpandedContent();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            FulfilmentExtraInfo.OnParagraphTextItem onParagraphTextItemA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("ParagraphTextItem"))) {
                reader.o();
                onParagraphTextItemA = OnParagraphTextItem.a(reader, customScalarAdapters);
            }
            return new FulfilmentExtraInfo.ExpandedContent(str, onParagraphTextItemA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            FulfilmentExtraInfo.ExpandedContent value = (FulfilmentExtraInfo.ExpandedContent) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22485a);
            FulfilmentExtraInfo.OnParagraphTextItem onParagraphTextItem = value.b;
            if (onParagraphTextItem != null) {
                OnParagraphTextItem.b(writer, customScalarAdapters, onParagraphTextItem);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfoImpl_ResponseAdapter$FulfilmentExtraInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FulfilmentExtraInfo implements Adapter<com.woolworths.shop.checkout.fragment.FulfilmentExtraInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22514a = CollectionsKt.R("title", "content");

        public static com.woolworths.shop.checkout.fragment.FulfilmentExtraInfo a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f22514a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Content.f22512a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new com.woolworths.shop.checkout.fragment.FulfilmentExtraInfo(str, arrayListFromJson);
            }
            Assertions.a(reader, "content");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, com.woolworths.shop.checkout.fragment.FulfilmentExtraInfo value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22478a);
            writer.F1("content");
            Adapters.a(Adapters.c(Content.f22512a, true)).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (com.woolworths.shop.checkout.fragment.FulfilmentExtraInfo) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfoImpl_ResponseAdapter$Icon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$Icon;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Icon implements Adapter<FulfilmentExtraInfo.Icon> {

        /* renamed from: a, reason: collision with root package name */
        public static final Icon f22515a = new Icon();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            FulfilmentExtraInfo.OnCoreIcon onCoreIconA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            FulfilmentExtraInfo.OnHostedIcon onHostedIconA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CoreIcon"))) {
                reader.o();
                onCoreIconA = OnCoreIcon.a(reader, customScalarAdapters);
            } else {
                onCoreIconA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HostedIcon"))) {
                reader.o();
                onHostedIconA = OnHostedIcon.a(reader, customScalarAdapters);
            }
            return new FulfilmentExtraInfo.Icon(str, onCoreIconA, onHostedIconA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            FulfilmentExtraInfo.Icon value = (FulfilmentExtraInfo.Icon) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22486a);
            FulfilmentExtraInfo.OnCoreIcon onCoreIcon = value.b;
            if (onCoreIcon != null) {
                OnCoreIcon.b(writer, customScalarAdapters, onCoreIcon);
            }
            FulfilmentExtraInfo.OnHostedIcon onHostedIcon = value.c;
            if (onHostedIcon != null) {
                OnHostedIcon.b(writer, customScalarAdapters, onHostedIcon);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfoImpl_ResponseAdapter$ImpressionAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$ImpressionAnalytics;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImpressionAnalytics implements Adapter<FulfilmentExtraInfo.ImpressionAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ImpressionAnalytics f22516a = new ImpressionAnalytics();
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
                return new FulfilmentExtraInfo.ImpressionAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            FulfilmentExtraInfo.ImpressionAnalytics value = (FulfilmentExtraInfo.ImpressionAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22487a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfoImpl_ResponseAdapter$InsetAlertAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$InsetAlertAction;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InsetAlertAction implements Adapter<FulfilmentExtraInfo.InsetAlertAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final InsetAlertAction f22517a = new InsetAlertAction();
        public static final List b = CollectionsKt.R("id", "type", UrlHandler.ACTION, "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ActionType actionTypeA = null;
            String str2 = null;
            FulfilmentExtraInfo.Analytics analytics = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    analytics = (FulfilmentExtraInfo.Analytics) Adapters.b(Adapters.c(Analytics.f22507a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str2 != null) {
                return new FulfilmentExtraInfo.InsetAlertAction(str, actionTypeA, str2, analytics);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            FulfilmentExtraInfo.InsetAlertAction value = (FulfilmentExtraInfo.InsetAlertAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.f22488a);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics.f22507a, true)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfoImpl_ResponseAdapter$InsetAlertUI;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$InsetAlertUI;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InsetAlertUI implements Adapter<FulfilmentExtraInfo.InsetAlertUI> {

        /* renamed from: a, reason: collision with root package name */
        public static final InsetAlertUI f22518a = new InsetAlertUI();
        public static final List b = CollectionsKt.R("title", lqlqqlq.mmm006Dm006Dm, "style");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            CoreAlertStyle coreAlertStyleA = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    coreAlertStyleA = CoreAlertStyle_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (coreAlertStyleA != null) {
                return new FulfilmentExtraInfo.InsetAlertUI(coreAlertStyleA, str, str2);
            }
            Assertions.a(reader, "style");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            FulfilmentExtraInfo.InsetAlertUI value = (FulfilmentExtraInfo.InsetAlertUI) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f22489a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            CoreAlertStyle_ResponseAdapter.b(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfoImpl_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$Item;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<FulfilmentExtraInfo.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f22519a = new Item();
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
            FulfilmentExtraInfo.OnFulfilmentFeeItem onFulfilmentFeeItemA = OnFulfilmentFeeItem.a(reader, customScalarAdapters);
            if (str != null) {
                return new FulfilmentExtraInfo.Item(str, onFulfilmentFeeItemA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            FulfilmentExtraInfo.Item value = (FulfilmentExtraInfo.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22490a);
            List list = OnFulfilmentFeeItem.f22526a;
            OnFulfilmentFeeItem.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfoImpl_ResponseAdapter$LeadingAsset;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$LeadingAsset;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LeadingAsset implements Adapter<FulfilmentExtraInfo.LeadingAsset> {

        /* renamed from: a, reason: collision with root package name */
        public static final LeadingAsset f22520a = new LeadingAsset();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            FulfilmentExtraInfo.OnHostedIcon1 onHostedIcon1A;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            FulfilmentExtraInfo.OnCoreIcon1 onCoreIcon1A = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HostedIcon"))) {
                reader.o();
                onHostedIcon1A = OnHostedIcon1.a(reader, customScalarAdapters);
            } else {
                onHostedIcon1A = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CoreIcon"))) {
                reader.o();
                onCoreIcon1A = OnCoreIcon1.a(reader, customScalarAdapters);
            }
            return new FulfilmentExtraInfo.LeadingAsset(str, onHostedIcon1A, onCoreIcon1A);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            FulfilmentExtraInfo.LeadingAsset value = (FulfilmentExtraInfo.LeadingAsset) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22491a);
            FulfilmentExtraInfo.OnHostedIcon1 onHostedIcon1 = value.b;
            if (onHostedIcon1 != null) {
                OnHostedIcon1.b(writer, customScalarAdapters, onHostedIcon1);
            }
            FulfilmentExtraInfo.OnCoreIcon1 onCoreIcon1 = value.c;
            if (onCoreIcon1 != null) {
                OnCoreIcon1.b(writer, customScalarAdapters, onCoreIcon1);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfoImpl_ResponseAdapter$OnBasicCoreBroadcastBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$OnBasicCoreBroadcastBanner;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnBasicCoreBroadcastBanner implements Adapter<FulfilmentExtraInfo.OnBasicCoreBroadcastBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22521a = CollectionsKt.R("impressionAnalytics", "broadcastBannerDismissAnalytics", "broadcastBannerUI", "broadcastBannerAction", "broadcastBannerActionLabel", "broadcastBannerId", "broadcastBannerDismissible");

        public static FulfilmentExtraInfo.OnBasicCoreBroadcastBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            FulfilmentExtraInfo.ImpressionAnalytics impressionAnalytics = null;
            FulfilmentExtraInfo.BroadcastBannerDismissAnalytics broadcastBannerDismissAnalytics = null;
            FulfilmentExtraInfo.BroadcastBannerUI broadcastBannerUI = null;
            FulfilmentExtraInfo.BroadcastBannerAction broadcastBannerAction = null;
            String str = null;
            String str2 = null;
            while (true) {
                switch (reader.o2(f22521a)) {
                    case 0:
                        bool = bool2;
                        impressionAnalytics = (FulfilmentExtraInfo.ImpressionAnalytics) Adapters.b(Adapters.c(ImpressionAnalytics.f22516a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bool = bool2;
                        broadcastBannerDismissAnalytics = (FulfilmentExtraInfo.BroadcastBannerDismissAnalytics) Adapters.b(Adapters.c(BroadcastBannerDismissAnalytics.f22509a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        bool = bool2;
                        broadcastBannerUI = (FulfilmentExtraInfo.BroadcastBannerUI) Adapters.c(BroadcastBannerUI.f22510a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool = bool2;
                        broadcastBannerAction = (FulfilmentExtraInfo.BroadcastBannerAction) Adapters.b(Adapters.c(BroadcastBannerAction.f22508a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool = bool2;
                        str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        bool = bool2;
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    default:
                        Boolean bool3 = bool2;
                        if (broadcastBannerUI == null) {
                            Assertions.a(reader, "broadcastBannerUI");
                            throw null;
                        }
                        if (bool3 != null) {
                            return new FulfilmentExtraInfo.OnBasicCoreBroadcastBanner(impressionAnalytics, broadcastBannerDismissAnalytics, broadcastBannerUI, broadcastBannerAction, str, str2, bool3.booleanValue());
                        }
                        Assertions.a(reader, "broadcastBannerDismissible");
                        throw null;
                }
                bool2 = bool;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, FulfilmentExtraInfo.OnBasicCoreBroadcastBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("impressionAnalytics");
            Adapters.b(Adapters.c(ImpressionAnalytics.f22516a, true)).toJson(writer, customScalarAdapters, value.f22492a);
            writer.F1("broadcastBannerDismissAnalytics");
            Adapters.b(Adapters.c(BroadcastBannerDismissAnalytics.f22509a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("broadcastBannerUI");
            Adapters.c(BroadcastBannerUI.f22510a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("broadcastBannerAction");
            Adapters.b(Adapters.c(BroadcastBannerAction.f22508a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("broadcastBannerActionLabel");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("broadcastBannerId");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
            writer.F1("broadcastBannerDismissible");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.g));
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (FulfilmentExtraInfo.OnBasicCoreBroadcastBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfoImpl_ResponseAdapter$OnBasicInsetAlert;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$OnBasicInsetAlert;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnBasicInsetAlert implements Adapter<FulfilmentExtraInfo.OnBasicInsetAlert> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22522a = CollectionsKt.R("insetAlertUI", "insetAlertAction", "insetAlertActionLabel");

        public static FulfilmentExtraInfo.OnBasicInsetAlert a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            FulfilmentExtraInfo.InsetAlertUI insetAlertUI = null;
            FulfilmentExtraInfo.InsetAlertAction insetAlertAction = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(f22522a);
                if (iO2 == 0) {
                    insetAlertUI = (FulfilmentExtraInfo.InsetAlertUI) Adapters.c(InsetAlertUI.f22518a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    insetAlertAction = (FulfilmentExtraInfo.InsetAlertAction) Adapters.b(Adapters.c(InsetAlertAction.f22517a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (insetAlertUI != null) {
                return new FulfilmentExtraInfo.OnBasicInsetAlert(insetAlertUI, insetAlertAction, str);
            }
            Assertions.a(reader, "insetAlertUI");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, FulfilmentExtraInfo.OnBasicInsetAlert value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("insetAlertUI");
            Adapters.c(InsetAlertUI.f22518a, false).toJson(writer, customScalarAdapters, value.f22493a);
            writer.F1("insetAlertAction");
            Adapters.b(Adapters.c(InsetAlertAction.f22517a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("insetAlertActionLabel");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (FulfilmentExtraInfo.OnBasicInsetAlert) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfoImpl_ResponseAdapter$OnCheckoutTermsConditions;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$OnCheckoutTermsConditions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckoutTermsConditions implements Adapter<FulfilmentExtraInfo.OnCheckoutTermsConditions> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22523a = CollectionsKt.Q("markdownText");

        public static FulfilmentExtraInfo.OnCheckoutTermsConditions a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f22523a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new FulfilmentExtraInfo.OnCheckoutTermsConditions(str);
            }
            Assertions.a(reader, "markdownText");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, FulfilmentExtraInfo.OnCheckoutTermsConditions value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("markdownText");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22494a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (FulfilmentExtraInfo.OnCheckoutTermsConditions) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfoImpl_ResponseAdapter$OnCoreIcon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$OnCoreIcon;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCoreIcon implements Adapter<FulfilmentExtraInfo.OnCoreIcon> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22524a = CollectionsKt.Q("coreIconName");

        public static FulfilmentExtraInfo.OnCoreIcon a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f22524a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new FulfilmentExtraInfo.OnCoreIcon(str);
            }
            Assertions.a(reader, "coreIconName");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, FulfilmentExtraInfo.OnCoreIcon value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("coreIconName");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22495a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (FulfilmentExtraInfo.OnCoreIcon) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfoImpl_ResponseAdapter$OnCoreIcon1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$OnCoreIcon1;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCoreIcon1 implements Adapter<FulfilmentExtraInfo.OnCoreIcon1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22525a = CollectionsKt.Q("coreIconName");

        public static FulfilmentExtraInfo.OnCoreIcon1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f22525a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new FulfilmentExtraInfo.OnCoreIcon1(str);
            }
            Assertions.a(reader, "coreIconName");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, FulfilmentExtraInfo.OnCoreIcon1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("coreIconName");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22496a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (FulfilmentExtraInfo.OnCoreIcon1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfoImpl_ResponseAdapter$OnFulfilmentFeeItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$OnFulfilmentFeeItem;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnFulfilmentFeeItem implements Adapter<FulfilmentExtraInfo.OnFulfilmentFeeItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22526a = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "prices");

        public static FulfilmentExtraInfo.OnFulfilmentFeeItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f22526a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Price.f22534a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new FulfilmentExtraInfo.OnFulfilmentFeeItem(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, "prices");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, FulfilmentExtraInfo.OnFulfilmentFeeItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22497a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("prices");
            Adapters.a(Adapters.c(Price.f22534a, true)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (FulfilmentExtraInfo.OnFulfilmentFeeItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfoImpl_ResponseAdapter$OnFulfilmentFeePriceInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$OnFulfilmentFeePriceInfo;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnFulfilmentFeePriceInfo implements Adapter<FulfilmentExtraInfo.OnFulfilmentFeePriceInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22527a = CollectionsKt.R("amount", lqlqqlq.mmm006Dm006Dm);

        public static FulfilmentExtraInfo.OnFulfilmentFeePriceInfo a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f22527a);
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
                return new FulfilmentExtraInfo.OnFulfilmentFeePriceInfo(str, str2);
            }
            Assertions.a(reader, "amount");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, FulfilmentExtraInfo.OnFulfilmentFeePriceInfo value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("amount");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22498a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (FulfilmentExtraInfo.OnFulfilmentFeePriceInfo) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfoImpl_ResponseAdapter$OnFulfilmentFeesInfoSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$OnFulfilmentFeesInfoSection;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnFulfilmentFeesInfoSection implements Adapter<FulfilmentExtraInfo.OnFulfilmentFeesInfoSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22528a = CollectionsKt.R("feesInfoSectionTitle", "items");

        public static FulfilmentExtraInfo.OnFulfilmentFeesInfoSection a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f22528a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Item.f22519a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new FulfilmentExtraInfo.OnFulfilmentFeesInfoSection(str, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, FulfilmentExtraInfo.OnFulfilmentFeesInfoSection value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("feesInfoSectionTitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.f22499a);
            writer.F1("items");
            Adapters.a(Adapters.c(Item.f22519a, true)).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (FulfilmentExtraInfo.OnFulfilmentFeesInfoSection) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfoImpl_ResponseAdapter$OnFulfilmentInfoRowAccordion;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$OnFulfilmentInfoRowAccordion;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnFulfilmentInfoRowAccordion implements Adapter<FulfilmentExtraInfo.OnFulfilmentInfoRowAccordion> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22529a = CollectionsKt.R("openActionAnalytics", "closeActionAnalytics", "rowUI", "isExpanded", "hasTopSeparator", "expandedContent");

        public static FulfilmentExtraInfo.OnFulfilmentInfoRowAccordion a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            FulfilmentExtraInfo.OpenActionAnalytics openActionAnalytics = null;
            FulfilmentExtraInfo.CloseActionAnalytics closeActionAnalytics = null;
            FulfilmentExtraInfo.RowUI rowUI = null;
            Boolean bool3 = null;
            FulfilmentExtraInfo.ExpandedContent expandedContent = null;
            while (true) {
                int iO2 = reader.o2(f22529a);
                if (iO2 == 0) {
                    bool = bool2;
                    openActionAnalytics = (FulfilmentExtraInfo.OpenActionAnalytics) Adapters.b(Adapters.c(OpenActionAnalytics.f22533a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = bool2;
                    closeActionAnalytics = (FulfilmentExtraInfo.CloseActionAnalytics) Adapters.b(Adapters.c(CloseActionAnalytics.f22511a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool = bool2;
                    rowUI = (FulfilmentExtraInfo.RowUI) Adapters.c(RowUI.f22535a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    bool = bool2;
                    bool3 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    bool = bool2;
                    expandedContent = (FulfilmentExtraInfo.ExpandedContent) Adapters.b(Adapters.c(ExpandedContent.f22513a, true)).fromJson(reader, customScalarAdapters);
                }
                bool2 = bool;
            }
            Boolean bool4 = bool2;
            if (rowUI == null) {
                Assertions.a(reader, "rowUI");
                throw null;
            }
            if (bool4 == null) {
                Assertions.a(reader, "isExpanded");
                throw null;
            }
            Boolean bool5 = bool3;
            boolean zBooleanValue = bool4.booleanValue();
            if (bool5 != null) {
                return new FulfilmentExtraInfo.OnFulfilmentInfoRowAccordion(openActionAnalytics, closeActionAnalytics, rowUI, zBooleanValue, bool5.booleanValue(), expandedContent);
            }
            Assertions.a(reader, "hasTopSeparator");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, FulfilmentExtraInfo.OnFulfilmentInfoRowAccordion value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("openActionAnalytics");
            Adapters.b(Adapters.c(OpenActionAnalytics.f22533a, true)).toJson(writer, customScalarAdapters, value.f22500a);
            writer.F1("closeActionAnalytics");
            Adapters.b(Adapters.c(CloseActionAnalytics.f22511a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("rowUI");
            Adapters.c(RowUI.f22535a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("isExpanded");
            Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
            d.B(value.d, adapters$BooleanAdapter$1, writer, customScalarAdapters, "hasTopSeparator");
            d.B(value.e, adapters$BooleanAdapter$1, writer, customScalarAdapters, "expandedContent");
            Adapters.b(Adapters.c(ExpandedContent.f22513a, true)).toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (FulfilmentExtraInfo.OnFulfilmentInfoRowAccordion) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfoImpl_ResponseAdapter$OnHostedIcon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$OnHostedIcon;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHostedIcon implements Adapter<FulfilmentExtraInfo.OnHostedIcon> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22530a = CollectionsKt.Q("url");

        public static FulfilmentExtraInfo.OnHostedIcon a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f22530a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new FulfilmentExtraInfo.OnHostedIcon(str);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, FulfilmentExtraInfo.OnHostedIcon value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22501a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (FulfilmentExtraInfo.OnHostedIcon) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfoImpl_ResponseAdapter$OnHostedIcon1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$OnHostedIcon1;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHostedIcon1 implements Adapter<FulfilmentExtraInfo.OnHostedIcon1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22531a = CollectionsKt.Q("url");

        public static FulfilmentExtraInfo.OnHostedIcon1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f22531a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new FulfilmentExtraInfo.OnHostedIcon1(str);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, FulfilmentExtraInfo.OnHostedIcon1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22502a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (FulfilmentExtraInfo.OnHostedIcon1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfoImpl_ResponseAdapter$OnParagraphTextItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$OnParagraphTextItem;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnParagraphTextItem implements Adapter<FulfilmentExtraInfo.OnParagraphTextItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22532a = CollectionsKt.R("type", "content");

        public static FulfilmentExtraInfo.OnParagraphTextItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ParagraphTextItemType paragraphTextItemTypeA = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(f22532a);
                if (iO2 == 0) {
                    paragraphTextItemTypeA = ParagraphTextItemType_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (paragraphTextItemTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str != null) {
                return new FulfilmentExtraInfo.OnParagraphTextItem(paragraphTextItemTypeA, str);
            }
            Assertions.a(reader, "content");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, FulfilmentExtraInfo.OnParagraphTextItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            ParagraphTextItemType_ResponseAdapter.b(writer, customScalarAdapters, value.f22503a);
            writer.F1("content");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (FulfilmentExtraInfo.OnParagraphTextItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfoImpl_ResponseAdapter$OpenActionAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$OpenActionAnalytics;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OpenActionAnalytics implements Adapter<FulfilmentExtraInfo.OpenActionAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final OpenActionAnalytics f22533a = new OpenActionAnalytics();
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
                return new FulfilmentExtraInfo.OpenActionAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            FulfilmentExtraInfo.OpenActionAnalytics value = (FulfilmentExtraInfo.OpenActionAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22504a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfoImpl_ResponseAdapter$Price;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$Price;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Price implements Adapter<FulfilmentExtraInfo.Price> {

        /* renamed from: a, reason: collision with root package name */
        public static final Price f22534a = new Price();
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
            FulfilmentExtraInfo.OnFulfilmentFeePriceInfo onFulfilmentFeePriceInfoA = OnFulfilmentFeePriceInfo.a(reader, customScalarAdapters);
            if (str != null) {
                return new FulfilmentExtraInfo.Price(str, onFulfilmentFeePriceInfoA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            FulfilmentExtraInfo.Price value = (FulfilmentExtraInfo.Price) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22505a);
            List list = OnFulfilmentFeePriceInfo.f22527a;
            OnFulfilmentFeePriceInfo.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfoImpl_ResponseAdapter$RowUI;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$RowUI;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RowUI implements Adapter<FulfilmentExtraInfo.RowUI> {

        /* renamed from: a, reason: collision with root package name */
        public static final RowUI f22535a = new RowUI();
        public static final List b = CollectionsKt.R("leadingAsset", lqlqqlq.mmm006Dm006Dm, AnnotatedPrivateKey.LABEL);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            FulfilmentExtraInfo.LeadingAsset leadingAsset = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    leadingAsset = (FulfilmentExtraInfo.LeadingAsset) Adapters.b(Adapters.c(LeadingAsset.f22520a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 != null) {
                return new FulfilmentExtraInfo.RowUI(leadingAsset, str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            FulfilmentExtraInfo.RowUI value = (FulfilmentExtraInfo.RowUI) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("leadingAsset");
            Adapters.b(Adapters.c(LeadingAsset.f22520a, true)).toJson(writer, customScalarAdapters, value.f22506a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
        }
    }
}
