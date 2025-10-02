package com.woolworths.shop.productcard.data.fragment;

import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductTrolley;
import au.com.woolworths.graphql.common.fragment.ProductTrolleyImpl_ResponseAdapter;
import au.com.woolworths.sdui.shop.fragment.CoreTagUI;
import au.com.woolworths.sdui.shop.fragment.CoreTagUIImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.AisleSide;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.InStoreLocationType;
import au.com.woolworths.shop.graphql.type.ProductStatusScheme;
import au.com.woolworths.shop.graphql.type.PurchaseRestriction;
import au.com.woolworths.shop.graphql.type.RoundelImagePriority;
import au.com.woolworths.shop.graphql.type.adapter.ActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.AisleSide_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ButtonStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InStoreLocationType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ProductStatusScheme_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.PurchaseRestriction_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.RoundelImagePriority_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$DoubleAdapter$1;
import com.apollographql.apollo.api.Adapters$IntAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.UrlHandler;
import com.woolworths.shop.productcard.data.fragment.ProductTile;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b%\bÆ\u0002\u0018\u00002\u00020\u0001:$\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter;", "", "ProductTile", "RoundelImage", "MainProductImage", "ProductTag", "PriceInfo", "UnitPriceDescription", "WasPrice", "SavePrice", "VariablePrice", "PriceClarificationMessage", "ProductStatus", "Text", "MiddleMessage", "RatingsAndReviews", "DisplayText", "Footer", "FooterIcon", "FooterAction", "List", "Trolley", "RewardsOfferInfo", "Category", "ProductCardAction", "InStoreInfo", "Location", "DisplayInfo", "Details", "Availability", "Button", "ButtonAction", "InfoSheet", "Button1", "ButtonAction1", "MarketplaceInfo", "Description", "RestrictionInfo", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductTileImpl_ResponseAdapter {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$Availability;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$Availability;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Availability implements Adapter<ProductTile.Availability> {

        /* renamed from: a, reason: collision with root package name */
        public static final Availability f23667a = new Availability();
        public static final java.util.List b = CollectionsKt.R("button", "status", "infoSheet");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductTile.Button button = null;
            String str = null;
            ProductTile.InfoSheet infoSheet = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    button = (ProductTile.Button) Adapters.c(Button.f23668a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    infoSheet = (ProductTile.InfoSheet) Adapters.b(Adapters.c(InfoSheet.f23681a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (button != null) {
                return new ProductTile.Availability(button, str, infoSheet);
            }
            Assertions.a(reader, "button");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.Availability value = (ProductTile.Availability) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("button");
            Adapters.c(Button.f23668a, false).toJson(writer, customScalarAdapters, value.f23632a);
            writer.F1("status");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("infoSheet");
            Adapters.b(Adapters.c(InfoSheet.f23681a, false)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$Button;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$Button;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button implements Adapter<ProductTile.Button> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button f23668a = new Button();
        public static final java.util.List b = CollectionsKt.R("buttonId", AnnotatedPrivateKey.LABEL, "style", "enabled", UrlHandler.ACTION, "url", "buttonAction", "iconUrl");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            ButtonStyle buttonStyle = null;
            String str3 = null;
            String str4 = null;
            ProductTile.ButtonAction buttonAction = null;
            String str5 = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        bool = bool2;
                        str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bool = bool2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        bool = bool2;
                        buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 4:
                        bool = bool2;
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        bool = bool2;
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = bool2;
                        buttonAction = (ProductTile.ButtonAction) Adapters.b(Adapters.c(ButtonAction.f23670a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        bool = bool2;
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Boolean bool3 = bool2;
                        if (str2 == null) {
                            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                            throw null;
                        }
                        if (bool3 != null) {
                            return new ProductTile.Button(str, str2, buttonStyle, bool3.booleanValue(), str3, str4, buttonAction, str5);
                        }
                        Assertions.a(reader, "enabled");
                        throw null;
                }
                bool2 = bool;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.Button value = (ProductTile.Button) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("buttonId");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f23633a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.c);
            writer.F1("enabled");
            d.B(value.d, Adapters.f, writer, customScalarAdapters, UrlHandler.ACTION);
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("url");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
            writer.F1("buttonAction");
            Adapters.b(Adapters.c(ButtonAction.f23670a, false)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("iconUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.h);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$Button1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$Button1;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button1 implements Adapter<ProductTile.Button1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button1 f23669a = new Button1();
        public static final java.util.List b = CollectionsKt.R("buttonId", AnnotatedPrivateKey.LABEL, "style", "enabled", UrlHandler.ACTION, "url", "buttonAction", "iconUrl", "altText");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            ButtonStyle buttonStyle = null;
            String str3 = null;
            String str4 = null;
            ProductTile.ButtonAction1 buttonAction1 = null;
            String str5 = null;
            String str6 = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        bool = bool2;
                        str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bool = bool2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        bool = bool2;
                        buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 4:
                        bool = bool2;
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        bool = bool2;
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = bool2;
                        buttonAction1 = (ProductTile.ButtonAction1) Adapters.b(Adapters.c(ButtonAction1.f23671a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        bool = bool2;
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        bool = bool2;
                        str6 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Boolean bool3 = bool2;
                        if (str2 == null) {
                            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                            throw null;
                        }
                        if (bool3 != null) {
                            return new ProductTile.Button1(str, str2, buttonStyle, bool3.booleanValue(), str3, str4, buttonAction1, str5, str6);
                        }
                        Assertions.a(reader, "enabled");
                        throw null;
                }
                bool2 = bool;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.Button1 value = (ProductTile.Button1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("buttonId");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f23634a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.c);
            writer.F1("enabled");
            d.B(value.d, Adapters.f, writer, customScalarAdapters, UrlHandler.ACTION);
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("url");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
            writer.F1("buttonAction");
            Adapters.b(Adapters.c(ButtonAction1.f23671a, false)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("iconUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.h);
            writer.F1("altText");
            nullableAdapter.toJson(writer, customScalarAdapters, value.i);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$ButtonAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$ButtonAction;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ButtonAction implements Adapter<ProductTile.ButtonAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final ButtonAction f23670a = new ButtonAction();
        public static final java.util.List b = CollectionsKt.R("type", UrlHandler.ACTION, "id");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ActionType actionTypeA = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str != null) {
                return new ProductTile.ButtonAction(actionTypeA, str, str2);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.ButtonAction value = (ProductTile.ButtonAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.f23635a);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$ButtonAction1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$ButtonAction1;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ButtonAction1 implements Adapter<ProductTile.ButtonAction1> {

        /* renamed from: a, reason: collision with root package name */
        public static final ButtonAction1 f23671a = new ButtonAction1();
        public static final java.util.List b = CollectionsKt.R("type", UrlHandler.ACTION, "id");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ActionType actionTypeA = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str != null) {
                return new ProductTile.ButtonAction1(actionTypeA, str, str2);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.ButtonAction1 value = (ProductTile.ButtonAction1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.f23636a);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$Category;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$Category;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Category implements Adapter<ProductTile.Category> {

        /* renamed from: a, reason: collision with root package name */
        public static final Category f23672a = new Category();
        public static final java.util.List b = CollectionsKt.R(AppMeasurementSdk.ConditionalUserProperty.NAME, "categoryLevel");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Integer num = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new ProductTile.Category(str, num);
                    }
                    num = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.Category value = (ProductTile.Category) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AppMeasurementSdk.ConditionalUserProperty.NAME);
            Adapters.i.toJson(writer, customScalarAdapters, value.f23637a);
            writer.F1("categoryLevel");
            Adapters.k.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$Description;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$Description;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Description implements Adapter<ProductTile.Description> {

        /* renamed from: a, reason: collision with root package name */
        public static final Description f23673a = new Description();
        public static final java.util.List b = CollectionsKt.R("altText", TextBundle.TEXT_ENTRY);

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
                return new ProductTile.Description(str, str2);
            }
            Assertions.a(reader, TextBundle.TEXT_ENTRY);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.Description value = (ProductTile.Description) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("altText");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23638a);
            writer.F1(TextBundle.TEXT_ENTRY);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$Details;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$Details;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Details implements Adapter<ProductTile.Details> {

        /* renamed from: a, reason: collision with root package name */
        public static final Details f23674a = new Details();
        public static final java.util.List b = CollectionsKt.R("x", "y", "z", "aisleSide", "location", "aisleNumber", "bayNumber", "bayNumberAlternate", "floorNumber");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Double d = null;
            Double d2 = null;
            Double d3 = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            AisleSide aisleSideA = null;
            Integer num5 = null;
            String str = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        d = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                        continue;
                    case 1:
                        d2 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                        continue;
                    case 2:
                        d3 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                        continue;
                    case 3:
                        aisleSideA = AisleSide_ResponseAdapter.a(reader, customScalarAdapters);
                        continue;
                    case 4:
                        num = num2;
                        str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        continue;
                    case 6:
                        num = num2;
                        num3 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        num = num2;
                        num5 = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        num = num2;
                        num4 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Integer num6 = num2;
                        if (d == null) {
                            Assertions.a(reader, "x");
                            throw null;
                        }
                        Integer num7 = num3;
                        Integer num8 = num4;
                        double dDoubleValue = d.doubleValue();
                        if (d2 == null) {
                            Assertions.a(reader, "y");
                            throw null;
                        }
                        double dDoubleValue2 = d2.doubleValue();
                        if (d3 == null) {
                            Assertions.a(reader, "z");
                            throw null;
                        }
                        double dDoubleValue3 = d3.doubleValue();
                        if (aisleSideA == null) {
                            Assertions.a(reader, "aisleSide");
                            throw null;
                        }
                        if (num6 == null) {
                            Assertions.a(reader, "aisleNumber");
                            throw null;
                        }
                        int iIntValue = num6.intValue();
                        if (num7 == null) {
                            Assertions.a(reader, "bayNumber");
                            throw null;
                        }
                        int iIntValue2 = num7.intValue();
                        if (num8 != null) {
                            return new ProductTile.Details(dDoubleValue, dDoubleValue2, dDoubleValue3, iIntValue, iIntValue2, num8.intValue(), aisleSideA, num5, str);
                        }
                        Assertions.a(reader, "floorNumber");
                        throw null;
                }
                num2 = num;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.Details value = (ProductTile.Details) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("x");
            Adapters$DoubleAdapter$1 adapters$DoubleAdapter$1 = Adapters.c;
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.f23639a));
            writer.F1("y");
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.b));
            writer.F1("z");
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.c));
            writer.F1("aisleSide");
            AisleSide_ResponseAdapter.b(writer, customScalarAdapters, value.d);
            writer.F1("location");
            Adapters.i.toJson(writer, customScalarAdapters, value.e);
            writer.F1("aisleNumber");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.f, adapters$IntAdapter$1, writer, customScalarAdapters, "bayNumber");
            d.y(value.g, adapters$IntAdapter$1, writer, customScalarAdapters, "bayNumberAlternate");
            Adapters.k.toJson(writer, customScalarAdapters, value.h);
            writer.F1("floorNumber");
            adapters$IntAdapter$1.toJson(writer, customScalarAdapters, Integer.valueOf(value.i));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$DisplayInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$DisplayInfo;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DisplayInfo implements Adapter<ProductTile.DisplayInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final DisplayInfo f23675a = new DisplayInfo();
        public static final java.util.List b = CollectionsKt.R("locationText", "locationType");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            InStoreLocationType inStoreLocationType = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new ProductTile.DisplayInfo(str, inStoreLocationType);
                    }
                    inStoreLocationType = (InStoreLocationType) Adapters.b(InStoreLocationType_ResponseAdapter.f12080a).fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.DisplayInfo value = (ProductTile.DisplayInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("locationText");
            Adapters.i.toJson(writer, customScalarAdapters, value.f23640a);
            writer.F1("locationType");
            Adapters.b(InStoreLocationType_ResponseAdapter.f12080a).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$DisplayText;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$DisplayText;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DisplayText implements Adapter<ProductTile.DisplayText> {

        /* renamed from: a, reason: collision with root package name */
        public static final DisplayText f23676a = new DisplayText();
        public static final java.util.List b = CollectionsKt.R(TextBundle.TEXT_ENTRY, "altText");

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
                return new ProductTile.DisplayText(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.DisplayText value = (ProductTile.DisplayText) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23641a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$Footer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$Footer;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Footer implements Adapter<ProductTile.Footer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Footer f23677a = new Footer();
        public static final java.util.List b = CollectionsKt.R("footerText", "footerIcon", "isEnhanced", "footerAction");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ProductTile.FooterIcon footerIcon = null;
            Boolean bool = null;
            ProductTile.FooterAction footerAction = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    footerIcon = (ProductTile.FooterIcon) Adapters.b(Adapters.c(FooterIcon.f23679a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    footerAction = (ProductTile.FooterAction) Adapters.b(Adapters.c(FooterAction.f23678a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "footerText");
                throw null;
            }
            if (bool != null) {
                return new ProductTile.Footer(str, footerIcon, bool.booleanValue(), footerAction);
            }
            Assertions.a(reader, "isEnhanced");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.Footer value = (ProductTile.Footer) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("footerText");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23642a);
            writer.F1("footerIcon");
            Adapters.b(Adapters.c(FooterIcon.f23679a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("isEnhanced");
            d.B(value.c, Adapters.f, writer, customScalarAdapters, "footerAction");
            Adapters.b(Adapters.c(FooterAction.f23678a, false)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$FooterAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$FooterAction;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FooterAction implements Adapter<ProductTile.FooterAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final FooterAction f23678a = new FooterAction();
        public static final java.util.List b = CollectionsKt.R("type", UrlHandler.ACTION, "id");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ActionType actionTypeA = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str != null) {
                return new ProductTile.FooterAction(actionTypeA, str, str2);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.FooterAction value = (ProductTile.FooterAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.f23643a);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$FooterIcon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$FooterIcon;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FooterIcon implements Adapter<ProductTile.FooterIcon> {

        /* renamed from: a, reason: collision with root package name */
        public static final FooterIcon f23679a = new FooterIcon();
        public static final java.util.List b = CollectionsKt.Q("coreIconName");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new ProductTile.FooterIcon(str);
            }
            Assertions.a(reader, "coreIconName");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.FooterIcon value = (ProductTile.FooterIcon) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("coreIconName");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23644a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$InStoreInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$InStoreInfo;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InStoreInfo implements Adapter<ProductTile.InStoreInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final InStoreInfo f23680a = new InStoreInfo();
        public static final java.util.List b = CollectionsKt.R("location", "availability");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductTile.Location location = null;
            ProductTile.Availability availability = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    location = (ProductTile.Location) Adapters.b(Adapters.c(Location.f23683a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new ProductTile.InStoreInfo(location, availability);
                    }
                    availability = (ProductTile.Availability) Adapters.b(Adapters.c(Availability.f23667a, false)).fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.InStoreInfo value = (ProductTile.InStoreInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("location");
            Adapters.b(Adapters.c(Location.f23683a, false)).toJson(writer, customScalarAdapters, value.f23645a);
            writer.F1("availability");
            Adapters.b(Adapters.c(Availability.f23667a, false)).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$InfoSheet;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$InfoSheet;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InfoSheet implements Adapter<ProductTile.InfoSheet> {

        /* renamed from: a, reason: collision with root package name */
        public static final InfoSheet f23681a = new InfoSheet();
        public static final java.util.List b = CollectionsKt.R("title", "message", "button");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ProductTile.Button1 button1 = null;
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
                    button1 = (ProductTile.Button1) Adapters.c(Button1.f23669a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "message");
                throw null;
            }
            if (button1 != null) {
                return new ProductTile.InfoSheet(str, str2, button1);
            }
            Assertions.a(reader, "button");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.InfoSheet value = (ProductTile.InfoSheet) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23646a);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("button");
            Adapters.c(Button1.f23669a, false).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$List;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$List;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class List implements Adapter<ProductTile.List> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23682a = new List();
        public static final java.util.List b = CollectionsKt.R("minimum", "maximum", "increment", "defaultValue", "unit");

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
                return new ProductTile.List(dDoubleValue, dDoubleValue2, dDoubleValue3, d4.doubleValue(), str);
            }
            Assertions.a(reader, "defaultValue");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.List value = (ProductTile.List) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("minimum");
            Adapters$DoubleAdapter$1 adapters$DoubleAdapter$1 = Adapters.c;
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.f23647a));
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$Location;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$Location;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Location implements Adapter<ProductTile.Location> {

        /* renamed from: a, reason: collision with root package name */
        public static final Location f23683a = new Location();
        public static final java.util.List b = CollectionsKt.R("displayInfo", ErrorBundle.DETAIL_ENTRY);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductTile.DisplayInfo displayInfo = null;
            ProductTile.Details details = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    displayInfo = (ProductTile.DisplayInfo) Adapters.b(Adapters.c(DisplayInfo.f23675a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new ProductTile.Location(displayInfo, details);
                    }
                    details = (ProductTile.Details) Adapters.b(Adapters.c(Details.f23674a, false)).fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.Location value = (ProductTile.Location) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayInfo");
            Adapters.b(Adapters.c(DisplayInfo.f23675a, false)).toJson(writer, customScalarAdapters, value.f23648a);
            writer.F1(ErrorBundle.DETAIL_ENTRY);
            Adapters.b(Adapters.c(Details.f23674a, false)).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$MainProductImage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$MainProductImage;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MainProductImage implements Adapter<ProductTile.MainProductImage> {

        /* renamed from: a, reason: collision with root package name */
        public static final MainProductImage f23684a = new MainProductImage();
        public static final java.util.List b = CollectionsKt.R("smallUrl", "mediumUrl", "largeUrl", "altText");

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
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        return new ProductTile.MainProductImage(str, str2, str3, str4);
                    }
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.MainProductImage value = (ProductTile.MainProductImage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("smallUrl");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f23649a);
            writer.F1("mediumUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("largeUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("altText");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$MarketplaceInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$MarketplaceInfo;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MarketplaceInfo implements Adapter<ProductTile.MarketplaceInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final MarketplaceInfo f23685a = new MarketplaceInfo();
        public static final java.util.List b = CollectionsKt.R("iconUrl", lqlqqlq.mmm006Dm006Dm);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ProductTile.Description description = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    description = (ProductTile.Description) Adapters.c(Description.f23673a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "iconUrl");
                throw null;
            }
            if (description != null) {
                return new ProductTile.MarketplaceInfo(str, description);
            }
            Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.MarketplaceInfo value = (ProductTile.MarketplaceInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("iconUrl");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23650a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            Adapters.c(Description.f23673a, false).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$MiddleMessage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$MiddleMessage;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MiddleMessage implements Adapter<ProductTile.MiddleMessage> {

        /* renamed from: a, reason: collision with root package name */
        public static final MiddleMessage f23686a = new MiddleMessage();
        public static final java.util.List b = CollectionsKt.R(TextBundle.TEXT_ENTRY, "altText");

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
                return new ProductTile.MiddleMessage(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.MiddleMessage value = (ProductTile.MiddleMessage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23651a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$PriceClarificationMessage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$PriceClarificationMessage;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PriceClarificationMessage implements Adapter<ProductTile.PriceClarificationMessage> {

        /* renamed from: a, reason: collision with root package name */
        public static final PriceClarificationMessage f23687a = new PriceClarificationMessage();
        public static final java.util.List b = CollectionsKt.R(TextBundle.TEXT_ENTRY, "altText");

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
                return new ProductTile.PriceClarificationMessage(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.PriceClarificationMessage value = (ProductTile.PriceClarificationMessage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23652a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$PriceInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$PriceInfo;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PriceInfo implements Adapter<ProductTile.PriceInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final PriceInfo f23688a = new PriceInfo();
        public static final java.util.List b = CollectionsKt.R("leadPriceHeaderText", "leadPrice", "leadPriceMeasure", "unitPriceDescriptions", "wasPrice", "savePrice", "variablePrice", "priceClarificationMessage");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Integer num = null;
            String str2 = null;
            java.util.List list = null;
            ProductTile.WasPrice wasPrice = null;
            ProductTile.SavePrice savePrice = null;
            ProductTile.VariablePrice variablePrice = null;
            ProductTile.PriceClarificationMessage priceClarificationMessage = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        num = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        list = (java.util.List) Adapters.b(Adapters.a(Adapters.c(UnitPriceDescription.f23700a, false))).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        wasPrice = (ProductTile.WasPrice) Adapters.b(Adapters.c(WasPrice.f23702a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        savePrice = (ProductTile.SavePrice) Adapters.b(Adapters.c(SavePrice.f23697a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        variablePrice = (ProductTile.VariablePrice) Adapters.b(Adapters.c(VariablePrice.f23701a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        priceClarificationMessage = (ProductTile.PriceClarificationMessage) Adapters.b(Adapters.c(PriceClarificationMessage.f23687a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        return new ProductTile.PriceInfo(str, num, str2, list, wasPrice, savePrice, variablePrice, priceClarificationMessage);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.PriceInfo value = (ProductTile.PriceInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("leadPriceHeaderText");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f23653a);
            writer.F1("leadPrice");
            Adapters.k.toJson(writer, customScalarAdapters, value.b);
            writer.F1("leadPriceMeasure");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("unitPriceDescriptions");
            Adapters.b(Adapters.a(Adapters.c(UnitPriceDescription.f23700a, false))).toJson(writer, customScalarAdapters, value.d);
            writer.F1("wasPrice");
            Adapters.b(Adapters.c(WasPrice.f23702a, false)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("savePrice");
            Adapters.b(Adapters.c(SavePrice.f23697a, false)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("variablePrice");
            Adapters.b(Adapters.c(VariablePrice.f23701a, false)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("priceClarificationMessage");
            Adapters.b(Adapters.c(PriceClarificationMessage.f23687a, false)).toJson(writer, customScalarAdapters, value.h);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$ProductCardAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$ProductCardAction;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductCardAction implements Adapter<ProductTile.ProductCardAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductCardAction f23689a = new ProductCardAction();
        public static final java.util.List b = CollectionsKt.R("type", UrlHandler.ACTION, "id");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ActionType actionTypeA = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str != null) {
                return new ProductTile.ProductCardAction(actionTypeA, str, str2);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.ProductCardAction value = (ProductTile.ProductCardAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.f23654a);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$ProductStatus;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$ProductStatus;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductStatus implements Adapter<ProductTile.ProductStatus> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductStatus f23690a = new ProductStatus();
        public static final java.util.List b = CollectionsKt.R(TextBundle.TEXT_ENTRY, "colorScheme");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductTile.Text text = null;
            ProductStatusScheme productStatusScheme = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    text = (ProductTile.Text) Adapters.b(Adapters.c(Text.f23698a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new ProductTile.ProductStatus(text, productStatusScheme);
                    }
                    productStatusScheme = (ProductStatusScheme) Adapters.b(ProductStatusScheme_ResponseAdapter.f12108a).fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.ProductStatus value = (ProductTile.ProductStatus) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters.b(Adapters.c(Text.f23698a, false)).toJson(writer, customScalarAdapters, value.f23655a);
            writer.F1("colorScheme");
            Adapters.b(ProductStatusScheme_ResponseAdapter.f12108a).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$ProductTag;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$ProductTag;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductTag implements Adapter<ProductTile.ProductTag> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductTag f23691a = new ProductTag();
        public static final java.util.List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            CoreTagUI coreTagUIA = CoreTagUIImpl_ResponseAdapter.CoreTagUI.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductTile.ProductTag(str, coreTagUIA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.ProductTag value = (ProductTile.ProductTag) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23656a);
            java.util.List list = CoreTagUIImpl_ResponseAdapter.CoreTagUI.f10068a;
            CoreTagUIImpl_ResponseAdapter.CoreTagUI.b(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$ProductTile;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductTile implements Adapter<com.woolworths.shop.productcard.data.fragment.ProductTile> {

        /* renamed from: a, reason: collision with root package name */
        public static final java.util.List f23692a = CollectionsKt.R("productId", "productName", "roundelImage", "mainProductImage", "productTags", "priceInfo", "productStatuses", "middleMessage", "ratingsAndReviews", "footer", "list", "trolleys", "adId", "rewardsOfferInfo", "categories", "source", "productCardAction", "inStoreInfo", "marketplaceInfo", "restrictionInfo");

        public static com.woolworths.shop.productcard.data.fragment.ProductTile a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ProductTile.RoundelImage roundelImage = null;
            ProductTile.MainProductImage mainProductImage = null;
            java.util.List list = null;
            ProductTile.PriceInfo priceInfo = null;
            java.util.List list2 = null;
            ProductTile.MiddleMessage middleMessage = null;
            ProductTile.RatingsAndReviews ratingsAndReviews = null;
            ProductTile.Footer footer = null;
            ProductTile.List list3 = null;
            java.util.List list4 = null;
            String str3 = null;
            ProductTile.RewardsOfferInfo rewardsOfferInfo = null;
            java.util.List list5 = null;
            String str4 = null;
            ProductTile.ProductCardAction productCardAction = null;
            ProductTile.InStoreInfo inStoreInfo = null;
            ProductTile.MarketplaceInfo marketplaceInfo = null;
            ProductTile.RestrictionInfo restrictionInfo = null;
            while (true) {
                switch (reader.o2(f23692a)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        roundelImage = (ProductTile.RoundelImage) Adapters.b(Adapters.c(RoundelImage.f23696a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        mainProductImage = (ProductTile.MainProductImage) Adapters.b(Adapters.c(MainProductImage.f23684a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        list = (java.util.List) Adapters.b(Adapters.a(Adapters.c(ProductTag.f23691a, true))).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        priceInfo = (ProductTile.PriceInfo) Adapters.b(Adapters.c(PriceInfo.f23688a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        list2 = (java.util.List) Adapters.b(Adapters.a(Adapters.c(ProductStatus.f23690a, false))).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        middleMessage = (ProductTile.MiddleMessage) Adapters.b(Adapters.c(MiddleMessage.f23686a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        ratingsAndReviews = (ProductTile.RatingsAndReviews) Adapters.b(Adapters.c(RatingsAndReviews.f23693a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        footer = (ProductTile.Footer) Adapters.b(Adapters.c(Footer.f23677a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        list3 = (ProductTile.List) Adapters.c(List.f23682a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 11:
                        list4 = (java.util.List) Adapters.b(Adapters.a(Adapters.c(Trolley.f23699a, true))).fromJson(reader, customScalarAdapters);
                        break;
                    case 12:
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 13:
                        rewardsOfferInfo = (ProductTile.RewardsOfferInfo) Adapters.b(Adapters.c(RewardsOfferInfo.f23695a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 14:
                        list5 = (java.util.List) Adapters.b(Adapters.a(Adapters.c(Category.f23672a, false))).fromJson(reader, customScalarAdapters);
                        break;
                    case 15:
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 16:
                        productCardAction = (ProductTile.ProductCardAction) Adapters.b(Adapters.c(ProductCardAction.f23689a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 17:
                        inStoreInfo = (ProductTile.InStoreInfo) Adapters.b(Adapters.c(InStoreInfo.f23680a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 18:
                        marketplaceInfo = (ProductTile.MarketplaceInfo) Adapters.b(Adapters.c(MarketplaceInfo.f23685a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 19:
                        restrictionInfo = (ProductTile.RestrictionInfo) Adapters.b(Adapters.c(RestrictionInfo.f23694a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "productId");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "productName");
                            throw null;
                        }
                        if (list3 != null) {
                            return new com.woolworths.shop.productcard.data.fragment.ProductTile(str, str2, roundelImage, mainProductImage, list, priceInfo, list2, middleMessage, ratingsAndReviews, footer, list3, list4, str3, rewardsOfferInfo, list5, str4, productCardAction, inStoreInfo, marketplaceInfo, restrictionInfo);
                        }
                        Assertions.a(reader, "list");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, com.woolworths.shop.productcard.data.fragment.ProductTile value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productId");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23631a);
            writer.F1("productName");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("roundelImage");
            Adapters.b(Adapters.c(RoundelImage.f23696a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("mainProductImage");
            Adapters.b(Adapters.c(MainProductImage.f23684a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("productTags");
            Adapters.b(Adapters.a(Adapters.c(ProductTag.f23691a, true))).toJson(writer, customScalarAdapters, value.e);
            writer.F1("priceInfo");
            Adapters.b(Adapters.c(PriceInfo.f23688a, false)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("productStatuses");
            Adapters.b(Adapters.a(Adapters.c(ProductStatus.f23690a, false))).toJson(writer, customScalarAdapters, value.g);
            writer.F1("middleMessage");
            Adapters.b(Adapters.c(MiddleMessage.f23686a, false)).toJson(writer, customScalarAdapters, value.h);
            writer.F1("ratingsAndReviews");
            Adapters.b(Adapters.c(RatingsAndReviews.f23693a, false)).toJson(writer, customScalarAdapters, value.i);
            writer.F1("footer");
            Adapters.b(Adapters.c(Footer.f23677a, false)).toJson(writer, customScalarAdapters, value.j);
            writer.F1("list");
            Adapters.c(List.f23682a, false).toJson(writer, customScalarAdapters, value.k);
            writer.F1("trolleys");
            Adapters.b(Adapters.a(Adapters.c(Trolley.f23699a, true))).toJson(writer, customScalarAdapters, value.l);
            writer.F1("adId");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.m);
            writer.F1("rewardsOfferInfo");
            Adapters.b(Adapters.c(RewardsOfferInfo.f23695a, false)).toJson(writer, customScalarAdapters, value.n);
            writer.F1("categories");
            Adapters.b(Adapters.a(Adapters.c(Category.f23672a, false))).toJson(writer, customScalarAdapters, value.o);
            writer.F1("source");
            nullableAdapter.toJson(writer, customScalarAdapters, value.p);
            writer.F1("productCardAction");
            Adapters.b(Adapters.c(ProductCardAction.f23689a, false)).toJson(writer, customScalarAdapters, value.q);
            writer.F1("inStoreInfo");
            Adapters.b(Adapters.c(InStoreInfo.f23680a, false)).toJson(writer, customScalarAdapters, value.r);
            writer.F1("marketplaceInfo");
            Adapters.b(Adapters.c(MarketplaceInfo.f23685a, false)).toJson(writer, customScalarAdapters, value.s);
            writer.F1("restrictionInfo");
            Adapters.b(Adapters.c(RestrictionInfo.f23694a, false)).toJson(writer, customScalarAdapters, value.t);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (com.woolworths.shop.productcard.data.fragment.ProductTile) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$RatingsAndReviews;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$RatingsAndReviews;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RatingsAndReviews implements Adapter<ProductTile.RatingsAndReviews> {

        /* renamed from: a, reason: collision with root package name */
        public static final RatingsAndReviews f23693a = new RatingsAndReviews();
        public static final java.util.List b = CollectionsKt.R("rating", "reviewsCount", "displayText");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Double d = null;
            Integer num = null;
            ProductTile.DisplayText displayText = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    d = (Double) Adapters.j.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    num = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    displayText = (ProductTile.DisplayText) Adapters.c(DisplayText.f23676a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (displayText != null) {
                return new ProductTile.RatingsAndReviews(d, num, displayText);
            }
            Assertions.a(reader, "displayText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.RatingsAndReviews value = (ProductTile.RatingsAndReviews) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("rating");
            Adapters.j.toJson(writer, customScalarAdapters, value.f23657a);
            writer.F1("reviewsCount");
            Adapters.k.toJson(writer, customScalarAdapters, value.b);
            writer.F1("displayText");
            Adapters.c(DisplayText.f23676a, false).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$RestrictionInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$RestrictionInfo;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RestrictionInfo implements Adapter<ProductTile.RestrictionInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final RestrictionInfo f23694a = new RestrictionInfo();
        public static final java.util.List b = CollectionsKt.R("purchaseRestriction", "disclaimer", "isTobacco");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            PurchaseRestriction purchaseRestriction = null;
            String str = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    purchaseRestriction = (PurchaseRestriction) Adapters.b(PurchaseRestriction_ResponseAdapter.f12109a).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (bool != null) {
                return new ProductTile.RestrictionInfo(purchaseRestriction, str, bool.booleanValue());
            }
            Assertions.a(reader, "isTobacco");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.RestrictionInfo value = (ProductTile.RestrictionInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("purchaseRestriction");
            Adapters.b(PurchaseRestriction_ResponseAdapter.f12109a).toJson(writer, customScalarAdapters, value.f23658a);
            writer.F1("disclaimer");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("isTobacco");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.c));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$RewardsOfferInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$RewardsOfferInfo;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsOfferInfo implements Adapter<ProductTile.RewardsOfferInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsOfferInfo f23695a = new RewardsOfferInfo();
        public static final java.util.List b = CollectionsKt.Q("offerId");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new ProductTile.RewardsOfferInfo(str);
            }
            Assertions.a(reader, "offerId");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.RewardsOfferInfo value = (ProductTile.RewardsOfferInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("offerId");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23659a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$RoundelImage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$RoundelImage;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RoundelImage implements Adapter<ProductTile.RoundelImage> {

        /* renamed from: a, reason: collision with root package name */
        public static final RoundelImage f23696a = new RoundelImage();
        public static final java.util.List b = CollectionsKt.R("url", "altText", "priority");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            RoundelImagePriority roundelImagePriorityA = null;
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
                    roundelImagePriorityA = RoundelImagePriority_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "url");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "altText");
                throw null;
            }
            if (roundelImagePriorityA != null) {
                return new ProductTile.RoundelImage(str, str2, roundelImagePriorityA);
            }
            Assertions.a(reader, "priority");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.RoundelImage value = (ProductTile.RoundelImage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23660a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("priority");
            RoundelImagePriority_ResponseAdapter.b(writer, customScalarAdapters, value.c);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$SavePrice;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$SavePrice;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SavePrice implements Adapter<ProductTile.SavePrice> {

        /* renamed from: a, reason: collision with root package name */
        public static final SavePrice f23697a = new SavePrice();
        public static final java.util.List b = CollectionsKt.R(TextBundle.TEXT_ENTRY, "altText");

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
                return new ProductTile.SavePrice(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.SavePrice value = (ProductTile.SavePrice) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23661a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$Text;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$Text;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Text implements Adapter<ProductTile.Text> {

        /* renamed from: a, reason: collision with root package name */
        public static final Text f23698a = new Text();
        public static final java.util.List b = CollectionsKt.R(TextBundle.TEXT_ENTRY, "altText");

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
                return new ProductTile.Text(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.Text value = (ProductTile.Text) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23662a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$Trolley;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$Trolley;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Trolley implements Adapter<ProductTile.Trolley> {

        /* renamed from: a, reason: collision with root package name */
        public static final Trolley f23699a = new Trolley();
        public static final java.util.List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductTrolley productTrolleyA = ProductTrolleyImpl_ResponseAdapter.ProductTrolley.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductTile.Trolley(str, productTrolleyA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.Trolley value = (ProductTile.Trolley) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23663a);
            java.util.List list = ProductTrolleyImpl_ResponseAdapter.ProductTrolley.f9026a;
            ProductTrolleyImpl_ResponseAdapter.ProductTrolley.b(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$UnitPriceDescription;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$UnitPriceDescription;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnitPriceDescription implements Adapter<ProductTile.UnitPriceDescription> {

        /* renamed from: a, reason: collision with root package name */
        public static final UnitPriceDescription f23700a = new UnitPriceDescription();
        public static final java.util.List b = CollectionsKt.R(TextBundle.TEXT_ENTRY, "altText");

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
                return new ProductTile.UnitPriceDescription(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.UnitPriceDescription value = (ProductTile.UnitPriceDescription) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23664a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$VariablePrice;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$VariablePrice;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VariablePrice implements Adapter<ProductTile.VariablePrice> {

        /* renamed from: a, reason: collision with root package name */
        public static final VariablePrice f23701a = new VariablePrice();
        public static final java.util.List b = CollectionsKt.R(TextBundle.TEXT_ENTRY, "altText");

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
                return new ProductTile.VariablePrice(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.VariablePrice value = (ProductTile.VariablePrice) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23665a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTileImpl_ResponseAdapter$WasPrice;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/productcard/data/fragment/ProductTile$WasPrice;", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WasPrice implements Adapter<ProductTile.WasPrice> {

        /* renamed from: a, reason: collision with root package name */
        public static final WasPrice f23702a = new WasPrice();
        public static final java.util.List b = CollectionsKt.R(TextBundle.TEXT_ENTRY, "altText");

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
                return new ProductTile.WasPrice(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductTile.WasPrice value = (ProductTile.WasPrice) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23666a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }
}
