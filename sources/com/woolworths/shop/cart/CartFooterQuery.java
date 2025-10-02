package com.woolworths.shop.cart;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.cart.adapter.CartFooterQuery_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/woolworths/shop/cart/CartFooterQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/cart/CartFooterQuery$Data;", "Data", "Cart", "Footer", "Button", "Companion", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CartFooterQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f21520a;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/CartFooterQuery$Button;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button {

        /* renamed from: a, reason: collision with root package name */
        public final String f21521a;
        public final String b;
        public final ButtonStyle c;
        public final boolean d;

        public Button(String str, String str2, ButtonStyle buttonStyle, boolean z) {
            this.f21521a = str;
            this.b = str2;
            this.c = buttonStyle;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.c(this.f21521a, button.f21521a) && Intrinsics.c(this.b, button.b) && this.c == button.c && this.d == button.d;
        }

        public final int hashCode() {
            int iHashCode = this.f21521a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ButtonStyle buttonStyle = this.c;
            return Boolean.hashCode(this.d) + ((iHashCode2 + (buttonStyle != null ? buttonStyle.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return a.n(YU.a.v("Button(label=", this.f21521a, ", action=", this.b, ", style="), this.c, ", enabled=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/CartFooterQuery$Cart;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Cart {

        /* renamed from: a, reason: collision with root package name */
        public final Footer f21522a;

        public Cart(Footer footer) {
            this.f21522a = footer;
        }

        /* renamed from: a, reason: from getter */
        public final Footer getF21522a() {
            return this.f21522a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Cart) && Intrinsics.c(this.f21522a, ((Cart) obj).f21522a);
        }

        public final int hashCode() {
            return this.f21522a.hashCode();
        }

        public final String toString() {
            return "Cart(footer=" + this.f21522a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/cart/CartFooterQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/CartFooterQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final Cart f21523a;

        public Data(Cart cart) {
            this.f21523a = cart;
        }

        /* renamed from: a, reason: from getter */
        public final Cart getF21523a() {
            return this.f21523a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21523a, ((Data) obj).f21523a);
        }

        public final int hashCode() {
            return this.f21523a.f21522a.hashCode();
        }

        public final String toString() {
            return "Data(cart=" + this.f21523a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/CartFooterQuery$Footer;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Footer {

        /* renamed from: a, reason: collision with root package name */
        public final Button f21524a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public Footer(Button button, String str, String str2, String str3, String str4, String str5) {
            this.f21524a = button;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Footer)) {
                return false;
            }
            Footer footer = (Footer) obj;
            return Intrinsics.c(this.f21524a, footer.f21524a) && Intrinsics.c(this.b, footer.b) && Intrinsics.c(this.c, footer.c) && Intrinsics.c(this.d, footer.d) && Intrinsics.c(this.e, footer.e) && Intrinsics.c(this.f, footer.f);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f21524a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Footer(button=");
            sb.append(this.f21524a);
            sb.append(", totalLabel=");
            sb.append(this.b);
            sb.append(", totalAmount=");
            androidx.constraintlayout.core.state.a.B(sb, this.c, ", totalDescription=", this.d, ", panelMarkdown=");
            return androidx.constraintlayout.core.state.a.l(sb, this.e, ", savings=", this.f, ")");
        }
    }

    public CartFooterQuery(boolean z) {
        this.f21520a = z;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(CartFooterQuery_ResponseAdapter.Data.f21584a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query CartFooter($isPanelMarkdownEnabled: Boolean!) { cart { footer { button { label action style enabled } totalLabel totalAmount totalDescription panelMarkdown @include(if: $isPanelMarkdownEnabled) savings } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CartFooterQuery) && this.f21520a == ((CartFooterQuery) obj).f21520a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21520a);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "5fa5bd6b070c03a4e6c5097584a3d43c9922198a69dc281f5144e3eb8560a938";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "CartFooter";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("isPanelMarkdownEnabled");
        Adapters.f.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.f21520a));
    }

    public final String toString() {
        return androidx.compose.ui.input.pointer.a.n("CartFooterQuery(isPanelMarkdownEnabled=", ")", this.f21520a);
    }
}
