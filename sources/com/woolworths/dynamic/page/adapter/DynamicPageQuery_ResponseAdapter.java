package com.woolworths.dynamic.page.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFieldsImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.adapter.ActionType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.UrlHandler;
import com.woolworths.dynamic.page.DynamicPageQuery;
import com.woolworths.dynamic.page.fragment.CampaignCardImpl_ResponseAdapter;
import com.woolworths.dynamic.page.fragment.CampaignCopy;
import com.woolworths.dynamic.page.fragment.CampaignCopyImpl_ResponseAdapter;
import com.woolworths.dynamic.page.fragment.CampaignTermsAndConditions;
import com.woolworths.dynamic.page.fragment.CampaignTermsAndConditionsImpl_ResponseAdapter;
import com.woolworths.dynamic.page.fragment.ContentList;
import com.woolworths.dynamic.page.fragment.ContentListImpl_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001d\bÇ\u0002\u0018\u00002\u00020\u0001:\u001c\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/woolworths/dynamic/page/adapter/DynamicPageQuery_ResponseAdapter;", "", "Data", "DynamicPage", "HeaderSection", "FeedItem", "OnCampaignCopy", "OnContentList", "OnCampaignTermsAndConditions", "OnCampaignCardCarousel", "CampaignCard", "OnCampaignCardList", "CampaignCard1", "OnQuickLinkList", "Item", "LinkCardAction", "OnCategoryTileList", "CategoryTileListTile", "FooterSection", "Action", "BottomSheet", "OnDynamicPageBottomSheet", "Analytics", "BottomSheetFeedItem", "OnCampaignCopy1", "OnContentList1", "OnCampaignTermsAndConditions1", "OnCampaignCardList1", "CampaignCard2", "Analytics1", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DynamicPageQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/dynamic/page/adapter/DynamicPageQuery_ResponseAdapter$Action;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/dynamic/page/DynamicPageQuery$Action;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action implements Adapter<DynamicPageQuery.Action> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action f19256a = new Action();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, UrlHandler.ACTION);

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
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (str2 != null) {
                return new DynamicPageQuery.Action(str, str2);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DynamicPageQuery.Action value = (DynamicPageQuery.Action) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19228a);
            writer.F1(UrlHandler.ACTION);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/dynamic/page/adapter/DynamicPageQuery_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/dynamic/page/DynamicPageQuery$Analytics;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<DynamicPageQuery.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f19257a = new Analytics();
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
                return new DynamicPageQuery.Analytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DynamicPageQuery.Analytics value = (DynamicPageQuery.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19229a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/dynamic/page/adapter/DynamicPageQuery_ResponseAdapter$Analytics1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/dynamic/page/DynamicPageQuery$Analytics1;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics1 implements Adapter<DynamicPageQuery.Analytics1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics1 f19258a = new Analytics1();
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
                return new DynamicPageQuery.Analytics1(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DynamicPageQuery.Analytics1 value = (DynamicPageQuery.Analytics1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19230a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/dynamic/page/adapter/DynamicPageQuery_ResponseAdapter$BottomSheet;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/dynamic/page/DynamicPageQuery$BottomSheet;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BottomSheet implements Adapter<DynamicPageQuery.BottomSheet> {

        /* renamed from: a, reason: collision with root package name */
        public static final BottomSheet f19259a = new BottomSheet();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            DynamicPageQuery.OnDynamicPageBottomSheet onDynamicPageBottomSheetA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("DynamicPageBottomSheet"))) {
                reader.o();
                onDynamicPageBottomSheetA = OnDynamicPageBottomSheet.a(reader, customScalarAdapters);
            }
            return new DynamicPageQuery.BottomSheet(str, onDynamicPageBottomSheetA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DynamicPageQuery.BottomSheet value = (DynamicPageQuery.BottomSheet) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19231a);
            DynamicPageQuery.OnDynamicPageBottomSheet onDynamicPageBottomSheet = value.b;
            if (onDynamicPageBottomSheet != null) {
                OnDynamicPageBottomSheet.b(writer, customScalarAdapters, onDynamicPageBottomSheet);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/dynamic/page/adapter/DynamicPageQuery_ResponseAdapter$BottomSheetFeedItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/dynamic/page/DynamicPageQuery$BottomSheetFeedItem;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BottomSheetFeedItem implements Adapter<DynamicPageQuery.BottomSheetFeedItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final BottomSheetFeedItem f19260a = new BottomSheetFeedItem();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            DynamicPageQuery.OnCampaignCopy1 onCampaignCopy1A;
            DynamicPageQuery.OnContentList1 onContentList1A;
            DynamicPageQuery.OnCampaignTermsAndConditions1 onCampaignTermsAndConditions1A;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            DynamicPageQuery.OnCampaignCardList1 onCampaignCardList1A = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CampaignCopy"))) {
                reader.o();
                onCampaignCopy1A = OnCampaignCopy1.a(reader, customScalarAdapters);
            } else {
                onCampaignCopy1A = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ContentList"))) {
                reader.o();
                onContentList1A = OnContentList1.a(reader, customScalarAdapters);
            } else {
                onContentList1A = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CampaignTermsAndConditions"))) {
                reader.o();
                onCampaignTermsAndConditions1A = OnCampaignTermsAndConditions1.a(reader, customScalarAdapters);
            } else {
                onCampaignTermsAndConditions1A = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CampaignCardList"))) {
                reader.o();
                onCampaignCardList1A = OnCampaignCardList1.a(reader, customScalarAdapters);
            }
            return new DynamicPageQuery.BottomSheetFeedItem(str, onCampaignCopy1A, onContentList1A, onCampaignTermsAndConditions1A, onCampaignCardList1A);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DynamicPageQuery.BottomSheetFeedItem value = (DynamicPageQuery.BottomSheetFeedItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19232a);
            DynamicPageQuery.OnCampaignCopy1 onCampaignCopy1 = value.b;
            if (onCampaignCopy1 != null) {
                OnCampaignCopy1.b(writer, customScalarAdapters, onCampaignCopy1);
            }
            DynamicPageQuery.OnContentList1 onContentList1 = value.c;
            if (onContentList1 != null) {
                OnContentList1.b(writer, customScalarAdapters, onContentList1);
            }
            DynamicPageQuery.OnCampaignTermsAndConditions1 onCampaignTermsAndConditions1 = value.d;
            if (onCampaignTermsAndConditions1 != null) {
                OnCampaignTermsAndConditions1.b(writer, customScalarAdapters, onCampaignTermsAndConditions1);
            }
            DynamicPageQuery.OnCampaignCardList1 onCampaignCardList1 = value.e;
            if (onCampaignCardList1 != null) {
                OnCampaignCardList1.b(writer, customScalarAdapters, onCampaignCardList1);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/dynamic/page/adapter/DynamicPageQuery_ResponseAdapter$CampaignCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/dynamic/page/DynamicPageQuery$CampaignCard;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CampaignCard implements Adapter<DynamicPageQuery.CampaignCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final CampaignCard f19261a = new CampaignCard();
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
            com.woolworths.dynamic.page.fragment.CampaignCard campaignCardA = CampaignCardImpl_ResponseAdapter.CampaignCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new DynamicPageQuery.CampaignCard(str, campaignCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DynamicPageQuery.CampaignCard value = (DynamicPageQuery.CampaignCard) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19233a);
            List list = CampaignCardImpl_ResponseAdapter.CampaignCard.f19285a;
            CampaignCardImpl_ResponseAdapter.CampaignCard.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/dynamic/page/adapter/DynamicPageQuery_ResponseAdapter$CampaignCard1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/dynamic/page/DynamicPageQuery$CampaignCard1;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CampaignCard1 implements Adapter<DynamicPageQuery.CampaignCard1> {

        /* renamed from: a, reason: collision with root package name */
        public static final CampaignCard1 f19262a = new CampaignCard1();
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
            com.woolworths.dynamic.page.fragment.CampaignCard campaignCardA = CampaignCardImpl_ResponseAdapter.CampaignCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new DynamicPageQuery.CampaignCard1(str, campaignCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DynamicPageQuery.CampaignCard1 value = (DynamicPageQuery.CampaignCard1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19234a);
            List list = CampaignCardImpl_ResponseAdapter.CampaignCard.f19285a;
            CampaignCardImpl_ResponseAdapter.CampaignCard.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/dynamic/page/adapter/DynamicPageQuery_ResponseAdapter$CampaignCard2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/dynamic/page/DynamicPageQuery$CampaignCard2;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CampaignCard2 implements Adapter<DynamicPageQuery.CampaignCard2> {

        /* renamed from: a, reason: collision with root package name */
        public static final CampaignCard2 f19263a = new CampaignCard2();
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
            com.woolworths.dynamic.page.fragment.CampaignCard campaignCardA = CampaignCardImpl_ResponseAdapter.CampaignCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new DynamicPageQuery.CampaignCard2(str, campaignCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DynamicPageQuery.CampaignCard2 value = (DynamicPageQuery.CampaignCard2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19235a);
            List list = CampaignCardImpl_ResponseAdapter.CampaignCard.f19285a;
            CampaignCardImpl_ResponseAdapter.CampaignCard.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/dynamic/page/adapter/DynamicPageQuery_ResponseAdapter$CategoryTileListTile;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/dynamic/page/DynamicPageQuery$CategoryTileListTile;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CategoryTileListTile implements Adapter<DynamicPageQuery.CategoryTileListTile> {

        /* renamed from: a, reason: collision with root package name */
        public static final CategoryTileListTile f19264a = new CategoryTileListTile();
        public static final List b = CollectionsKt.R("title", "imageUrl", "imageAltText", UrlHandler.ACTION);

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
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
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
                Assertions.a(reader, "imageUrl");
                throw null;
            }
            if (str4 != null) {
                return new DynamicPageQuery.CategoryTileListTile(str, str2, str3, str4);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DynamicPageQuery.CategoryTileListTile value = (DynamicPageQuery.CategoryTileListTile) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19236a);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("imageAltText");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1(UrlHandler.ACTION);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/dynamic/page/adapter/DynamicPageQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/dynamic/page/DynamicPageQuery$Data;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<DynamicPageQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f19265a = new Data();
        public static final List b = CollectionsKt.Q("dynamicPage");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            DynamicPageQuery.DynamicPage dynamicPage = null;
            while (reader.o2(b) == 0) {
                dynamicPage = (DynamicPageQuery.DynamicPage) Adapters.b(Adapters.c(DynamicPage.f19266a, false)).fromJson(reader, customScalarAdapters);
            }
            return new DynamicPageQuery.Data(dynamicPage);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DynamicPageQuery.Data value = (DynamicPageQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("dynamicPage");
            Adapters.b(Adapters.c(DynamicPage.f19266a, false)).toJson(writer, customScalarAdapters, value.f19237a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/dynamic/page/adapter/DynamicPageQuery_ResponseAdapter$DynamicPage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/dynamic/page/DynamicPageQuery$DynamicPage;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DynamicPage implements Adapter<DynamicPageQuery.DynamicPage> {

        /* renamed from: a, reason: collision with root package name */
        public static final DynamicPage f19266a = new DynamicPage();
        public static final List b = CollectionsKt.R("headerSection", "feedItems", "footerSection", "bottomSheets", "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            DynamicPageQuery.HeaderSection headerSection = null;
            ArrayList arrayListFromJson = null;
            DynamicPageQuery.FooterSection footerSection = null;
            List list = null;
            DynamicPageQuery.Analytics1 analytics1 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    headerSection = (DynamicPageQuery.HeaderSection) Adapters.c(HeaderSection.f19269a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson = Adapters.a(Adapters.b(Adapters.c(FeedItem.f19267a, true))).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    footerSection = (DynamicPageQuery.FooterSection) Adapters.b(Adapters.c(FooterSection.f19268a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    list = (List) Adapters.b(Adapters.a(Adapters.b(Adapters.c(BottomSheet.f19259a, true)))).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    analytics1 = (DynamicPageQuery.Analytics1) Adapters.c(Analytics1.f19258a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (headerSection == null) {
                Assertions.a(reader, "headerSection");
                throw null;
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "feedItems");
                throw null;
            }
            if (analytics1 != null) {
                return new DynamicPageQuery.DynamicPage(headerSection, arrayListFromJson, footerSection, list, analytics1);
            }
            Assertions.a(reader, "analytics");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DynamicPageQuery.DynamicPage value = (DynamicPageQuery.DynamicPage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("headerSection");
            Adapters.c(HeaderSection.f19269a, false).toJson(writer, customScalarAdapters, value.f19238a);
            writer.F1("feedItems");
            Adapters.a(Adapters.b(Adapters.c(FeedItem.f19267a, true))).toJson(writer, customScalarAdapters, value.b);
            writer.F1("footerSection");
            Adapters.b(Adapters.c(FooterSection.f19268a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("bottomSheets");
            Adapters.b(Adapters.a(Adapters.b(Adapters.c(BottomSheet.f19259a, true)))).toJson(writer, customScalarAdapters, value.d);
            writer.F1("analytics");
            Adapters.c(Analytics1.f19258a, true).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/dynamic/page/adapter/DynamicPageQuery_ResponseAdapter$FeedItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/dynamic/page/DynamicPageQuery$FeedItem;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FeedItem implements Adapter<DynamicPageQuery.FeedItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final FeedItem f19267a = new FeedItem();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            DynamicPageQuery.OnCampaignCopy onCampaignCopyA;
            DynamicPageQuery.OnContentList onContentListA;
            DynamicPageQuery.OnCampaignTermsAndConditions onCampaignTermsAndConditionsA;
            DynamicPageQuery.OnCampaignCardCarousel onCampaignCardCarouselA;
            DynamicPageQuery.OnCampaignCardList onCampaignCardListA;
            DynamicPageQuery.OnQuickLinkList onQuickLinkListA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            DynamicPageQuery.OnCategoryTileList onCategoryTileListA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CampaignCopy"))) {
                reader.o();
                onCampaignCopyA = OnCampaignCopy.a(reader, customScalarAdapters);
            } else {
                onCampaignCopyA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ContentList"))) {
                reader.o();
                onContentListA = OnContentList.a(reader, customScalarAdapters);
            } else {
                onContentListA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CampaignTermsAndConditions"))) {
                reader.o();
                onCampaignTermsAndConditionsA = OnCampaignTermsAndConditions.a(reader, customScalarAdapters);
            } else {
                onCampaignTermsAndConditionsA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CampaignCardCarousel"))) {
                reader.o();
                onCampaignCardCarouselA = OnCampaignCardCarousel.a(reader, customScalarAdapters);
            } else {
                onCampaignCardCarouselA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CampaignCardList"))) {
                reader.o();
                onCampaignCardListA = OnCampaignCardList.a(reader, customScalarAdapters);
            } else {
                onCampaignCardListA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("QuickLinkList"))) {
                reader.o();
                onQuickLinkListA = OnQuickLinkList.a(reader, customScalarAdapters);
            } else {
                onQuickLinkListA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CategoryTileList"))) {
                reader.o();
                onCategoryTileListA = OnCategoryTileList.a(reader, customScalarAdapters);
            }
            return new DynamicPageQuery.FeedItem(str, onCampaignCopyA, onContentListA, onCampaignTermsAndConditionsA, onCampaignCardCarouselA, onCampaignCardListA, onQuickLinkListA, onCategoryTileListA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DynamicPageQuery.FeedItem value = (DynamicPageQuery.FeedItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19239a);
            DynamicPageQuery.OnCampaignCopy onCampaignCopy = value.b;
            if (onCampaignCopy != null) {
                OnCampaignCopy.b(writer, customScalarAdapters, onCampaignCopy);
            }
            DynamicPageQuery.OnContentList onContentList = value.c;
            if (onContentList != null) {
                OnContentList.b(writer, customScalarAdapters, onContentList);
            }
            DynamicPageQuery.OnCampaignTermsAndConditions onCampaignTermsAndConditions = value.d;
            if (onCampaignTermsAndConditions != null) {
                OnCampaignTermsAndConditions.b(writer, customScalarAdapters, onCampaignTermsAndConditions);
            }
            DynamicPageQuery.OnCampaignCardCarousel onCampaignCardCarousel = value.e;
            if (onCampaignCardCarousel != null) {
                OnCampaignCardCarousel.b(writer, customScalarAdapters, onCampaignCardCarousel);
            }
            DynamicPageQuery.OnCampaignCardList onCampaignCardList = value.f;
            if (onCampaignCardList != null) {
                OnCampaignCardList.b(writer, customScalarAdapters, onCampaignCardList);
            }
            DynamicPageQuery.OnQuickLinkList onQuickLinkList = value.g;
            if (onQuickLinkList != null) {
                OnQuickLinkList.b(writer, customScalarAdapters, onQuickLinkList);
            }
            DynamicPageQuery.OnCategoryTileList onCategoryTileList = value.h;
            if (onCategoryTileList != null) {
                OnCategoryTileList.b(writer, customScalarAdapters, onCategoryTileList);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/dynamic/page/adapter/DynamicPageQuery_ResponseAdapter$FooterSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/dynamic/page/DynamicPageQuery$FooterSection;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FooterSection implements Adapter<DynamicPageQuery.FooterSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final FooterSection f19268a = new FooterSection();
        public static final List b = CollectionsKt.Q(UrlHandler.ACTION);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            DynamicPageQuery.Action action = null;
            while (reader.o2(b) == 0) {
                action = (DynamicPageQuery.Action) Adapters.c(Action.f19256a, false).fromJson(reader, customScalarAdapters);
            }
            if (action != null) {
                return new DynamicPageQuery.FooterSection(action);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DynamicPageQuery.FooterSection value = (DynamicPageQuery.FooterSection) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(UrlHandler.ACTION);
            Adapters.c(Action.f19256a, false).toJson(writer, customScalarAdapters, value.f19240a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/dynamic/page/adapter/DynamicPageQuery_ResponseAdapter$HeaderSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/dynamic/page/DynamicPageQuery$HeaderSection;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HeaderSection implements Adapter<DynamicPageQuery.HeaderSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final HeaderSection f19269a = new HeaderSection();
        public static final List b = CollectionsKt.R("title", "imageUrl", "imageAltText", "shareUrl");

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
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new DynamicPageQuery.HeaderSection(str, str2, str3, str4);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DynamicPageQuery.HeaderSection value = (DynamicPageQuery.HeaderSection) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19241a);
            writer.F1("imageUrl");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("imageAltText");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("shareUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/dynamic/page/adapter/DynamicPageQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/dynamic/page/DynamicPageQuery$Item;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<DynamicPageQuery.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f19270a = new Item();
        public static final List b = CollectionsKt.R("linkCardImage", "linkCardSubtitle", "linkCardTitle", "linkCardAction");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            DynamicPageQuery.LinkCardAction linkCardAction = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    linkCardAction = (DynamicPageQuery.LinkCardAction) Adapters.c(LinkCardAction.f19271a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str3 == null) {
                Assertions.a(reader, "linkCardTitle");
                throw null;
            }
            if (linkCardAction != null) {
                return new DynamicPageQuery.Item(str, str2, str3, linkCardAction);
            }
            Assertions.a(reader, "linkCardAction");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DynamicPageQuery.Item value = (DynamicPageQuery.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("linkCardImage");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f19242a);
            writer.F1("linkCardSubtitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("linkCardTitle");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
            writer.F1("linkCardAction");
            Adapters.c(LinkCardAction.f19271a, false).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/dynamic/page/adapter/DynamicPageQuery_ResponseAdapter$LinkCardAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/dynamic/page/DynamicPageQuery$LinkCardAction;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LinkCardAction implements Adapter<DynamicPageQuery.LinkCardAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final LinkCardAction f19271a = new LinkCardAction();
        public static final List b = CollectionsKt.R("type", UrlHandler.ACTION);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ActionType actionTypeA = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str != null) {
                return new DynamicPageQuery.LinkCardAction(actionTypeA, str);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DynamicPageQuery.LinkCardAction value = (DynamicPageQuery.LinkCardAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.f19243a);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/dynamic/page/adapter/DynamicPageQuery_ResponseAdapter$OnCampaignCardCarousel;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/dynamic/page/DynamicPageQuery$OnCampaignCardCarousel;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCampaignCardCarousel implements Adapter<DynamicPageQuery.OnCampaignCardCarousel> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19272a = CollectionsKt.R("campaignCardCarouselTitle", "campaignCards");

        public static DynamicPageQuery.OnCampaignCardCarousel a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f19272a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(CampaignCard.f19261a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new DynamicPageQuery.OnCampaignCardCarousel(str, arrayListFromJson);
            }
            Assertions.a(reader, "campaignCards");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, DynamicPageQuery.OnCampaignCardCarousel value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("campaignCardCarouselTitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.f19244a);
            writer.F1("campaignCards");
            Adapters.a(Adapters.c(CampaignCard.f19261a, true)).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (DynamicPageQuery.OnCampaignCardCarousel) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/dynamic/page/adapter/DynamicPageQuery_ResponseAdapter$OnCampaignCardList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/dynamic/page/DynamicPageQuery$OnCampaignCardList;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCampaignCardList implements Adapter<DynamicPageQuery.OnCampaignCardList> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19273a = CollectionsKt.R("campaignCardListTitle", "campaignCards");

        public static DynamicPageQuery.OnCampaignCardList a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f19273a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(CampaignCard1.f19262a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new DynamicPageQuery.OnCampaignCardList(str, arrayListFromJson);
            }
            Assertions.a(reader, "campaignCards");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, DynamicPageQuery.OnCampaignCardList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("campaignCardListTitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.f19245a);
            writer.F1("campaignCards");
            Adapters.a(Adapters.c(CampaignCard1.f19262a, true)).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (DynamicPageQuery.OnCampaignCardList) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/dynamic/page/adapter/DynamicPageQuery_ResponseAdapter$OnCampaignCardList1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/dynamic/page/DynamicPageQuery$OnCampaignCardList1;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCampaignCardList1 implements Adapter<DynamicPageQuery.OnCampaignCardList1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19274a = CollectionsKt.R("campaignCardListTitle", "campaignCards");

        public static DynamicPageQuery.OnCampaignCardList1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f19274a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(CampaignCard2.f19263a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new DynamicPageQuery.OnCampaignCardList1(str, arrayListFromJson);
            }
            Assertions.a(reader, "campaignCards");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, DynamicPageQuery.OnCampaignCardList1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("campaignCardListTitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.f19246a);
            writer.F1("campaignCards");
            Adapters.a(Adapters.c(CampaignCard2.f19263a, true)).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (DynamicPageQuery.OnCampaignCardList1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/dynamic/page/adapter/DynamicPageQuery_ResponseAdapter$OnCampaignCopy;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/dynamic/page/DynamicPageQuery$OnCampaignCopy;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCampaignCopy implements Adapter<DynamicPageQuery.OnCampaignCopy> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19275a = CollectionsKt.Q("__typename");

        public static DynamicPageQuery.OnCampaignCopy a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19275a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            CampaignCopy campaignCopyA = CampaignCopyImpl_ResponseAdapter.CampaignCopy.a(reader, customScalarAdapters);
            if (str != null) {
                return new DynamicPageQuery.OnCampaignCopy(str, campaignCopyA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, DynamicPageQuery.OnCampaignCopy value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19247a);
            List list = CampaignCopyImpl_ResponseAdapter.CampaignCopy.f19287a;
            CampaignCopyImpl_ResponseAdapter.CampaignCopy.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (DynamicPageQuery.OnCampaignCopy) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/dynamic/page/adapter/DynamicPageQuery_ResponseAdapter$OnCampaignCopy1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/dynamic/page/DynamicPageQuery$OnCampaignCopy1;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCampaignCopy1 implements Adapter<DynamicPageQuery.OnCampaignCopy1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19276a = CollectionsKt.Q("__typename");

        public static DynamicPageQuery.OnCampaignCopy1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19276a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            CampaignCopy campaignCopyA = CampaignCopyImpl_ResponseAdapter.CampaignCopy.a(reader, customScalarAdapters);
            if (str != null) {
                return new DynamicPageQuery.OnCampaignCopy1(str, campaignCopyA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, DynamicPageQuery.OnCampaignCopy1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19248a);
            List list = CampaignCopyImpl_ResponseAdapter.CampaignCopy.f19287a;
            CampaignCopyImpl_ResponseAdapter.CampaignCopy.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (DynamicPageQuery.OnCampaignCopy1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/dynamic/page/adapter/DynamicPageQuery_ResponseAdapter$OnCampaignTermsAndConditions;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/dynamic/page/DynamicPageQuery$OnCampaignTermsAndConditions;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCampaignTermsAndConditions implements Adapter<DynamicPageQuery.OnCampaignTermsAndConditions> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19277a = CollectionsKt.Q("__typename");

        public static DynamicPageQuery.OnCampaignTermsAndConditions a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19277a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            CampaignTermsAndConditions campaignTermsAndConditionsA = CampaignTermsAndConditionsImpl_ResponseAdapter.CampaignTermsAndConditions.a(reader, customScalarAdapters);
            if (str != null) {
                return new DynamicPageQuery.OnCampaignTermsAndConditions(str, campaignTermsAndConditionsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, DynamicPageQuery.OnCampaignTermsAndConditions value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19249a);
            List list = CampaignTermsAndConditionsImpl_ResponseAdapter.CampaignTermsAndConditions.f19289a;
            CampaignTermsAndConditionsImpl_ResponseAdapter.CampaignTermsAndConditions.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (DynamicPageQuery.OnCampaignTermsAndConditions) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/dynamic/page/adapter/DynamicPageQuery_ResponseAdapter$OnCampaignTermsAndConditions1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/dynamic/page/DynamicPageQuery$OnCampaignTermsAndConditions1;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCampaignTermsAndConditions1 implements Adapter<DynamicPageQuery.OnCampaignTermsAndConditions1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19278a = CollectionsKt.Q("__typename");

        public static DynamicPageQuery.OnCampaignTermsAndConditions1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19278a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            CampaignTermsAndConditions campaignTermsAndConditionsA = CampaignTermsAndConditionsImpl_ResponseAdapter.CampaignTermsAndConditions.a(reader, customScalarAdapters);
            if (str != null) {
                return new DynamicPageQuery.OnCampaignTermsAndConditions1(str, campaignTermsAndConditionsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, DynamicPageQuery.OnCampaignTermsAndConditions1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19250a);
            List list = CampaignTermsAndConditionsImpl_ResponseAdapter.CampaignTermsAndConditions.f19289a;
            CampaignTermsAndConditionsImpl_ResponseAdapter.CampaignTermsAndConditions.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (DynamicPageQuery.OnCampaignTermsAndConditions1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/dynamic/page/adapter/DynamicPageQuery_ResponseAdapter$OnCategoryTileList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/dynamic/page/DynamicPageQuery$OnCategoryTileList;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCategoryTileList implements Adapter<DynamicPageQuery.OnCategoryTileList> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19279a = CollectionsKt.R("categoryTileListTitle", "categoryTileListTiles");

        public static DynamicPageQuery.OnCategoryTileList a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f19279a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(CategoryTileListTile.f19264a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new DynamicPageQuery.OnCategoryTileList(str, arrayListFromJson);
            }
            Assertions.a(reader, "categoryTileListTiles");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, DynamicPageQuery.OnCategoryTileList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("categoryTileListTitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.f19251a);
            writer.F1("categoryTileListTiles");
            Adapters.a(Adapters.c(CategoryTileListTile.f19264a, false)).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (DynamicPageQuery.OnCategoryTileList) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/dynamic/page/adapter/DynamicPageQuery_ResponseAdapter$OnContentList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/dynamic/page/DynamicPageQuery$OnContentList;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnContentList implements Adapter<DynamicPageQuery.OnContentList> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19280a = CollectionsKt.Q("__typename");

        public static DynamicPageQuery.OnContentList a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19280a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ContentList contentListA = ContentListImpl_ResponseAdapter.ContentList.a(reader, customScalarAdapters);
            if (str != null) {
                return new DynamicPageQuery.OnContentList(str, contentListA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, DynamicPageQuery.OnContentList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19252a);
            List list = ContentListImpl_ResponseAdapter.ContentList.f19295a;
            ContentListImpl_ResponseAdapter.ContentList.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (DynamicPageQuery.OnContentList) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/dynamic/page/adapter/DynamicPageQuery_ResponseAdapter$OnContentList1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/dynamic/page/DynamicPageQuery$OnContentList1;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnContentList1 implements Adapter<DynamicPageQuery.OnContentList1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19281a = CollectionsKt.Q("__typename");

        public static DynamicPageQuery.OnContentList1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19281a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ContentList contentListA = ContentListImpl_ResponseAdapter.ContentList.a(reader, customScalarAdapters);
            if (str != null) {
                return new DynamicPageQuery.OnContentList1(str, contentListA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, DynamicPageQuery.OnContentList1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19253a);
            List list = ContentListImpl_ResponseAdapter.ContentList.f19295a;
            ContentListImpl_ResponseAdapter.ContentList.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (DynamicPageQuery.OnContentList1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/dynamic/page/adapter/DynamicPageQuery_ResponseAdapter$OnDynamicPageBottomSheet;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/dynamic/page/DynamicPageQuery$OnDynamicPageBottomSheet;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnDynamicPageBottomSheet implements Adapter<DynamicPageQuery.OnDynamicPageBottomSheet> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19282a = CollectionsKt.R("id", "analytics", "bottomSheetFeedItems");

        public static DynamicPageQuery.OnDynamicPageBottomSheet a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            DynamicPageQuery.Analytics analytics = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f19282a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    analytics = (DynamicPageQuery.Analytics) Adapters.b(Adapters.c(Analytics.f19257a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(BottomSheetFeedItem.f19260a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new DynamicPageQuery.OnDynamicPageBottomSheet(str, analytics, arrayListFromJson);
            }
            Assertions.a(reader, "bottomSheetFeedItems");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, DynamicPageQuery.OnDynamicPageBottomSheet value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19254a);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics.f19257a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("bottomSheetFeedItems");
            Adapters.a(Adapters.c(BottomSheetFeedItem.f19260a, true)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (DynamicPageQuery.OnDynamicPageBottomSheet) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/dynamic/page/adapter/DynamicPageQuery_ResponseAdapter$OnQuickLinkList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/dynamic/page/DynamicPageQuery$OnQuickLinkList;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnQuickLinkList implements Adapter<DynamicPageQuery.OnQuickLinkList> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19283a = CollectionsKt.Q("items");

        public static DynamicPageQuery.OnQuickLinkList a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(f19283a) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(Item.f19270a, false)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new DynamicPageQuery.OnQuickLinkList(arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, DynamicPageQuery.OnQuickLinkList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("items");
            Adapters.a(Adapters.c(Item.f19270a, false)).toJson(writer, customScalarAdapters, value.f19255a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (DynamicPageQuery.OnQuickLinkList) obj);
        }
    }
}
