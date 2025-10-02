package au.com.woolworths.shop.checkout.domain.model;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/ApplyCheckoutPromoCodeResult;", "", "ApplyCheckoutPromoCodeConfirmation", "ApplyCheckoutPromoCodeSuccess", "ApplyCheckoutPromoCodeFail", "ApplyCheckoutPromoCodeAdditionalInfo", "Lau/com/woolworths/shop/checkout/domain/model/ApplyCheckoutPromoCodeResult$ApplyCheckoutPromoCodeAdditionalInfo;", "Lau/com/woolworths/shop/checkout/domain/model/ApplyCheckoutPromoCodeResult$ApplyCheckoutPromoCodeConfirmation;", "Lau/com/woolworths/shop/checkout/domain/model/ApplyCheckoutPromoCodeResult$ApplyCheckoutPromoCodeFail;", "Lau/com/woolworths/shop/checkout/domain/model/ApplyCheckoutPromoCodeResult$ApplyCheckoutPromoCodeSuccess;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ApplyCheckoutPromoCodeResult {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/ApplyCheckoutPromoCodeResult$ApplyCheckoutPromoCodeAdditionalInfo;", "Lau/com/woolworths/shop/checkout/domain/model/ApplyCheckoutPromoCodeResult;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ApplyCheckoutPromoCodeAdditionalInfo extends ApplyCheckoutPromoCodeResult {

        /* renamed from: a, reason: collision with root package name */
        public final ApplyPromoCodeBannerTypeData f10557a;
        public final InsetBannerApiData b;
        public final AnalyticsData c;

        public ApplyCheckoutPromoCodeAdditionalInfo(ApplyPromoCodeBannerTypeData type, InsetBannerApiData insetBannerApiData, AnalyticsData analyticsData) {
            Intrinsics.h(type, "type");
            this.f10557a = type;
            this.b = insetBannerApiData;
            this.c = analyticsData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ApplyCheckoutPromoCodeAdditionalInfo)) {
                return false;
            }
            ApplyCheckoutPromoCodeAdditionalInfo applyCheckoutPromoCodeAdditionalInfo = (ApplyCheckoutPromoCodeAdditionalInfo) obj;
            return this.f10557a == applyCheckoutPromoCodeAdditionalInfo.f10557a && Intrinsics.c(this.b, applyCheckoutPromoCodeAdditionalInfo.b) && Intrinsics.c(this.c, applyCheckoutPromoCodeAdditionalInfo.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.f10557a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ApplyCheckoutPromoCodeAdditionalInfo(type=");
            sb.append(this.f10557a);
            sb.append(", banner=");
            sb.append(this.b);
            sb.append(", clickAnalytics=");
            return a.n(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/ApplyCheckoutPromoCodeResult$ApplyCheckoutPromoCodeConfirmation;", "Lau/com/woolworths/shop/checkout/domain/model/ApplyCheckoutPromoCodeResult;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ApplyCheckoutPromoCodeConfirmation extends ApplyCheckoutPromoCodeResult {

        /* renamed from: a, reason: collision with root package name */
        public final String f10558a;
        public final String b;
        public final String c;
        public final String d;

        public ApplyCheckoutPromoCodeConfirmation(String str, String str2, String str3, String str4) {
            this.f10558a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ApplyCheckoutPromoCodeConfirmation)) {
                return false;
            }
            ApplyCheckoutPromoCodeConfirmation applyCheckoutPromoCodeConfirmation = (ApplyCheckoutPromoCodeConfirmation) obj;
            return Intrinsics.c(this.f10558a, applyCheckoutPromoCodeConfirmation.f10558a) && Intrinsics.c(this.b, applyCheckoutPromoCodeConfirmation.b) && Intrinsics.c(this.c, applyCheckoutPromoCodeConfirmation.c) && Intrinsics.c(this.d, applyCheckoutPromoCodeConfirmation.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + b.c(b.c(this.f10558a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(YU.a.v("ApplyCheckoutPromoCodeConfirmation(title=", this.f10558a, ", message=", this.b, ", primaryButtonTitle="), this.c, ", secondaryButtonTitle=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/ApplyCheckoutPromoCodeResult$ApplyCheckoutPromoCodeFail;", "Lau/com/woolworths/shop/checkout/domain/model/ApplyCheckoutPromoCodeResult;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ApplyCheckoutPromoCodeFail extends ApplyCheckoutPromoCodeResult {

        /* renamed from: a, reason: collision with root package name */
        public final String f10559a;

        public ApplyCheckoutPromoCodeFail(String str) {
            this.f10559a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApplyCheckoutPromoCodeFail) && Intrinsics.c(this.f10559a, ((ApplyCheckoutPromoCodeFail) obj).f10559a);
        }

        public final int hashCode() {
            return this.f10559a.hashCode();
        }

        public final String toString() {
            return YU.a.h("ApplyCheckoutPromoCodeFail(message=", this.f10559a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/ApplyCheckoutPromoCodeResult$ApplyCheckoutPromoCodeSuccess;", "Lau/com/woolworths/shop/checkout/domain/model/ApplyCheckoutPromoCodeResult;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ApplyCheckoutPromoCodeSuccess extends ApplyCheckoutPromoCodeResult {

        /* renamed from: a, reason: collision with root package name */
        public final String f10560a;

        public ApplyCheckoutPromoCodeSuccess(String str) {
            this.f10560a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApplyCheckoutPromoCodeSuccess) && Intrinsics.c(this.f10560a, ((ApplyCheckoutPromoCodeSuccess) obj).f10560a);
        }

        public final int hashCode() {
            return this.f10560a.hashCode();
        }

        public final String toString() {
            return YU.a.h("ApplyCheckoutPromoCodeSuccess(message=", this.f10560a, ")");
        }
    }
}
