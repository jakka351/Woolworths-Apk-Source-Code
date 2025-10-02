package au.com.woolworths.shop.legacy.graphql.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.graphql.common.fragment.ProductCardImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionPlacement_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerDisplayType_ResponseAdapter;
import au.com.woolworths.shop.legacy.graphql.ProductsByFacetQuery;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.woolworths.product.list.legacy.fragment.InsetBanner;
import com.woolworths.product.list.legacy.fragment.InsetBannerImpl_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\bÇ\u0002\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByFacetQuery_ResponseAdapter;", "", "Data", "ProductsByFacet", "Product", "Filter", "FilterItem", "Banner", "Action", "SortOption", "SortOptionsBanner", "MarketplaceInfo", "Item", "Footer", "MarketplaceBottomSheet", "PrimaryCta", "SecondaryCta", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductsByFacetQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByFacetQuery_ResponseAdapter$Action;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/legacy/graphql/ProductsByFacetQuery$Action;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action implements Adapter<ProductsByFacetQuery.Action> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action f12178a = new Action();
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
                return new ProductsByFacetQuery.Action(insetBannerActionPlacementA, insetBannerActionTypeA, str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductsByFacetQuery.Action value = (ProductsByFacetQuery.Action) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("placement");
            InsetBannerActionPlacement_ResponseAdapter.b(writer, customScalarAdapters, value.f12144a);
            writer.F1("type");
            InsetBannerActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByFacetQuery_ResponseAdapter$Banner;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/legacy/graphql/ProductsByFacetQuery$Banner;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Banner implements Adapter<ProductsByFacetQuery.Banner> {

        /* renamed from: a, reason: collision with root package name */
        public static final Banner f12179a = new Banner();
        public static final List b = CollectionsKt.R("displayType", "message", "bannerTitle", "iconUrl", UrlHandler.ACTION);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            ProductsByFacetQuery.Action action = null;
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
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    action = (ProductsByFacetQuery.Action) Adapters.b(Adapters.c(Action.f12178a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerDisplayTypeA == null) {
                Assertions.a(reader, "displayType");
                throw null;
            }
            if (str != null) {
                return new ProductsByFacetQuery.Banner(insetBannerDisplayTypeA, str, str2, str3, action);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductsByFacetQuery.Banner value = (ProductsByFacetQuery.Banner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.f12145a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("bannerTitle");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("iconUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1(UrlHandler.ACTION);
            Adapters.b(Adapters.c(Action.f12178a, false)).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByFacetQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/legacy/graphql/ProductsByFacetQuery$Data;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<ProductsByFacetQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f12180a = new Data();
        public static final List b = CollectionsKt.Q("productsByFacet");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductsByFacetQuery.ProductsByFacet productsByFacet = null;
            while (reader.o2(b) == 0) {
                productsByFacet = (ProductsByFacetQuery.ProductsByFacet) Adapters.b(Adapters.c(ProductsByFacet.f12189a, false)).fromJson(reader, customScalarAdapters);
            }
            return new ProductsByFacetQuery.Data(productsByFacet);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductsByFacetQuery.Data value = (ProductsByFacetQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productsByFacet");
            Adapters.b(Adapters.c(ProductsByFacet.f12189a, false)).toJson(writer, customScalarAdapters, value.f12146a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByFacetQuery_ResponseAdapter$Filter;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/legacy/graphql/ProductsByFacetQuery$Filter;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Filter implements Adapter<ProductsByFacetQuery.Filter> {

        /* renamed from: a, reason: collision with root package name */
        public static final Filter f12181a = new Filter();
        public static final List b = CollectionsKt.R("headerKey", "headerTitle", "filterItems", "banner");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            ProductsByFacetQuery.Banner banner = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson = Adapters.a(Adapters.c(FilterItem.f12182a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    banner = (ProductsByFacetQuery.Banner) Adapters.b(Adapters.c(Banner.f12179a, false)).fromJson(reader, customScalarAdapters);
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
                return new ProductsByFacetQuery.Filter(str, str2, arrayListFromJson, banner);
            }
            Assertions.a(reader, "filterItems");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductsByFacetQuery.Filter value = (ProductsByFacetQuery.Filter) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("headerKey");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f12147a);
            writer.F1("headerTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("filterItems");
            Adapters.a(Adapters.c(FilterItem.f12182a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("banner");
            Adapters.b(Adapters.c(Banner.f12179a, false)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByFacetQuery_ResponseAdapter$FilterItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/legacy/graphql/ProductsByFacetQuery$FilterItem;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FilterItem implements Adapter<ProductsByFacetQuery.FilterItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final FilterItem f12182a = new FilterItem();
        public static final List b = CollectionsKt.R("key", "title", AnnotatedPrivateKey.LABEL, "parentKey", "hasChildren", "isApplied");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
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
                int iO2 = reader.o2(b);
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
                return new ProductsByFacetQuery.FilterItem(str, str2, str3, str4, zBooleanValue, bool5.booleanValue());
            }
            Assertions.a(reader, "isApplied");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductsByFacetQuery.FilterItem value = (ProductsByFacetQuery.FilterItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("key");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f12148a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(AnnotatedPrivateKey.LABEL);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("parentKey");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
            writer.F1("hasChildren");
            Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
            d.B(value.e, adapters$BooleanAdapter$1, writer, customScalarAdapters, "isApplied");
            adapters$BooleanAdapter$1.toJson(writer, customScalarAdapters, Boolean.valueOf(value.f));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByFacetQuery_ResponseAdapter$Footer;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/legacy/graphql/ProductsByFacetQuery$Footer;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Footer implements Adapter<ProductsByFacetQuery.Footer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Footer f12183a = new Footer();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "linkUrl");

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
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                throw null;
            }
            if (str3 != null) {
                return new ProductsByFacetQuery.Footer(str, str2, str3);
            }
            Assertions.a(reader, "linkUrl");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductsByFacetQuery.Footer value = (ProductsByFacetQuery.Footer) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f12149a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("linkUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByFacetQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/legacy/graphql/ProductsByFacetQuery$Item;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<ProductsByFacetQuery.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f12184a = new Item();
        public static final List b = CollectionsKt.R("title", lqlqqlq.mmm006Dm006Dm, "imageUrl");

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
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
                throw null;
            }
            if (str3 != null) {
                return new ProductsByFacetQuery.Item(str, str2, str3);
            }
            Assertions.a(reader, "imageUrl");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductsByFacetQuery.Item value = (ProductsByFacetQuery.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f12150a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByFacetQuery_ResponseAdapter$MarketplaceBottomSheet;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/legacy/graphql/ProductsByFacetQuery$MarketplaceBottomSheet;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MarketplaceBottomSheet implements Adapter<ProductsByFacetQuery.MarketplaceBottomSheet> {

        /* renamed from: a, reason: collision with root package name */
        public static final MarketplaceBottomSheet f12185a = new MarketplaceBottomSheet();
        public static final List b = CollectionsKt.R("bottomSheetTitle", "bottomSheetBody", "primaryCta", "secondaryCta", "showOnceOnly");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ProductsByFacetQuery.PrimaryCta primaryCta = null;
            ProductsByFacetQuery.SecondaryCta secondaryCta = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    primaryCta = (ProductsByFacetQuery.PrimaryCta) Adapters.b(Adapters.c(PrimaryCta.f12187a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    secondaryCta = (ProductsByFacetQuery.SecondaryCta) Adapters.b(Adapters.c(SecondaryCta.f12190a, false)).fromJson(reader, customScalarAdapters);
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
                return new ProductsByFacetQuery.MarketplaceBottomSheet(str, str2, primaryCta, secondaryCta, bool);
            }
            Assertions.a(reader, "bottomSheetBody");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductsByFacetQuery.MarketplaceBottomSheet value = (ProductsByFacetQuery.MarketplaceBottomSheet) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("bottomSheetTitle");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f12151a);
            writer.F1("bottomSheetBody");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("primaryCta");
            Adapters.b(Adapters.c(PrimaryCta.f12187a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("secondaryCta");
            Adapters.b(Adapters.c(SecondaryCta.f12190a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("showOnceOnly");
            Adapters.l.toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByFacetQuery_ResponseAdapter$MarketplaceInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/legacy/graphql/ProductsByFacetQuery$MarketplaceInfo;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MarketplaceInfo implements Adapter<ProductsByFacetQuery.MarketplaceInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final MarketplaceInfo f12186a = new MarketplaceInfo();
        public static final List b = CollectionsKt.R("title", "items", "footer");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            ProductsByFacetQuery.Footer footer = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson = Adapters.a(Adapters.c(Item.f12184a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    footer = (ProductsByFacetQuery.Footer) Adapters.b(Adapters.c(Footer.f12183a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new ProductsByFacetQuery.MarketplaceInfo(str, arrayListFromJson, footer);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductsByFacetQuery.MarketplaceInfo value = (ProductsByFacetQuery.MarketplaceInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12152a);
            writer.F1("items");
            Adapters.a(Adapters.c(Item.f12184a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("footer");
            Adapters.b(Adapters.c(Footer.f12183a, false)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByFacetQuery_ResponseAdapter$PrimaryCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/legacy/graphql/ProductsByFacetQuery$PrimaryCta;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PrimaryCta implements Adapter<ProductsByFacetQuery.PrimaryCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final PrimaryCta f12187a = new PrimaryCta();
        public static final List b = CollectionsKt.Q(AnnotatedPrivateKey.LABEL);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new ProductsByFacetQuery.PrimaryCta(str);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductsByFacetQuery.PrimaryCta value = (ProductsByFacetQuery.PrimaryCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12153a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByFacetQuery_ResponseAdapter$Product;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/legacy/graphql/ProductsByFacetQuery$Product;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Product implements Adapter<ProductsByFacetQuery.Product> {

        /* renamed from: a, reason: collision with root package name */
        public static final Product f12188a = new Product();
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
                return new ProductsByFacetQuery.Product(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductsByFacetQuery.Product value = (ProductsByFacetQuery.Product) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12154a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByFacetQuery_ResponseAdapter$ProductsByFacet;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/legacy/graphql/ProductsByFacetQuery$ProductsByFacet;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductsByFacet implements Adapter<ProductsByFacetQuery.ProductsByFacet> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductsByFacet f12189a = new ProductsByFacet();
        public static final List b = CollectionsKt.R("totalNumberOfProducts", "nextPage", "products", "filters", "sortOptions", "sortOptionsBanner", "marketplaceInfo", "marketplaceBottomSheet");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Integer num2 = null;
            ArrayList arrayListFromJson = null;
            ArrayList arrayListFromJson2 = null;
            ArrayList arrayListFromJson3 = null;
            ProductsByFacetQuery.SortOptionsBanner sortOptionsBanner = null;
            ProductsByFacetQuery.MarketplaceInfo marketplaceInfo = null;
            ProductsByFacetQuery.MarketplaceBottomSheet marketplaceBottomSheet = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        num = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        num2 = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        arrayListFromJson = Adapters.a(Adapters.c(Product.f12188a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        arrayListFromJson2 = Adapters.a(Adapters.c(Filter.f12181a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        arrayListFromJson3 = Adapters.a(Adapters.c(SortOption.f12191a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        sortOptionsBanner = (ProductsByFacetQuery.SortOptionsBanner) Adapters.b(Adapters.c(SortOptionsBanner.f12192a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        marketplaceInfo = (ProductsByFacetQuery.MarketplaceInfo) Adapters.b(Adapters.c(MarketplaceInfo.f12186a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        marketplaceBottomSheet = (ProductsByFacetQuery.MarketplaceBottomSheet) Adapters.b(Adapters.c(MarketplaceBottomSheet.f12185a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (arrayListFromJson == null) {
                            Assertions.a(reader, "products");
                            throw null;
                        }
                        if (arrayListFromJson2 == null) {
                            Assertions.a(reader, "filters");
                            throw null;
                        }
                        if (arrayListFromJson3 != null) {
                            return new ProductsByFacetQuery.ProductsByFacet(num, num2, arrayListFromJson, arrayListFromJson2, arrayListFromJson3, sortOptionsBanner, marketplaceInfo, marketplaceBottomSheet);
                        }
                        Assertions.a(reader, "sortOptions");
                        throw null;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductsByFacetQuery.ProductsByFacet value = (ProductsByFacetQuery.ProductsByFacet) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("totalNumberOfProducts");
            NullableAdapter nullableAdapter = Adapters.k;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f12155a);
            writer.F1("nextPage");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("products");
            Adapters.a(Adapters.c(Product.f12188a, true)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("filters");
            Adapters.a(Adapters.c(Filter.f12181a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("sortOptions");
            Adapters.a(Adapters.c(SortOption.f12191a, false)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("sortOptionsBanner");
            Adapters.b(Adapters.c(SortOptionsBanner.f12192a, true)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("marketplaceInfo");
            Adapters.b(Adapters.c(MarketplaceInfo.f12186a, false)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("marketplaceBottomSheet");
            Adapters.b(Adapters.c(MarketplaceBottomSheet.f12185a, false)).toJson(writer, customScalarAdapters, value.h);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByFacetQuery_ResponseAdapter$SecondaryCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/legacy/graphql/ProductsByFacetQuery$SecondaryCta;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SecondaryCta implements Adapter<ProductsByFacetQuery.SecondaryCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final SecondaryCta f12190a = new SecondaryCta();
        public static final List b = CollectionsKt.Q(AnnotatedPrivateKey.LABEL);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new ProductsByFacetQuery.SecondaryCta(str);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductsByFacetQuery.SecondaryCta value = (ProductsByFacetQuery.SecondaryCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12156a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByFacetQuery_ResponseAdapter$SortOption;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/legacy/graphql/ProductsByFacetQuery$SortOption;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SortOption implements Adapter<ProductsByFacetQuery.SortOption> {

        /* renamed from: a, reason: collision with root package name */
        public static final SortOption f12191a = new SortOption();
        public static final List b = CollectionsKt.R("key", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "isApplied");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
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
                return new ProductsByFacetQuery.SortOption(str, str2, str3, bool.booleanValue());
            }
            Assertions.a(reader, "isApplied");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductsByFacetQuery.SortOption value = (ProductsByFacetQuery.SortOption) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("key");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f12157a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1("isApplied");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.d));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByFacetQuery_ResponseAdapter$SortOptionsBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/legacy/graphql/ProductsByFacetQuery$SortOptionsBanner;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SortOptionsBanner implements Adapter<ProductsByFacetQuery.SortOptionsBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final SortOptionsBanner f12192a = new SortOptionsBanner();
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
            InsetBanner insetBannerFromJson = InsetBannerImpl_ResponseAdapter.InsetBanner.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new ProductsByFacetQuery.SortOptionsBanner(str, insetBannerFromJson);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductsByFacetQuery.SortOptionsBanner value = (ProductsByFacetQuery.SortOptionsBanner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12158a);
            InsetBannerImpl_ResponseAdapter.InsetBanner.INSTANCE.toJson(writer, customScalarAdapters, value.b);
        }
    }
}
