package com.woolworths.shop.checkout;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.graphql.type.ApplyPromoCodeBannerType;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.checkout.adapter.ApplyCheckoutPromoCodeMutation_ResponseAdapter;
import com.woolworths.shop.checkout.fragment.CheckoutContentSummary;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\r\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/woolworths/shop/checkout/ApplyCheckoutPromoCodeMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/shop/checkout/ApplyCheckoutPromoCodeMutation$Data;", "Data", "ApplyCheckoutPromoCode", "Result", "OnApplyPromoCodeFail", "OnApplyPromoCodeSuccess", "OnApplyPromoCodeReplaceConfirmation", "OnApplyPromoCodeAdditionalInfo", "Banner", "Action", "Analytics", "ClickAnalytics", "CheckoutSummary", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ApplyCheckoutPromoCodeMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f21806a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final Optional k;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/ApplyCheckoutPromoCodeMutation$Action;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerActionPlacement f21807a;
        public final InsetBannerActionType b;
        public final String c;
        public final String d;

        public Action(InsetBannerActionPlacement insetBannerActionPlacement, InsetBannerActionType insetBannerActionType, String str, String str2) {
            this.f21807a = insetBannerActionPlacement;
            this.b = insetBannerActionType;
            this.c = str;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return this.f21807a == action.f21807a && this.b == action.b && Intrinsics.c(this.c, action.c) && Intrinsics.c(this.d, action.d);
        }

        public final int hashCode() {
            int iC = b.c(d.c(this.b, this.f21807a.hashCode() * 31, 31), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.l(d.t("Action(placement=", this.f21807a, ", type=", this.b, ", label="), this.c, ", url=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/ApplyCheckoutPromoCodeMutation$Analytics;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f21808a;
        public final AnalyticsFields b;

        public Analytics(String str, AnalyticsFields analyticsFields) {
            this.f21808a = str;
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
            return Intrinsics.c(this.f21808a, analytics.f21808a) && Intrinsics.c(this.b, analytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21808a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics(__typename=", this.f21808a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/ApplyCheckoutPromoCodeMutation$ApplyCheckoutPromoCode;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ApplyCheckoutPromoCode {

        /* renamed from: a, reason: collision with root package name */
        public final Result f21809a;
        public final CheckoutSummary b;

        public ApplyCheckoutPromoCode(Result result, CheckoutSummary checkoutSummary) {
            this.f21809a = result;
            this.b = checkoutSummary;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ApplyCheckoutPromoCode)) {
                return false;
            }
            ApplyCheckoutPromoCode applyCheckoutPromoCode = (ApplyCheckoutPromoCode) obj;
            return Intrinsics.c(this.f21809a, applyCheckoutPromoCode.f21809a) && Intrinsics.c(this.b, applyCheckoutPromoCode.b);
        }

        public final int hashCode() {
            int iHashCode = this.f21809a.hashCode() * 31;
            CheckoutSummary checkoutSummary = this.b;
            return iHashCode + (checkoutSummary == null ? 0 : checkoutSummary.hashCode());
        }

        public final String toString() {
            return "ApplyCheckoutPromoCode(result=" + this.f21809a + ", checkoutSummary=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/ApplyCheckoutPromoCodeMutation$Banner;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Banner {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f21810a;
        public final String b;
        public final String c;
        public final String d;
        public final Action e;
        public final Analytics f;

        public Banner(InsetBannerDisplayType insetBannerDisplayType, String str, String str2, String str3, Action action, Analytics analytics) {
            this.f21810a = insetBannerDisplayType;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = action;
            this.f = analytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) obj;
            return this.f21810a == banner.f21810a && Intrinsics.c(this.b, banner.b) && Intrinsics.c(this.c, banner.c) && Intrinsics.c(this.d, banner.d) && Intrinsics.c(this.e, banner.e) && Intrinsics.c(this.f, banner.f);
        }

        public final int hashCode() {
            int iC = b.c(this.f21810a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Action action = this.e;
            int iHashCode3 = (iHashCode2 + (action == null ? 0 : action.hashCode())) * 31;
            Analytics analytics = this.f;
            return iHashCode3 + (analytics != null ? analytics.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbU = d.u("Banner(displayType=", this.f21810a, ", message=", this.b, ", iconUrl=");
            a.B(sbU, this.c, ", bannerTitle=", this.d, ", action=");
            sbU.append(this.e);
            sbU.append(", analytics=");
            sbU.append(this.f);
            sbU.append(")");
            return sbU.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/ApplyCheckoutPromoCodeMutation$CheckoutSummary;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CheckoutSummary {

        /* renamed from: a, reason: collision with root package name */
        public final String f21811a;
        public final CheckoutContentSummary b;

        public CheckoutSummary(String str, CheckoutContentSummary checkoutContentSummary) {
            this.f21811a = str;
            this.b = checkoutContentSummary;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CheckoutSummary)) {
                return false;
            }
            CheckoutSummary checkoutSummary = (CheckoutSummary) obj;
            return Intrinsics.c(this.f21811a, checkoutSummary.f21811a) && Intrinsics.c(this.b, checkoutSummary.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21811a.hashCode() * 31);
        }

        public final String toString() {
            return "CheckoutSummary(__typename=" + this.f21811a + ", checkoutContentSummary=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/ApplyCheckoutPromoCodeMutation$ClickAnalytics;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ClickAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f21812a;
        public final AnalyticsFields b;

        public ClickAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f21812a = str;
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
            return Intrinsics.c(this.f21812a, clickAnalytics.f21812a) && Intrinsics.c(this.b, clickAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21812a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ClickAnalytics(__typename=", this.f21812a, ", analyticsFields=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/checkout/ApplyCheckoutPromoCodeMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/ApplyCheckoutPromoCodeMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final ApplyCheckoutPromoCode f21813a;

        public Data(ApplyCheckoutPromoCode applyCheckoutPromoCode) {
            this.f21813a = applyCheckoutPromoCode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21813a, ((Data) obj).f21813a);
        }

        public final int hashCode() {
            return this.f21813a.hashCode();
        }

        public final String toString() {
            return "Data(applyCheckoutPromoCode=" + this.f21813a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/ApplyCheckoutPromoCodeMutation$OnApplyPromoCodeAdditionalInfo;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnApplyPromoCodeAdditionalInfo {

        /* renamed from: a, reason: collision with root package name */
        public final ApplyPromoCodeBannerType f21814a;
        public final Banner b;
        public final ClickAnalytics c;

        public OnApplyPromoCodeAdditionalInfo(ApplyPromoCodeBannerType applyPromoCodeBannerType, Banner banner, ClickAnalytics clickAnalytics) {
            this.f21814a = applyPromoCodeBannerType;
            this.b = banner;
            this.c = clickAnalytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnApplyPromoCodeAdditionalInfo)) {
                return false;
            }
            OnApplyPromoCodeAdditionalInfo onApplyPromoCodeAdditionalInfo = (OnApplyPromoCodeAdditionalInfo) obj;
            return this.f21814a == onApplyPromoCodeAdditionalInfo.f21814a && Intrinsics.c(this.b, onApplyPromoCodeAdditionalInfo.b) && Intrinsics.c(this.c, onApplyPromoCodeAdditionalInfo.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.f21814a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "OnApplyPromoCodeAdditionalInfo(type=" + this.f21814a + ", banner=" + this.b + ", clickAnalytics=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/ApplyCheckoutPromoCodeMutation$OnApplyPromoCodeFail;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnApplyPromoCodeFail {

        /* renamed from: a, reason: collision with root package name */
        public final String f21815a;

        public OnApplyPromoCodeFail(String str) {
            this.f21815a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnApplyPromoCodeFail) && Intrinsics.c(this.f21815a, ((OnApplyPromoCodeFail) obj).f21815a);
        }

        public final int hashCode() {
            return this.f21815a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnApplyPromoCodeFail(message=", this.f21815a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/ApplyCheckoutPromoCodeMutation$OnApplyPromoCodeReplaceConfirmation;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnApplyPromoCodeReplaceConfirmation {

        /* renamed from: a, reason: collision with root package name */
        public final String f21816a;
        public final String b;
        public final String c;
        public final String d;

        public OnApplyPromoCodeReplaceConfirmation(String str, String str2, String str3, String str4) {
            this.f21816a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnApplyPromoCodeReplaceConfirmation)) {
                return false;
            }
            OnApplyPromoCodeReplaceConfirmation onApplyPromoCodeReplaceConfirmation = (OnApplyPromoCodeReplaceConfirmation) obj;
            return Intrinsics.c(this.f21816a, onApplyPromoCodeReplaceConfirmation.f21816a) && Intrinsics.c(this.b, onApplyPromoCodeReplaceConfirmation.b) && Intrinsics.c(this.c, onApplyPromoCodeReplaceConfirmation.c) && Intrinsics.c(this.d, onApplyPromoCodeReplaceConfirmation.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + b.c(b.c(this.f21816a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return a.l(YU.a.v("OnApplyPromoCodeReplaceConfirmation(title=", this.f21816a, ", message=", this.b, ", primaryButtonTitle="), this.c, ", secondaryButtonTitle=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/ApplyCheckoutPromoCodeMutation$OnApplyPromoCodeSuccess;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnApplyPromoCodeSuccess {

        /* renamed from: a, reason: collision with root package name */
        public final String f21817a;

        public OnApplyPromoCodeSuccess(String str) {
            this.f21817a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnApplyPromoCodeSuccess) && Intrinsics.c(this.f21817a, ((OnApplyPromoCodeSuccess) obj).f21817a);
        }

        public final int hashCode() {
            return this.f21817a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnApplyPromoCodeSuccess(message=", this.f21817a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/ApplyCheckoutPromoCodeMutation$Result;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Result {

        /* renamed from: a, reason: collision with root package name */
        public final String f21818a;
        public final OnApplyPromoCodeFail b;
        public final OnApplyPromoCodeSuccess c;
        public final OnApplyPromoCodeReplaceConfirmation d;
        public final OnApplyPromoCodeAdditionalInfo e;

        public Result(String __typename, OnApplyPromoCodeFail onApplyPromoCodeFail, OnApplyPromoCodeSuccess onApplyPromoCodeSuccess, OnApplyPromoCodeReplaceConfirmation onApplyPromoCodeReplaceConfirmation, OnApplyPromoCodeAdditionalInfo onApplyPromoCodeAdditionalInfo) {
            Intrinsics.h(__typename, "__typename");
            this.f21818a = __typename;
            this.b = onApplyPromoCodeFail;
            this.c = onApplyPromoCodeSuccess;
            this.d = onApplyPromoCodeReplaceConfirmation;
            this.e = onApplyPromoCodeAdditionalInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Result)) {
                return false;
            }
            Result result = (Result) obj;
            return Intrinsics.c(this.f21818a, result.f21818a) && Intrinsics.c(this.b, result.b) && Intrinsics.c(this.c, result.c) && Intrinsics.c(this.d, result.d) && Intrinsics.c(this.e, result.e);
        }

        public final int hashCode() {
            int iHashCode = this.f21818a.hashCode() * 31;
            OnApplyPromoCodeFail onApplyPromoCodeFail = this.b;
            int iHashCode2 = (iHashCode + (onApplyPromoCodeFail == null ? 0 : onApplyPromoCodeFail.f21815a.hashCode())) * 31;
            OnApplyPromoCodeSuccess onApplyPromoCodeSuccess = this.c;
            int iHashCode3 = (iHashCode2 + (onApplyPromoCodeSuccess == null ? 0 : onApplyPromoCodeSuccess.f21817a.hashCode())) * 31;
            OnApplyPromoCodeReplaceConfirmation onApplyPromoCodeReplaceConfirmation = this.d;
            int iHashCode4 = (iHashCode3 + (onApplyPromoCodeReplaceConfirmation == null ? 0 : onApplyPromoCodeReplaceConfirmation.hashCode())) * 31;
            OnApplyPromoCodeAdditionalInfo onApplyPromoCodeAdditionalInfo = this.e;
            return iHashCode4 + (onApplyPromoCodeAdditionalInfo != null ? onApplyPromoCodeAdditionalInfo.hashCode() : 0);
        }

        public final String toString() {
            return "Result(__typename=" + this.f21818a + ", onApplyPromoCodeFail=" + this.b + ", onApplyPromoCodeSuccess=" + this.c + ", onApplyPromoCodeReplaceConfirmation=" + this.d + ", onApplyPromoCodeAdditionalInfo=" + this.e + ")";
        }
    }

    public ApplyCheckoutPromoCodeMutation(String promoCode, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        Intrinsics.h(promoCode, "promoCode");
        this.f21806a = promoCode;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = z9;
        this.k = Optional.Absent.f13523a;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(ApplyCheckoutPromoCodeMutation_ResponseAdapter.Data.f21956a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation ApplyCheckoutPromoCode($promoCode: String!, $replace: Boolean!, $isRewardsUplift: Boolean!, $isPromoCodeUplift: Boolean!, $includeCredit: Boolean!, $includeRewardsAndDiscounts: Boolean!, $includeIdVerificationBottomSheet: Boolean!, $rewardsAndDiscountsImpressionUplift: Boolean!, $includePanelMarkdown: Boolean!, $isWPayEnabled: Boolean!, $includeServiceFees: Boolean! = false ) { applyCheckoutPromoCode(promoCode: $promoCode, replace: $replace) { result { __typename ... on ApplyPromoCodeFail { message } ... on ApplyPromoCodeSuccess { message } ... on ApplyPromoCodeReplaceConfirmation { title message primaryButtonTitle secondaryButtonTitle } ... on ApplyPromoCodeAdditionalInfo { type banner { displayType message iconUrl bannerTitle: title action { placement type label url } analytics { __typename ...analyticsFields } } clickAnalytics { __typename ...analyticsFields } } } checkoutSummary { __typename ...checkoutContentSummary } } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment checkoutContentSummary on CheckoutContent { productsInfo { productId productName price quantity subtotal isAvailable sellerName brandName dispatchNote } message { __typename ... on SnackBar { message eventSource } } legacyErrors { errorCode message key } progress { index id title } content { __typename ... on InsetBanner { displayType message } ... on CheckoutSummaryBillingAddress { title addressText } ... on CheckoutSummaryBillingAddressEmpty { title displayName buttonText } ... on CheckoutSummaryRewardsUnregistered @skip(if: $isRewardsUplift) { buttonTitle } ... on CheckoutSummaryRewards @skip(if: $isRewardsUplift) { rewardsSections { __typename ... on CheckoutSummaryRewardsRegistered { title subtitle imageUrl } ... on CheckoutSummaryRewardsRegisteredRedeemable { redeemText buttonTitle isRedeemed redeemInfo { title message buttonTitle secondaryButtonTitle } } } } ... on CheckoutOrderAddresses { title addressSections { __typename ... on CheckoutOrderGroceryAddress { title addressText imageUrl fulfilmentWindow } ... on CheckoutOrderMarketAddress { title addressText imageUrl sellerInfo { sellerName dispatchNote } } } insetBanner { displayType message } } ... on CheckoutOrderSummary { title sections { title titleType value valueType imageUrl message { title body type @include(if: $includeServiceFees) } } } ... on CheckoutTermsConditions { markdownText } ... on CheckoutPromotionCode @skip(if: $isPromoCodeUplift) { title placeholderText buttonTitle discounts { discountItems { title price } buttonTitle } } ... on CheckoutRewardsAndDiscounts @include(if: $includeRewardsAndDiscounts) { title rewardsAndDiscounts { __typename ... on CheckoutRewards @include(if: $isRewardsUplift) { title description redeemedIcon actionClickAnalytics { __typename ...analyticsFields } rewardsAction { __typename ... on CheckoutRewardsRedeem { rewardsRedeemInfo { minimum maximum maximumRedeemable increment current unRedeemableBanner { displayType message } } title description impressionAnalytics { __typename ...analyticsFields } } ... on CheckoutRewardsInfo { title description buttonTitle impressionAnalytics { __typename ...analyticsFields } buttonClickAnalytics { __typename ...analyticsFields } } ... on CheckoutRewardsLink { __typename } } } ... on CheckoutPromoCode @include(if: $isPromoCodeUplift) { title description appliedIcon actionClickAnalytics { __typename ...analyticsFields } detail { placeholderText buttonTitle promoCodes { __typename ... on CheckoutPromoCodeItem { title subtitle primaryLabel secondaryLabel isApplied code } } } } ... on CheckoutCredit @include(if: $includeCredit) { title description appliedIcon actionClickAnalytics { __typename ...analyticsFields } detail { __typename ... on CheckoutCreditEmpty { title message } ... on CheckoutCreditItems { title subtitle items { title subtitle primaryLabel secondaryLabel isApplied code amount } } ... on CheckoutCreditUnavailable { title message retryButtonTitle } } } } impressionAnalytics @skip(if: $rewardsAndDiscountsImpressionUplift) { __typename ...analyticsFields } } } orderTotalDetails { inlineMessage { displayType message } sections { title titleType value valueType imageUrl message @include(if: $includeServiceFees) { title body type } } total { title value balanceToPay buttonTitle progressId isEnabled } refundInfo { bottomSheetTitle bottomSheetBody primaryCta { label } } reviewProducts { unavailableOrderItems { name } restrictedOrderItems { name } exceededSupplyLimitProductGroups { products { name } } restrictedProductsByDeliveryMethod { name } restrictedProductsByDeliPlatter { name } availableOrderItems { name } } panelMarkdown @include(if: $includePanelMarkdown) } idVerificationBottomSheet @include(if: $includeIdVerificationBottomSheet) { title body imageUrls primaryButton { label style enabled } secondaryButton { label style enabled } } impressionAnalytics @include(if: $rewardsAndDiscountsImpressionUplift) { __typename ...analyticsFields } isUserWPayMigrated @include(if: $isWPayEnabled) restrictionPrompt { title message } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplyCheckoutPromoCodeMutation)) {
            return false;
        }
        ApplyCheckoutPromoCodeMutation applyCheckoutPromoCodeMutation = (ApplyCheckoutPromoCodeMutation) obj;
        return Intrinsics.c(this.f21806a, applyCheckoutPromoCodeMutation.f21806a) && this.b == applyCheckoutPromoCodeMutation.b && this.c == applyCheckoutPromoCodeMutation.c && this.d == applyCheckoutPromoCodeMutation.d && this.e == applyCheckoutPromoCodeMutation.e && this.f == applyCheckoutPromoCodeMutation.f && this.g == applyCheckoutPromoCodeMutation.g && this.h == applyCheckoutPromoCodeMutation.h && this.i == applyCheckoutPromoCodeMutation.i && this.j == applyCheckoutPromoCodeMutation.j && this.k.equals(applyCheckoutPromoCodeMutation.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + b.e(b.e(b.e(b.e(b.e(b.e(b.e(b.e(b.e(this.f21806a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "83aa7d67c79f84a4e9fad08f942b25ca05f0abb846ef53d4bd56b38503d4f84e";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "ApplyCheckoutPromoCode";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("promoCode");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f21806a);
        jsonWriter.F1("replace");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        d.B(this.b, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isRewardsUplift");
        d.B(this.c, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isPromoCodeUplift");
        d.B(this.d, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeCredit");
        d.B(this.e, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeRewardsAndDiscounts");
        d.B(this.f, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeIdVerificationBottomSheet");
        d.B(this.g, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "rewardsAndDiscountsImpressionUplift");
        d.B(this.h, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includePanelMarkdown");
        d.B(this.i, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isWPayEnabled");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.j));
        Optional optional = this.k;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("includeServiceFees");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        } else if (z) {
            jsonWriter.F1("includeServiceFees");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
    }

    public final String toString() {
        StringBuilder sbQ = a.q("ApplyCheckoutPromoCodeMutation(promoCode=", this.f21806a, ", replace=", ", isRewardsUplift=", this.b);
        au.com.woolworths.android.onesite.a.D(sbQ, this.c, ", isPromoCodeUplift=", this.d, ", includeCredit=");
        au.com.woolworths.android.onesite.a.D(sbQ, this.e, ", includeRewardsAndDiscounts=", this.f, ", includeIdVerificationBottomSheet=");
        au.com.woolworths.android.onesite.a.D(sbQ, this.g, ", rewardsAndDiscountsImpressionUplift=", this.h, ", includePanelMarkdown=");
        au.com.woolworths.android.onesite.a.D(sbQ, this.i, ", isWPayEnabled=", this.j, ", includeServiceFees=");
        return au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.o(sbQ, this.k, ")");
    }
}
