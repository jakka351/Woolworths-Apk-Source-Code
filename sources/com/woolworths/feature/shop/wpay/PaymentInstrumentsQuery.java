package com.woolworths.feature.shop.wpay;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.PaymentInstrumentsInput;
import au.com.woolworths.shop.graphql.type.adapter.PaymentInstrumentsInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.wpay.adapter.PaymentInstrumentsQuery_ResponseAdapter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:#\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$Data;", "Data", "PaymentInstruments", "OnPaymentInstrumentResponseSuccess", "GiftCardSection", "GiftCard", "OnAddGiftCard", "ClickAnalytics", "OnLinkedGiftCard", "ErrorBanner", "Analytics", "OnUnlinkedGiftCard", "ErrorBanner1", "Analytics1", "PaymentMethodSection", "PaymentMethod", "OnAddCreditCard", "ClickAnalytics1", "OnAddPayPal", "Alert", "ClickAnalytics2", "OnLinkedCreditCard", "OnUnlinkedCreditCard", "OnExpiredCreditCard", "OnLinkedPayPal", "OnGooglePay", "PaymentInstrumentTotalDetails", "Button", "OnPlaceOrderButtonDefault", "Analytics2", "OnPlaceOrderButtonGooglePay", "Analytics3", "Analytic", "OnPaymentInstrumentResponseValidationFailure", "ImpressionAnalytics", "Companion", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentInstrumentsQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20367a;
    public final PaymentInstrumentsInput b;
    public final boolean c;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$Alert;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Alert {

        /* renamed from: a, reason: collision with root package name */
        public final String f20368a;
        public final String b;
        public final String c;
        public final String d;
        public final ClickAnalytics2 e;

        public Alert(String str, String str2, String str3, String str4, ClickAnalytics2 clickAnalytics2) {
            this.f20368a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = clickAnalytics2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Alert)) {
                return false;
            }
            Alert alert = (Alert) obj;
            return Intrinsics.c(this.f20368a, alert.f20368a) && Intrinsics.c(this.b, alert.b) && Intrinsics.c(this.c, alert.c) && Intrinsics.c(this.d, alert.d) && Intrinsics.c(this.e, alert.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + b.c(b.c(b.c(this.f20368a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sbV = a.v("Alert(title=", this.f20368a, ", message=", this.b, ", primaryButtonTitle=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", secondaryButtonTitle=", this.d, ", clickAnalytics=");
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$Analytic;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytic {

        /* renamed from: a, reason: collision with root package name */
        public final String f20369a;
        public final AnalyticsFields b;

        public Analytic(String str, AnalyticsFields analyticsFields) {
            this.f20369a = str;
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
            return Intrinsics.c(this.f20369a, analytic.f20369a) && Intrinsics.c(this.b, analytic.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20369a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytic(__typename=", this.f20369a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$Analytics;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f20370a;
        public final AnalyticsFields b;

        public Analytics(String str, AnalyticsFields analyticsFields) {
            this.f20370a = str;
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
            return Intrinsics.c(this.f20370a, analytics.f20370a) && Intrinsics.c(this.b, analytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20370a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics(__typename=", this.f20370a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$Analytics1;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f20371a;
        public final AnalyticsFields b;

        public Analytics1(String str, AnalyticsFields analyticsFields) {
            this.f20371a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics1)) {
                return false;
            }
            Analytics1 analytics1 = (Analytics1) obj;
            return Intrinsics.c(this.f20371a, analytics1.f20371a) && Intrinsics.c(this.b, analytics1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20371a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics1(__typename=", this.f20371a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$Analytics2;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f20372a;
        public final AnalyticsFields b;

        public Analytics2(String str, AnalyticsFields analyticsFields) {
            this.f20372a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics2)) {
                return false;
            }
            Analytics2 analytics2 = (Analytics2) obj;
            return Intrinsics.c(this.f20372a, analytics2.f20372a) && Intrinsics.c(this.b, analytics2.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20372a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics2(__typename=", this.f20372a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$Analytics3;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics3 {

        /* renamed from: a, reason: collision with root package name */
        public final String f20373a;
        public final AnalyticsFields b;

        public Analytics3(String str, AnalyticsFields analyticsFields) {
            this.f20373a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics3)) {
                return false;
            }
            Analytics3 analytics3 = (Analytics3) obj;
            return Intrinsics.c(this.f20373a, analytics3.f20373a) && Intrinsics.c(this.b, analytics3.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20373a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics3(__typename=", this.f20373a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$Button;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button {

        /* renamed from: a, reason: collision with root package name */
        public final String f20374a;
        public final OnPlaceOrderButtonDefault b;
        public final OnPlaceOrderButtonGooglePay c;

        public Button(String __typename, OnPlaceOrderButtonDefault onPlaceOrderButtonDefault, OnPlaceOrderButtonGooglePay onPlaceOrderButtonGooglePay) {
            Intrinsics.h(__typename, "__typename");
            this.f20374a = __typename;
            this.b = onPlaceOrderButtonDefault;
            this.c = onPlaceOrderButtonGooglePay;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.c(this.f20374a, button.f20374a) && Intrinsics.c(this.b, button.b) && Intrinsics.c(this.c, button.c);
        }

        public final int hashCode() {
            int iHashCode = this.f20374a.hashCode() * 31;
            OnPlaceOrderButtonDefault onPlaceOrderButtonDefault = this.b;
            int iHashCode2 = (iHashCode + (onPlaceOrderButtonDefault == null ? 0 : onPlaceOrderButtonDefault.hashCode())) * 31;
            OnPlaceOrderButtonGooglePay onPlaceOrderButtonGooglePay = this.c;
            return iHashCode2 + (onPlaceOrderButtonGooglePay != null ? onPlaceOrderButtonGooglePay.f20395a.hashCode() : 0);
        }

        public final String toString() {
            return "Button(__typename=" + this.f20374a + ", onPlaceOrderButtonDefault=" + this.b + ", onPlaceOrderButtonGooglePay=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$ClickAnalytics;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ClickAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f20375a;
        public final AnalyticsFields b;

        public ClickAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f20375a = str;
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
            return Intrinsics.c(this.f20375a, clickAnalytics.f20375a) && Intrinsics.c(this.b, clickAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20375a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ClickAnalytics(__typename=", this.f20375a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$ClickAnalytics1;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ClickAnalytics1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f20376a;
        public final AnalyticsFields b;

        public ClickAnalytics1(String str, AnalyticsFields analyticsFields) {
            this.f20376a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClickAnalytics1)) {
                return false;
            }
            ClickAnalytics1 clickAnalytics1 = (ClickAnalytics1) obj;
            return Intrinsics.c(this.f20376a, clickAnalytics1.f20376a) && Intrinsics.c(this.b, clickAnalytics1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20376a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ClickAnalytics1(__typename=", this.f20376a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$ClickAnalytics2;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ClickAnalytics2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f20377a;
        public final AnalyticsFields b;

        public ClickAnalytics2(String str, AnalyticsFields analyticsFields) {
            this.f20377a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClickAnalytics2)) {
                return false;
            }
            ClickAnalytics2 clickAnalytics2 = (ClickAnalytics2) obj;
            return Intrinsics.c(this.f20377a, clickAnalytics2.f20377a) && Intrinsics.c(this.b, clickAnalytics2.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20377a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ClickAnalytics2(__typename=", this.f20377a, ", analyticsFields=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final PaymentInstruments f20378a;

        public Data(PaymentInstruments paymentInstruments) {
            this.f20378a = paymentInstruments;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20378a, ((Data) obj).f20378a);
        }

        public final int hashCode() {
            return this.f20378a.hashCode();
        }

        public final String toString() {
            return "Data(paymentInstruments=" + this.f20378a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$ErrorBanner;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ErrorBanner {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f20379a;
        public final String b;
        public final Analytics c;

        public ErrorBanner(InsetBannerDisplayType insetBannerDisplayType, String str, Analytics analytics) {
            this.f20379a = insetBannerDisplayType;
            this.b = str;
            this.c = analytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorBanner)) {
                return false;
            }
            ErrorBanner errorBanner = (ErrorBanner) obj;
            return this.f20379a == errorBanner.f20379a && Intrinsics.c(this.b, errorBanner.b) && Intrinsics.c(this.c, errorBanner.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f20379a.hashCode() * 31, 31, this.b);
            Analytics analytics = this.c;
            return iC + (analytics == null ? 0 : analytics.hashCode());
        }

        public final String toString() {
            StringBuilder sbU = d.u("ErrorBanner(displayType=", this.f20379a, ", message=", this.b, ", analytics=");
            sbU.append(this.c);
            sbU.append(")");
            return sbU.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$ErrorBanner1;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ErrorBanner1 {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f20380a;
        public final String b;
        public final Analytics1 c;

        public ErrorBanner1(InsetBannerDisplayType insetBannerDisplayType, String str, Analytics1 analytics1) {
            this.f20380a = insetBannerDisplayType;
            this.b = str;
            this.c = analytics1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorBanner1)) {
                return false;
            }
            ErrorBanner1 errorBanner1 = (ErrorBanner1) obj;
            return this.f20380a == errorBanner1.f20380a && Intrinsics.c(this.b, errorBanner1.b) && Intrinsics.c(this.c, errorBanner1.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f20380a.hashCode() * 31, 31, this.b);
            Analytics1 analytics1 = this.c;
            return iC + (analytics1 == null ? 0 : analytics1.hashCode());
        }

        public final String toString() {
            StringBuilder sbU = d.u("ErrorBanner1(displayType=", this.f20380a, ", message=", this.b, ", analytics=");
            sbU.append(this.c);
            sbU.append(")");
            return sbU.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$GiftCard;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GiftCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f20381a;
        public final OnAddGiftCard b;
        public final OnLinkedGiftCard c;
        public final OnUnlinkedGiftCard d;

        public GiftCard(String __typename, OnAddGiftCard onAddGiftCard, OnLinkedGiftCard onLinkedGiftCard, OnUnlinkedGiftCard onUnlinkedGiftCard) {
            Intrinsics.h(__typename, "__typename");
            this.f20381a = __typename;
            this.b = onAddGiftCard;
            this.c = onLinkedGiftCard;
            this.d = onUnlinkedGiftCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GiftCard)) {
                return false;
            }
            GiftCard giftCard = (GiftCard) obj;
            return Intrinsics.c(this.f20381a, giftCard.f20381a) && Intrinsics.c(this.b, giftCard.b) && Intrinsics.c(this.c, giftCard.c) && Intrinsics.c(this.d, giftCard.d);
        }

        public final int hashCode() {
            int iHashCode = this.f20381a.hashCode() * 31;
            OnAddGiftCard onAddGiftCard = this.b;
            int iHashCode2 = (iHashCode + (onAddGiftCard == null ? 0 : onAddGiftCard.hashCode())) * 31;
            OnLinkedGiftCard onLinkedGiftCard = this.c;
            int iHashCode3 = (iHashCode2 + (onLinkedGiftCard == null ? 0 : onLinkedGiftCard.hashCode())) * 31;
            OnUnlinkedGiftCard onUnlinkedGiftCard = this.d;
            return iHashCode3 + (onUnlinkedGiftCard != null ? onUnlinkedGiftCard.hashCode() : 0);
        }

        public final String toString() {
            return "GiftCard(__typename=" + this.f20381a + ", onAddGiftCard=" + this.b + ", onLinkedGiftCard=" + this.c + ", onUnlinkedGiftCard=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$GiftCardSection;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GiftCardSection {

        /* renamed from: a, reason: collision with root package name */
        public final String f20382a;
        public final ArrayList b;

        public GiftCardSection(String str, ArrayList arrayList) {
            this.f20382a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GiftCardSection)) {
                return false;
            }
            GiftCardSection giftCardSection = (GiftCardSection) obj;
            return this.f20382a.equals(giftCardSection.f20382a) && this.b.equals(giftCardSection.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20382a.hashCode() * 31);
        }

        public final String toString() {
            return d.q("GiftCardSection(title=", this.f20382a, ", giftCards=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$ImpressionAnalytics;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImpressionAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f20383a;
        public final AnalyticsFields b;

        public ImpressionAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f20383a = str;
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
            return Intrinsics.c(this.f20383a, impressionAnalytics.f20383a) && Intrinsics.c(this.b, impressionAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20383a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ImpressionAnalytics(__typename=", this.f20383a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$OnAddCreditCard;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAddCreditCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f20384a;
        public final ClickAnalytics1 b;

        public OnAddCreditCard(String str, ClickAnalytics1 clickAnalytics1) {
            this.f20384a = str;
            this.b = clickAnalytics1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnAddCreditCard)) {
                return false;
            }
            OnAddCreditCard onAddCreditCard = (OnAddCreditCard) obj;
            return Intrinsics.c(this.f20384a, onAddCreditCard.f20384a) && Intrinsics.c(this.b, onAddCreditCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20384a.hashCode() * 31);
        }

        public final String toString() {
            return "OnAddCreditCard(title=" + this.f20384a + ", clickAnalytics=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$OnAddGiftCard;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAddGiftCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f20385a;
        public final ClickAnalytics b;

        public OnAddGiftCard(String str, ClickAnalytics clickAnalytics) {
            this.f20385a = str;
            this.b = clickAnalytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnAddGiftCard)) {
                return false;
            }
            OnAddGiftCard onAddGiftCard = (OnAddGiftCard) obj;
            return Intrinsics.c(this.f20385a, onAddGiftCard.f20385a) && Intrinsics.c(this.b, onAddGiftCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20385a.hashCode() * 31);
        }

        public final String toString() {
            return "OnAddGiftCard(title=" + this.f20385a + ", clickAnalytics=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$OnAddPayPal;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAddPayPal {

        /* renamed from: a, reason: collision with root package name */
        public final String f20386a;
        public final String b;
        public final Alert c;

        public OnAddPayPal(String str, String str2, Alert alert) {
            this.f20386a = str;
            this.b = str2;
            this.c = alert;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnAddPayPal)) {
                return false;
            }
            OnAddPayPal onAddPayPal = (OnAddPayPal) obj;
            return Intrinsics.c(this.f20386a, onAddPayPal.f20386a) && Intrinsics.c(this.b, onAddPayPal.b) && Intrinsics.c(this.c, onAddPayPal.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f20386a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnAddPayPal(icon=", this.f20386a, ", title=", this.b, ", alert=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$OnExpiredCreditCard;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnExpiredCreditCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f20387a;
        public final String b;
        public final String c;
        public final String d;

        public OnExpiredCreditCard(String str, String str2, String str3, String str4) {
            this.f20387a = str;
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
            return Intrinsics.c(this.f20387a, onExpiredCreditCard.f20387a) && Intrinsics.c(this.b, onExpiredCreditCard.b) && Intrinsics.c(this.c, onExpiredCreditCard.c) && Intrinsics.c(this.d, onExpiredCreditCard.d);
        }

        public final int hashCode() {
            int iC = b.c(this.f20387a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(a.v("OnExpiredCreditCard(id=", this.f20387a, ", title=", this.b, ", subtitle="), this.c, ", icon=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$OnGooglePay;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnGooglePay {

        /* renamed from: a, reason: collision with root package name */
        public final String f20388a;
        public final boolean b;
        public final String c;
        public final String d;
        public final int e;
        public final String f;
        public final ArrayList g;

        public OnGooglePay(String str, boolean z, String str2, String str3, int i, String str4, ArrayList arrayList) {
            this.f20388a = str;
            this.b = z;
            this.c = str2;
            this.d = str3;
            this.e = i;
            this.f = str4;
            this.g = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnGooglePay)) {
                return false;
            }
            OnGooglePay onGooglePay = (OnGooglePay) obj;
            return this.f20388a.equals(onGooglePay.f20388a) && this.b == onGooglePay.b && this.c.equals(onGooglePay.c) && this.d.equals(onGooglePay.d) && this.e == onGooglePay.e && this.f.equals(onGooglePay.f) && this.g.equals(onGooglePay.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + b.c(b.a(this.e, b.c(b.c(b.e(this.f20388a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f);
        }

        public final String toString() {
            StringBuilder sbQ = androidx.constraintlayout.core.state.a.q("OnGooglePay(title=", this.f20388a, ", isSelected=", ", amountTitle=", this.b);
            androidx.constraintlayout.core.state.a.B(sbQ, this.c, ", amountValue=", this.d, ", amountToPay=");
            androidx.compose.ui.input.pointer.a.u(this.e, ", id=", this.f, ", supportedNetworks=", sbQ);
            return android.support.v4.media.session.a.q(")", sbQ, this.g);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$OnLinkedCreditCard;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnLinkedCreditCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f20389a;
        public final String b;
        public final String c;
        public final String d;
        public final boolean e;
        public final String f;
        public final String g;
        public final int h;
        public final String i;

        public OnLinkedCreditCard(String str, String str2, String str3, String str4, boolean z, String str5, String str6, int i, String str7) {
            this.f20389a = str;
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
            return Intrinsics.c(this.f20389a, onLinkedCreditCard.f20389a) && Intrinsics.c(this.b, onLinkedCreditCard.b) && Intrinsics.c(this.c, onLinkedCreditCard.c) && Intrinsics.c(this.d, onLinkedCreditCard.d) && this.e == onLinkedCreditCard.e && Intrinsics.c(this.f, onLinkedCreditCard.f) && Intrinsics.c(this.g, onLinkedCreditCard.g) && this.h == onLinkedCreditCard.h && Intrinsics.c(this.i, onLinkedCreditCard.i);
        }

        public final int hashCode() {
            int iC = b.c(this.f20389a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return this.i.hashCode() + b.a(this.h, b.c(b.c(b.e(b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnLinkedCreditCard(id=", this.f20389a, ", title=", this.b, ", subtitle=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", icon=", this.d, ", isSelected=");
            au.com.woolworths.android.onesite.a.y(", amountTitle=", this.f, ", amountValue=", sbV, this.e);
            a.x(this.h, this.g, ", amountToPay=", ", cvvUrl=", sbV);
            return a.o(sbV, this.i, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$OnLinkedGiftCard;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnLinkedGiftCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f20390a;
        public final String b;
        public final boolean c;
        public final String d;
        public final String e;
        public final int f;
        public final ErrorBanner g;
        public final String h;

        public OnLinkedGiftCard(String str, String str2, boolean z, String str3, String str4, int i, ErrorBanner errorBanner, String str5) {
            this.f20390a = str;
            this.b = str2;
            this.c = z;
            this.d = str3;
            this.e = str4;
            this.f = i;
            this.g = errorBanner;
            this.h = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnLinkedGiftCard)) {
                return false;
            }
            OnLinkedGiftCard onLinkedGiftCard = (OnLinkedGiftCard) obj;
            return Intrinsics.c(this.f20390a, onLinkedGiftCard.f20390a) && Intrinsics.c(this.b, onLinkedGiftCard.b) && this.c == onLinkedGiftCard.c && Intrinsics.c(this.d, onLinkedGiftCard.d) && Intrinsics.c(this.e, onLinkedGiftCard.e) && this.f == onLinkedGiftCard.f && Intrinsics.c(this.g, onLinkedGiftCard.g) && Intrinsics.c(this.h, onLinkedGiftCard.h);
        }

        public final int hashCode() {
            int iA = b.a(this.f, b.c(b.c(b.e(b.c(this.f20390a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
            ErrorBanner errorBanner = this.g;
            int iHashCode = (iA + (errorBanner == null ? 0 : errorBanner.hashCode())) * 31;
            String str = this.h;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnLinkedGiftCard(id=", this.f20390a, ", title=", this.b, ", isSelected=");
            au.com.woolworths.android.onesite.a.y(", amountTitle=", this.d, ", amountValue=", sbV, this.c);
            a.x(this.f, this.e, ", amountRedeem=", ", errorBanner=", sbV);
            sbV.append(this.g);
            sbV.append(", snackBarMessage=");
            sbV.append(this.h);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$OnLinkedPayPal;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnLinkedPayPal {

        /* renamed from: a, reason: collision with root package name */
        public final String f20391a;
        public final String b;
        public final boolean c;
        public final String d;
        public final String e;
        public final int f;
        public final String g;

        public OnLinkedPayPal(int i, String str, String str2, String str3, String str4, String str5, boolean z) {
            this.f20391a = str;
            this.b = str2;
            this.c = z;
            this.d = str3;
            this.e = str4;
            this.f = i;
            this.g = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnLinkedPayPal)) {
                return false;
            }
            OnLinkedPayPal onLinkedPayPal = (OnLinkedPayPal) obj;
            return Intrinsics.c(this.f20391a, onLinkedPayPal.f20391a) && Intrinsics.c(this.b, onLinkedPayPal.b) && this.c == onLinkedPayPal.c && Intrinsics.c(this.d, onLinkedPayPal.d) && Intrinsics.c(this.e, onLinkedPayPal.e) && this.f == onLinkedPayPal.f && Intrinsics.c(this.g, onLinkedPayPal.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + b.a(this.f, b.c(b.c(b.e(b.c(this.f20391a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnLinkedPayPal(icon=", this.f20391a, ", title=", this.b, ", isSelected=");
            au.com.woolworths.android.onesite.a.y(", amountTitle=", this.d, ", amountValue=", sbV, this.c);
            a.x(this.f, this.e, ", amountToPay=", ", id=", sbV);
            return a.o(sbV, this.g, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$OnPaymentInstrumentResponseSuccess;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPaymentInstrumentResponseSuccess {

        /* renamed from: a, reason: collision with root package name */
        public final GiftCardSection f20392a;
        public final PaymentMethodSection b;
        public final PaymentInstrumentTotalDetails c;
        public final String d;
        public final String e;
        public final ArrayList f;

        public OnPaymentInstrumentResponseSuccess(GiftCardSection giftCardSection, PaymentMethodSection paymentMethodSection, PaymentInstrumentTotalDetails paymentInstrumentTotalDetails, String str, String str2, ArrayList arrayList) {
            this.f20392a = giftCardSection;
            this.b = paymentMethodSection;
            this.c = paymentInstrumentTotalDetails;
            this.d = str;
            this.e = str2;
            this.f = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPaymentInstrumentResponseSuccess)) {
                return false;
            }
            OnPaymentInstrumentResponseSuccess onPaymentInstrumentResponseSuccess = (OnPaymentInstrumentResponseSuccess) obj;
            return this.f20392a.equals(onPaymentInstrumentResponseSuccess.f20392a) && this.b.equals(onPaymentInstrumentResponseSuccess.b) && this.c.equals(onPaymentInstrumentResponseSuccess.c) && Intrinsics.c(this.d, onPaymentInstrumentResponseSuccess.d) && Intrinsics.c(this.e, onPaymentInstrumentResponseSuccess.e) && this.f.equals(onPaymentInstrumentResponseSuccess.f);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f20392a.hashCode() * 31)) * 31)) * 31;
            String str = this.d;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            return this.f.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "OnPaymentInstrumentResponseSuccess(giftCardSection=" + this.f20392a + ", paymentMethodSection=" + this.b + ", paymentInstrumentTotalDetails=" + this.c + ", snackBarMessage=" + this.d + ", footerMessageMd=" + this.e + ", analytics=" + this.f + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$OnPaymentInstrumentResponseValidationFailure;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPaymentInstrumentResponseValidationFailure {

        /* renamed from: a, reason: collision with root package name */
        public final String f20393a;
        public final String b;
        public final ImpressionAnalytics c;

        public OnPaymentInstrumentResponseValidationFailure(String str, String str2, ImpressionAnalytics impressionAnalytics) {
            this.f20393a = str;
            this.b = str2;
            this.c = impressionAnalytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPaymentInstrumentResponseValidationFailure)) {
                return false;
            }
            OnPaymentInstrumentResponseValidationFailure onPaymentInstrumentResponseValidationFailure = (OnPaymentInstrumentResponseValidationFailure) obj;
            return Intrinsics.c(this.f20393a, onPaymentInstrumentResponseValidationFailure.f20393a) && Intrinsics.c(this.b, onPaymentInstrumentResponseValidationFailure.b) && Intrinsics.c(this.c, onPaymentInstrumentResponseValidationFailure.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f20393a.hashCode() * 31, 31, this.b);
            ImpressionAnalytics impressionAnalytics = this.c;
            return iC + (impressionAnalytics == null ? 0 : impressionAnalytics.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnPaymentInstrumentResponseValidationFailure(errorMessage=", this.f20393a, ", errorTitle=", this.b, ", impressionAnalytics=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$OnPlaceOrderButtonDefault;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPlaceOrderButtonDefault {

        /* renamed from: a, reason: collision with root package name */
        public final String f20394a;
        public final boolean b;
        public final Analytics2 c;

        public OnPlaceOrderButtonDefault(String str, boolean z, Analytics2 analytics2) {
            this.f20394a = str;
            this.b = z;
            this.c = analytics2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPlaceOrderButtonDefault)) {
                return false;
            }
            OnPlaceOrderButtonDefault onPlaceOrderButtonDefault = (OnPlaceOrderButtonDefault) obj;
            return Intrinsics.c(this.f20394a, onPlaceOrderButtonDefault.f20394a) && this.b == onPlaceOrderButtonDefault.b && Intrinsics.c(this.c, onPlaceOrderButtonDefault.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.e(this.f20394a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbQ = androidx.constraintlayout.core.state.a.q("OnPlaceOrderButtonDefault(label=", this.f20394a, ", isEnabled=", ", analytics=", this.b);
            sbQ.append(this.c);
            sbQ.append(")");
            return sbQ.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$OnPlaceOrderButtonGooglePay;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPlaceOrderButtonGooglePay {

        /* renamed from: a, reason: collision with root package name */
        public final Analytics3 f20395a;

        public OnPlaceOrderButtonGooglePay(Analytics3 analytics3) {
            this.f20395a = analytics3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnPlaceOrderButtonGooglePay) && Intrinsics.c(this.f20395a, ((OnPlaceOrderButtonGooglePay) obj).f20395a);
        }

        public final int hashCode() {
            return this.f20395a.hashCode();
        }

        public final String toString() {
            return "OnPlaceOrderButtonGooglePay(analytics=" + this.f20395a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$OnUnlinkedCreditCard;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnUnlinkedCreditCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f20396a;
        public final String b;
        public final String c;
        public final String d;
        public final boolean e;
        public final String f;
        public final String g;
        public final int h;

        public OnUnlinkedCreditCard(int i, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
            this.f20396a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = z;
            this.f = str5;
            this.g = str6;
            this.h = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnUnlinkedCreditCard)) {
                return false;
            }
            OnUnlinkedCreditCard onUnlinkedCreditCard = (OnUnlinkedCreditCard) obj;
            return Intrinsics.c(this.f20396a, onUnlinkedCreditCard.f20396a) && Intrinsics.c(this.b, onUnlinkedCreditCard.b) && Intrinsics.c(this.c, onUnlinkedCreditCard.c) && Intrinsics.c(this.d, onUnlinkedCreditCard.d) && this.e == onUnlinkedCreditCard.e && Intrinsics.c(this.f, onUnlinkedCreditCard.f) && Intrinsics.c(this.g, onUnlinkedCreditCard.g) && this.h == onUnlinkedCreditCard.h;
        }

        public final int hashCode() {
            int iC = b.c(this.f20396a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return Integer.hashCode(this.h) + b.c(b.c(b.e(b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnUnlinkedCreditCard(id=", this.f20396a, ", title=", this.b, ", subtitle=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", icon=", this.d, ", isSelected=");
            au.com.woolworths.android.onesite.a.y(", amountTitle=", this.f, ", amountValue=", sbV, this.e);
            sbV.append(this.g);
            sbV.append(", amountToPay=");
            sbV.append(this.h);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$OnUnlinkedGiftCard;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnUnlinkedGiftCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f20397a;
        public final String b;
        public final String c;
        public final boolean d;
        public final String e;
        public final String f;
        public final int g;
        public final ErrorBanner1 h;
        public final String i;

        public OnUnlinkedGiftCard(String str, String str2, String str3, boolean z, String str4, String str5, int i, ErrorBanner1 errorBanner1, String str6) {
            this.f20397a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
            this.e = str4;
            this.f = str5;
            this.g = i;
            this.h = errorBanner1;
            this.i = str6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnUnlinkedGiftCard)) {
                return false;
            }
            OnUnlinkedGiftCard onUnlinkedGiftCard = (OnUnlinkedGiftCard) obj;
            return Intrinsics.c(this.f20397a, onUnlinkedGiftCard.f20397a) && Intrinsics.c(this.b, onUnlinkedGiftCard.b) && Intrinsics.c(this.c, onUnlinkedGiftCard.c) && this.d == onUnlinkedGiftCard.d && Intrinsics.c(this.e, onUnlinkedGiftCard.e) && Intrinsics.c(this.f, onUnlinkedGiftCard.f) && this.g == onUnlinkedGiftCard.g && Intrinsics.c(this.h, onUnlinkedGiftCard.h) && Intrinsics.c(this.i, onUnlinkedGiftCard.i);
        }

        public final int hashCode() {
            int iA = b.a(this.g, b.c(b.c(b.e(b.c(b.c(this.f20397a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
            ErrorBanner1 errorBanner1 = this.h;
            int iHashCode = (iA + (errorBanner1 == null ? 0 : errorBanner1.hashCode())) * 31;
            String str = this.i;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnUnlinkedGiftCard(number=", this.f20397a, ", pin=", this.b, ", title=");
            d.A(this.c, ", isSelected=", ", amountTitle=", sbV, this.d);
            androidx.constraintlayout.core.state.a.B(sbV, this.e, ", amountValue=", this.f, ", amountRedeem=");
            sbV.append(this.g);
            sbV.append(", errorBanner=");
            sbV.append(this.h);
            sbV.append(", snackBarMessage=");
            return a.o(sbV, this.i, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$PaymentInstrumentTotalDetails;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PaymentInstrumentTotalDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f20398a;
        public final String b;
        public final Button c;
        public final String d;

        public PaymentInstrumentTotalDetails(String str, String str2, Button button, String str3) {
            this.f20398a = str;
            this.b = str2;
            this.c = button;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentInstrumentTotalDetails)) {
                return false;
            }
            PaymentInstrumentTotalDetails paymentInstrumentTotalDetails = (PaymentInstrumentTotalDetails) obj;
            return Intrinsics.c(this.f20398a, paymentInstrumentTotalDetails.f20398a) && Intrinsics.c(this.b, paymentInstrumentTotalDetails.b) && Intrinsics.c(this.c, paymentInstrumentTotalDetails.c) && Intrinsics.c(this.d, paymentInstrumentTotalDetails.d);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + b.c(this.f20398a.hashCode() * 31, 31, this.b)) * 31;
            String str = this.d;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("PaymentInstrumentTotalDetails(title=", this.f20398a, ", subtitle=", this.b, ", button=");
            sbV.append(this.c);
            sbV.append(", panelMarkdown=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$PaymentInstruments;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PaymentInstruments {

        /* renamed from: a, reason: collision with root package name */
        public final String f20399a;
        public final OnPaymentInstrumentResponseSuccess b;
        public final OnPaymentInstrumentResponseValidationFailure c;

        public PaymentInstruments(String __typename, OnPaymentInstrumentResponseSuccess onPaymentInstrumentResponseSuccess, OnPaymentInstrumentResponseValidationFailure onPaymentInstrumentResponseValidationFailure) {
            Intrinsics.h(__typename, "__typename");
            this.f20399a = __typename;
            this.b = onPaymentInstrumentResponseSuccess;
            this.c = onPaymentInstrumentResponseValidationFailure;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentInstruments)) {
                return false;
            }
            PaymentInstruments paymentInstruments = (PaymentInstruments) obj;
            return Intrinsics.c(this.f20399a, paymentInstruments.f20399a) && Intrinsics.c(this.b, paymentInstruments.b) && Intrinsics.c(this.c, paymentInstruments.c);
        }

        public final int hashCode() {
            int iHashCode = this.f20399a.hashCode() * 31;
            OnPaymentInstrumentResponseSuccess onPaymentInstrumentResponseSuccess = this.b;
            int iHashCode2 = (iHashCode + (onPaymentInstrumentResponseSuccess == null ? 0 : onPaymentInstrumentResponseSuccess.hashCode())) * 31;
            OnPaymentInstrumentResponseValidationFailure onPaymentInstrumentResponseValidationFailure = this.c;
            return iHashCode2 + (onPaymentInstrumentResponseValidationFailure != null ? onPaymentInstrumentResponseValidationFailure.hashCode() : 0);
        }

        public final String toString() {
            return "PaymentInstruments(__typename=" + this.f20399a + ", onPaymentInstrumentResponseSuccess=" + this.b + ", onPaymentInstrumentResponseValidationFailure=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$PaymentMethod;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PaymentMethod {

        /* renamed from: a, reason: collision with root package name */
        public final String f20400a;
        public final OnAddCreditCard b;
        public final OnAddPayPal c;
        public final OnLinkedCreditCard d;
        public final OnUnlinkedCreditCard e;
        public final OnExpiredCreditCard f;
        public final OnLinkedPayPal g;
        public final OnGooglePay h;

        public PaymentMethod(String __typename, OnAddCreditCard onAddCreditCard, OnAddPayPal onAddPayPal, OnLinkedCreditCard onLinkedCreditCard, OnUnlinkedCreditCard onUnlinkedCreditCard, OnExpiredCreditCard onExpiredCreditCard, OnLinkedPayPal onLinkedPayPal, OnGooglePay onGooglePay) {
            Intrinsics.h(__typename, "__typename");
            this.f20400a = __typename;
            this.b = onAddCreditCard;
            this.c = onAddPayPal;
            this.d = onLinkedCreditCard;
            this.e = onUnlinkedCreditCard;
            this.f = onExpiredCreditCard;
            this.g = onLinkedPayPal;
            this.h = onGooglePay;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentMethod)) {
                return false;
            }
            PaymentMethod paymentMethod = (PaymentMethod) obj;
            return Intrinsics.c(this.f20400a, paymentMethod.f20400a) && Intrinsics.c(this.b, paymentMethod.b) && Intrinsics.c(this.c, paymentMethod.c) && Intrinsics.c(this.d, paymentMethod.d) && Intrinsics.c(this.e, paymentMethod.e) && Intrinsics.c(this.f, paymentMethod.f) && Intrinsics.c(this.g, paymentMethod.g) && Intrinsics.c(this.h, paymentMethod.h);
        }

        public final int hashCode() {
            int iHashCode = this.f20400a.hashCode() * 31;
            OnAddCreditCard onAddCreditCard = this.b;
            int iHashCode2 = (iHashCode + (onAddCreditCard == null ? 0 : onAddCreditCard.hashCode())) * 31;
            OnAddPayPal onAddPayPal = this.c;
            int iHashCode3 = (iHashCode2 + (onAddPayPal == null ? 0 : onAddPayPal.hashCode())) * 31;
            OnLinkedCreditCard onLinkedCreditCard = this.d;
            int iHashCode4 = (iHashCode3 + (onLinkedCreditCard == null ? 0 : onLinkedCreditCard.hashCode())) * 31;
            OnUnlinkedCreditCard onUnlinkedCreditCard = this.e;
            int iHashCode5 = (iHashCode4 + (onUnlinkedCreditCard == null ? 0 : onUnlinkedCreditCard.hashCode())) * 31;
            OnExpiredCreditCard onExpiredCreditCard = this.f;
            int iHashCode6 = (iHashCode5 + (onExpiredCreditCard == null ? 0 : onExpiredCreditCard.hashCode())) * 31;
            OnLinkedPayPal onLinkedPayPal = this.g;
            int iHashCode7 = (iHashCode6 + (onLinkedPayPal == null ? 0 : onLinkedPayPal.hashCode())) * 31;
            OnGooglePay onGooglePay = this.h;
            return iHashCode7 + (onGooglePay != null ? onGooglePay.hashCode() : 0);
        }

        public final String toString() {
            return "PaymentMethod(__typename=" + this.f20400a + ", onAddCreditCard=" + this.b + ", onAddPayPal=" + this.c + ", onLinkedCreditCard=" + this.d + ", onUnlinkedCreditCard=" + this.e + ", onExpiredCreditCard=" + this.f + ", onLinkedPayPal=" + this.g + ", onGooglePay=" + this.h + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$PaymentMethodSection;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PaymentMethodSection {

        /* renamed from: a, reason: collision with root package name */
        public final String f20401a;
        public final ArrayList b;

        public PaymentMethodSection(String str, ArrayList arrayList) {
            this.f20401a = str;
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
            return this.f20401a.equals(paymentMethodSection.f20401a) && this.b.equals(paymentMethodSection.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20401a.hashCode() * 31);
        }

        public final String toString() {
            return d.q("PaymentMethodSection(title=", this.f20401a, ", paymentMethods=", ")", this.b);
        }
    }

    public PaymentInstrumentsQuery(boolean z, PaymentInstrumentsInput paymentInstrumentsInput, boolean z2) {
        this.f20367a = z;
        this.b = paymentInstrumentsInput;
        this.c = z2;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(PaymentInstrumentsQuery_ResponseAdapter.Data.f20435a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query PaymentInstruments($isGooglePayEnabled: Boolean!, $paymentInstrumentsInput: PaymentInstrumentsInput!, $includePanelMarkdown: Boolean!) { paymentInstruments(paymentInstrumentsInput: $paymentInstrumentsInput) { __typename ... on PaymentInstrumentResponseSuccess { giftCardSection { title giftCards { __typename ... on AddGiftCard { title clickAnalytics { __typename ...analyticsFields } } ... on LinkedGiftCard { id title isSelected amountTitle amountValue amountRedeem errorBanner { displayType message analytics { __typename ...analyticsFields } } snackBarMessage } ... on UnlinkedGiftCard { number pin title isSelected amountTitle amountValue amountRedeem errorBanner { displayType message analytics { __typename ...analyticsFields } } snackBarMessage } } } paymentMethodSection { title paymentMethods { __typename ... on AddCreditCard { title clickAnalytics { __typename ...analyticsFields } } ... on AddPayPal { icon title alert { title message primaryButtonTitle secondaryButtonTitle clickAnalytics { __typename ...analyticsFields } } } ... on LinkedCreditCard { id title subtitle icon isSelected amountTitle amountValue amountToPay cvvUrl } ... on UnlinkedCreditCard { id title subtitle icon isSelected amountTitle amountValue amountToPay } ... on ExpiredCreditCard { id title subtitle icon } ... on LinkedPayPal { icon title isSelected amountTitle amountValue amountToPay id } ... on GooglePay @include(if: $isGooglePayEnabled) { title isSelected amountTitle amountValue amountToPay id supportedNetworks } } } paymentInstrumentTotalDetails { title subtitle button { __typename ... on PlaceOrderButtonDefault { label isEnabled analytics { __typename ...analyticsFields } } ... on PlaceOrderButtonGooglePay { analytics { __typename ...analyticsFields } } } panelMarkdown @include(if: $includePanelMarkdown) } snackBarMessage footerMessageMd analytics { __typename ...analyticsFields } } ... on PaymentInstrumentResponseValidationFailure { errorMessage errorTitle impressionAnalytics { __typename ...analyticsFields } } } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentInstrumentsQuery)) {
            return false;
        }
        PaymentInstrumentsQuery paymentInstrumentsQuery = (PaymentInstrumentsQuery) obj;
        return this.f20367a == paymentInstrumentsQuery.f20367a && Intrinsics.c(this.b, paymentInstrumentsQuery.b) && this.c == paymentInstrumentsQuery.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Boolean.hashCode(this.f20367a) * 31)) * 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "637d5fc9adca9988fb969072d541992525cfc7cd8399400428da1766940b0ce5";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "PaymentInstruments";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("isGooglePayEnabled");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        d.B(this.f20367a, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "paymentInstrumentsInput");
        Adapters.c(PaymentInstrumentsInput_InputAdapter.f12096a, false).toJson(jsonWriter, customScalarAdapters, this.b);
        jsonWriter.F1("includePanelMarkdown");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentInstrumentsQuery(isGooglePayEnabled=");
        sb.append(this.f20367a);
        sb.append(", paymentInstrumentsInput=");
        sb.append(this.b);
        sb.append(", includePanelMarkdown=");
        return a.k(")", sb, this.c);
    }
}
