package au.com.woolworths.feature.product.list.legacy.data;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/data/SortOption;", "Landroid/os/Parcelable;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SortOption implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SortOption> CREATOR = new Creator();
    public final String d;
    public final String e;
    public final String f;
    public boolean g;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SortOption> {
        @Override // android.os.Parcelable.Creator
        public final SortOption createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new SortOption(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SortOption[] newArray(int i) {
            return new SortOption[i];
        }
    }

    public SortOption(String id, String title, String str, boolean z) {
        Intrinsics.h(id, "id");
        Intrinsics.h(title, "title");
        this.d = id;
        this.e = title;
        this.f = str;
        this.g = z;
    }

    public static SortOption a(SortOption sortOption, boolean z, int i) {
        String id = sortOption.d;
        String title = sortOption.e;
        String str = sortOption.f;
        if ((i & 8) != 0) {
            z = sortOption.g;
        }
        sortOption.getClass();
        Intrinsics.h(id, "id");
        Intrinsics.h(title, "title");
        return new SortOption(id, title, str, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SortOption)) {
            return false;
        }
        SortOption sortOption = (SortOption) obj;
        return Intrinsics.c(this.d, sortOption.d) && Intrinsics.c(this.e, sortOption.e) && Intrinsics.c(this.f, sortOption.f) && this.g == sortOption.g;
    }

    public final int hashCode() {
        int iC = b.c(this.d.hashCode() * 31, 31, this.e);
        String str = this.f;
        return Boolean.hashCode(this.g) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        boolean z = this.g;
        return d.r(this.f, ", isApplied=", ")", a.v("SortOption(id=", this.d, ", title=", this.e, ", subtitle="), z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeInt(this.g ? 1 : 0);
    }
}
