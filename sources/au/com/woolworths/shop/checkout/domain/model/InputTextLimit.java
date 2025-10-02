package au.com.woolworths.shop.checkout.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Immutable
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/InputTextLimit;", "Landroid/os/Parcelable;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InputTextLimit implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InputTextLimit> CREATOR = new Creator();
    public final int d;
    public final int e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InputTextLimit> {
        @Override // android.os.Parcelable.Creator
        public final InputTextLimit createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new InputTextLimit(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final InputTextLimit[] newArray(int i) {
            return new InputTextLimit[i];
        }
    }

    public InputTextLimit(int i, int i2) {
        this.d = i;
        this.e = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputTextLimit)) {
            return false;
        }
        InputTextLimit inputTextLimit = (InputTextLimit) obj;
        return this.d == inputTextLimit.d && this.e == inputTextLimit.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + (Integer.hashCode(this.d) * 31);
    }

    public final String toString() {
        return b.j(this.d, this.e, "InputTextLimit(maxLength=", ", warningOffset=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeInt(this.d);
        dest.writeInt(this.e);
    }
}
