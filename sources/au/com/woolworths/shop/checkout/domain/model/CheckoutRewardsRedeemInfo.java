package au.com.woolworths.shop.checkout.domain.model;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CheckoutRewardsRedeemInfo;", "Landroid/os/Parcelable;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CheckoutRewardsRedeemInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CheckoutRewardsRedeemInfo> CREATOR = new Creator();
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final InsetBannerApiData i;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CheckoutRewardsRedeemInfo> {
        @Override // android.os.Parcelable.Creator
        public final CheckoutRewardsRedeemInfo createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new CheckoutRewardsRedeemInfo(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (InsetBannerApiData) parcel.readParcelable(CheckoutRewardsRedeemInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CheckoutRewardsRedeemInfo[] newArray(int i) {
            return new CheckoutRewardsRedeemInfo[i];
        }
    }

    public CheckoutRewardsRedeemInfo(int i, int i2, int i3, int i4, int i5, InsetBannerApiData insetBannerApiData) {
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = insetBannerApiData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutRewardsRedeemInfo)) {
            return false;
        }
        CheckoutRewardsRedeemInfo checkoutRewardsRedeemInfo = (CheckoutRewardsRedeemInfo) obj;
        return this.d == checkoutRewardsRedeemInfo.d && this.e == checkoutRewardsRedeemInfo.e && this.f == checkoutRewardsRedeemInfo.f && this.g == checkoutRewardsRedeemInfo.g && this.h == checkoutRewardsRedeemInfo.h && Intrinsics.c(this.i, checkoutRewardsRedeemInfo.i);
    }

    public final int hashCode() {
        int iA = b.a(this.h, b.a(this.g, b.a(this.f, b.a(this.e, Integer.hashCode(this.d) * 31, 31), 31), 31), 31);
        InsetBannerApiData insetBannerApiData = this.i;
        return iA + (insetBannerApiData == null ? 0 : insetBannerApiData.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = a.q(this.d, this.e, "CheckoutRewardsRedeemInfo(minimum=", ", maximum=", ", maximumRedeemable=");
        a.w(this.f, this.g, ", increment=", ", current=", sbQ);
        sbQ.append(this.h);
        sbQ.append(", unRedeemableBannerApiData=");
        sbQ.append(this.i);
        sbQ.append(")");
        return sbQ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeInt(this.d);
        dest.writeInt(this.e);
        dest.writeInt(this.f);
        dest.writeInt(this.g);
        dest.writeInt(this.h);
        dest.writeParcelable(this.i, i);
    }
}
