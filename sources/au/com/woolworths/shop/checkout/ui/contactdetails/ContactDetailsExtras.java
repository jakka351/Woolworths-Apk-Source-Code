package au.com.woolworths.shop.checkout.ui.contactdetails;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/contactdetails/ContactDetailsExtras;", "Landroid/os/Parcelable;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ContactDetailsExtras implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ContactDetailsExtras> CREATOR = new Creator();
    public final String d;
    public final String e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ContactDetailsExtras> {
        @Override // android.os.Parcelable.Creator
        public final ContactDetailsExtras createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new ContactDetailsExtras(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ContactDetailsExtras[] newArray(int i) {
            return new ContactDetailsExtras[i];
        }
    }

    public ContactDetailsExtras(String placeholder, String str) {
        Intrinsics.h(placeholder, "placeholder");
        this.d = placeholder;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactDetailsExtras)) {
            return false;
        }
        ContactDetailsExtras contactDetailsExtras = (ContactDetailsExtras) obj;
        return Intrinsics.c(this.d, contactDetailsExtras.d) && Intrinsics.c(this.e, contactDetailsExtras.e);
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        String str = this.e;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return a.j("ContactDetailsExtras(placeholder=", this.d, ", phoneNumber=", this.e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}
