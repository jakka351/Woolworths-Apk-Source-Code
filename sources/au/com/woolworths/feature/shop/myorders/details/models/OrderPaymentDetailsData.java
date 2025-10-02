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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/OrderPaymentDetailsData;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrderPaymentDetailsData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OrderPaymentDetailsData> CREATOR = new Creator();
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final List j;
    public final List k;
    public final String l;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderPaymentDetailsData> {
        @Override // android.os.Parcelable.Creator
        public final OrderPaymentDetailsData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.h(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            int iE = 0;
            int iE2 = 0;
            while (iE2 != i) {
                iE2 = a.e(OrderPaymentDetailsItemData.CREATOR, parcel, arrayList2, iE2, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i2);
            int iE3 = 0;
            while (iE3 != i2) {
                iE3 = a.e(OrderPaymentDetailsItemData.CREATOR, parcel, arrayList3, iE3, 1);
            }
            int i3 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i3);
            int iE4 = 0;
            while (iE4 != i3) {
                iE4 = a.e(OrderPaymentDetailsItemData.CREATOR, parcel, arrayList4, iE4, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i4 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i4);
                int iE5 = 0;
                while (iE5 != i4) {
                    iE5 = a.e(OrderPaymentDetailsItemData.CREATOR, parcel, arrayList5, iE5, 1);
                }
                arrayList = arrayList5;
            }
            int i5 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(i5);
            int iE6 = 0;
            while (iE6 != i5) {
                iE6 = a.e(OrderPaymentDetailsItemData.CREATOR, parcel, arrayList6, iE6, 1);
            }
            int i6 = parcel.readInt();
            ArrayList arrayList7 = new ArrayList(i6);
            int iE7 = 0;
            while (iE7 != i6) {
                iE7 = a.e(OrderPaymentDetailsItemData.CREATOR, parcel, arrayList7, iE7, 1);
            }
            int i7 = parcel.readInt();
            ArrayList arrayList8 = new ArrayList(i7);
            int iE8 = 0;
            while (iE8 != i7) {
                iE8 = a.e(OrderPaymentDetailsItemData.CREATOR, parcel, arrayList8, iE8, 1);
            }
            int i8 = parcel.readInt();
            ArrayList arrayList9 = new ArrayList(i8);
            while (iE != i8) {
                iE = a.e(OrderPaymentDetailsItemData.CREATOR, parcel, arrayList9, iE, 1);
            }
            return new OrderPaymentDetailsData(arrayList2, arrayList3, arrayList4, arrayList, arrayList6, arrayList7, arrayList8, arrayList9, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OrderPaymentDetailsData[] newArray(int i) {
            return new OrderPaymentDetailsData[i];
        }
    }

    public OrderPaymentDetailsData(List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, String str) {
        this.d = list;
        this.e = list2;
        this.f = list3;
        this.g = list4;
        this.h = list5;
        this.i = list6;
        this.j = list7;
        this.k = list8;
        this.l = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderPaymentDetailsData)) {
            return false;
        }
        OrderPaymentDetailsData orderPaymentDetailsData = (OrderPaymentDetailsData) obj;
        return Intrinsics.c(this.d, orderPaymentDetailsData.d) && Intrinsics.c(this.e, orderPaymentDetailsData.e) && Intrinsics.c(this.f, orderPaymentDetailsData.f) && Intrinsics.c(this.g, orderPaymentDetailsData.g) && Intrinsics.c(this.h, orderPaymentDetailsData.h) && Intrinsics.c(this.i, orderPaymentDetailsData.i) && Intrinsics.c(this.j, orderPaymentDetailsData.j) && Intrinsics.c(this.k, orderPaymentDetailsData.k) && Intrinsics.c(this.l, orderPaymentDetailsData.l);
    }

    public final int hashCode() {
        int iD = b.d(b.d(this.d.hashCode() * 31, 31, this.e), 31, this.f);
        List list = this.g;
        int iD2 = b.d(b.d(b.d(b.d((iD + (list == null ? 0 : list.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        String str = this.l;
        return iD2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderPaymentDetailsData(total=");
        sb.append(this.d);
        sb.append(", subTotal=");
        sb.append(this.e);
        sb.append(", marketSubTotal=");
        au.com.woolworths.android.onesite.a.C(sb, this.f, ", savingsAndReward=", this.g, ", paymentMethods=");
        au.com.woolworths.android.onesite.a.C(sb, this.h, ", discounts=", this.i, ", refunds=");
        au.com.woolworths.android.onesite.a.C(sb, this.j, ", refundTotal=", this.k, ", disclaimer=");
        return YU.a.o(sb, this.l, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        Iterator itU = au.com.woolworths.android.onesite.a.u(this.d, dest);
        while (itU.hasNext()) {
            ((OrderPaymentDetailsItemData) itU.next()).writeToParcel(dest, i);
        }
        Iterator itU2 = au.com.woolworths.android.onesite.a.u(this.e, dest);
        while (itU2.hasNext()) {
            ((OrderPaymentDetailsItemData) itU2.next()).writeToParcel(dest, i);
        }
        Iterator itU3 = au.com.woolworths.android.onesite.a.u(this.f, dest);
        while (itU3.hasNext()) {
            ((OrderPaymentDetailsItemData) itU3.next()).writeToParcel(dest, i);
        }
        List list = this.g;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((OrderPaymentDetailsItemData) it.next()).writeToParcel(dest, i);
            }
        }
        Iterator itU4 = au.com.woolworths.android.onesite.a.u(this.h, dest);
        while (itU4.hasNext()) {
            ((OrderPaymentDetailsItemData) itU4.next()).writeToParcel(dest, i);
        }
        Iterator itU5 = au.com.woolworths.android.onesite.a.u(this.i, dest);
        while (itU5.hasNext()) {
            ((OrderPaymentDetailsItemData) itU5.next()).writeToParcel(dest, i);
        }
        Iterator itU6 = au.com.woolworths.android.onesite.a.u(this.j, dest);
        while (itU6.hasNext()) {
            ((OrderPaymentDetailsItemData) itU6.next()).writeToParcel(dest, i);
        }
        Iterator itU7 = au.com.woolworths.android.onesite.a.u(this.k, dest);
        while (itU7.hasNext()) {
            ((OrderPaymentDetailsItemData) itU7.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.l);
    }
}
