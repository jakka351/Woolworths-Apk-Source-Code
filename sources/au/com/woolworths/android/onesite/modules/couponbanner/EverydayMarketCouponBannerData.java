package au.com.woolworths.android.onesite.modules.couponbanner;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/couponbanner/EverydayMarketCouponBannerData;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EverydayMarketCouponBannerData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EverydayMarketCouponBannerData> CREATOR = new Creator();
    public final EverydayMarketCouponBannerColorTheme d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final CouponBannerTermsAndConditions k;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EverydayMarketCouponBannerData> {
        @Override // android.os.Parcelable.Creator
        public final EverydayMarketCouponBannerData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new EverydayMarketCouponBannerData(EverydayMarketCouponBannerColorTheme.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), CouponBannerTermsAndConditions.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final EverydayMarketCouponBannerData[] newArray(int i) {
            return new EverydayMarketCouponBannerData[i];
        }
    }

    public EverydayMarketCouponBannerData(EverydayMarketCouponBannerColorTheme couponBannerColorTheme, String couponBannerDescription, String couponBannerCouponCode, String str, String couponBannerMinimumSpend, String str2, String str3, CouponBannerTermsAndConditions couponBannerTermsAndConditions) {
        Intrinsics.h(couponBannerColorTheme, "couponBannerColorTheme");
        Intrinsics.h(couponBannerDescription, "couponBannerDescription");
        Intrinsics.h(couponBannerCouponCode, "couponBannerCouponCode");
        Intrinsics.h(couponBannerMinimumSpend, "couponBannerMinimumSpend");
        Intrinsics.h(couponBannerTermsAndConditions, "couponBannerTermsAndConditions");
        this.d = couponBannerColorTheme;
        this.e = couponBannerDescription;
        this.f = couponBannerCouponCode;
        this.g = str;
        this.h = couponBannerMinimumSpend;
        this.i = str2;
        this.j = str3;
        this.k = couponBannerTermsAndConditions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EverydayMarketCouponBannerData)) {
            return false;
        }
        EverydayMarketCouponBannerData everydayMarketCouponBannerData = (EverydayMarketCouponBannerData) obj;
        return this.d == everydayMarketCouponBannerData.d && Intrinsics.c(this.e, everydayMarketCouponBannerData.e) && Intrinsics.c(this.f, everydayMarketCouponBannerData.f) && Intrinsics.c(this.g, everydayMarketCouponBannerData.g) && Intrinsics.c(this.h, everydayMarketCouponBannerData.h) && Intrinsics.c(this.i, everydayMarketCouponBannerData.i) && Intrinsics.c(this.j, everydayMarketCouponBannerData.j) && Intrinsics.c(this.k, everydayMarketCouponBannerData.k);
    }

    public final int hashCode() {
        int iC = b.c(b.c(this.d.hashCode() * 31, 31, this.e), 31, this.f);
        String str = this.g;
        int iC2 = b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.h);
        String str2 = this.i;
        int iHashCode = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        return this.k.hashCode() + ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EverydayMarketCouponBannerData(couponBannerColorTheme=");
        sb.append(this.d);
        sb.append(", couponBannerDescription=");
        sb.append(this.e);
        sb.append(", couponBannerCouponCode=");
        a.B(sb, this.f, ", couponBannerImage=", this.g, ", couponBannerMinimumSpend=");
        a.B(sb, this.h, ", couponBannerCouponCodeAccessibilityLabel=", this.i, ", couponBannerDescriptionAccessibilityLabel=");
        sb.append(this.j);
        sb.append(", couponBannerTermsAndConditions=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d.name());
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.g);
        dest.writeString(this.h);
        dest.writeString(this.i);
        dest.writeString(this.j);
        this.k.writeToParcel(dest, i);
    }
}
