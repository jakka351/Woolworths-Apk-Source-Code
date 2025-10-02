package au.com.woolworths.feature.shop.myorders.details.models;

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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/StepsToolTip;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StepsToolTip implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StepsToolTip> CREATOR = new Creator();
    public final String d;
    public final List e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StepsToolTip> {
        @Override // android.os.Parcelable.Creator
        public final StepsToolTip createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = a.e(ToolTipStepInfo.CREATOR, parcel, arrayList, iE, 1);
            }
            return new StepsToolTip(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StepsToolTip[] newArray(int i) {
            return new StepsToolTip[i];
        }
    }

    public StepsToolTip(String message, List list) {
        Intrinsics.h(message, "message");
        this.d = message;
        this.e = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepsToolTip)) {
            return false;
        }
        StepsToolTip stepsToolTip = (StepsToolTip) obj;
        return Intrinsics.c(this.d, stepsToolTip.d) && Intrinsics.c(this.e, stepsToolTip.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return au.com.woolworths.android.onesite.a.i("StepsToolTip(message=", this.d, ", stepInfoList=", ")", this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        Iterator itU = au.com.woolworths.android.onesite.a.u(this.e, dest);
        while (itU.hasNext()) {
            ((ToolTipStepInfo) itU.next()).writeToParcel(dest, i);
        }
    }
}
