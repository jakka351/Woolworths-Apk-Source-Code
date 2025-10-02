package au.com.woolworths.feature.shop.myorders.details.help.models;

import android.os.Parcel;
import android.os.Parcelable;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/help/models/OrderHelpDataList;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrderHelpDataList implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OrderHelpDataList> CREATOR = new Creator();
    public final String d;
    public final String e;
    public final Object f;
    public final List g;
    public final OrderHelpContactTimes h;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderHelpDataList> {
        @Override // android.os.Parcelable.Creator
        public final OrderHelpDataList createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            int iE = 0;
            int iE2 = 0;
            while (iE2 != i) {
                iE2 = a.e(OrderHelpItemData.CREATOR, parcel, arrayList2, iE2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                while (iE != i2) {
                    iE = a.e(OrderHelpItemData.CREATOR, parcel, arrayList, iE, 1);
                }
            }
            return new OrderHelpDataList(string, string2, arrayList2, arrayList, parcel.readInt() != 0 ? OrderHelpContactTimes.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final OrderHelpDataList[] newArray(int i) {
            return new OrderHelpDataList[i];
        }
    }

    public OrderHelpDataList(String str, String str2, List list, List list2, OrderHelpContactTimes orderHelpContactTimes) {
        this.d = str;
        this.e = str2;
        this.f = list;
        this.g = list2;
        this.h = orderHelpContactTimes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderHelpDataList)) {
            return false;
        }
        OrderHelpDataList orderHelpDataList = (OrderHelpDataList) obj;
        return Intrinsics.c(this.d, orderHelpDataList.d) && Intrinsics.c(this.e, orderHelpDataList.e) && this.f.equals(orderHelpDataList.f) && Intrinsics.c(this.g, orderHelpDataList.g) && Intrinsics.c(this.h, orderHelpDataList.h);
    }

    public final int hashCode() {
        String str = this.d;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.e;
        int iE = android.support.v4.media.session.a.e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f);
        List list = this.g;
        int iHashCode2 = (iE + (list == null ? 0 : list.hashCode())) * 31;
        OrderHelpContactTimes orderHelpContactTimes = this.h;
        return iHashCode2 + (orderHelpContactTimes != null ? orderHelpContactTimes.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("OrderHelpDataList(imageUrl=", this.d, ", helpTitle=", this.e, ", items=");
        sbV.append(this.f);
        sbV.append(", helpItems=");
        sbV.append(this.g);
        sbV.append(", contactTimes=");
        sbV.append(this.h);
        sbV.append(")");
        return sbV.toString();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        ?? r0 = this.f;
        dest.writeInt(r0.size());
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            ((OrderHelpItemData) it.next()).writeToParcel(dest, i);
        }
        List list = this.g;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((OrderHelpItemData) it2.next()).writeToParcel(dest, i);
            }
        }
        OrderHelpContactTimes orderHelpContactTimes = this.h;
        if (orderHelpContactTimes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            orderHelpContactTimes.writeToParcel(dest, i);
        }
    }
}
