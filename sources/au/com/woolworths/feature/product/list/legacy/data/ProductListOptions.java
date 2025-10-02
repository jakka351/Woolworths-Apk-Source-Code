package au.com.woolworths.feature.product.list.legacy.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.feature.product.list.legacy.ui.FilterOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/data/ProductListOptions;", "Landroid/os/Parcelable;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductListOptions implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ProductListOptions> CREATOR = new Creator();
    public final List d;
    public final List e;
    public final List f;
    public final InsetBannerData g;
    public final ProductFilterSwitch h;
    public final int i;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProductListOptions> {
        @Override // android.os.Parcelable.Creator
        public final ProductListOptions createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            int iE2 = 0;
            while (iE2 != i) {
                iE2 = a.e(FilterOption.CREATOR, parcel, arrayList, iE2, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            int iE3 = 0;
            while (iE3 != i2) {
                iE3 = a.e(SortOption.CREATOR, parcel, arrayList2, iE3, 1);
            }
            int i3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i3);
            while (iE != i3) {
                iE = a.e(SortOption.CREATOR, parcel, arrayList3, iE, 1);
            }
            return new ProductListOptions(arrayList, arrayList2, arrayList3, (InsetBannerData) parcel.readParcelable(ProductListOptions.class.getClassLoader()), parcel.readInt() == 0 ? null : ProductFilterSwitch.CREATOR.createFromParcel(parcel), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ProductListOptions[] newArray(int i) {
            return new ProductListOptions[i];
        }
    }

    public ProductListOptions(List filterList, List sortList, List originalSortList, InsetBannerData insetBannerData, ProductFilterSwitch productFilterSwitch, int i) {
        Intrinsics.h(filterList, "filterList");
        Intrinsics.h(sortList, "sortList");
        Intrinsics.h(originalSortList, "originalSortList");
        this.d = filterList;
        this.e = sortList;
        this.f = originalSortList;
        this.g = insetBannerData;
        this.h = productFilterSwitch;
        this.i = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductListOptions)) {
            return false;
        }
        ProductListOptions productListOptions = (ProductListOptions) obj;
        return Intrinsics.c(this.d, productListOptions.d) && Intrinsics.c(this.e, productListOptions.e) && Intrinsics.c(this.f, productListOptions.f) && Intrinsics.c(this.g, productListOptions.g) && Intrinsics.c(this.h, productListOptions.h) && this.i == productListOptions.i;
    }

    public final int hashCode() {
        int iD = b.d(b.d(this.d.hashCode() * 31, 31, this.e), 31, this.f);
        InsetBannerData insetBannerData = this.g;
        int iHashCode = (iD + (insetBannerData == null ? 0 : insetBannerData.hashCode())) * 31;
        ProductFilterSwitch productFilterSwitch = this.h;
        return Integer.hashCode(this.i) + ((iHashCode + (productFilterSwitch != null ? productFilterSwitch.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ProductListOptions(filterList=" + this.d + ", sortList=" + this.e + ", originalSortList=" + this.f + ", sortOptionsInsetBanner=" + this.g + ", marketplaceProductsSwitch=" + this.h + ", productsCount=" + this.i + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        Iterator itU = au.com.woolworths.android.onesite.a.u(this.d, dest);
        while (itU.hasNext()) {
            ((FilterOption) itU.next()).writeToParcel(dest, i);
        }
        Iterator itU2 = au.com.woolworths.android.onesite.a.u(this.e, dest);
        while (itU2.hasNext()) {
            ((SortOption) itU2.next()).writeToParcel(dest, i);
        }
        Iterator itU3 = au.com.woolworths.android.onesite.a.u(this.f, dest);
        while (itU3.hasNext()) {
            ((SortOption) itU3.next()).writeToParcel(dest, i);
        }
        dest.writeParcelable(this.g, i);
        ProductFilterSwitch productFilterSwitch = this.h;
        if (productFilterSwitch == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            productFilterSwitch.writeToParcel(dest, i);
        }
        dest.writeInt(this.i);
    }
}
