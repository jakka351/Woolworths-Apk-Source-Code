package com.woolworths.shop.checkout.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFieldsImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.ApplyPromoCodeBannerType;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.adapter.ApplyPromoCodeBannerType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionPlacement_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerDisplayType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.UrlHandler;
import com.woolworths.shop.checkout.ApplyCheckoutPromoCodeMutation;
import com.woolworths.shop.checkout.fragment.CheckoutContentSummary;
import com.woolworths.shop.checkout.fragment.CheckoutContentSummaryImpl_ResponseAdapter;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/ApplyCheckoutPromoCodeMutation_ResponseAdapter;", "", "Data", "ApplyCheckoutPromoCode", "Result", "OnApplyPromoCodeFail", "OnApplyPromoCodeSuccess", "OnApplyPromoCodeReplaceConfirmation", "OnApplyPromoCodeAdditionalInfo", "Banner", "Action", "Analytics", "ClickAnalytics", "CheckoutSummary", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ApplyCheckoutPromoCodeMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/ApplyCheckoutPromoCodeMutation_ResponseAdapter$Action;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/ApplyCheckoutPromoCodeMutation$Action;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action implements Adapter<ApplyCheckoutPromoCodeMutation.Action> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action f21950a = new Action();
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
                return new ApplyCheckoutPromoCodeMutation.Action(insetBannerActionPlacementA, insetBannerActionTypeA, str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ApplyCheckoutPromoCodeMutation.Action value = (ApplyCheckoutPromoCodeMutation.Action) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("placement");
            InsetBannerActionPlacement_ResponseAdapter.b(writer, customScalarAdapters, value.f21807a);
            writer.F1("type");
            InsetBannerActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/ApplyCheckoutPromoCodeMutation_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/ApplyCheckoutPromoCodeMutation$Analytics;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<ApplyCheckoutPromoCodeMutation.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f21951a = new Analytics();
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
                return new ApplyCheckoutPromoCodeMutation.Analytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ApplyCheckoutPromoCodeMutation.Analytics value = (ApplyCheckoutPromoCodeMutation.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21808a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/ApplyCheckoutPromoCodeMutation_ResponseAdapter$ApplyCheckoutPromoCode;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/ApplyCheckoutPromoCodeMutation$ApplyCheckoutPromoCode;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ApplyCheckoutPromoCode implements Adapter<ApplyCheckoutPromoCodeMutation.ApplyCheckoutPromoCode> {

        /* renamed from: a, reason: collision with root package name */
        public static final ApplyCheckoutPromoCode f21952a = new ApplyCheckoutPromoCode();
        public static final List b = CollectionsKt.R(lqlqqlq.m006Dm006Dm006Dm, "checkoutSummary");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ApplyCheckoutPromoCodeMutation.Result result = null;
            ApplyCheckoutPromoCodeMutation.CheckoutSummary checkoutSummary = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    result = (ApplyCheckoutPromoCodeMutation.Result) Adapters.c(Result.f21961a, true).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    checkoutSummary = (ApplyCheckoutPromoCodeMutation.CheckoutSummary) Adapters.b(Adapters.c(CheckoutSummary.f21954a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (result != null) {
                return new ApplyCheckoutPromoCodeMutation.ApplyCheckoutPromoCode(result, checkoutSummary);
            }
            Assertions.a(reader, lqlqqlq.m006Dm006Dm006Dm);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ApplyCheckoutPromoCodeMutation.ApplyCheckoutPromoCode value = (ApplyCheckoutPromoCodeMutation.ApplyCheckoutPromoCode) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(lqlqqlq.m006Dm006Dm006Dm);
            Adapters.c(Result.f21961a, true).toJson(writer, customScalarAdapters, value.f21809a);
            writer.F1("checkoutSummary");
            Adapters.b(Adapters.c(CheckoutSummary.f21954a, true)).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/ApplyCheckoutPromoCodeMutation_ResponseAdapter$Banner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/ApplyCheckoutPromoCodeMutation$Banner;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Banner implements Adapter<ApplyCheckoutPromoCodeMutation.Banner> {

        /* renamed from: a, reason: collision with root package name */
        public static final Banner f21953a = new Banner();
        public static final List b = CollectionsKt.R("displayType", "message", "iconUrl", "bannerTitle", UrlHandler.ACTION, "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            ApplyCheckoutPromoCodeMutation.Action action = null;
            ApplyCheckoutPromoCodeMutation.Analytics analytics = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    insetBannerDisplayTypeA = InsetBannerDisplayType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    action = (ApplyCheckoutPromoCodeMutation.Action) Adapters.b(Adapters.c(Action.f21950a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    analytics = (ApplyCheckoutPromoCodeMutation.Analytics) Adapters.b(Adapters.c(Analytics.f21951a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerDisplayTypeA == null) {
                Assertions.a(reader, "displayType");
                throw null;
            }
            if (str != null) {
                return new ApplyCheckoutPromoCodeMutation.Banner(insetBannerDisplayTypeA, str, str2, str3, action, analytics);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ApplyCheckoutPromoCodeMutation.Banner value = (ApplyCheckoutPromoCodeMutation.Banner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.f21810a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("iconUrl");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("bannerTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1(UrlHandler.ACTION);
            Adapters.b(Adapters.c(Action.f21950a, false)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics.f21951a, true)).toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/ApplyCheckoutPromoCodeMutation_ResponseAdapter$CheckoutSummary;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/ApplyCheckoutPromoCodeMutation$CheckoutSummary;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CheckoutSummary implements Adapter<ApplyCheckoutPromoCodeMutation.CheckoutSummary> {

        /* renamed from: a, reason: collision with root package name */
        public static final CheckoutSummary f21954a = new CheckoutSummary();
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
            CheckoutContentSummary checkoutContentSummaryA = CheckoutContentSummaryImpl_ResponseAdapter.CheckoutContentSummary.a(reader, customScalarAdapters);
            if (str != null) {
                return new ApplyCheckoutPromoCodeMutation.CheckoutSummary(str, checkoutContentSummaryA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ApplyCheckoutPromoCodeMutation.CheckoutSummary value = (ApplyCheckoutPromoCodeMutation.CheckoutSummary) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21811a);
            List list = CheckoutContentSummaryImpl_ResponseAdapter.CheckoutContentSummary.f22303a;
            CheckoutContentSummaryImpl_ResponseAdapter.CheckoutContentSummary.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/ApplyCheckoutPromoCodeMutation_ResponseAdapter$ClickAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/ApplyCheckoutPromoCodeMutation$ClickAnalytics;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClickAnalytics implements Adapter<ApplyCheckoutPromoCodeMutation.ClickAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ClickAnalytics f21955a = new ClickAnalytics();
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
                return new ApplyCheckoutPromoCodeMutation.ClickAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ApplyCheckoutPromoCodeMutation.ClickAnalytics value = (ApplyCheckoutPromoCodeMutation.ClickAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21812a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/ApplyCheckoutPromoCodeMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/ApplyCheckoutPromoCodeMutation$Data;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<ApplyCheckoutPromoCodeMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f21956a = new Data();
        public static final List b = CollectionsKt.Q("applyCheckoutPromoCode");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ApplyCheckoutPromoCodeMutation.ApplyCheckoutPromoCode applyCheckoutPromoCode = null;
            while (reader.o2(b) == 0) {
                applyCheckoutPromoCode = (ApplyCheckoutPromoCodeMutation.ApplyCheckoutPromoCode) Adapters.c(ApplyCheckoutPromoCode.f21952a, false).fromJson(reader, customScalarAdapters);
            }
            if (applyCheckoutPromoCode != null) {
                return new ApplyCheckoutPromoCodeMutation.Data(applyCheckoutPromoCode);
            }
            Assertions.a(reader, "applyCheckoutPromoCode");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ApplyCheckoutPromoCodeMutation.Data value = (ApplyCheckoutPromoCodeMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("applyCheckoutPromoCode");
            Adapters.c(ApplyCheckoutPromoCode.f21952a, false).toJson(writer, customScalarAdapters, value.f21813a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/ApplyCheckoutPromoCodeMutation_ResponseAdapter$OnApplyPromoCodeAdditionalInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/ApplyCheckoutPromoCodeMutation$OnApplyPromoCodeAdditionalInfo;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnApplyPromoCodeAdditionalInfo implements Adapter<ApplyCheckoutPromoCodeMutation.OnApplyPromoCodeAdditionalInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21957a = CollectionsKt.R("type", "banner", "clickAnalytics");

        public static ApplyCheckoutPromoCodeMutation.OnApplyPromoCodeAdditionalInfo a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ApplyPromoCodeBannerType applyPromoCodeBannerTypeA = null;
            ApplyCheckoutPromoCodeMutation.Banner banner = null;
            ApplyCheckoutPromoCodeMutation.ClickAnalytics clickAnalytics = null;
            while (true) {
                int iO2 = reader.o2(f21957a);
                if (iO2 == 0) {
                    applyPromoCodeBannerTypeA = ApplyPromoCodeBannerType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    banner = (ApplyCheckoutPromoCodeMutation.Banner) Adapters.c(Banner.f21953a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    clickAnalytics = (ApplyCheckoutPromoCodeMutation.ClickAnalytics) Adapters.c(ClickAnalytics.f21955a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (applyPromoCodeBannerTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (banner == null) {
                Assertions.a(reader, "banner");
                throw null;
            }
            if (clickAnalytics != null) {
                return new ApplyCheckoutPromoCodeMutation.OnApplyPromoCodeAdditionalInfo(applyPromoCodeBannerTypeA, banner, clickAnalytics);
            }
            Assertions.a(reader, "clickAnalytics");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ApplyCheckoutPromoCodeMutation.OnApplyPromoCodeAdditionalInfo value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            writer.v0(value.f21814a.d);
            writer.F1("banner");
            Adapters.c(Banner.f21953a, false).toJson(writer, customScalarAdapters, value.b);
            writer.F1("clickAnalytics");
            Adapters.c(ClickAnalytics.f21955a, true).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ApplyCheckoutPromoCodeMutation.OnApplyPromoCodeAdditionalInfo) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/ApplyCheckoutPromoCodeMutation_ResponseAdapter$OnApplyPromoCodeFail;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/ApplyCheckoutPromoCodeMutation$OnApplyPromoCodeFail;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnApplyPromoCodeFail implements Adapter<ApplyCheckoutPromoCodeMutation.OnApplyPromoCodeFail> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21958a = CollectionsKt.Q("message");

        public static ApplyCheckoutPromoCodeMutation.OnApplyPromoCodeFail a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f21958a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new ApplyCheckoutPromoCodeMutation.OnApplyPromoCodeFail(str);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ApplyCheckoutPromoCodeMutation.OnApplyPromoCodeFail value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21815a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ApplyCheckoutPromoCodeMutation.OnApplyPromoCodeFail) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/ApplyCheckoutPromoCodeMutation_ResponseAdapter$OnApplyPromoCodeReplaceConfirmation;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/ApplyCheckoutPromoCodeMutation$OnApplyPromoCodeReplaceConfirmation;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnApplyPromoCodeReplaceConfirmation implements Adapter<ApplyCheckoutPromoCodeMutation.OnApplyPromoCodeReplaceConfirmation> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21959a = CollectionsKt.R("title", "message", "primaryButtonTitle", "secondaryButtonTitle");

        public static ApplyCheckoutPromoCodeMutation.OnApplyPromoCodeReplaceConfirmation a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int iO2 = reader.o2(f21959a);
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
                Assertions.a(reader, "message");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "primaryButtonTitle");
                throw null;
            }
            if (str4 != null) {
                return new ApplyCheckoutPromoCodeMutation.OnApplyPromoCodeReplaceConfirmation(str, str2, str3, str4);
            }
            Assertions.a(reader, "secondaryButtonTitle");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ApplyCheckoutPromoCodeMutation.OnApplyPromoCodeReplaceConfirmation value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21816a);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("primaryButtonTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("secondaryButtonTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ApplyCheckoutPromoCodeMutation.OnApplyPromoCodeReplaceConfirmation) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/ApplyCheckoutPromoCodeMutation_ResponseAdapter$OnApplyPromoCodeSuccess;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/ApplyCheckoutPromoCodeMutation$OnApplyPromoCodeSuccess;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnApplyPromoCodeSuccess implements Adapter<ApplyCheckoutPromoCodeMutation.OnApplyPromoCodeSuccess> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21960a = CollectionsKt.Q("message");

        public static ApplyCheckoutPromoCodeMutation.OnApplyPromoCodeSuccess a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f21960a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new ApplyCheckoutPromoCodeMutation.OnApplyPromoCodeSuccess(str);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ApplyCheckoutPromoCodeMutation.OnApplyPromoCodeSuccess value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21817a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ApplyCheckoutPromoCodeMutation.OnApplyPromoCodeSuccess) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/ApplyCheckoutPromoCodeMutation_ResponseAdapter$Result;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/ApplyCheckoutPromoCodeMutation$Result;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Result implements Adapter<ApplyCheckoutPromoCodeMutation.Result> {

        /* renamed from: a, reason: collision with root package name */
        public static final Result f21961a = new Result();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            ApplyCheckoutPromoCodeMutation.OnApplyPromoCodeFail onApplyPromoCodeFailA;
            ApplyCheckoutPromoCodeMutation.OnApplyPromoCodeSuccess onApplyPromoCodeSuccessA;
            ApplyCheckoutPromoCodeMutation.OnApplyPromoCodeReplaceConfirmation onApplyPromoCodeReplaceConfirmationA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ApplyCheckoutPromoCodeMutation.OnApplyPromoCodeAdditionalInfo onApplyPromoCodeAdditionalInfoA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ApplyPromoCodeFail"))) {
                reader.o();
                onApplyPromoCodeFailA = OnApplyPromoCodeFail.a(reader, customScalarAdapters);
            } else {
                onApplyPromoCodeFailA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ApplyPromoCodeSuccess"))) {
                reader.o();
                onApplyPromoCodeSuccessA = OnApplyPromoCodeSuccess.a(reader, customScalarAdapters);
            } else {
                onApplyPromoCodeSuccessA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ApplyPromoCodeReplaceConfirmation"))) {
                reader.o();
                onApplyPromoCodeReplaceConfirmationA = OnApplyPromoCodeReplaceConfirmation.a(reader, customScalarAdapters);
            } else {
                onApplyPromoCodeReplaceConfirmationA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ApplyPromoCodeAdditionalInfo"))) {
                reader.o();
                onApplyPromoCodeAdditionalInfoA = OnApplyPromoCodeAdditionalInfo.a(reader, customScalarAdapters);
            }
            return new ApplyCheckoutPromoCodeMutation.Result(str, onApplyPromoCodeFailA, onApplyPromoCodeSuccessA, onApplyPromoCodeReplaceConfirmationA, onApplyPromoCodeAdditionalInfoA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ApplyCheckoutPromoCodeMutation.Result value = (ApplyCheckoutPromoCodeMutation.Result) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21818a);
            ApplyCheckoutPromoCodeMutation.OnApplyPromoCodeFail onApplyPromoCodeFail = value.b;
            if (onApplyPromoCodeFail != null) {
                OnApplyPromoCodeFail.b(writer, customScalarAdapters, onApplyPromoCodeFail);
            }
            ApplyCheckoutPromoCodeMutation.OnApplyPromoCodeSuccess onApplyPromoCodeSuccess = value.c;
            if (onApplyPromoCodeSuccess != null) {
                OnApplyPromoCodeSuccess.b(writer, customScalarAdapters, onApplyPromoCodeSuccess);
            }
            ApplyCheckoutPromoCodeMutation.OnApplyPromoCodeReplaceConfirmation onApplyPromoCodeReplaceConfirmation = value.d;
            if (onApplyPromoCodeReplaceConfirmation != null) {
                OnApplyPromoCodeReplaceConfirmation.b(writer, customScalarAdapters, onApplyPromoCodeReplaceConfirmation);
            }
            ApplyCheckoutPromoCodeMutation.OnApplyPromoCodeAdditionalInfo onApplyPromoCodeAdditionalInfo = value.e;
            if (onApplyPromoCodeAdditionalInfo != null) {
                OnApplyPromoCodeAdditionalInfo.b(writer, customScalarAdapters, onApplyPromoCodeAdditionalInfo);
            }
        }
    }
}
