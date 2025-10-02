package com.woolworths.feature.shop.bundles.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCardImpl_ResponseAdapter;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFieldsImpl_ResponseAdapter;
import au.com.woolworths.sdui.shop.fragment.CompatibleColor;
import au.com.woolworths.sdui.shop.fragment.CompatibleColorImpl_ResponseAdapter;
import au.com.woolworths.sdui.shop.fragment.CoreTagUI;
import au.com.woolworths.sdui.shop.fragment.CoreTagUIImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.CoreAlertStyle;
import au.com.woolworths.shop.graphql.type.CoreBroadcastBannerStyle;
import au.com.woolworths.shop.graphql.type.adapter.ActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CoreAlertStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CoreBroadcastBannerStyle_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$IntAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
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
import com.woolworths.feature.shop.bundles.BundlesQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b1\bÇ\u0002\u0018\u00002\u00020\u0001:0\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./01¨\u00062"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter;", "", "Data", "Bundles", "OnBundlesLandingPage", "Analytics", "ImpressionAnalytics", "Header", "SortOptions", "OnBundleSortOptions", "Option", "CoreRadioRowUI", "Chip", "Text", "Item", "OnBasicCoreBroadcastBanner", "ImpressionAnalytics1", "BroadcastBannerDismissAnalytics", "BroadcastBannerUI", "Icon", "OnCoreIcon", "OnHostedIcon", "BroadcastBannerAction", "OnBasicInsetAlert", "InsetAlertUI", "InsetAlertAction", "Analytics1", "ImpressionAnalytics2", "OnBundle", "BundleDetails", "TitleTag", "TextColor", "Pricing", "OnBundleStandardPricing", "Tag", "OnBundleComparisonPricing", "BundleItem", "OnBundleProductCard", "ProductCard", "BundleCta", "OnBundleQuantityStepper", "BundleAnalytics", "BundleImpressionAnalytics", "OnBundlesLandingErrorPage", "Cta", "LinkTextWithAlt", "LinkAction", "Analytics2", "Analytics3", "ImpressionAnalytics3", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BundlesQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$Analytics;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<BundlesQuery.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f19448a = new Analytics();
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
                return new BundlesQuery.Analytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.Analytics value = (BundlesQuery.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19393a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$Analytics1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$Analytics1;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics1 implements Adapter<BundlesQuery.Analytics1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics1 f19449a = new Analytics1();
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
                return new BundlesQuery.Analytics1(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.Analytics1 value = (BundlesQuery.Analytics1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19394a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$Analytics2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$Analytics2;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics2 implements Adapter<BundlesQuery.Analytics2> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics2 f19450a = new Analytics2();
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
                return new BundlesQuery.Analytics2(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.Analytics2 value = (BundlesQuery.Analytics2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19395a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$Analytics3;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$Analytics3;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics3 implements Adapter<BundlesQuery.Analytics3> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics3 f19451a = new Analytics3();
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
                return new BundlesQuery.Analytics3(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.Analytics3 value = (BundlesQuery.Analytics3) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19396a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$BroadcastBannerAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$BroadcastBannerAction;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BroadcastBannerAction implements Adapter<BundlesQuery.BroadcastBannerAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final BroadcastBannerAction f19452a = new BroadcastBannerAction();
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
                return new BundlesQuery.BroadcastBannerAction(actionTypeA, str, str2);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.BroadcastBannerAction value = (BundlesQuery.BroadcastBannerAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19397a);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$BroadcastBannerDismissAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$BroadcastBannerDismissAnalytics;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BroadcastBannerDismissAnalytics implements Adapter<BundlesQuery.BroadcastBannerDismissAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final BroadcastBannerDismissAnalytics f19453a = new BroadcastBannerDismissAnalytics();
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
                return new BundlesQuery.BroadcastBannerDismissAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.BroadcastBannerDismissAnalytics value = (BundlesQuery.BroadcastBannerDismissAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19398a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$BroadcastBannerUI;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$BroadcastBannerUI;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BroadcastBannerUI implements Adapter<BundlesQuery.BroadcastBannerUI> {

        /* renamed from: a, reason: collision with root package name */
        public static final BroadcastBannerUI f19454a = new BroadcastBannerUI();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "style", BarcodePickDeserializer.FIELD_ICON);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            CoreBroadcastBannerStyle coreBroadcastBannerStyleA = null;
            BundlesQuery.Icon icon = null;
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
                    icon = (BundlesQuery.Icon) Adapters.c(Icon.f19466a, true).fromJson(reader, customScalarAdapters);
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
                return new BundlesQuery.BroadcastBannerUI(str, str2, coreBroadcastBannerStyleA, icon);
            }
            Assertions.a(reader, BarcodePickDeserializer.FIELD_ICON);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.BroadcastBannerUI value = (BundlesQuery.BroadcastBannerUI) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19399a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            CoreBroadcastBannerStyle_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1(BarcodePickDeserializer.FIELD_ICON);
            Adapters.c(Icon.f19466a, true).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$BundleAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$BundleAnalytics;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BundleAnalytics implements Adapter<BundlesQuery.BundleAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final BundleAnalytics f19455a = new BundleAnalytics();
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
                return new BundlesQuery.BundleAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.BundleAnalytics value = (BundlesQuery.BundleAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19400a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$BundleCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$BundleCta;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BundleCta implements Adapter<BundlesQuery.BundleCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final BundleCta f19456a = new BundleCta();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            BundlesQuery.OnBundleQuantityStepper onBundleQuantityStepperA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("BundleQuantityStepper"))) {
                reader.o();
                onBundleQuantityStepperA = OnBundleQuantityStepper.a(reader, customScalarAdapters);
            }
            return new BundlesQuery.BundleCta(str, onBundleQuantityStepperA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.BundleCta value = (BundlesQuery.BundleCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19401a);
            BundlesQuery.OnBundleQuantityStepper onBundleQuantityStepper = value.b;
            if (onBundleQuantityStepper != null) {
                OnBundleQuantityStepper.b(writer, customScalarAdapters, onBundleQuantityStepper);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$BundleDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$BundleDetails;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BundleDetails implements Adapter<BundlesQuery.BundleDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final BundleDetails f19457a = new BundleDetails();
        public static final List b = CollectionsKt.R("titleTag", "title", lqlqqlq.mmm006Dm006Dm, "pricing");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            BundlesQuery.TitleTag titleTag = null;
            String str = null;
            String str2 = null;
            BundlesQuery.Pricing pricing = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    titleTag = (BundlesQuery.TitleTag) Adapters.b(Adapters.c(TitleTag.f19495a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    pricing = (BundlesQuery.Pricing) Adapters.c(Pricing.f19489a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (pricing != null) {
                return new BundlesQuery.BundleDetails(titleTag, str, str2, pricing);
            }
            Assertions.a(reader, "pricing");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.BundleDetails value = (BundlesQuery.BundleDetails) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("titleTag");
            Adapters.b(Adapters.c(TitleTag.f19495a, false)).toJson(writer, customScalarAdapters, value.f19402a);
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1("pricing");
            Adapters.c(Pricing.f19489a, true).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$BundleImpressionAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$BundleImpressionAnalytics;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BundleImpressionAnalytics implements Adapter<BundlesQuery.BundleImpressionAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final BundleImpressionAnalytics f19458a = new BundleImpressionAnalytics();
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
                return new BundlesQuery.BundleImpressionAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.BundleImpressionAnalytics value = (BundlesQuery.BundleImpressionAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19403a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$BundleItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$BundleItem;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BundleItem implements Adapter<BundlesQuery.BundleItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final BundleItem f19459a = new BundleItem();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            BundlesQuery.OnBundleProductCard onBundleProductCardA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("BundleProductCard"))) {
                reader.o();
                onBundleProductCardA = OnBundleProductCard.a(reader, customScalarAdapters);
            }
            return new BundlesQuery.BundleItem(str, onBundleProductCardA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.BundleItem value = (BundlesQuery.BundleItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19404a);
            BundlesQuery.OnBundleProductCard onBundleProductCard = value.b;
            if (onBundleProductCard != null) {
                OnBundleProductCard.b(writer, customScalarAdapters, onBundleProductCard);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$Bundles;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$Bundles;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Bundles implements Adapter<BundlesQuery.Bundles> {

        /* renamed from: a, reason: collision with root package name */
        public static final Bundles f19460a = new Bundles();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            BundlesQuery.OnBundlesLandingPage onBundlesLandingPageA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            BundlesQuery.OnBundlesLandingErrorPage onBundlesLandingErrorPageA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("BundlesLandingPage"))) {
                reader.o();
                onBundlesLandingPageA = OnBundlesLandingPage.a(reader, customScalarAdapters);
            } else {
                onBundlesLandingPageA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("BundlesLandingErrorPage"))) {
                reader.o();
                onBundlesLandingErrorPageA = OnBundlesLandingErrorPage.a(reader, customScalarAdapters);
            }
            return new BundlesQuery.Bundles(str, onBundlesLandingPageA, onBundlesLandingErrorPageA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.Bundles value = (BundlesQuery.Bundles) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19405a);
            BundlesQuery.OnBundlesLandingPage onBundlesLandingPage = value.b;
            if (onBundlesLandingPage != null) {
                OnBundlesLandingPage.b(writer, customScalarAdapters, onBundlesLandingPage);
            }
            BundlesQuery.OnBundlesLandingErrorPage onBundlesLandingErrorPage = value.c;
            if (onBundlesLandingErrorPage != null) {
                OnBundlesLandingErrorPage.b(writer, customScalarAdapters, onBundlesLandingErrorPage);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$Chip;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$Chip;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Chip implements Adapter<BundlesQuery.Chip> {

        /* renamed from: a, reason: collision with root package name */
        public static final Chip f19461a = new Chip();
        public static final List b = CollectionsKt.R("id", "isSelected", TextBundle.TEXT_ENTRY);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Boolean bool = null;
            BundlesQuery.Text text = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    text = (BundlesQuery.Text) Adapters.c(Text.f19493a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (bool == null) {
                Assertions.a(reader, "isSelected");
                throw null;
            }
            boolean zBooleanValue = bool.booleanValue();
            if (text != null) {
                return new BundlesQuery.Chip(str, zBooleanValue, text);
            }
            Assertions.a(reader, TextBundle.TEXT_ENTRY);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.Chip value = (BundlesQuery.Chip) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19406a);
            writer.F1("isSelected");
            d.B(value.b, Adapters.f, writer, customScalarAdapters, TextBundle.TEXT_ENTRY);
            Adapters.c(Text.f19493a, false).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$CoreRadioRowUI;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$CoreRadioRowUI;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CoreRadioRowUI implements Adapter<BundlesQuery.CoreRadioRowUI> {

        /* renamed from: a, reason: collision with root package name */
        public static final CoreRadioRowUI f19462a = new CoreRadioRowUI();
        public static final List b = CollectionsKt.R(lqlqqlq.mmm006Dm006Dm, AnnotatedPrivateKey.LABEL, "isSelected");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            Boolean bool = null;
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
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool != null) {
                return new BundlesQuery.CoreRadioRowUI(str, str2, bool.booleanValue());
            }
            Assertions.a(reader, "isSelected");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.CoreRadioRowUI value = (BundlesQuery.CoreRadioRowUI) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            Adapters.i.toJson(writer, customScalarAdapters, value.f19407a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("isSelected");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.c));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$Cta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$Cta;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Cta implements Adapter<BundlesQuery.Cta> {

        /* renamed from: a, reason: collision with root package name */
        public static final Cta f19463a = new Cta();
        public static final List b = CollectionsKt.R("linkId", "linkTextWithAlt", "linkAction");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            BundlesQuery.LinkTextWithAlt linkTextWithAlt = null;
            BundlesQuery.LinkAction linkAction = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    linkTextWithAlt = (BundlesQuery.LinkTextWithAlt) Adapters.c(LinkTextWithAlt.f19475a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    linkAction = (BundlesQuery.LinkAction) Adapters.c(LinkAction.f19474a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (linkTextWithAlt == null) {
                Assertions.a(reader, "linkTextWithAlt");
                throw null;
            }
            if (linkAction != null) {
                return new BundlesQuery.Cta(str, linkTextWithAlt, linkAction);
            }
            Assertions.a(reader, "linkAction");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.Cta value = (BundlesQuery.Cta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("linkId");
            Adapters.i.toJson(writer, customScalarAdapters, value.f19408a);
            writer.F1("linkTextWithAlt");
            Adapters.c(LinkTextWithAlt.f19475a, false).toJson(writer, customScalarAdapters, value.b);
            writer.F1("linkAction");
            Adapters.c(LinkAction.f19474a, false).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$Data;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<BundlesQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f19464a = new Data();
        public static final List b = CollectionsKt.Q("bundles");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            BundlesQuery.Bundles bundles = null;
            while (reader.o2(b) == 0) {
                bundles = (BundlesQuery.Bundles) Adapters.c(Bundles.f19460a, true).fromJson(reader, customScalarAdapters);
            }
            if (bundles != null) {
                return new BundlesQuery.Data(bundles);
            }
            Assertions.a(reader, "bundles");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.Data value = (BundlesQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("bundles");
            Adapters.c(Bundles.f19460a, true).toJson(writer, customScalarAdapters, value.f19409a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$Header;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$Header;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Header implements Adapter<BundlesQuery.Header> {

        /* renamed from: a, reason: collision with root package name */
        public static final Header f19465a = new Header();
        public static final List b = CollectionsKt.R("sortOptions", "chips", "totalBundles");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            BundlesQuery.SortOptions sortOptions = null;
            List list = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    sortOptions = (BundlesQuery.SortOptions) Adapters.b(Adapters.c(SortOptions.f19491a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    list = (List) Adapters.b(Adapters.a(Adapters.c(Chip.f19461a, false))).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new BundlesQuery.Header(sortOptions, list, str);
            }
            Assertions.a(reader, "totalBundles");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.Header value = (BundlesQuery.Header) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("sortOptions");
            Adapters.b(Adapters.c(SortOptions.f19491a, true)).toJson(writer, customScalarAdapters, value.f19410a);
            writer.F1("chips");
            Adapters.b(Adapters.a(Adapters.c(Chip.f19461a, false))).toJson(writer, customScalarAdapters, value.b);
            writer.F1("totalBundles");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$Icon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$Icon;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Icon implements Adapter<BundlesQuery.Icon> {

        /* renamed from: a, reason: collision with root package name */
        public static final Icon f19466a = new Icon();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            BundlesQuery.OnCoreIcon onCoreIconA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            BundlesQuery.OnHostedIcon onHostedIconA = null;
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
            return new BundlesQuery.Icon(str, onCoreIconA, onHostedIconA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.Icon value = (BundlesQuery.Icon) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19411a);
            BundlesQuery.OnCoreIcon onCoreIcon = value.b;
            if (onCoreIcon != null) {
                OnCoreIcon.b(writer, customScalarAdapters, onCoreIcon);
            }
            BundlesQuery.OnHostedIcon onHostedIcon = value.c;
            if (onHostedIcon != null) {
                OnHostedIcon.b(writer, customScalarAdapters, onHostedIcon);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$ImpressionAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$ImpressionAnalytics;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImpressionAnalytics implements Adapter<BundlesQuery.ImpressionAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ImpressionAnalytics f19467a = new ImpressionAnalytics();
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
                return new BundlesQuery.ImpressionAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.ImpressionAnalytics value = (BundlesQuery.ImpressionAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19412a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$ImpressionAnalytics1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$ImpressionAnalytics1;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImpressionAnalytics1 implements Adapter<BundlesQuery.ImpressionAnalytics1> {

        /* renamed from: a, reason: collision with root package name */
        public static final ImpressionAnalytics1 f19468a = new ImpressionAnalytics1();
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
                return new BundlesQuery.ImpressionAnalytics1(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.ImpressionAnalytics1 value = (BundlesQuery.ImpressionAnalytics1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19413a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$ImpressionAnalytics2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$ImpressionAnalytics2;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImpressionAnalytics2 implements Adapter<BundlesQuery.ImpressionAnalytics2> {

        /* renamed from: a, reason: collision with root package name */
        public static final ImpressionAnalytics2 f19469a = new ImpressionAnalytics2();
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
                return new BundlesQuery.ImpressionAnalytics2(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.ImpressionAnalytics2 value = (BundlesQuery.ImpressionAnalytics2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19414a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$ImpressionAnalytics3;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$ImpressionAnalytics3;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImpressionAnalytics3 implements Adapter<BundlesQuery.ImpressionAnalytics3> {

        /* renamed from: a, reason: collision with root package name */
        public static final ImpressionAnalytics3 f19470a = new ImpressionAnalytics3();
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
                return new BundlesQuery.ImpressionAnalytics3(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.ImpressionAnalytics3 value = (BundlesQuery.ImpressionAnalytics3) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19415a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$InsetAlertAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$InsetAlertAction;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InsetAlertAction implements Adapter<BundlesQuery.InsetAlertAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final InsetAlertAction f19471a = new InsetAlertAction();
        public static final List b = CollectionsKt.R(UrlHandler.ACTION, "id", "type", "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ActionType actionTypeA = null;
            BundlesQuery.Analytics1 analytics1 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    analytics1 = (BundlesQuery.Analytics1) Adapters.b(Adapters.c(Analytics1.f19449a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, UrlHandler.ACTION);
                throw null;
            }
            if (actionTypeA != null) {
                return new BundlesQuery.InsetAlertAction(str, str2, actionTypeA, analytics1);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.InsetAlertAction value = (BundlesQuery.InsetAlertAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19416a);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics1.f19449a, true)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$InsetAlertUI;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$InsetAlertUI;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InsetAlertUI implements Adapter<BundlesQuery.InsetAlertUI> {

        /* renamed from: a, reason: collision with root package name */
        public static final InsetAlertUI f19472a = new InsetAlertUI();
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
                return new BundlesQuery.InsetAlertUI(coreAlertStyleA, str, str2);
            }
            Assertions.a(reader, "style");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.InsetAlertUI value = (BundlesQuery.InsetAlertUI) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f19417a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            CoreAlertStyle_ResponseAdapter.b(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$Item;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<BundlesQuery.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f19473a = new Item();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            BundlesQuery.OnBasicCoreBroadcastBanner onBasicCoreBroadcastBannerA;
            BundlesQuery.OnBasicInsetAlert onBasicInsetAlertA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            BundlesQuery.OnBundle onBundleA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("BasicCoreBroadcastBanner"))) {
                reader.o();
                onBasicCoreBroadcastBannerA = OnBasicCoreBroadcastBanner.a(reader, customScalarAdapters);
            } else {
                onBasicCoreBroadcastBannerA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("BasicInsetAlert"))) {
                reader.o();
                onBasicInsetAlertA = OnBasicInsetAlert.a(reader, customScalarAdapters);
            } else {
                onBasicInsetAlertA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("Bundle"))) {
                reader.o();
                onBundleA = OnBundle.a(reader, customScalarAdapters);
            }
            return new BundlesQuery.Item(str, onBasicCoreBroadcastBannerA, onBasicInsetAlertA, onBundleA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.Item value = (BundlesQuery.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19418a);
            BundlesQuery.OnBasicCoreBroadcastBanner onBasicCoreBroadcastBanner = value.b;
            if (onBasicCoreBroadcastBanner != null) {
                OnBasicCoreBroadcastBanner.b(writer, customScalarAdapters, onBasicCoreBroadcastBanner);
            }
            BundlesQuery.OnBasicInsetAlert onBasicInsetAlert = value.c;
            if (onBasicInsetAlert != null) {
                OnBasicInsetAlert.b(writer, customScalarAdapters, onBasicInsetAlert);
            }
            BundlesQuery.OnBundle onBundle = value.d;
            if (onBundle != null) {
                OnBundle.b(writer, customScalarAdapters, onBundle);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$LinkAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$LinkAction;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LinkAction implements Adapter<BundlesQuery.LinkAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final LinkAction f19474a = new LinkAction();
        public static final List b = CollectionsKt.R(UrlHandler.ACTION, "id", "type", "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ActionType actionTypeA = null;
            BundlesQuery.Analytics2 analytics2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    analytics2 = (BundlesQuery.Analytics2) Adapters.b(Adapters.c(Analytics2.f19450a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, UrlHandler.ACTION);
                throw null;
            }
            if (actionTypeA != null) {
                return new BundlesQuery.LinkAction(str, str2, actionTypeA, analytics2);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.LinkAction value = (BundlesQuery.LinkAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19419a);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics2.f19450a, true)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$LinkTextWithAlt;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$LinkTextWithAlt;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LinkTextWithAlt implements Adapter<BundlesQuery.LinkTextWithAlt> {

        /* renamed from: a, reason: collision with root package name */
        public static final LinkTextWithAlt f19475a = new LinkTextWithAlt();
        public static final List b = CollectionsKt.R(TextBundle.TEXT_ENTRY, "altText");

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
                Assertions.a(reader, TextBundle.TEXT_ENTRY);
                throw null;
            }
            if (str2 != null) {
                return new BundlesQuery.LinkTextWithAlt(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.LinkTextWithAlt value = (BundlesQuery.LinkTextWithAlt) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19420a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$OnBasicCoreBroadcastBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$OnBasicCoreBroadcastBanner;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnBasicCoreBroadcastBanner implements Adapter<BundlesQuery.OnBasicCoreBroadcastBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19476a = CollectionsKt.R("impressionAnalytics", "broadcastBannerDismissAnalytics", "broadcastBannerUI", "broadcastBannerAction", "broadcastBannerActionLabel", "broadcastBannerId", "broadcastBannerDismissible");

        public static BundlesQuery.OnBasicCoreBroadcastBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            BundlesQuery.ImpressionAnalytics1 impressionAnalytics1 = null;
            BundlesQuery.BroadcastBannerDismissAnalytics broadcastBannerDismissAnalytics = null;
            BundlesQuery.BroadcastBannerUI broadcastBannerUI = null;
            BundlesQuery.BroadcastBannerAction broadcastBannerAction = null;
            String str = null;
            String str2 = null;
            while (true) {
                switch (reader.o2(f19476a)) {
                    case 0:
                        bool = bool2;
                        impressionAnalytics1 = (BundlesQuery.ImpressionAnalytics1) Adapters.b(Adapters.c(ImpressionAnalytics1.f19468a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bool = bool2;
                        broadcastBannerDismissAnalytics = (BundlesQuery.BroadcastBannerDismissAnalytics) Adapters.b(Adapters.c(BroadcastBannerDismissAnalytics.f19453a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        bool = bool2;
                        broadcastBannerUI = (BundlesQuery.BroadcastBannerUI) Adapters.c(BroadcastBannerUI.f19454a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool = bool2;
                        broadcastBannerAction = (BundlesQuery.BroadcastBannerAction) Adapters.b(Adapters.c(BroadcastBannerAction.f19452a, false)).fromJson(reader, customScalarAdapters);
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
                            return new BundlesQuery.OnBasicCoreBroadcastBanner(impressionAnalytics1, broadcastBannerDismissAnalytics, broadcastBannerUI, broadcastBannerAction, str, str2, bool3.booleanValue());
                        }
                        Assertions.a(reader, "broadcastBannerDismissible");
                        throw null;
                }
                bool2 = bool;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, BundlesQuery.OnBasicCoreBroadcastBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("impressionAnalytics");
            Adapters.b(Adapters.c(ImpressionAnalytics1.f19468a, true)).toJson(writer, customScalarAdapters, value.f19421a);
            writer.F1("broadcastBannerDismissAnalytics");
            Adapters.b(Adapters.c(BroadcastBannerDismissAnalytics.f19453a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("broadcastBannerUI");
            Adapters.c(BroadcastBannerUI.f19454a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("broadcastBannerAction");
            Adapters.b(Adapters.c(BroadcastBannerAction.f19452a, false)).toJson(writer, customScalarAdapters, value.d);
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
            b(jsonWriter, customScalarAdapters, (BundlesQuery.OnBasicCoreBroadcastBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$OnBasicInsetAlert;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$OnBasicInsetAlert;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnBasicInsetAlert implements Adapter<BundlesQuery.OnBasicInsetAlert> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19477a = CollectionsKt.R("insetAlertUI", "insetAlertActionLabel", "insetAlertAction", "impressionAnalytics");

        public static BundlesQuery.OnBasicInsetAlert a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            BundlesQuery.InsetAlertUI insetAlertUI = null;
            String str = null;
            BundlesQuery.InsetAlertAction insetAlertAction = null;
            BundlesQuery.ImpressionAnalytics2 impressionAnalytics2 = null;
            while (true) {
                int iO2 = reader.o2(f19477a);
                if (iO2 == 0) {
                    insetAlertUI = (BundlesQuery.InsetAlertUI) Adapters.c(InsetAlertUI.f19472a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    insetAlertAction = (BundlesQuery.InsetAlertAction) Adapters.b(Adapters.c(InsetAlertAction.f19471a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    impressionAnalytics2 = (BundlesQuery.ImpressionAnalytics2) Adapters.b(Adapters.c(ImpressionAnalytics2.f19469a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (insetAlertUI != null) {
                return new BundlesQuery.OnBasicInsetAlert(insetAlertUI, str, insetAlertAction, impressionAnalytics2);
            }
            Assertions.a(reader, "insetAlertUI");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, BundlesQuery.OnBasicInsetAlert value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("insetAlertUI");
            Adapters.c(InsetAlertUI.f19472a, false).toJson(writer, customScalarAdapters, value.f19422a);
            writer.F1("insetAlertActionLabel");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("insetAlertAction");
            Adapters.b(Adapters.c(InsetAlertAction.f19471a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("impressionAnalytics");
            Adapters.b(Adapters.c(ImpressionAnalytics2.f19469a, true)).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (BundlesQuery.OnBasicInsetAlert) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$OnBundle;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$OnBundle;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnBundle implements Adapter<BundlesQuery.OnBundle> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19478a = CollectionsKt.R("bundleDetails", "bundleItems", "bundleCta", "bundleAnalytics", "bundleImpressionAnalytics", "footerText");

        public static BundlesQuery.OnBundle a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            BundlesQuery.BundleDetails bundleDetails = null;
            ArrayList arrayListFromJson = null;
            BundlesQuery.BundleCta bundleCta = null;
            BundlesQuery.BundleAnalytics bundleAnalytics = null;
            BundlesQuery.BundleImpressionAnalytics bundleImpressionAnalytics = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(f19478a);
                if (iO2 == 0) {
                    bundleDetails = (BundlesQuery.BundleDetails) Adapters.c(BundleDetails.f19457a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson = Adapters.a(Adapters.c(BundleItem.f19459a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bundleCta = (BundlesQuery.BundleCta) Adapters.c(BundleCta.f19456a, true).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    bundleAnalytics = (BundlesQuery.BundleAnalytics) Adapters.b(Adapters.c(BundleAnalytics.f19455a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    bundleImpressionAnalytics = (BundlesQuery.BundleImpressionAnalytics) Adapters.b(Adapters.c(BundleImpressionAnalytics.f19458a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (bundleDetails == null) {
                Assertions.a(reader, "bundleDetails");
                throw null;
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "bundleItems");
                throw null;
            }
            if (bundleCta != null) {
                return new BundlesQuery.OnBundle(bundleDetails, arrayListFromJson, bundleCta, bundleAnalytics, bundleImpressionAnalytics, str);
            }
            Assertions.a(reader, "bundleCta");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, BundlesQuery.OnBundle value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("bundleDetails");
            Adapters.c(BundleDetails.f19457a, false).toJson(writer, customScalarAdapters, value.f19423a);
            writer.F1("bundleItems");
            Adapters.a(Adapters.c(BundleItem.f19459a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("bundleCta");
            Adapters.c(BundleCta.f19456a, true).toJson(writer, customScalarAdapters, value.c);
            writer.F1("bundleAnalytics");
            Adapters.b(Adapters.c(BundleAnalytics.f19455a, true)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("bundleImpressionAnalytics");
            Adapters.b(Adapters.c(BundleImpressionAnalytics.f19458a, true)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("footerText");
            Adapters.i.toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (BundlesQuery.OnBundle) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$OnBundleComparisonPricing;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$OnBundleComparisonPricing;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnBundleComparisonPricing implements Adapter<BundlesQuery.OnBundleComparisonPricing> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19479a = CollectionsKt.Q("logo");

        public static BundlesQuery.OnBundleComparisonPricing a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19479a) == 0) {
                str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
            }
            return new BundlesQuery.OnBundleComparisonPricing(str);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.OnBundleComparisonPricing value = (BundlesQuery.OnBundleComparisonPricing) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("logo");
            Adapters.i.toJson(writer, customScalarAdapters, value.f19424a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$OnBundleProductCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$OnBundleProductCard;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnBundleProductCard implements Adapter<BundlesQuery.OnBundleProductCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19480a = CollectionsKt.R("quantity", "productCard");

        public static BundlesQuery.OnBundleProductCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            BundlesQuery.ProductCard productCard = null;
            while (true) {
                int iO2 = reader.o2(f19480a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    productCard = (BundlesQuery.ProductCard) Adapters.c(ProductCard.f19490a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (productCard != null) {
                return new BundlesQuery.OnBundleProductCard(str, productCard);
            }
            Assertions.a(reader, "productCard");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, BundlesQuery.OnBundleProductCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("quantity");
            Adapters.i.toJson(writer, customScalarAdapters, value.f19425a);
            writer.F1("productCard");
            Adapters.c(ProductCard.f19490a, true).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (BundlesQuery.OnBundleProductCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$OnBundleQuantityStepper;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$OnBundleQuantityStepper;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnBundleQuantityStepper implements Adapter<BundlesQuery.OnBundleQuantityStepper> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19481a = CollectionsKt.R("minimum", "maximum", "increment", "inCart", "addToCartLabel", "maximumReachedLabel", "offerId");

        public static BundlesQuery.OnBundleQuantityStepper a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                switch (reader.o2(f19481a)) {
                    case 0:
                        num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        num3 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        num4 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    default:
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
                            Assertions.a(reader, "increment");
                            throw null;
                        }
                        int iIntValue3 = num3.intValue();
                        if (num4 == null) {
                            Assertions.a(reader, "inCart");
                            throw null;
                        }
                        int iIntValue4 = num4.intValue();
                        if (str == null) {
                            Assertions.a(reader, "addToCartLabel");
                            throw null;
                        }
                        if (str3 != null) {
                            return new BundlesQuery.OnBundleQuantityStepper(iIntValue, iIntValue2, iIntValue3, iIntValue4, str, str2, str3);
                        }
                        Assertions.a(reader, "offerId");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, BundlesQuery.OnBundleQuantityStepper value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("minimum");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.f19426a, adapters$IntAdapter$1, writer, customScalarAdapters, "maximum");
            d.y(value.b, adapters$IntAdapter$1, writer, customScalarAdapters, "increment");
            d.y(value.c, adapters$IntAdapter$1, writer, customScalarAdapters, "inCart");
            d.y(value.d, adapters$IntAdapter$1, writer, customScalarAdapters, "addToCartLabel");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("maximumReachedLabel");
            Adapters.i.toJson(writer, customScalarAdapters, value.f);
            writer.F1("offerId");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.g);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (BundlesQuery.OnBundleQuantityStepper) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$OnBundleSortOptions;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$OnBundleSortOptions;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnBundleSortOptions implements Adapter<BundlesQuery.OnBundleSortOptions> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19482a = CollectionsKt.R("title", "options");

        public static BundlesQuery.OnBundleSortOptions a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f19482a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Option.f19488a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new BundlesQuery.OnBundleSortOptions(str, arrayListFromJson);
            }
            Assertions.a(reader, "options");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, BundlesQuery.OnBundleSortOptions value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19427a);
            writer.F1("options");
            Adapters.a(Adapters.c(Option.f19488a, false)).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (BundlesQuery.OnBundleSortOptions) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$OnBundleStandardPricing;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$OnBundleStandardPricing;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnBundleStandardPricing implements Adapter<BundlesQuery.OnBundleStandardPricing> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19483a = CollectionsKt.R("prefix", "price", "tag");

        public static BundlesQuery.OnBundleStandardPricing a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            BundlesQuery.Tag tag = null;
            while (true) {
                int iO2 = reader.o2(f19483a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    tag = (BundlesQuery.Tag) Adapters.b(Adapters.c(Tag.f19492a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "prefix");
                throw null;
            }
            if (str2 != null) {
                return new BundlesQuery.OnBundleStandardPricing(str, str2, tag);
            }
            Assertions.a(reader, "price");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, BundlesQuery.OnBundleStandardPricing value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("prefix");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19428a);
            writer.F1("price");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("tag");
            Adapters.b(Adapters.c(Tag.f19492a, true)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (BundlesQuery.OnBundleStandardPricing) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$OnBundlesLandingErrorPage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$OnBundlesLandingErrorPage;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnBundlesLandingErrorPage implements Adapter<BundlesQuery.OnBundlesLandingErrorPage> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19484a = CollectionsKt.R("image", "title", lqlqqlq.mmm006Dm006Dm, "cta", "analytics", "impressionAnalytics");

        public static BundlesQuery.OnBundlesLandingErrorPage a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            BundlesQuery.Cta cta = null;
            BundlesQuery.Analytics3 analytics3 = null;
            BundlesQuery.ImpressionAnalytics3 impressionAnalytics3 = null;
            while (true) {
                int iO2 = reader.o2(f19484a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    cta = (BundlesQuery.Cta) Adapters.b(Adapters.c(Cta.f19463a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    analytics3 = (BundlesQuery.Analytics3) Adapters.b(Adapters.c(Analytics3.f19451a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        return new BundlesQuery.OnBundlesLandingErrorPage(str, str2, str3, cta, analytics3, impressionAnalytics3);
                    }
                    impressionAnalytics3 = (BundlesQuery.ImpressionAnalytics3) Adapters.b(Adapters.c(ImpressionAnalytics3.f19470a, true)).fromJson(reader, customScalarAdapters);
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, BundlesQuery.OnBundlesLandingErrorPage value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("image");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f19429a);
            writer.F1("title");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("cta");
            Adapters.b(Adapters.c(Cta.f19463a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics3.f19451a, true)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("impressionAnalytics");
            Adapters.b(Adapters.c(ImpressionAnalytics3.f19470a, true)).toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (BundlesQuery.OnBundlesLandingErrorPage) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$OnBundlesLandingPage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$OnBundlesLandingPage;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnBundlesLandingPage implements Adapter<BundlesQuery.OnBundlesLandingPage> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19485a = CollectionsKt.R("analytics", "impressionAnalytics", "header", "items", "nextPageNumber");

        public static BundlesQuery.OnBundlesLandingPage a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            BundlesQuery.Analytics analytics = null;
            BundlesQuery.ImpressionAnalytics impressionAnalytics = null;
            BundlesQuery.Header header = null;
            ArrayList arrayListFromJson = null;
            Integer num = null;
            while (true) {
                int iO2 = reader.o2(f19485a);
                if (iO2 == 0) {
                    analytics = (BundlesQuery.Analytics) Adapters.b(Adapters.c(Analytics.f19448a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    impressionAnalytics = (BundlesQuery.ImpressionAnalytics) Adapters.b(Adapters.c(ImpressionAnalytics.f19467a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    header = (BundlesQuery.Header) Adapters.c(Header.f19465a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    arrayListFromJson = Adapters.a(Adapters.b(Adapters.c(Item.f19473a, true))).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    num = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                }
            }
            if (header == null) {
                Assertions.a(reader, "header");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new BundlesQuery.OnBundlesLandingPage(analytics, impressionAnalytics, header, arrayListFromJson, num);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, BundlesQuery.OnBundlesLandingPage value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics.f19448a, true)).toJson(writer, customScalarAdapters, value.f19430a);
            writer.F1("impressionAnalytics");
            Adapters.b(Adapters.c(ImpressionAnalytics.f19467a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("header");
            Adapters.c(Header.f19465a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("items");
            Adapters.a(Adapters.b(Adapters.c(Item.f19473a, true))).toJson(writer, customScalarAdapters, value.d);
            writer.F1("nextPageNumber");
            Adapters.k.toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (BundlesQuery.OnBundlesLandingPage) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$OnCoreIcon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$OnCoreIcon;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCoreIcon implements Adapter<BundlesQuery.OnCoreIcon> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19486a = CollectionsKt.Q("coreIconName");

        public static BundlesQuery.OnCoreIcon a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19486a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new BundlesQuery.OnCoreIcon(str);
            }
            Assertions.a(reader, "coreIconName");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, BundlesQuery.OnCoreIcon value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("coreIconName");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19431a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (BundlesQuery.OnCoreIcon) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$OnHostedIcon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$OnHostedIcon;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHostedIcon implements Adapter<BundlesQuery.OnHostedIcon> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19487a = CollectionsKt.Q("url");

        public static BundlesQuery.OnHostedIcon a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19487a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new BundlesQuery.OnHostedIcon(str);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, BundlesQuery.OnHostedIcon value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19432a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (BundlesQuery.OnHostedIcon) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$Option;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$Option;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Option implements Adapter<BundlesQuery.Option> {

        /* renamed from: a, reason: collision with root package name */
        public static final Option f19488a = new Option();
        public static final List b = CollectionsKt.R("id", "coreRadioRowUI");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            BundlesQuery.CoreRadioRowUI coreRadioRowUI = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    coreRadioRowUI = (BundlesQuery.CoreRadioRowUI) Adapters.c(CoreRadioRowUI.f19462a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (coreRadioRowUI != null) {
                return new BundlesQuery.Option(str, coreRadioRowUI);
            }
            Assertions.a(reader, "coreRadioRowUI");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.Option value = (BundlesQuery.Option) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19433a);
            writer.F1("coreRadioRowUI");
            Adapters.c(CoreRadioRowUI.f19462a, false).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$Pricing;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$Pricing;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Pricing implements Adapter<BundlesQuery.Pricing> {

        /* renamed from: a, reason: collision with root package name */
        public static final Pricing f19489a = new Pricing();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            BundlesQuery.OnBundleStandardPricing onBundleStandardPricingA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            BundlesQuery.OnBundleComparisonPricing onBundleComparisonPricingA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("BundleStandardPricing"))) {
                reader.o();
                onBundleStandardPricingA = OnBundleStandardPricing.a(reader, customScalarAdapters);
            } else {
                onBundleStandardPricingA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("BundleComparisonPricing"))) {
                reader.o();
                onBundleComparisonPricingA = OnBundleComparisonPricing.a(reader, customScalarAdapters);
            }
            return new BundlesQuery.Pricing(str, onBundleStandardPricingA, onBundleComparisonPricingA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.Pricing value = (BundlesQuery.Pricing) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19434a);
            BundlesQuery.OnBundleStandardPricing onBundleStandardPricing = value.b;
            if (onBundleStandardPricing != null) {
                OnBundleStandardPricing.b(writer, customScalarAdapters, onBundleStandardPricing);
            }
            BundlesQuery.OnBundleComparisonPricing onBundleComparisonPricing = value.c;
            if (onBundleComparisonPricing != null) {
                List list = OnBundleComparisonPricing.f19479a;
                writer.F1("logo");
                Adapters.i.toJson(writer, customScalarAdapters, onBundleComparisonPricing.f19424a);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$ProductCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$ProductCard;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductCard implements Adapter<BundlesQuery.ProductCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductCard f19490a = new ProductCard();
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
            au.com.woolworths.graphql.common.fragment.ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new BundlesQuery.ProductCard(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.ProductCard value = (BundlesQuery.ProductCard) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19435a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$SortOptions;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$SortOptions;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SortOptions implements Adapter<BundlesQuery.SortOptions> {

        /* renamed from: a, reason: collision with root package name */
        public static final SortOptions f19491a = new SortOptions();
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
            BundlesQuery.OnBundleSortOptions onBundleSortOptionsA = OnBundleSortOptions.a(reader, customScalarAdapters);
            if (str != null) {
                return new BundlesQuery.SortOptions(str, onBundleSortOptionsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.SortOptions value = (BundlesQuery.SortOptions) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19436a);
            List list = OnBundleSortOptions.f19482a;
            OnBundleSortOptions.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$Tag;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$Tag;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Tag implements Adapter<BundlesQuery.Tag> {

        /* renamed from: a, reason: collision with root package name */
        public static final Tag f19492a = new Tag();
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
            CoreTagUI coreTagUIA = CoreTagUIImpl_ResponseAdapter.CoreTagUI.a(reader, customScalarAdapters);
            if (str != null) {
                return new BundlesQuery.Tag(str, coreTagUIA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.Tag value = (BundlesQuery.Tag) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19437a);
            List list = CoreTagUIImpl_ResponseAdapter.CoreTagUI.f10068a;
            CoreTagUIImpl_ResponseAdapter.CoreTagUI.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$Text;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$Text;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Text implements Adapter<BundlesQuery.Text> {

        /* renamed from: a, reason: collision with root package name */
        public static final Text f19493a = new Text();
        public static final List b = CollectionsKt.R(TextBundle.TEXT_ENTRY, "altText");

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
                Assertions.a(reader, TextBundle.TEXT_ENTRY);
                throw null;
            }
            if (str2 != null) {
                return new BundlesQuery.Text(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.Text value = (BundlesQuery.Text) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19438a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$TextColor;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$TextColor;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TextColor implements Adapter<BundlesQuery.TextColor> {

        /* renamed from: a, reason: collision with root package name */
        public static final TextColor f19494a = new TextColor();
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
            CompatibleColor compatibleColorA = CompatibleColorImpl_ResponseAdapter.CompatibleColor.a(reader, customScalarAdapters);
            if (str != null) {
                return new BundlesQuery.TextColor(str, compatibleColorA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.TextColor value = (BundlesQuery.TextColor) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19439a);
            List list = CompatibleColorImpl_ResponseAdapter.CompatibleColor.f10043a;
            CompatibleColorImpl_ResponseAdapter.CompatibleColor.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/BundlesQuery_ResponseAdapter$TitleTag;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$TitleTag;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TitleTag implements Adapter<BundlesQuery.TitleTag> {

        /* renamed from: a, reason: collision with root package name */
        public static final TitleTag f19495a = new TitleTag();
        public static final List b = CollectionsKt.R(TextBundle.TEXT_ENTRY, "textColor");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            BundlesQuery.TextColor textColor = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    textColor = (BundlesQuery.TextColor) Adapters.c(TextColor.f19494a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, TextBundle.TEXT_ENTRY);
                throw null;
            }
            if (textColor != null) {
                return new BundlesQuery.TitleTag(str, textColor);
            }
            Assertions.a(reader, "textColor");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BundlesQuery.TitleTag value = (BundlesQuery.TitleTag) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19440a);
            writer.F1("textColor");
            Adapters.c(TextColor.f19494a, true).toJson(writer, customScalarAdapters, value.b);
        }
    }
}
