package com.woolworths.feature.shop.contentpage.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFieldsImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.BannerImageFormat;
import au.com.woolworths.shop.graphql.type.BannerTextPosition;
import au.com.woolworths.shop.graphql.type.FooterStyle;
import au.com.woolworths.shop.graphql.type.adapter.BannerImageFormat_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.BannerTextPosition_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.FooterStyle_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.contentpage.fragment.ActionFieldsImpl_ResponseAdapter;
import com.woolworths.feature.shop.contentpage.fragment.EditorialBanner;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/EditorialBannerImpl_ResponseAdapter;", "", "EditorialBanner", "EditorialBannerImage", "EditorialBannerAction", "EditorialBannerFooter", "Logo", "EditorialBannerAnalytics", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EditorialBannerImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/EditorialBannerImpl_ResponseAdapter$EditorialBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/EditorialBanner;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EditorialBanner implements Adapter<com.woolworths.feature.shop.contentpage.fragment.EditorialBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19762a = CollectionsKt.R("editorialBannerId", "editorialBannerBackgroundColour", "editorialBannerImage", "editorialBannerTitle", "editorialBannerSubtitle", "editorialBannerAction", "editorialBannerFooter", "editorialBannerImageFormat", "editorialBannerTextPosition", "editorialBannerAnalytics");

        public static com.woolworths.feature.shop.contentpage.fragment.EditorialBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            EditorialBanner.EditorialBannerImage editorialBannerImage = null;
            String str3 = null;
            String str4 = null;
            EditorialBanner.EditorialBannerAction editorialBannerAction = null;
            EditorialBanner.EditorialBannerFooter editorialBannerFooter = null;
            BannerImageFormat bannerImageFormatA = null;
            BannerTextPosition bannerTextPosition = null;
            EditorialBanner.EditorialBannerAnalytics editorialBannerAnalytics = null;
            while (true) {
                switch (reader.o2(f19762a)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        editorialBannerImage = (EditorialBanner.EditorialBannerImage) Adapters.b(Adapters.c(EditorialBannerImage.f19766a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        editorialBannerAction = (EditorialBanner.EditorialBannerAction) Adapters.b(Adapters.c(EditorialBannerAction.f19763a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        editorialBannerFooter = (EditorialBanner.EditorialBannerFooter) Adapters.b(Adapters.c(EditorialBannerFooter.f19765a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        bannerImageFormatA = BannerImageFormat_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    case 8:
                        bannerTextPosition = (BannerTextPosition) Adapters.b(BannerTextPosition_ResponseAdapter.f12036a).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        editorialBannerAnalytics = (EditorialBanner.EditorialBannerAnalytics) Adapters.b(Adapters.c(EditorialBannerAnalytics.f19764a, true)).fromJson(reader, customScalarAdapters);
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
                            return new com.woolworths.feature.shop.contentpage.fragment.EditorialBanner(str, str2, editorialBannerImage, str3, str4, editorialBannerAction, editorialBannerFooter, bannerImageFormatA, bannerTextPosition, editorialBannerAnalytics);
                        }
                        Assertions.a(reader, "editorialBannerImageFormat");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, com.woolworths.feature.shop.contentpage.fragment.EditorialBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("editorialBannerId");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19756a);
            writer.F1("editorialBannerBackgroundColour");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("editorialBannerImage");
            Adapters.b(Adapters.c(EditorialBannerImage.f19766a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("editorialBannerTitle");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("editorialBannerSubtitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("editorialBannerAction");
            Adapters.b(Adapters.c(EditorialBannerAction.f19763a, true)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("editorialBannerFooter");
            Adapters.b(Adapters.c(EditorialBannerFooter.f19765a, false)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("editorialBannerImageFormat");
            BannerImageFormat_ResponseAdapter.b(writer, customScalarAdapters, value.h);
            writer.F1("editorialBannerTextPosition");
            Adapters.b(BannerTextPosition_ResponseAdapter.f12036a).toJson(writer, customScalarAdapters, value.i);
            writer.F1("editorialBannerAnalytics");
            Adapters.b(Adapters.c(EditorialBannerAnalytics.f19764a, true)).toJson(writer, customScalarAdapters, value.j);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (com.woolworths.feature.shop.contentpage.fragment.EditorialBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/EditorialBannerImpl_ResponseAdapter$EditorialBannerAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/EditorialBanner$EditorialBannerAction;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EditorialBannerAction implements Adapter<EditorialBanner.EditorialBannerAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final EditorialBannerAction f19763a = new EditorialBannerAction();
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
                return new EditorialBanner.EditorialBannerAction(str, actionFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EditorialBanner.EditorialBannerAction value = (EditorialBanner.EditorialBannerAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19757a);
            List list = ActionFieldsImpl_ResponseAdapter.ActionFields.f19526a;
            ActionFieldsImpl_ResponseAdapter.ActionFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/EditorialBannerImpl_ResponseAdapter$EditorialBannerAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/EditorialBanner$EditorialBannerAnalytics;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EditorialBannerAnalytics implements Adapter<EditorialBanner.EditorialBannerAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final EditorialBannerAnalytics f19764a = new EditorialBannerAnalytics();
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
                return new EditorialBanner.EditorialBannerAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EditorialBanner.EditorialBannerAnalytics value = (EditorialBanner.EditorialBannerAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19758a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/EditorialBannerImpl_ResponseAdapter$EditorialBannerFooter;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/EditorialBanner$EditorialBannerFooter;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EditorialBannerFooter implements Adapter<EditorialBanner.EditorialBannerFooter> {

        /* renamed from: a, reason: collision with root package name */
        public static final EditorialBannerFooter f19765a = new EditorialBannerFooter();
        public static final List b = CollectionsKt.R("style", TextBundle.TEXT_ENTRY, "logo");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            FooterStyle footerStyleA = null;
            String str = null;
            EditorialBanner.Logo logo = null;
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
                    logo = (EditorialBanner.Logo) Adapters.b(Adapters.c(Logo.f19767a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (footerStyleA != null) {
                return new EditorialBanner.EditorialBannerFooter(footerStyleA, str, logo);
            }
            Assertions.a(reader, "style");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EditorialBanner.EditorialBannerFooter value = (EditorialBanner.EditorialBannerFooter) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("style");
            FooterStyle_ResponseAdapter.b(writer, customScalarAdapters, value.f19759a);
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("logo");
            Adapters.b(Adapters.c(Logo.f19767a, false)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/EditorialBannerImpl_ResponseAdapter$EditorialBannerImage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/EditorialBanner$EditorialBannerImage;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EditorialBannerImage implements Adapter<EditorialBanner.EditorialBannerImage> {

        /* renamed from: a, reason: collision with root package name */
        public static final EditorialBannerImage f19766a = new EditorialBannerImage();
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
                return new EditorialBanner.EditorialBannerImage(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EditorialBanner.EditorialBannerImage value = (EditorialBanner.EditorialBannerImage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("imageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19760a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/EditorialBannerImpl_ResponseAdapter$Logo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/EditorialBanner$Logo;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Logo implements Adapter<EditorialBanner.Logo> {

        /* renamed from: a, reason: collision with root package name */
        public static final Logo f19767a = new Logo();
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
                return new EditorialBanner.Logo(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EditorialBanner.Logo value = (EditorialBanner.Logo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("imageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19761a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }
}
