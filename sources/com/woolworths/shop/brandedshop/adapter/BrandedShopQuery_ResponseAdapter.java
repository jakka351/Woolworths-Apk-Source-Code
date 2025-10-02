package com.woolworths.shop.brandedshop.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.graphql.common.fragment.ProductCardImpl_ResponseAdapter;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFieldsImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.DownloadableAssetFit;
import au.com.woolworths.shop.graphql.type.DownloadableAssetType;
import au.com.woolworths.shop.graphql.type.ParagraphTextItemType;
import au.com.woolworths.shop.graphql.type.TitleSectionTypes;
import au.com.woolworths.shop.graphql.type.adapter.ActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ButtonStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.DownloadableAssetFit_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.DownloadableAssetType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ParagraphTextItemType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.TitleSectionTypes_ResponseAdapter;
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
import com.salesforce.marketingcloud.UrlHandler;
import com.woolworths.shop.brandedshop.BrandedShopQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b,\bÇ\u0002\u0018\u00002\u00020\u0001:+\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,¨\u0006-"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter;", "", "Data", "BrandedShop", "Header", "BottomSheet", "OnStaticBottomSheet", "StaticBottomSheetItem", "OnParagraphTextItem", "Analytics", "ImpressionAnalytics", "Item", "OnDownloadableAsset", "OnTitleSection", "OnTabSection", "TabSectionItem", "TabItemFeed", "OnProductSection", "ProductSectionLink", "LinkTextWithAlt", "LinkAction", "ProductSectionFeed", "OnProductCard", "OnLink", "LinkTextWithAlt1", "LinkAction1", "OnButton", "ButtonAction", "Analytics1", "OnHorizontalList", "Item1", "OnContentCard", "ContentCardAction", "OnNavRoundel", "NavRoundelAction", "OnFullWidthImageCard", "OnFullWidthContentCard", "ContentCardAction1", "OnParagraphTextItem1", "OnProductSection1", "ProductSectionLink1", "LinkTextWithAlt2", "LinkAction2", "ProductSectionFeed1", "OnProductCard1", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BrandedShopQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$Analytics;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<BrandedShopQuery.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f21441a = new Analytics();
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
                return new BrandedShopQuery.Analytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BrandedShopQuery.Analytics value = (BrandedShopQuery.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21390a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$Analytics1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$Analytics1;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics1 implements Adapter<BrandedShopQuery.Analytics1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics1 f21442a = new Analytics1();
        public static final List b = CollectionsKt.R("__typename", AnnotatedPrivateKey.LABEL);

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
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new BrandedShopQuery.Analytics1(str, str2);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BrandedShopQuery.Analytics1 value = (BrandedShopQuery.Analytics1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21391a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$BottomSheet;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$BottomSheet;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BottomSheet implements Adapter<BrandedShopQuery.BottomSheet> {

        /* renamed from: a, reason: collision with root package name */
        public static final BottomSheet f21443a = new BottomSheet();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            BrandedShopQuery.OnStaticBottomSheet onStaticBottomSheetA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("StaticBottomSheet"))) {
                reader.o();
                onStaticBottomSheetA = OnStaticBottomSheet.a(reader, customScalarAdapters);
            }
            return new BrandedShopQuery.BottomSheet(str, onStaticBottomSheetA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BrandedShopQuery.BottomSheet value = (BrandedShopQuery.BottomSheet) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21392a);
            BrandedShopQuery.OnStaticBottomSheet onStaticBottomSheet = value.b;
            if (onStaticBottomSheet != null) {
                OnStaticBottomSheet.b(writer, customScalarAdapters, onStaticBottomSheet);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$BrandedShop;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$BrandedShop;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BrandedShop implements Adapter<BrandedShopQuery.BrandedShop> {

        /* renamed from: a, reason: collision with root package name */
        public static final BrandedShop f21444a = new BrandedShop();
        public static final List b = CollectionsKt.R("header", "bottomSheets", "analytics", "impressionAnalytics", "items");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            BrandedShopQuery.Header header = null;
            List list = null;
            BrandedShopQuery.Analytics analytics = null;
            BrandedShopQuery.ImpressionAnalytics impressionAnalytics = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    header = (BrandedShopQuery.Header) Adapters.b(Adapters.c(Header.f21449a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    list = (List) Adapters.b(Adapters.a(Adapters.b(Adapters.c(BottomSheet.f21443a, true)))).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    analytics = (BrandedShopQuery.Analytics) Adapters.b(Adapters.c(Analytics.f21441a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    impressionAnalytics = (BrandedShopQuery.ImpressionAnalytics) Adapters.b(Adapters.c(ImpressionAnalytics.f21450a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.b(Adapters.c(Item.f21451a, true))).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new BrandedShopQuery.BrandedShop(header, list, analytics, impressionAnalytics, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BrandedShopQuery.BrandedShop value = (BrandedShopQuery.BrandedShop) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("header");
            Adapters.b(Adapters.c(Header.f21449a, false)).toJson(writer, customScalarAdapters, value.f21393a);
            writer.F1("bottomSheets");
            Adapters.b(Adapters.a(Adapters.b(Adapters.c(BottomSheet.f21443a, true)))).toJson(writer, customScalarAdapters, value.b);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics.f21441a, true)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("impressionAnalytics");
            Adapters.b(Adapters.c(ImpressionAnalytics.f21450a, true)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("items");
            Adapters.a(Adapters.b(Adapters.c(Item.f21451a, true))).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$ButtonAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$ButtonAction;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ButtonAction implements Adapter<BrandedShopQuery.ButtonAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final ButtonAction f21445a = new ButtonAction();
        public static final List b = CollectionsKt.R("__typename", "type", UrlHandler.ACTION, "id");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ActionType actionTypeA = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str2 != null) {
                return new BrandedShopQuery.ButtonAction(str, actionTypeA, str2, str3);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BrandedShopQuery.ButtonAction value = (BrandedShopQuery.ButtonAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21394a);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$ContentCardAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$ContentCardAction;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContentCardAction implements Adapter<BrandedShopQuery.ContentCardAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final ContentCardAction f21446a = new ContentCardAction();
        public static final List b = CollectionsKt.R("__typename", "type", UrlHandler.ACTION, "id");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ActionType actionTypeA = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str2 != null) {
                return new BrandedShopQuery.ContentCardAction(str, actionTypeA, str2, str3);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BrandedShopQuery.ContentCardAction value = (BrandedShopQuery.ContentCardAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21395a);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$ContentCardAction1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$ContentCardAction1;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContentCardAction1 implements Adapter<BrandedShopQuery.ContentCardAction1> {

        /* renamed from: a, reason: collision with root package name */
        public static final ContentCardAction1 f21447a = new ContentCardAction1();
        public static final List b = CollectionsKt.R("__typename", "type", UrlHandler.ACTION, "id");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ActionType actionTypeA = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str2 != null) {
                return new BrandedShopQuery.ContentCardAction1(str, actionTypeA, str2, str3);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BrandedShopQuery.ContentCardAction1 value = (BrandedShopQuery.ContentCardAction1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21396a);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$Data;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<BrandedShopQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f21448a = new Data();
        public static final List b = CollectionsKt.Q("brandedShop");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            BrandedShopQuery.BrandedShop brandedShop = null;
            while (reader.o2(b) == 0) {
                brandedShop = (BrandedShopQuery.BrandedShop) Adapters.c(BrandedShop.f21444a, false).fromJson(reader, customScalarAdapters);
            }
            if (brandedShop != null) {
                return new BrandedShopQuery.Data(brandedShop);
            }
            Assertions.a(reader, "brandedShop");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BrandedShopQuery.Data value = (BrandedShopQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("brandedShop");
            Adapters.c(BrandedShop.f21444a, false).toJson(writer, customScalarAdapters, value.f21397a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$Header;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$Header;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Header implements Adapter<BrandedShopQuery.Header> {

        /* renamed from: a, reason: collision with root package name */
        public static final Header f21449a = new Header();
        public static final List b = CollectionsKt.R("__typename", "pageTitle");

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
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 != null) {
                return new BrandedShopQuery.Header(str, str2);
            }
            Assertions.a(reader, "pageTitle");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BrandedShopQuery.Header value = (BrandedShopQuery.Header) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21398a);
            writer.F1("pageTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$ImpressionAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$ImpressionAnalytics;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImpressionAnalytics implements Adapter<BrandedShopQuery.ImpressionAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ImpressionAnalytics f21450a = new ImpressionAnalytics();
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
                return new BrandedShopQuery.ImpressionAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BrandedShopQuery.ImpressionAnalytics value = (BrandedShopQuery.ImpressionAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21399a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$Item;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<BrandedShopQuery.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f21451a = new Item();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            BrandedShopQuery.OnDownloadableAsset onDownloadableAssetA;
            BrandedShopQuery.OnTitleSection onTitleSectionA;
            BrandedShopQuery.OnTabSection onTabSectionA;
            BrandedShopQuery.OnLink onLinkA;
            BrandedShopQuery.OnButton onButtonA;
            BrandedShopQuery.OnHorizontalList onHorizontalListA;
            BrandedShopQuery.OnFullWidthImageCard onFullWidthImageCardA;
            BrandedShopQuery.OnFullWidthContentCard onFullWidthContentCardA;
            BrandedShopQuery.OnParagraphTextItem1 onParagraphTextItem1A;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            BrandedShopQuery.OnProductSection1 onProductSection1A = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("DownloadableAsset"))) {
                reader.o();
                onDownloadableAssetA = OnDownloadableAsset.a(reader, customScalarAdapters);
            } else {
                onDownloadableAssetA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("TitleSection"))) {
                reader.o();
                onTitleSectionA = OnTitleSection.a(reader, customScalarAdapters);
            } else {
                onTitleSectionA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("TabSection"))) {
                reader.o();
                onTabSectionA = OnTabSection.a(reader, customScalarAdapters);
            } else {
                onTabSectionA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("Link"))) {
                reader.o();
                onLinkA = OnLink.a(reader, customScalarAdapters);
            } else {
                onLinkA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("Button"))) {
                reader.o();
                onButtonA = OnButton.a(reader, customScalarAdapters);
            } else {
                onButtonA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HorizontalList"))) {
                reader.o();
                onHorizontalListA = OnHorizontalList.a(reader, customScalarAdapters);
            } else {
                onHorizontalListA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("FullWidthImageCard"))) {
                reader.o();
                onFullWidthImageCardA = OnFullWidthImageCard.a(reader, customScalarAdapters);
            } else {
                onFullWidthImageCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("FullWidthContentCard"))) {
                reader.o();
                onFullWidthContentCardA = OnFullWidthContentCard.a(reader, customScalarAdapters);
            } else {
                onFullWidthContentCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ParagraphTextItem"))) {
                reader.o();
                onParagraphTextItem1A = OnParagraphTextItem1.a(reader, customScalarAdapters);
            } else {
                onParagraphTextItem1A = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductSection"))) {
                reader.o();
                onProductSection1A = OnProductSection1.a(reader, customScalarAdapters);
            }
            return new BrandedShopQuery.Item(str, onDownloadableAssetA, onTitleSectionA, onTabSectionA, onLinkA, onButtonA, onHorizontalListA, onFullWidthImageCardA, onFullWidthContentCardA, onParagraphTextItem1A, onProductSection1A);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BrandedShopQuery.Item value = (BrandedShopQuery.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21400a);
            BrandedShopQuery.OnDownloadableAsset onDownloadableAsset = value.b;
            if (onDownloadableAsset != null) {
                OnDownloadableAsset.b(writer, customScalarAdapters, onDownloadableAsset);
            }
            BrandedShopQuery.OnTitleSection onTitleSection = value.c;
            if (onTitleSection != null) {
                OnTitleSection.b(writer, customScalarAdapters, onTitleSection);
            }
            BrandedShopQuery.OnTabSection onTabSection = value.d;
            if (onTabSection != null) {
                OnTabSection.b(writer, customScalarAdapters, onTabSection);
            }
            BrandedShopQuery.OnLink onLink = value.e;
            if (onLink != null) {
                OnLink.b(writer, customScalarAdapters, onLink);
            }
            BrandedShopQuery.OnButton onButton = value.f;
            if (onButton != null) {
                OnButton.b(writer, customScalarAdapters, onButton);
            }
            BrandedShopQuery.OnHorizontalList onHorizontalList = value.g;
            if (onHorizontalList != null) {
                OnHorizontalList.b(writer, customScalarAdapters, onHorizontalList);
            }
            BrandedShopQuery.OnFullWidthImageCard onFullWidthImageCard = value.h;
            if (onFullWidthImageCard != null) {
                OnFullWidthImageCard.b(writer, customScalarAdapters, onFullWidthImageCard);
            }
            BrandedShopQuery.OnFullWidthContentCard onFullWidthContentCard = value.i;
            if (onFullWidthContentCard != null) {
                OnFullWidthContentCard.b(writer, customScalarAdapters, onFullWidthContentCard);
            }
            BrandedShopQuery.OnParagraphTextItem1 onParagraphTextItem1 = value.j;
            if (onParagraphTextItem1 != null) {
                OnParagraphTextItem1.b(writer, customScalarAdapters, onParagraphTextItem1);
            }
            BrandedShopQuery.OnProductSection1 onProductSection1 = value.k;
            if (onProductSection1 != null) {
                OnProductSection1.b(writer, customScalarAdapters, onProductSection1);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$Item1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$Item1;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item1 implements Adapter<BrandedShopQuery.Item1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item1 f21452a = new Item1();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            BrandedShopQuery.OnContentCard onContentCardA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            BrandedShopQuery.OnNavRoundel onNavRoundelA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ContentCard"))) {
                reader.o();
                onContentCardA = OnContentCard.a(reader, customScalarAdapters);
            } else {
                onContentCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("NavRoundel"))) {
                reader.o();
                onNavRoundelA = OnNavRoundel.a(reader, customScalarAdapters);
            }
            return new BrandedShopQuery.Item1(str, onContentCardA, onNavRoundelA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BrandedShopQuery.Item1 value = (BrandedShopQuery.Item1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21401a);
            BrandedShopQuery.OnContentCard onContentCard = value.b;
            if (onContentCard != null) {
                OnContentCard.b(writer, customScalarAdapters, onContentCard);
            }
            BrandedShopQuery.OnNavRoundel onNavRoundel = value.c;
            if (onNavRoundel != null) {
                OnNavRoundel.b(writer, customScalarAdapters, onNavRoundel);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$LinkAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$LinkAction;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LinkAction implements Adapter<BrandedShopQuery.LinkAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final LinkAction f21453a = new LinkAction();
        public static final List b = CollectionsKt.R("__typename", "type", UrlHandler.ACTION, "id");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ActionType actionTypeA = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str2 != null) {
                return new BrandedShopQuery.LinkAction(str, actionTypeA, str2, str3);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BrandedShopQuery.LinkAction value = (BrandedShopQuery.LinkAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21402a);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$LinkAction1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$LinkAction1;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LinkAction1 implements Adapter<BrandedShopQuery.LinkAction1> {

        /* renamed from: a, reason: collision with root package name */
        public static final LinkAction1 f21454a = new LinkAction1();
        public static final List b = CollectionsKt.R("__typename", "type", UrlHandler.ACTION, "id");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ActionType actionTypeA = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str2 != null) {
                return new BrandedShopQuery.LinkAction1(str, actionTypeA, str2, str3);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BrandedShopQuery.LinkAction1 value = (BrandedShopQuery.LinkAction1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21403a);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$LinkAction2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$LinkAction2;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LinkAction2 implements Adapter<BrandedShopQuery.LinkAction2> {

        /* renamed from: a, reason: collision with root package name */
        public static final LinkAction2 f21455a = new LinkAction2();
        public static final List b = CollectionsKt.R("__typename", "type", UrlHandler.ACTION, "id");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ActionType actionTypeA = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str2 != null) {
                return new BrandedShopQuery.LinkAction2(str, actionTypeA, str2, str3);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BrandedShopQuery.LinkAction2 value = (BrandedShopQuery.LinkAction2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21404a);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$LinkTextWithAlt;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$LinkTextWithAlt;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LinkTextWithAlt implements Adapter<BrandedShopQuery.LinkTextWithAlt> {

        /* renamed from: a, reason: collision with root package name */
        public static final LinkTextWithAlt f21456a = new LinkTextWithAlt();
        public static final List b = CollectionsKt.R("__typename", TextBundle.TEXT_ENTRY, "altText");

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
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, TextBundle.TEXT_ENTRY);
                throw null;
            }
            if (str3 != null) {
                return new BrandedShopQuery.LinkTextWithAlt(str, str2, str3);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BrandedShopQuery.LinkTextWithAlt value = (BrandedShopQuery.LinkTextWithAlt) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21405a);
            writer.F1(TextBundle.TEXT_ENTRY);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$LinkTextWithAlt1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$LinkTextWithAlt1;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LinkTextWithAlt1 implements Adapter<BrandedShopQuery.LinkTextWithAlt1> {

        /* renamed from: a, reason: collision with root package name */
        public static final LinkTextWithAlt1 f21457a = new LinkTextWithAlt1();
        public static final List b = CollectionsKt.R("__typename", TextBundle.TEXT_ENTRY, "altText");

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
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, TextBundle.TEXT_ENTRY);
                throw null;
            }
            if (str3 != null) {
                return new BrandedShopQuery.LinkTextWithAlt1(str, str2, str3);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BrandedShopQuery.LinkTextWithAlt1 value = (BrandedShopQuery.LinkTextWithAlt1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21406a);
            writer.F1(TextBundle.TEXT_ENTRY);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$LinkTextWithAlt2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$LinkTextWithAlt2;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LinkTextWithAlt2 implements Adapter<BrandedShopQuery.LinkTextWithAlt2> {

        /* renamed from: a, reason: collision with root package name */
        public static final LinkTextWithAlt2 f21458a = new LinkTextWithAlt2();
        public static final List b = CollectionsKt.R("__typename", TextBundle.TEXT_ENTRY, "altText");

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
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, TextBundle.TEXT_ENTRY);
                throw null;
            }
            if (str3 != null) {
                return new BrandedShopQuery.LinkTextWithAlt2(str, str2, str3);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BrandedShopQuery.LinkTextWithAlt2 value = (BrandedShopQuery.LinkTextWithAlt2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21407a);
            writer.F1(TextBundle.TEXT_ENTRY);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$NavRoundelAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$NavRoundelAction;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NavRoundelAction implements Adapter<BrandedShopQuery.NavRoundelAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final NavRoundelAction f21459a = new NavRoundelAction();
        public static final List b = CollectionsKt.R("__typename", "type", UrlHandler.ACTION, "id");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ActionType actionTypeA = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str2 != null) {
                return new BrandedShopQuery.NavRoundelAction(str, actionTypeA, str2, str3);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BrandedShopQuery.NavRoundelAction value = (BrandedShopQuery.NavRoundelAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21408a);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$OnButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnButton;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnButton implements Adapter<BrandedShopQuery.OnButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21460a = CollectionsKt.R("__typename", "buttonId", AnnotatedPrivateKey.LABEL, "style", "enabled", "buttonAction", "iconUrl", "altText", "analytics");

        public static BrandedShopQuery.OnButton a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            ButtonStyle buttonStyle = null;
            BrandedShopQuery.ButtonAction buttonAction = null;
            String str4 = null;
            String str5 = null;
            BrandedShopQuery.Analytics1 analytics1 = null;
            while (true) {
                switch (reader.o2(f21460a)) {
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
                        buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 5:
                        bool = bool2;
                        buttonAction = (BrandedShopQuery.ButtonAction) Adapters.b(Adapters.c(ButtonAction.f21445a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = bool2;
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        bool = bool2;
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        bool = bool2;
                        analytics1 = (BrandedShopQuery.Analytics1) Adapters.b(Adapters.c(Analytics1.f21442a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Boolean bool3 = bool2;
                        if (str == null) {
                            Assertions.a(reader, "__typename");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                            throw null;
                        }
                        if (bool3 != null) {
                            return new BrandedShopQuery.OnButton(str, str2, str3, buttonStyle, bool3.booleanValue(), buttonAction, str4, str5, analytics1);
                        }
                        Assertions.a(reader, "enabled");
                        throw null;
                }
                bool2 = bool;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, BrandedShopQuery.OnButton value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21409a);
            writer.F1("buttonId");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1(AnnotatedPrivateKey.LABEL);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.d);
            writer.F1("enabled");
            d.B(value.e, Adapters.f, writer, customScalarAdapters, "buttonAction");
            Adapters.b(Adapters.c(ButtonAction.f21445a, false)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("iconUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.g);
            writer.F1("altText");
            nullableAdapter.toJson(writer, customScalarAdapters, value.h);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics1.f21442a, false)).toJson(writer, customScalarAdapters, value.i);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (BrandedShopQuery.OnButton) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$OnContentCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnContentCard;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnContentCard implements Adapter<BrandedShopQuery.OnContentCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21461a = CollectionsKt.R("__typename", "contentCardId", "contentCardImageUrl", "contentCardTitle", "contentCardDescription", "contentCardAction");

        public static BrandedShopQuery.OnContentCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            BrandedShopQuery.ContentCardAction contentCardAction = null;
            while (true) {
                int iO2 = reader.o2(f21461a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    contentCardAction = (BrandedShopQuery.ContentCardAction) Adapters.b(Adapters.c(ContentCardAction.f21446a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str3 != null) {
                return new BrandedShopQuery.OnContentCard(str, str2, str3, str4, str5, contentCardAction);
            }
            Assertions.a(reader, "contentCardImageUrl");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, BrandedShopQuery.OnContentCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21410a);
            writer.F1("contentCardId");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("contentCardImageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("contentCardTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("contentCardDescription");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("contentCardAction");
            Adapters.b(Adapters.c(ContentCardAction.f21446a, false)).toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (BrandedShopQuery.OnContentCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$OnDownloadableAsset;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnDownloadableAsset;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnDownloadableAsset implements Adapter<BrandedShopQuery.OnDownloadableAsset> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21462a = CollectionsKt.R("__typename", "assetId", "assetType", "assetUrl", "assetWidth", "assetHeight", "fit", "altText");

        public static BrandedShopQuery.OnDownloadableAsset a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            String str = null;
            String str2 = null;
            DownloadableAssetType downloadableAssetTypeA = null;
            String str3 = null;
            Integer num3 = null;
            DownloadableAssetFit downloadableAssetFit = null;
            String str4 = null;
            while (true) {
                switch (reader.o2(f21462a)) {
                    case 0:
                        num = num2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        num = num2;
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        downloadableAssetTypeA = DownloadableAssetType_ResponseAdapter.a(reader, customScalarAdapters);
                        continue;
                    case 3:
                        num = num2;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        continue;
                    case 5:
                        num = num2;
                        num3 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        num = num2;
                        downloadableAssetFit = (DownloadableAssetFit) Adapters.b(DownloadableAssetFit_ResponseAdapter.f12070a).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        num = num2;
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Integer num4 = num2;
                        if (str == null) {
                            Assertions.a(reader, "__typename");
                            throw null;
                        }
                        if (downloadableAssetTypeA == null) {
                            Assertions.a(reader, "assetType");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "assetUrl");
                            throw null;
                        }
                        if (num4 == null) {
                            Assertions.a(reader, "assetWidth");
                            throw null;
                        }
                        Integer num5 = num3;
                        int iIntValue = num4.intValue();
                        if (num5 != null) {
                            return new BrandedShopQuery.OnDownloadableAsset(str, str2, downloadableAssetTypeA, str3, iIntValue, num5.intValue(), downloadableAssetFit, str4);
                        }
                        Assertions.a(reader, "assetHeight");
                        throw null;
                }
                num2 = num;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, BrandedShopQuery.OnDownloadableAsset value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21411a);
            writer.F1("assetId");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("assetType");
            DownloadableAssetType_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1("assetUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("assetWidth");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.e, adapters$IntAdapter$1, writer, customScalarAdapters, "assetHeight");
            d.y(value.f, adapters$IntAdapter$1, writer, customScalarAdapters, "fit");
            Adapters.b(DownloadableAssetFit_ResponseAdapter.f12070a).toJson(writer, customScalarAdapters, value.g);
            writer.F1("altText");
            nullableAdapter.toJson(writer, customScalarAdapters, value.h);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (BrandedShopQuery.OnDownloadableAsset) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$OnFullWidthContentCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnFullWidthContentCard;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnFullWidthContentCard implements Adapter<BrandedShopQuery.OnFullWidthContentCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21463a = CollectionsKt.R("__typename", "contentCardId", "contentCardImageUrl", "contentCardTitle", "contentCardDescription", "contentCardAction");

        public static BrandedShopQuery.OnFullWidthContentCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            BrandedShopQuery.ContentCardAction1 contentCardAction1 = null;
            while (true) {
                int iO2 = reader.o2(f21463a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    contentCardAction1 = (BrandedShopQuery.ContentCardAction1) Adapters.b(Adapters.c(ContentCardAction1.f21447a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str3 != null) {
                return new BrandedShopQuery.OnFullWidthContentCard(str, str2, str3, str4, str5, contentCardAction1);
            }
            Assertions.a(reader, "contentCardImageUrl");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, BrandedShopQuery.OnFullWidthContentCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21412a);
            writer.F1("contentCardId");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("contentCardImageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("contentCardTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("contentCardDescription");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("contentCardAction");
            Adapters.b(Adapters.c(ContentCardAction1.f21447a, false)).toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (BrandedShopQuery.OnFullWidthContentCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$OnFullWidthImageCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnFullWidthImageCard;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnFullWidthImageCard implements Adapter<BrandedShopQuery.OnFullWidthImageCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21464a = CollectionsKt.R("__typename", "imageCardId", "imageCardImageUrl", "imageCardImageAltText", "imageCardTitle");

        public static BrandedShopQuery.OnFullWidthImageCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (true) {
                int iO2 = reader.o2(f21464a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "imageCardImageUrl");
                throw null;
            }
            if (str4 != null) {
                return new BrandedShopQuery.OnFullWidthImageCard(str, str2, str3, str4, str5);
            }
            Assertions.a(reader, "imageCardImageAltText");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, BrandedShopQuery.OnFullWidthImageCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21413a);
            writer.F1("imageCardId");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("imageCardImageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("imageCardImageAltText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("imageCardTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (BrandedShopQuery.OnFullWidthImageCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$OnHorizontalList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnHorizontalList;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHorizontalList implements Adapter<BrandedShopQuery.OnHorizontalList> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21465a = CollectionsKt.R("__typename", "id", "title", "actionTitle", "deepLink", "items");

        public static BrandedShopQuery.OnHorizontalList a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f21465a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Item1.f21452a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new BrandedShopQuery.OnHorizontalList(str, str2, str3, str4, str5, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, BrandedShopQuery.OnHorizontalList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21414a);
            writer.F1("id");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("actionTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("deepLink");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("items");
            Adapters.a(Adapters.c(Item1.f21452a, true)).toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (BrandedShopQuery.OnHorizontalList) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$OnLink;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnLink;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnLink implements Adapter<BrandedShopQuery.OnLink> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21466a = CollectionsKt.R("__typename", "linkId", "linkTextWithAlt", "linkAction");

        public static BrandedShopQuery.OnLink a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            BrandedShopQuery.LinkTextWithAlt1 linkTextWithAlt1 = null;
            BrandedShopQuery.LinkAction1 linkAction1 = null;
            while (true) {
                int iO2 = reader.o2(f21466a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    linkTextWithAlt1 = (BrandedShopQuery.LinkTextWithAlt1) Adapters.c(LinkTextWithAlt1.f21457a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    linkAction1 = (BrandedShopQuery.LinkAction1) Adapters.c(LinkAction1.f21454a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (linkTextWithAlt1 == null) {
                Assertions.a(reader, "linkTextWithAlt");
                throw null;
            }
            if (linkAction1 != null) {
                return new BrandedShopQuery.OnLink(str, str2, linkTextWithAlt1, linkAction1);
            }
            Assertions.a(reader, "linkAction");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, BrandedShopQuery.OnLink value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21415a);
            writer.F1("linkId");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("linkTextWithAlt");
            Adapters.c(LinkTextWithAlt1.f21457a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("linkAction");
            Adapters.c(LinkAction1.f21454a, false).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (BrandedShopQuery.OnLink) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$OnNavRoundel;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnNavRoundel;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnNavRoundel implements Adapter<BrandedShopQuery.OnNavRoundel> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21467a = CollectionsKt.R("__typename", "navRoundelId", "navRoundelImageUrl", "navRoundelTitle", "navRoundelAction");

        public static BrandedShopQuery.OnNavRoundel a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            BrandedShopQuery.NavRoundelAction navRoundelAction = null;
            while (true) {
                int iO2 = reader.o2(f21467a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    navRoundelAction = (BrandedShopQuery.NavRoundelAction) Adapters.b(Adapters.c(NavRoundelAction.f21459a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str3 != null) {
                return new BrandedShopQuery.OnNavRoundel(str, str2, str3, str4, navRoundelAction);
            }
            Assertions.a(reader, "navRoundelImageUrl");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, BrandedShopQuery.OnNavRoundel value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21416a);
            writer.F1("navRoundelId");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("navRoundelImageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("navRoundelTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("navRoundelAction");
            Adapters.b(Adapters.c(NavRoundelAction.f21459a, false)).toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (BrandedShopQuery.OnNavRoundel) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$OnParagraphTextItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnParagraphTextItem;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnParagraphTextItem implements Adapter<BrandedShopQuery.OnParagraphTextItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21468a = CollectionsKt.R("__typename", "content", "type");

        public static BrandedShopQuery.OnParagraphTextItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ParagraphTextItemType paragraphTextItemTypeA = null;
            while (true) {
                int iO2 = reader.o2(f21468a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    paragraphTextItemTypeA = ParagraphTextItemType_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "content");
                throw null;
            }
            if (paragraphTextItemTypeA != null) {
                return new BrandedShopQuery.OnParagraphTextItem(str, str2, paragraphTextItemTypeA);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, BrandedShopQuery.OnParagraphTextItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21417a);
            writer.F1("content");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("type");
            ParagraphTextItemType_ResponseAdapter.b(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (BrandedShopQuery.OnParagraphTextItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$OnParagraphTextItem1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnParagraphTextItem1;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnParagraphTextItem1 implements Adapter<BrandedShopQuery.OnParagraphTextItem1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21469a = CollectionsKt.R("__typename", "paragraphTextItemId", "content", "type");

        public static BrandedShopQuery.OnParagraphTextItem1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            ParagraphTextItemType paragraphTextItemTypeA = null;
            while (true) {
                int iO2 = reader.o2(f21469a);
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
                    paragraphTextItemTypeA = ParagraphTextItemType_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "content");
                throw null;
            }
            if (paragraphTextItemTypeA != null) {
                return new BrandedShopQuery.OnParagraphTextItem1(str, str2, str3, paragraphTextItemTypeA);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, BrandedShopQuery.OnParagraphTextItem1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21418a);
            writer.F1("paragraphTextItemId");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("content");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("type");
            ParagraphTextItemType_ResponseAdapter.b(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (BrandedShopQuery.OnParagraphTextItem1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$OnProductCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnProductCard;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductCard implements Adapter<BrandedShopQuery.OnProductCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21470a = CollectionsKt.Q("__typename");

        public static BrandedShopQuery.OnProductCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f21470a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new BrandedShopQuery.OnProductCard(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, BrandedShopQuery.OnProductCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21419a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (BrandedShopQuery.OnProductCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$OnProductCard1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnProductCard1;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductCard1 implements Adapter<BrandedShopQuery.OnProductCard1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21471a = CollectionsKt.Q("__typename");

        public static BrandedShopQuery.OnProductCard1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f21471a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new BrandedShopQuery.OnProductCard1(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, BrandedShopQuery.OnProductCard1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21420a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (BrandedShopQuery.OnProductCard1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$OnProductSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnProductSection;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductSection implements Adapter<BrandedShopQuery.OnProductSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21472a = CollectionsKt.R("__typename", "productSectionId", "productSectionLink", "productSectionTotal", "productSectionFeed");

        public static BrandedShopQuery.OnProductSection a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            BrandedShopQuery.ProductSectionLink productSectionLink = null;
            String str3 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f21472a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    productSectionLink = (BrandedShopQuery.ProductSectionLink) Adapters.b(Adapters.c(ProductSectionLink.f21479a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.b(Adapters.c(ProductSectionFeed.f21477a, true))).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new BrandedShopQuery.OnProductSection(str, str2, productSectionLink, str3, arrayListFromJson);
            }
            Assertions.a(reader, "productSectionFeed");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, BrandedShopQuery.OnProductSection value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21421a);
            writer.F1("productSectionId");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("productSectionLink");
            Adapters.b(Adapters.c(ProductSectionLink.f21479a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("productSectionTotal");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("productSectionFeed");
            Adapters.a(Adapters.b(Adapters.c(ProductSectionFeed.f21477a, true))).toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (BrandedShopQuery.OnProductSection) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$OnProductSection1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnProductSection1;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductSection1 implements Adapter<BrandedShopQuery.OnProductSection1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21473a = CollectionsKt.R("__typename", "productSectionId", "productSectionLink", "productSectionTotal", "productSectionFeed");

        public static BrandedShopQuery.OnProductSection1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            BrandedShopQuery.ProductSectionLink1 productSectionLink1 = null;
            String str3 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f21473a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    productSectionLink1 = (BrandedShopQuery.ProductSectionLink1) Adapters.b(Adapters.c(ProductSectionLink1.f21480a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.b(Adapters.c(ProductSectionFeed1.f21478a, true))).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new BrandedShopQuery.OnProductSection1(str, str2, productSectionLink1, str3, arrayListFromJson);
            }
            Assertions.a(reader, "productSectionFeed");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, BrandedShopQuery.OnProductSection1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21422a);
            writer.F1("productSectionId");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("productSectionLink");
            Adapters.b(Adapters.c(ProductSectionLink1.f21480a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("productSectionTotal");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("productSectionFeed");
            Adapters.a(Adapters.b(Adapters.c(ProductSectionFeed1.f21478a, true))).toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (BrandedShopQuery.OnProductSection1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$OnStaticBottomSheet;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnStaticBottomSheet;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnStaticBottomSheet implements Adapter<BrandedShopQuery.OnStaticBottomSheet> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21474a = CollectionsKt.R("__typename", "id", "title", "staticBottomSheetItems");

        public static BrandedShopQuery.OnStaticBottomSheet a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f21474a);
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
                    arrayListFromJson = Adapters.a(Adapters.b(Adapters.c(StaticBottomSheetItem.f21481a, true))).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new BrandedShopQuery.OnStaticBottomSheet(str, str2, str3, arrayListFromJson);
            }
            Assertions.a(reader, "staticBottomSheetItems");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, BrandedShopQuery.OnStaticBottomSheet value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21423a);
            writer.F1("id");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("staticBottomSheetItems");
            Adapters.a(Adapters.b(Adapters.c(StaticBottomSheetItem.f21481a, true))).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (BrandedShopQuery.OnStaticBottomSheet) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$OnTabSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnTabSection;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnTabSection implements Adapter<BrandedShopQuery.OnTabSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21475a = CollectionsKt.R("__typename", "tabSectionId", "tabSectionItems");

        public static BrandedShopQuery.OnTabSection a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f21475a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(TabSectionItem.f21483a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new BrandedShopQuery.OnTabSection(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, "tabSectionItems");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, BrandedShopQuery.OnTabSection value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21424a);
            writer.F1("tabSectionId");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("tabSectionItems");
            Adapters.a(Adapters.c(TabSectionItem.f21483a, false)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (BrandedShopQuery.OnTabSection) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$OnTitleSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnTitleSection;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnTitleSection implements Adapter<BrandedShopQuery.OnTitleSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21476a = CollectionsKt.R("__typename", "titleSectionId", "titleSectionType", "titleSectionText");

        public static BrandedShopQuery.OnTitleSection a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            TitleSectionTypes titleSectionTypesA = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(f21476a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    titleSectionTypesA = TitleSectionTypes_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (titleSectionTypesA == null) {
                Assertions.a(reader, "titleSectionType");
                throw null;
            }
            if (str3 != null) {
                return new BrandedShopQuery.OnTitleSection(str, str2, titleSectionTypesA, str3);
            }
            Assertions.a(reader, "titleSectionText");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, BrandedShopQuery.OnTitleSection value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21425a);
            writer.F1("titleSectionId");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("titleSectionType");
            TitleSectionTypes_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1("titleSectionText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (BrandedShopQuery.OnTitleSection) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$ProductSectionFeed;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$ProductSectionFeed;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductSectionFeed implements Adapter<BrandedShopQuery.ProductSectionFeed> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductSectionFeed f21477a = new ProductSectionFeed();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            BrandedShopQuery.OnProductCard onProductCardA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("ProductCard"))) {
                reader.o();
                onProductCardA = OnProductCard.a(reader, customScalarAdapters);
            }
            return new BrandedShopQuery.ProductSectionFeed(str, onProductCardA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BrandedShopQuery.ProductSectionFeed value = (BrandedShopQuery.ProductSectionFeed) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21426a);
            BrandedShopQuery.OnProductCard onProductCard = value.b;
            if (onProductCard != null) {
                OnProductCard.b(writer, customScalarAdapters, onProductCard);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$ProductSectionFeed1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$ProductSectionFeed1;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductSectionFeed1 implements Adapter<BrandedShopQuery.ProductSectionFeed1> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductSectionFeed1 f21478a = new ProductSectionFeed1();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            BrandedShopQuery.OnProductCard1 onProductCard1A = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("ProductCard"))) {
                reader.o();
                onProductCard1A = OnProductCard1.a(reader, customScalarAdapters);
            }
            return new BrandedShopQuery.ProductSectionFeed1(str, onProductCard1A);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BrandedShopQuery.ProductSectionFeed1 value = (BrandedShopQuery.ProductSectionFeed1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21427a);
            BrandedShopQuery.OnProductCard1 onProductCard1 = value.b;
            if (onProductCard1 != null) {
                OnProductCard1.b(writer, customScalarAdapters, onProductCard1);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$ProductSectionLink;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$ProductSectionLink;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductSectionLink implements Adapter<BrandedShopQuery.ProductSectionLink> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductSectionLink f21479a = new ProductSectionLink();
        public static final List b = CollectionsKt.R("__typename", "linkId", "linkTextWithAlt", "linkAction");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            BrandedShopQuery.LinkTextWithAlt linkTextWithAlt = null;
            BrandedShopQuery.LinkAction linkAction = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    linkTextWithAlt = (BrandedShopQuery.LinkTextWithAlt) Adapters.c(LinkTextWithAlt.f21456a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    linkAction = (BrandedShopQuery.LinkAction) Adapters.c(LinkAction.f21453a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (linkTextWithAlt == null) {
                Assertions.a(reader, "linkTextWithAlt");
                throw null;
            }
            if (linkAction != null) {
                return new BrandedShopQuery.ProductSectionLink(str, str2, linkTextWithAlt, linkAction);
            }
            Assertions.a(reader, "linkAction");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BrandedShopQuery.ProductSectionLink value = (BrandedShopQuery.ProductSectionLink) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21428a);
            writer.F1("linkId");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("linkTextWithAlt");
            Adapters.c(LinkTextWithAlt.f21456a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("linkAction");
            Adapters.c(LinkAction.f21453a, false).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$ProductSectionLink1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$ProductSectionLink1;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductSectionLink1 implements Adapter<BrandedShopQuery.ProductSectionLink1> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductSectionLink1 f21480a = new ProductSectionLink1();
        public static final List b = CollectionsKt.R("__typename", "linkId", "linkTextWithAlt", "linkAction");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            BrandedShopQuery.LinkTextWithAlt2 linkTextWithAlt2 = null;
            BrandedShopQuery.LinkAction2 linkAction2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    linkTextWithAlt2 = (BrandedShopQuery.LinkTextWithAlt2) Adapters.c(LinkTextWithAlt2.f21458a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    linkAction2 = (BrandedShopQuery.LinkAction2) Adapters.c(LinkAction2.f21455a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (linkTextWithAlt2 == null) {
                Assertions.a(reader, "linkTextWithAlt");
                throw null;
            }
            if (linkAction2 != null) {
                return new BrandedShopQuery.ProductSectionLink1(str, str2, linkTextWithAlt2, linkAction2);
            }
            Assertions.a(reader, "linkAction");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BrandedShopQuery.ProductSectionLink1 value = (BrandedShopQuery.ProductSectionLink1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21429a);
            writer.F1("linkId");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("linkTextWithAlt");
            Adapters.c(LinkTextWithAlt2.f21458a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("linkAction");
            Adapters.c(LinkAction2.f21455a, false).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$StaticBottomSheetItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$StaticBottomSheetItem;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StaticBottomSheetItem implements Adapter<BrandedShopQuery.StaticBottomSheetItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final StaticBottomSheetItem f21481a = new StaticBottomSheetItem();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            BrandedShopQuery.OnParagraphTextItem onParagraphTextItemA = null;
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
            return new BrandedShopQuery.StaticBottomSheetItem(str, onParagraphTextItemA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BrandedShopQuery.StaticBottomSheetItem value = (BrandedShopQuery.StaticBottomSheetItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21430a);
            BrandedShopQuery.OnParagraphTextItem onParagraphTextItem = value.b;
            if (onParagraphTextItem != null) {
                OnParagraphTextItem.b(writer, customScalarAdapters, onParagraphTextItem);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$TabItemFeed;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$TabItemFeed;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TabItemFeed implements Adapter<BrandedShopQuery.TabItemFeed> {

        /* renamed from: a, reason: collision with root package name */
        public static final TabItemFeed f21482a = new TabItemFeed();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            BrandedShopQuery.OnProductSection onProductSectionA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("ProductSection"))) {
                reader.o();
                onProductSectionA = OnProductSection.a(reader, customScalarAdapters);
            }
            return new BrandedShopQuery.TabItemFeed(str, onProductSectionA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BrandedShopQuery.TabItemFeed value = (BrandedShopQuery.TabItemFeed) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21431a);
            BrandedShopQuery.OnProductSection onProductSection = value.b;
            if (onProductSection != null) {
                OnProductSection.b(writer, customScalarAdapters, onProductSection);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/BrandedShopQuery_ResponseAdapter$TabSectionItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$TabSectionItem;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TabSectionItem implements Adapter<BrandedShopQuery.TabSectionItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final TabSectionItem f21483a = new TabSectionItem();
        public static final List b = CollectionsKt.R("__typename", "tabItemId", "tabItemTitle", "tabItemFeed");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
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
                    arrayListFromJson = Adapters.a(Adapters.b(Adapters.c(TabItemFeed.f21482a, true))).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "tabItemTitle");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new BrandedShopQuery.TabSectionItem(str, str2, str3, arrayListFromJson);
            }
            Assertions.a(reader, "tabItemFeed");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BrandedShopQuery.TabSectionItem value = (BrandedShopQuery.TabSectionItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21432a);
            writer.F1("tabItemId");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("tabItemTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("tabItemFeed");
            Adapters.a(Adapters.b(Adapters.c(TabItemFeed.f21482a, true))).toJson(writer, customScalarAdapters, value.d);
        }
    }
}
