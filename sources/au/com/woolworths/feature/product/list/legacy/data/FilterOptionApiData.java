package au.com.woolworths.feature.product.list.legacy.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/data/FilterOptionApiData;", "Landroid/os/Parcelable;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FilterOptionApiData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FilterOptionApiData> CREATOR = new Creator();
    public final String d;
    public final String e;
    public final ArrayList f;
    public final InsetBannerApiData g;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FilterOptionApiData> {
        @Override // android.os.Parcelable.Creator
        public final FilterOptionApiData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = a.e(FilterMenuItemApiData.CREATOR, parcel, arrayList, iE, 1);
            }
            return new FilterOptionApiData(string, string2, arrayList, (InsetBannerApiData) parcel.readParcelable(FilterOptionApiData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FilterOptionApiData[] newArray(int i) {
            return new FilterOptionApiData[i];
        }
    }

    public FilterOptionApiData(String key, String headerTitle, ArrayList arrayList, InsetBannerApiData insetBannerApiData) {
        Intrinsics.h(key, "key");
        Intrinsics.h(headerTitle, "headerTitle");
        this.d = key;
        this.e = headerTitle;
        this.f = arrayList;
        this.g = insetBannerApiData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterOptionApiData)) {
            return false;
        }
        FilterOptionApiData filterOptionApiData = (FilterOptionApiData) obj;
        return Intrinsics.c(this.d, filterOptionApiData.d) && Intrinsics.c(this.e, filterOptionApiData.e) && this.f.equals(filterOptionApiData.f) && Intrinsics.c(this.g, filterOptionApiData.g);
    }

    public final int hashCode() {
        int iB = a.b(b.c(this.d.hashCode() * 31, 31, this.e), 31, this.f);
        InsetBannerApiData insetBannerApiData = this.g;
        return iB + (insetBannerApiData == null ? 0 : insetBannerApiData.hashCode());
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("FilterOptionApiData(key=", this.d, ", headerTitle=", this.e, ", filterItems=");
        sbV.append(this.f);
        sbV.append(", insetBannerApiData=");
        sbV.append(this.g);
        sbV.append(")");
        return sbV.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        ArrayList arrayList = this.f;
        dest.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((FilterMenuItemApiData) it.next()).writeToParcel(dest, i);
        }
        dest.writeParcelable(this.g, i);
    }
}
