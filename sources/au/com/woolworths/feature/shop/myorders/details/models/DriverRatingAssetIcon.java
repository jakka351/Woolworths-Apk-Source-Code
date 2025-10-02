package au.com.woolworths.feature.shop.myorders.details.models;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/DriverRatingAssetIcon;", "Landroid/os/Parcelable;", "DriverRatingHostedIcon", "Lau/com/woolworths/feature/shop/myorders/details/models/DriverRatingAssetIcon$DriverRatingHostedIcon;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class DriverRatingAssetIcon implements Parcelable {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/DriverRatingAssetIcon$DriverRatingHostedIcon;", "Lau/com/woolworths/feature/shop/myorders/details/models/DriverRatingAssetIcon;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DriverRatingHostedIcon extends DriverRatingAssetIcon {

        @NotNull
        public static final Parcelable.Creator<DriverRatingHostedIcon> CREATOR = new Creator();
        public final String d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DriverRatingHostedIcon> {
            @Override // android.os.Parcelable.Creator
            public final DriverRatingHostedIcon createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new DriverRatingHostedIcon(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final DriverRatingHostedIcon[] newArray(int i) {
                return new DriverRatingHostedIcon[i];
            }
        }

        public DriverRatingHostedIcon(String url) {
            Intrinsics.h(url, "url");
            this.d = url;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DriverRatingHostedIcon) && Intrinsics.c(this.d, ((DriverRatingHostedIcon) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return a.h("DriverRatingHostedIcon(url=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
        }
    }
}
