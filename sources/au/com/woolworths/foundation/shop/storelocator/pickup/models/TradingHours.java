package au.com.woolworths.foundation.shop.storelocator.pickup.models;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/storelocator/pickup/models/TradingHours;", "Landroid/os/Parcelable;", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TradingHours implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TradingHours> CREATOR = new Creator();
    public final String d;
    public final String e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TradingHours> {
        @Override // android.os.Parcelable.Creator
        public final TradingHours createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new TradingHours(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TradingHours[] newArray(int i) {
            return new TradingHours[i];
        }
    }

    public TradingHours(String day, String openHour) {
        Intrinsics.h(day, "day");
        Intrinsics.h(openHour, "openHour");
        this.d = day;
        this.e = openHour;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradingHours)) {
            return false;
        }
        TradingHours tradingHours = (TradingHours) obj;
        return Intrinsics.c(this.d, tradingHours.d) && Intrinsics.c(this.e, tradingHours.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return a.j("TradingHours(day=", this.d, ", openHour=", this.e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}
