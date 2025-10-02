package com.woolworths.shop.specials.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.graphql.common.fragment.ProductCardImpl_ResponseAdapter;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFieldsImpl_ResponseAdapter;
import au.com.woolworths.shop.aem.components.contentcard.fragment.ContentCard;
import au.com.woolworths.shop.aem.components.contentcard.fragment.ContentCardImpl_ResponseAdapter;
import au.com.woolworths.shop.aem.components.offercard.fragment.OfferCard;
import au.com.woolworths.shop.aem.components.offercard.fragment.OfferCardImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.BannerImageFormat;
import au.com.woolworths.shop.graphql.type.CardHeight;
import au.com.woolworths.shop.graphql.type.CatalogueCardType;
import au.com.woolworths.shop.graphql.type.FooterStyle;
import au.com.woolworths.shop.graphql.type.ParagraphTextItemType;
import au.com.woolworths.shop.graphql.type.adapter.ActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.BannerImageFormat_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CardHeight_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CatalogueCardType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.FooterStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ParagraphTextItemType_ResponseAdapter;
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
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.woolworths.shop.specials.SpecialsHomeQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\bÇ\u0002\u0018\u00002\u00020\u0001:\u0019\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/woolworths/shop/specials/adapter/SpecialsHomeQuery_ResponseAdapter;", "", "Data", "SpecialsHome", "Item", "OnHorizontalList", "Item1", "OnQuickLinkCard", "LinkCardAction", "OnProductCard", "OnOfferCard", "OnContentCard", "OnPromotionCard", "PromotionCardProduct", "OnCatalogueCard", "OnChatEntryCard", "ChatEntryCardAction", "Analytics", "OnActionableCard", "OnEditorialBanner", "EditorialBannerImage", "EditorialBannerAction", "Analytics1", "EditorialBannerFooter", "Logo", "EditorialBannerAnalytics", "OnParagraphTextItem", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SpecialsHomeQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/specials/adapter/SpecialsHomeQuery_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/specials/SpecialsHomeQuery$Analytics;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<SpecialsHomeQuery.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f23730a = new Analytics();
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
                return new SpecialsHomeQuery.Analytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SpecialsHomeQuery.Analytics value = (SpecialsHomeQuery.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23705a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/specials/adapter/SpecialsHomeQuery_ResponseAdapter$Analytics1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/specials/SpecialsHomeQuery$Analytics1;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics1 implements Adapter<SpecialsHomeQuery.Analytics1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics1 f23731a = new Analytics1();
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
                return new SpecialsHomeQuery.Analytics1(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SpecialsHomeQuery.Analytics1 value = (SpecialsHomeQuery.Analytics1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23706a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/specials/adapter/SpecialsHomeQuery_ResponseAdapter$ChatEntryCardAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/specials/SpecialsHomeQuery$ChatEntryCardAction;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ChatEntryCardAction implements Adapter<SpecialsHomeQuery.ChatEntryCardAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final ChatEntryCardAction f23732a = new ChatEntryCardAction();
        public static final List b = CollectionsKt.R("type", UrlHandler.ACTION, "id", "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ActionType actionTypeA = null;
            String str = null;
            String str2 = null;
            SpecialsHomeQuery.Analytics analytics = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    analytics = (SpecialsHomeQuery.Analytics) Adapters.b(Adapters.c(Analytics.f23730a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str != null) {
                return new SpecialsHomeQuery.ChatEntryCardAction(actionTypeA, str, str2, analytics);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SpecialsHomeQuery.ChatEntryCardAction value = (SpecialsHomeQuery.ChatEntryCardAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.f23707a);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics.f23730a, true)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/specials/adapter/SpecialsHomeQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/specials/SpecialsHomeQuery$Data;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<SpecialsHomeQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f23733a = new Data();
        public static final List b = CollectionsKt.Q("specialsHome");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            SpecialsHomeQuery.SpecialsHome specialsHome = null;
            while (reader.o2(b) == 0) {
                specialsHome = (SpecialsHomeQuery.SpecialsHome) Adapters.b(Adapters.c(SpecialsHome.f23754a, false)).fromJson(reader, customScalarAdapters);
            }
            return new SpecialsHomeQuery.Data(specialsHome);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SpecialsHomeQuery.Data value = (SpecialsHomeQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("specialsHome");
            Adapters.b(Adapters.c(SpecialsHome.f23754a, false)).toJson(writer, customScalarAdapters, value.f23708a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/specials/adapter/SpecialsHomeQuery_ResponseAdapter$EditorialBannerAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/specials/SpecialsHomeQuery$EditorialBannerAction;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EditorialBannerAction implements Adapter<SpecialsHomeQuery.EditorialBannerAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final EditorialBannerAction f23734a = new EditorialBannerAction();
        public static final List b = CollectionsKt.R("type", UrlHandler.ACTION, "id", "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ActionType actionTypeA = null;
            String str = null;
            String str2 = null;
            SpecialsHomeQuery.Analytics1 analytics1 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    analytics1 = (SpecialsHomeQuery.Analytics1) Adapters.b(Adapters.c(Analytics1.f23731a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str != null) {
                return new SpecialsHomeQuery.EditorialBannerAction(actionTypeA, str, str2, analytics1);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SpecialsHomeQuery.EditorialBannerAction value = (SpecialsHomeQuery.EditorialBannerAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.f23709a);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics1.f23731a, true)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/specials/adapter/SpecialsHomeQuery_ResponseAdapter$EditorialBannerAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/specials/SpecialsHomeQuery$EditorialBannerAnalytics;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EditorialBannerAnalytics implements Adapter<SpecialsHomeQuery.EditorialBannerAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final EditorialBannerAnalytics f23735a = new EditorialBannerAnalytics();
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
                return new SpecialsHomeQuery.EditorialBannerAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SpecialsHomeQuery.EditorialBannerAnalytics value = (SpecialsHomeQuery.EditorialBannerAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23710a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/specials/adapter/SpecialsHomeQuery_ResponseAdapter$EditorialBannerFooter;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/specials/SpecialsHomeQuery$EditorialBannerFooter;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EditorialBannerFooter implements Adapter<SpecialsHomeQuery.EditorialBannerFooter> {

        /* renamed from: a, reason: collision with root package name */
        public static final EditorialBannerFooter f23736a = new EditorialBannerFooter();
        public static final List b = CollectionsKt.R("style", TextBundle.TEXT_ENTRY, "logo");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            FooterStyle footerStyleA = null;
            String str = null;
            SpecialsHomeQuery.Logo logo = null;
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
                    logo = (SpecialsHomeQuery.Logo) Adapters.b(Adapters.c(Logo.f23741a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (footerStyleA != null) {
                return new SpecialsHomeQuery.EditorialBannerFooter(footerStyleA, str, logo);
            }
            Assertions.a(reader, "style");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SpecialsHomeQuery.EditorialBannerFooter value = (SpecialsHomeQuery.EditorialBannerFooter) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("style");
            FooterStyle_ResponseAdapter.b(writer, customScalarAdapters, value.f23711a);
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("logo");
            Adapters.b(Adapters.c(Logo.f23741a, false)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/specials/adapter/SpecialsHomeQuery_ResponseAdapter$EditorialBannerImage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/specials/SpecialsHomeQuery$EditorialBannerImage;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EditorialBannerImage implements Adapter<SpecialsHomeQuery.EditorialBannerImage> {

        /* renamed from: a, reason: collision with root package name */
        public static final EditorialBannerImage f23737a = new EditorialBannerImage();
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
                return new SpecialsHomeQuery.EditorialBannerImage(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SpecialsHomeQuery.EditorialBannerImage value = (SpecialsHomeQuery.EditorialBannerImage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("imageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23712a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/specials/adapter/SpecialsHomeQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/specials/SpecialsHomeQuery$Item;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<SpecialsHomeQuery.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f23738a = new Item();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            SpecialsHomeQuery.OnHorizontalList onHorizontalListA;
            SpecialsHomeQuery.OnCatalogueCard onCatalogueCardA;
            SpecialsHomeQuery.OnChatEntryCard onChatEntryCardA;
            SpecialsHomeQuery.OnActionableCard onActionableCardA;
            SpecialsHomeQuery.OnEditorialBanner onEditorialBannerA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            SpecialsHomeQuery.OnParagraphTextItem onParagraphTextItemA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HorizontalList"))) {
                reader.o();
                onHorizontalListA = OnHorizontalList.a(reader, customScalarAdapters);
            } else {
                onHorizontalListA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CatalogueCard"))) {
                reader.o();
                onCatalogueCardA = OnCatalogueCard.a(reader, customScalarAdapters);
            } else {
                onCatalogueCardA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("ChatEntryCard"), BooleanExpressions.d("includeChatEntryCard")))) {
                reader.o();
                onChatEntryCardA = OnChatEntryCard.a(reader, customScalarAdapters);
            } else {
                onChatEntryCardA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("ActionableCard"), BooleanExpressions.d("includeActionableCard")))) {
                reader.o();
                onActionableCardA = OnActionableCard.a(reader, customScalarAdapters);
            } else {
                onActionableCardA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("EditorialBanner"), BooleanExpressions.d("includeEditorialBanner")))) {
                reader.o();
                onEditorialBannerA = OnEditorialBanner.a(reader, customScalarAdapters);
            } else {
                onEditorialBannerA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("ParagraphTextItem"), BooleanExpressions.d("includeParagraphText")))) {
                reader.o();
                onParagraphTextItemA = OnParagraphTextItem.a(reader, customScalarAdapters);
            }
            return new SpecialsHomeQuery.Item(str, onHorizontalListA, onCatalogueCardA, onChatEntryCardA, onActionableCardA, onEditorialBannerA, onParagraphTextItemA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SpecialsHomeQuery.Item value = (SpecialsHomeQuery.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23713a);
            SpecialsHomeQuery.OnHorizontalList onHorizontalList = value.b;
            if (onHorizontalList != null) {
                OnHorizontalList.b(writer, customScalarAdapters, onHorizontalList);
            }
            SpecialsHomeQuery.OnCatalogueCard onCatalogueCard = value.c;
            if (onCatalogueCard != null) {
                OnCatalogueCard.b(writer, customScalarAdapters, onCatalogueCard);
            }
            SpecialsHomeQuery.OnChatEntryCard onChatEntryCard = value.d;
            if (onChatEntryCard != null) {
                OnChatEntryCard.b(writer, customScalarAdapters, onChatEntryCard);
            }
            SpecialsHomeQuery.OnActionableCard onActionableCard = value.e;
            if (onActionableCard != null) {
                OnActionableCard.b(writer, customScalarAdapters, onActionableCard);
            }
            SpecialsHomeQuery.OnEditorialBanner onEditorialBanner = value.f;
            if (onEditorialBanner != null) {
                OnEditorialBanner.b(writer, customScalarAdapters, onEditorialBanner);
            }
            SpecialsHomeQuery.OnParagraphTextItem onParagraphTextItem = value.g;
            if (onParagraphTextItem != null) {
                OnParagraphTextItem.b(writer, customScalarAdapters, onParagraphTextItem);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/specials/adapter/SpecialsHomeQuery_ResponseAdapter$Item1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/specials/SpecialsHomeQuery$Item1;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item1 implements Adapter<SpecialsHomeQuery.Item1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item1 f23739a = new Item1();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            SpecialsHomeQuery.OnQuickLinkCard onQuickLinkCardA;
            SpecialsHomeQuery.OnProductCard onProductCardA;
            SpecialsHomeQuery.OnOfferCard onOfferCardA;
            SpecialsHomeQuery.OnContentCard onContentCardA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            SpecialsHomeQuery.OnPromotionCard onPromotionCardA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("QuickLinkCard"))) {
                reader.o();
                onQuickLinkCardA = OnQuickLinkCard.a(reader, customScalarAdapters);
            } else {
                onQuickLinkCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductCard"))) {
                reader.o();
                onProductCardA = OnProductCard.a(reader, customScalarAdapters);
            } else {
                onProductCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("OfferCard"))) {
                reader.o();
                onOfferCardA = OnOfferCard.a(reader, customScalarAdapters);
            } else {
                onOfferCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ContentCard"))) {
                reader.o();
                onContentCardA = OnContentCard.a(reader, customScalarAdapters);
            } else {
                onContentCardA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("PromotionCard"), BooleanExpressions.d("includePromotionCard")))) {
                reader.o();
                onPromotionCardA = OnPromotionCard.a(reader, customScalarAdapters);
            }
            return new SpecialsHomeQuery.Item1(str, onQuickLinkCardA, onProductCardA, onOfferCardA, onContentCardA, onPromotionCardA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SpecialsHomeQuery.Item1 value = (SpecialsHomeQuery.Item1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23714a);
            SpecialsHomeQuery.OnQuickLinkCard onQuickLinkCard = value.b;
            if (onQuickLinkCard != null) {
                OnQuickLinkCard.b(writer, customScalarAdapters, onQuickLinkCard);
            }
            SpecialsHomeQuery.OnProductCard onProductCard = value.c;
            if (onProductCard != null) {
                OnProductCard.b(writer, customScalarAdapters, onProductCard);
            }
            SpecialsHomeQuery.OnOfferCard onOfferCard = value.d;
            if (onOfferCard != null) {
                OnOfferCard.b(writer, customScalarAdapters, onOfferCard);
            }
            SpecialsHomeQuery.OnContentCard onContentCard = value.e;
            if (onContentCard != null) {
                OnContentCard.b(writer, customScalarAdapters, onContentCard);
            }
            SpecialsHomeQuery.OnPromotionCard onPromotionCard = value.f;
            if (onPromotionCard != null) {
                OnPromotionCard.b(writer, customScalarAdapters, onPromotionCard);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/specials/adapter/SpecialsHomeQuery_ResponseAdapter$LinkCardAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/specials/SpecialsHomeQuery$LinkCardAction;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LinkCardAction implements Adapter<SpecialsHomeQuery.LinkCardAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final LinkCardAction f23740a = new LinkCardAction();
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
                return new SpecialsHomeQuery.LinkCardAction(actionTypeA, str);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SpecialsHomeQuery.LinkCardAction value = (SpecialsHomeQuery.LinkCardAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.f23715a);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/specials/adapter/SpecialsHomeQuery_ResponseAdapter$Logo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/specials/SpecialsHomeQuery$Logo;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Logo implements Adapter<SpecialsHomeQuery.Logo> {

        /* renamed from: a, reason: collision with root package name */
        public static final Logo f23741a = new Logo();
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
                return new SpecialsHomeQuery.Logo(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SpecialsHomeQuery.Logo value = (SpecialsHomeQuery.Logo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("imageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23716a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/specials/adapter/SpecialsHomeQuery_ResponseAdapter$OnActionableCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/specials/SpecialsHomeQuery$OnActionableCard;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnActionableCard implements Adapter<SpecialsHomeQuery.OnActionableCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23742a = CollectionsKt.R("cardHeight", "altText", "image", "link");

        public static SpecialsHomeQuery.OnActionableCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CardHeight cardHeightA = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(f23742a);
                if (iO2 == 0) {
                    cardHeightA = CardHeight_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (cardHeightA == null) {
                Assertions.a(reader, "cardHeight");
                throw null;
            }
            if (str == null) {
                Assertions.a(reader, "altText");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "image");
                throw null;
            }
            if (str3 != null) {
                return new SpecialsHomeQuery.OnActionableCard(cardHeightA, str, str2, str3);
            }
            Assertions.a(reader, "link");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SpecialsHomeQuery.OnActionableCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("cardHeight");
            CardHeight_ResponseAdapter.b(writer, customScalarAdapters, value.f23717a);
            writer.F1("altText");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("image");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("link");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (SpecialsHomeQuery.OnActionableCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/specials/adapter/SpecialsHomeQuery_ResponseAdapter$OnCatalogueCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/specials/SpecialsHomeQuery$OnCatalogueCard;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCatalogueCard implements Adapter<SpecialsHomeQuery.OnCatalogueCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23743a = CollectionsKt.R("catalogueCardId", "title", "catalogueCardSubtitle", "imageLeft", "catalogueCardType");

        public static SpecialsHomeQuery.OnCatalogueCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            CatalogueCardType catalogueCardType = null;
            while (true) {
                int iO2 = reader.o2(f23743a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    catalogueCardType = (CatalogueCardType) Adapters.b(CatalogueCardType_ResponseAdapter.f12046a).fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 != null) {
                return new SpecialsHomeQuery.OnCatalogueCard(str, str2, str3, str4, catalogueCardType);
            }
            Assertions.a(reader, "catalogueCardSubtitle");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SpecialsHomeQuery.OnCatalogueCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("catalogueCardId");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f23718a);
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("catalogueCardSubtitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("imageLeft");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("catalogueCardType");
            Adapters.b(CatalogueCardType_ResponseAdapter.f12046a).toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (SpecialsHomeQuery.OnCatalogueCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/specials/adapter/SpecialsHomeQuery_ResponseAdapter$OnChatEntryCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/specials/SpecialsHomeQuery$OnChatEntryCard;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnChatEntryCard implements Adapter<SpecialsHomeQuery.OnChatEntryCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23744a = CollectionsKt.R("chatEntryCardTitle", "chatEntryCardSubtitle", "chatEntryCardShowBeta", "chatEntryCardTextPrompts", "chatEntryCardImageUrl", "chatEntryCardAction");

        public static SpecialsHomeQuery.OnChatEntryCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            Boolean bool = null;
            ArrayList arrayListFromJson = null;
            String str3 = null;
            SpecialsHomeQuery.ChatEntryCardAction chatEntryCardAction = null;
            while (true) {
                int iO2 = reader.o2(f23744a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    arrayListFromJson = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    chatEntryCardAction = (SpecialsHomeQuery.ChatEntryCardAction) Adapters.c(ChatEntryCardAction.f23732a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "chatEntryCardTitle");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "chatEntryCardSubtitle");
                throw null;
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "chatEntryCardTextPrompts");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "chatEntryCardImageUrl");
                throw null;
            }
            if (chatEntryCardAction != null) {
                return new SpecialsHomeQuery.OnChatEntryCard(str, str2, bool, arrayListFromJson, str3, chatEntryCardAction);
            }
            Assertions.a(reader, "chatEntryCardAction");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SpecialsHomeQuery.OnChatEntryCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("chatEntryCardTitle");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23719a);
            writer.F1("chatEntryCardSubtitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("chatEntryCardShowBeta");
            Adapters.l.toJson(writer, customScalarAdapters, value.c);
            writer.F1("chatEntryCardTextPrompts");
            Adapters.a(adapters$StringAdapter$1).toJson(writer, customScalarAdapters, value.d);
            writer.F1("chatEntryCardImageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("chatEntryCardAction");
            Adapters.c(ChatEntryCardAction.f23732a, false).toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (SpecialsHomeQuery.OnChatEntryCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/specials/adapter/SpecialsHomeQuery_ResponseAdapter$OnContentCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/specials/SpecialsHomeQuery$OnContentCard;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnContentCard implements Adapter<SpecialsHomeQuery.OnContentCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23745a = CollectionsKt.Q("__typename");

        public static SpecialsHomeQuery.OnContentCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23745a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ContentCard contentCardA = ContentCardImpl_ResponseAdapter.ContentCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new SpecialsHomeQuery.OnContentCard(str, contentCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SpecialsHomeQuery.OnContentCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23720a);
            List list = ContentCardImpl_ResponseAdapter.ContentCard.f10134a;
            ContentCardImpl_ResponseAdapter.ContentCard.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (SpecialsHomeQuery.OnContentCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/specials/adapter/SpecialsHomeQuery_ResponseAdapter$OnEditorialBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/specials/SpecialsHomeQuery$OnEditorialBanner;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnEditorialBanner implements Adapter<SpecialsHomeQuery.OnEditorialBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23746a = CollectionsKt.R("editorialBannerId", "editorialBannerBackgroundColour", "editorialBannerImage", "editorialBannerTitle", "editorialBannerSubtitle", "editorialBannerAction", "editorialBannerFooter", "editorialBannerImageFormat", "editorialBannerAnalytics");

        public static SpecialsHomeQuery.OnEditorialBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            SpecialsHomeQuery.EditorialBannerImage editorialBannerImage = null;
            String str3 = null;
            String str4 = null;
            SpecialsHomeQuery.EditorialBannerAction editorialBannerAction = null;
            SpecialsHomeQuery.EditorialBannerFooter editorialBannerFooter = null;
            BannerImageFormat bannerImageFormatA = null;
            SpecialsHomeQuery.EditorialBannerAnalytics editorialBannerAnalytics = null;
            while (true) {
                switch (reader.o2(f23746a)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        editorialBannerImage = (SpecialsHomeQuery.EditorialBannerImage) Adapters.b(Adapters.c(EditorialBannerImage.f23737a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        editorialBannerAction = (SpecialsHomeQuery.EditorialBannerAction) Adapters.b(Adapters.c(EditorialBannerAction.f23734a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        editorialBannerFooter = (SpecialsHomeQuery.EditorialBannerFooter) Adapters.b(Adapters.c(EditorialBannerFooter.f23736a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        bannerImageFormatA = BannerImageFormat_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    case 8:
                        editorialBannerAnalytics = (SpecialsHomeQuery.EditorialBannerAnalytics) Adapters.b(Adapters.c(EditorialBannerAnalytics.f23735a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "editorialBannerId");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "editorialBannerBackgroundColour");
                            throw null;
                        }
                        if (bannerImageFormatA != null) {
                            return new SpecialsHomeQuery.OnEditorialBanner(str, str2, editorialBannerImage, str3, str4, editorialBannerAction, editorialBannerFooter, bannerImageFormatA, editorialBannerAnalytics);
                        }
                        Assertions.a(reader, "editorialBannerImageFormat");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SpecialsHomeQuery.OnEditorialBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("editorialBannerId");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23721a);
            writer.F1("editorialBannerBackgroundColour");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("editorialBannerImage");
            Adapters.b(Adapters.c(EditorialBannerImage.f23737a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("editorialBannerTitle");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("editorialBannerSubtitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("editorialBannerAction");
            Adapters.b(Adapters.c(EditorialBannerAction.f23734a, false)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("editorialBannerFooter");
            Adapters.b(Adapters.c(EditorialBannerFooter.f23736a, false)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("editorialBannerImageFormat");
            BannerImageFormat_ResponseAdapter.b(writer, customScalarAdapters, value.h);
            writer.F1("editorialBannerAnalytics");
            Adapters.b(Adapters.c(EditorialBannerAnalytics.f23735a, true)).toJson(writer, customScalarAdapters, value.i);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (SpecialsHomeQuery.OnEditorialBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/specials/adapter/SpecialsHomeQuery_ResponseAdapter$OnHorizontalList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/specials/SpecialsHomeQuery$OnHorizontalList;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHorizontalList implements Adapter<SpecialsHomeQuery.OnHorizontalList> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23747a = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "actionTitle", "deepLink", "items");

        public static SpecialsHomeQuery.OnHorizontalList a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f23747a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Item1.f23739a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new SpecialsHomeQuery.OnHorizontalList(str, str2, str3, str4, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SpecialsHomeQuery.OnHorizontalList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23722a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("actionTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("deepLink");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("items");
            Adapters.a(Adapters.c(Item1.f23739a, true)).toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (SpecialsHomeQuery.OnHorizontalList) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/specials/adapter/SpecialsHomeQuery_ResponseAdapter$OnOfferCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/specials/SpecialsHomeQuery$OnOfferCard;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnOfferCard implements Adapter<SpecialsHomeQuery.OnOfferCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23748a = CollectionsKt.Q("__typename");

        public static SpecialsHomeQuery.OnOfferCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23748a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            OfferCard offerCardA = OfferCardImpl_ResponseAdapter.OfferCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new SpecialsHomeQuery.OnOfferCard(str, offerCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SpecialsHomeQuery.OnOfferCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23723a);
            List list = OfferCardImpl_ResponseAdapter.OfferCard.f10194a;
            OfferCardImpl_ResponseAdapter.OfferCard.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (SpecialsHomeQuery.OnOfferCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/specials/adapter/SpecialsHomeQuery_ResponseAdapter$OnParagraphTextItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/specials/SpecialsHomeQuery$OnParagraphTextItem;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnParagraphTextItem implements Adapter<SpecialsHomeQuery.OnParagraphTextItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23749a = CollectionsKt.R("content", "type");

        public static SpecialsHomeQuery.OnParagraphTextItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ParagraphTextItemType paragraphTextItemTypeA = null;
            while (true) {
                int iO2 = reader.o2(f23749a);
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
                return new SpecialsHomeQuery.OnParagraphTextItem(paragraphTextItemTypeA, str);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SpecialsHomeQuery.OnParagraphTextItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("content");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23724a);
            writer.F1("type");
            ParagraphTextItemType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (SpecialsHomeQuery.OnParagraphTextItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/specials/adapter/SpecialsHomeQuery_ResponseAdapter$OnProductCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/specials/SpecialsHomeQuery$OnProductCard;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductCard implements Adapter<SpecialsHomeQuery.OnProductCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23750a = CollectionsKt.Q("__typename");

        public static SpecialsHomeQuery.OnProductCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23750a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new SpecialsHomeQuery.OnProductCard(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SpecialsHomeQuery.OnProductCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23725a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (SpecialsHomeQuery.OnProductCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/specials/adapter/SpecialsHomeQuery_ResponseAdapter$OnPromotionCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/specials/SpecialsHomeQuery$OnPromotionCard;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPromotionCard implements Adapter<SpecialsHomeQuery.OnPromotionCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23751a = CollectionsKt.R("promotionCardProduct", "promotionCardOfferId");

        public static SpecialsHomeQuery.OnPromotionCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            SpecialsHomeQuery.PromotionCardProduct promotionCardProduct = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(f23751a);
                if (iO2 == 0) {
                    promotionCardProduct = (SpecialsHomeQuery.PromotionCardProduct) Adapters.c(PromotionCardProduct.f23753a, true).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (promotionCardProduct != null) {
                return new SpecialsHomeQuery.OnPromotionCard(promotionCardProduct, str);
            }
            Assertions.a(reader, "promotionCardProduct");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SpecialsHomeQuery.OnPromotionCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("promotionCardProduct");
            Adapters.c(PromotionCardProduct.f23753a, true).toJson(writer, customScalarAdapters, value.f23726a);
            writer.F1("promotionCardOfferId");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (SpecialsHomeQuery.OnPromotionCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/specials/adapter/SpecialsHomeQuery_ResponseAdapter$OnQuickLinkCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/specials/SpecialsHomeQuery$OnQuickLinkCard;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnQuickLinkCard implements Adapter<SpecialsHomeQuery.OnQuickLinkCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23752a = CollectionsKt.R("linkCardImage", "linkCardTitle", "linkCardAction");

        public static SpecialsHomeQuery.OnQuickLinkCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            SpecialsHomeQuery.LinkCardAction linkCardAction = null;
            while (true) {
                int iO2 = reader.o2(f23752a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    linkCardAction = (SpecialsHomeQuery.LinkCardAction) Adapters.c(LinkCardAction.f23740a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 == null) {
                Assertions.a(reader, "linkCardTitle");
                throw null;
            }
            if (linkCardAction != null) {
                return new SpecialsHomeQuery.OnQuickLinkCard(str, str2, linkCardAction);
            }
            Assertions.a(reader, "linkCardAction");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SpecialsHomeQuery.OnQuickLinkCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("linkCardImage");
            Adapters.i.toJson(writer, customScalarAdapters, value.f23727a);
            writer.F1("linkCardTitle");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("linkCardAction");
            Adapters.c(LinkCardAction.f23740a, false).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (SpecialsHomeQuery.OnQuickLinkCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/specials/adapter/SpecialsHomeQuery_ResponseAdapter$PromotionCardProduct;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/specials/SpecialsHomeQuery$PromotionCardProduct;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PromotionCardProduct implements Adapter<SpecialsHomeQuery.PromotionCardProduct> {

        /* renamed from: a, reason: collision with root package name */
        public static final PromotionCardProduct f23753a = new PromotionCardProduct();
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
                return new SpecialsHomeQuery.PromotionCardProduct(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SpecialsHomeQuery.PromotionCardProduct value = (SpecialsHomeQuery.PromotionCardProduct) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23728a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/specials/adapter/SpecialsHomeQuery_ResponseAdapter$SpecialsHome;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/specials/SpecialsHomeQuery$SpecialsHome;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SpecialsHome implements Adapter<SpecialsHomeQuery.SpecialsHome> {

        /* renamed from: a, reason: collision with root package name */
        public static final SpecialsHome f23754a = new SpecialsHome();
        public static final List b = CollectionsKt.Q("items");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(b) == 0) {
                arrayListFromJson = Adapters.a(Adapters.b(Adapters.c(Item.f23738a, true))).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new SpecialsHomeQuery.SpecialsHome(arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SpecialsHomeQuery.SpecialsHome value = (SpecialsHomeQuery.SpecialsHome) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("items");
            Adapters.a(Adapters.b(Adapters.c(Item.f23738a, true))).toJson(writer, customScalarAdapters, value.f23729a);
        }
    }
}
