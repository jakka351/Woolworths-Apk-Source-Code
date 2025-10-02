package au.com.woolworths.feature.shop.myorders.details.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/OrderDetailsProductCardData;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrderDetailsProductCardData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OrderDetailsProductCardData> CREATOR = new Creator();
    public final int d;
    public final String e;
    public final String f;
    public final double g;
    public final String h;
    public final String i;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderDetailsProductCardData> {
        @Override // android.os.Parcelable.Creator
        public final OrderDetailsProductCardData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new OrderDetailsProductCardData(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OrderDetailsProductCardData[] newArray(int i) {
            return new OrderDetailsProductCardData[i];
        }
    }

    public OrderDetailsProductCardData(int i, String name, String imagePath, double d, String salesPrice, String str) {
        Intrinsics.h(name, "name");
        Intrinsics.h(imagePath, "imagePath");
        Intrinsics.h(salesPrice, "salesPrice");
        this.d = i;
        this.e = name;
        this.f = imagePath;
        this.g = d;
        this.h = salesPrice;
        this.i = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderDetailsProductCardData)) {
            return false;
        }
        OrderDetailsProductCardData orderDetailsProductCardData = (OrderDetailsProductCardData) obj;
        return this.d == orderDetailsProductCardData.d && Intrinsics.c(this.e, orderDetailsProductCardData.e) && Intrinsics.c(this.f, orderDetailsProductCardData.f) && Double.compare(this.g, orderDetailsProductCardData.g) == 0 && Intrinsics.c(this.h, orderDetailsProductCardData.h) && Intrinsics.c(this.i, orderDetailsProductCardData.i);
    }

    public final int hashCode() {
        int iC = b.c(a.a(this.g, b.c(b.c(Integer.hashCode(this.d) * 31, 31, this.e), 31, this.f), 31), 31, this.h);
        String str = this.i;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbP = androidx.constraintlayout.core.state.a.p("OrderDetailsProductCardData(stockcode=", this.d, ", name=", this.e, ", imagePath=");
        sbP.append(this.f);
        sbP.append(", quantity=");
        sbP.append(this.g);
        androidx.constraintlayout.core.state.a.B(sbP, ", salesPrice=", this.h, ", pricePerUnit=", this.i);
        sbP.append(")");
        return sbP.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeInt(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeDouble(this.g);
        dest.writeString(this.h);
        dest.writeString(this.i);
    }
}
