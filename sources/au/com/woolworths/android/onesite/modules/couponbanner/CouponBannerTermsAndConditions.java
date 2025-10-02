package au.com.woolworths.android.onesite.modules.couponbanner;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/couponbanner/CouponBannerTermsAndConditions;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CouponBannerTermsAndConditions implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CouponBannerTermsAndConditions> CREATOR = new Creator();
    public final String d;
    public final String e;
    public final String f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CouponBannerTermsAndConditions> {
        @Override // android.os.Parcelable.Creator
        public final CouponBannerTermsAndConditions createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new CouponBannerTermsAndConditions(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CouponBannerTermsAndConditions[] newArray(int i) {
            return new CouponBannerTermsAndConditions[i];
        }
    }

    public CouponBannerTermsAndConditions(String url, String title, String str) {
        Intrinsics.h(url, "url");
        Intrinsics.h(title, "title");
        this.d = url;
        this.e = title;
        this.f = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CouponBannerTermsAndConditions)) {
            return false;
        }
        CouponBannerTermsAndConditions couponBannerTermsAndConditions = (CouponBannerTermsAndConditions) obj;
        return Intrinsics.c(this.d, couponBannerTermsAndConditions.d) && Intrinsics.c(this.e, couponBannerTermsAndConditions.e) && Intrinsics.c(this.f, couponBannerTermsAndConditions.f);
    }

    public final int hashCode() {
        int iC = b.c(this.d.hashCode() * 31, 31, this.e);
        String str = this.f;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return a.o(a.v("CouponBannerTermsAndConditions(url=", this.d, ", title=", this.e, ", accessibilityLabel="), this.f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
    }
}
