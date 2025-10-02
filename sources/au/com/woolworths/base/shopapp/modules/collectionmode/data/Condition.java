package au.com.woolworths.base.shopapp.modules.collectionmode.data;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/collectionmode/data/Condition;", "Landroid/os/Parcelable;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Condition implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Condition> CREATOR = new Creator();
    public final String d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Condition> {
        @Override // android.os.Parcelable.Creator
        public final Condition createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new Condition(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Condition[] newArray(int i) {
            return new Condition[i];
        }
    }

    public Condition(String text) {
        Intrinsics.h(text, "text");
        this.d = text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Condition) && Intrinsics.c(this.d, ((Condition) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return a.h("Condition(text=", this.d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
    }
}
