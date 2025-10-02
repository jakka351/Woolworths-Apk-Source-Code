package au.com.woolworths.feature.shop.myorders.details.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Parcelize
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/OrderPaymentDetailsAmountItemIcon;", "Landroid/os/Parcelable;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrderPaymentDetailsAmountItemIcon implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OrderPaymentDetailsAmountItemIcon> CREATOR;
    public static final OrderPaymentDetailsAmountItemIcon e;
    public static final OrderPaymentDetailsAmountItemIcon f;
    public static final /* synthetic */ OrderPaymentDetailsAmountItemIcon[] g;
    public static final /* synthetic */ EnumEntries h;
    public final int d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderPaymentDetailsAmountItemIcon> {
        @Override // android.os.Parcelable.Creator
        public final OrderPaymentDetailsAmountItemIcon createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return OrderPaymentDetailsAmountItemIcon.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OrderPaymentDetailsAmountItemIcon[] newArray(int i) {
            return new OrderPaymentDetailsAmountItemIcon[i];
        }
    }

    static {
        OrderPaymentDetailsAmountItemIcon orderPaymentDetailsAmountItemIcon = new OrderPaymentDetailsAmountItemIcon("REWARDS_ICON", 0, R.drawable.ic_payment_amounts_reward_outline);
        e = orderPaymentDetailsAmountItemIcon;
        OrderPaymentDetailsAmountItemIcon orderPaymentDetailsAmountItemIcon2 = new OrderPaymentDetailsAmountItemIcon("UNKNOWN", 1, 0);
        f = orderPaymentDetailsAmountItemIcon2;
        OrderPaymentDetailsAmountItemIcon[] orderPaymentDetailsAmountItemIconArr = {orderPaymentDetailsAmountItemIcon, orderPaymentDetailsAmountItemIcon2};
        g = orderPaymentDetailsAmountItemIconArr;
        h = EnumEntriesKt.a(orderPaymentDetailsAmountItemIconArr);
        CREATOR = new Creator();
    }

    public OrderPaymentDetailsAmountItemIcon(String str, int i, int i2) {
        this.d = i2;
    }

    public static OrderPaymentDetailsAmountItemIcon valueOf(String str) {
        return (OrderPaymentDetailsAmountItemIcon) Enum.valueOf(OrderPaymentDetailsAmountItemIcon.class, str);
    }

    public static OrderPaymentDetailsAmountItemIcon[] values() {
        return (OrderPaymentDetailsAmountItemIcon[]) g.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(name());
    }
}
