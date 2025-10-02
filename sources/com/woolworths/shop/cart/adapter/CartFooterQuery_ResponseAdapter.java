package com.woolworths.shop.cart.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.adapter.ButtonStyle_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.UrlHandler;
import com.woolworths.shop.cart.CartFooterQuery;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/cart/adapter/CartFooterQuery_ResponseAdapter;", "", "Data", "Cart", "Footer", "Button", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CartFooterQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/CartFooterQuery_ResponseAdapter$Button;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/CartFooterQuery$Button;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button implements Adapter<CartFooterQuery.Button> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button f21582a = new Button();
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
                return new CartFooterQuery.Button(str, str2, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CartFooterQuery.Button value = (CartFooterQuery.Button) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21521a);
            writer.F1(UrlHandler.ACTION);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.c);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.d));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/CartFooterQuery_ResponseAdapter$Cart;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/CartFooterQuery$Cart;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Cart implements Adapter<CartFooterQuery.Cart> {

        /* renamed from: a, reason: collision with root package name */
        public static final Cart f21583a = new Cart();
        public static final List b = CollectionsKt.Q("footer");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CartFooterQuery.Footer footer = null;
            while (reader.o2(b) == 0) {
                footer = (CartFooterQuery.Footer) Adapters.c(Footer.f21585a, false).fromJson(reader, customScalarAdapters);
            }
            if (footer != null) {
                return new CartFooterQuery.Cart(footer);
            }
            Assertions.a(reader, "footer");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CartFooterQuery.Cart value = (CartFooterQuery.Cart) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("footer");
            Adapters.c(Footer.f21585a, false).toJson(writer, customScalarAdapters, value.f21522a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/CartFooterQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/CartFooterQuery$Data;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<CartFooterQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f21584a = new Data();
        public static final List b = CollectionsKt.Q("cart");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CartFooterQuery.Cart cart = null;
            while (reader.o2(b) == 0) {
                cart = (CartFooterQuery.Cart) Adapters.c(Cart.f21583a, false).fromJson(reader, customScalarAdapters);
            }
            if (cart != null) {
                return new CartFooterQuery.Data(cart);
            }
            Assertions.a(reader, "cart");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CartFooterQuery.Data value = (CartFooterQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("cart");
            Adapters.c(Cart.f21583a, false).toJson(writer, customScalarAdapters, value.f21523a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/CartFooterQuery_ResponseAdapter$Footer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/CartFooterQuery$Footer;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Footer implements Adapter<CartFooterQuery.Footer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Footer f21585a = new Footer();
        public static final List b = CollectionsKt.R("button", "totalLabel", "totalAmount", "totalDescription", "panelMarkdown", "savings");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CartFooterQuery.Button button = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    button = (CartFooterQuery.Button) Adapters.c(Button.f21582a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (button == null) {
                Assertions.a(reader, "button");
                throw null;
            }
            if (str == null) {
                Assertions.a(reader, "totalLabel");
                throw null;
            }
            if (str2 != null) {
                return new CartFooterQuery.Footer(button, str, str2, str3, str4, str5);
            }
            Assertions.a(reader, "totalAmount");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CartFooterQuery.Footer value = (CartFooterQuery.Footer) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("button");
            Adapters.c(Button.f21582a, false).toJson(writer, customScalarAdapters, value.f21524a);
            writer.F1("totalLabel");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("totalAmount");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("totalDescription");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("panelMarkdown");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("savings");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
        }
    }
}
