package au.com.woolworths.shop.checkout.ui.shopperNote;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/shopperNote/ShopperNoteExtras;", "Landroid/os/Parcelable;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ShopperNoteExtras implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ShopperNoteExtras> CREATOR = new Creator();
    public final String d;
    public final String e;
    public final String f;
    public final Integer g;
    public final double h;
    public final String i;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ShopperNoteExtras> {
        @Override // android.os.Parcelable.Creator
        public final ShopperNoteExtras createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new ShopperNoteExtras(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readDouble(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShopperNoteExtras[] newArray(int i) {
            return new ShopperNoteExtras[i];
        }
    }

    public ShopperNoteExtras(String title, String buttonText, String str, Integer num, double d, String productId) {
        Intrinsics.h(title, "title");
        Intrinsics.h(buttonText, "buttonText");
        Intrinsics.h(productId, "productId");
        this.d = title;
        this.e = buttonText;
        this.f = str;
        this.g = num;
        this.h = d;
        this.i = productId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopperNoteExtras)) {
            return false;
        }
        ShopperNoteExtras shopperNoteExtras = (ShopperNoteExtras) obj;
        return Intrinsics.c(this.d, shopperNoteExtras.d) && Intrinsics.c(this.e, shopperNoteExtras.e) && Intrinsics.c(this.f, shopperNoteExtras.f) && Intrinsics.c(this.g, shopperNoteExtras.g) && Double.compare(this.h, shopperNoteExtras.h) == 0 && Intrinsics.c(this.i, shopperNoteExtras.i);
    }

    public final int hashCode() {
        int iC = b.c(this.d.hashCode() * 31, 31, this.e);
        String str = this.f;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.g;
        return this.i.hashCode() + a.a(this.h, (iHashCode + (num != null ? num.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("ShopperNoteExtras(title=", this.d, ", buttonText=", this.e, ", text=");
        sbV.append(this.f);
        sbV.append(", inputMaxLength=");
        sbV.append(this.g);
        sbV.append(", quantity=");
        sbV.append(this.h);
        sbV.append(", productId=");
        sbV.append(this.i);
        sbV.append(")");
        return sbV.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        int iIntValue;
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        Integer num = this.g;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeDouble(this.h);
        dest.writeString(this.i);
    }
}
