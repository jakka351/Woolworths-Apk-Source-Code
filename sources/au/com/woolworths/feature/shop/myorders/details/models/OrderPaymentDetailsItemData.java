package au.com.woolworths.feature.shop.myorders.details.models;

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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/OrderPaymentDetailsItemData;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrderPaymentDetailsItemData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OrderPaymentDetailsItemData> CREATOR = new Creator();
    public final String d;
    public final OrderPaymentDetailsItemIcon e;
    public final String f;
    public final OrderPaymentDetailsAmountItemIcon g;
    public final OrderPaymentDetailsItemAmountStyle h;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderPaymentDetailsItemData> {
        @Override // android.os.Parcelable.Creator
        public final OrderPaymentDetailsItemData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new OrderPaymentDetailsItemData(parcel.readString(), parcel.readInt() == 0 ? null : OrderPaymentDetailsItemIcon.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : OrderPaymentDetailsAmountItemIcon.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? OrderPaymentDetailsItemAmountStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final OrderPaymentDetailsItemData[] newArray(int i) {
            return new OrderPaymentDetailsItemData[i];
        }
    }

    public OrderPaymentDetailsItemData(String title, OrderPaymentDetailsItemIcon orderPaymentDetailsItemIcon, String amount, OrderPaymentDetailsAmountItemIcon orderPaymentDetailsAmountItemIcon, OrderPaymentDetailsItemAmountStyle orderPaymentDetailsItemAmountStyle) {
        Intrinsics.h(title, "title");
        Intrinsics.h(amount, "amount");
        this.d = title;
        this.e = orderPaymentDetailsItemIcon;
        this.f = amount;
        this.g = orderPaymentDetailsAmountItemIcon;
        this.h = orderPaymentDetailsItemAmountStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderPaymentDetailsItemData)) {
            return false;
        }
        OrderPaymentDetailsItemData orderPaymentDetailsItemData = (OrderPaymentDetailsItemData) obj;
        return Intrinsics.c(this.d, orderPaymentDetailsItemData.d) && this.e == orderPaymentDetailsItemData.e && Intrinsics.c(this.f, orderPaymentDetailsItemData.f) && this.g == orderPaymentDetailsItemData.g && this.h == orderPaymentDetailsItemData.h;
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        OrderPaymentDetailsItemIcon orderPaymentDetailsItemIcon = this.e;
        int iC = b.c((iHashCode + (orderPaymentDetailsItemIcon == null ? 0 : orderPaymentDetailsItemIcon.hashCode())) * 31, 31, this.f);
        OrderPaymentDetailsAmountItemIcon orderPaymentDetailsAmountItemIcon = this.g;
        int iHashCode2 = (iC + (orderPaymentDetailsAmountItemIcon == null ? 0 : orderPaymentDetailsAmountItemIcon.hashCode())) * 31;
        OrderPaymentDetailsItemAmountStyle orderPaymentDetailsItemAmountStyle = this.h;
        return iHashCode2 + (orderPaymentDetailsItemAmountStyle != null ? orderPaymentDetailsItemAmountStyle.hashCode() : 0);
    }

    public final String toString() {
        return "OrderPaymentDetailsItemData(title=" + this.d + ", icon=" + this.e + ", amount=" + this.f + ", amountIcon=" + this.g + ", amountStyle=" + this.h + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        OrderPaymentDetailsItemIcon orderPaymentDetailsItemIcon = this.e;
        if (orderPaymentDetailsItemIcon == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(orderPaymentDetailsItemIcon.name());
        }
        dest.writeString(this.f);
        OrderPaymentDetailsAmountItemIcon orderPaymentDetailsAmountItemIcon = this.g;
        if (orderPaymentDetailsAmountItemIcon == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            orderPaymentDetailsAmountItemIcon.writeToParcel(dest, i);
        }
        OrderPaymentDetailsItemAmountStyle orderPaymentDetailsItemAmountStyle = this.h;
        if (orderPaymentDetailsItemAmountStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            orderPaymentDetailsItemAmountStyle.writeToParcel(dest, i);
        }
    }
}
