package au.com.woolworths.shop.checkout.domain.model;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CheckoutRewardsAndDiscount;", "", "CheckoutRewards", "PromoCode", "StoreCredit", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutRewardsAndDiscount$CheckoutRewards;", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutRewardsAndDiscount$PromoCode;", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutRewardsAndDiscount$StoreCredit;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class CheckoutRewardsAndDiscount {

    /* renamed from: a, reason: collision with root package name */
    public final AnalyticsData f10581a;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CheckoutRewardsAndDiscount$CheckoutRewards;", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutRewardsAndDiscount;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CheckoutRewards extends CheckoutRewardsAndDiscount {
        public final String b;
        public final String c;
        public final boolean d;
        public final CheckoutRewardsAction e;
        public final AnalyticsData f;

        public CheckoutRewards(String str, String str2, boolean z, CheckoutRewardsAction checkoutRewardsAction, AnalyticsData analyticsData) {
            super(analyticsData);
            this.b = str;
            this.c = str2;
            this.d = z;
            this.e = checkoutRewardsAction;
            this.f = analyticsData;
        }

        @Override // au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsAndDiscount
        /* renamed from: a, reason: from getter */
        public final AnalyticsData getF10581a() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CheckoutRewards)) {
                return false;
            }
            CheckoutRewards checkoutRewards = (CheckoutRewards) obj;
            return Intrinsics.c(this.b, checkoutRewards.b) && Intrinsics.c(this.c, checkoutRewards.c) && this.d == checkoutRewards.d && Intrinsics.c(this.e, checkoutRewards.e) && Intrinsics.c(this.f, checkoutRewards.f);
        }

        public final int hashCode() {
            int iE = b.e(b.c(this.b.hashCode() * 31, 31, this.c), 31, this.d);
            CheckoutRewardsAction checkoutRewardsAction = this.e;
            int iHashCode = (iE + (checkoutRewardsAction == null ? 0 : checkoutRewardsAction.hashCode())) * 31;
            AnalyticsData analyticsData = this.f;
            return iHashCode + (analyticsData != null ? analyticsData.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("CheckoutRewards(title=", this.b, ", description=", this.c, ", redeemedIcon=");
            sbV.append(this.d);
            sbV.append(", rewardsAction=");
            sbV.append(this.e);
            sbV.append(", actionClickAnalytics=");
            return au.com.woolworths.android.onesite.a.n(sbV, this.f, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CheckoutRewardsAndDiscount$PromoCode;", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutRewardsAndDiscount;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PromoCode extends CheckoutRewardsAndDiscount {
        public final String b;
        public final String c;
        public final boolean d;
        public final AnalyticsData e;
        public final CheckoutPromoCodeDetail f;

        public PromoCode(String str, String str2, boolean z, AnalyticsData analyticsData, CheckoutPromoCodeDetail checkoutPromoCodeDetail) {
            super(analyticsData);
            this.b = str;
            this.c = str2;
            this.d = z;
            this.e = analyticsData;
            this.f = checkoutPromoCodeDetail;
        }

        @Override // au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsAndDiscount
        /* renamed from: a, reason: from getter */
        public final AnalyticsData getF10581a() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PromoCode)) {
                return false;
            }
            PromoCode promoCode = (PromoCode) obj;
            return Intrinsics.c(this.b, promoCode.b) && Intrinsics.c(this.c, promoCode.c) && this.d == promoCode.d && Intrinsics.c(this.e, promoCode.e) && Intrinsics.c(this.f, promoCode.f);
        }

        public final int hashCode() {
            int iE = b.e(b.c(this.b.hashCode() * 31, 31, this.c), 31, this.d);
            AnalyticsData analyticsData = this.e;
            return this.f.hashCode() + ((iE + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("PromoCode(title=", this.b, ", description=", this.c, ", appliedIcon=");
            sbV.append(this.d);
            sbV.append(", actionClickAnalytics=");
            sbV.append(this.e);
            sbV.append(", detail=");
            sbV.append(this.f);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CheckoutRewardsAndDiscount$StoreCredit;", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutRewardsAndDiscount;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StoreCredit extends CheckoutRewardsAndDiscount {
        public final String b;
        public final String c;
        public final boolean d;
        public final AnalyticsData e;
        public final CheckoutStoreCreditDetail f;

        public StoreCredit(String str, String str2, boolean z, AnalyticsData analyticsData, CheckoutStoreCreditDetail checkoutStoreCreditDetail) {
            super(analyticsData);
            this.b = str;
            this.c = str2;
            this.d = z;
            this.e = analyticsData;
            this.f = checkoutStoreCreditDetail;
        }

        @Override // au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsAndDiscount
        /* renamed from: a, reason: from getter */
        public final AnalyticsData getF10581a() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StoreCredit)) {
                return false;
            }
            StoreCredit storeCredit = (StoreCredit) obj;
            return Intrinsics.c(this.b, storeCredit.b) && Intrinsics.c(this.c, storeCredit.c) && this.d == storeCredit.d && Intrinsics.c(this.e, storeCredit.e) && Intrinsics.c(this.f, storeCredit.f);
        }

        public final int hashCode() {
            int iE = b.e(b.c(this.b.hashCode() * 31, 31, this.c), 31, this.d);
            AnalyticsData analyticsData = this.e;
            return this.f.hashCode() + ((iE + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("StoreCredit(title=", this.b, ", description=", this.c, ", appliedIcon=");
            sbV.append(this.d);
            sbV.append(", actionClickAnalytics=");
            sbV.append(this.e);
            sbV.append(", detail=");
            sbV.append(this.f);
            sbV.append(")");
            return sbV.toString();
        }
    }

    public CheckoutRewardsAndDiscount(AnalyticsData analyticsData) {
        this.f10581a = analyticsData;
    }

    /* renamed from: a, reason: from getter */
    public AnalyticsData getF10581a() {
        return this.f10581a;
    }
}
