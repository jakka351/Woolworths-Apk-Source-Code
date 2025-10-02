package au.com.woolworths.feature.shop.myorders.details.models;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/BayNumberPreferences;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BayNumberPreferences implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BayNumberPreferences> CREATOR = new Creator();
    public final String d;
    public final String e;
    public final List f;
    public final ButtonApiData g;
    public final ButtonApiData h;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BayNumberPreferences> {
        @Override // android.os.Parcelable.Creator
        public final BayNumberPreferences createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new BayNumberPreferences(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), (ButtonApiData) parcel.readParcelable(BayNumberPreferences.class.getClassLoader()), (ButtonApiData) parcel.readParcelable(BayNumberPreferences.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BayNumberPreferences[] newArray(int i) {
            return new BayNumberPreferences[i];
        }
    }

    public BayNumberPreferences(String title, String subtitle, List bayNumber, ButtonApiData confirmButton, ButtonApiData bayNumberUnknownButton) {
        Intrinsics.h(title, "title");
        Intrinsics.h(subtitle, "subtitle");
        Intrinsics.h(bayNumber, "bayNumber");
        Intrinsics.h(confirmButton, "confirmButton");
        Intrinsics.h(bayNumberUnknownButton, "bayNumberUnknownButton");
        this.d = title;
        this.e = subtitle;
        this.f = bayNumber;
        this.g = confirmButton;
        this.h = bayNumberUnknownButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BayNumberPreferences)) {
            return false;
        }
        BayNumberPreferences bayNumberPreferences = (BayNumberPreferences) obj;
        return Intrinsics.c(this.d, bayNumberPreferences.d) && Intrinsics.c(this.e, bayNumberPreferences.e) && Intrinsics.c(this.f, bayNumberPreferences.f) && Intrinsics.c(this.g, bayNumberPreferences.g) && Intrinsics.c(this.h, bayNumberPreferences.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + b.d(b.c(this.d.hashCode() * 31, 31, this.e), 31, this.f)) * 31);
    }

    public final String toString() {
        StringBuilder sbV = a.v("BayNumberPreferences(title=", this.d, ", subtitle=", this.e, ", bayNumber=");
        sbV.append(this.f);
        sbV.append(", confirmButton=");
        sbV.append(this.g);
        sbV.append(", bayNumberUnknownButton=");
        sbV.append(this.h);
        sbV.append(")");
        return sbV.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeStringList(this.f);
        dest.writeParcelable(this.g, i);
        dest.writeParcelable(this.h, i);
    }
}
