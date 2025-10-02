package au.com.woolworths.feature.product.list.legacy.ui;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ui/FilterMenuItem;", "Landroid/os/Parcelable;", "Lau/com/woolworths/feature/product/list/legacy/ui/ChildFilterItem;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FilterMenuItem implements Parcelable, ChildFilterItem {

    @NotNull
    public static final Parcelable.Creator<FilterMenuItem> CREATOR = new Creator();
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public ToggleableState i;
    public int j;
    public final String k;
    public final String l;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FilterMenuItem> {
        @Override // android.os.Parcelable.Creator
        public final FilterMenuItem createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new FilterMenuItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, ToggleableState.valueOf(parcel.readString()), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FilterMenuItem[] newArray(int i) {
            return new FilterMenuItem[i];
        }
    }

    public FilterMenuItem(String key, String title, String displayLabel, String parentKey, boolean z, ToggleableState checkBoxState, int i, String normalisedKey, String normalisedParentKey) {
        Intrinsics.h(key, "key");
        Intrinsics.h(title, "title");
        Intrinsics.h(displayLabel, "displayLabel");
        Intrinsics.h(parentKey, "parentKey");
        Intrinsics.h(checkBoxState, "checkBoxState");
        Intrinsics.h(normalisedKey, "normalisedKey");
        Intrinsics.h(normalisedParentKey, "normalisedParentKey");
        this.d = key;
        this.e = title;
        this.f = displayLabel;
        this.g = parentKey;
        this.h = z;
        this.i = checkBoxState;
        this.j = i;
        this.k = normalisedKey;
        this.l = normalisedParentKey;
    }

    public static FilterMenuItem a(FilterMenuItem filterMenuItem) {
        String key = filterMenuItem.d;
        String title = filterMenuItem.e;
        String displayLabel = filterMenuItem.f;
        String parentKey = filterMenuItem.g;
        boolean z = filterMenuItem.h;
        ToggleableState checkBoxState = filterMenuItem.i;
        int i = filterMenuItem.j;
        String normalisedKey = filterMenuItem.k;
        String normalisedParentKey = filterMenuItem.l;
        filterMenuItem.getClass();
        Intrinsics.h(key, "key");
        Intrinsics.h(title, "title");
        Intrinsics.h(displayLabel, "displayLabel");
        Intrinsics.h(parentKey, "parentKey");
        Intrinsics.h(checkBoxState, "checkBoxState");
        Intrinsics.h(normalisedKey, "normalisedKey");
        Intrinsics.h(normalisedParentKey, "normalisedParentKey");
        return new FilterMenuItem(key, title, displayLabel, parentKey, z, checkBoxState, i, normalisedKey, normalisedParentKey);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterMenuItem)) {
            return false;
        }
        FilterMenuItem filterMenuItem = (FilterMenuItem) obj;
        return Intrinsics.c(this.d, filterMenuItem.d) && Intrinsics.c(this.e, filterMenuItem.e) && Intrinsics.c(this.f, filterMenuItem.f) && Intrinsics.c(this.g, filterMenuItem.g) && this.h == filterMenuItem.h && this.i == filterMenuItem.i && this.j == filterMenuItem.j && Intrinsics.c(this.k, filterMenuItem.k) && Intrinsics.c(this.l, filterMenuItem.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + b.c(b.a(this.j, (this.i.hashCode() + b.e(b.c(b.c(b.c(this.d.hashCode() * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31, 31), 31, this.k);
    }

    public final String toString() {
        ToggleableState toggleableState = this.i;
        int i = this.j;
        StringBuilder sbV = YU.a.v("FilterMenuItem(key=", this.d, ", title=", this.e, ", displayLabel=");
        androidx.constraintlayout.core.state.a.B(sbV, this.f, ", parentKey=", this.g, ", hasChildren=");
        sbV.append(this.h);
        sbV.append(", checkBoxState=");
        sbV.append(toggleableState);
        sbV.append(", activeFilterCount=");
        androidx.compose.ui.input.pointer.a.u(i, ", normalisedKey=", this.k, ", normalisedParentKey=", sbV);
        return YU.a.o(sbV, this.l, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.g);
        dest.writeInt(this.h ? 1 : 0);
        dest.writeString(this.i.name());
        dest.writeInt(this.j);
        dest.writeString(this.k);
        dest.writeString(this.l);
    }
}
