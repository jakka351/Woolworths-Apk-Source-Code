package au.com.woolworths.feature.shop.myorders.details.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/MyGroceriesProductListBadge;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MyGroceriesProductListBadge implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MyGroceriesProductListBadge> CREATOR = new Creator();
    public final MyGroceriesProductListBadgeType d;
    public final String e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MyGroceriesProductListBadge> {
        @Override // android.os.Parcelable.Creator
        public final MyGroceriesProductListBadge createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new MyGroceriesProductListBadge(MyGroceriesProductListBadgeType.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MyGroceriesProductListBadge[] newArray(int i) {
            return new MyGroceriesProductListBadge[i];
        }
    }

    public MyGroceriesProductListBadge(MyGroceriesProductListBadgeType type, String label) {
        Intrinsics.h(type, "type");
        Intrinsics.h(label, "label");
        this.d = type;
        this.e = label;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyGroceriesProductListBadge)) {
            return false;
        }
        MyGroceriesProductListBadge myGroceriesProductListBadge = (MyGroceriesProductListBadge) obj;
        return this.d == myGroceriesProductListBadge.d && Intrinsics.c(this.e, myGroceriesProductListBadge.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "MyGroceriesProductListBadge(type=" + this.d + ", label=" + this.e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d.name());
        dest.writeString(this.e);
    }
}
