package au.com.woolworths.feature.product.list.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.graphql.MappedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006%"}, d2 = {"Lau/com/woolworths/feature/product/list/data/FilterOptionApiData;", "Landroid/os/Parcelable;", "key", "", "headerTitle", "filterItems", "", "Lau/com/woolworths/feature/product/list/data/FilterMenuItemApiData;", "insetBannerApiData", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;)V", "getKey", "()Ljava/lang/String;", "getHeaderTitle", "getFilterItems", "()Ljava/util/List;", "getInsetBannerApiData", "()Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FilterOptionApiData implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<FilterOptionApiData> CREATOR = new Creator();

    @NotNull
    private final List<FilterMenuItemApiData> filterItems;

    @NotNull
    private final String headerTitle;

    @MappedName
    @Nullable
    private final InsetBannerApiData insetBannerApiData;

    @MappedName
    @NotNull
    private final String key;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FilterOptionApiData> {
        /* JADX WARN: Can't rename method to resolve collision */
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

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilterOptionApiData[] newArray(int i) {
            return new FilterOptionApiData[i];
        }
    }

    public FilterOptionApiData(@NotNull String key, @NotNull String headerTitle, @NotNull List<FilterMenuItemApiData> filterItems, @Nullable InsetBannerApiData insetBannerApiData) {
        Intrinsics.h(key, "key");
        Intrinsics.h(headerTitle, "headerTitle");
        Intrinsics.h(filterItems, "filterItems");
        this.key = key;
        this.headerTitle = headerTitle;
        this.filterItems = filterItems;
        this.insetBannerApiData = insetBannerApiData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FilterOptionApiData copy$default(FilterOptionApiData filterOptionApiData, String str, String str2, List list, InsetBannerApiData insetBannerApiData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = filterOptionApiData.key;
        }
        if ((i & 2) != 0) {
            str2 = filterOptionApiData.headerTitle;
        }
        if ((i & 4) != 0) {
            list = filterOptionApiData.filterItems;
        }
        if ((i & 8) != 0) {
            insetBannerApiData = filterOptionApiData.insetBannerApiData;
        }
        return filterOptionApiData.copy(str, str2, list, insetBannerApiData);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    @NotNull
    public final List<FilterMenuItemApiData> component3() {
        return this.filterItems;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final InsetBannerApiData getInsetBannerApiData() {
        return this.insetBannerApiData;
    }

    @NotNull
    public final FilterOptionApiData copy(@NotNull String key, @NotNull String headerTitle, @NotNull List<FilterMenuItemApiData> filterItems, @Nullable InsetBannerApiData insetBannerApiData) {
        Intrinsics.h(key, "key");
        Intrinsics.h(headerTitle, "headerTitle");
        Intrinsics.h(filterItems, "filterItems");
        return new FilterOptionApiData(key, headerTitle, filterItems, insetBannerApiData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterOptionApiData)) {
            return false;
        }
        FilterOptionApiData filterOptionApiData = (FilterOptionApiData) other;
        return Intrinsics.c(this.key, filterOptionApiData.key) && Intrinsics.c(this.headerTitle, filterOptionApiData.headerTitle) && Intrinsics.c(this.filterItems, filterOptionApiData.filterItems) && Intrinsics.c(this.insetBannerApiData, filterOptionApiData.insetBannerApiData);
    }

    @NotNull
    public final List<FilterMenuItemApiData> getFilterItems() {
        return this.filterItems;
    }

    @NotNull
    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    @Nullable
    public final InsetBannerApiData getInsetBannerApiData() {
        return this.insetBannerApiData;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        int iD = b.d(b.c(this.key.hashCode() * 31, 31, this.headerTitle), 31, this.filterItems);
        InsetBannerApiData insetBannerApiData = this.insetBannerApiData;
        return iD + (insetBannerApiData == null ? 0 : insetBannerApiData.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.key;
        String str2 = this.headerTitle;
        List<FilterMenuItemApiData> list = this.filterItems;
        InsetBannerApiData insetBannerApiData = this.insetBannerApiData;
        StringBuilder sbV = YU.a.v("FilterOptionApiData(key=", str, ", headerTitle=", str2, ", filterItems=");
        sbV.append(list);
        sbV.append(", insetBannerApiData=");
        sbV.append(insetBannerApiData);
        sbV.append(")");
        return sbV.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.key);
        dest.writeString(this.headerTitle);
        Iterator itU = au.com.woolworths.android.onesite.a.u(this.filterItems, dest);
        while (itU.hasNext()) {
            ((FilterMenuItemApiData) itU.next()).writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.insetBannerApiData, flags);
    }
}
