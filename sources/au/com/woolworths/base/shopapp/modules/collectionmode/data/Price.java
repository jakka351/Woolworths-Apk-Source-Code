package au.com.woolworths.base.shopapp.modules.collectionmode.data;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/collectionmode/data/Price;", "Lau/com/woolworths/base/shopapp/modules/collectionmode/data/PriceBase;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Price implements PriceBase {

    @NotNull
    public static final Parcelable.Creator<Price> CREATOR = new Creator();
    public final String d;
    public final int e;
    public final String f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Price> {
        @Override // android.os.Parcelable.Creator
        public final Price createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new Price(parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Price[] newArray(int i) {
            return new Price[i];
        }
    }

    public Price(String text, int i, String str) {
        Intrinsics.h(text, "text");
        this.d = text;
        this.e = i;
        this.f = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Price)) {
            return false;
        }
        Price price = (Price) obj;
        return Intrinsics.c(this.d, price.d) && this.e == price.e && Intrinsics.c(this.f, price.f);
    }

    public final int hashCode() {
        int iA = b.a(this.e, this.d.hashCode() * 31, 31);
        String str = this.f;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return a.o(b.u("Price(text=", this.e, this.d, ", value=", ", suffix="), this.f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeInt(this.e);
        dest.writeString(this.f);
    }
}
