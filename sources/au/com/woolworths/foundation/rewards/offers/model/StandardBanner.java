package au.com.woolworths.foundation.rewards.offers.model;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/StandardBanner;", "Landroid/os/Parcelable;", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StandardBanner implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StandardBanner> CREATOR = new Creator();
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StandardBanner> {
        @Override // android.os.Parcelable.Creator
        public final StandardBanner createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new StandardBanner(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StandardBanner[] newArray(int i) {
            return new StandardBanner[i];
        }
    }

    public StandardBanner(String bannerId, String bannerTitle, String str, String str2, String str3, String str4, String str5) {
        Intrinsics.h(bannerId, "bannerId");
        Intrinsics.h(bannerTitle, "bannerTitle");
        this.d = bannerId;
        this.e = bannerTitle;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StandardBanner)) {
            return false;
        }
        StandardBanner standardBanner = (StandardBanner) obj;
        return Intrinsics.c(this.d, standardBanner.d) && Intrinsics.c(this.e, standardBanner.e) && Intrinsics.c(this.f, standardBanner.f) && Intrinsics.c(this.g, standardBanner.g) && Intrinsics.c(this.h, standardBanner.h) && Intrinsics.c(this.i, standardBanner.i) && Intrinsics.c(this.j, standardBanner.j);
    }

    public final int hashCode() {
        int iC = b.c(this.d.hashCode() * 31, 31, this.e);
        String str = this.f;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.j;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("StandardBanner(bannerId=", this.d, ", bannerTitle=", this.e, ", bannerImageUrl=");
        androidx.constraintlayout.core.state.a.B(sbV, this.f, ", bannerDescription=", this.g, ", bannerActionUrl=");
        androidx.constraintlayout.core.state.a.B(sbV, this.h, ", bannerActionLabel=", this.i, ", bannerActionAccessibilityHint=");
        return a.o(sbV, this.j, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.g);
        dest.writeString(this.h);
        dest.writeString(this.i);
        dest.writeString(this.j);
    }
}
