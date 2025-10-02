package au.com.woolworths.feature.shop.myorders.details.help.models;

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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/help/models/OrderHelpContactTimes;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrderHelpContactTimes implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OrderHelpContactTimes> CREATOR = new Creator();
    public final String d;
    public final String e;
    public final List f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderHelpContactTimes> {
        @Override // android.os.Parcelable.Creator
        public final OrderHelpContactTimes createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = a.e(ContactItem.CREATOR, parcel, arrayList, iE, 1);
            }
            return new OrderHelpContactTimes(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final OrderHelpContactTimes[] newArray(int i) {
            return new OrderHelpContactTimes[i];
        }
    }

    public OrderHelpContactTimes(String title, String subTitle, List list) {
        Intrinsics.h(title, "title");
        Intrinsics.h(subTitle, "subTitle");
        this.d = title;
        this.e = subTitle;
        this.f = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderHelpContactTimes)) {
            return false;
        }
        OrderHelpContactTimes orderHelpContactTimes = (OrderHelpContactTimes) obj;
        return Intrinsics.c(this.d, orderHelpContactTimes.d) && Intrinsics.c(this.e, orderHelpContactTimes.e) && Intrinsics.c(this.f, orderHelpContactTimes.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + b.c(this.d.hashCode() * 31, 31, this.e);
    }

    public final String toString() {
        return android.support.v4.media.session.a.t(YU.a.v("OrderHelpContactTimes(title=", this.d, ", subTitle=", this.e, ", contactItems="), this.f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        Iterator itU = au.com.woolworths.android.onesite.a.u(this.f, dest);
        while (itU.hasNext()) {
            ((ContactItem) itU.next()).writeToParcel(dest, i);
        }
    }
}
