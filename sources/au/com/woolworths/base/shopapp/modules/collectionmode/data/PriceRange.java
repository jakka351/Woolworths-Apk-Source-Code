package au.com.woolworths.base.shopapp.modules.collectionmode.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/collectionmode/data/PriceRange;", "Lau/com/woolworths/base/shopapp/modules/collectionmode/data/PriceBase;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PriceRange implements PriceBase {

    @NotNull
    public static final Parcelable.Creator<PriceRange> CREATOR = new Creator();
    public final String d;
    public final int e;
    public final int f;
    public final String g;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PriceRange> {
        @Override // android.os.Parcelable.Creator
        public final PriceRange createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new PriceRange(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PriceRange[] newArray(int i) {
            return new PriceRange[i];
        }
    }

    public PriceRange(String text, int i, int i2, String str) {
        Intrinsics.h(text, "text");
        this.d = text;
        this.e = i;
        this.f = i2;
        this.g = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceRange)) {
            return false;
        }
        PriceRange priceRange = (PriceRange) obj;
        return Intrinsics.c(this.d, priceRange.d) && this.e == priceRange.e && this.f == priceRange.f && Intrinsics.c(this.g, priceRange.g);
    }

    public final int hashCode() {
        int iA = b.a(this.f, b.a(this.e, this.d.hashCode() * 31, 31), 31);
        String str = this.g;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbU = b.u("PriceRange(text=", this.e, this.d, ", min=", ", max=");
        sbU.append(this.f);
        sbU.append(", suffix=");
        sbU.append(this.g);
        sbU.append(")");
        return sbU.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeInt(this.e);
        dest.writeInt(this.f);
        dest.writeString(this.g);
    }
}
