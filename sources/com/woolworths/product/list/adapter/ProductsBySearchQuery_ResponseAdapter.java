package com.woolworths.product.list.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.graphql.TealiumAnalytics;
import au.com.woolworths.android.onesite.graphql.GoogleAdCustomTargeting;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.graphql.common.fragment.ProductCardImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.AdBannerNativeSize;
import au.com.woolworths.shop.graphql.type.CardHeight;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.adapter.ActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.AdBannerNativeSize_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CardHeight_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionPlacement_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerDisplayType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpression;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.woolworths.product.list.ProductsBySearchQuery;
import com.woolworths.product.list.fragment.InsetBanner;
import com.woolworths.product.list.fragment.InsetBannerImpl_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b+\bÇ\u0002\u0018\u00002\u00020\u0001:(\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006,"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "ProductsBySearch", "Analytic", "OnAdobeTargetAnalytics", "ProductsFeed", "OnActionableCard", "OnGoogleAdBannerCard", "OnUniversalInventoryContainer", "GoogleAdBannerCard", "NextBestAction", "OnActionableCard1", "OnInsetBanner", "Action", "OnProductCard", "Filter", "FilterItem", "Banner", "Action1", "SortOption", "SortOptionsBanner", "MarketplaceFilterSwitch", "ButtonCta", "MarketplaceInfo", "Item", "Footer", "MarketplaceBottomSheet", "PrimaryCta", "SecondaryCta", "Chip", "Text", "FacetChip", "Text1", "ZeroResultContent", "Item1", "OnZeroResultProductCategories", "ZeroResultProductCategoriesItem", "ProductCategoryTileAction", "OnHorizontalList", "Item2", "OnProductCard1", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductsBySearchQuery_ResponseAdapter {
    public static final int $stable = 0;

    @NotNull
    public static final ProductsBySearchQuery_ResponseAdapter INSTANCE = new ProductsBySearchQuery_ResponseAdapter();

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$Action;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$Action;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action implements Adapter<ProductsBySearchQuery.Action> {

        @NotNull
        public static final Action INSTANCE = new Action();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("placement", "type", AnnotatedPrivateKey.LABEL, "url");
        public static final int $stable = 8;

        private Action() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.Action fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerActionPlacement insetBannerActionPlacementA = null;
            InsetBannerActionType insetBannerActionTypeA = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
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
                return new ProductsBySearchQuery.Action(insetBannerActionPlacementA, insetBannerActionTypeA, str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.Action value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("placement");
            InsetBannerActionPlacement_ResponseAdapter.b(writer, customScalarAdapters, value.getPlacement());
            writer.F1("type");
            InsetBannerActionType_ResponseAdapter.b(writer, customScalarAdapters, value.getType());
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.getLabel());
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.getUrl());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$Action1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$Action1;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action1 implements Adapter<ProductsBySearchQuery.Action1> {

        @NotNull
        public static final Action1 INSTANCE = new Action1();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("placement", "type", AnnotatedPrivateKey.LABEL, "url");
        public static final int $stable = 8;

        private Action1() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.Action1 fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerActionPlacement insetBannerActionPlacementA = null;
            InsetBannerActionType insetBannerActionTypeA = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
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
                return new ProductsBySearchQuery.Action1(insetBannerActionPlacementA, insetBannerActionTypeA, str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.Action1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("placement");
            InsetBannerActionPlacement_ResponseAdapter.b(writer, customScalarAdapters, value.getPlacement());
            writer.F1("type");
            InsetBannerActionType_ResponseAdapter.b(writer, customScalarAdapters, value.getType());
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.getLabel());
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.getUrl());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$Analytic;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$Analytic;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytic implements Adapter<ProductsBySearchQuery.Analytic> {

        @NotNull
        public static final Analytic INSTANCE = new Analytic();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("__typename");
        public static final int $stable = 8;

        private Analytic() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.Analytic fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductsBySearchQuery.OnAdobeTargetAnalytics onAdobeTargetAnalyticsFromJson = null;
            String str = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("AdobeTargetAnalytics"))) {
                reader.o();
                onAdobeTargetAnalyticsFromJson = OnAdobeTargetAnalytics.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new ProductsBySearchQuery.Analytic(str, onAdobeTargetAnalyticsFromJson);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.Analytic value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnAdobeTargetAnalytics() != null) {
                OnAdobeTargetAnalytics.INSTANCE.toJson(writer, customScalarAdapters, value.getOnAdobeTargetAnalytics());
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$Banner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$Banner;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Banner implements Adapter<ProductsBySearchQuery.Banner> {

        @NotNull
        public static final Banner INSTANCE = new Banner();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("displayType", "message", "iconUrl", UrlHandler.ACTION, "bannerTitle");
        public static final int $stable = 8;

        private Banner() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.Banner fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            String str = null;
            String str2 = null;
            ProductsBySearchQuery.Action1 action1 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    insetBannerDisplayTypeA = InsetBannerDisplayType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    action1 = (ProductsBySearchQuery.Action1) Adapters.b(Adapters.c(Action1.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerDisplayTypeA == null) {
                Assertions.a(reader, "displayType");
                throw null;
            }
            if (str != null) {
                return new ProductsBySearchQuery.Banner(insetBannerDisplayTypeA, str, str2, action1, str3);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.Banner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.getDisplayType());
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.getMessage());
            writer.F1("iconUrl");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.getIconUrl());
            writer.F1(UrlHandler.ACTION);
            Adapters.b(Adapters.c(Action1.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getAction());
            writer.F1("bannerTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.getBannerTitle());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$ButtonCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$ButtonCta;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ButtonCta implements Adapter<ProductsBySearchQuery.ButtonCta> {

        @NotNull
        public static final ButtonCta INSTANCE = new ButtonCta();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q(AnnotatedPrivateKey.LABEL);
        public static final int $stable = 8;

        private ButtonCta() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.ButtonCta fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new ProductsBySearchQuery.ButtonCta(str);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.ButtonCta value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.getLabel());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$Chip;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$Chip;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Chip implements Adapter<ProductsBySearchQuery.Chip> {

        @NotNull
        public static final Chip INSTANCE = new Chip();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("id", "isSelected", TextBundle.TEXT_ENTRY);
        public static final int $stable = 8;

        private Chip() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.Chip fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Boolean bool = null;
            ProductsBySearchQuery.Text text = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    text = (ProductsBySearchQuery.Text) Adapters.c(Text.INSTANCE, false).fromJson(reader, customScalarAdapters);
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
                return new ProductsBySearchQuery.Chip(str, zBooleanValue, text);
            }
            Assertions.a(reader, TextBundle.TEXT_ENTRY);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.Chip value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.getId());
            writer.F1("isSelected");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.isSelected()));
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters.c(Text.INSTANCE, false).toJson(writer, customScalarAdapters, value.getText());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$Data;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<ProductsBySearchQuery.Data> {

        @NotNull
        public static final Data INSTANCE = new Data();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("productsBySearch");
        public static final int $stable = 8;

        private Data() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.Data fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductsBySearchQuery.ProductsBySearch productsBySearch = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                productsBySearch = (ProductsBySearchQuery.ProductsBySearch) Adapters.b(Adapters.c(ProductsBySearch.INSTANCE, false)).fromJson(reader, customScalarAdapters);
            }
            return new ProductsBySearchQuery.Data(productsBySearch);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.Data value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productsBySearch");
            Adapters.b(Adapters.c(ProductsBySearch.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getProductsBySearch());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$FacetChip;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$FacetChip;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FacetChip implements Adapter<ProductsBySearchQuery.FacetChip> {

        @NotNull
        public static final FacetChip INSTANCE = new FacetChip();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("id", "isSelected", TextBundle.TEXT_ENTRY);
        public static final int $stable = 8;

        private FacetChip() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.FacetChip fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Boolean bool = null;
            ProductsBySearchQuery.Text1 text1 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    text1 = (ProductsBySearchQuery.Text1) Adapters.c(Text1.INSTANCE, false).fromJson(reader, customScalarAdapters);
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
            if (text1 != null) {
                return new ProductsBySearchQuery.FacetChip(str, zBooleanValue, text1);
            }
            Assertions.a(reader, TextBundle.TEXT_ENTRY);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.FacetChip value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.getId());
            writer.F1("isSelected");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.isSelected()));
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters.c(Text1.INSTANCE, false).toJson(writer, customScalarAdapters, value.getText());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$Filter;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$Filter;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Filter implements Adapter<ProductsBySearchQuery.Filter> {

        @NotNull
        public static final Filter INSTANCE = new Filter();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("headerKey", "headerTitle", "filterItems", "banner");
        public static final int $stable = 8;

        private Filter() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.Filter fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            ProductsBySearchQuery.Banner banner = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson = Adapters.a(Adapters.c(FilterItem.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    banner = (ProductsBySearchQuery.Banner) Adapters.b(Adapters.c(Banner.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "headerKey");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "headerTitle");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new ProductsBySearchQuery.Filter(str, str2, arrayListFromJson, banner);
            }
            Assertions.a(reader, "filterItems");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.Filter value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("headerKey");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getHeaderKey());
            writer.F1("headerTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getHeaderTitle());
            writer.F1("filterItems");
            Adapters.a(Adapters.c(FilterItem.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getFilterItems());
            writer.F1("banner");
            Adapters.b(Adapters.c(Banner.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getBanner());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$FilterItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$FilterItem;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FilterItem implements Adapter<ProductsBySearchQuery.FilterItem> {

        @NotNull
        public static final FilterItem INSTANCE = new FilterItem();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("key", "title", AnnotatedPrivateKey.LABEL, "parentKey", "hasChildren", "isApplied");
        public static final int $stable = 8;

        private FilterItem() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.FilterItem fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Boolean bool3 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
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
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    bool = bool2;
                    bool3 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
                bool2 = bool;
            }
            Boolean bool4 = bool2;
            if (str == null) {
                Assertions.a(reader, "key");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool4 == null) {
                Assertions.a(reader, "hasChildren");
                throw null;
            }
            Boolean bool5 = bool3;
            boolean zBooleanValue = bool4.booleanValue();
            if (bool5 != null) {
                return new ProductsBySearchQuery.FilterItem(str, str2, str3, str4, zBooleanValue, bool5.booleanValue());
            }
            Assertions.a(reader, "isApplied");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.FilterItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("key");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getKey());
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getTitle());
            writer.F1(AnnotatedPrivateKey.LABEL);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getLabel());
            writer.F1("parentKey");
            Adapters.i.toJson(writer, customScalarAdapters, value.getParentKey());
            writer.F1("hasChildren");
            Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
            adapters$BooleanAdapter$1.toJson(writer, customScalarAdapters, Boolean.valueOf(value.getHasChildren()));
            writer.F1("isApplied");
            adapters$BooleanAdapter$1.toJson(writer, customScalarAdapters, Boolean.valueOf(value.isApplied()));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$Footer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$Footer;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Footer implements Adapter<ProductsBySearchQuery.Footer> {

        @NotNull
        public static final Footer INSTANCE = new Footer();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "linkUrl");
        public static final int $stable = 8;

        private Footer() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.Footer fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
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
                return new ProductsBySearchQuery.Footer(str, str2, str3);
            }
            Assertions.a(reader, "linkUrl");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.Footer value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getTitle());
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getSubtitle());
            writer.F1("linkUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getLinkUrl());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$GoogleAdBannerCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$GoogleAdBannerCard;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GoogleAdBannerCard implements Adapter<ProductsBySearchQuery.GoogleAdBannerCard> {

        @NotNull
        public static final GoogleAdBannerCard INSTANCE = new GoogleAdBannerCard();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R(OutOfContextTestingActivity.AD_UNIT_KEY, "nativeCustomTemplateId", "iabSpec", "iabSize", "height", "targeting", "correlator", "_excluded");
        public static final int $stable = 8;

        private GoogleAdBannerCard() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.GoogleAdBannerCard fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
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
                switch (reader.o2(RESPONSE_NAMES)) {
                    case 0:
                        bool = bool2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bool = bool2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 3:
                        bool = bool2;
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        adBannerNativeSizeA = AdBannerNativeSize_ResponseAdapter.a(reader, customScalarAdapters);
                        continue;
                    case 5:
                        bool = bool2;
                        googleAdCustomTargeting = (GoogleAdCustomTargeting) d.k(customScalarAdapters, au.com.woolworths.shop.graphql.type.GoogleAdCustomTargeting.f11436a, reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = bool2;
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        bool = bool2;
                        bool3 = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Boolean bool4 = bool2;
                        if (str == null) {
                            Assertions.a(reader, OutOfContextTestingActivity.AD_UNIT_KEY);
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "nativeCustomTemplateId");
                            throw null;
                        }
                        if (bool4 == null) {
                            Assertions.a(reader, "iabSpec");
                            throw null;
                        }
                        boolean zBooleanValue = bool4.booleanValue();
                        if (adBannerNativeSizeA != null) {
                            return new ProductsBySearchQuery.GoogleAdBannerCard(str, str2, zBooleanValue, str3, adBannerNativeSizeA, googleAdCustomTargeting, str4, bool3);
                        }
                        Assertions.a(reader, "height");
                        throw null;
                }
                bool2 = bool;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.GoogleAdBannerCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(OutOfContextTestingActivity.AD_UNIT_KEY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getAdUnit());
            writer.F1("nativeCustomTemplateId");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getNativeCustomTemplateId());
            writer.F1("iabSpec");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.getIabSpec()));
            writer.F1("iabSize");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.getIabSize());
            writer.F1("height");
            AdBannerNativeSize_ResponseAdapter.b(writer, customScalarAdapters, value.getHeight());
            writer.F1("targeting");
            Adapters.b(customScalarAdapters.e(au.com.woolworths.shop.graphql.type.GoogleAdCustomTargeting.f11436a)).toJson(writer, customScalarAdapters, value.getTargeting());
            writer.F1("correlator");
            nullableAdapter.toJson(writer, customScalarAdapters, value.getCorrelator());
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.get_excluded());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$Item;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<ProductsBySearchQuery.Item> {

        @NotNull
        public static final Item INSTANCE = new Item();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("title", lqlqqlq.mmm006Dm006Dm, "imageUrl");
        public static final int $stable = 8;

        private Item() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.Item fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
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
                Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
                throw null;
            }
            if (str3 != null) {
                return new ProductsBySearchQuery.Item(str, str2, str3);
            }
            Assertions.a(reader, "imageUrl");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.Item value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getTitle());
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getDescription());
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getImageUrl());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$Item1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$Item1;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item1 implements Adapter<ProductsBySearchQuery.Item1> {

        @NotNull
        public static final Item1 INSTANCE = new Item1();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("__typename");
        public static final int $stable = 8;

        private Item1() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.Item1 fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            ProductsBySearchQuery.OnZeroResultProductCategories onZeroResultProductCategoriesFromJson;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ProductsBySearchQuery.OnHorizontalList onHorizontalListFromJson = null;
            String str = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ZeroResultProductCategories"))) {
                reader.o();
                onZeroResultProductCategoriesFromJson = OnZeroResultProductCategories.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onZeroResultProductCategoriesFromJson = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HorizontalList"))) {
                reader.o();
                onHorizontalListFromJson = OnHorizontalList.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new ProductsBySearchQuery.Item1(str, onZeroResultProductCategoriesFromJson, onHorizontalListFromJson);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.Item1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnZeroResultProductCategories() != null) {
                OnZeroResultProductCategories.INSTANCE.toJson(writer, customScalarAdapters, value.getOnZeroResultProductCategories());
            }
            if (value.getOnHorizontalList() != null) {
                OnHorizontalList.INSTANCE.toJson(writer, customScalarAdapters, value.getOnHorizontalList());
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$Item2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$Item2;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item2 implements Adapter<ProductsBySearchQuery.Item2> {

        @NotNull
        public static final Item2 INSTANCE = new Item2();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("__typename");
        public static final int $stable = 8;

        private Item2() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.Item2 fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductsBySearchQuery.OnProductCard1 onProductCard1FromJson = null;
            String str = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("ProductCard"))) {
                reader.o();
                onProductCard1FromJson = OnProductCard1.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new ProductsBySearchQuery.Item2(str, onProductCard1FromJson);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.Item2 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnProductCard() != null) {
                OnProductCard1.INSTANCE.toJson(writer, customScalarAdapters, value.getOnProductCard());
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$MarketplaceBottomSheet;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$MarketplaceBottomSheet;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MarketplaceBottomSheet implements Adapter<ProductsBySearchQuery.MarketplaceBottomSheet> {

        @NotNull
        public static final MarketplaceBottomSheet INSTANCE = new MarketplaceBottomSheet();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("bottomSheetTitle", "bottomSheetBody", "primaryCta", "secondaryCta", "showOnceOnly");
        public static final int $stable = 8;

        private MarketplaceBottomSheet() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.MarketplaceBottomSheet fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ProductsBySearchQuery.PrimaryCta primaryCta = null;
            ProductsBySearchQuery.SecondaryCta secondaryCta = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    primaryCta = (ProductsBySearchQuery.PrimaryCta) Adapters.b(Adapters.c(PrimaryCta.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    secondaryCta = (ProductsBySearchQuery.SecondaryCta) Adapters.b(Adapters.c(SecondaryCta.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "bottomSheetTitle");
                throw null;
            }
            if (str2 != null) {
                return new ProductsBySearchQuery.MarketplaceBottomSheet(str, str2, primaryCta, secondaryCta, bool);
            }
            Assertions.a(reader, "bottomSheetBody");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.MarketplaceBottomSheet value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("bottomSheetTitle");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getBottomSheetTitle());
            writer.F1("bottomSheetBody");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getBottomSheetBody());
            writer.F1("primaryCta");
            Adapters.b(Adapters.c(PrimaryCta.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getPrimaryCta());
            writer.F1("secondaryCta");
            Adapters.b(Adapters.c(SecondaryCta.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getSecondaryCta());
            writer.F1("showOnceOnly");
            Adapters.l.toJson(writer, customScalarAdapters, value.getShowOnceOnly());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$MarketplaceFilterSwitch;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$MarketplaceFilterSwitch;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MarketplaceFilterSwitch implements Adapter<ProductsBySearchQuery.MarketplaceFilterSwitch> {

        @NotNull
        public static final MarketplaceFilterSwitch INSTANCE = new MarketplaceFilterSwitch();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "imageUrl", "buttonCta", "value");
        public static final int $stable = 8;

        private MarketplaceFilterSwitch() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.MarketplaceFilterSwitch fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            ProductsBySearchQuery.ButtonCta buttonCta = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    bool = bool2;
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = bool2;
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool = bool2;
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    bool = bool2;
                    buttonCta = (ProductsBySearchQuery.ButtonCta) Adapters.b(Adapters.c(ButtonCta.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
                bool2 = bool;
            }
            Boolean bool3 = bool2;
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (bool3 != null) {
                return new ProductsBySearchQuery.MarketplaceFilterSwitch(str, str2, str3, buttonCta, bool3.booleanValue());
            }
            Assertions.a(reader, "value");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.MarketplaceFilterSwitch value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.getTitle());
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.getSubtitle());
            writer.F1("imageUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.getImageUrl());
            writer.F1("buttonCta");
            Adapters.b(Adapters.c(ButtonCta.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getButtonCta());
            writer.F1("value");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.getValue()));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$MarketplaceInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$MarketplaceInfo;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MarketplaceInfo implements Adapter<ProductsBySearchQuery.MarketplaceInfo> {

        @NotNull
        public static final MarketplaceInfo INSTANCE = new MarketplaceInfo();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("title", "items", "footer");
        public static final int $stable = 8;

        private MarketplaceInfo() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.MarketplaceInfo fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            ProductsBySearchQuery.Footer footer = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson = Adapters.a(Adapters.c(Item.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    footer = (ProductsBySearchQuery.Footer) Adapters.b(Adapters.c(Footer.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new ProductsBySearchQuery.MarketplaceInfo(str, arrayListFromJson, footer);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.MarketplaceInfo value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.getTitle());
            writer.F1("items");
            Adapters.a(Adapters.c(Item.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getItems());
            writer.F1("footer");
            Adapters.b(Adapters.c(Footer.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getFooter());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$NextBestAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$NextBestAction;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NextBestAction implements Adapter<ProductsBySearchQuery.NextBestAction> {

        @NotNull
        public static final NextBestAction INSTANCE = new NextBestAction();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("__typename");
        public static final int $stable = 8;

        private NextBestAction() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.NextBestAction fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductsBySearchQuery.OnActionableCard1 onActionableCard1FromJson = null;
            String str = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("ActionableCard"))) {
                reader.o();
                onActionableCard1FromJson = OnActionableCard1.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new ProductsBySearchQuery.NextBestAction(str, onActionableCard1FromJson);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.NextBestAction value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnActionableCard() != null) {
                OnActionableCard1.INSTANCE.toJson(writer, customScalarAdapters, value.getOnActionableCard());
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$OnActionableCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$OnActionableCard;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnActionableCard implements Adapter<ProductsBySearchQuery.OnActionableCard> {

        @NotNull
        public static final OnActionableCard INSTANCE = new OnActionableCard();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("image", "altText", "cardHeight", "link", "analytics", "_excluded");
        public static final int $stable = 8;

        private OnActionableCard() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.OnActionableCard fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            CardHeight cardHeightA = null;
            String str3 = null;
            TealiumAnalytics tealiumAnalytics = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    cardHeightA = CardHeight_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    tealiumAnalytics = (TealiumAnalytics) d.k(customScalarAdapters, au.com.woolworths.shop.graphql.type.TealiumAnalytics.f11963a, reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "image");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "altText");
                throw null;
            }
            if (cardHeightA == null) {
                Assertions.a(reader, "cardHeight");
                throw null;
            }
            if (str3 != null) {
                return new ProductsBySearchQuery.OnActionableCard(str, str2, cardHeightA, str3, tealiumAnalytics, bool);
            }
            Assertions.a(reader, "link");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.OnActionableCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("image");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getImage());
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getAltText());
            writer.F1("cardHeight");
            CardHeight_ResponseAdapter.b(writer, customScalarAdapters, value.getCardHeight());
            writer.F1("link");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getLink());
            writer.F1("analytics");
            Adapters.b(customScalarAdapters.e(au.com.woolworths.shop.graphql.type.TealiumAnalytics.f11963a)).toJson(writer, customScalarAdapters, value.getAnalytics());
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.get_excluded());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$OnActionableCard1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$OnActionableCard1;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnActionableCard1 implements Adapter<ProductsBySearchQuery.OnActionableCard1> {

        @NotNull
        public static final OnActionableCard1 INSTANCE = new OnActionableCard1();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("link", "image", "altText", "cardHeight", "analytics", "_excluded");
        public static final int $stable = 8;

        private OnActionableCard1() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.OnActionableCard1 fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            CardHeight cardHeightA = null;
            TealiumAnalytics tealiumAnalytics = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    cardHeightA = CardHeight_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    tealiumAnalytics = (TealiumAnalytics) d.k(customScalarAdapters, au.com.woolworths.shop.graphql.type.TealiumAnalytics.f11963a, reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "link");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "image");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "altText");
                throw null;
            }
            if (cardHeightA != null) {
                return new ProductsBySearchQuery.OnActionableCard1(str, str2, str3, cardHeightA, tealiumAnalytics, bool);
            }
            Assertions.a(reader, "cardHeight");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.OnActionableCard1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("link");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getLink());
            writer.F1("image");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getImage());
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getAltText());
            writer.F1("cardHeight");
            CardHeight_ResponseAdapter.b(writer, customScalarAdapters, value.getCardHeight());
            writer.F1("analytics");
            Adapters.b(customScalarAdapters.e(au.com.woolworths.shop.graphql.type.TealiumAnalytics.f11963a)).toJson(writer, customScalarAdapters, value.getAnalytics());
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.get_excluded());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$OnAdobeTargetAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$OnAdobeTargetAnalytics;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnAdobeTargetAnalytics implements Adapter<ProductsBySearchQuery.OnAdobeTargetAnalytics> {

        @NotNull
        public static final OnAdobeTargetAnalytics INSTANCE = new OnAdobeTargetAnalytics();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("tnta", "pe");
        public static final int $stable = 8;

        private OnAdobeTargetAnalytics() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.OnAdobeTargetAnalytics fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new ProductsBySearchQuery.OnAdobeTargetAnalytics(str, str2);
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.OnAdobeTargetAnalytics value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("tnta");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.getTnta());
            writer.F1("pe");
            nullableAdapter.toJson(writer, customScalarAdapters, value.getPe());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$OnGoogleAdBannerCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$OnGoogleAdBannerCard;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnGoogleAdBannerCard implements Adapter<ProductsBySearchQuery.OnGoogleAdBannerCard> {

        @NotNull
        public static final OnGoogleAdBannerCard INSTANCE = new OnGoogleAdBannerCard();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R(OutOfContextTestingActivity.AD_UNIT_KEY, "nativeCustomTemplateId", "targeting", "iabSize", "correlator");
        public static final int $stable = 8;

        private OnGoogleAdBannerCard() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.OnGoogleAdBannerCard fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            GoogleAdCustomTargeting googleAdCustomTargeting = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    googleAdCustomTargeting = (GoogleAdCustomTargeting) d.k(customScalarAdapters, au.com.woolworths.shop.graphql.type.GoogleAdCustomTargeting.f11436a, reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, OutOfContextTestingActivity.AD_UNIT_KEY);
                throw null;
            }
            if (str2 != null) {
                return new ProductsBySearchQuery.OnGoogleAdBannerCard(str, str2, googleAdCustomTargeting, str3, str4);
            }
            Assertions.a(reader, "nativeCustomTemplateId");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.OnGoogleAdBannerCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(OutOfContextTestingActivity.AD_UNIT_KEY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getAdUnit());
            writer.F1("nativeCustomTemplateId");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getNativeCustomTemplateId());
            writer.F1("targeting");
            Adapters.b(customScalarAdapters.e(au.com.woolworths.shop.graphql.type.GoogleAdCustomTargeting.f11436a)).toJson(writer, customScalarAdapters, value.getTargeting());
            writer.F1("iabSize");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.getIabSize());
            writer.F1("correlator");
            nullableAdapter.toJson(writer, customScalarAdapters, value.getCorrelator());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$OnHorizontalList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$OnHorizontalList;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHorizontalList implements Adapter<ProductsBySearchQuery.OnHorizontalList> {

        @NotNull
        public static final OnHorizontalList INSTANCE = new OnHorizontalList();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("title", "items");
        public static final int $stable = 8;

        private OnHorizontalList() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.OnHorizontalList fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Item2.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new ProductsBySearchQuery.OnHorizontalList(str, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.OnHorizontalList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.getTitle());
            writer.F1("items");
            Adapters.a(Adapters.c(Item2.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getItems());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$OnInsetBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$OnInsetBanner;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnInsetBanner implements Adapter<ProductsBySearchQuery.OnInsetBanner> {

        @NotNull
        public static final OnInsetBanner INSTANCE = new OnInsetBanner();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("displayType", "message", "bannerTitle", "iconUrl", UrlHandler.ACTION);
        public static final int $stable = 8;

        private OnInsetBanner() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.OnInsetBanner fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            ProductsBySearchQuery.Action action = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    insetBannerDisplayTypeA = InsetBannerDisplayType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    action = (ProductsBySearchQuery.Action) Adapters.b(Adapters.c(Action.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerDisplayTypeA == null) {
                Assertions.a(reader, "displayType");
                throw null;
            }
            if (str != null) {
                return new ProductsBySearchQuery.OnInsetBanner(insetBannerDisplayTypeA, str, str2, str3, action);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.OnInsetBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.getDisplayType());
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.getMessage());
            writer.F1("bannerTitle");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.getBannerTitle());
            writer.F1("iconUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.getIconUrl());
            writer.F1(UrlHandler.ACTION);
            Adapters.b(Adapters.c(Action.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getAction());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$OnProductCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$OnProductCard;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductCard implements Adapter<ProductsBySearchQuery.OnProductCard> {

        @NotNull
        public static final OnProductCard INSTANCE = new OnProductCard();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("__typename");
        public static final int $stable = 8;

        private OnProductCard() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.OnProductCard fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductsBySearchQuery.OnProductCard(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.OnProductCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.get__typename());
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.getProductCard());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$OnProductCard1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$OnProductCard1;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductCard1 implements Adapter<ProductsBySearchQuery.OnProductCard1> {

        @NotNull
        public static final OnProductCard1 INSTANCE = new OnProductCard1();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("__typename");
        public static final int $stable = 8;

        private OnProductCard1() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.OnProductCard1 fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductsBySearchQuery.OnProductCard1(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.OnProductCard1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.get__typename());
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.getProductCard());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$OnUniversalInventoryContainer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$OnUniversalInventoryContainer;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnUniversalInventoryContainer implements Adapter<ProductsBySearchQuery.OnUniversalInventoryContainer> {

        @NotNull
        public static final OnUniversalInventoryContainer INSTANCE = new OnUniversalInventoryContainer();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("googleAdBannerCard", "nextBestAction");
        public static final int $stable = 8;

        private OnUniversalInventoryContainer() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.OnUniversalInventoryContainer fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductsBySearchQuery.GoogleAdBannerCard googleAdBannerCard = null;
            ProductsBySearchQuery.NextBestAction nextBestAction = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    googleAdBannerCard = (ProductsBySearchQuery.GoogleAdBannerCard) Adapters.b(Adapters.c(GoogleAdBannerCard.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new ProductsBySearchQuery.OnUniversalInventoryContainer(googleAdBannerCard, nextBestAction);
                    }
                    nextBestAction = (ProductsBySearchQuery.NextBestAction) Adapters.b(Adapters.c(NextBestAction.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.OnUniversalInventoryContainer value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("googleAdBannerCard");
            Adapters.b(Adapters.c(GoogleAdBannerCard.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getGoogleAdBannerCard());
            writer.F1("nextBestAction");
            Adapters.b(Adapters.c(NextBestAction.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getNextBestAction());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$OnZeroResultProductCategories;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$OnZeroResultProductCategories;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnZeroResultProductCategories implements Adapter<ProductsBySearchQuery.OnZeroResultProductCategories> {

        @NotNull
        public static final OnZeroResultProductCategories INSTANCE = new OnZeroResultProductCategories();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("zeroResultProductCategoriesTitle", "zeroResultProductCategoriesItems");
        public static final int $stable = 8;

        private OnZeroResultProductCategories() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.OnZeroResultProductCategories fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(ZeroResultProductCategoriesItem.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new ProductsBySearchQuery.OnZeroResultProductCategories(str, arrayListFromJson);
            }
            Assertions.a(reader, "zeroResultProductCategoriesItems");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.OnZeroResultProductCategories value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("zeroResultProductCategoriesTitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.getZeroResultProductCategoriesTitle());
            writer.F1("zeroResultProductCategoriesItems");
            Adapters.a(Adapters.c(ZeroResultProductCategoriesItem.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getZeroResultProductCategoriesItems());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$PrimaryCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$PrimaryCta;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PrimaryCta implements Adapter<ProductsBySearchQuery.PrimaryCta> {

        @NotNull
        public static final PrimaryCta INSTANCE = new PrimaryCta();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q(AnnotatedPrivateKey.LABEL);
        public static final int $stable = 8;

        private PrimaryCta() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.PrimaryCta fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new ProductsBySearchQuery.PrimaryCta(str);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.PrimaryCta value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.getLabel());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$ProductCategoryTileAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$ProductCategoryTileAction;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductCategoryTileAction implements Adapter<ProductsBySearchQuery.ProductCategoryTileAction> {

        @NotNull
        public static final ProductCategoryTileAction INSTANCE = new ProductCategoryTileAction();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("type", UrlHandler.ACTION, "id");
        public static final int $stable = 8;

        private ProductCategoryTileAction() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.ProductCategoryTileAction fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ActionType actionTypeA = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str != null) {
                return new ProductsBySearchQuery.ProductCategoryTileAction(actionTypeA, str, str2);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.ProductCategoryTileAction value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.getType());
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.getAction());
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.getId());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$ProductsBySearch;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$ProductsBySearch;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductsBySearch implements Adapter<ProductsBySearchQuery.ProductsBySearch> {

        @NotNull
        public static final ProductsBySearch INSTANCE = new ProductsBySearch();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("totalNumberOfProducts", "nextPage", "analytics", "productsFeed", "filters", "sortOptions", "sortOptionsBanner", "marketplaceFilterSwitch", "marketplaceInfo", "marketplaceBottomSheet", "chips", "facetChips", "zeroResultContent");
        public static final int $stable = 8;

        private ProductsBySearch() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.ProductsBySearch fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Integer num2 = null;
            List list = null;
            ArrayList arrayListFromJson = null;
            ArrayList arrayListFromJson2 = null;
            ArrayList arrayListFromJson3 = null;
            ProductsBySearchQuery.SortOptionsBanner sortOptionsBanner = null;
            ProductsBySearchQuery.MarketplaceFilterSwitch marketplaceFilterSwitch = null;
            ProductsBySearchQuery.MarketplaceInfo marketplaceInfo = null;
            ProductsBySearchQuery.MarketplaceBottomSheet marketplaceBottomSheet = null;
            List list2 = null;
            List list3 = null;
            ProductsBySearchQuery.ZeroResultContent zeroResultContent = null;
            while (true) {
                switch (reader.o2(RESPONSE_NAMES)) {
                    case 0:
                        num = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        num2 = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        list = (List) Adapters.b(Adapters.a(Adapters.c(Analytic.INSTANCE, true))).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        arrayListFromJson = Adapters.a(Adapters.c(ProductsFeed.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        arrayListFromJson2 = Adapters.a(Adapters.c(Filter.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        arrayListFromJson3 = Adapters.a(Adapters.c(SortOption.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        sortOptionsBanner = (ProductsBySearchQuery.SortOptionsBanner) Adapters.b(Adapters.c(SortOptionsBanner.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        marketplaceFilterSwitch = (ProductsBySearchQuery.MarketplaceFilterSwitch) Adapters.b(Adapters.c(MarketplaceFilterSwitch.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        marketplaceInfo = (ProductsBySearchQuery.MarketplaceInfo) Adapters.b(Adapters.c(MarketplaceInfo.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        marketplaceBottomSheet = (ProductsBySearchQuery.MarketplaceBottomSheet) Adapters.b(Adapters.c(MarketplaceBottomSheet.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        list2 = (List) Adapters.b(Adapters.a(Adapters.c(Chip.INSTANCE, false))).fromJson(reader, customScalarAdapters);
                        break;
                    case 11:
                        list3 = (List) Adapters.b(Adapters.a(Adapters.c(FacetChip.INSTANCE, false))).fromJson(reader, customScalarAdapters);
                        break;
                    case 12:
                        zeroResultContent = (ProductsBySearchQuery.ZeroResultContent) Adapters.b(Adapters.c(ZeroResultContent.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (arrayListFromJson == null) {
                            Assertions.a(reader, "productsFeed");
                            throw null;
                        }
                        if (arrayListFromJson2 == null) {
                            Assertions.a(reader, "filters");
                            throw null;
                        }
                        if (arrayListFromJson3 != null) {
                            return new ProductsBySearchQuery.ProductsBySearch(num, num2, list, arrayListFromJson, arrayListFromJson2, arrayListFromJson3, sortOptionsBanner, marketplaceFilterSwitch, marketplaceInfo, marketplaceBottomSheet, list2, list3, zeroResultContent);
                        }
                        Assertions.a(reader, "sortOptions");
                        throw null;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.ProductsBySearch value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("totalNumberOfProducts");
            NullableAdapter nullableAdapter = Adapters.k;
            nullableAdapter.toJson(writer, customScalarAdapters, value.getTotalNumberOfProducts());
            writer.F1("nextPage");
            nullableAdapter.toJson(writer, customScalarAdapters, value.getNextPage());
            writer.F1("analytics");
            Adapters.b(Adapters.a(Adapters.c(Analytic.INSTANCE, true))).toJson(writer, customScalarAdapters, value.getAnalytics());
            writer.F1("productsFeed");
            Adapters.a(Adapters.c(ProductsFeed.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getProductsFeed());
            writer.F1("filters");
            Adapters.a(Adapters.c(Filter.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getFilters());
            writer.F1("sortOptions");
            Adapters.a(Adapters.c(SortOption.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getSortOptions());
            writer.F1("sortOptionsBanner");
            Adapters.b(Adapters.c(SortOptionsBanner.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getSortOptionsBanner());
            writer.F1("marketplaceFilterSwitch");
            Adapters.b(Adapters.c(MarketplaceFilterSwitch.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getMarketplaceFilterSwitch());
            writer.F1("marketplaceInfo");
            Adapters.b(Adapters.c(MarketplaceInfo.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getMarketplaceInfo());
            writer.F1("marketplaceBottomSheet");
            Adapters.b(Adapters.c(MarketplaceBottomSheet.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getMarketplaceBottomSheet());
            writer.F1("chips");
            Adapters.b(Adapters.a(Adapters.c(Chip.INSTANCE, false))).toJson(writer, customScalarAdapters, value.getChips());
            writer.F1("facetChips");
            Adapters.b(Adapters.a(Adapters.c(FacetChip.INSTANCE, false))).toJson(writer, customScalarAdapters, value.getFacetChips());
            writer.F1("zeroResultContent");
            Adapters.b(Adapters.c(ZeroResultContent.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getZeroResultContent());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$ProductsFeed;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$ProductsFeed;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductsFeed implements Adapter<ProductsBySearchQuery.ProductsFeed> {

        @NotNull
        public static final ProductsFeed INSTANCE = new ProductsFeed();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("__typename");
        public static final int $stable = 8;

        private ProductsFeed() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.ProductsFeed fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            ProductsBySearchQuery.OnActionableCard onActionableCardFromJson;
            ProductsBySearchQuery.OnGoogleAdBannerCard onGoogleAdBannerCardFromJson;
            ProductsBySearchQuery.OnUniversalInventoryContainer onUniversalInventoryContainerFromJson;
            ProductsBySearchQuery.OnInsetBanner onInsetBannerFromJson;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ProductsBySearchQuery.OnProductCard onProductCardFromJson = null;
            String str = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ActionableCard"))) {
                reader.o();
                onActionableCardFromJson = OnActionableCard.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onActionableCardFromJson = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("GoogleAdBannerCard"), new BooleanExpression.Not(BooleanExpressions.d("includeUniversalInventoryFallback"))))) {
                reader.o();
                onGoogleAdBannerCardFromJson = OnGoogleAdBannerCard.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onGoogleAdBannerCardFromJson = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("UniversalInventoryContainer"), BooleanExpressions.d("includeUniversalInventoryFallback")))) {
                reader.o();
                onUniversalInventoryContainerFromJson = OnUniversalInventoryContainer.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onUniversalInventoryContainerFromJson = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("InsetBanner"))) {
                reader.o();
                onInsetBannerFromJson = OnInsetBanner.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onInsetBannerFromJson = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductCard"))) {
                reader.o();
                onProductCardFromJson = OnProductCard.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new ProductsBySearchQuery.ProductsFeed(str, onActionableCardFromJson, onGoogleAdBannerCardFromJson, onUniversalInventoryContainerFromJson, onInsetBannerFromJson, onProductCardFromJson);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.ProductsFeed value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnActionableCard() != null) {
                OnActionableCard.INSTANCE.toJson(writer, customScalarAdapters, value.getOnActionableCard());
            }
            if (value.getOnGoogleAdBannerCard() != null) {
                OnGoogleAdBannerCard.INSTANCE.toJson(writer, customScalarAdapters, value.getOnGoogleAdBannerCard());
            }
            if (value.getOnUniversalInventoryContainer() != null) {
                OnUniversalInventoryContainer.INSTANCE.toJson(writer, customScalarAdapters, value.getOnUniversalInventoryContainer());
            }
            if (value.getOnInsetBanner() != null) {
                OnInsetBanner.INSTANCE.toJson(writer, customScalarAdapters, value.getOnInsetBanner());
            }
            if (value.getOnProductCard() != null) {
                OnProductCard.INSTANCE.toJson(writer, customScalarAdapters, value.getOnProductCard());
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$SecondaryCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$SecondaryCta;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SecondaryCta implements Adapter<ProductsBySearchQuery.SecondaryCta> {

        @NotNull
        public static final SecondaryCta INSTANCE = new SecondaryCta();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q(AnnotatedPrivateKey.LABEL);
        public static final int $stable = 8;

        private SecondaryCta() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.SecondaryCta fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new ProductsBySearchQuery.SecondaryCta(str);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.SecondaryCta value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.getLabel());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$SortOption;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$SortOption;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SortOption implements Adapter<ProductsBySearchQuery.SortOption> {

        @NotNull
        public static final SortOption INSTANCE = new SortOption();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("key", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "isApplied");
        public static final int $stable = 8;

        private SortOption() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.SortOption fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
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
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
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
            if (bool != null) {
                return new ProductsBySearchQuery.SortOption(str, str2, str3, bool.booleanValue());
            }
            Assertions.a(reader, "isApplied");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.SortOption value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("key");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getKey());
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getTitle());
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.i.toJson(writer, customScalarAdapters, value.getSubtitle());
            writer.F1("isApplied");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.isApplied()));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$SortOptionsBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$SortOptionsBanner;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SortOptionsBanner implements Adapter<ProductsBySearchQuery.SortOptionsBanner> {

        @NotNull
        public static final SortOptionsBanner INSTANCE = new SortOptionsBanner();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("__typename");
        public static final int $stable = 8;

        private SortOptionsBanner() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.SortOptionsBanner fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            InsetBanner insetBannerFromJson = InsetBannerImpl_ResponseAdapter.InsetBanner.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new ProductsBySearchQuery.SortOptionsBanner(str, insetBannerFromJson);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.SortOptionsBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.get__typename());
            InsetBannerImpl_ResponseAdapter.InsetBanner.INSTANCE.toJson(writer, customScalarAdapters, value.getInsetBanner());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$Text;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$Text;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Text implements Adapter<ProductsBySearchQuery.Text> {

        @NotNull
        public static final Text INSTANCE = new Text();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R(TextBundle.TEXT_ENTRY, "altText");
        public static final int $stable = 8;

        private Text() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.Text fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
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
                return new ProductsBySearchQuery.Text(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.Text value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getText());
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getAltText());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$Text1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$Text1;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Text1 implements Adapter<ProductsBySearchQuery.Text1> {

        @NotNull
        public static final Text1 INSTANCE = new Text1();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R(TextBundle.TEXT_ENTRY, "altText");
        public static final int $stable = 8;

        private Text1() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.Text1 fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
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
                return new ProductsBySearchQuery.Text1(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.Text1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getText());
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getAltText());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$ZeroResultContent;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$ZeroResultContent;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ZeroResultContent implements Adapter<ProductsBySearchQuery.ZeroResultContent> {

        @NotNull
        public static final ZeroResultContent INSTANCE = new ZeroResultContent();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("title", "message", "items");
        public static final int $stable = 8;

        private ZeroResultContent() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.ZeroResultContent fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Item1.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new ProductsBySearchQuery.ZeroResultContent(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.ZeroResultContent value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.getTitle());
            writer.F1("message");
            nullableAdapter.toJson(writer, customScalarAdapters, value.getMessage());
            writer.F1("items");
            Adapters.a(Adapters.c(Item1.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getItems());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsBySearchQuery_ResponseAdapter$ZeroResultProductCategoriesItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/ProductsBySearchQuery$ZeroResultProductCategoriesItem;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ZeroResultProductCategoriesItem implements Adapter<ProductsBySearchQuery.ZeroResultProductCategoriesItem> {

        @NotNull
        public static final ZeroResultProductCategoriesItem INSTANCE = new ZeroResultProductCategoriesItem();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("productCategoryTileAction", "productCategoryTileImageUrl", "productCategoryTileLabel");
        public static final int $stable = 8;

        private ZeroResultProductCategoriesItem() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductsBySearchQuery.ZeroResultProductCategoriesItem fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductsBySearchQuery.ProductCategoryTileAction productCategoryTileAction = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    productCategoryTileAction = (ProductsBySearchQuery.ProductCategoryTileAction) Adapters.c(ProductCategoryTileAction.INSTANCE, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (productCategoryTileAction == null) {
                Assertions.a(reader, "productCategoryTileAction");
                throw null;
            }
            if (str == null) {
                Assertions.a(reader, "productCategoryTileImageUrl");
                throw null;
            }
            if (str2 != null) {
                return new ProductsBySearchQuery.ZeroResultProductCategoriesItem(productCategoryTileAction, str, str2);
            }
            Assertions.a(reader, "productCategoryTileLabel");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductsBySearchQuery.ZeroResultProductCategoriesItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productCategoryTileAction");
            Adapters.c(ProductCategoryTileAction.INSTANCE, false).toJson(writer, customScalarAdapters, value.getProductCategoryTileAction());
            writer.F1("productCategoryTileImageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getProductCategoryTileImageUrl());
            writer.F1("productCategoryTileLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getProductCategoryTileLabel());
        }
    }

    private ProductsBySearchQuery_ResponseAdapter() {
    }
}
