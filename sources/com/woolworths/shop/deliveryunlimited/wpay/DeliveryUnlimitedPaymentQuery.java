package com.woolworths.shop.deliveryunlimited.wpay;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.DeliveryUnlimitedPaymentInput;
import au.com.woolworths.shop.graphql.type.adapter.DeliveryUnlimitedPaymentInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.deliveryunlimited.wpay.adapter.DeliveryUnlimitedPaymentQuery_ResponseAdapter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0014\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$Data;", "Data", "DeliveryUnlimitedPayment", "IconItem", "PaymentMethodSection", "PaymentMethod", "OnAddCreditCard", "ClickAnalytics", "OnLinkedCreditCard", "OnExpiredCreditCard", "Analytic", "Footer", "Button", "Terms", "Term", "Link", "Button1", "ButtonAction", "Analytics", "ImpressionAnalytics", "Companion", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DeliveryUnlimitedPaymentQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final DeliveryUnlimitedPaymentInput f22672a;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$Analytic;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytic {

        /* renamed from: a, reason: collision with root package name */
        public final String f22673a;
        public final AnalyticsFields b;

        public Analytic(String str, AnalyticsFields analyticsFields) {
            this.f22673a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytic)) {
                return false;
            }
            Analytic analytic = (Analytic) obj;
            return Intrinsics.c(this.f22673a, analytic.f22673a) && Intrinsics.c(this.b, analytic.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22673a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytic(__typename=", this.f22673a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$Analytics;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f22674a;
        public final AnalyticsFields b;

        public Analytics(String str, AnalyticsFields analyticsFields) {
            this.f22674a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics)) {
                return false;
            }
            Analytics analytics = (Analytics) obj;
            return Intrinsics.c(this.f22674a, analytics.f22674a) && Intrinsics.c(this.b, analytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22674a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics(__typename=", this.f22674a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$Button;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button {

        /* renamed from: a, reason: collision with root package name */
        public final String f22675a;
        public final ButtonStyle b;
        public final boolean c;

        public Button(String str, ButtonStyle buttonStyle, boolean z) {
            this.f22675a = str;
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
            return Intrinsics.c(this.f22675a, button.f22675a) && this.b == button.b && this.c == button.c;
        }

        public final int hashCode() {
            int iHashCode = this.f22675a.hashCode() * 31;
            ButtonStyle buttonStyle = this.b;
            return Boolean.hashCode(this.c) + ((iHashCode + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31);
        }

        public final String toString() {
            return a.k(")", au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.q("Button(label=", this.f22675a, ", style=", this.b, ", enabled="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$Button1;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22676a;
        public final ButtonStyle b;
        public final boolean c;
        public final ButtonAction d;

        public Button1(String str, ButtonStyle buttonStyle, boolean z, ButtonAction buttonAction) {
            this.f22676a = str;
            this.b = buttonStyle;
            this.c = z;
            this.d = buttonAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button1)) {
                return false;
            }
            Button1 button1 = (Button1) obj;
            return Intrinsics.c(this.f22676a, button1.f22676a) && this.b == button1.b && this.c == button1.c && Intrinsics.c(this.d, button1.d);
        }

        public final int hashCode() {
            int iHashCode = this.f22676a.hashCode() * 31;
            ButtonStyle buttonStyle = this.b;
            int iE = b.e((iHashCode + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31, 31, this.c);
            ButtonAction buttonAction = this.d;
            return iE + (buttonAction != null ? buttonAction.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbQ = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.q("Button1(label=", this.f22676a, ", style=", this.b, ", enabled=");
            sbQ.append(this.c);
            sbQ.append(", buttonAction=");
            sbQ.append(this.d);
            sbQ.append(")");
            return sbQ.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$ButtonAction;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ButtonAction {

        /* renamed from: a, reason: collision with root package name */
        public final Analytics f22677a;

        public ButtonAction(Analytics analytics) {
            this.f22677a = analytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ButtonAction) && Intrinsics.c(this.f22677a, ((ButtonAction) obj).f22677a);
        }

        public final int hashCode() {
            Analytics analytics = this.f22677a;
            if (analytics == null) {
                return 0;
            }
            return analytics.hashCode();
        }

        public final String toString() {
            return "ButtonAction(analytics=" + this.f22677a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$ClickAnalytics;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ClickAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f22678a;
        public final AnalyticsFields b;

        public ClickAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f22678a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClickAnalytics)) {
                return false;
            }
            ClickAnalytics clickAnalytics = (ClickAnalytics) obj;
            return Intrinsics.c(this.f22678a, clickAnalytics.f22678a) && Intrinsics.c(this.b, clickAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22678a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ClickAnalytics(__typename=", this.f22678a, ", analyticsFields=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final DeliveryUnlimitedPayment f22679a;

        public Data(DeliveryUnlimitedPayment deliveryUnlimitedPayment) {
            this.f22679a = deliveryUnlimitedPayment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f22679a, ((Data) obj).f22679a);
        }

        public final int hashCode() {
            return this.f22679a.hashCode();
        }

        public final String toString() {
            return "Data(deliveryUnlimitedPayment=" + this.f22679a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$DeliveryUnlimitedPayment;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeliveryUnlimitedPayment {

        /* renamed from: a, reason: collision with root package name */
        public final String f22680a;
        public final String b;
        public final String c;
        public final IconItem d;
        public final PaymentMethodSection e;
        public final ArrayList f;
        public final Footer g;
        public final Terms h;

        public DeliveryUnlimitedPayment(String str, String str2, String str3, IconItem iconItem, PaymentMethodSection paymentMethodSection, ArrayList arrayList, Footer footer, Terms terms) {
            this.f22680a = str;
            this.b = str2;
            this.c = str3;
            this.d = iconItem;
            this.e = paymentMethodSection;
            this.f = arrayList;
            this.g = footer;
            this.h = terms;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeliveryUnlimitedPayment)) {
                return false;
            }
            DeliveryUnlimitedPayment deliveryUnlimitedPayment = (DeliveryUnlimitedPayment) obj;
            return this.f22680a.equals(deliveryUnlimitedPayment.f22680a) && this.b.equals(deliveryUnlimitedPayment.b) && Intrinsics.c(this.c, deliveryUnlimitedPayment.c) && Intrinsics.c(this.d, deliveryUnlimitedPayment.d) && this.e.equals(deliveryUnlimitedPayment.e) && this.f.equals(deliveryUnlimitedPayment.f) && this.g.equals(deliveryUnlimitedPayment.g) && this.h.equals(deliveryUnlimitedPayment.h);
        }

        public final int hashCode() {
            int iC = b.c(this.f22680a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            IconItem iconItem = this.d;
            return this.h.hashCode() + ((this.g.hashCode() + androidx.compose.ui.input.pointer.a.b((this.e.hashCode() + ((iHashCode + (iconItem != null ? iconItem.hashCode() : 0)) * 31)) * 31, 31, this.f)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("DeliveryUnlimitedPayment(title=", this.f22680a, ", subtitle=", this.b, ", description=");
            sbV.append(this.c);
            sbV.append(", iconItem=");
            sbV.append(this.d);
            sbV.append(", paymentMethodSection=");
            sbV.append(this.e);
            sbV.append(", analytics=");
            sbV.append(this.f);
            sbV.append(", footer=");
            sbV.append(this.g);
            sbV.append(", terms=");
            sbV.append(this.h);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$Footer;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Footer {

        /* renamed from: a, reason: collision with root package name */
        public final Button f22681a;
        public final String b;

        public Footer(Button button, String str) {
            this.f22681a = button;
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
            return Intrinsics.c(this.f22681a, footer.f22681a) && Intrinsics.c(this.b, footer.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22681a.hashCode() * 31);
        }

        public final String toString() {
            return "Footer(button=" + this.f22681a + ", disclaimer=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$IconItem;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class IconItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f22682a;
        public final String b;

        public IconItem(String str, String str2) {
            this.f22682a = str;
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
            return Intrinsics.c(this.f22682a, iconItem.f22682a) && Intrinsics.c(this.b, iconItem.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22682a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("IconItem(iconUrl=", this.f22682a, ", label=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$ImpressionAnalytics;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImpressionAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f22683a;
        public final AnalyticsFields b;

        public ImpressionAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f22683a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImpressionAnalytics)) {
                return false;
            }
            ImpressionAnalytics impressionAnalytics = (ImpressionAnalytics) obj;
            return Intrinsics.c(this.f22683a, impressionAnalytics.f22683a) && Intrinsics.c(this.b, impressionAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22683a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ImpressionAnalytics(__typename=", this.f22683a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$Link;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Link {

        /* renamed from: a, reason: collision with root package name */
        public final String f22684a;
        public final String b;

        public Link(String str, String str2) {
            this.f22684a = str;
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
            return Intrinsics.c(this.f22684a, link.f22684a) && Intrinsics.c(this.b, link.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22684a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Link(text=", this.f22684a, ", url=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$OnAddCreditCard;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAddCreditCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f22685a;
        public final ClickAnalytics b;

        public OnAddCreditCard(String str, ClickAnalytics clickAnalytics) {
            this.f22685a = str;
            this.b = clickAnalytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnAddCreditCard)) {
                return false;
            }
            OnAddCreditCard onAddCreditCard = (OnAddCreditCard) obj;
            return Intrinsics.c(this.f22685a, onAddCreditCard.f22685a) && Intrinsics.c(this.b, onAddCreditCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22685a.hashCode() * 31);
        }

        public final String toString() {
            return "OnAddCreditCard(title=" + this.f22685a + ", clickAnalytics=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$OnExpiredCreditCard;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnExpiredCreditCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f22686a;
        public final String b;
        public final String c;
        public final String d;

        public OnExpiredCreditCard(String str, String str2, String str3, String str4) {
            this.f22686a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnExpiredCreditCard)) {
                return false;
            }
            OnExpiredCreditCard onExpiredCreditCard = (OnExpiredCreditCard) obj;
            return Intrinsics.c(this.f22686a, onExpiredCreditCard.f22686a) && Intrinsics.c(this.b, onExpiredCreditCard.b) && Intrinsics.c(this.c, onExpiredCreditCard.c) && Intrinsics.c(this.d, onExpiredCreditCard.d);
        }

        public final int hashCode() {
            int iC = b.c(this.f22686a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(a.v("OnExpiredCreditCard(id=", this.f22686a, ", title=", this.b, ", subtitle="), this.c, ", icon=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$OnLinkedCreditCard;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnLinkedCreditCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f22687a;
        public final String b;
        public final String c;
        public final String d;
        public final boolean e;
        public final String f;
        public final String g;
        public final int h;
        public final String i;

        public OnLinkedCreditCard(String str, String str2, String str3, String str4, boolean z, String str5, String str6, int i, String str7) {
            this.f22687a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = z;
            this.f = str5;
            this.g = str6;
            this.h = i;
            this.i = str7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnLinkedCreditCard)) {
                return false;
            }
            OnLinkedCreditCard onLinkedCreditCard = (OnLinkedCreditCard) obj;
            return Intrinsics.c(this.f22687a, onLinkedCreditCard.f22687a) && Intrinsics.c(this.b, onLinkedCreditCard.b) && Intrinsics.c(this.c, onLinkedCreditCard.c) && Intrinsics.c(this.d, onLinkedCreditCard.d) && this.e == onLinkedCreditCard.e && Intrinsics.c(this.f, onLinkedCreditCard.f) && Intrinsics.c(this.g, onLinkedCreditCard.g) && this.h == onLinkedCreditCard.h && Intrinsics.c(this.i, onLinkedCreditCard.i);
        }

        public final int hashCode() {
            int iC = b.c(this.f22687a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return this.i.hashCode() + b.a(this.h, b.c(b.c(b.e(b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnLinkedCreditCard(id=", this.f22687a, ", title=", this.b, ", subtitle=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", icon=", this.d, ", isSelected=");
            au.com.woolworths.android.onesite.a.y(", amountTitle=", this.f, ", amountValue=", sbV, this.e);
            a.x(this.h, this.g, ", amountToPay=", ", cvvUrl=", sbV);
            return a.o(sbV, this.i, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$PaymentMethod;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PaymentMethod {

        /* renamed from: a, reason: collision with root package name */
        public final String f22688a;
        public final OnAddCreditCard b;
        public final OnLinkedCreditCard c;
        public final OnExpiredCreditCard d;

        public PaymentMethod(String __typename, OnAddCreditCard onAddCreditCard, OnLinkedCreditCard onLinkedCreditCard, OnExpiredCreditCard onExpiredCreditCard) {
            Intrinsics.h(__typename, "__typename");
            this.f22688a = __typename;
            this.b = onAddCreditCard;
            this.c = onLinkedCreditCard;
            this.d = onExpiredCreditCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentMethod)) {
                return false;
            }
            PaymentMethod paymentMethod = (PaymentMethod) obj;
            return Intrinsics.c(this.f22688a, paymentMethod.f22688a) && Intrinsics.c(this.b, paymentMethod.b) && Intrinsics.c(this.c, paymentMethod.c) && Intrinsics.c(this.d, paymentMethod.d);
        }

        public final int hashCode() {
            int iHashCode = this.f22688a.hashCode() * 31;
            OnAddCreditCard onAddCreditCard = this.b;
            int iHashCode2 = (iHashCode + (onAddCreditCard == null ? 0 : onAddCreditCard.hashCode())) * 31;
            OnLinkedCreditCard onLinkedCreditCard = this.c;
            int iHashCode3 = (iHashCode2 + (onLinkedCreditCard == null ? 0 : onLinkedCreditCard.hashCode())) * 31;
            OnExpiredCreditCard onExpiredCreditCard = this.d;
            return iHashCode3 + (onExpiredCreditCard != null ? onExpiredCreditCard.hashCode() : 0);
        }

        public final String toString() {
            return "PaymentMethod(__typename=" + this.f22688a + ", onAddCreditCard=" + this.b + ", onLinkedCreditCard=" + this.c + ", onExpiredCreditCard=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$PaymentMethodSection;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PaymentMethodSection {

        /* renamed from: a, reason: collision with root package name */
        public final String f22689a;
        public final ArrayList b;

        public PaymentMethodSection(String str, ArrayList arrayList) {
            this.f22689a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentMethodSection)) {
                return false;
            }
            PaymentMethodSection paymentMethodSection = (PaymentMethodSection) obj;
            return this.f22689a.equals(paymentMethodSection.f22689a) && this.b.equals(paymentMethodSection.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22689a.hashCode() * 31);
        }

        public final String toString() {
            return d.q("PaymentMethodSection(title=", this.f22689a, ", paymentMethods=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$Term;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Term {

        /* renamed from: a, reason: collision with root package name */
        public final String f22690a;
        public final ArrayList b;

        public Term(String str, ArrayList arrayList) {
            this.f22690a = str;
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
            return this.f22690a.equals(term.f22690a) && this.b.equals(term.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22690a.hashCode() * 31);
        }

        public final String toString() {
            return d.q("Term(title=", this.f22690a, ", links=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$Terms;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Terms {

        /* renamed from: a, reason: collision with root package name */
        public final String f22691a;
        public final ArrayList b;
        public final Button1 c;
        public final ImpressionAnalytics d;

        public Terms(String str, ArrayList arrayList, Button1 button1, ImpressionAnalytics impressionAnalytics) {
            this.f22691a = str;
            this.b = arrayList;
            this.c = button1;
            this.d = impressionAnalytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Terms)) {
                return false;
            }
            Terms terms = (Terms) obj;
            return this.f22691a.equals(terms.f22691a) && this.b.equals(terms.b) && this.c.equals(terms.c) && Intrinsics.c(this.d, terms.d);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + androidx.compose.ui.input.pointer.a.b(this.f22691a.hashCode() * 31, 31, this.b)) * 31;
            ImpressionAnalytics impressionAnalytics = this.d;
            return iHashCode + (impressionAnalytics == null ? 0 : impressionAnalytics.hashCode());
        }

        public final String toString() {
            StringBuilder sbX = d.x("Terms(title=", this.f22691a, ", terms=", ", button=", this.b);
            sbX.append(this.c);
            sbX.append(", impressionAnalytics=");
            sbX.append(this.d);
            sbX.append(")");
            return sbX.toString();
        }
    }

    public DeliveryUnlimitedPaymentQuery(DeliveryUnlimitedPaymentInput deliveryUnlimitedPaymentInput) {
        this.f22672a = deliveryUnlimitedPaymentInput;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(DeliveryUnlimitedPaymentQuery_ResponseAdapter.Data.f22698a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query DeliveryUnlimitedPayment($input: DeliveryUnlimitedPaymentInput!) { deliveryUnlimitedPayment(input: $input) { title subtitle description iconItem { iconUrl label } paymentMethodSection { title paymentMethods { __typename ... on AddCreditCard { title clickAnalytics { __typename ...analyticsFields } } ... on LinkedCreditCard { id title subtitle icon isSelected amountTitle amountValue amountToPay cvvUrl } ... on ExpiredCreditCard { id title subtitle icon } } } analytics { __typename ...analyticsFields } footer { button { label style enabled } disclaimer } terms { title terms { title links { text url } } button { label style enabled buttonAction { analytics { __typename ...analyticsFields } } } impressionAnalytics { __typename ...analyticsFields } } } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeliveryUnlimitedPaymentQuery) && Intrinsics.c(this.f22672a, ((DeliveryUnlimitedPaymentQuery) obj).f22672a);
    }

    public final int hashCode() {
        return this.f22672a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "50ccdfc4860974d49be5513dea18fc43ffe1997fbab941392a0637ef06803d29";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "DeliveryUnlimitedPayment";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("input");
        Adapters.c(DeliveryUnlimitedPaymentInput_InputAdapter.f12064a, false).toJson(jsonWriter, customScalarAdapters, this.f22672a);
    }

    public final String toString() {
        return "DeliveryUnlimitedPaymentQuery(input=" + this.f22672a + ")";
    }
}
