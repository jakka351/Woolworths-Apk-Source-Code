package au.com.woolworths.feature.shop.myorders.details.models;

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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/OrderCancelWarning;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrderCancelWarning implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OrderCancelWarning> CREATOR = new Creator();
    public final String d;
    public final String e;
    public final String f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderCancelWarning> {
        @Override // android.os.Parcelable.Creator
        public final OrderCancelWarning createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new OrderCancelWarning(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OrderCancelWarning[] newArray(int i) {
            return new OrderCancelWarning[i];
        }
    }

    public OrderCancelWarning(String title, String subtitle, String message) {
        Intrinsics.h(title, "title");
        Intrinsics.h(subtitle, "subtitle");
        Intrinsics.h(message, "message");
        this.d = title;
        this.e = subtitle;
        this.f = message;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderCancelWarning)) {
            return false;
        }
        OrderCancelWarning orderCancelWarning = (OrderCancelWarning) obj;
        return Intrinsics.c(this.d, orderCancelWarning.d) && Intrinsics.c(this.e, orderCancelWarning.e) && Intrinsics.c(this.f, orderCancelWarning.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + b.c(this.d.hashCode() * 31, 31, this.e);
    }

    public final String toString() {
        return a.o(a.v("OrderCancelWarning(title=", this.d, ", subtitle=", this.e, ", message="), this.f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
    }
}
