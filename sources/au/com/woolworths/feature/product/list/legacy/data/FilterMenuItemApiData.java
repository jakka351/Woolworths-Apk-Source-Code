package au.com.woolworths.feature.product.list.legacy.data;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/data/FilterMenuItemApiData;", "Landroid/os/Parcelable;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FilterMenuItemApiData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FilterMenuItemApiData> CREATOR = new Creator();
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FilterMenuItemApiData> {
        @Override // android.os.Parcelable.Creator
        public final FilterMenuItemApiData createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            return new FilterMenuItemApiData(string, string2, string3, string4, z2, parcel.readInt() == 0 ? z : true);
        }

        @Override // android.os.Parcelable.Creator
        public final FilterMenuItemApiData[] newArray(int i) {
            return new FilterMenuItemApiData[i];
        }
    }

    public FilterMenuItemApiData(String key, String title, String displayLabel, String str, boolean z, boolean z2) {
        Intrinsics.h(key, "key");
        Intrinsics.h(title, "title");
        Intrinsics.h(displayLabel, "displayLabel");
        this.d = key;
        this.e = title;
        this.f = displayLabel;
        this.g = str;
        this.h = z;
        this.i = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterMenuItemApiData)) {
            return false;
        }
        FilterMenuItemApiData filterMenuItemApiData = (FilterMenuItemApiData) obj;
        return Intrinsics.c(this.d, filterMenuItemApiData.d) && Intrinsics.c(this.e, filterMenuItemApiData.e) && Intrinsics.c(this.f, filterMenuItemApiData.f) && Intrinsics.c(this.g, filterMenuItemApiData.g) && this.h == filterMenuItemApiData.h && this.i == filterMenuItemApiData.i;
    }

    public final int hashCode() {
        int iC = b.c(b.c(this.d.hashCode() * 31, 31, this.e), 31, this.f);
        String str = this.g;
        return Boolean.hashCode(this.i) + b.e((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sbV = a.v("FilterMenuItemApiData(key=", this.d, ", title=", this.e, ", displayLabel=");
        androidx.constraintlayout.core.state.a.B(sbV, this.f, ", parentKey=", this.g, ", hasChildren=");
        return au.com.woolworths.android.onesite.a.q(sbV, this.h, ", isApplied=", this.i, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.g);
        dest.writeInt(this.h ? 1 : 0);
        dest.writeInt(this.i ? 1 : 0);
    }
}
