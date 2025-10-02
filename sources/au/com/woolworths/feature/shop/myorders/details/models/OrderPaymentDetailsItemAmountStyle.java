package au.com.woolworths.feature.shop.myorders.details.models;

import android.R;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Parcelize
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/OrderPaymentDetailsItemAmountStyle;", "Landroid/os/Parcelable;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrderPaymentDetailsItemAmountStyle implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OrderPaymentDetailsItemAmountStyle> CREATOR;
    public static final OrderPaymentDetailsItemAmountStyle e;
    public static final OrderPaymentDetailsItemAmountStyle f;
    public static final OrderPaymentDetailsItemAmountStyle g;
    public static final /* synthetic */ OrderPaymentDetailsItemAmountStyle[] h;
    public static final /* synthetic */ EnumEntries i;
    public final int d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderPaymentDetailsItemAmountStyle> {
        @Override // android.os.Parcelable.Creator
        public final OrderPaymentDetailsItemAmountStyle createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return OrderPaymentDetailsItemAmountStyle.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OrderPaymentDetailsItemAmountStyle[] newArray(int i) {
            return new OrderPaymentDetailsItemAmountStyle[i];
        }
    }

    static {
        OrderPaymentDetailsItemAmountStyle orderPaymentDetailsItemAmountStyle = new OrderPaymentDetailsItemAmountStyle("PLAIN", 0, R.attr.textColorPrimary);
        e = orderPaymentDetailsItemAmountStyle;
        OrderPaymentDetailsItemAmountStyle orderPaymentDetailsItemAmountStyle2 = new OrderPaymentDetailsItemAmountStyle("ALWAYS", 1, com.woolworths.R.attr.colorBrandAlways);
        f = orderPaymentDetailsItemAmountStyle2;
        OrderPaymentDetailsItemAmountStyle orderPaymentDetailsItemAmountStyle3 = new OrderPaymentDetailsItemAmountStyle("REWARDS", 2, com.woolworths.R.attr.colorBrandRewards);
        g = orderPaymentDetailsItemAmountStyle3;
        OrderPaymentDetailsItemAmountStyle[] orderPaymentDetailsItemAmountStyleArr = {orderPaymentDetailsItemAmountStyle, orderPaymentDetailsItemAmountStyle2, orderPaymentDetailsItemAmountStyle3};
        h = orderPaymentDetailsItemAmountStyleArr;
        i = EnumEntriesKt.a(orderPaymentDetailsItemAmountStyleArr);
        CREATOR = new Creator();
    }

    public OrderPaymentDetailsItemAmountStyle(String str, int i2, int i3) {
        this.d = i3;
    }

    public static OrderPaymentDetailsItemAmountStyle valueOf(String str) {
        return (OrderPaymentDetailsItemAmountStyle) Enum.valueOf(OrderPaymentDetailsItemAmountStyle.class, str);
    }

    public static OrderPaymentDetailsItemAmountStyle[] values() {
        return (OrderPaymentDetailsItemAmountStyle[]) h.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i2) {
        Intrinsics.h(dest, "dest");
        dest.writeString(name());
    }
}
