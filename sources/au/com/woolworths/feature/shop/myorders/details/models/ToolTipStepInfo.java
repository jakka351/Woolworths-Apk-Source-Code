package au.com.woolworths.feature.shop.myorders.details.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/ToolTipStepInfo;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ToolTipStepInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ToolTipStepInfo> CREATOR = new Creator();
    public final int d;
    public final boolean e;
    public final Boolean f;
    public final String g;
    public final String h;
    public final String i;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ToolTipStepInfo> {
        @Override // android.os.Parcelable.Creator
        public final ToolTipStepInfo createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            Intrinsics.h(parcel, "parcel");
            int i = parcel.readInt();
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new ToolTipStepInfo(i, z2, boolValueOf, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ToolTipStepInfo[] newArray(int i) {
            return new ToolTipStepInfo[i];
        }
    }

    public ToolTipStepInfo(int i, boolean z, Boolean bool, String title, String str, String str2) {
        Intrinsics.h(title, "title");
        this.d = i;
        this.e = z;
        this.f = bool;
        this.g = title;
        this.h = str;
        this.i = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToolTipStepInfo)) {
            return false;
        }
        ToolTipStepInfo toolTipStepInfo = (ToolTipStepInfo) obj;
        return this.d == toolTipStepInfo.d && this.e == toolTipStepInfo.e && Intrinsics.c(this.f, toolTipStepInfo.f) && Intrinsics.c(this.g, toolTipStepInfo.g) && Intrinsics.c(this.h, toolTipStepInfo.h) && Intrinsics.c(this.i, toolTipStepInfo.i);
    }

    public final int hashCode() {
        int iE = b.e(Integer.hashCode(this.d) * 31, 31, this.e);
        Boolean bool = this.f;
        int iC = b.c((iE + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.g);
        String str = this.h;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToolTipStepInfo(number=");
        sb.append(this.d);
        sb.append(", isCompleted=");
        sb.append(this.e);
        sb.append(", isNextProgressed=");
        sb.append(this.f);
        sb.append(", title=");
        sb.append(this.g);
        sb.append(", description=");
        return a.l(sb, this.h, ", stepIconUrl=", this.i, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        int iBooleanValue;
        Intrinsics.h(dest, "dest");
        dest.writeInt(this.d);
        dest.writeInt(this.e ? 1 : 0);
        Boolean bool = this.f;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            dest.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        dest.writeInt(iBooleanValue);
        dest.writeString(this.g);
        dest.writeString(this.h);
        dest.writeString(this.i);
    }
}
