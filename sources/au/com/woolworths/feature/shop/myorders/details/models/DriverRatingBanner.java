package au.com.woolworths.feature.shop.myorders.details.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/DriverRatingBanner;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DriverRatingBanner implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DriverRatingBanner> CREATOR = new Creator();
    public final DriverRatingBroadcastBannerUI d;
    public final boolean e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DriverRatingBanner> {
        @Override // android.os.Parcelable.Creator
        public final DriverRatingBanner createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new DriverRatingBanner(DriverRatingBroadcastBannerUI.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final DriverRatingBanner[] newArray(int i) {
            return new DriverRatingBanner[i];
        }
    }

    public DriverRatingBanner(DriverRatingBroadcastBannerUI broadcastBannerUI, boolean z) {
        Intrinsics.h(broadcastBannerUI, "broadcastBannerUI");
        this.d = broadcastBannerUI;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DriverRatingBanner)) {
            return false;
        }
        DriverRatingBanner driverRatingBanner = (DriverRatingBanner) obj;
        return Intrinsics.c(this.d, driverRatingBanner.d) && this.e == driverRatingBanner.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "DriverRatingBanner(broadcastBannerUI=" + this.d + ", broadcastBannerDismissible=" + this.e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        this.d.writeToParcel(dest, i);
        dest.writeInt(this.e ? 1 : 0);
    }
}
