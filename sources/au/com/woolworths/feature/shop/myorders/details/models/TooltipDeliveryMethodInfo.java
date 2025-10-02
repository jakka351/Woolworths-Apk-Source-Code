package au.com.woolworths.feature.shop.myorders.details.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/TooltipDeliveryMethodInfo;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TooltipDeliveryMethodInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TooltipDeliveryMethodInfo> CREATOR = new Creator();
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final DriverRatingBanner h;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TooltipDeliveryMethodInfo> {
        @Override // android.os.Parcelable.Creator
        public final TooltipDeliveryMethodInfo createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = a.e(DeliveryMethodBulletInfo.CREATOR, parcel, arrayList, iE, 1);
            }
            return new TooltipDeliveryMethodInfo(string, string2, string3, arrayList, parcel.readInt() == 0 ? null : DriverRatingBanner.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final TooltipDeliveryMethodInfo[] newArray(int i) {
            return new TooltipDeliveryMethodInfo[i];
        }
    }

    public TooltipDeliveryMethodInfo(String title, String imageUrl, String description, List list, DriverRatingBanner driverRatingBanner) {
        Intrinsics.h(title, "title");
        Intrinsics.h(imageUrl, "imageUrl");
        Intrinsics.h(description, "description");
        this.d = title;
        this.e = imageUrl;
        this.f = description;
        this.g = list;
        this.h = driverRatingBanner;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TooltipDeliveryMethodInfo)) {
            return false;
        }
        TooltipDeliveryMethodInfo tooltipDeliveryMethodInfo = (TooltipDeliveryMethodInfo) obj;
        return Intrinsics.c(this.d, tooltipDeliveryMethodInfo.d) && Intrinsics.c(this.e, tooltipDeliveryMethodInfo.e) && Intrinsics.c(this.f, tooltipDeliveryMethodInfo.f) && Intrinsics.c(this.g, tooltipDeliveryMethodInfo.g) && Intrinsics.c(this.h, tooltipDeliveryMethodInfo.h);
    }

    public final int hashCode() {
        int iD = b.d(b.c(b.c(this.d.hashCode() * 31, 31, this.e), 31, this.f), 31, this.g);
        DriverRatingBanner driverRatingBanner = this.h;
        return iD + (driverRatingBanner == null ? 0 : driverRatingBanner.hashCode());
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("TooltipDeliveryMethodInfo(title=", this.d, ", imageUrl=", this.e, ", description=");
        au.com.woolworths.android.onesite.a.B(sbV, this.f, ", bulletInfoList=", this.g, ", driverRatingBanner=");
        sbV.append(this.h);
        sbV.append(")");
        return sbV.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        Iterator itU = au.com.woolworths.android.onesite.a.u(this.g, dest);
        while (itU.hasNext()) {
            ((DeliveryMethodBulletInfo) itU.next()).writeToParcel(dest, i);
        }
        DriverRatingBanner driverRatingBanner = this.h;
        if (driverRatingBanner == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            driverRatingBanner.writeToParcel(dest, i);
        }
    }
}
