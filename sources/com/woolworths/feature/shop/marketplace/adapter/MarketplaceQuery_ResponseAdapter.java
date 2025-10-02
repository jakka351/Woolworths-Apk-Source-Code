package com.woolworths.feature.shop.marketplace.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.graphql.common.fragment.ProductCardImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.MarketplaceLandingPageName;
import au.com.woolworths.shop.graphql.type.adapter.MarketplaceLandingPageName_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.woolworths.feature.shop.marketplace.MarketplaceQuery;
import com.woolworths.feature.shop.marketplace.fragment.PromotionBannerFragment;
import com.woolworths.feature.shop.marketplace.fragment.PromotionBannerFragmentImpl_ResponseAdapter;
import com.woolworths.feature.shop.marketplace.fragment.SectionItem;
import com.woolworths.feature.shop.marketplace.fragment.SectionItemImpl_ResponseAdapter;
import com.woolworths.feature.shop.marketplace.fragment.TileItem;
import com.woolworths.feature.shop.marketplace.fragment.TileItemImpl_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\bÇ\u0002\u0018\u00002\u00020\u0001:\u0013\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/adapter/MarketplaceQuery_ResponseAdapter;", "", "Data", "Marketplace", "Header", "Item", "Footer", "Tab", "Section", "OnMarketplacePersonalised", "Item1", "OnPromotionBanner", "OnMarketplaceHorizontalList", "Item2", "OnProductCard", "OnCategories", "Item3", "OnBrands", "Item4", "OnSellers", "Item5", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MarketplaceQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/adapter/MarketplaceQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$Data;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<MarketplaceQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f19815a = new Data();
        public static final List b = CollectionsKt.Q("marketplace");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            MarketplaceQuery.Marketplace marketplace = null;
            while (reader.o2(b) == 0) {
                marketplace = (MarketplaceQuery.Marketplace) Adapters.c(Marketplace.f19824a, false).fromJson(reader, customScalarAdapters);
            }
            if (marketplace != null) {
                return new MarketplaceQuery.Data(marketplace);
            }
            Assertions.a(reader, "marketplace");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MarketplaceQuery.Data value = (MarketplaceQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("marketplace");
            Adapters.c(Marketplace.f19824a, false).toJson(writer, customScalarAdapters, value.f19796a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/adapter/MarketplaceQuery_ResponseAdapter$Footer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$Footer;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Footer implements Adapter<MarketplaceQuery.Footer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Footer f19816a = new Footer();
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
                return new MarketplaceQuery.Footer(str, str2, str3);
            }
            Assertions.a(reader, "linkUrl");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MarketplaceQuery.Footer value = (MarketplaceQuery.Footer) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19797a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("linkUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/adapter/MarketplaceQuery_ResponseAdapter$Header;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$Header;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Header implements Adapter<MarketplaceQuery.Header> {

        /* renamed from: a, reason: collision with root package name */
        public static final Header f19817a = new Header();
        public static final List b = CollectionsKt.R("title", "items", "footer");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            MarketplaceQuery.Footer footer = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson = Adapters.a(Adapters.c(Item.f19818a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    footer = (MarketplaceQuery.Footer) Adapters.b(Adapters.c(Footer.f19816a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new MarketplaceQuery.Header(str, arrayListFromJson, footer);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MarketplaceQuery.Header value = (MarketplaceQuery.Header) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19798a);
            writer.F1("items");
            Adapters.a(Adapters.c(Item.f19818a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("footer");
            Adapters.b(Adapters.c(Footer.f19816a, false)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/adapter/MarketplaceQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$Item;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<MarketplaceQuery.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f19818a = new Item();
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
                return new MarketplaceQuery.Item(str, str2, str3);
            }
            Assertions.a(reader, "imageUrl");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MarketplaceQuery.Item value = (MarketplaceQuery.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19799a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/adapter/MarketplaceQuery_ResponseAdapter$Item1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$Item1;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item1 implements Adapter<MarketplaceQuery.Item1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item1 f19819a = new Item1();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            MarketplaceQuery.OnPromotionBanner onPromotionBannerA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            MarketplaceQuery.OnMarketplaceHorizontalList onMarketplaceHorizontalListA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("PromotionBanner"))) {
                reader.o();
                onPromotionBannerA = OnPromotionBanner.a(reader, customScalarAdapters);
            } else {
                onPromotionBannerA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("MarketplaceHorizontalList"))) {
                reader.o();
                onMarketplaceHorizontalListA = OnMarketplaceHorizontalList.a(reader, customScalarAdapters);
            }
            return new MarketplaceQuery.Item1(str, onPromotionBannerA, onMarketplaceHorizontalListA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MarketplaceQuery.Item1 value = (MarketplaceQuery.Item1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19800a);
            MarketplaceQuery.OnPromotionBanner onPromotionBanner = value.b;
            if (onPromotionBanner != null) {
                OnPromotionBanner.b(writer, customScalarAdapters, onPromotionBanner);
            }
            MarketplaceQuery.OnMarketplaceHorizontalList onMarketplaceHorizontalList = value.c;
            if (onMarketplaceHorizontalList != null) {
                OnMarketplaceHorizontalList.b(writer, customScalarAdapters, onMarketplaceHorizontalList);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/adapter/MarketplaceQuery_ResponseAdapter$Item2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$Item2;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item2 implements Adapter<MarketplaceQuery.Item2> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item2 f19820a = new Item2();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            MarketplaceQuery.OnProductCard onProductCardA = null;
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
            return new MarketplaceQuery.Item2(str, onProductCardA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MarketplaceQuery.Item2 value = (MarketplaceQuery.Item2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19801a);
            MarketplaceQuery.OnProductCard onProductCard = value.b;
            if (onProductCard != null) {
                OnProductCard.b(writer, customScalarAdapters, onProductCard);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/adapter/MarketplaceQuery_ResponseAdapter$Item3;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$Item3;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item3 implements Adapter<MarketplaceQuery.Item3> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item3 f19821a = new Item3();
        public static final List b = CollectionsKt.R("__typename", "id", "isFinalLevel", "source");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    bool = bool2;
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = bool2;
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = bool2;
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
                bool2 = bool;
            }
            reader.o();
            TileItem tileItemA = TileItemImpl_ResponseAdapter.TileItem.a(reader, customScalarAdapters);
            Boolean bool3 = bool2;
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (bool3 != null) {
                return new MarketplaceQuery.Item3(str, str2, bool3.booleanValue(), str3, tileItemA);
            }
            Assertions.a(reader, "isFinalLevel");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MarketplaceQuery.Item3 value = (MarketplaceQuery.Item3) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19802a);
            writer.F1("id");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("isFinalLevel");
            d.B(value.c, Adapters.f, writer, customScalarAdapters, "source");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
            List list = TileItemImpl_ResponseAdapter.TileItem.f19847a;
            TileItemImpl_ResponseAdapter.TileItem.b(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/adapter/MarketplaceQuery_ResponseAdapter$Item4;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$Item4;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item4 implements Adapter<MarketplaceQuery.Item4> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item4 f19822a = new Item4();
        public static final List b = CollectionsKt.R("__typename", "logoUrl");

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
            reader.o();
            TileItem tileItemA = TileItemImpl_ResponseAdapter.TileItem.a(reader, customScalarAdapters);
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 != null) {
                return new MarketplaceQuery.Item4(str, str2, tileItemA);
            }
            Assertions.a(reader, "logoUrl");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MarketplaceQuery.Item4 value = (MarketplaceQuery.Item4) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19803a);
            writer.F1("logoUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            List list = TileItemImpl_ResponseAdapter.TileItem.f19847a;
            TileItemImpl_ResponseAdapter.TileItem.b(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/adapter/MarketplaceQuery_ResponseAdapter$Item5;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$Item5;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item5 implements Adapter<MarketplaceQuery.Item5> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item5 f19823a = new Item5();
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
            TileItem tileItemA = TileItemImpl_ResponseAdapter.TileItem.a(reader, customScalarAdapters);
            if (str != null) {
                return new MarketplaceQuery.Item5(str, tileItemA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MarketplaceQuery.Item5 value = (MarketplaceQuery.Item5) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19804a);
            List list = TileItemImpl_ResponseAdapter.TileItem.f19847a;
            TileItemImpl_ResponseAdapter.TileItem.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/adapter/MarketplaceQuery_ResponseAdapter$Marketplace;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$Marketplace;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Marketplace implements Adapter<MarketplaceQuery.Marketplace> {

        /* renamed from: a, reason: collision with root package name */
        public static final Marketplace f19824a = new Marketplace();
        public static final List b = CollectionsKt.R("buttonTitle", "header", "tabs", "sections");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            MarketplaceQuery.Header header = null;
            ArrayList arrayListFromJson = null;
            ArrayList arrayListFromJson2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    header = (MarketplaceQuery.Header) Adapters.b(Adapters.c(Header.f19817a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson = Adapters.a(Adapters.c(Tab.f19833a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    arrayListFromJson2 = Adapters.a(Adapters.c(Section.f19832a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "tabs");
                throw null;
            }
            if (arrayListFromJson2 != null) {
                return new MarketplaceQuery.Marketplace(str, header, arrayListFromJson, arrayListFromJson2);
            }
            Assertions.a(reader, "sections");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MarketplaceQuery.Marketplace value = (MarketplaceQuery.Marketplace) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("buttonTitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.f19805a);
            writer.F1("header");
            Adapters.b(Adapters.c(Header.f19817a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("tabs");
            Adapters.a(Adapters.c(Tab.f19833a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("sections");
            Adapters.a(Adapters.c(Section.f19832a, true)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/adapter/MarketplaceQuery_ResponseAdapter$OnBrands;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$OnBrands;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnBrands implements Adapter<MarketplaceQuery.OnBrands> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19825a = CollectionsKt.R("__typename", "pageName", "items");

        public static MarketplaceQuery.OnBrands a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            MarketplaceLandingPageName marketplaceLandingPageNameA = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f19825a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    marketplaceLandingPageNameA = MarketplaceLandingPageName_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Item4.f19822a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            reader.o();
            SectionItem sectionItemA = SectionItemImpl_ResponseAdapter.SectionItem.a(reader, customScalarAdapters);
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (marketplaceLandingPageNameA == null) {
                Assertions.a(reader, "pageName");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new MarketplaceQuery.OnBrands(str, marketplaceLandingPageNameA, arrayListFromJson, sectionItemA);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, MarketplaceQuery.OnBrands value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19806a);
            writer.F1("pageName");
            MarketplaceLandingPageName_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1("items");
            Adapters.a(Adapters.c(Item4.f19822a, true)).toJson(writer, customScalarAdapters, value.c);
            List list = SectionItemImpl_ResponseAdapter.SectionItem.f19845a;
            SectionItemImpl_ResponseAdapter.SectionItem.b(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (MarketplaceQuery.OnBrands) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/adapter/MarketplaceQuery_ResponseAdapter$OnCategories;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$OnCategories;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCategories implements Adapter<MarketplaceQuery.OnCategories> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19826a = CollectionsKt.R("__typename", "pageName", "displayName", "items");

        public static MarketplaceQuery.OnCategories a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            MarketplaceLandingPageName marketplaceLandingPageNameA = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f19826a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    marketplaceLandingPageNameA = MarketplaceLandingPageName_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Item3.f19821a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            reader.o();
            SectionItem sectionItemA = SectionItemImpl_ResponseAdapter.SectionItem.a(reader, customScalarAdapters);
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (marketplaceLandingPageNameA == null) {
                Assertions.a(reader, "pageName");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "displayName");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new MarketplaceQuery.OnCategories(str, marketplaceLandingPageNameA, str2, arrayListFromJson, sectionItemA);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, MarketplaceQuery.OnCategories value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19807a);
            writer.F1("pageName");
            MarketplaceLandingPageName_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1("displayName");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("items");
            Adapters.a(Adapters.c(Item3.f19821a, true)).toJson(writer, customScalarAdapters, value.d);
            List list = SectionItemImpl_ResponseAdapter.SectionItem.f19845a;
            SectionItemImpl_ResponseAdapter.SectionItem.b(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (MarketplaceQuery.OnCategories) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/adapter/MarketplaceQuery_ResponseAdapter$OnMarketplaceHorizontalList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$OnMarketplaceHorizontalList;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnMarketplaceHorizontalList implements Adapter<MarketplaceQuery.OnMarketplaceHorizontalList> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19827a = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "items");

        public static MarketplaceQuery.OnMarketplaceHorizontalList a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f19827a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Item2.f19820a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new MarketplaceQuery.OnMarketplaceHorizontalList(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, MarketplaceQuery.OnMarketplaceHorizontalList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19808a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("items");
            Adapters.a(Adapters.c(Item2.f19820a, true)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (MarketplaceQuery.OnMarketplaceHorizontalList) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/adapter/MarketplaceQuery_ResponseAdapter$OnMarketplacePersonalised;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$OnMarketplacePersonalised;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnMarketplacePersonalised implements Adapter<MarketplaceQuery.OnMarketplacePersonalised> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19828a = CollectionsKt.R("pageName", "displayName", "items");

        public static MarketplaceQuery.OnMarketplacePersonalised a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            MarketplaceLandingPageName marketplaceLandingPageNameA = null;
            String str = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f19828a);
                if (iO2 == 0) {
                    marketplaceLandingPageNameA = MarketplaceLandingPageName_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Item1.f19819a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (marketplaceLandingPageNameA == null) {
                Assertions.a(reader, "pageName");
                throw null;
            }
            if (str == null) {
                Assertions.a(reader, "displayName");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new MarketplaceQuery.OnMarketplacePersonalised(marketplaceLandingPageNameA, str, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, MarketplaceQuery.OnMarketplacePersonalised value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("pageName");
            MarketplaceLandingPageName_ResponseAdapter.b(writer, customScalarAdapters, value.f19809a);
            writer.F1("displayName");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("items");
            Adapters.a(Adapters.c(Item1.f19819a, true)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (MarketplaceQuery.OnMarketplacePersonalised) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/adapter/MarketplaceQuery_ResponseAdapter$OnProductCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$OnProductCard;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductCard implements Adapter<MarketplaceQuery.OnProductCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19829a = CollectionsKt.Q("__typename");

        public static MarketplaceQuery.OnProductCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19829a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new MarketplaceQuery.OnProductCard(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, MarketplaceQuery.OnProductCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19810a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (MarketplaceQuery.OnProductCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/adapter/MarketplaceQuery_ResponseAdapter$OnPromotionBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$OnPromotionBanner;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPromotionBanner implements Adapter<MarketplaceQuery.OnPromotionBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19830a = CollectionsKt.Q("__typename");

        public static MarketplaceQuery.OnPromotionBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19830a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            PromotionBannerFragment promotionBannerFragmentA = PromotionBannerFragmentImpl_ResponseAdapter.PromotionBannerFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new MarketplaceQuery.OnPromotionBanner(str, promotionBannerFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, MarketplaceQuery.OnPromotionBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19811a);
            List list = PromotionBannerFragmentImpl_ResponseAdapter.PromotionBannerFragment.f19842a;
            PromotionBannerFragmentImpl_ResponseAdapter.PromotionBannerFragment.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (MarketplaceQuery.OnPromotionBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/adapter/MarketplaceQuery_ResponseAdapter$OnSellers;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$OnSellers;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnSellers implements Adapter<MarketplaceQuery.OnSellers> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19831a = CollectionsKt.R("__typename", "pageName", "items");

        public static MarketplaceQuery.OnSellers a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            MarketplaceLandingPageName marketplaceLandingPageNameA = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f19831a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    marketplaceLandingPageNameA = MarketplaceLandingPageName_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Item5.f19823a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            reader.o();
            SectionItem sectionItemA = SectionItemImpl_ResponseAdapter.SectionItem.a(reader, customScalarAdapters);
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (marketplaceLandingPageNameA == null) {
                Assertions.a(reader, "pageName");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new MarketplaceQuery.OnSellers(str, marketplaceLandingPageNameA, arrayListFromJson, sectionItemA);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, MarketplaceQuery.OnSellers value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19812a);
            writer.F1("pageName");
            MarketplaceLandingPageName_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1("items");
            Adapters.a(Adapters.c(Item5.f19823a, true)).toJson(writer, customScalarAdapters, value.c);
            List list = SectionItemImpl_ResponseAdapter.SectionItem.f19845a;
            SectionItemImpl_ResponseAdapter.SectionItem.b(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (MarketplaceQuery.OnSellers) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/adapter/MarketplaceQuery_ResponseAdapter$Section;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$Section;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Section implements Adapter<MarketplaceQuery.Section> {

        /* renamed from: a, reason: collision with root package name */
        public static final Section f19832a = new Section();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            MarketplaceQuery.OnMarketplacePersonalised onMarketplacePersonalisedA;
            MarketplaceQuery.OnCategories onCategoriesA;
            MarketplaceQuery.OnBrands onBrandsA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            MarketplaceQuery.OnSellers onSellersA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("MarketplacePersonalised"))) {
                reader.o();
                onMarketplacePersonalisedA = OnMarketplacePersonalised.a(reader, customScalarAdapters);
            } else {
                onMarketplacePersonalisedA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("Categories"))) {
                reader.o();
                onCategoriesA = OnCategories.a(reader, customScalarAdapters);
            } else {
                onCategoriesA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("Brands"))) {
                reader.o();
                onBrandsA = OnBrands.a(reader, customScalarAdapters);
            } else {
                onBrandsA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("Sellers"))) {
                reader.o();
                onSellersA = OnSellers.a(reader, customScalarAdapters);
            }
            return new MarketplaceQuery.Section(str, onMarketplacePersonalisedA, onCategoriesA, onBrandsA, onSellersA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MarketplaceQuery.Section value = (MarketplaceQuery.Section) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19813a);
            MarketplaceQuery.OnMarketplacePersonalised onMarketplacePersonalised = value.b;
            if (onMarketplacePersonalised != null) {
                OnMarketplacePersonalised.b(writer, customScalarAdapters, onMarketplacePersonalised);
            }
            MarketplaceQuery.OnCategories onCategories = value.c;
            if (onCategories != null) {
                OnCategories.b(writer, customScalarAdapters, onCategories);
            }
            MarketplaceQuery.OnBrands onBrands = value.d;
            if (onBrands != null) {
                OnBrands.b(writer, customScalarAdapters, onBrands);
            }
            MarketplaceQuery.OnSellers onSellers = value.e;
            if (onSellers != null) {
                OnSellers.b(writer, customScalarAdapters, onSellers);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/adapter/MarketplaceQuery_ResponseAdapter$Tab;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$Tab;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Tab implements Adapter<MarketplaceQuery.Tab> {

        /* renamed from: a, reason: collision with root package name */
        public static final Tab f19833a = new Tab();
        public static final List b = CollectionsKt.R("pageName", "title");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            MarketplaceLandingPageName marketplaceLandingPageNameA = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    marketplaceLandingPageNameA = MarketplaceLandingPageName_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (marketplaceLandingPageNameA == null) {
                Assertions.a(reader, "pageName");
                throw null;
            }
            if (str != null) {
                return new MarketplaceQuery.Tab(marketplaceLandingPageNameA, str);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MarketplaceQuery.Tab value = (MarketplaceQuery.Tab) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("pageName");
            MarketplaceLandingPageName_ResponseAdapter.b(writer, customScalarAdapters, value.f19814a);
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }
}
