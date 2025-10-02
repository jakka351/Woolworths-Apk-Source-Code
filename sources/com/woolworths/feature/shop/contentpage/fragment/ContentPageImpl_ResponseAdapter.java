package com.woolworths.feature.shop.contentpage.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.graphql.TealiumAnalytics;
import au.com.woolworths.android.onesite.graphql.GoogleAdCustomTargeting;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.graphql.common.fragment.ProductCardImpl_ResponseAdapter;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFieldsImpl_ResponseAdapter;
import au.com.woolworths.shop.aem.components.offercard.fragment.OfferCard;
import au.com.woolworths.shop.aem.components.offercard.fragment.OfferCardImpl_ResponseAdapter;
import au.com.woolworths.shop.aem.components.recipes.fragment.RecipeSummaryCardFragment;
import au.com.woolworths.shop.aem.components.recipes.fragment.RecipeSummaryCardFragmentImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.CardHeight;
import au.com.woolworths.shop.graphql.type.CatalogueCardType;
import au.com.woolworths.shop.graphql.type.ContentCardSize;
import au.com.woolworths.shop.graphql.type.CoreBroadcastBannerStyle;
import au.com.woolworths.shop.graphql.type.DownloadableAssetFit;
import au.com.woolworths.shop.graphql.type.DownloadableAssetType;
import au.com.woolworths.shop.graphql.type.FooterStyle;
import au.com.woolworths.shop.graphql.type.GenericPageHeroImageType;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.MoreCardStyle;
import au.com.woolworths.shop.graphql.type.PageCoverContentAlignment;
import au.com.woolworths.shop.graphql.type.PageCoverContentFormat;
import au.com.woolworths.shop.graphql.type.PageCoverImagePosition;
import au.com.woolworths.shop.graphql.type.PageCoverTitleTextSize;
import au.com.woolworths.shop.graphql.type.ParagraphTextItemType;
import au.com.woolworths.shop.graphql.type.TitleSectionTypes;
import au.com.woolworths.shop.graphql.type.adapter.ActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CardHeight_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CatalogueCardType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ContentCardSize_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CoreBroadcastBannerStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.DownloadableAssetFit_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.DownloadableAssetType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.FooterStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.GenericPageHeroImageType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionPlacement_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerDisplayType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.MoreCardStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.PageCoverContentAlignment_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.PageCoverContentFormat_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.PageCoverImagePosition_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.PageCoverTitleTextSize_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ParagraphTextItemType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.TitleSectionTypes_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$IntAdapter$1;
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
import com.salesforce.marketingcloud.storage.db.k;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.woolworths.feature.shop.contentpage.fragment.ActionFieldsImpl_ResponseAdapter;
import com.woolworths.feature.shop.contentpage.fragment.ContentPage;
import com.woolworths.feature.shop.contentpage.fragment.CoreButtonFieldsImpl_ResponseAdapter;
import com.woolworths.feature.shop.contentpage.fragment.CoreIconFieldsImpl_ResponseAdapter;
import com.woolworths.feature.shop.contentpage.fragment.EditorialBannerImpl_ResponseAdapter;
import com.woolworths.feature.shop.contentpage.fragment.HostedIconFieldsImpl_ResponseAdapter;
import com.woolworths.feature.shop.contentpage.fragment.InfoTileFieldsImpl_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\bn\bÇ\u0002\u0018\u00002\u00020\u0001:m\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmn¨\u0006o"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter;", "", "ContentPage", "Header", "Video", "ImpressionAnalytics", "Analytics", "Item", "OnPageCover", "PageCoverContentTheme", "Background", "Foreground", "Primary", "Secondary", "Highlight", "PageCoverPrimaryImage", "PageCoverLogo", "OnUniversalInventoryContainer", "GoogleAdBannerCard", "NextBestAction", "OnActionableCard", "ActionableCardImpressionAnalytics", "ActionableCardClickAnalytics", "OnTitleSection", "OnDownloadableAsset", "OnParagraphTextItem", "OnVerticalList", "VerticalListItem", "OnFullWidthContentCard", "ContentCardAction", "OnInfoTile", "VerticalListAction", "Action", "OnHorizontalList", "HorizontalListTrailingLink", "LinkTextWithAlt", "LinkAction", "HorizontalListAnalytics", "HorizontalListImpressionAnalytics", "Item1", "OnProductCard", "OnRecipeSummaryCard", "OnRecipeMoreCard", "ActionMetadatum", "OnRecipeTagList", "OnRecipeSource", "OnNavRoundel", "NavRoundelAction", "OnPill", "PillAction", "OnContentCard", "ContentCardAction1", "ContentCardFooter", "Logo", "ContentCardBrandImage", "ContentCardAnalytics", "OnMoreCard", "MoreCardAction", "OnProductCategoryTile", "ProductCategoryTileAction", "OnOfferCard", "OnQuickLinkCard", "LinkCardAction", "OnPromotionCard", "PromotionCardProduct", "Analytics1", "ImpressionAnalytics1", "OnRecipeMethod", "Item2", "OnInsetBanner", "Action1", "OnBasicCoreRowList", "BasicCoreRowListItem", "Row", "LeadingAsset", "OnHostedIcon", "Action2", "BasicCoreRowListAnalytics", "BasicCoreRowListImpressionAnalytics", "OnVideo", "OnEditorialCarousel", "EditorialCarouselItem", "OnEditorialBanner", "OnEditorialBanner1", "OnSearchNavCard", "SearchNavCardAction", "OnBasicCoreBroadcastBanner", "ImpressionAnalytics2", "BroadcastBannerDismissAnalytics", "BroadcastBannerUI", "Icon", "OnCoreIcon", "OnHostedIcon1", "BroadcastBannerAction", "OnButtonSection", "ButtonSectionButton", "OnGridList", "GridListAnalytics", "GridListImpressionAnalytics", "GridListItem", "OnRecipeSummaryCard1", "OnInfoTile1", "OnChatEntryCardV3", "ChatEntryCardAction", "Analytics2", "OnCatalogueCard", "ClickAnalytics", "ImpressionAnalytics3", "OnActionableCard1", "ActionableCardImpressionAnalytics1", "ActionableCardClickAnalytics1", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ContentPageImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$Action;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Action;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action implements Adapter<ContentPage.Action> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action f19637a = new Action();
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
            ActionFields actionFieldsA = ActionFieldsImpl_ResponseAdapter.ActionFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new ContentPage.Action(str, actionFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.Action value = (ContentPage.Action) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19529a);
            List list = ActionFieldsImpl_ResponseAdapter.ActionFields.f19526a;
            ActionFieldsImpl_ResponseAdapter.ActionFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$Action1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Action1;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action1 implements Adapter<ContentPage.Action1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action1 f19638a = new Action1();
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
                return new ContentPage.Action1(insetBannerActionPlacementA, insetBannerActionTypeA, str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.Action1 value = (ContentPage.Action1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("placement");
            InsetBannerActionPlacement_ResponseAdapter.b(writer, customScalarAdapters, value.f19530a);
            writer.F1("type");
            InsetBannerActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$Action2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Action2;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action2 implements Adapter<ContentPage.Action2> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action2 f19639a = new Action2();
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
            ActionFields actionFieldsA = ActionFieldsImpl_ResponseAdapter.ActionFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new ContentPage.Action2(str, actionFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.Action2 value = (ContentPage.Action2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19531a);
            List list = ActionFieldsImpl_ResponseAdapter.ActionFields.f19526a;
            ActionFieldsImpl_ResponseAdapter.ActionFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$ActionMetadatum;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ActionMetadatum;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ActionMetadatum implements Adapter<ContentPage.ActionMetadatum> {

        /* renamed from: a, reason: collision with root package name */
        public static final ActionMetadatum f19640a = new ActionMetadatum();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            ContentPage.OnRecipeTagList onRecipeTagListA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ContentPage.OnRecipeSource onRecipeSourceA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RecipeTagList"))) {
                reader.o();
                onRecipeTagListA = OnRecipeTagList.a(reader, customScalarAdapters);
            } else {
                onRecipeTagListA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RecipeSource"))) {
                reader.o();
                onRecipeSourceA = OnRecipeSource.a(reader, customScalarAdapters);
            }
            return new ContentPage.ActionMetadatum(str, onRecipeTagListA, onRecipeSourceA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.ActionMetadatum value = (ContentPage.ActionMetadatum) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19532a);
            ContentPage.OnRecipeTagList onRecipeTagList = value.b;
            if (onRecipeTagList != null) {
                OnRecipeTagList.b(writer, customScalarAdapters, onRecipeTagList);
            }
            ContentPage.OnRecipeSource onRecipeSource = value.c;
            if (onRecipeSource != null) {
                OnRecipeSource.b(writer, customScalarAdapters, onRecipeSource);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$ActionableCardClickAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ActionableCardClickAnalytics;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ActionableCardClickAnalytics implements Adapter<ContentPage.ActionableCardClickAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ActionableCardClickAnalytics f19641a = new ActionableCardClickAnalytics();
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
                return new ContentPage.ActionableCardClickAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.ActionableCardClickAnalytics value = (ContentPage.ActionableCardClickAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19533a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$ActionableCardClickAnalytics1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ActionableCardClickAnalytics1;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ActionableCardClickAnalytics1 implements Adapter<ContentPage.ActionableCardClickAnalytics1> {

        /* renamed from: a, reason: collision with root package name */
        public static final ActionableCardClickAnalytics1 f19642a = new ActionableCardClickAnalytics1();
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
                return new ContentPage.ActionableCardClickAnalytics1(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.ActionableCardClickAnalytics1 value = (ContentPage.ActionableCardClickAnalytics1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19534a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$ActionableCardImpressionAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ActionableCardImpressionAnalytics;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ActionableCardImpressionAnalytics implements Adapter<ContentPage.ActionableCardImpressionAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ActionableCardImpressionAnalytics f19643a = new ActionableCardImpressionAnalytics();
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
                return new ContentPage.ActionableCardImpressionAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.ActionableCardImpressionAnalytics value = (ContentPage.ActionableCardImpressionAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19535a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$ActionableCardImpressionAnalytics1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ActionableCardImpressionAnalytics1;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ActionableCardImpressionAnalytics1 implements Adapter<ContentPage.ActionableCardImpressionAnalytics1> {

        /* renamed from: a, reason: collision with root package name */
        public static final ActionableCardImpressionAnalytics1 f19644a = new ActionableCardImpressionAnalytics1();
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
                return new ContentPage.ActionableCardImpressionAnalytics1(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.ActionableCardImpressionAnalytics1 value = (ContentPage.ActionableCardImpressionAnalytics1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19536a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Analytics;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<ContentPage.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f19645a = new Analytics();
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
                return new ContentPage.Analytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.Analytics value = (ContentPage.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19537a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$Analytics1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Analytics1;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics1 implements Adapter<ContentPage.Analytics1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics1 f19646a = new Analytics1();
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
                return new ContentPage.Analytics1(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.Analytics1 value = (ContentPage.Analytics1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19538a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$Analytics2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Analytics2;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics2 implements Adapter<ContentPage.Analytics2> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics2 f19647a = new Analytics2();
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
                return new ContentPage.Analytics2(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.Analytics2 value = (ContentPage.Analytics2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19539a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$Background;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Background;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Background implements Adapter<ContentPage.Background> {

        /* renamed from: a, reason: collision with root package name */
        public static final Background f19648a = new Background();
        public static final List b = CollectionsKt.Q("lightHexCode");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new ContentPage.Background(str);
            }
            Assertions.a(reader, "lightHexCode");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.Background value = (ContentPage.Background) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("lightHexCode");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19540a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$BasicCoreRowListAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$BasicCoreRowListAnalytics;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BasicCoreRowListAnalytics implements Adapter<ContentPage.BasicCoreRowListAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final BasicCoreRowListAnalytics f19649a = new BasicCoreRowListAnalytics();
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
                return new ContentPage.BasicCoreRowListAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.BasicCoreRowListAnalytics value = (ContentPage.BasicCoreRowListAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19541a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$BasicCoreRowListImpressionAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$BasicCoreRowListImpressionAnalytics;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BasicCoreRowListImpressionAnalytics implements Adapter<ContentPage.BasicCoreRowListImpressionAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final BasicCoreRowListImpressionAnalytics f19650a = new BasicCoreRowListImpressionAnalytics();
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
                return new ContentPage.BasicCoreRowListImpressionAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.BasicCoreRowListImpressionAnalytics value = (ContentPage.BasicCoreRowListImpressionAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19542a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$BasicCoreRowListItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$BasicCoreRowListItem;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BasicCoreRowListItem implements Adapter<ContentPage.BasicCoreRowListItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final BasicCoreRowListItem f19651a = new BasicCoreRowListItem();
        public static final List b = CollectionsKt.R("row", UrlHandler.ACTION);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ContentPage.Row row = null;
            ContentPage.Action2 action2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    row = (ContentPage.Row) Adapters.c(Row.f19740a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    action2 = (ContentPage.Action2) Adapters.c(Action2.f19639a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (row == null) {
                Assertions.a(reader, "row");
                throw null;
            }
            if (action2 != null) {
                return new ContentPage.BasicCoreRowListItem(row, action2);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.BasicCoreRowListItem value = (ContentPage.BasicCoreRowListItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("row");
            Adapters.c(Row.f19740a, false).toJson(writer, customScalarAdapters, value.f19543a);
            writer.F1(UrlHandler.ACTION);
            Adapters.c(Action2.f19639a, true).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$BroadcastBannerAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$BroadcastBannerAction;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BroadcastBannerAction implements Adapter<ContentPage.BroadcastBannerAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final BroadcastBannerAction f19652a = new BroadcastBannerAction();
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
            ActionFields actionFieldsA = ActionFieldsImpl_ResponseAdapter.ActionFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new ContentPage.BroadcastBannerAction(str, actionFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.BroadcastBannerAction value = (ContentPage.BroadcastBannerAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19544a);
            List list = ActionFieldsImpl_ResponseAdapter.ActionFields.f19526a;
            ActionFieldsImpl_ResponseAdapter.ActionFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$BroadcastBannerDismissAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$BroadcastBannerDismissAnalytics;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BroadcastBannerDismissAnalytics implements Adapter<ContentPage.BroadcastBannerDismissAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final BroadcastBannerDismissAnalytics f19653a = new BroadcastBannerDismissAnalytics();
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
                return new ContentPage.BroadcastBannerDismissAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.BroadcastBannerDismissAnalytics value = (ContentPage.BroadcastBannerDismissAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19545a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$BroadcastBannerUI;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$BroadcastBannerUI;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BroadcastBannerUI implements Adapter<ContentPage.BroadcastBannerUI> {

        /* renamed from: a, reason: collision with root package name */
        public static final BroadcastBannerUI f19654a = new BroadcastBannerUI();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "style", BarcodePickDeserializer.FIELD_ICON);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            CoreBroadcastBannerStyle coreBroadcastBannerStyleA = null;
            ContentPage.Icon icon = null;
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
                    icon = (ContentPage.Icon) Adapters.c(Icon.f19675a, true).fromJson(reader, customScalarAdapters);
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
                return new ContentPage.BroadcastBannerUI(str, str2, coreBroadcastBannerStyleA, icon);
            }
            Assertions.a(reader, BarcodePickDeserializer.FIELD_ICON);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.BroadcastBannerUI value = (ContentPage.BroadcastBannerUI) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19546a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            CoreBroadcastBannerStyle_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1(BarcodePickDeserializer.FIELD_ICON);
            Adapters.c(Icon.f19675a, true).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$ButtonSectionButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ButtonSectionButton;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ButtonSectionButton implements Adapter<ContentPage.ButtonSectionButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final ButtonSectionButton f19655a = new ButtonSectionButton();
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
            CoreButtonFields coreButtonFieldsA = CoreButtonFieldsImpl_ResponseAdapter.CoreButtonFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new ContentPage.ButtonSectionButton(str, coreButtonFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.ButtonSectionButton value = (ContentPage.ButtonSectionButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19547a);
            List list = CoreButtonFieldsImpl_ResponseAdapter.CoreButtonFields.f19751a;
            CoreButtonFieldsImpl_ResponseAdapter.CoreButtonFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$ChatEntryCardAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ChatEntryCardAction;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ChatEntryCardAction implements Adapter<ContentPage.ChatEntryCardAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final ChatEntryCardAction f19656a = new ChatEntryCardAction();
        public static final List b = CollectionsKt.R("id", UrlHandler.ACTION, "type", "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ActionType actionTypeA = null;
            ContentPage.Analytics2 analytics2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    analytics2 = (ContentPage.Analytics2) Adapters.b(Adapters.c(Analytics2.f19647a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 == null) {
                Assertions.a(reader, UrlHandler.ACTION);
                throw null;
            }
            if (actionTypeA != null) {
                return new ContentPage.ChatEntryCardAction(str, str2, actionTypeA, analytics2);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.ChatEntryCardAction value = (ContentPage.ChatEntryCardAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.f19548a);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics2.f19647a, true)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$ClickAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ClickAnalytics;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClickAnalytics implements Adapter<ContentPage.ClickAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ClickAnalytics f19657a = new ClickAnalytics();
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
                return new ContentPage.ClickAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.ClickAnalytics value = (ContentPage.ClickAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19549a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$ContentCardAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ContentCardAction;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContentCardAction implements Adapter<ContentPage.ContentCardAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final ContentCardAction f19658a = new ContentCardAction();
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
            ActionFields actionFieldsA = ActionFieldsImpl_ResponseAdapter.ActionFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new ContentPage.ContentCardAction(str, actionFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.ContentCardAction value = (ContentPage.ContentCardAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19550a);
            List list = ActionFieldsImpl_ResponseAdapter.ActionFields.f19526a;
            ActionFieldsImpl_ResponseAdapter.ActionFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$ContentCardAction1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ContentCardAction1;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContentCardAction1 implements Adapter<ContentPage.ContentCardAction1> {

        /* renamed from: a, reason: collision with root package name */
        public static final ContentCardAction1 f19659a = new ContentCardAction1();
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
            ActionFields actionFieldsA = ActionFieldsImpl_ResponseAdapter.ActionFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new ContentPage.ContentCardAction1(str, actionFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.ContentCardAction1 value = (ContentPage.ContentCardAction1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19551a);
            List list = ActionFieldsImpl_ResponseAdapter.ActionFields.f19526a;
            ActionFieldsImpl_ResponseAdapter.ActionFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$ContentCardAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ContentCardAnalytics;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContentCardAnalytics implements Adapter<ContentPage.ContentCardAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ContentCardAnalytics f19660a = new ContentCardAnalytics();
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
                return new ContentPage.ContentCardAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.ContentCardAnalytics value = (ContentPage.ContentCardAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19552a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$ContentCardBrandImage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ContentCardBrandImage;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContentCardBrandImage implements Adapter<ContentPage.ContentCardBrandImage> {

        /* renamed from: a, reason: collision with root package name */
        public static final ContentCardBrandImage f19661a = new ContentCardBrandImage();
        public static final List b = CollectionsKt.R("imageUrl", "altText");

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
                Assertions.a(reader, "imageUrl");
                throw null;
            }
            if (str2 != null) {
                return new ContentPage.ContentCardBrandImage(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.ContentCardBrandImage value = (ContentPage.ContentCardBrandImage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("imageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19553a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$ContentCardFooter;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ContentCardFooter;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContentCardFooter implements Adapter<ContentPage.ContentCardFooter> {

        /* renamed from: a, reason: collision with root package name */
        public static final ContentCardFooter f19662a = new ContentCardFooter();
        public static final List b = CollectionsKt.R("style", TextBundle.TEXT_ENTRY, "logo");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            FooterStyle footerStyleA = null;
            String str = null;
            ContentPage.Logo logo = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    footerStyleA = FooterStyle_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    logo = (ContentPage.Logo) Adapters.b(Adapters.c(Logo.f19687a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (footerStyleA != null) {
                return new ContentPage.ContentCardFooter(footerStyleA, str, logo);
            }
            Assertions.a(reader, "style");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.ContentCardFooter value = (ContentPage.ContentCardFooter) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("style");
            FooterStyle_ResponseAdapter.b(writer, customScalarAdapters, value.f19554a);
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("logo");
            Adapters.b(Adapters.c(Logo.f19687a, false)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$ContentPage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContentPage implements Adapter<com.woolworths.feature.shop.contentpage.fragment.ContentPage> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19663a = CollectionsKt.R("header", "impressionAnalytics", "analytics", "nextPageNumber", "items");

        public static com.woolworths.feature.shop.contentpage.fragment.ContentPage a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ContentPage.Header header = null;
            ContentPage.ImpressionAnalytics impressionAnalytics = null;
            ContentPage.Analytics analytics = null;
            Integer num = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f19663a);
                if (iO2 == 0) {
                    header = (ContentPage.Header) Adapters.b(Adapters.c(Header.f19670a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    impressionAnalytics = (ContentPage.ImpressionAnalytics) Adapters.b(Adapters.c(ImpressionAnalytics.f19676a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    analytics = (ContentPage.Analytics) Adapters.b(Adapters.c(Analytics.f19645a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    num = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.b(Adapters.c(Item.f19680a, true))).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new com.woolworths.feature.shop.contentpage.fragment.ContentPage(header, impressionAnalytics, analytics, num, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, com.woolworths.feature.shop.contentpage.fragment.ContentPage value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("header");
            Adapters.b(Adapters.c(Header.f19670a, false)).toJson(writer, customScalarAdapters, value.f19528a);
            writer.F1("impressionAnalytics");
            Adapters.b(Adapters.c(ImpressionAnalytics.f19676a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics.f19645a, true)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("nextPageNumber");
            Adapters.k.toJson(writer, customScalarAdapters, value.d);
            writer.F1("items");
            Adapters.a(Adapters.b(Adapters.c(Item.f19680a, true))).toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (com.woolworths.feature.shop.contentpage.fragment.ContentPage) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$EditorialCarouselItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$EditorialCarouselItem;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EditorialCarouselItem implements Adapter<ContentPage.EditorialCarouselItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final EditorialCarouselItem f19664a = new EditorialCarouselItem();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ContentPage.OnEditorialBanner onEditorialBannerA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("EditorialBanner"))) {
                reader.o();
                onEditorialBannerA = OnEditorialBanner.a(reader, customScalarAdapters);
            }
            return new ContentPage.EditorialCarouselItem(str, onEditorialBannerA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.EditorialCarouselItem value = (ContentPage.EditorialCarouselItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19555a);
            ContentPage.OnEditorialBanner onEditorialBanner = value.b;
            if (onEditorialBanner != null) {
                OnEditorialBanner.b(writer, customScalarAdapters, onEditorialBanner);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$Foreground;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Foreground;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Foreground implements Adapter<ContentPage.Foreground> {

        /* renamed from: a, reason: collision with root package name */
        public static final Foreground f19665a = new Foreground();
        public static final List b = CollectionsKt.R("primary", "secondary", "highlight");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ContentPage.Primary primary = null;
            ContentPage.Secondary secondary = null;
            ContentPage.Highlight highlight = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    primary = (ContentPage.Primary) Adapters.c(Primary.f19737a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    secondary = (ContentPage.Secondary) Adapters.c(Secondary.f19742a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    highlight = (ContentPage.Highlight) Adapters.c(Highlight.f19671a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (primary == null) {
                Assertions.a(reader, "primary");
                throw null;
            }
            if (secondary == null) {
                Assertions.a(reader, "secondary");
                throw null;
            }
            if (highlight != null) {
                return new ContentPage.Foreground(primary, secondary, highlight);
            }
            Assertions.a(reader, "highlight");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.Foreground value = (ContentPage.Foreground) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("primary");
            Adapters.c(Primary.f19737a, false).toJson(writer, customScalarAdapters, value.f19556a);
            writer.F1("secondary");
            Adapters.c(Secondary.f19742a, false).toJson(writer, customScalarAdapters, value.b);
            writer.F1("highlight");
            Adapters.c(Highlight.f19671a, false).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$GoogleAdBannerCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$GoogleAdBannerCard;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GoogleAdBannerCard implements Adapter<ContentPage.GoogleAdBannerCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final GoogleAdBannerCard f19666a = new GoogleAdBannerCard();
        public static final List b = CollectionsKt.R("__typename", OutOfContextTestingActivity.AD_UNIT_KEY, "nativeCustomTemplateId", "targeting", "iabSize", "correlator", "_excluded");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            GoogleAdCustomTargeting googleAdCustomTargeting = null;
            String str4 = null;
            String str5 = null;
            Boolean bool = null;
            while (true) {
                switch (reader.o2(b)) {
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
                        googleAdCustomTargeting = (GoogleAdCustomTargeting) d.k(customScalarAdapters, au.com.woolworths.shop.graphql.type.GoogleAdCustomTargeting.f11436a, reader, customScalarAdapters);
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
                            Assertions.a(reader, "__typename");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, OutOfContextTestingActivity.AD_UNIT_KEY);
                            throw null;
                        }
                        if (str3 != null) {
                            return new ContentPage.GoogleAdBannerCard(str, str2, str3, googleAdCustomTargeting, str4, str5, bool);
                        }
                        Assertions.a(reader, "nativeCustomTemplateId");
                        throw null;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.GoogleAdBannerCard value = (ContentPage.GoogleAdBannerCard) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19557a);
            writer.F1(OutOfContextTestingActivity.AD_UNIT_KEY);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("nativeCustomTemplateId");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("targeting");
            Adapters.b(customScalarAdapters.e(au.com.woolworths.shop.graphql.type.GoogleAdCustomTargeting.f11436a)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("iabSize");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("correlator");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.g);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$GridListAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$GridListAnalytics;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GridListAnalytics implements Adapter<ContentPage.GridListAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final GridListAnalytics f19667a = new GridListAnalytics();
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
                return new ContentPage.GridListAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.GridListAnalytics value = (ContentPage.GridListAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19558a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$GridListImpressionAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$GridListImpressionAnalytics;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GridListImpressionAnalytics implements Adapter<ContentPage.GridListImpressionAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final GridListImpressionAnalytics f19668a = new GridListImpressionAnalytics();
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
                return new ContentPage.GridListImpressionAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.GridListImpressionAnalytics value = (ContentPage.GridListImpressionAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19559a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$GridListItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$GridListItem;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GridListItem implements Adapter<ContentPage.GridListItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final GridListItem f19669a = new GridListItem();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ContentPage.OnRecipeSummaryCard1 onRecipeSummaryCard1A = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("RecipeSummaryCard"))) {
                reader.o();
                onRecipeSummaryCard1A = OnRecipeSummaryCard1.a(reader, customScalarAdapters);
            }
            return new ContentPage.GridListItem(str, onRecipeSummaryCard1A);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.GridListItem value = (ContentPage.GridListItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19560a);
            ContentPage.OnRecipeSummaryCard1 onRecipeSummaryCard1 = value.b;
            if (onRecipeSummaryCard1 != null) {
                OnRecipeSummaryCard1.b(writer, customScalarAdapters, onRecipeSummaryCard1);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$Header;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Header;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Header implements Adapter<ContentPage.Header> {

        /* renamed from: a, reason: collision with root package name */
        public static final Header f19670a = new Header();
        public static final List b = CollectionsKt.R("pageTitle", "heroImage", "heroImageType", "video");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            GenericPageHeroImageType genericPageHeroImageType = null;
            ContentPage.Video video = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    genericPageHeroImageType = (GenericPageHeroImageType) Adapters.b(GenericPageHeroImageType_ResponseAdapter.f12076a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    video = (ContentPage.Video) Adapters.b(Adapters.c(Video.f19745a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new ContentPage.Header(str, str2, genericPageHeroImageType, video);
            }
            Assertions.a(reader, "pageTitle");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.Header value = (ContentPage.Header) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("pageTitle");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19561a);
            writer.F1("heroImage");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("heroImageType");
            Adapters.b(GenericPageHeroImageType_ResponseAdapter.f12076a).toJson(writer, customScalarAdapters, value.c);
            writer.F1("video");
            Adapters.b(Adapters.c(Video.f19745a, false)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$Highlight;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Highlight;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Highlight implements Adapter<ContentPage.Highlight> {

        /* renamed from: a, reason: collision with root package name */
        public static final Highlight f19671a = new Highlight();
        public static final List b = CollectionsKt.Q("lightHexCode");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new ContentPage.Highlight(str);
            }
            Assertions.a(reader, "lightHexCode");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.Highlight value = (ContentPage.Highlight) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("lightHexCode");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19562a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$HorizontalListAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$HorizontalListAnalytics;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HorizontalListAnalytics implements Adapter<ContentPage.HorizontalListAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final HorizontalListAnalytics f19672a = new HorizontalListAnalytics();
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
                return new ContentPage.HorizontalListAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.HorizontalListAnalytics value = (ContentPage.HorizontalListAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19563a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$HorizontalListImpressionAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$HorizontalListImpressionAnalytics;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HorizontalListImpressionAnalytics implements Adapter<ContentPage.HorizontalListImpressionAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final HorizontalListImpressionAnalytics f19673a = new HorizontalListImpressionAnalytics();
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
                return new ContentPage.HorizontalListImpressionAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.HorizontalListImpressionAnalytics value = (ContentPage.HorizontalListImpressionAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19564a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$HorizontalListTrailingLink;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$HorizontalListTrailingLink;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HorizontalListTrailingLink implements Adapter<ContentPage.HorizontalListTrailingLink> {

        /* renamed from: a, reason: collision with root package name */
        public static final HorizontalListTrailingLink f19674a = new HorizontalListTrailingLink();
        public static final List b = CollectionsKt.R("linkTextWithAlt", "linkId", "linkAction");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ContentPage.LinkTextWithAlt linkTextWithAlt = null;
            String str = null;
            ContentPage.LinkAction linkAction = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    linkTextWithAlt = (ContentPage.LinkTextWithAlt) Adapters.c(LinkTextWithAlt.f19686a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    linkAction = (ContentPage.LinkAction) Adapters.c(LinkAction.f19684a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (linkTextWithAlt == null) {
                Assertions.a(reader, "linkTextWithAlt");
                throw null;
            }
            if (linkAction != null) {
                return new ContentPage.HorizontalListTrailingLink(linkTextWithAlt, str, linkAction);
            }
            Assertions.a(reader, "linkAction");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.HorizontalListTrailingLink value = (ContentPage.HorizontalListTrailingLink) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("linkTextWithAlt");
            Adapters.c(LinkTextWithAlt.f19686a, false).toJson(writer, customScalarAdapters, value.f19565a);
            writer.F1("linkId");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("linkAction");
            Adapters.c(LinkAction.f19684a, true).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$Icon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Icon;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Icon implements Adapter<ContentPage.Icon> {

        /* renamed from: a, reason: collision with root package name */
        public static final Icon f19675a = new Icon();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            ContentPage.OnCoreIcon onCoreIconA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ContentPage.OnHostedIcon1 onHostedIcon1A = null;
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
                onHostedIcon1A = OnHostedIcon1.a(reader, customScalarAdapters);
            }
            return new ContentPage.Icon(str, onCoreIconA, onHostedIcon1A);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.Icon value = (ContentPage.Icon) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19566a);
            ContentPage.OnCoreIcon onCoreIcon = value.b;
            if (onCoreIcon != null) {
                OnCoreIcon.b(writer, customScalarAdapters, onCoreIcon);
            }
            ContentPage.OnHostedIcon1 onHostedIcon1 = value.c;
            if (onHostedIcon1 != null) {
                OnHostedIcon1.b(writer, customScalarAdapters, onHostedIcon1);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$ImpressionAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ImpressionAnalytics;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImpressionAnalytics implements Adapter<ContentPage.ImpressionAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ImpressionAnalytics f19676a = new ImpressionAnalytics();
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
                return new ContentPage.ImpressionAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.ImpressionAnalytics value = (ContentPage.ImpressionAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19567a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$ImpressionAnalytics1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ImpressionAnalytics1;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImpressionAnalytics1 implements Adapter<ContentPage.ImpressionAnalytics1> {

        /* renamed from: a, reason: collision with root package name */
        public static final ImpressionAnalytics1 f19677a = new ImpressionAnalytics1();
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
                return new ContentPage.ImpressionAnalytics1(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.ImpressionAnalytics1 value = (ContentPage.ImpressionAnalytics1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19568a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$ImpressionAnalytics2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ImpressionAnalytics2;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImpressionAnalytics2 implements Adapter<ContentPage.ImpressionAnalytics2> {

        /* renamed from: a, reason: collision with root package name */
        public static final ImpressionAnalytics2 f19678a = new ImpressionAnalytics2();
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
                return new ContentPage.ImpressionAnalytics2(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.ImpressionAnalytics2 value = (ContentPage.ImpressionAnalytics2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19569a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$ImpressionAnalytics3;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ImpressionAnalytics3;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImpressionAnalytics3 implements Adapter<ContentPage.ImpressionAnalytics3> {

        /* renamed from: a, reason: collision with root package name */
        public static final ImpressionAnalytics3 f19679a = new ImpressionAnalytics3();
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
                return new ContentPage.ImpressionAnalytics3(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.ImpressionAnalytics3 value = (ContentPage.ImpressionAnalytics3) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19570a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Item;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<ContentPage.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f19680a = new Item();
        public static final List b = CollectionsKt.Q("__typename");

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            ContentPage.OnPageCover onPageCoverA;
            ContentPage.OnUniversalInventoryContainer onUniversalInventoryContainerA;
            ContentPage.OnTitleSection onTitleSectionA;
            ContentPage.OnDownloadableAsset onDownloadableAssetA;
            ContentPage.OnParagraphTextItem onParagraphTextItemA;
            ContentPage.OnVerticalList onVerticalListA;
            ContentPage.OnHorizontalList onHorizontalListA;
            ContentPage.OnRecipeMethod onRecipeMethodA;
            ContentPage.OnInsetBanner onInsetBannerA;
            ContentPage.OnBasicCoreRowList onBasicCoreRowListA;
            ContentPage.OnVideo onVideoA;
            ContentPage.OnEditorialCarousel onEditorialCarouselA;
            ContentPage.OnEditorialBanner1 onEditorialBanner1A;
            ContentPage.OnSearchNavCard onSearchNavCardA;
            ContentPage.OnBasicCoreBroadcastBanner onBasicCoreBroadcastBannerA;
            ContentPage.OnButtonSection onButtonSectionA;
            ContentPage.OnGridList onGridListA;
            byte b2;
            ContentPage.OnInfoTile1 onInfoTile1A;
            ContentPage.OnChatEntryCardV3 onChatEntryCardV3A;
            ContentPage.OnCatalogueCard onCatalogueCardA;
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
            if (a.C(set2, set, null, str, BooleanExpressions.c("PageCover"))) {
                reader.o();
                onPageCoverA = OnPageCover.a(reader, customScalarAdapters);
            } else {
                onPageCoverA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("UniversalInventoryContainer"))) {
                reader.o();
                onUniversalInventoryContainerA = OnUniversalInventoryContainer.a(reader, customScalarAdapters);
            } else {
                onUniversalInventoryContainerA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("TitleSection"))) {
                reader.o();
                onTitleSectionA = OnTitleSection.a(reader, customScalarAdapters);
            } else {
                onTitleSectionA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("DownloadableAsset"))) {
                reader.o();
                onDownloadableAssetA = OnDownloadableAsset.a(reader, customScalarAdapters);
            } else {
                onDownloadableAssetA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ParagraphTextItem"))) {
                reader.o();
                onParagraphTextItemA = OnParagraphTextItem.a(reader, customScalarAdapters);
            } else {
                onParagraphTextItemA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("VerticalList"))) {
                reader.o();
                onVerticalListA = OnVerticalList.a(reader, customScalarAdapters);
            } else {
                onVerticalListA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HorizontalList"))) {
                reader.o();
                onHorizontalListA = OnHorizontalList.a(reader, customScalarAdapters);
            } else {
                onHorizontalListA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RecipeMethod"))) {
                reader.o();
                onRecipeMethodA = OnRecipeMethod.a(reader, customScalarAdapters);
            } else {
                onRecipeMethodA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("InsetBanner"))) {
                reader.o();
                onInsetBannerA = OnInsetBanner.a(reader, customScalarAdapters);
            } else {
                onInsetBannerA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("BasicCoreRowList"))) {
                reader.o();
                onBasicCoreRowListA = OnBasicCoreRowList.a(reader, customScalarAdapters);
            } else {
                onBasicCoreRowListA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("Video"))) {
                reader.o();
                onVideoA = OnVideo.a(reader, customScalarAdapters);
            } else {
                onVideoA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("EditorialCarousel"))) {
                reader.o();
                onEditorialCarouselA = OnEditorialCarousel.a(reader, customScalarAdapters);
            } else {
                onEditorialCarouselA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("EditorialBanner"))) {
                reader.o();
                onEditorialBanner1A = OnEditorialBanner1.a(reader, customScalarAdapters);
            } else {
                onEditorialBanner1A = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("SearchNavCard"))) {
                reader.o();
                onSearchNavCardA = OnSearchNavCard.a(reader, customScalarAdapters);
            } else {
                onSearchNavCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("BasicCoreBroadcastBanner"))) {
                reader.o();
                onBasicCoreBroadcastBannerA = OnBasicCoreBroadcastBanner.a(reader, customScalarAdapters);
            } else {
                onBasicCoreBroadcastBannerA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("ButtonSection"), BooleanExpressions.d("isButtonSectionEnabled")))) {
                reader.o();
                onButtonSectionA = OnButtonSection.a(reader, customScalarAdapters);
            } else {
                onButtonSectionA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("GridList"), BooleanExpressions.d("isSavedRecipesContentPageMigrationEnabled")))) {
                reader.o();
                onGridListA = OnGridList.a(reader, customScalarAdapters);
            } else {
                onGridListA = null;
            }
            ContentPage.OnGridList onGridList = onGridListA;
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("InfoTile"), BooleanExpressions.d("isInfoTileEnabled")))) {
                reader.o();
                onInfoTile1A = OnInfoTile1.a(reader, customScalarAdapters);
                b2 = false;
            } else {
                b2 = false;
                onInfoTile1A = null;
            }
            BooleanExpression.Element elementC = BooleanExpressions.c("ChatEntryCardV3");
            BooleanExpression.Element elementD = BooleanExpressions.d("includeChatEntryCard");
            byte b3 = b2;
            BooleanExpression[] booleanExpressionArr = new BooleanExpression[2];
            booleanExpressionArr[b3 == true ? 1 : 0] = elementC;
            booleanExpressionArr[1] = elementD;
            ContentPage.OnActionableCard1 onActionableCard1A = null;
            if (d.C(set2, set, null, str, BooleanExpressions.a(booleanExpressionArr))) {
                reader.o();
                onChatEntryCardV3A = OnChatEntryCardV3.a(reader, customScalarAdapters);
            } else {
                onChatEntryCardV3A = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CatalogueCard"))) {
                reader.o();
                onCatalogueCardA = OnCatalogueCard.a(reader, customScalarAdapters);
            } else {
                onCatalogueCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ActionableCard"))) {
                reader.o();
                onActionableCard1A = OnActionableCard1.a(reader, customScalarAdapters);
            }
            return new ContentPage.Item(str, onPageCoverA, onUniversalInventoryContainerA, onTitleSectionA, onDownloadableAssetA, onParagraphTextItemA, onVerticalListA, onHorizontalListA, onRecipeMethodA, onInsetBannerA, onBasicCoreRowListA, onVideoA, onEditorialCarouselA, onEditorialBanner1A, onSearchNavCardA, onBasicCoreBroadcastBannerA, onButtonSectionA, onGridList, onInfoTile1A, onChatEntryCardV3A, onCatalogueCardA, onActionableCard1A);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.Item value = (ContentPage.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19571a);
            ContentPage.OnPageCover onPageCover = value.b;
            if (onPageCover != null) {
                OnPageCover.b(writer, customScalarAdapters, onPageCover);
            }
            ContentPage.OnUniversalInventoryContainer onUniversalInventoryContainer = value.c;
            if (onUniversalInventoryContainer != null) {
                OnUniversalInventoryContainer.b(writer, customScalarAdapters, onUniversalInventoryContainer);
            }
            ContentPage.OnTitleSection onTitleSection = value.d;
            if (onTitleSection != null) {
                OnTitleSection.b(writer, customScalarAdapters, onTitleSection);
            }
            ContentPage.OnDownloadableAsset onDownloadableAsset = value.e;
            if (onDownloadableAsset != null) {
                OnDownloadableAsset.b(writer, customScalarAdapters, onDownloadableAsset);
            }
            ContentPage.OnParagraphTextItem onParagraphTextItem = value.f;
            if (onParagraphTextItem != null) {
                OnParagraphTextItem.b(writer, customScalarAdapters, onParagraphTextItem);
            }
            ContentPage.OnVerticalList onVerticalList = value.g;
            if (onVerticalList != null) {
                OnVerticalList.b(writer, customScalarAdapters, onVerticalList);
            }
            ContentPage.OnHorizontalList onHorizontalList = value.h;
            if (onHorizontalList != null) {
                OnHorizontalList.b(writer, customScalarAdapters, onHorizontalList);
            }
            ContentPage.OnRecipeMethod onRecipeMethod = value.i;
            if (onRecipeMethod != null) {
                OnRecipeMethod.b(writer, customScalarAdapters, onRecipeMethod);
            }
            ContentPage.OnInsetBanner onInsetBanner = value.j;
            if (onInsetBanner != null) {
                OnInsetBanner.b(writer, customScalarAdapters, onInsetBanner);
            }
            ContentPage.OnBasicCoreRowList onBasicCoreRowList = value.k;
            if (onBasicCoreRowList != null) {
                OnBasicCoreRowList.b(writer, customScalarAdapters, onBasicCoreRowList);
            }
            ContentPage.OnVideo onVideo = value.l;
            if (onVideo != null) {
                OnVideo.b(writer, customScalarAdapters, onVideo);
            }
            ContentPage.OnEditorialCarousel onEditorialCarousel = value.m;
            if (onEditorialCarousel != null) {
                OnEditorialCarousel.b(writer, customScalarAdapters, onEditorialCarousel);
            }
            ContentPage.OnEditorialBanner1 onEditorialBanner1 = value.n;
            if (onEditorialBanner1 != null) {
                OnEditorialBanner1.b(writer, customScalarAdapters, onEditorialBanner1);
            }
            ContentPage.OnSearchNavCard onSearchNavCard = value.o;
            if (onSearchNavCard != null) {
                OnSearchNavCard.b(writer, customScalarAdapters, onSearchNavCard);
            }
            ContentPage.OnBasicCoreBroadcastBanner onBasicCoreBroadcastBanner = value.p;
            if (onBasicCoreBroadcastBanner != null) {
                OnBasicCoreBroadcastBanner.b(writer, customScalarAdapters, onBasicCoreBroadcastBanner);
            }
            ContentPage.OnButtonSection onButtonSection = value.q;
            if (onButtonSection != null) {
                OnButtonSection.b(writer, customScalarAdapters, onButtonSection);
            }
            ContentPage.OnGridList onGridList = value.r;
            if (onGridList != null) {
                OnGridList.b(writer, customScalarAdapters, onGridList);
            }
            ContentPage.OnInfoTile1 onInfoTile1 = value.s;
            if (onInfoTile1 != null) {
                OnInfoTile1.b(writer, customScalarAdapters, onInfoTile1);
            }
            ContentPage.OnChatEntryCardV3 onChatEntryCardV3 = value.t;
            if (onChatEntryCardV3 != null) {
                OnChatEntryCardV3.b(writer, customScalarAdapters, onChatEntryCardV3);
            }
            ContentPage.OnCatalogueCard onCatalogueCard = value.u;
            if (onCatalogueCard != null) {
                OnCatalogueCard.b(writer, customScalarAdapters, onCatalogueCard);
            }
            ContentPage.OnActionableCard1 onActionableCard1 = value.v;
            if (onActionableCard1 != null) {
                OnActionableCard1.b(writer, customScalarAdapters, onActionableCard1);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$Item1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Item1;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item1 implements Adapter<ContentPage.Item1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item1 f19681a = new Item1();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            ContentPage.OnProductCard onProductCardA;
            ContentPage.OnRecipeSummaryCard onRecipeSummaryCardA;
            ContentPage.OnRecipeMoreCard onRecipeMoreCardA;
            ContentPage.OnNavRoundel onNavRoundelA;
            ContentPage.OnPill onPillA;
            ContentPage.OnContentCard onContentCardA;
            ContentPage.OnMoreCard onMoreCardA;
            ContentPage.OnProductCategoryTile onProductCategoryTileA;
            ContentPage.OnOfferCard onOfferCardA;
            ContentPage.OnQuickLinkCard onQuickLinkCardA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ContentPage.OnPromotionCard onPromotionCardA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductCard"))) {
                reader.o();
                onProductCardA = OnProductCard.a(reader, customScalarAdapters);
            } else {
                onProductCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RecipeSummaryCard"))) {
                reader.o();
                onRecipeSummaryCardA = OnRecipeSummaryCard.a(reader, customScalarAdapters);
            } else {
                onRecipeSummaryCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RecipeMoreCard"))) {
                reader.o();
                onRecipeMoreCardA = OnRecipeMoreCard.a(reader, customScalarAdapters);
            } else {
                onRecipeMoreCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("NavRoundel"))) {
                reader.o();
                onNavRoundelA = OnNavRoundel.a(reader, customScalarAdapters);
            } else {
                onNavRoundelA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("Pill"))) {
                reader.o();
                onPillA = OnPill.a(reader, customScalarAdapters);
            } else {
                onPillA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ContentCard"))) {
                reader.o();
                onContentCardA = OnContentCard.a(reader, customScalarAdapters);
            } else {
                onContentCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("MoreCard"))) {
                reader.o();
                onMoreCardA = OnMoreCard.a(reader, customScalarAdapters);
            } else {
                onMoreCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductCategoryTile"))) {
                reader.o();
                onProductCategoryTileA = OnProductCategoryTile.a(reader, customScalarAdapters);
            } else {
                onProductCategoryTileA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("OfferCard"))) {
                reader.o();
                onOfferCardA = OnOfferCard.a(reader, customScalarAdapters);
            } else {
                onOfferCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("QuickLinkCard"))) {
                reader.o();
                onQuickLinkCardA = OnQuickLinkCard.a(reader, customScalarAdapters);
            } else {
                onQuickLinkCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("PromotionCard"))) {
                reader.o();
                onPromotionCardA = OnPromotionCard.a(reader, customScalarAdapters);
            }
            return new ContentPage.Item1(str, onProductCardA, onRecipeSummaryCardA, onRecipeMoreCardA, onNavRoundelA, onPillA, onContentCardA, onMoreCardA, onProductCategoryTileA, onOfferCardA, onQuickLinkCardA, onPromotionCardA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.Item1 value = (ContentPage.Item1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19572a);
            ContentPage.OnProductCard onProductCard = value.b;
            if (onProductCard != null) {
                OnProductCard.b(writer, customScalarAdapters, onProductCard);
            }
            ContentPage.OnRecipeSummaryCard onRecipeSummaryCard = value.c;
            if (onRecipeSummaryCard != null) {
                OnRecipeSummaryCard.b(writer, customScalarAdapters, onRecipeSummaryCard);
            }
            ContentPage.OnRecipeMoreCard onRecipeMoreCard = value.d;
            if (onRecipeMoreCard != null) {
                OnRecipeMoreCard.b(writer, customScalarAdapters, onRecipeMoreCard);
            }
            ContentPage.OnNavRoundel onNavRoundel = value.e;
            if (onNavRoundel != null) {
                OnNavRoundel.b(writer, customScalarAdapters, onNavRoundel);
            }
            ContentPage.OnPill onPill = value.f;
            if (onPill != null) {
                OnPill.b(writer, customScalarAdapters, onPill);
            }
            ContentPage.OnContentCard onContentCard = value.g;
            if (onContentCard != null) {
                OnContentCard.b(writer, customScalarAdapters, onContentCard);
            }
            ContentPage.OnMoreCard onMoreCard = value.h;
            if (onMoreCard != null) {
                OnMoreCard.b(writer, customScalarAdapters, onMoreCard);
            }
            ContentPage.OnProductCategoryTile onProductCategoryTile = value.i;
            if (onProductCategoryTile != null) {
                OnProductCategoryTile.b(writer, customScalarAdapters, onProductCategoryTile);
            }
            ContentPage.OnOfferCard onOfferCard = value.j;
            if (onOfferCard != null) {
                OnOfferCard.b(writer, customScalarAdapters, onOfferCard);
            }
            ContentPage.OnQuickLinkCard onQuickLinkCard = value.k;
            if (onQuickLinkCard != null) {
                OnQuickLinkCard.b(writer, customScalarAdapters, onQuickLinkCard);
            }
            ContentPage.OnPromotionCard onPromotionCard = value.l;
            if (onPromotionCard != null) {
                OnPromotionCard.b(writer, customScalarAdapters, onPromotionCard);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$Item2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Item2;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item2 implements Adapter<ContentPage.Item2> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item2 f19682a = new Item2();
        public static final List b = CollectionsKt.R("title", "content", "methodImage");

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
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 != null) {
                return new ContentPage.Item2(str, str2, str3);
            }
            Assertions.a(reader, "content");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.Item2 value = (ContentPage.Item2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19573a);
            writer.F1("content");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("methodImage");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$LeadingAsset;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$LeadingAsset;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LeadingAsset implements Adapter<ContentPage.LeadingAsset> {

        /* renamed from: a, reason: collision with root package name */
        public static final LeadingAsset f19683a = new LeadingAsset();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ContentPage.OnHostedIcon onHostedIconA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("HostedIcon"))) {
                reader.o();
                onHostedIconA = OnHostedIcon.a(reader, customScalarAdapters);
            }
            return new ContentPage.LeadingAsset(str, onHostedIconA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.LeadingAsset value = (ContentPage.LeadingAsset) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19574a);
            ContentPage.OnHostedIcon onHostedIcon = value.b;
            if (onHostedIcon != null) {
                OnHostedIcon.b(writer, customScalarAdapters, onHostedIcon);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$LinkAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$LinkAction;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LinkAction implements Adapter<ContentPage.LinkAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final LinkAction f19684a = new LinkAction();
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
            ActionFields actionFieldsA = ActionFieldsImpl_ResponseAdapter.ActionFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new ContentPage.LinkAction(str, actionFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.LinkAction value = (ContentPage.LinkAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19575a);
            List list = ActionFieldsImpl_ResponseAdapter.ActionFields.f19526a;
            ActionFieldsImpl_ResponseAdapter.ActionFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$LinkCardAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$LinkCardAction;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LinkCardAction implements Adapter<ContentPage.LinkCardAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final LinkCardAction f19685a = new LinkCardAction();
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
            ActionFields actionFieldsA = ActionFieldsImpl_ResponseAdapter.ActionFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new ContentPage.LinkCardAction(str, actionFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.LinkCardAction value = (ContentPage.LinkCardAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19576a);
            List list = ActionFieldsImpl_ResponseAdapter.ActionFields.f19526a;
            ActionFieldsImpl_ResponseAdapter.ActionFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$LinkTextWithAlt;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$LinkTextWithAlt;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LinkTextWithAlt implements Adapter<ContentPage.LinkTextWithAlt> {

        /* renamed from: a, reason: collision with root package name */
        public static final LinkTextWithAlt f19686a = new LinkTextWithAlt();
        public static final List b = CollectionsKt.R("altText", TextBundle.TEXT_ENTRY);

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
                Assertions.a(reader, "altText");
                throw null;
            }
            if (str2 != null) {
                return new ContentPage.LinkTextWithAlt(str, str2);
            }
            Assertions.a(reader, TextBundle.TEXT_ENTRY);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.LinkTextWithAlt value = (ContentPage.LinkTextWithAlt) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("altText");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19577a);
            writer.F1(TextBundle.TEXT_ENTRY);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$Logo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Logo;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Logo implements Adapter<ContentPage.Logo> {

        /* renamed from: a, reason: collision with root package name */
        public static final Logo f19687a = new Logo();
        public static final List b = CollectionsKt.R("imageUrl", "altText");

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
                Assertions.a(reader, "imageUrl");
                throw null;
            }
            if (str2 != null) {
                return new ContentPage.Logo(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.Logo value = (ContentPage.Logo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("imageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19578a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$MoreCardAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$MoreCardAction;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MoreCardAction implements Adapter<ContentPage.MoreCardAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final MoreCardAction f19688a = new MoreCardAction();
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
            ActionFields actionFieldsA = ActionFieldsImpl_ResponseAdapter.ActionFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new ContentPage.MoreCardAction(str, actionFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.MoreCardAction value = (ContentPage.MoreCardAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19579a);
            List list = ActionFieldsImpl_ResponseAdapter.ActionFields.f19526a;
            ActionFieldsImpl_ResponseAdapter.ActionFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$NavRoundelAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$NavRoundelAction;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NavRoundelAction implements Adapter<ContentPage.NavRoundelAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final NavRoundelAction f19689a = new NavRoundelAction();
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
            ActionFields actionFieldsA = ActionFieldsImpl_ResponseAdapter.ActionFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new ContentPage.NavRoundelAction(str, actionFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.NavRoundelAction value = (ContentPage.NavRoundelAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19580a);
            List list = ActionFieldsImpl_ResponseAdapter.ActionFields.f19526a;
            ActionFieldsImpl_ResponseAdapter.ActionFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$NextBestAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$NextBestAction;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NextBestAction implements Adapter<ContentPage.NextBestAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final NextBestAction f19690a = new NextBestAction();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ContentPage.OnActionableCard onActionableCardA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("ActionableCard"))) {
                reader.o();
                onActionableCardA = OnActionableCard.a(reader, customScalarAdapters);
            }
            return new ContentPage.NextBestAction(str, onActionableCardA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.NextBestAction value = (ContentPage.NextBestAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19581a);
            ContentPage.OnActionableCard onActionableCard = value.b;
            if (onActionableCard != null) {
                OnActionableCard.b(writer, customScalarAdapters, onActionableCard);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnActionableCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnActionableCard;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnActionableCard implements Adapter<ContentPage.OnActionableCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19691a = CollectionsKt.R("__typename", "link", "image", "altText", "cardHeight", "analytics", "_excluded", "actionableCardImpressionAnalytics", "actionableCardClickAnalytics");

        public static ContentPage.OnActionableCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            CardHeight cardHeightA = null;
            TealiumAnalytics tealiumAnalytics = null;
            Boolean bool = null;
            ContentPage.ActionableCardImpressionAnalytics actionableCardImpressionAnalytics = null;
            ContentPage.ActionableCardClickAnalytics actionableCardClickAnalytics = null;
            while (true) {
                switch (reader.o2(f19691a)) {
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
                    case 7:
                        actionableCardImpressionAnalytics = (ContentPage.ActionableCardImpressionAnalytics) Adapters.b(Adapters.c(ActionableCardImpressionAnalytics.f19643a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        actionableCardClickAnalytics = (ContentPage.ActionableCardClickAnalytics) Adapters.b(Adapters.c(ActionableCardClickAnalytics.f19641a, true)).fromJson(reader, customScalarAdapters);
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
                            return new ContentPage.OnActionableCard(str, str2, str3, str4, cardHeightA, tealiumAnalytics, bool, actionableCardImpressionAnalytics, actionableCardClickAnalytics);
                        }
                        Assertions.a(reader, "cardHeight");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnActionableCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19582a);
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
            writer.F1("actionableCardImpressionAnalytics");
            Adapters.b(Adapters.c(ActionableCardImpressionAnalytics.f19643a, true)).toJson(writer, customScalarAdapters, value.h);
            writer.F1("actionableCardClickAnalytics");
            Adapters.b(Adapters.c(ActionableCardClickAnalytics.f19641a, true)).toJson(writer, customScalarAdapters, value.i);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnActionableCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnActionableCard1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnActionableCard1;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnActionableCard1 implements Adapter<ContentPage.OnActionableCard1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19692a = CollectionsKt.R("image", "altText", "cardHeight", "link", "_excluded", "analytics", "actionableCardImpressionAnalytics", "actionableCardClickAnalytics");

        public static ContentPage.OnActionableCard1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            CardHeight cardHeightA = null;
            String str3 = null;
            Boolean bool = null;
            TealiumAnalytics tealiumAnalytics = null;
            ContentPage.ActionableCardImpressionAnalytics1 actionableCardImpressionAnalytics1 = null;
            ContentPage.ActionableCardClickAnalytics1 actionableCardClickAnalytics1 = null;
            while (true) {
                switch (reader.o2(f19692a)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        cardHeightA = CardHeight_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    case 3:
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        tealiumAnalytics = (TealiumAnalytics) d.k(customScalarAdapters, au.com.woolworths.shop.graphql.type.TealiumAnalytics.f11963a, reader, customScalarAdapters);
                        break;
                    case 6:
                        actionableCardImpressionAnalytics1 = (ContentPage.ActionableCardImpressionAnalytics1) Adapters.b(Adapters.c(ActionableCardImpressionAnalytics1.f19644a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        actionableCardClickAnalytics1 = (ContentPage.ActionableCardClickAnalytics1) Adapters.b(Adapters.c(ActionableCardClickAnalytics1.f19642a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
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
                            return new ContentPage.OnActionableCard1(str, str2, cardHeightA, str3, bool, tealiumAnalytics, actionableCardImpressionAnalytics1, actionableCardClickAnalytics1);
                        }
                        Assertions.a(reader, "link");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnActionableCard1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("image");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19583a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("cardHeight");
            CardHeight_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1("link");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.e);
            writer.F1("analytics");
            Adapters.b(customScalarAdapters.e(au.com.woolworths.shop.graphql.type.TealiumAnalytics.f11963a)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("actionableCardImpressionAnalytics");
            Adapters.b(Adapters.c(ActionableCardImpressionAnalytics1.f19644a, true)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("actionableCardClickAnalytics");
            Adapters.b(Adapters.c(ActionableCardClickAnalytics1.f19642a, true)).toJson(writer, customScalarAdapters, value.h);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnActionableCard1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnBasicCoreBroadcastBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnBasicCoreBroadcastBanner;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnBasicCoreBroadcastBanner implements Adapter<ContentPage.OnBasicCoreBroadcastBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19693a = CollectionsKt.R("impressionAnalytics", "broadcastBannerDismissAnalytics", "broadcastBannerUI", "broadcastBannerAction", "broadcastBannerActionLabel", "broadcastBannerId", "broadcastBannerDismissible");

        public static ContentPage.OnBasicCoreBroadcastBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            ContentPage.ImpressionAnalytics2 impressionAnalytics2 = null;
            ContentPage.BroadcastBannerDismissAnalytics broadcastBannerDismissAnalytics = null;
            ContentPage.BroadcastBannerUI broadcastBannerUI = null;
            ContentPage.BroadcastBannerAction broadcastBannerAction = null;
            String str = null;
            String str2 = null;
            while (true) {
                switch (reader.o2(f19693a)) {
                    case 0:
                        bool = bool2;
                        impressionAnalytics2 = (ContentPage.ImpressionAnalytics2) Adapters.b(Adapters.c(ImpressionAnalytics2.f19678a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bool = bool2;
                        broadcastBannerDismissAnalytics = (ContentPage.BroadcastBannerDismissAnalytics) Adapters.b(Adapters.c(BroadcastBannerDismissAnalytics.f19653a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        bool = bool2;
                        broadcastBannerUI = (ContentPage.BroadcastBannerUI) Adapters.c(BroadcastBannerUI.f19654a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool = bool2;
                        broadcastBannerAction = (ContentPage.BroadcastBannerAction) Adapters.b(Adapters.c(BroadcastBannerAction.f19652a, true)).fromJson(reader, customScalarAdapters);
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
                            return new ContentPage.OnBasicCoreBroadcastBanner(impressionAnalytics2, broadcastBannerDismissAnalytics, broadcastBannerUI, broadcastBannerAction, str, str2, bool3.booleanValue());
                        }
                        Assertions.a(reader, "broadcastBannerDismissible");
                        throw null;
                }
                bool2 = bool;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnBasicCoreBroadcastBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("impressionAnalytics");
            Adapters.b(Adapters.c(ImpressionAnalytics2.f19678a, true)).toJson(writer, customScalarAdapters, value.f19584a);
            writer.F1("broadcastBannerDismissAnalytics");
            Adapters.b(Adapters.c(BroadcastBannerDismissAnalytics.f19653a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("broadcastBannerUI");
            Adapters.c(BroadcastBannerUI.f19654a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("broadcastBannerAction");
            Adapters.b(Adapters.c(BroadcastBannerAction.f19652a, true)).toJson(writer, customScalarAdapters, value.d);
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
            b(jsonWriter, customScalarAdapters, (ContentPage.OnBasicCoreBroadcastBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnBasicCoreRowList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnBasicCoreRowList;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnBasicCoreRowList implements Adapter<ContentPage.OnBasicCoreRowList> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19694a = CollectionsKt.R("basicCoreRowListSectionTitle", "basicCoreRowListItems", "basicCoreRowListAnalytics", "basicCoreRowListImpressionAnalytics");

        public static ContentPage.OnBasicCoreRowList a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            ContentPage.BasicCoreRowListAnalytics basicCoreRowListAnalytics = null;
            ContentPage.BasicCoreRowListImpressionAnalytics basicCoreRowListImpressionAnalytics = null;
            while (true) {
                int iO2 = reader.o2(f19694a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson = Adapters.a(Adapters.c(BasicCoreRowListItem.f19651a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    basicCoreRowListAnalytics = (ContentPage.BasicCoreRowListAnalytics) Adapters.b(Adapters.c(BasicCoreRowListAnalytics.f19649a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    basicCoreRowListImpressionAnalytics = (ContentPage.BasicCoreRowListImpressionAnalytics) Adapters.b(Adapters.c(BasicCoreRowListImpressionAnalytics.f19650a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new ContentPage.OnBasicCoreRowList(str, arrayListFromJson, basicCoreRowListAnalytics, basicCoreRowListImpressionAnalytics);
            }
            Assertions.a(reader, "basicCoreRowListItems");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnBasicCoreRowList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("basicCoreRowListSectionTitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.f19585a);
            writer.F1("basicCoreRowListItems");
            Adapters.a(Adapters.c(BasicCoreRowListItem.f19651a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("basicCoreRowListAnalytics");
            Adapters.b(Adapters.c(BasicCoreRowListAnalytics.f19649a, true)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("basicCoreRowListImpressionAnalytics");
            Adapters.b(Adapters.c(BasicCoreRowListImpressionAnalytics.f19650a, true)).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnBasicCoreRowList) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnButtonSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnButtonSection;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnButtonSection implements Adapter<ContentPage.OnButtonSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19695a = CollectionsKt.Q("buttonSectionButton");

        public static ContentPage.OnButtonSection a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ContentPage.ButtonSectionButton buttonSectionButton = null;
            while (reader.o2(f19695a) == 0) {
                buttonSectionButton = (ContentPage.ButtonSectionButton) Adapters.c(ButtonSectionButton.f19655a, true).fromJson(reader, customScalarAdapters);
            }
            if (buttonSectionButton != null) {
                return new ContentPage.OnButtonSection(buttonSectionButton);
            }
            Assertions.a(reader, "buttonSectionButton");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnButtonSection value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("buttonSectionButton");
            Adapters.c(ButtonSectionButton.f19655a, true).toJson(writer, customScalarAdapters, value.f19586a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnButtonSection) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnCatalogueCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnCatalogueCard;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCatalogueCard implements Adapter<ContentPage.OnCatalogueCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19696a = CollectionsKt.R("catalogueCardId", "title", "catalogueCardSubtitle", "imageLeft", "catalogueCardType", "clickAnalytics", "impressionAnalytics");

        public static ContentPage.OnCatalogueCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            CatalogueCardType catalogueCardType = null;
            ContentPage.ClickAnalytics clickAnalytics = null;
            ContentPage.ImpressionAnalytics3 impressionAnalytics3 = null;
            while (true) {
                switch (reader.o2(f19696a)) {
                    case 0:
                        str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        catalogueCardType = (CatalogueCardType) Adapters.b(CatalogueCardType_ResponseAdapter.f12046a).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        clickAnalytics = (ContentPage.ClickAnalytics) Adapters.b(Adapters.c(ClickAnalytics.f19657a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        impressionAnalytics3 = (ContentPage.ImpressionAnalytics3) Adapters.b(Adapters.c(ImpressionAnalytics3.f19679a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str2 == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str3 != null) {
                            return new ContentPage.OnCatalogueCard(str, str2, str3, str4, catalogueCardType, clickAnalytics, impressionAnalytics3);
                        }
                        Assertions.a(reader, "catalogueCardSubtitle");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnCatalogueCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("catalogueCardId");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f19587a);
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("catalogueCardSubtitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("imageLeft");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("catalogueCardType");
            Adapters.b(CatalogueCardType_ResponseAdapter.f12046a).toJson(writer, customScalarAdapters, value.e);
            writer.F1("clickAnalytics");
            Adapters.b(Adapters.c(ClickAnalytics.f19657a, true)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("impressionAnalytics");
            Adapters.b(Adapters.c(ImpressionAnalytics3.f19679a, true)).toJson(writer, customScalarAdapters, value.g);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnCatalogueCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnChatEntryCardV3;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnChatEntryCardV3;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnChatEntryCardV3 implements Adapter<ContentPage.OnChatEntryCardV3> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19697a = CollectionsKt.R("chatEntryCardTitle", "chatEntryCardShowBeta", "chatEntryCardSuggestedPrompts", "chatEntryCardAction");

        public static ContentPage.OnChatEntryCardV3 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Boolean bool = null;
            ArrayList arrayListFromJson = null;
            ContentPage.ChatEntryCardAction chatEntryCardAction = null;
            while (true) {
                int iO2 = reader.o2(f19697a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    chatEntryCardAction = (ContentPage.ChatEntryCardAction) Adapters.c(ChatEntryCardAction.f19656a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "chatEntryCardTitle");
                throw null;
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "chatEntryCardSuggestedPrompts");
                throw null;
            }
            if (chatEntryCardAction != null) {
                return new ContentPage.OnChatEntryCardV3(str, bool, arrayListFromJson, chatEntryCardAction);
            }
            Assertions.a(reader, "chatEntryCardAction");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnChatEntryCardV3 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("chatEntryCardTitle");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19588a);
            writer.F1("chatEntryCardShowBeta");
            Adapters.l.toJson(writer, customScalarAdapters, value.b);
            writer.F1("chatEntryCardSuggestedPrompts");
            Adapters.a(adapters$StringAdapter$1).toJson(writer, customScalarAdapters, value.c);
            writer.F1("chatEntryCardAction");
            Adapters.c(ChatEntryCardAction.f19656a, false).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnChatEntryCardV3) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnContentCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnContentCard;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnContentCard implements Adapter<ContentPage.OnContentCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19698a = CollectionsKt.R("contentCardId", "contentCardImageUrl", "contentCardTitle", "contentCardDescription", "contentCardAction", "contentCardFooter", "contentCardBrandImage", "contentCardIsVideoAvailable", "contentCardSize", "contentCardSponsoredText", "contentCardAnalytics");

        public static ContentPage.OnContentCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ContentPage.ContentCardAction1 contentCardAction1 = null;
            ContentPage.ContentCardFooter contentCardFooter = null;
            ContentPage.ContentCardBrandImage contentCardBrandImage = null;
            Boolean bool = null;
            ContentCardSize contentCardSize = null;
            String str5 = null;
            ContentPage.ContentCardAnalytics contentCardAnalytics = null;
            while (true) {
                switch (reader.o2(f19698a)) {
                    case 0:
                        str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        contentCardAction1 = (ContentPage.ContentCardAction1) Adapters.b(Adapters.c(ContentCardAction1.f19659a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        contentCardFooter = (ContentPage.ContentCardFooter) Adapters.b(Adapters.c(ContentCardFooter.f19662a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        contentCardBrandImage = (ContentPage.ContentCardBrandImage) Adapters.b(Adapters.c(ContentCardBrandImage.f19661a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        contentCardSize = (ContentCardSize) Adapters.b(ContentCardSize_ResponseAdapter.f12057a).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        contentCardAnalytics = (ContentPage.ContentCardAnalytics) Adapters.b(Adapters.c(ContentCardAnalytics.f19660a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str2 != null) {
                            return new ContentPage.OnContentCard(str, str2, str3, str4, contentCardAction1, contentCardFooter, contentCardBrandImage, bool, contentCardSize, str5, contentCardAnalytics);
                        }
                        Assertions.a(reader, "contentCardImageUrl");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnContentCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("contentCardId");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f19589a);
            writer.F1("contentCardImageUrl");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("contentCardTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("contentCardDescription");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("contentCardAction");
            Adapters.b(Adapters.c(ContentCardAction1.f19659a, true)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("contentCardFooter");
            Adapters.b(Adapters.c(ContentCardFooter.f19662a, false)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("contentCardBrandImage");
            Adapters.b(Adapters.c(ContentCardBrandImage.f19661a, false)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("contentCardIsVideoAvailable");
            Adapters.l.toJson(writer, customScalarAdapters, value.h);
            writer.F1("contentCardSize");
            Adapters.b(ContentCardSize_ResponseAdapter.f12057a).toJson(writer, customScalarAdapters, value.i);
            writer.F1("contentCardSponsoredText");
            nullableAdapter.toJson(writer, customScalarAdapters, value.j);
            writer.F1("contentCardAnalytics");
            Adapters.b(Adapters.c(ContentCardAnalytics.f19660a, true)).toJson(writer, customScalarAdapters, value.k);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnContentCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnCoreIcon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnCoreIcon;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCoreIcon implements Adapter<ContentPage.OnCoreIcon> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19699a = CollectionsKt.Q("__typename");

        public static ContentPage.OnCoreIcon a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19699a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            CoreIconFields coreIconFieldsA = CoreIconFieldsImpl_ResponseAdapter.CoreIconFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new ContentPage.OnCoreIcon(str, coreIconFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnCoreIcon value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19590a);
            List list = CoreIconFieldsImpl_ResponseAdapter.CoreIconFields.f19755a;
            CoreIconFieldsImpl_ResponseAdapter.CoreIconFields.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnCoreIcon) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnDownloadableAsset;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnDownloadableAsset;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnDownloadableAsset implements Adapter<ContentPage.OnDownloadableAsset> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19700a = CollectionsKt.R("assetType", "assetUrl", "assetWidth", "assetHeight", "fit", "alternativeText");

        public static ContentPage.OnDownloadableAsset a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            DownloadableAssetType downloadableAssetTypeA = null;
            String str = null;
            Integer num3 = null;
            DownloadableAssetFit downloadableAssetFit = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f19700a);
                if (iO2 != 0) {
                    if (iO2 == 1) {
                        num = num2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                    } else if (iO2 == 2) {
                        num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                    } else if (iO2 == 3) {
                        num = num2;
                        num3 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                    } else if (iO2 == 4) {
                        num = num2;
                        downloadableAssetFit = (DownloadableAssetFit) Adapters.b(DownloadableAssetFit_ResponseAdapter.f12070a).fromJson(reader, customScalarAdapters);
                    } else {
                        if (iO2 != 5) {
                            break;
                        }
                        num = num2;
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                    }
                    num2 = num;
                } else {
                    downloadableAssetTypeA = DownloadableAssetType_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            Integer num4 = num2;
            if (downloadableAssetTypeA == null) {
                Assertions.a(reader, "assetType");
                throw null;
            }
            if (str == null) {
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
                return new ContentPage.OnDownloadableAsset(downloadableAssetTypeA, str, iIntValue, num5.intValue(), downloadableAssetFit, str2);
            }
            Assertions.a(reader, "assetHeight");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnDownloadableAsset value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("assetType");
            DownloadableAssetType_ResponseAdapter.b(writer, customScalarAdapters, value.f19591a);
            writer.F1("assetUrl");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("assetWidth");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.c, adapters$IntAdapter$1, writer, customScalarAdapters, "assetHeight");
            d.y(value.d, adapters$IntAdapter$1, writer, customScalarAdapters, "fit");
            Adapters.b(DownloadableAssetFit_ResponseAdapter.f12070a).toJson(writer, customScalarAdapters, value.e);
            writer.F1("alternativeText");
            Adapters.i.toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnDownloadableAsset) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnEditorialBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnEditorialBanner;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnEditorialBanner implements Adapter<ContentPage.OnEditorialBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19701a = CollectionsKt.Q("__typename");

        public static ContentPage.OnEditorialBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19701a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            EditorialBanner editorialBannerA = EditorialBannerImpl_ResponseAdapter.EditorialBanner.a(reader, customScalarAdapters);
            if (str != null) {
                return new ContentPage.OnEditorialBanner(str, editorialBannerA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnEditorialBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19592a);
            List list = EditorialBannerImpl_ResponseAdapter.EditorialBanner.f19762a;
            EditorialBannerImpl_ResponseAdapter.EditorialBanner.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnEditorialBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnEditorialBanner1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnEditorialBanner1;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnEditorialBanner1 implements Adapter<ContentPage.OnEditorialBanner1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19702a = CollectionsKt.Q("__typename");

        public static ContentPage.OnEditorialBanner1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19702a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            EditorialBanner editorialBannerA = EditorialBannerImpl_ResponseAdapter.EditorialBanner.a(reader, customScalarAdapters);
            if (str != null) {
                return new ContentPage.OnEditorialBanner1(str, editorialBannerA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnEditorialBanner1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19593a);
            List list = EditorialBannerImpl_ResponseAdapter.EditorialBanner.f19762a;
            EditorialBannerImpl_ResponseAdapter.EditorialBanner.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnEditorialBanner1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnEditorialCarousel;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnEditorialCarousel;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnEditorialCarousel implements Adapter<ContentPage.OnEditorialCarousel> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19703a = CollectionsKt.Q("editorialCarouselItems");

        public static ContentPage.OnEditorialCarousel a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(f19703a) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(EditorialCarouselItem.f19664a, true)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new ContentPage.OnEditorialCarousel(arrayListFromJson);
            }
            Assertions.a(reader, "editorialCarouselItems");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnEditorialCarousel value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("editorialCarouselItems");
            Adapters.a(Adapters.c(EditorialCarouselItem.f19664a, true)).toJson(writer, customScalarAdapters, value.f19594a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnEditorialCarousel) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnFullWidthContentCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnFullWidthContentCard;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnFullWidthContentCard implements Adapter<ContentPage.OnFullWidthContentCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19704a = CollectionsKt.R("contentCardId", "contentCardImageUrl", "contentCardTitle", "contentCardDescription", "contentCardIsVideoAvailable", "contentCardAction");

        public static ContentPage.OnFullWidthContentCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Boolean bool = null;
            ContentPage.ContentCardAction contentCardAction = null;
            while (true) {
                int iO2 = reader.o2(f19704a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    contentCardAction = (ContentPage.ContentCardAction) Adapters.b(Adapters.c(ContentCardAction.f19658a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 != null) {
                return new ContentPage.OnFullWidthContentCard(str, str2, str3, str4, bool, contentCardAction);
            }
            Assertions.a(reader, "contentCardImageUrl");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnFullWidthContentCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("contentCardId");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f19595a);
            writer.F1("contentCardImageUrl");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("contentCardTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("contentCardDescription");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("contentCardIsVideoAvailable");
            Adapters.l.toJson(writer, customScalarAdapters, value.e);
            writer.F1("contentCardAction");
            Adapters.b(Adapters.c(ContentCardAction.f19658a, true)).toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnFullWidthContentCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnGridList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnGridList;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnGridList implements Adapter<ContentPage.OnGridList> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19705a = CollectionsKt.R("gridListItemCount", "gridListAnalytics", "gridListImpressionAnalytics", "gridListItems");

        public static ContentPage.OnGridList a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            ContentPage.GridListAnalytics gridListAnalytics = null;
            ContentPage.GridListImpressionAnalytics gridListImpressionAnalytics = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f19705a);
                if (iO2 == 0) {
                    num = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    gridListAnalytics = (ContentPage.GridListAnalytics) Adapters.b(Adapters.c(GridListAnalytics.f19667a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    gridListImpressionAnalytics = (ContentPage.GridListImpressionAnalytics) Adapters.b(Adapters.c(GridListImpressionAnalytics.f19668a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(GridListItem.f19669a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new ContentPage.OnGridList(num, gridListAnalytics, gridListImpressionAnalytics, arrayListFromJson);
            }
            Assertions.a(reader, "gridListItems");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnGridList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("gridListItemCount");
            Adapters.k.toJson(writer, customScalarAdapters, value.f19596a);
            writer.F1("gridListAnalytics");
            Adapters.b(Adapters.c(GridListAnalytics.f19667a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("gridListImpressionAnalytics");
            Adapters.b(Adapters.c(GridListImpressionAnalytics.f19668a, true)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("gridListItems");
            Adapters.a(Adapters.c(GridListItem.f19669a, true)).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnGridList) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnHorizontalList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnHorizontalList;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHorizontalList implements Adapter<ContentPage.OnHorizontalList> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19706a = CollectionsKt.R("horizontalListTrailingLink", "horizontalListAnalytics", "horizontalListImpressionAnalytics", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "deepLink", "actionTitle", "actionPath", "items");

        public static ContentPage.OnHorizontalList a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ContentPage.HorizontalListTrailingLink horizontalListTrailingLink = null;
            ContentPage.HorizontalListAnalytics horizontalListAnalytics = null;
            ContentPage.HorizontalListImpressionAnalytics horizontalListImpressionAnalytics = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                switch (reader.o2(f19706a)) {
                    case 0:
                        horizontalListTrailingLink = (ContentPage.HorizontalListTrailingLink) Adapters.b(Adapters.c(HorizontalListTrailingLink.f19674a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        horizontalListAnalytics = (ContentPage.HorizontalListAnalytics) Adapters.b(Adapters.c(HorizontalListAnalytics.f19672a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        horizontalListImpressionAnalytics = (ContentPage.HorizontalListImpressionAnalytics) Adapters.b(Adapters.c(HorizontalListImpressionAnalytics.f19673a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        arrayListFromJson = Adapters.a(Adapters.c(Item1.f19681a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (arrayListFromJson != null) {
                            return new ContentPage.OnHorizontalList(horizontalListTrailingLink, horizontalListAnalytics, horizontalListImpressionAnalytics, str, str2, str3, str4, str5, arrayListFromJson);
                        }
                        Assertions.a(reader, "items");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnHorizontalList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("horizontalListTrailingLink");
            Adapters.b(Adapters.c(HorizontalListTrailingLink.f19674a, false)).toJson(writer, customScalarAdapters, value.f19597a);
            writer.F1("horizontalListAnalytics");
            Adapters.b(Adapters.c(HorizontalListAnalytics.f19672a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("horizontalListImpressionAnalytics");
            Adapters.b(Adapters.c(HorizontalListImpressionAnalytics.f19673a, true)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.d);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("deepLink");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
            writer.F1("actionTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.g);
            writer.F1("actionPath");
            nullableAdapter.toJson(writer, customScalarAdapters, value.h);
            writer.F1("items");
            Adapters.a(Adapters.c(Item1.f19681a, true)).toJson(writer, customScalarAdapters, value.i);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnHorizontalList) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnHostedIcon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnHostedIcon;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHostedIcon implements Adapter<ContentPage.OnHostedIcon> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19707a = CollectionsKt.Q("__typename");

        public static ContentPage.OnHostedIcon a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19707a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            HostedIconFields hostedIconFieldsA = HostedIconFieldsImpl_ResponseAdapter.HostedIconFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new ContentPage.OnHostedIcon(str, hostedIconFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnHostedIcon value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19598a);
            List list = HostedIconFieldsImpl_ResponseAdapter.HostedIconFields.f19769a;
            HostedIconFieldsImpl_ResponseAdapter.HostedIconFields.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnHostedIcon) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnHostedIcon1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnHostedIcon1;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHostedIcon1 implements Adapter<ContentPage.OnHostedIcon1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19708a = CollectionsKt.Q("__typename");

        public static ContentPage.OnHostedIcon1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19708a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            HostedIconFields hostedIconFieldsA = HostedIconFieldsImpl_ResponseAdapter.HostedIconFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new ContentPage.OnHostedIcon1(str, hostedIconFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnHostedIcon1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19599a);
            List list = HostedIconFieldsImpl_ResponseAdapter.HostedIconFields.f19769a;
            HostedIconFieldsImpl_ResponseAdapter.HostedIconFields.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnHostedIcon1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnInfoTile;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnInfoTile;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnInfoTile implements Adapter<ContentPage.OnInfoTile> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19709a = CollectionsKt.Q("__typename");

        public static ContentPage.OnInfoTile a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19709a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            InfoTileFields infoTileFieldsA = InfoTileFieldsImpl_ResponseAdapter.InfoTileFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new ContentPage.OnInfoTile(str, infoTileFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnInfoTile value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19600a);
            List list = InfoTileFieldsImpl_ResponseAdapter.InfoTileFields.f19780a;
            InfoTileFieldsImpl_ResponseAdapter.InfoTileFields.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnInfoTile) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnInfoTile1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnInfoTile1;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnInfoTile1 implements Adapter<ContentPage.OnInfoTile1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19710a = CollectionsKt.Q("__typename");

        public static ContentPage.OnInfoTile1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19710a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            InfoTileFields infoTileFieldsA = InfoTileFieldsImpl_ResponseAdapter.InfoTileFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new ContentPage.OnInfoTile1(str, infoTileFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnInfoTile1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19601a);
            List list = InfoTileFieldsImpl_ResponseAdapter.InfoTileFields.f19780a;
            InfoTileFieldsImpl_ResponseAdapter.InfoTileFields.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnInfoTile1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnInsetBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnInsetBanner;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnInsetBanner implements Adapter<ContentPage.OnInsetBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19711a = CollectionsKt.R("displayType", "message", "bannerTitle", UrlHandler.ACTION);

        public static ContentPage.OnInsetBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            String str = null;
            String str2 = null;
            ContentPage.Action1 action1 = null;
            while (true) {
                int iO2 = reader.o2(f19711a);
                if (iO2 == 0) {
                    insetBannerDisplayTypeA = InsetBannerDisplayType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    action1 = (ContentPage.Action1) Adapters.b(Adapters.c(Action1.f19638a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerDisplayTypeA == null) {
                Assertions.a(reader, "displayType");
                throw null;
            }
            if (str != null) {
                return new ContentPage.OnInsetBanner(insetBannerDisplayTypeA, str, str2, action1);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnInsetBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.f19602a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("bannerTitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1(UrlHandler.ACTION);
            Adapters.b(Adapters.c(Action1.f19638a, false)).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnInsetBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnMoreCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnMoreCard;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnMoreCard implements Adapter<ContentPage.OnMoreCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19712a = CollectionsKt.R("moreCardStyle", "moreCardAction");

        public static ContentPage.OnMoreCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            MoreCardStyle moreCardStyleA = null;
            ContentPage.MoreCardAction moreCardAction = null;
            while (true) {
                int iO2 = reader.o2(f19712a);
                if (iO2 == 0) {
                    moreCardStyleA = MoreCardStyle_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    moreCardAction = (ContentPage.MoreCardAction) Adapters.c(MoreCardAction.f19688a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (moreCardStyleA == null) {
                Assertions.a(reader, "moreCardStyle");
                throw null;
            }
            if (moreCardAction != null) {
                return new ContentPage.OnMoreCard(moreCardStyleA, moreCardAction);
            }
            Assertions.a(reader, "moreCardAction");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnMoreCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("moreCardStyle");
            writer.v0(value.f19603a.d);
            writer.F1("moreCardAction");
            Adapters.c(MoreCardAction.f19688a, true).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnMoreCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnNavRoundel;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnNavRoundel;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnNavRoundel implements Adapter<ContentPage.OnNavRoundel> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19713a = CollectionsKt.R("navRoundelId", "navRoundelImageUrl", "navRoundelTitle", "navRoundelAction");

        public static ContentPage.OnNavRoundel a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            ContentPage.NavRoundelAction navRoundelAction = null;
            while (true) {
                int iO2 = reader.o2(f19713a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    navRoundelAction = (ContentPage.NavRoundelAction) Adapters.b(Adapters.c(NavRoundelAction.f19689a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 != null) {
                return new ContentPage.OnNavRoundel(str, str2, str3, navRoundelAction);
            }
            Assertions.a(reader, "navRoundelImageUrl");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnNavRoundel value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("navRoundelId");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f19604a);
            writer.F1("navRoundelImageUrl");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("navRoundelTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("navRoundelAction");
            Adapters.b(Adapters.c(NavRoundelAction.f19689a, true)).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnNavRoundel) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnOfferCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnOfferCard;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnOfferCard implements Adapter<ContentPage.OnOfferCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19714a = CollectionsKt.Q("__typename");

        public static ContentPage.OnOfferCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19714a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            OfferCard offerCardA = OfferCardImpl_ResponseAdapter.OfferCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new ContentPage.OnOfferCard(str, offerCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnOfferCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19605a);
            List list = OfferCardImpl_ResponseAdapter.OfferCard.f10194a;
            OfferCardImpl_ResponseAdapter.OfferCard.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnOfferCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnPageCover;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnPageCover;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPageCover implements Adapter<ContentPage.OnPageCover> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19715a = CollectionsKt.R("__typename", "pageCoverContentFormat", "pageCoverContentAlignment", "pageCoverContentTheme", "pageCoverPrimaryImage", "pageCoverPrimaryImagePosition", "pageCoverLogos", "pageCoverTitle", "pageCoverTitleSize", "pageCoverSubTitle");

        public static ContentPage.OnPageCover a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            PageCoverContentFormat pageCoverContentFormatA = null;
            PageCoverContentAlignment pageCoverContentAlignmentA = null;
            ContentPage.PageCoverContentTheme pageCoverContentTheme = null;
            ContentPage.PageCoverPrimaryImage pageCoverPrimaryImage = null;
            PageCoverImagePosition pageCoverImagePosition = null;
            List list = null;
            String str2 = null;
            PageCoverTitleTextSize pageCoverTitleTextSize = null;
            String str3 = null;
            while (true) {
                switch (reader.o2(f19715a)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        pageCoverContentFormatA = PageCoverContentFormat_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    case 2:
                        pageCoverContentAlignmentA = PageCoverContentAlignment_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    case 3:
                        pageCoverContentTheme = (ContentPage.PageCoverContentTheme) Adapters.c(PageCoverContentTheme.f19733a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        pageCoverPrimaryImage = (ContentPage.PageCoverPrimaryImage) Adapters.b(Adapters.c(PageCoverPrimaryImage.f19735a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        pageCoverImagePosition = (PageCoverImagePosition) Adapters.b(PageCoverImagePosition_ResponseAdapter.f12094a).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        list = (List) Adapters.b(Adapters.a(Adapters.c(PageCoverLogo.f19734a, false))).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        pageCoverTitleTextSize = (PageCoverTitleTextSize) Adapters.b(PageCoverTitleTextSize_ResponseAdapter.f12095a).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "__typename");
                            throw null;
                        }
                        if (pageCoverContentFormatA == null) {
                            Assertions.a(reader, "pageCoverContentFormat");
                            throw null;
                        }
                        if (pageCoverContentAlignmentA == null) {
                            Assertions.a(reader, "pageCoverContentAlignment");
                            throw null;
                        }
                        if (pageCoverContentTheme != null) {
                            return new ContentPage.OnPageCover(str, pageCoverContentFormatA, pageCoverContentAlignmentA, pageCoverContentTheme, pageCoverPrimaryImage, pageCoverImagePosition, list, str2, pageCoverTitleTextSize, str3);
                        }
                        Assertions.a(reader, "pageCoverContentTheme");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnPageCover value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19606a);
            writer.F1("pageCoverContentFormat");
            writer.v0(value.b.d);
            writer.F1("pageCoverContentAlignment");
            writer.v0(value.c.d);
            writer.F1("pageCoverContentTheme");
            Adapters.c(PageCoverContentTheme.f19733a, false).toJson(writer, customScalarAdapters, value.d);
            writer.F1("pageCoverPrimaryImage");
            Adapters.b(Adapters.c(PageCoverPrimaryImage.f19735a, false)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("pageCoverPrimaryImagePosition");
            Adapters.b(PageCoverImagePosition_ResponseAdapter.f12094a).toJson(writer, customScalarAdapters, value.f);
            writer.F1("pageCoverLogos");
            Adapters.b(Adapters.a(Adapters.c(PageCoverLogo.f19734a, false))).toJson(writer, customScalarAdapters, value.g);
            writer.F1("pageCoverTitle");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.h);
            writer.F1("pageCoverTitleSize");
            Adapters.b(PageCoverTitleTextSize_ResponseAdapter.f12095a).toJson(writer, customScalarAdapters, value.i);
            writer.F1("pageCoverSubTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.j);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnPageCover) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnParagraphTextItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnParagraphTextItem;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnParagraphTextItem implements Adapter<ContentPage.OnParagraphTextItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19716a = CollectionsKt.R("content", "type");

        public static ContentPage.OnParagraphTextItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ParagraphTextItemType paragraphTextItemTypeA = null;
            while (true) {
                int iO2 = reader.o2(f19716a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    paragraphTextItemTypeA = ParagraphTextItemType_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "content");
                throw null;
            }
            if (paragraphTextItemTypeA != null) {
                return new ContentPage.OnParagraphTextItem(paragraphTextItemTypeA, str);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnParagraphTextItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("content");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19607a);
            writer.F1("type");
            ParagraphTextItemType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnParagraphTextItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnPill;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnPill;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPill implements Adapter<ContentPage.OnPill> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19717a = CollectionsKt.R("pillText", "pillAction");

        public static ContentPage.OnPill a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ContentPage.PillAction pillAction = null;
            while (true) {
                int iO2 = reader.o2(f19717a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    pillAction = (ContentPage.PillAction) Adapters.c(PillAction.f19736a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "pillText");
                throw null;
            }
            if (pillAction != null) {
                return new ContentPage.OnPill(str, pillAction);
            }
            Assertions.a(reader, "pillAction");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnPill value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("pillText");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19608a);
            writer.F1("pillAction");
            Adapters.c(PillAction.f19736a, true).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnPill) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnProductCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnProductCard;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductCard implements Adapter<ContentPage.OnProductCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19718a = CollectionsKt.Q("__typename");

        public static ContentPage.OnProductCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19718a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new ContentPage.OnProductCard(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnProductCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19609a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnProductCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnProductCategoryTile;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnProductCategoryTile;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductCategoryTile implements Adapter<ContentPage.OnProductCategoryTile> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19719a = CollectionsKt.R("productCategoryTileImageUrl", "productCategoryTileLabel", "productCategoryTileAction");

        public static ContentPage.OnProductCategoryTile a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ContentPage.ProductCategoryTileAction productCategoryTileAction = null;
            while (true) {
                int iO2 = reader.o2(f19719a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    productCategoryTileAction = (ContentPage.ProductCategoryTileAction) Adapters.c(ProductCategoryTileAction.f19738a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "productCategoryTileImageUrl");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "productCategoryTileLabel");
                throw null;
            }
            if (productCategoryTileAction != null) {
                return new ContentPage.OnProductCategoryTile(str, str2, productCategoryTileAction);
            }
            Assertions.a(reader, "productCategoryTileAction");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnProductCategoryTile value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productCategoryTileImageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19610a);
            writer.F1("productCategoryTileLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("productCategoryTileAction");
            Adapters.c(ProductCategoryTileAction.f19738a, true).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnProductCategoryTile) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnPromotionCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnPromotionCard;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPromotionCard implements Adapter<ContentPage.OnPromotionCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19720a = CollectionsKt.R("promotionCardProduct", "promotionCardOfferId", "analytics", "impressionAnalytics");

        public static ContentPage.OnPromotionCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ContentPage.PromotionCardProduct promotionCardProduct = null;
            String str = null;
            ContentPage.Analytics1 analytics1 = null;
            ContentPage.ImpressionAnalytics1 impressionAnalytics1 = null;
            while (true) {
                int iO2 = reader.o2(f19720a);
                if (iO2 == 0) {
                    promotionCardProduct = (ContentPage.PromotionCardProduct) Adapters.c(PromotionCardProduct.f19739a, true).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    analytics1 = (ContentPage.Analytics1) Adapters.b(Adapters.c(Analytics1.f19646a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    impressionAnalytics1 = (ContentPage.ImpressionAnalytics1) Adapters.b(Adapters.c(ImpressionAnalytics1.f19677a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (promotionCardProduct != null) {
                return new ContentPage.OnPromotionCard(promotionCardProduct, str, analytics1, impressionAnalytics1);
            }
            Assertions.a(reader, "promotionCardProduct");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnPromotionCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("promotionCardProduct");
            Adapters.c(PromotionCardProduct.f19739a, true).toJson(writer, customScalarAdapters, value.f19611a);
            writer.F1("promotionCardOfferId");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics1.f19646a, true)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("impressionAnalytics");
            Adapters.b(Adapters.c(ImpressionAnalytics1.f19677a, true)).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnPromotionCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnQuickLinkCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnQuickLinkCard;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnQuickLinkCard implements Adapter<ContentPage.OnQuickLinkCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19721a = CollectionsKt.R("__typename", "linkCardTitle", "linkCardSubtitle", "linkCardImage", "linkCardAction", "isQuickLinkView");

        public static ContentPage.OnQuickLinkCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ContentPage.LinkCardAction linkCardAction = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(f19721a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    linkCardAction = (ContentPage.LinkCardAction) Adapters.c(LinkCardAction.f19685a, true).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "linkCardTitle");
                throw null;
            }
            if (linkCardAction != null) {
                return new ContentPage.OnQuickLinkCard(str, str2, str3, str4, linkCardAction, bool);
            }
            Assertions.a(reader, "linkCardAction");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnQuickLinkCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19612a);
            writer.F1("linkCardTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("linkCardSubtitle");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("linkCardImage");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("linkCardAction");
            Adapters.c(LinkCardAction.f19685a, true).toJson(writer, customScalarAdapters, value.e);
            writer.F1("isQuickLinkView");
            Adapters.l.toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnQuickLinkCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnRecipeMethod;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnRecipeMethod;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRecipeMethod implements Adapter<ContentPage.OnRecipeMethod> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19722a = CollectionsKt.R("panelTitle", "caption", "items", "disclaimer");

        public static ContentPage.OnRecipeMethod a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(f19722a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson = Adapters.a(Adapters.c(Item2.f19682a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new ContentPage.OnRecipeMethod(str, str2, str3, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnRecipeMethod value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("panelTitle");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f19613a);
            writer.F1("caption");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("items");
            Adapters.a(Adapters.c(Item2.f19682a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("disclaimer");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnRecipeMethod) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnRecipeMoreCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnRecipeMoreCard;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRecipeMoreCard implements Adapter<ContentPage.OnRecipeMoreCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19723a = CollectionsKt.Q("actionMetadata");

        public static ContentPage.OnRecipeMoreCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(f19723a) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(ActionMetadatum.f19640a, true)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new ContentPage.OnRecipeMoreCard(arrayListFromJson);
            }
            Assertions.a(reader, "actionMetadata");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnRecipeMoreCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("actionMetadata");
            Adapters.a(Adapters.c(ActionMetadatum.f19640a, true)).toJson(writer, customScalarAdapters, value.f19614a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnRecipeMoreCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnRecipeSource;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnRecipeSource;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRecipeSource implements Adapter<ContentPage.OnRecipeSource> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19724a = CollectionsKt.Q("source");

        public static ContentPage.OnRecipeSource a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19724a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new ContentPage.OnRecipeSource(str);
            }
            Assertions.a(reader, "source");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnRecipeSource value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("source");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19615a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnRecipeSource) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnRecipeSummaryCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnRecipeSummaryCard;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRecipeSummaryCard implements Adapter<ContentPage.OnRecipeSummaryCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19725a = CollectionsKt.Q("__typename");

        public static ContentPage.OnRecipeSummaryCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19725a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            RecipeSummaryCardFragment recipeSummaryCardFragmentA = RecipeSummaryCardFragmentImpl_ResponseAdapter.RecipeSummaryCardFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new ContentPage.OnRecipeSummaryCard(str, recipeSummaryCardFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnRecipeSummaryCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19616a);
            List list = RecipeSummaryCardFragmentImpl_ResponseAdapter.RecipeSummaryCardFragment.f10207a;
            RecipeSummaryCardFragmentImpl_ResponseAdapter.RecipeSummaryCardFragment.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnRecipeSummaryCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnRecipeSummaryCard1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnRecipeSummaryCard1;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRecipeSummaryCard1 implements Adapter<ContentPage.OnRecipeSummaryCard1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19726a = CollectionsKt.Q("__typename");

        public static ContentPage.OnRecipeSummaryCard1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19726a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            RecipeSummaryCardFragment recipeSummaryCardFragmentA = RecipeSummaryCardFragmentImpl_ResponseAdapter.RecipeSummaryCardFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new ContentPage.OnRecipeSummaryCard1(str, recipeSummaryCardFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnRecipeSummaryCard1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19617a);
            List list = RecipeSummaryCardFragmentImpl_ResponseAdapter.RecipeSummaryCardFragment.f10207a;
            RecipeSummaryCardFragmentImpl_ResponseAdapter.RecipeSummaryCardFragment.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnRecipeSummaryCard1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnRecipeTagList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnRecipeTagList;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRecipeTagList implements Adapter<ContentPage.OnRecipeTagList> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19727a = CollectionsKt.Q(k.a.g);

        public static ContentPage.OnRecipeTagList a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(f19727a) == 0) {
                arrayListFromJson = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new ContentPage.OnRecipeTagList(arrayListFromJson);
            }
            Assertions.a(reader, k.a.g);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnRecipeTagList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(k.a.g);
            Adapters.a(Adapters.f13493a).toJson(writer, customScalarAdapters, value.f19618a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnRecipeTagList) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnSearchNavCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnSearchNavCard;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnSearchNavCard implements Adapter<ContentPage.OnSearchNavCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19728a = CollectionsKt.R("searchNavCardPlaceholderText", "searchNavCardAction");

        public static ContentPage.OnSearchNavCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ContentPage.SearchNavCardAction searchNavCardAction = null;
            while (true) {
                int iO2 = reader.o2(f19728a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    searchNavCardAction = (ContentPage.SearchNavCardAction) Adapters.c(SearchNavCardAction.f19741a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (searchNavCardAction != null) {
                return new ContentPage.OnSearchNavCard(str, searchNavCardAction);
            }
            Assertions.a(reader, "searchNavCardAction");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnSearchNavCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("searchNavCardPlaceholderText");
            Adapters.i.toJson(writer, customScalarAdapters, value.f19619a);
            writer.F1("searchNavCardAction");
            Adapters.c(SearchNavCardAction.f19741a, true).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnSearchNavCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnTitleSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnTitleSection;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnTitleSection implements Adapter<ContentPage.OnTitleSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19729a = CollectionsKt.R("titleSectionType", "titleSectionText");

        public static ContentPage.OnTitleSection a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            TitleSectionTypes titleSectionTypesA = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(f19729a);
                if (iO2 == 0) {
                    titleSectionTypesA = TitleSectionTypes_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (titleSectionTypesA == null) {
                Assertions.a(reader, "titleSectionType");
                throw null;
            }
            if (str != null) {
                return new ContentPage.OnTitleSection(titleSectionTypesA, str);
            }
            Assertions.a(reader, "titleSectionText");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnTitleSection value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("titleSectionType");
            TitleSectionTypes_ResponseAdapter.b(writer, customScalarAdapters, value.f19620a);
            writer.F1("titleSectionText");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnTitleSection) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnUniversalInventoryContainer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnUniversalInventoryContainer;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnUniversalInventoryContainer implements Adapter<ContentPage.OnUniversalInventoryContainer> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19730a = CollectionsKt.R("googleAdBannerCard", "nextBestAction");

        public static ContentPage.OnUniversalInventoryContainer a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ContentPage.GoogleAdBannerCard googleAdBannerCard = null;
            ContentPage.NextBestAction nextBestAction = null;
            while (true) {
                int iO2 = reader.o2(f19730a);
                if (iO2 == 0) {
                    googleAdBannerCard = (ContentPage.GoogleAdBannerCard) Adapters.b(Adapters.c(GoogleAdBannerCard.f19666a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new ContentPage.OnUniversalInventoryContainer(googleAdBannerCard, nextBestAction);
                    }
                    nextBestAction = (ContentPage.NextBestAction) Adapters.b(Adapters.c(NextBestAction.f19690a, true)).fromJson(reader, customScalarAdapters);
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnUniversalInventoryContainer value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("googleAdBannerCard");
            Adapters.b(Adapters.c(GoogleAdBannerCard.f19666a, false)).toJson(writer, customScalarAdapters, value.f19621a);
            writer.F1("nextBestAction");
            Adapters.b(Adapters.c(NextBestAction.f19690a, true)).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnUniversalInventoryContainer) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnVerticalList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnVerticalList;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnVerticalList implements Adapter<ContentPage.OnVerticalList> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19731a = CollectionsKt.R("verticalListTitle", "verticalListSubtitle", "verticalListItems", "verticalListAction");

        public static ContentPage.OnVerticalList a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            ContentPage.VerticalListAction verticalListAction = null;
            while (true) {
                int iO2 = reader.o2(f19731a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson = Adapters.a(Adapters.c(VerticalListItem.f19744a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    verticalListAction = (ContentPage.VerticalListAction) Adapters.b(Adapters.c(VerticalListAction.f19743a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new ContentPage.OnVerticalList(str, str2, arrayListFromJson, verticalListAction);
            }
            Assertions.a(reader, "verticalListItems");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnVerticalList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("verticalListTitle");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f19622a);
            writer.F1("verticalListSubtitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("verticalListItems");
            Adapters.a(Adapters.c(VerticalListItem.f19744a, true)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("verticalListAction");
            Adapters.b(Adapters.c(VerticalListAction.f19743a, false)).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnVerticalList) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$OnVideo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnVideo;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnVideo implements Adapter<ContentPage.OnVideo> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19732a = CollectionsKt.R("url", "title", "thumbnail", "duration", "id");

        public static ContentPage.OnVideo a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (true) {
                int iO2 = reader.o2(f19732a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
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
                Assertions.a(reader, "url");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "thumbnail");
                throw null;
            }
            if (str4 != null) {
                return new ContentPage.OnVideo(str, str2, str3, str4, str5);
            }
            Assertions.a(reader, "duration");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ContentPage.OnVideo value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19623a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("thumbnail");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("duration");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ContentPage.OnVideo) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$PageCoverContentTheme;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$PageCoverContentTheme;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PageCoverContentTheme implements Adapter<ContentPage.PageCoverContentTheme> {

        /* renamed from: a, reason: collision with root package name */
        public static final PageCoverContentTheme f19733a = new PageCoverContentTheme();
        public static final List b = CollectionsKt.R("background", "foreground");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ContentPage.Background background = null;
            ContentPage.Foreground foreground = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    background = (ContentPage.Background) Adapters.c(Background.f19648a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    foreground = (ContentPage.Foreground) Adapters.c(Foreground.f19665a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (background == null) {
                Assertions.a(reader, "background");
                throw null;
            }
            if (foreground != null) {
                return new ContentPage.PageCoverContentTheme(background, foreground);
            }
            Assertions.a(reader, "foreground");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.PageCoverContentTheme value = (ContentPage.PageCoverContentTheme) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("background");
            Adapters.c(Background.f19648a, false).toJson(writer, customScalarAdapters, value.f19624a);
            writer.F1("foreground");
            Adapters.c(Foreground.f19665a, false).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$PageCoverLogo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$PageCoverLogo;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PageCoverLogo implements Adapter<ContentPage.PageCoverLogo> {

        /* renamed from: a, reason: collision with root package name */
        public static final PageCoverLogo f19734a = new PageCoverLogo();
        public static final List b = CollectionsKt.R("imageUrl", "altText");

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
                Assertions.a(reader, "imageUrl");
                throw null;
            }
            if (str2 != null) {
                return new ContentPage.PageCoverLogo(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.PageCoverLogo value = (ContentPage.PageCoverLogo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("imageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19625a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$PageCoverPrimaryImage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$PageCoverPrimaryImage;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PageCoverPrimaryImage implements Adapter<ContentPage.PageCoverPrimaryImage> {

        /* renamed from: a, reason: collision with root package name */
        public static final PageCoverPrimaryImage f19735a = new PageCoverPrimaryImage();
        public static final List b = CollectionsKt.R("imageUrl", "altText");

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
                Assertions.a(reader, "imageUrl");
                throw null;
            }
            if (str2 != null) {
                return new ContentPage.PageCoverPrimaryImage(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.PageCoverPrimaryImage value = (ContentPage.PageCoverPrimaryImage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("imageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19626a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$PillAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$PillAction;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PillAction implements Adapter<ContentPage.PillAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final PillAction f19736a = new PillAction();
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
            ActionFields actionFieldsA = ActionFieldsImpl_ResponseAdapter.ActionFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new ContentPage.PillAction(str, actionFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.PillAction value = (ContentPage.PillAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19627a);
            List list = ActionFieldsImpl_ResponseAdapter.ActionFields.f19526a;
            ActionFieldsImpl_ResponseAdapter.ActionFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$Primary;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Primary;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Primary implements Adapter<ContentPage.Primary> {

        /* renamed from: a, reason: collision with root package name */
        public static final Primary f19737a = new Primary();
        public static final List b = CollectionsKt.Q("lightHexCode");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new ContentPage.Primary(str);
            }
            Assertions.a(reader, "lightHexCode");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.Primary value = (ContentPage.Primary) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("lightHexCode");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19628a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$ProductCategoryTileAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ProductCategoryTileAction;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductCategoryTileAction implements Adapter<ContentPage.ProductCategoryTileAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductCategoryTileAction f19738a = new ProductCategoryTileAction();
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
            ActionFields actionFieldsA = ActionFieldsImpl_ResponseAdapter.ActionFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new ContentPage.ProductCategoryTileAction(str, actionFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.ProductCategoryTileAction value = (ContentPage.ProductCategoryTileAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19629a);
            List list = ActionFieldsImpl_ResponseAdapter.ActionFields.f19526a;
            ActionFieldsImpl_ResponseAdapter.ActionFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$PromotionCardProduct;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$PromotionCardProduct;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PromotionCardProduct implements Adapter<ContentPage.PromotionCardProduct> {

        /* renamed from: a, reason: collision with root package name */
        public static final PromotionCardProduct f19739a = new PromotionCardProduct();
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
            ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new ContentPage.PromotionCardProduct(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.PromotionCardProduct value = (ContentPage.PromotionCardProduct) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19630a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$Row;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Row;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Row implements Adapter<ContentPage.Row> {

        /* renamed from: a, reason: collision with root package name */
        public static final Row f19740a = new Row();
        public static final List b = CollectionsKt.R("leadingAsset", lqlqqlq.mmm006Dm006Dm, AnnotatedPrivateKey.LABEL);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ContentPage.LeadingAsset leadingAsset = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    leadingAsset = (ContentPage.LeadingAsset) Adapters.b(Adapters.c(LeadingAsset.f19683a, true)).fromJson(reader, customScalarAdapters);
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
                return new ContentPage.Row(leadingAsset, str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.Row value = (ContentPage.Row) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("leadingAsset");
            Adapters.b(Adapters.c(LeadingAsset.f19683a, true)).toJson(writer, customScalarAdapters, value.f19631a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$SearchNavCardAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$SearchNavCardAction;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SearchNavCardAction implements Adapter<ContentPage.SearchNavCardAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final SearchNavCardAction f19741a = new SearchNavCardAction();
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
            ActionFields actionFieldsA = ActionFieldsImpl_ResponseAdapter.ActionFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new ContentPage.SearchNavCardAction(str, actionFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.SearchNavCardAction value = (ContentPage.SearchNavCardAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19632a);
            List list = ActionFieldsImpl_ResponseAdapter.ActionFields.f19526a;
            ActionFieldsImpl_ResponseAdapter.ActionFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$Secondary;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Secondary;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Secondary implements Adapter<ContentPage.Secondary> {

        /* renamed from: a, reason: collision with root package name */
        public static final Secondary f19742a = new Secondary();
        public static final List b = CollectionsKt.Q("lightHexCode");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new ContentPage.Secondary(str);
            }
            Assertions.a(reader, "lightHexCode");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.Secondary value = (ContentPage.Secondary) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("lightHexCode");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19633a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$VerticalListAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$VerticalListAction;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VerticalListAction implements Adapter<ContentPage.VerticalListAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final VerticalListAction f19743a = new VerticalListAction();
        public static final List b = CollectionsKt.R("actionTitle", UrlHandler.ACTION);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ContentPage.Action action = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    action = (ContentPage.Action) Adapters.c(Action.f19637a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (action != null) {
                return new ContentPage.VerticalListAction(str, action);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.VerticalListAction value = (ContentPage.VerticalListAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("actionTitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.f19634a);
            writer.F1(UrlHandler.ACTION);
            Adapters.c(Action.f19637a, true).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$VerticalListItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$VerticalListItem;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VerticalListItem implements Adapter<ContentPage.VerticalListItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final VerticalListItem f19744a = new VerticalListItem();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            ContentPage.OnFullWidthContentCard onFullWidthContentCardA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ContentPage.OnInfoTile onInfoTileA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("FullWidthContentCard"))) {
                reader.o();
                onFullWidthContentCardA = OnFullWidthContentCard.a(reader, customScalarAdapters);
            } else {
                onFullWidthContentCardA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("InfoTile"), BooleanExpressions.d("isInfoTileEnabled")))) {
                reader.o();
                onInfoTileA = OnInfoTile.a(reader, customScalarAdapters);
            }
            return new ContentPage.VerticalListItem(str, onFullWidthContentCardA, onInfoTileA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.VerticalListItem value = (ContentPage.VerticalListItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19635a);
            ContentPage.OnFullWidthContentCard onFullWidthContentCard = value.b;
            if (onFullWidthContentCard != null) {
                OnFullWidthContentCard.b(writer, customScalarAdapters, onFullWidthContentCard);
            }
            ContentPage.OnInfoTile onInfoTile = value.c;
            if (onInfoTile != null) {
                OnInfoTile.b(writer, customScalarAdapters, onInfoTile);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPageImpl_ResponseAdapter$Video;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Video;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Video implements Adapter<ContentPage.Video> {

        /* renamed from: a, reason: collision with root package name */
        public static final Video f19745a = new Video();
        public static final List b = CollectionsKt.R("url", "title", "thumbnail", "duration", "id");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
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
                Assertions.a(reader, "url");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "thumbnail");
                throw null;
            }
            if (str4 != null) {
                return new ContentPage.Video(str, str2, str3, str4, str5);
            }
            Assertions.a(reader, "duration");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentPage.Video value = (ContentPage.Video) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19636a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("thumbnail");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("duration");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.e);
        }
    }
}
