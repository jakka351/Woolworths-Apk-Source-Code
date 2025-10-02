package com.woolworths.shop.healthylife.foodtracker.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.DownloadableAssetFit;
import au.com.woolworths.shop.graphql.type.DownloadableAssetType;
import au.com.woolworths.shop.graphql.type.FooterActionType;
import au.com.woolworths.shop.graphql.type.ListSectionHeaderTypes;
import au.com.woolworths.shop.graphql.type.ParagraphTextItemType;
import au.com.woolworths.shop.graphql.type.adapter.DownloadableAssetFit_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.DownloadableAssetType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.FooterActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ListSectionHeaderTypes_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ParagraphTextItemType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$IntAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.woolworths.shop.healthylife.foodtracker.FoodTrackerPageQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\bÇ\u0002\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/adapter/FoodTrackerPageQuery_ResponseAdapter;", "", "Data", "FoodTrackerPage", "OnFoodTrackerContentFeed", "HeaderAsset", "Content", "OnIconListItem", "OnParagraphTextItem", "OnListSectionHeader", "OnDownloadableAsset", "OnTextWithLink", "Footer", "Icon", "ConsentAction", "OnFoodTrackerConsent", "HeaderAsset1", "OnFoodTrackerWebView", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FoodTrackerPageQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/adapter/FoodTrackerPageQuery_ResponseAdapter$ConsentAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$ConsentAction;", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ConsentAction implements Adapter<FoodTrackerPageQuery.ConsentAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final ConsentAction f22756a = new ConsentAction();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            FoodTrackerPageQuery.OnFoodTrackerConsent onFoodTrackerConsentA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("FoodTrackerConsent"))) {
                reader.o();
                onFoodTrackerConsentA = OnFoodTrackerConsent.a(reader, customScalarAdapters);
            }
            return new FoodTrackerPageQuery.ConsentAction(str, onFoodTrackerConsentA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            FoodTrackerPageQuery.ConsentAction value = (FoodTrackerPageQuery.ConsentAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22737a);
            FoodTrackerPageQuery.OnFoodTrackerConsent onFoodTrackerConsent = value.b;
            if (onFoodTrackerConsent != null) {
                OnFoodTrackerConsent.b(writer, customScalarAdapters, onFoodTrackerConsent);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/adapter/FoodTrackerPageQuery_ResponseAdapter$Content;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$Content;", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Content implements Adapter<FoodTrackerPageQuery.Content> {

        /* renamed from: a, reason: collision with root package name */
        public static final Content f22757a = new Content();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            FoodTrackerPageQuery.OnIconListItem onIconListItemA;
            FoodTrackerPageQuery.OnParagraphTextItem onParagraphTextItemA;
            FoodTrackerPageQuery.OnListSectionHeader onListSectionHeaderA;
            FoodTrackerPageQuery.OnDownloadableAsset onDownloadableAssetA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            FoodTrackerPageQuery.OnTextWithLink onTextWithLinkA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("IconListItem"))) {
                reader.o();
                onIconListItemA = OnIconListItem.a(reader, customScalarAdapters);
            } else {
                onIconListItemA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ParagraphTextItem"))) {
                reader.o();
                onParagraphTextItemA = OnParagraphTextItem.a(reader, customScalarAdapters);
            } else {
                onParagraphTextItemA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ListSectionHeader"))) {
                reader.o();
                onListSectionHeaderA = OnListSectionHeader.a(reader, customScalarAdapters);
            } else {
                onListSectionHeaderA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("DownloadableAsset"))) {
                reader.o();
                onDownloadableAssetA = OnDownloadableAsset.a(reader, customScalarAdapters);
            } else {
                onDownloadableAssetA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("TextWithLink"))) {
                reader.o();
                onTextWithLinkA = OnTextWithLink.a(reader, customScalarAdapters);
            }
            return new FoodTrackerPageQuery.Content(str, onIconListItemA, onParagraphTextItemA, onListSectionHeaderA, onDownloadableAssetA, onTextWithLinkA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            FoodTrackerPageQuery.Content value = (FoodTrackerPageQuery.Content) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22738a);
            FoodTrackerPageQuery.OnIconListItem onIconListItem = value.b;
            if (onIconListItem != null) {
                OnIconListItem.b(writer, customScalarAdapters, onIconListItem);
            }
            FoodTrackerPageQuery.OnParagraphTextItem onParagraphTextItem = value.c;
            if (onParagraphTextItem != null) {
                OnParagraphTextItem.b(writer, customScalarAdapters, onParagraphTextItem);
            }
            FoodTrackerPageQuery.OnListSectionHeader onListSectionHeader = value.d;
            if (onListSectionHeader != null) {
                OnListSectionHeader.b(writer, customScalarAdapters, onListSectionHeader);
            }
            FoodTrackerPageQuery.OnDownloadableAsset onDownloadableAsset = value.e;
            if (onDownloadableAsset != null) {
                OnDownloadableAsset.b(writer, customScalarAdapters, onDownloadableAsset);
            }
            FoodTrackerPageQuery.OnTextWithLink onTextWithLink = value.f;
            if (onTextWithLink != null) {
                OnTextWithLink.b(writer, customScalarAdapters, onTextWithLink);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/adapter/FoodTrackerPageQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$Data;", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<FoodTrackerPageQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f22758a = new Data();
        public static final List b = CollectionsKt.Q("foodTrackerPage");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            FoodTrackerPageQuery.FoodTrackerPage foodTrackerPage = null;
            while (reader.o2(b) == 0) {
                foodTrackerPage = (FoodTrackerPageQuery.FoodTrackerPage) Adapters.b(Adapters.c(FoodTrackerPage.f22759a, true)).fromJson(reader, customScalarAdapters);
            }
            return new FoodTrackerPageQuery.Data(foodTrackerPage);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            FoodTrackerPageQuery.Data value = (FoodTrackerPageQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("foodTrackerPage");
            Adapters.b(Adapters.c(FoodTrackerPage.f22759a, true)).toJson(writer, customScalarAdapters, value.f22739a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/adapter/FoodTrackerPageQuery_ResponseAdapter$FoodTrackerPage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$FoodTrackerPage;", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FoodTrackerPage implements Adapter<FoodTrackerPageQuery.FoodTrackerPage> {

        /* renamed from: a, reason: collision with root package name */
        public static final FoodTrackerPage f22759a = new FoodTrackerPage();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            FoodTrackerPageQuery.OnFoodTrackerContentFeed onFoodTrackerContentFeedA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            FoodTrackerPageQuery.OnFoodTrackerWebView onFoodTrackerWebViewA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("FoodTrackerContentFeed"))) {
                reader.o();
                onFoodTrackerContentFeedA = OnFoodTrackerContentFeed.a(reader, customScalarAdapters);
            } else {
                onFoodTrackerContentFeedA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("FoodTrackerWebView"))) {
                reader.o();
                onFoodTrackerWebViewA = OnFoodTrackerWebView.a(reader, customScalarAdapters);
            }
            return new FoodTrackerPageQuery.FoodTrackerPage(str, onFoodTrackerContentFeedA, onFoodTrackerWebViewA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            FoodTrackerPageQuery.FoodTrackerPage value = (FoodTrackerPageQuery.FoodTrackerPage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22740a);
            FoodTrackerPageQuery.OnFoodTrackerContentFeed onFoodTrackerContentFeed = value.b;
            if (onFoodTrackerContentFeed != null) {
                OnFoodTrackerContentFeed.b(writer, customScalarAdapters, onFoodTrackerContentFeed);
            }
            FoodTrackerPageQuery.OnFoodTrackerWebView onFoodTrackerWebView = value.c;
            if (onFoodTrackerWebView != null) {
                OnFoodTrackerWebView.b(writer, customScalarAdapters, onFoodTrackerWebView);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/adapter/FoodTrackerPageQuery_ResponseAdapter$Footer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$Footer;", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Footer implements Adapter<FoodTrackerPageQuery.Footer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Footer f22760a = new Footer();
        public static final List b = CollectionsKt.R(BarcodePickDeserializer.FIELD_ICON, "title", "consentAction", "actionType", "primaryCtaLabel");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            FoodTrackerPageQuery.Icon icon = null;
            String str = null;
            FoodTrackerPageQuery.ConsentAction consentAction = null;
            FooterActionType footerActionTypeA = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    icon = (FoodTrackerPageQuery.Icon) Adapters.c(Icon.f22763a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    consentAction = (FoodTrackerPageQuery.ConsentAction) Adapters.b(Adapters.c(ConsentAction.f22756a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    footerActionTypeA = FooterActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (icon == null) {
                Assertions.a(reader, BarcodePickDeserializer.FIELD_ICON);
                throw null;
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (footerActionTypeA == null) {
                Assertions.a(reader, "actionType");
                throw null;
            }
            if (str2 != null) {
                return new FoodTrackerPageQuery.Footer(icon, str, consentAction, footerActionTypeA, str2);
            }
            Assertions.a(reader, "primaryCtaLabel");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            FoodTrackerPageQuery.Footer value = (FoodTrackerPageQuery.Footer) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(BarcodePickDeserializer.FIELD_ICON);
            Adapters.c(Icon.f22763a, false).toJson(writer, customScalarAdapters, value.f22741a);
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("consentAction");
            Adapters.b(Adapters.c(ConsentAction.f22756a, true)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("actionType");
            writer.v0(value.d.d);
            writer.F1("primaryCtaLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/adapter/FoodTrackerPageQuery_ResponseAdapter$HeaderAsset;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$HeaderAsset;", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HeaderAsset implements Adapter<FoodTrackerPageQuery.HeaderAsset> {

        /* renamed from: a, reason: collision with root package name */
        public static final HeaderAsset f22761a = new HeaderAsset();
        public static final List b = CollectionsKt.R("assetType", "assetUrl", "assetWidth", "assetHeight", "fit", "altText");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
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
                int iO2 = reader.o2(b);
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
                return new FoodTrackerPageQuery.HeaderAsset(downloadableAssetTypeA, str, iIntValue, num5.intValue(), downloadableAssetFit, str2);
            }
            Assertions.a(reader, "assetHeight");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            FoodTrackerPageQuery.HeaderAsset value = (FoodTrackerPageQuery.HeaderAsset) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("assetType");
            DownloadableAssetType_ResponseAdapter.b(writer, customScalarAdapters, value.f22742a);
            writer.F1("assetUrl");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("assetWidth");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.c, adapters$IntAdapter$1, writer, customScalarAdapters, "assetHeight");
            d.y(value.d, adapters$IntAdapter$1, writer, customScalarAdapters, "fit");
            Adapters.b(DownloadableAssetFit_ResponseAdapter.f12070a).toJson(writer, customScalarAdapters, value.e);
            writer.F1("altText");
            Adapters.i.toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/adapter/FoodTrackerPageQuery_ResponseAdapter$HeaderAsset1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$HeaderAsset1;", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HeaderAsset1 implements Adapter<FoodTrackerPageQuery.HeaderAsset1> {

        /* renamed from: a, reason: collision with root package name */
        public static final HeaderAsset1 f22762a = new HeaderAsset1();
        public static final List b = CollectionsKt.R("assetType", "assetUrl", "assetWidth", "assetHeight", "fit", "altText");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
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
                int iO2 = reader.o2(b);
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
                return new FoodTrackerPageQuery.HeaderAsset1(downloadableAssetTypeA, str, iIntValue, num5.intValue(), downloadableAssetFit, str2);
            }
            Assertions.a(reader, "assetHeight");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            FoodTrackerPageQuery.HeaderAsset1 value = (FoodTrackerPageQuery.HeaderAsset1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("assetType");
            DownloadableAssetType_ResponseAdapter.b(writer, customScalarAdapters, value.f22743a);
            writer.F1("assetUrl");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("assetWidth");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.c, adapters$IntAdapter$1, writer, customScalarAdapters, "assetHeight");
            d.y(value.d, adapters$IntAdapter$1, writer, customScalarAdapters, "fit");
            Adapters.b(DownloadableAssetFit_ResponseAdapter.f12070a).toJson(writer, customScalarAdapters, value.e);
            writer.F1("altText");
            Adapters.i.toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/adapter/FoodTrackerPageQuery_ResponseAdapter$Icon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$Icon;", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Icon implements Adapter<FoodTrackerPageQuery.Icon> {

        /* renamed from: a, reason: collision with root package name */
        public static final Icon f22763a = new Icon();
        public static final List b = CollectionsKt.R("assetType", "assetUrl", "assetWidth", "assetHeight", "fit", "altText");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
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
                int iO2 = reader.o2(b);
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
                return new FoodTrackerPageQuery.Icon(downloadableAssetTypeA, str, iIntValue, num5.intValue(), downloadableAssetFit, str2);
            }
            Assertions.a(reader, "assetHeight");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            FoodTrackerPageQuery.Icon value = (FoodTrackerPageQuery.Icon) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("assetType");
            DownloadableAssetType_ResponseAdapter.b(writer, customScalarAdapters, value.f22744a);
            writer.F1("assetUrl");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("assetWidth");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.c, adapters$IntAdapter$1, writer, customScalarAdapters, "assetHeight");
            d.y(value.d, adapters$IntAdapter$1, writer, customScalarAdapters, "fit");
            Adapters.b(DownloadableAssetFit_ResponseAdapter.f12070a).toJson(writer, customScalarAdapters, value.e);
            writer.F1("altText");
            Adapters.i.toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/adapter/FoodTrackerPageQuery_ResponseAdapter$OnDownloadableAsset;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$OnDownloadableAsset;", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnDownloadableAsset implements Adapter<FoodTrackerPageQuery.OnDownloadableAsset> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22764a = CollectionsKt.R("assetType", "assetUrl", "assetWidth", "assetHeight", "fit", "altText");

        public static FoodTrackerPageQuery.OnDownloadableAsset a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
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
                int iO2 = reader.o2(f22764a);
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
                return new FoodTrackerPageQuery.OnDownloadableAsset(downloadableAssetTypeA, str, iIntValue, num5.intValue(), downloadableAssetFit, str2);
            }
            Assertions.a(reader, "assetHeight");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, FoodTrackerPageQuery.OnDownloadableAsset value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("assetType");
            DownloadableAssetType_ResponseAdapter.b(writer, customScalarAdapters, value.f22745a);
            writer.F1("assetUrl");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("assetWidth");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.c, adapters$IntAdapter$1, writer, customScalarAdapters, "assetHeight");
            d.y(value.d, adapters$IntAdapter$1, writer, customScalarAdapters, "fit");
            Adapters.b(DownloadableAssetFit_ResponseAdapter.f12070a).toJson(writer, customScalarAdapters, value.e);
            writer.F1("altText");
            Adapters.i.toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (FoodTrackerPageQuery.OnDownloadableAsset) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/adapter/FoodTrackerPageQuery_ResponseAdapter$OnFoodTrackerConsent;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$OnFoodTrackerConsent;", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnFoodTrackerConsent implements Adapter<FoodTrackerPageQuery.OnFoodTrackerConsent> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22765a = CollectionsKt.R("headerAsset", "consentTitle", "consentMarkdownDescription", "termsMarkdownText", "primaryCtaLabel", "secondaryCtaLabel");

        public static FoodTrackerPageQuery.OnFoodTrackerConsent a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            FoodTrackerPageQuery.HeaderAsset1 headerAsset1 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (true) {
                int iO2 = reader.o2(f22765a);
                if (iO2 == 0) {
                    headerAsset1 = (FoodTrackerPageQuery.HeaderAsset1) Adapters.c(HeaderAsset1.f22762a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (headerAsset1 == null) {
                Assertions.a(reader, "headerAsset");
                throw null;
            }
            if (str == null) {
                Assertions.a(reader, "consentTitle");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "consentMarkdownDescription");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "termsMarkdownText");
                throw null;
            }
            if (str4 == null) {
                Assertions.a(reader, "primaryCtaLabel");
                throw null;
            }
            if (str5 != null) {
                return new FoodTrackerPageQuery.OnFoodTrackerConsent(headerAsset1, str, str2, str3, str4, str5);
            }
            Assertions.a(reader, "secondaryCtaLabel");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, FoodTrackerPageQuery.OnFoodTrackerConsent value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("headerAsset");
            Adapters.c(HeaderAsset1.f22762a, false).toJson(writer, customScalarAdapters, value.f22746a);
            writer.F1("consentTitle");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("consentMarkdownDescription");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("termsMarkdownText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("primaryCtaLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("secondaryCtaLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (FoodTrackerPageQuery.OnFoodTrackerConsent) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/adapter/FoodTrackerPageQuery_ResponseAdapter$OnFoodTrackerContentFeed;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$OnFoodTrackerContentFeed;", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnFoodTrackerContentFeed implements Adapter<FoodTrackerPageQuery.OnFoodTrackerContentFeed> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22766a = CollectionsKt.R("navigationTitle", "headerAsset", "content", "footer");

        public static FoodTrackerPageQuery.OnFoodTrackerContentFeed a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            FoodTrackerPageQuery.HeaderAsset headerAsset = null;
            ArrayList arrayListFromJson = null;
            FoodTrackerPageQuery.Footer footer = null;
            while (true) {
                int iO2 = reader.o2(f22766a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    headerAsset = (FoodTrackerPageQuery.HeaderAsset) Adapters.c(HeaderAsset.f22761a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson = Adapters.a(Adapters.c(Content.f22757a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    footer = (FoodTrackerPageQuery.Footer) Adapters.c(Footer.f22760a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "navigationTitle");
                throw null;
            }
            if (headerAsset == null) {
                Assertions.a(reader, "headerAsset");
                throw null;
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "content");
                throw null;
            }
            if (footer != null) {
                return new FoodTrackerPageQuery.OnFoodTrackerContentFeed(str, headerAsset, arrayListFromJson, footer);
            }
            Assertions.a(reader, "footer");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, FoodTrackerPageQuery.OnFoodTrackerContentFeed value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("navigationTitle");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22747a);
            writer.F1("headerAsset");
            Adapters.c(HeaderAsset.f22761a, false).toJson(writer, customScalarAdapters, value.b);
            writer.F1("content");
            Adapters.a(Adapters.c(Content.f22757a, true)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("footer");
            Adapters.c(Footer.f22760a, false).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (FoodTrackerPageQuery.OnFoodTrackerContentFeed) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/adapter/FoodTrackerPageQuery_ResponseAdapter$OnFoodTrackerWebView;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$OnFoodTrackerWebView;", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnFoodTrackerWebView implements Adapter<FoodTrackerPageQuery.OnFoodTrackerWebView> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22767a = CollectionsKt.R("navigationTitle", "url");

        public static FoodTrackerPageQuery.OnFoodTrackerWebView a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f22767a);
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
                Assertions.a(reader, "navigationTitle");
                throw null;
            }
            if (str2 != null) {
                return new FoodTrackerPageQuery.OnFoodTrackerWebView(str, str2);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, FoodTrackerPageQuery.OnFoodTrackerWebView value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("navigationTitle");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22748a);
            writer.F1("url");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (FoodTrackerPageQuery.OnFoodTrackerWebView) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/adapter/FoodTrackerPageQuery_ResponseAdapter$OnIconListItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$OnIconListItem;", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnIconListItem implements Adapter<FoodTrackerPageQuery.OnIconListItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22768a = CollectionsKt.R("iconUrl", "title", lqlqqlq.mmm006Dm006Dm);

        public static FoodTrackerPageQuery.OnIconListItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(f22768a);
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
                Assertions.a(reader, "iconUrl");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 != null) {
                return new FoodTrackerPageQuery.OnIconListItem(str, str2, str3);
            }
            Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, FoodTrackerPageQuery.OnIconListItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("iconUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22749a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (FoodTrackerPageQuery.OnIconListItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/adapter/FoodTrackerPageQuery_ResponseAdapter$OnListSectionHeader;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$OnListSectionHeader;", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnListSectionHeader implements Adapter<FoodTrackerPageQuery.OnListSectionHeader> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22769a = CollectionsKt.R("listSectionHeaderText", "listSectionHeaderType");

        public static FoodTrackerPageQuery.OnListSectionHeader a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ListSectionHeaderTypes listSectionHeaderTypesA = null;
            while (true) {
                int iO2 = reader.o2(f22769a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    listSectionHeaderTypesA = ListSectionHeaderTypes_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "listSectionHeaderText");
                throw null;
            }
            if (listSectionHeaderTypesA != null) {
                return new FoodTrackerPageQuery.OnListSectionHeader(listSectionHeaderTypesA, str);
            }
            Assertions.a(reader, "listSectionHeaderType");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, FoodTrackerPageQuery.OnListSectionHeader value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("listSectionHeaderText");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22750a);
            writer.F1("listSectionHeaderType");
            ListSectionHeaderTypes_ResponseAdapter.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (FoodTrackerPageQuery.OnListSectionHeader) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/adapter/FoodTrackerPageQuery_ResponseAdapter$OnParagraphTextItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$OnParagraphTextItem;", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnParagraphTextItem implements Adapter<FoodTrackerPageQuery.OnParagraphTextItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22770a = CollectionsKt.R("content", "type");

        public static FoodTrackerPageQuery.OnParagraphTextItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ParagraphTextItemType paragraphTextItemTypeA = null;
            while (true) {
                int iO2 = reader.o2(f22770a);
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
                return new FoodTrackerPageQuery.OnParagraphTextItem(paragraphTextItemTypeA, str);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, FoodTrackerPageQuery.OnParagraphTextItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("content");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22751a);
            writer.F1("type");
            ParagraphTextItemType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (FoodTrackerPageQuery.OnParagraphTextItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/adapter/FoodTrackerPageQuery_ResponseAdapter$OnTextWithLink;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$OnTextWithLink;", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnTextWithLink implements Adapter<FoodTrackerPageQuery.OnTextWithLink> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22771a = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "url");

        public static FoodTrackerPageQuery.OnTextWithLink a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f22771a);
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
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (str2 != null) {
                return new FoodTrackerPageQuery.OnTextWithLink(str, str2);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, FoodTrackerPageQuery.OnTextWithLink value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22752a);
            writer.F1("url");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (FoodTrackerPageQuery.OnTextWithLink) obj);
        }
    }
}
