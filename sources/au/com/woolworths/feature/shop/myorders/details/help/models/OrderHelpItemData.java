package au.com.woolworths.feature.shop.myorders.details.help.models;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/help/models/OrderHelpItemData;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrderHelpItemData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OrderHelpItemData> CREATOR = new Creator();
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final OrderHelpItemType h;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderHelpItemData> {
        @Override // android.os.Parcelable.Creator
        public final OrderHelpItemData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new OrderHelpItemData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), OrderHelpItemType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final OrderHelpItemData[] newArray(int i) {
            return new OrderHelpItemData[i];
        }
    }

    public OrderHelpItemData(String iconUrl, String title, String subtitle, String str, OrderHelpItemType itemType) {
        Intrinsics.h(iconUrl, "iconUrl");
        Intrinsics.h(title, "title");
        Intrinsics.h(subtitle, "subtitle");
        Intrinsics.h(itemType, "itemType");
        this.d = iconUrl;
        this.e = title;
        this.f = subtitle;
        this.g = str;
        this.h = itemType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderHelpItemData)) {
            return false;
        }
        OrderHelpItemData orderHelpItemData = (OrderHelpItemData) obj;
        return Intrinsics.c(this.d, orderHelpItemData.d) && Intrinsics.c(this.e, orderHelpItemData.e) && Intrinsics.c(this.f, orderHelpItemData.f) && Intrinsics.c(this.g, orderHelpItemData.g) && this.h == orderHelpItemData.h;
    }

    public final int hashCode() {
        int iC = b.c(b.c(this.d.hashCode() * 31, 31, this.e), 31, this.f);
        String str = this.g;
        return this.h.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbV = a.v("OrderHelpItemData(iconUrl=", this.d, ", title=", this.e, ", subtitle=");
        androidx.constraintlayout.core.state.a.B(sbV, this.f, ", url=", this.g, ", itemType=");
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
        dest.writeString(this.g);
        dest.writeString(this.h.name());
    }
}
