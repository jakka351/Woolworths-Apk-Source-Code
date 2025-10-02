package au.com.woolworths.feature.product.list.ui;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.product.list.data.FilterInsetBannerData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ui/FilterOption;", "Landroid/os/Parcelable;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FilterOption implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FilterOption> CREATOR = new Creator();
    public final String d;
    public final String e;
    public final List f;
    public int g;
    public final FilterInsetBannerData h;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FilterOption> {
        @Override // android.os.Parcelable.Creator
        public final FilterOption createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = androidx.compose.ui.input.pointer.a.e(FilterMenuItem.CREATOR, parcel, arrayList, iE, 1);
            }
            return new FilterOption(string, string2, arrayList, parcel.readInt(), parcel.readInt() == 0 ? null : FilterInsetBannerData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final FilterOption[] newArray(int i) {
            return new FilterOption[i];
        }
    }

    public FilterOption(String key, String headerTitle, List list, int i, FilterInsetBannerData filterInsetBannerData) {
        Intrinsics.h(key, "key");
        Intrinsics.h(headerTitle, "headerTitle");
        this.d = key;
        this.e = headerTitle;
        this.f = list;
        this.g = i;
        this.h = filterInsetBannerData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterOption)) {
            return false;
        }
        FilterOption filterOption = (FilterOption) obj;
        return Intrinsics.c(this.d, filterOption.d) && Intrinsics.c(this.e, filterOption.e) && Intrinsics.c(this.f, filterOption.f) && this.g == filterOption.g && Intrinsics.c(this.h, filterOption.h);
    }

    public final int hashCode() {
        int iA = b.a(this.g, b.d(b.c(this.d.hashCode() * 31, 31, this.e), 31, this.f), 31);
        FilterInsetBannerData filterInsetBannerData = this.h;
        return iA + (filterInsetBannerData == null ? 0 : filterInsetBannerData.hashCode());
    }

    public final String toString() {
        int i = this.g;
        StringBuilder sbV = YU.a.v("FilterOption(key=", this.d, ", headerTitle=", this.e, ", filterItems=");
        sbV.append(this.f);
        sbV.append(", activeFilterCount=");
        sbV.append(i);
        sbV.append(", insetBanner=");
        sbV.append(this.h);
        sbV.append(")");
        return sbV.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        Iterator itU = au.com.woolworths.android.onesite.a.u(this.f, dest);
        while (itU.hasNext()) {
            ((FilterMenuItem) itU.next()).writeToParcel(dest, i);
        }
        dest.writeInt(this.g);
        FilterInsetBannerData filterInsetBannerData = this.h;
        if (filterInsetBannerData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            filterInsetBannerData.writeToParcel(dest, i);
        }
    }
}
