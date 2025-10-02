package au.com.woolworths.android.onesite.modules.customviews.itemdividers;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/customviews/itemdividers/Divider;", "Landroid/os/Parcelable;", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Divider implements Parcelable {
    public static final Divider d = new Divider();

    @NotNull
    public static final Parcelable.Creator<Divider> CREATOR = new Creator();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Divider> {
        @Override // android.os.Parcelable.Creator
        public final Divider createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            parcel.readInt();
            return Divider.d;
        }

        @Override // android.os.Parcelable.Creator
        public final Divider[] newArray(int i) {
            return new Divider[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof Divider);
    }

    public final int hashCode() {
        return -1092045635;
    }

    public final String toString() {
        return "Divider";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeInt(1);
    }
}
