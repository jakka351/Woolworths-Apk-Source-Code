package au.com.woolworths.shop.checkout.domain.model;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CheckoutRewardsAction;", "", "CheckoutRewardsRedeem", "CheckoutRewardsInfo", "CheckoutRewardsLink", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutRewardsAction$CheckoutRewardsInfo;", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutRewardsAction$CheckoutRewardsLink;", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutRewardsAction$CheckoutRewardsRedeem;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class CheckoutRewardsAction {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CheckoutRewardsAction$CheckoutRewardsInfo;", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutRewardsAction;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CheckoutRewardsInfo extends CheckoutRewardsAction {
        public final String d;
        public final String e;
        public final String f;
        public final AnalyticsData g;
        public final AnalyticsData h;

        public CheckoutRewardsInfo(String str, String str2, String str3, AnalyticsData analyticsData, AnalyticsData analyticsData2) {
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.g = analyticsData;
            this.h = analyticsData2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CheckoutRewardsInfo)) {
                return false;
            }
            CheckoutRewardsInfo checkoutRewardsInfo = (CheckoutRewardsInfo) obj;
            return Intrinsics.c(this.d, checkoutRewardsInfo.d) && Intrinsics.c(this.e, checkoutRewardsInfo.e) && Intrinsics.c(this.f, checkoutRewardsInfo.f) && Intrinsics.c(this.g, checkoutRewardsInfo.g) && Intrinsics.c(this.h, checkoutRewardsInfo.h);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.d.hashCode() * 31, 31, this.e), 31, this.f);
            AnalyticsData analyticsData = this.g;
            int iHashCode = (iC + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31;
            AnalyticsData analyticsData2 = this.h;
            return iHashCode + (analyticsData2 != null ? analyticsData2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("CheckoutRewardsInfo(title=", this.d, ", description=", this.e, ", buttonTitle=");
            sbV.append(this.f);
            sbV.append(", impressionAnalytics=");
            sbV.append(this.g);
            sbV.append(", buttonClickAnalytics=");
            return au.com.woolworths.android.onesite.a.n(sbV, this.h, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CheckoutRewardsAction$CheckoutRewardsLink;", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutRewardsAction;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CheckoutRewardsLink extends CheckoutRewardsAction {
        public static final CheckoutRewardsLink d = new CheckoutRewardsLink();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CheckoutRewardsLink);
        }

        public final int hashCode() {
            return -1304403860;
        }

        public final String toString() {
            return "CheckoutRewardsLink";
        }
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CheckoutRewardsAction$CheckoutRewardsRedeem;", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutRewardsAction;", "Landroid/os/Parcelable;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CheckoutRewardsRedeem extends CheckoutRewardsAction implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CheckoutRewardsRedeem> CREATOR = new Creator();
        public final CheckoutRewardsRedeemInfo d;
        public final String e;
        public final String f;
        public final AnalyticsData g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CheckoutRewardsRedeem> {
            @Override // android.os.Parcelable.Creator
            public final CheckoutRewardsRedeem createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new CheckoutRewardsRedeem(CheckoutRewardsRedeemInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), (AnalyticsData) parcel.readParcelable(CheckoutRewardsRedeem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final CheckoutRewardsRedeem[] newArray(int i) {
                return new CheckoutRewardsRedeem[i];
            }
        }

        public CheckoutRewardsRedeem(CheckoutRewardsRedeemInfo rewardsRedeemInfo, String title, String description, AnalyticsData analyticsData) {
            Intrinsics.h(rewardsRedeemInfo, "rewardsRedeemInfo");
            Intrinsics.h(title, "title");
            Intrinsics.h(description, "description");
            this.d = rewardsRedeemInfo;
            this.e = title;
            this.f = description;
            this.g = analyticsData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CheckoutRewardsRedeem)) {
                return false;
            }
            CheckoutRewardsRedeem checkoutRewardsRedeem = (CheckoutRewardsRedeem) obj;
            return Intrinsics.c(this.d, checkoutRewardsRedeem.d) && Intrinsics.c(this.e, checkoutRewardsRedeem.e) && Intrinsics.c(this.f, checkoutRewardsRedeem.f) && Intrinsics.c(this.g, checkoutRewardsRedeem.g);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.d.hashCode() * 31, 31, this.e), 31, this.f);
            AnalyticsData analyticsData = this.g;
            return iC + (analyticsData == null ? 0 : analyticsData.hashCode());
        }

        public final String toString() {
            return "CheckoutRewardsRedeem(rewardsRedeemInfo=" + this.d + ", title=" + this.e + ", description=" + this.f + ", impressionAnalytics=" + this.g + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            this.d.writeToParcel(dest, i);
            dest.writeString(this.e);
            dest.writeString(this.f);
            dest.writeParcelable(this.g, i);
        }
    }
}
