package au.com.woolworths.feature.shop.myorders.details.models;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.sdui.common.broadcastbanner.model.CoreBroadcastBannerStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/DriverRatingBroadcastBannerUI;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DriverRatingBroadcastBannerUI implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DriverRatingBroadcastBannerUI> CREATOR = new Creator();
    public final String d;
    public final String e;
    public final CoreBroadcastBannerStyle f;
    public final DriverRatingAssetIcon g;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DriverRatingBroadcastBannerUI> {
        @Override // android.os.Parcelable.Creator
        public final DriverRatingBroadcastBannerUI createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new DriverRatingBroadcastBannerUI(parcel.readString(), parcel.readString(), CoreBroadcastBannerStyle.valueOf(parcel.readString()), (DriverRatingAssetIcon) parcel.readParcelable(DriverRatingBroadcastBannerUI.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DriverRatingBroadcastBannerUI[] newArray(int i) {
            return new DriverRatingBroadcastBannerUI[i];
        }
    }

    public DriverRatingBroadcastBannerUI(String title, String str, CoreBroadcastBannerStyle style, DriverRatingAssetIcon icon) {
        Intrinsics.h(title, "title");
        Intrinsics.h(style, "style");
        Intrinsics.h(icon, "icon");
        this.d = title;
        this.e = str;
        this.f = style;
        this.g = icon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DriverRatingBroadcastBannerUI)) {
            return false;
        }
        DriverRatingBroadcastBannerUI driverRatingBroadcastBannerUI = (DriverRatingBroadcastBannerUI) obj;
        return Intrinsics.c(this.d, driverRatingBroadcastBannerUI.d) && Intrinsics.c(this.e, driverRatingBroadcastBannerUI.e) && this.f == driverRatingBroadcastBannerUI.f && Intrinsics.c(this.g, driverRatingBroadcastBannerUI.g);
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        String str = this.e;
        return this.g.hashCode() + ((this.f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbV = a.v("DriverRatingBroadcastBannerUI(title=", this.d, ", subtitle=", this.e, ", style=");
        sbV.append(this.f);
        sbV.append(", icon=");
        sbV.append(this.g);
        sbV.append(")");
        return sbV.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f.name());
        dest.writeParcelable(this.g, i);
    }
}
