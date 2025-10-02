package au.com.woolworths.feature.shop.wpay.domain.model.payment;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PlaceOrderButton;", "", "Default", "GooglePay", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PlaceOrderButton$Default;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PlaceOrderButton$GooglePay;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PlaceOrderButton {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PlaceOrderButton$Default;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PlaceOrderButton;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Default implements PlaceOrderButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f8312a;
        public final boolean b;
        public final AnalyticsData c;

        public Default(boolean z, String str, AnalyticsData analyticsData) {
            this.f8312a = str;
            this.b = z;
            this.c = analyticsData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Default)) {
                return false;
            }
            Default r5 = (Default) obj;
            return Intrinsics.c(this.f8312a, r5.f8312a) && this.b == r5.b && Intrinsics.c(this.c, r5.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.e(this.f8312a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.n(androidx.constraintlayout.core.state.a.q("Default(label=", this.f8312a, ", isEnabled=", ", analytics=", this.b), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PlaceOrderButton$GooglePay;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PlaceOrderButton;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GooglePay implements PlaceOrderButton {

        /* renamed from: a, reason: collision with root package name */
        public final AnalyticsData f8313a;

        public GooglePay(AnalyticsData analyticsData) {
            this.f8313a = analyticsData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GooglePay) && Intrinsics.c(this.f8313a, ((GooglePay) obj).f8313a);
        }

        public final int hashCode() {
            return this.f8313a.hashCode();
        }

        public final String toString() {
            return "GooglePay(analytics=" + this.f8313a + ")";
        }
    }
}
