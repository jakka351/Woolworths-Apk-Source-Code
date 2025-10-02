package au.com.woolworths.shop.cart.data.common.fragment;

import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFieldsImpl_ResponseAdapter;
import au.com.woolworths.shop.cart.data.common.fragment.CartProductCard;
import au.com.woolworths.shop.graphql.type.BundleType;
import au.com.woolworths.shop.graphql.type.BuyMoreSaveMoreType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.adapter.BundleType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.BuyMoreSaveMoreType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerDisplayType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.Adapters$DoubleAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCardImpl_ResponseAdapter;", "", "CartProductCard", "QuantityInfo", "Disclaimer", "Marketplace", "MemberPricePromotionInfo", "SingleMemberPricePromotionInfo", "MultiBuyPromotionInfo", "CartProductInfo", "BundlePromotionInfo", "BuyMoreSaveMorePromotionInfo", "ClickAnalytics", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CartProductCardImpl_ResponseAdapter {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCardImpl_ResponseAdapter$BundlePromotionInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCard$BundlePromotionInfo;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BundlePromotionInfo implements Adapter<CartProductCard.BundlePromotionInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final BundlePromotionInfo f10409a = new BundlePromotionInfo();
        public static final List b = CollectionsKt.R("title", "isApplied", "bundleType", "isShowBanner");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Boolean bool = null;
            BundleType bundleTypeA = null;
            Boolean bool2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bundleTypeA = BundleType_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (bool == null) {
                Assertions.a(reader, "isApplied");
                throw null;
            }
            boolean zBooleanValue = bool.booleanValue();
            if (bundleTypeA == null) {
                Assertions.a(reader, "bundleType");
                throw null;
            }
            if (bool2 != null) {
                return new CartProductCard.BundlePromotionInfo(str, zBooleanValue, bundleTypeA, bool2.booleanValue());
            }
            Assertions.a(reader, "isShowBanner");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CartProductCard.BundlePromotionInfo value = (CartProductCard.BundlePromotionInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10399a);
            writer.F1("isApplied");
            Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
            d.B(value.b, adapters$BooleanAdapter$1, writer, customScalarAdapters, "bundleType");
            writer.v0(value.c.d);
            writer.F1("isShowBanner");
            adapters$BooleanAdapter$1.toJson(writer, customScalarAdapters, Boolean.valueOf(value.d));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCardImpl_ResponseAdapter$BuyMoreSaveMorePromotionInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCard$BuyMoreSaveMorePromotionInfo;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BuyMoreSaveMorePromotionInfo implements Adapter<CartProductCard.BuyMoreSaveMorePromotionInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final BuyMoreSaveMorePromotionInfo f10410a = new BuyMoreSaveMorePromotionInfo();
        public static final List b = CollectionsKt.R("offerId", "title", UrlHandler.ACTION, "isApplied", "type", "clickAnalytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            BuyMoreSaveMoreType buyMoreSaveMoreTypeA = null;
            CartProductCard.ClickAnalytics clickAnalytics = null;
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
                    bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    buyMoreSaveMoreTypeA = BuyMoreSaveMoreType_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    bool = bool2;
                    clickAnalytics = (CartProductCard.ClickAnalytics) Adapters.c(ClickAnalytics.f10413a, true).fromJson(reader, customScalarAdapters);
                }
                bool2 = bool;
            }
            Boolean bool3 = bool2;
            if (str == null) {
                Assertions.a(reader, "offerId");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, UrlHandler.ACTION);
                throw null;
            }
            if (bool3 == null) {
                Assertions.a(reader, "isApplied");
                throw null;
            }
            boolean zBooleanValue = bool3.booleanValue();
            if (buyMoreSaveMoreTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (clickAnalytics != null) {
                return new CartProductCard.BuyMoreSaveMorePromotionInfo(str, str2, str3, zBooleanValue, buyMoreSaveMoreTypeA, clickAnalytics);
            }
            Assertions.a(reader, "clickAnalytics");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CartProductCard.BuyMoreSaveMorePromotionInfo value = (CartProductCard.BuyMoreSaveMorePromotionInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("offerId");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f10400a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("isApplied");
            d.B(value.d, Adapters.f, writer, customScalarAdapters, "type");
            writer.v0(value.e.d);
            writer.F1("clickAnalytics");
            Adapters.c(ClickAnalytics.f10413a, true).toJson(writer, customScalarAdapters, value.f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCardImpl_ResponseAdapter$CartProductCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCard;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CartProductCard implements Adapter<au.com.woolworths.shop.cart.data.common.fragment.CartProductCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f10411a = CollectionsKt.R("productId", "title", "imageUrl", "quantity", "isAvailable", "unitPrice", "totalPrice", "quantityInfo", "disclaimer", "marketplace", "saving", "wasPrice", "memberPricePromotionInfo", "singleMemberPricePromotionInfo", "multiBuyPromotionInfo", "cartProductInfo", "availableLimit", "bundlePromotionInfo", "buyMoreSaveMorePromotionInfo");

        public static au.com.woolworths.shop.cart.data.common.fragment.CartProductCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Double d;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Double d2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            Integer num = null;
            Integer num2 = null;
            CartProductCard.QuantityInfo quantityInfo = null;
            CartProductCard.Disclaimer disclaimer = null;
            CartProductCard.Marketplace marketplace = null;
            String str4 = null;
            String str5 = null;
            CartProductCard.MemberPricePromotionInfo memberPricePromotionInfo = null;
            CartProductCard.SingleMemberPricePromotionInfo singleMemberPricePromotionInfo = null;
            CartProductCard.MultiBuyPromotionInfo multiBuyPromotionInfo = null;
            CartProductCard.CartProductInfo cartProductInfo = null;
            String str6 = null;
            CartProductCard.BundlePromotionInfo bundlePromotionInfo = null;
            CartProductCard.BuyMoreSaveMorePromotionInfo buyMoreSaveMorePromotionInfo = null;
            while (true) {
                switch (reader.o2(f10411a)) {
                    case 0:
                        d = d2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        d = d2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        d = d2;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        d2 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                        continue;
                    case 4:
                        d = d2;
                        bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        d = d2;
                        num = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        d = d2;
                        num2 = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        d = d2;
                        quantityInfo = (CartProductCard.QuantityInfo) Adapters.c(QuantityInfo.f10418a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        d = d2;
                        disclaimer = (CartProductCard.Disclaimer) Adapters.b(Adapters.c(Disclaimer.f10414a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        d = d2;
                        marketplace = (CartProductCard.Marketplace) Adapters.b(Adapters.c(Marketplace.f10415a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        d = d2;
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 11:
                        d = d2;
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 12:
                        d = d2;
                        memberPricePromotionInfo = (CartProductCard.MemberPricePromotionInfo) Adapters.b(Adapters.c(MemberPricePromotionInfo.f10416a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 13:
                        d = d2;
                        singleMemberPricePromotionInfo = (CartProductCard.SingleMemberPricePromotionInfo) Adapters.b(Adapters.c(SingleMemberPricePromotionInfo.f10419a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 14:
                        d = d2;
                        multiBuyPromotionInfo = (CartProductCard.MultiBuyPromotionInfo) Adapters.b(Adapters.c(MultiBuyPromotionInfo.f10417a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 15:
                        d = d2;
                        cartProductInfo = (CartProductCard.CartProductInfo) Adapters.b(Adapters.c(CartProductInfo.f10412a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 16:
                        d = d2;
                        str6 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 17:
                        d = d2;
                        bundlePromotionInfo = (CartProductCard.BundlePromotionInfo) Adapters.b(Adapters.c(BundlePromotionInfo.f10409a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 18:
                        d = d2;
                        buyMoreSaveMorePromotionInfo = (CartProductCard.BuyMoreSaveMorePromotionInfo) Adapters.b(Adapters.c(BuyMoreSaveMorePromotionInfo.f10410a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Double d3 = d2;
                        if (str == null) {
                            Assertions.a(reader, "productId");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "imageUrl");
                            throw null;
                        }
                        if (d3 == null) {
                            Assertions.a(reader, "quantity");
                            throw null;
                        }
                        Boolean bool2 = bool;
                        double dDoubleValue = d3.doubleValue();
                        if (bool2 == null) {
                            Assertions.a(reader, "isAvailable");
                            throw null;
                        }
                        boolean zBooleanValue = bool2.booleanValue();
                        if (quantityInfo != null) {
                            return new au.com.woolworths.shop.cart.data.common.fragment.CartProductCard(str, str2, str3, dDoubleValue, zBooleanValue, num, num2, quantityInfo, disclaimer, marketplace, str4, str5, memberPricePromotionInfo, singleMemberPricePromotionInfo, multiBuyPromotionInfo, cartProductInfo, str6, bundlePromotionInfo, buyMoreSaveMorePromotionInfo);
                        }
                        Assertions.a(reader, "quantityInfo");
                        throw null;
                }
                d2 = d;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, au.com.woolworths.shop.cart.data.common.fragment.CartProductCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productId");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f10398a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("quantity");
            Adapters.c.toJson(writer, customScalarAdapters, Double.valueOf(value.d));
            writer.F1("isAvailable");
            d.B(value.e, Adapters.f, writer, customScalarAdapters, "unitPrice");
            NullableAdapter nullableAdapter = Adapters.k;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
            writer.F1("totalPrice");
            nullableAdapter.toJson(writer, customScalarAdapters, value.g);
            writer.F1("quantityInfo");
            Adapters.c(QuantityInfo.f10418a, false).toJson(writer, customScalarAdapters, value.h);
            writer.F1("disclaimer");
            Adapters.b(Adapters.c(Disclaimer.f10414a, false)).toJson(writer, customScalarAdapters, value.i);
            writer.F1("marketplace");
            Adapters.b(Adapters.c(Marketplace.f10415a, false)).toJson(writer, customScalarAdapters, value.j);
            writer.F1("saving");
            NullableAdapter nullableAdapter2 = Adapters.i;
            nullableAdapter2.toJson(writer, customScalarAdapters, value.k);
            writer.F1("wasPrice");
            nullableAdapter2.toJson(writer, customScalarAdapters, value.l);
            writer.F1("memberPricePromotionInfo");
            Adapters.b(Adapters.c(MemberPricePromotionInfo.f10416a, false)).toJson(writer, customScalarAdapters, value.m);
            writer.F1("singleMemberPricePromotionInfo");
            Adapters.b(Adapters.c(SingleMemberPricePromotionInfo.f10419a, false)).toJson(writer, customScalarAdapters, value.n);
            writer.F1("multiBuyPromotionInfo");
            Adapters.b(Adapters.c(MultiBuyPromotionInfo.f10417a, false)).toJson(writer, customScalarAdapters, value.o);
            writer.F1("cartProductInfo");
            Adapters.b(Adapters.c(CartProductInfo.f10412a, false)).toJson(writer, customScalarAdapters, value.p);
            writer.F1("availableLimit");
            nullableAdapter2.toJson(writer, customScalarAdapters, value.q);
            writer.F1("bundlePromotionInfo");
            Adapters.b(Adapters.c(BundlePromotionInfo.f10409a, false)).toJson(writer, customScalarAdapters, value.r);
            writer.F1("buyMoreSaveMorePromotionInfo");
            Adapters.b(Adapters.c(BuyMoreSaveMorePromotionInfo.f10410a, false)).toJson(writer, customScalarAdapters, value.s);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (au.com.woolworths.shop.cart.data.common.fragment.CartProductCard) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCardImpl_ResponseAdapter$CartProductInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCard$CartProductInfo;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CartProductInfo implements Adapter<CartProductCard.CartProductInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final CartProductInfo f10412a = new CartProductInfo();
        public static final List b = CollectionsKt.R("totalPrice", "totalOriginalPrice", "totalDiscount");

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
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        return new CartProductCard.CartProductInfo(str, str2, str3);
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CartProductCard.CartProductInfo value = (CartProductCard.CartProductInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("totalPrice");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f10401a);
            writer.F1("totalOriginalPrice");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("totalDiscount");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCardImpl_ResponseAdapter$ClickAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCard$ClickAnalytics;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClickAnalytics implements Adapter<CartProductCard.ClickAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ClickAnalytics f10413a = new ClickAnalytics();
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
                return new CartProductCard.ClickAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CartProductCard.ClickAnalytics value = (CartProductCard.ClickAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10402a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCardImpl_ResponseAdapter$Disclaimer;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCard$Disclaimer;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Disclaimer implements Adapter<CartProductCard.Disclaimer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Disclaimer f10414a = new Disclaimer();
        public static final List b = CollectionsKt.R("displayType", "message", "bannerTitle");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    insetBannerDisplayTypeA = InsetBannerDisplayType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerDisplayTypeA == null) {
                Assertions.a(reader, "displayType");
                throw null;
            }
            if (str != null) {
                return new CartProductCard.Disclaimer(insetBannerDisplayTypeA, str, str2);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CartProductCard.Disclaimer value = (CartProductCard.Disclaimer) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.f10403a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("bannerTitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCardImpl_ResponseAdapter$Marketplace;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCard$Marketplace;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Marketplace implements Adapter<CartProductCard.Marketplace> {

        /* renamed from: a, reason: collision with root package name */
        public static final Marketplace f10415a = new Marketplace();
        public static final List b = CollectionsKt.R("sellerName", "brandName");

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
                Assertions.a(reader, "sellerName");
                throw null;
            }
            if (str2 != null) {
                return new CartProductCard.Marketplace(str, str2);
            }
            Assertions.a(reader, "brandName");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CartProductCard.Marketplace value = (CartProductCard.Marketplace) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("sellerName");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f10404a);
            writer.F1("brandName");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCardImpl_ResponseAdapter$MemberPricePromotionInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCard$MemberPricePromotionInfo;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MemberPricePromotionInfo implements Adapter<CartProductCard.MemberPricePromotionInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final MemberPricePromotionInfo f10416a = new MemberPricePromotionInfo();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "isApplied");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            Boolean bool = null;
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
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
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
            if (bool != null) {
                return new CartProductCard.MemberPricePromotionInfo(str, str2, bool.booleanValue());
            }
            Assertions.a(reader, "isApplied");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CartProductCard.MemberPricePromotionInfo value = (CartProductCard.MemberPricePromotionInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f10405a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("isApplied");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.c));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCardImpl_ResponseAdapter$MultiBuyPromotionInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCard$MultiBuyPromotionInfo;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MultiBuyPromotionInfo implements Adapter<CartProductCard.MultiBuyPromotionInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final MultiBuyPromotionInfo f10417a = new MultiBuyPromotionInfo();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "isApplied");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            Boolean bool = null;
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
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
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
            if (bool != null) {
                return new CartProductCard.MultiBuyPromotionInfo(str, str2, bool.booleanValue());
            }
            Assertions.a(reader, "isApplied");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CartProductCard.MultiBuyPromotionInfo value = (CartProductCard.MultiBuyPromotionInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f10406a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("isApplied");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.c));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCardImpl_ResponseAdapter$QuantityInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCard$QuantityInfo;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class QuantityInfo implements Adapter<CartProductCard.QuantityInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final QuantityInfo f10418a = new QuantityInfo();
        public static final List b = CollectionsKt.R("minimum", "maximum", "increment", "defaultValue", "unit");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Double d = null;
            Double d2 = null;
            Double d3 = null;
            Double d4 = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    d = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    d2 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    d3 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    d4 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (d == null) {
                Assertions.a(reader, "minimum");
                throw null;
            }
            double dDoubleValue = d.doubleValue();
            if (d2 == null) {
                Assertions.a(reader, "maximum");
                throw null;
            }
            double dDoubleValue2 = d2.doubleValue();
            if (d3 == null) {
                Assertions.a(reader, "increment");
                throw null;
            }
            double dDoubleValue3 = d3.doubleValue();
            if (d4 != null) {
                return new CartProductCard.QuantityInfo(dDoubleValue, dDoubleValue2, dDoubleValue3, d4.doubleValue(), str);
            }
            Assertions.a(reader, "defaultValue");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CartProductCard.QuantityInfo value = (CartProductCard.QuantityInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("minimum");
            Adapters$DoubleAdapter$1 adapters$DoubleAdapter$1 = Adapters.c;
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.f10407a));
            writer.F1("maximum");
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.b));
            writer.F1("increment");
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.c));
            writer.F1("defaultValue");
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.d));
            writer.F1("unit");
            Adapters.i.toJson(writer, customScalarAdapters, value.e);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCardImpl_ResponseAdapter$SingleMemberPricePromotionInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCard$SingleMemberPricePromotionInfo;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SingleMemberPricePromotionInfo implements Adapter<CartProductCard.SingleMemberPricePromotionInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final SingleMemberPricePromotionInfo f10419a = new SingleMemberPricePromotionInfo();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "isApplied");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            Boolean bool = null;
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
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
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
            if (bool != null) {
                return new CartProductCard.SingleMemberPricePromotionInfo(str, str2, bool.booleanValue());
            }
            Assertions.a(reader, "isApplied");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CartProductCard.SingleMemberPricePromotionInfo value = (CartProductCard.SingleMemberPricePromotionInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f10408a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("isApplied");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.c));
        }
    }
}
