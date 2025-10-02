package au.com.woolworths.shop.aem.components.contentcard.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.aem.components.contentcard.fragment.ContentCard;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.FooterStyle;
import au.com.woolworths.shop.graphql.type.adapter.ActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.FooterStyle_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/shop/aem/components/contentcard/fragment/ContentCardImpl_ResponseAdapter;", "", "ContentCard", "ContentCardAction", "ContentCardBrandImage", "ContentCardFooter", "Logo", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ContentCardImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/aem/components/contentcard/fragment/ContentCardImpl_ResponseAdapter$ContentCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/aem/components/contentcard/fragment/ContentCard;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContentCard implements Adapter<au.com.woolworths.shop.aem.components.contentcard.fragment.ContentCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f10134a = CollectionsKt.R("contentCardId", "contentCardImageUrl", "contentCardTitle", "contentCardDescription", "contentCardAction", "contentCardBrandImage", "contentCardFooter");

        public static au.com.woolworths.shop.aem.components.contentcard.fragment.ContentCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ContentCard.ContentCardAction contentCardAction = null;
            ContentCard.ContentCardBrandImage contentCardBrandImage = null;
            ContentCard.ContentCardFooter contentCardFooter = null;
            while (true) {
                switch (reader.o2(f10134a)) {
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
                        contentCardAction = (ContentCard.ContentCardAction) Adapters.b(Adapters.c(ContentCardAction.f10135a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        contentCardBrandImage = (ContentCard.ContentCardBrandImage) Adapters.b(Adapters.c(ContentCardBrandImage.f10136a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        contentCardFooter = (ContentCard.ContentCardFooter) Adapters.b(Adapters.c(ContentCardFooter.f10137a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str2 != null) {
                            return new au.com.woolworths.shop.aem.components.contentcard.fragment.ContentCard(str, str2, str3, str4, contentCardAction, contentCardBrandImage, contentCardFooter);
                        }
                        Assertions.a(reader, "contentCardImageUrl");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, au.com.woolworths.shop.aem.components.contentcard.fragment.ContentCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("contentCardId");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f10129a);
            writer.F1("contentCardImageUrl");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("contentCardTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("contentCardDescription");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("contentCardAction");
            Adapters.b(Adapters.c(ContentCardAction.f10135a, false)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("contentCardBrandImage");
            Adapters.b(Adapters.c(ContentCardBrandImage.f10136a, false)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("contentCardFooter");
            Adapters.b(Adapters.c(ContentCardFooter.f10137a, false)).toJson(writer, customScalarAdapters, value.g);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (au.com.woolworths.shop.aem.components.contentcard.fragment.ContentCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/aem/components/contentcard/fragment/ContentCardImpl_ResponseAdapter$ContentCardAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/aem/components/contentcard/fragment/ContentCard$ContentCardAction;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContentCardAction implements Adapter<ContentCard.ContentCardAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final ContentCardAction f10135a = new ContentCardAction();
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
                return new ContentCard.ContentCardAction(actionTypeA, str);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentCard.ContentCardAction value = (ContentCard.ContentCardAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.f10130a);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/aem/components/contentcard/fragment/ContentCardImpl_ResponseAdapter$ContentCardBrandImage;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/aem/components/contentcard/fragment/ContentCard$ContentCardBrandImage;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContentCardBrandImage implements Adapter<ContentCard.ContentCardBrandImage> {

        /* renamed from: a, reason: collision with root package name */
        public static final ContentCardBrandImage f10136a = new ContentCardBrandImage();
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
                return new ContentCard.ContentCardBrandImage(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentCard.ContentCardBrandImage value = (ContentCard.ContentCardBrandImage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("imageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f10131a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/aem/components/contentcard/fragment/ContentCardImpl_ResponseAdapter$ContentCardFooter;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/aem/components/contentcard/fragment/ContentCard$ContentCardFooter;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContentCardFooter implements Adapter<ContentCard.ContentCardFooter> {

        /* renamed from: a, reason: collision with root package name */
        public static final ContentCardFooter f10137a = new ContentCardFooter();
        public static final List b = CollectionsKt.R("style", TextBundle.TEXT_ENTRY, "logo");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            FooterStyle footerStyleA = null;
            String str = null;
            ContentCard.Logo logo = null;
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
                    logo = (ContentCard.Logo) Adapters.b(Adapters.c(Logo.f10138a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (footerStyleA != null) {
                return new ContentCard.ContentCardFooter(footerStyleA, str, logo);
            }
            Assertions.a(reader, "style");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentCard.ContentCardFooter value = (ContentCard.ContentCardFooter) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("style");
            FooterStyle_ResponseAdapter.b(writer, customScalarAdapters, value.f10132a);
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("logo");
            Adapters.b(Adapters.c(Logo.f10138a, false)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/aem/components/contentcard/fragment/ContentCardImpl_ResponseAdapter$Logo;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/aem/components/contentcard/fragment/ContentCard$Logo;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Logo implements Adapter<ContentCard.Logo> {

        /* renamed from: a, reason: collision with root package name */
        public static final Logo f10138a = new Logo();
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
                return new ContentCard.Logo(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentCard.Logo value = (ContentCard.Logo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("imageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f10133a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }
}
