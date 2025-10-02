package au.com.woolworths.shop.addtolist.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/models/CopyFromListParameters;", "Landroid/os/Parcelable;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CopyFromListParameters implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CopyFromListParameters> CREATOR = new Creator();
    public final String d;
    public final float e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CopyFromListParameters> {
        @Override // android.os.Parcelable.Creator
        public final CopyFromListParameters createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new CopyFromListParameters(parcel.readString(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final CopyFromListParameters[] newArray(int i) {
            return new CopyFromListParameters[i];
        }
    }

    public CopyFromListParameters(String listId, float f) {
        Intrinsics.h(listId, "listId");
        this.d = listId;
        this.e = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CopyFromListParameters)) {
            return false;
        }
        CopyFromListParameters copyFromListParameters = (CopyFromListParameters) obj;
        return Intrinsics.c(this.d, copyFromListParameters.d) && Float.compare(this.e, copyFromListParameters.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "CopyFromListParameters(listId=" + this.d + ", quantity=" + this.e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeFloat(this.e);
    }
}
