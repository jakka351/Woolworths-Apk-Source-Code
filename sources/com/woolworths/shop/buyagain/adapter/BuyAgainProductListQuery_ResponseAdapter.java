package com.woolworths.shop.buyagain.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.graphql.common.fragment.ProductCardImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.adapter.ButtonStyle_ResponseAdapter;
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
import com.woolworths.shop.buyagain.BuyAgainProductListQuery;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/woolworths/shop/buyagain/adapter/BuyAgainProductListQuery_ResponseAdapter;", "", "Data", "BuyAgainProductList", "Header", "Footer", "SaveToListBtn", "AddToCartBtn", "BuyAgainProducts", "ProductsFeed", "OnProductCard", "Chip", "Text", "FilterStatus", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BuyAgainProductListQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/buyagain/adapter/BuyAgainProductListQuery_ResponseAdapter$AddToCartBtn;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/buyagain/BuyAgainProductListQuery$AddToCartBtn;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AddToCartBtn implements Adapter<BuyAgainProductListQuery.AddToCartBtn> {

        /* renamed from: a, reason: collision with root package name */
        public static final AddToCartBtn f21507a = new AddToCartBtn();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, UrlHandler.ACTION, "style", "enabled");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ButtonStyle buttonStyle = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool != null) {
                return new BuyAgainProductListQuery.AddToCartBtn(str, str2, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BuyAgainProductListQuery.AddToCartBtn value = (BuyAgainProductListQuery.AddToCartBtn) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21495a);
            writer.F1(UrlHandler.ACTION);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.c);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.d));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/buyagain/adapter/BuyAgainProductListQuery_ResponseAdapter$BuyAgainProductList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/buyagain/BuyAgainProductListQuery$BuyAgainProductList;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BuyAgainProductList implements Adapter<BuyAgainProductListQuery.BuyAgainProductList> {

        /* renamed from: a, reason: collision with root package name */
        public static final BuyAgainProductList f21508a = new BuyAgainProductList();
        public static final List b = CollectionsKt.R("header", "footer", "buyAgainProducts", "filterStatus");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            BuyAgainProductListQuery.Header header = null;
            BuyAgainProductListQuery.Footer footer = null;
            BuyAgainProductListQuery.BuyAgainProducts buyAgainProducts = null;
            BuyAgainProductListQuery.FilterStatus filterStatus = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    header = (BuyAgainProductListQuery.Header) Adapters.c(Header.f21514a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    footer = (BuyAgainProductListQuery.Footer) Adapters.c(Footer.f21513a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    buyAgainProducts = (BuyAgainProductListQuery.BuyAgainProducts) Adapters.c(BuyAgainProducts.f21509a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    filterStatus = (BuyAgainProductListQuery.FilterStatus) Adapters.b(Adapters.c(FilterStatus.f21512a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (header == null) {
                Assertions.a(reader, "header");
                throw null;
            }
            if (footer == null) {
                Assertions.a(reader, "footer");
                throw null;
            }
            if (buyAgainProducts != null) {
                return new BuyAgainProductListQuery.BuyAgainProductList(header, footer, buyAgainProducts, filterStatus);
            }
            Assertions.a(reader, "buyAgainProducts");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BuyAgainProductListQuery.BuyAgainProductList value = (BuyAgainProductListQuery.BuyAgainProductList) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("header");
            Adapters.c(Header.f21514a, false).toJson(writer, customScalarAdapters, value.f21496a);
            writer.F1("footer");
            Adapters.c(Footer.f21513a, false).toJson(writer, customScalarAdapters, value.b);
            writer.F1("buyAgainProducts");
            Adapters.c(BuyAgainProducts.f21509a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("filterStatus");
            Adapters.b(Adapters.c(FilterStatus.f21512a, false)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/buyagain/adapter/BuyAgainProductListQuery_ResponseAdapter$BuyAgainProducts;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/buyagain/BuyAgainProductListQuery$BuyAgainProducts;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BuyAgainProducts implements Adapter<BuyAgainProductListQuery.BuyAgainProducts> {

        /* renamed from: a, reason: collision with root package name */
        public static final BuyAgainProducts f21509a = new BuyAgainProducts();
        public static final List b = CollectionsKt.R("totalNumberOfProducts", "nextPage", "productsFeed", "chips");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Integer num2 = null;
            ArrayList arrayListFromJson = null;
            List list = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    num = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    num2 = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson = Adapters.a(Adapters.c(ProductsFeed.f21516a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    list = (List) Adapters.b(Adapters.a(Adapters.c(Chip.f21510a, false))).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new BuyAgainProductListQuery.BuyAgainProducts(num, num2, arrayListFromJson, list);
            }
            Assertions.a(reader, "productsFeed");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BuyAgainProductListQuery.BuyAgainProducts value = (BuyAgainProductListQuery.BuyAgainProducts) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("totalNumberOfProducts");
            NullableAdapter nullableAdapter = Adapters.k;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f21497a);
            writer.F1("nextPage");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("productsFeed");
            Adapters.a(Adapters.c(ProductsFeed.f21516a, true)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("chips");
            Adapters.b(Adapters.a(Adapters.c(Chip.f21510a, false))).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/buyagain/adapter/BuyAgainProductListQuery_ResponseAdapter$Chip;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/buyagain/BuyAgainProductListQuery$Chip;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Chip implements Adapter<BuyAgainProductListQuery.Chip> {

        /* renamed from: a, reason: collision with root package name */
        public static final Chip f21510a = new Chip();
        public static final List b = CollectionsKt.R("id", "isSelected", TextBundle.TEXT_ENTRY, "count");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Boolean bool = null;
            BuyAgainProductListQuery.Text text = null;
            Integer num = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    text = (BuyAgainProductListQuery.Text) Adapters.c(Text.f21518a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    num = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (bool == null) {
                Assertions.a(reader, "isSelected");
                throw null;
            }
            boolean zBooleanValue = bool.booleanValue();
            if (text != null) {
                return new BuyAgainProductListQuery.Chip(str, zBooleanValue, text, num);
            }
            Assertions.a(reader, TextBundle.TEXT_ENTRY);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BuyAgainProductListQuery.Chip value = (BuyAgainProductListQuery.Chip) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21498a);
            writer.F1("isSelected");
            d.B(value.b, Adapters.f, writer, customScalarAdapters, TextBundle.TEXT_ENTRY);
            Adapters.c(Text.f21518a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("count");
            Adapters.k.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/buyagain/adapter/BuyAgainProductListQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/buyagain/BuyAgainProductListQuery$Data;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<BuyAgainProductListQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f21511a = new Data();
        public static final List b = CollectionsKt.Q("buyAgainProductList");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            BuyAgainProductListQuery.BuyAgainProductList buyAgainProductList = null;
            while (reader.o2(b) == 0) {
                buyAgainProductList = (BuyAgainProductListQuery.BuyAgainProductList) Adapters.c(BuyAgainProductList.f21508a, false).fromJson(reader, customScalarAdapters);
            }
            if (buyAgainProductList != null) {
                return new BuyAgainProductListQuery.Data(buyAgainProductList);
            }
            Assertions.a(reader, "buyAgainProductList");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BuyAgainProductListQuery.Data value = (BuyAgainProductListQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("buyAgainProductList");
            Adapters.c(BuyAgainProductList.f21508a, false).toJson(writer, customScalarAdapters, value.f21499a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/buyagain/adapter/BuyAgainProductListQuery_ResponseAdapter$FilterStatus;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/buyagain/BuyAgainProductListQuery$FilterStatus;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FilterStatus implements Adapter<BuyAgainProductListQuery.FilterStatus> {

        /* renamed from: a, reason: collision with root package name */
        public static final FilterStatus f21512a = new FilterStatus();
        public static final List b = CollectionsKt.R("message", "revertedFilterChipIds");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new BuyAgainProductListQuery.FilterStatus(str, arrayListFromJson);
            }
            Assertions.a(reader, "revertedFilterChipIds");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BuyAgainProductListQuery.FilterStatus value = (BuyAgainProductListQuery.FilterStatus) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("message");
            Adapters.i.toJson(writer, customScalarAdapters, value.f21500a);
            writer.F1("revertedFilterChipIds");
            Adapters.a(Adapters.f13493a).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/buyagain/adapter/BuyAgainProductListQuery_ResponseAdapter$Footer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/buyagain/BuyAgainProductListQuery$Footer;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Footer implements Adapter<BuyAgainProductListQuery.Footer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Footer f21513a = new Footer();
        public static final List b = CollectionsKt.R("saveToListBtn", "addToCartBtn");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            BuyAgainProductListQuery.SaveToListBtn saveToListBtn = null;
            BuyAgainProductListQuery.AddToCartBtn addToCartBtn = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    saveToListBtn = (BuyAgainProductListQuery.SaveToListBtn) Adapters.b(Adapters.c(SaveToListBtn.f21517a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new BuyAgainProductListQuery.Footer(saveToListBtn, addToCartBtn);
                    }
                    addToCartBtn = (BuyAgainProductListQuery.AddToCartBtn) Adapters.b(Adapters.c(AddToCartBtn.f21507a, false)).fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BuyAgainProductListQuery.Footer value = (BuyAgainProductListQuery.Footer) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("saveToListBtn");
            Adapters.b(Adapters.c(SaveToListBtn.f21517a, false)).toJson(writer, customScalarAdapters, value.f21501a);
            writer.F1("addToCartBtn");
            Adapters.b(Adapters.c(AddToCartBtn.f21507a, false)).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/buyagain/adapter/BuyAgainProductListQuery_ResponseAdapter$Header;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/buyagain/BuyAgainProductListQuery$Header;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Header implements Adapter<BuyAgainProductListQuery.Header> {

        /* renamed from: a, reason: collision with root package name */
        public static final Header f21514a = new Header();
        public static final List b = CollectionsKt.Q("totalProductsText");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new BuyAgainProductListQuery.Header(str);
            }
            Assertions.a(reader, "totalProductsText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BuyAgainProductListQuery.Header value = (BuyAgainProductListQuery.Header) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("totalProductsText");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21502a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/buyagain/adapter/BuyAgainProductListQuery_ResponseAdapter$OnProductCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/buyagain/BuyAgainProductListQuery$OnProductCard;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductCard implements Adapter<BuyAgainProductListQuery.OnProductCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21515a = CollectionsKt.Q("__typename");

        public static BuyAgainProductListQuery.OnProductCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f21515a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new BuyAgainProductListQuery.OnProductCard(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, BuyAgainProductListQuery.OnProductCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21503a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (BuyAgainProductListQuery.OnProductCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/buyagain/adapter/BuyAgainProductListQuery_ResponseAdapter$ProductsFeed;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/buyagain/BuyAgainProductListQuery$ProductsFeed;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductsFeed implements Adapter<BuyAgainProductListQuery.ProductsFeed> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductsFeed f21516a = new ProductsFeed();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            BuyAgainProductListQuery.OnProductCard onProductCardA = null;
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
            return new BuyAgainProductListQuery.ProductsFeed(str, onProductCardA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BuyAgainProductListQuery.ProductsFeed value = (BuyAgainProductListQuery.ProductsFeed) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21504a);
            BuyAgainProductListQuery.OnProductCard onProductCard = value.b;
            if (onProductCard != null) {
                OnProductCard.b(writer, customScalarAdapters, onProductCard);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/buyagain/adapter/BuyAgainProductListQuery_ResponseAdapter$SaveToListBtn;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/buyagain/BuyAgainProductListQuery$SaveToListBtn;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SaveToListBtn implements Adapter<BuyAgainProductListQuery.SaveToListBtn> {

        /* renamed from: a, reason: collision with root package name */
        public static final SaveToListBtn f21517a = new SaveToListBtn();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, UrlHandler.ACTION, "style", "enabled");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ButtonStyle buttonStyle = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool != null) {
                return new BuyAgainProductListQuery.SaveToListBtn(str, str2, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BuyAgainProductListQuery.SaveToListBtn value = (BuyAgainProductListQuery.SaveToListBtn) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21505a);
            writer.F1(UrlHandler.ACTION);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.c);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.d));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/buyagain/adapter/BuyAgainProductListQuery_ResponseAdapter$Text;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/buyagain/BuyAgainProductListQuery$Text;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Text implements Adapter<BuyAgainProductListQuery.Text> {

        /* renamed from: a, reason: collision with root package name */
        public static final Text f21518a = new Text();
        public static final List b = CollectionsKt.R(TextBundle.TEXT_ENTRY, "altText");

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
                Assertions.a(reader, TextBundle.TEXT_ENTRY);
                throw null;
            }
            if (str2 != null) {
                return new BuyAgainProductListQuery.Text(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BuyAgainProductListQuery.Text value = (BuyAgainProductListQuery.Text) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21506a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }
}
