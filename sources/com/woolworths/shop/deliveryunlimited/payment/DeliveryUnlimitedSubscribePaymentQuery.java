package com.woolworths.shop.deliveryunlimited.payment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.deliveryunlimited.payment.adapter.DeliveryUnlimitedSubscribePaymentQuery_ResponseAdapter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\n\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribePaymentQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribePaymentQuery$Data;", "Data", "DeliveryUnlimitedSubscribePayment", "IconItem", "Footer", "Button", "Terms", "Term", "Link", "Button1", "Companion", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DeliveryUnlimitedSubscribePaymentQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f22575a;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribePaymentQuery$Button;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button {

        /* renamed from: a, reason: collision with root package name */
        public final String f22576a;
        public final ButtonStyle b;
        public final boolean c;

        public Button(String str, ButtonStyle buttonStyle, boolean z) {
            this.f22576a = str;
            this.b = buttonStyle;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.c(this.f22576a, button.f22576a) && this.b == button.b && this.c == button.c;
        }

        public final int hashCode() {
            int iHashCode = this.f22576a.hashCode() * 31;
            ButtonStyle buttonStyle = this.b;
            return Boolean.hashCode(this.c) + ((iHashCode + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31);
        }

        public final String toString() {
            return a.k(")", au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.q("Button(label=", this.f22576a, ", style=", this.b, ", enabled="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribePaymentQuery$Button1;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22577a;
        public final ButtonStyle b;
        public final boolean c;

        public Button1(String str, ButtonStyle buttonStyle, boolean z) {
            this.f22577a = str;
            this.b = buttonStyle;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button1)) {
                return false;
            }
            Button1 button1 = (Button1) obj;
            return Intrinsics.c(this.f22577a, button1.f22577a) && this.b == button1.b && this.c == button1.c;
        }

        public final int hashCode() {
            int iHashCode = this.f22577a.hashCode() * 31;
            ButtonStyle buttonStyle = this.b;
            return Boolean.hashCode(this.c) + ((iHashCode + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31);
        }

        public final String toString() {
            return a.k(")", au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.q("Button1(label=", this.f22577a, ", style=", this.b, ", enabled="), this.c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribePaymentQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribePaymentQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final DeliveryUnlimitedSubscribePayment f22578a;

        public Data(DeliveryUnlimitedSubscribePayment deliveryUnlimitedSubscribePayment) {
            this.f22578a = deliveryUnlimitedSubscribePayment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f22578a, ((Data) obj).f22578a);
        }

        public final int hashCode() {
            return this.f22578a.hashCode();
        }

        public final String toString() {
            return "Data(deliveryUnlimitedSubscribePayment=" + this.f22578a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribePaymentQuery$DeliveryUnlimitedSubscribePayment;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeliveryUnlimitedSubscribePayment {

        /* renamed from: a, reason: collision with root package name */
        public final String f22579a;
        public final String b;
        public final String c;
        public final String d;
        public final int e;
        public final String f;
        public final IconItem g;
        public final Footer h;
        public final Terms i;

        public DeliveryUnlimitedSubscribePayment(String str, String str2, String str3, String str4, int i, String str5, IconItem iconItem, Footer footer, Terms terms) {
            this.f22579a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = i;
            this.f = str5;
            this.g = iconItem;
            this.h = footer;
            this.i = terms;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeliveryUnlimitedSubscribePayment)) {
                return false;
            }
            DeliveryUnlimitedSubscribePayment deliveryUnlimitedSubscribePayment = (DeliveryUnlimitedSubscribePayment) obj;
            return Intrinsics.c(this.f22579a, deliveryUnlimitedSubscribePayment.f22579a) && Intrinsics.c(this.b, deliveryUnlimitedSubscribePayment.b) && Intrinsics.c(this.c, deliveryUnlimitedSubscribePayment.c) && Intrinsics.c(this.d, deliveryUnlimitedSubscribePayment.d) && this.e == deliveryUnlimitedSubscribePayment.e && Intrinsics.c(this.f, deliveryUnlimitedSubscribePayment.f) && Intrinsics.c(this.g, deliveryUnlimitedSubscribePayment.g) && Intrinsics.c(this.h, deliveryUnlimitedSubscribePayment.h) && Intrinsics.c(this.i, deliveryUnlimitedSubscribePayment.i);
        }

        public final int hashCode() {
            int iA = b.a(this.e, b.c(b.c(b.c(this.f22579a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
            String str = this.f;
            int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
            IconItem iconItem = this.g;
            return this.i.hashCode() + ((this.h.hashCode() + ((iHashCode + (iconItem != null ? iconItem.hashCode() : 0)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("DeliveryUnlimitedSubscribePayment(title=", this.f22579a, ", subtitle=", this.b, ", priceDescription=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", priceLabel=", this.d, ", price=");
            androidx.compose.ui.input.pointer.a.u(this.e, ", description=", this.f, ", iconItem=", sbV);
            sbV.append(this.g);
            sbV.append(", footer=");
            sbV.append(this.h);
            sbV.append(", terms=");
            sbV.append(this.i);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribePaymentQuery$Footer;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Footer {

        /* renamed from: a, reason: collision with root package name */
        public final Button f22580a;
        public final String b;

        public Footer(Button button, String str) {
            this.f22580a = button;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Footer)) {
                return false;
            }
            Footer footer = (Footer) obj;
            return Intrinsics.c(this.f22580a, footer.f22580a) && Intrinsics.c(this.b, footer.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22580a.hashCode() * 31);
        }

        public final String toString() {
            return "Footer(button=" + this.f22580a + ", disclaimer=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribePaymentQuery$IconItem;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class IconItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f22581a;
        public final String b;

        public IconItem(String str, String str2) {
            this.f22581a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconItem)) {
                return false;
            }
            IconItem iconItem = (IconItem) obj;
            return Intrinsics.c(this.f22581a, iconItem.f22581a) && Intrinsics.c(this.b, iconItem.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22581a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("IconItem(iconUrl=", this.f22581a, ", label=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribePaymentQuery$Link;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Link {

        /* renamed from: a, reason: collision with root package name */
        public final String f22582a;
        public final String b;

        public Link(String str, String str2) {
            this.f22582a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Link)) {
                return false;
            }
            Link link = (Link) obj;
            return Intrinsics.c(this.f22582a, link.f22582a) && Intrinsics.c(this.b, link.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22582a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Link(text=", this.f22582a, ", url=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribePaymentQuery$Term;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Term {

        /* renamed from: a, reason: collision with root package name */
        public final String f22583a;
        public final ArrayList b;

        public Term(String str, ArrayList arrayList) {
            this.f22583a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Term)) {
                return false;
            }
            Term term = (Term) obj;
            return this.f22583a.equals(term.f22583a) && this.b.equals(term.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22583a.hashCode() * 31);
        }

        public final String toString() {
            return d.q("Term(title=", this.f22583a, ", links=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribePaymentQuery$Terms;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Terms {

        /* renamed from: a, reason: collision with root package name */
        public final String f22584a;
        public final ArrayList b;
        public final Button1 c;

        public Terms(String str, ArrayList arrayList, Button1 button1) {
            this.f22584a = str;
            this.b = arrayList;
            this.c = button1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Terms)) {
                return false;
            }
            Terms terms = (Terms) obj;
            return this.f22584a.equals(terms.f22584a) && this.b.equals(terms.b) && this.c.equals(terms.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + androidx.compose.ui.input.pointer.a.b(this.f22584a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbX = d.x("Terms(title=", this.f22584a, ", terms=", ", button=", this.b);
            sbX.append(this.c);
            sbX.append(")");
            return sbX.toString();
        }
    }

    public DeliveryUnlimitedSubscribePaymentQuery(String planId) {
        Intrinsics.h(planId, "planId");
        this.f22575a = planId;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(DeliveryUnlimitedSubscribePaymentQuery_ResponseAdapter.Data.f22594a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query DeliveryUnlimitedSubscribePayment($planId: ID!) { deliveryUnlimitedSubscribePayment(planId: $planId) { title subtitle priceDescription priceLabel price description iconItem { iconUrl label } footer { button { label style enabled } disclaimer } terms { title terms { title links { text url } } button { label style enabled } } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeliveryUnlimitedSubscribePaymentQuery) && Intrinsics.c(this.f22575a, ((DeliveryUnlimitedSubscribePaymentQuery) obj).f22575a);
    }

    public final int hashCode() {
        return this.f22575a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "3f3bdfd8532792fa9ea76fbb81c8827130f86ab0c871f79df8d1e1876831d541";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "DeliveryUnlimitedSubscribePayment";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("planId");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f22575a);
    }

    public final String toString() {
        return a.h("DeliveryUnlimitedSubscribePaymentQuery(planId=", this.f22575a, ")");
    }
}
