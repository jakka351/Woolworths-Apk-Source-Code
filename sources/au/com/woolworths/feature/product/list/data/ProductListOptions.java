package au.com.woolworths.feature.product.list.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.feature.product.list.ui.FilterOption;
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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\u001f\u001a\u00020\rHÆ\u0003J[\u0010 \u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0006\u0010!\u001a\u00020\rJ\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\rHÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006."}, d2 = {"Lau/com/woolworths/feature/product/list/data/ProductListOptions;", "Landroid/os/Parcelable;", "filterList", "", "Lau/com/woolworths/feature/product/list/ui/FilterOption;", "sortList", "Lau/com/woolworths/feature/product/list/data/SortOption;", "originalSortList", "sortOptionsInsetBanner", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerData;", "marketplaceProductsSwitch", "Lau/com/woolworths/feature/product/list/data/ProductFilterSwitch;", "productsCount", "", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerData;Lau/com/woolworths/feature/product/list/data/ProductFilterSwitch;I)V", "getFilterList", "()Ljava/util/List;", "getSortList", "getOriginalSortList", "getSortOptionsInsetBanner", "()Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerData;", "getMarketplaceProductsSwitch", "()Lau/com/woolworths/feature/product/list/data/ProductFilterSwitch;", "getProductsCount", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductListOptions implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ProductListOptions> CREATOR = new Creator();

    @NotNull
    private final List<FilterOption> filterList;

    @Nullable
    private final ProductFilterSwitch marketplaceProductsSwitch;

    @NotNull
    private final List<SortOption> originalSortList;
    private final int productsCount;

    @NotNull
    private final List<SortOption> sortList;

    @Nullable
    private final InsetBannerData sortOptionsInsetBanner;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProductListOptions> {
        /* JADX WARN: Can't rename method to resolve collision */
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

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductListOptions[] newArray(int i) {
            return new ProductListOptions[i];
        }
    }

    public ProductListOptions(@NotNull List<FilterOption> filterList, @NotNull List<SortOption> sortList, @NotNull List<SortOption> originalSortList, @Nullable InsetBannerData insetBannerData, @Nullable ProductFilterSwitch productFilterSwitch, int i) {
        Intrinsics.h(filterList, "filterList");
        Intrinsics.h(sortList, "sortList");
        Intrinsics.h(originalSortList, "originalSortList");
        this.filterList = filterList;
        this.sortList = sortList;
        this.originalSortList = originalSortList;
        this.sortOptionsInsetBanner = insetBannerData;
        this.marketplaceProductsSwitch = productFilterSwitch;
        this.productsCount = i;
    }

    public static /* synthetic */ ProductListOptions copy$default(ProductListOptions productListOptions, List list, List list2, List list3, InsetBannerData insetBannerData, ProductFilterSwitch productFilterSwitch, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = productListOptions.filterList;
        }
        if ((i2 & 2) != 0) {
            list2 = productListOptions.sortList;
        }
        if ((i2 & 4) != 0) {
            list3 = productListOptions.originalSortList;
        }
        if ((i2 & 8) != 0) {
            insetBannerData = productListOptions.sortOptionsInsetBanner;
        }
        if ((i2 & 16) != 0) {
            productFilterSwitch = productListOptions.marketplaceProductsSwitch;
        }
        if ((i2 & 32) != 0) {
            i = productListOptions.productsCount;
        }
        ProductFilterSwitch productFilterSwitch2 = productFilterSwitch;
        int i3 = i;
        return productListOptions.copy(list, list2, list3, insetBannerData, productFilterSwitch2, i3);
    }

    @NotNull
    public final List<FilterOption> component1() {
        return this.filterList;
    }

    @NotNull
    public final List<SortOption> component2() {
        return this.sortList;
    }

    @NotNull
    public final List<SortOption> component3() {
        return this.originalSortList;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final InsetBannerData getSortOptionsInsetBanner() {
        return this.sortOptionsInsetBanner;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final ProductFilterSwitch getMarketplaceProductsSwitch() {
        return this.marketplaceProductsSwitch;
    }

    /* renamed from: component6, reason: from getter */
    public final int getProductsCount() {
        return this.productsCount;
    }

    @NotNull
    public final ProductListOptions copy(@NotNull List<FilterOption> filterList, @NotNull List<SortOption> sortList, @NotNull List<SortOption> originalSortList, @Nullable InsetBannerData sortOptionsInsetBanner, @Nullable ProductFilterSwitch marketplaceProductsSwitch, int productsCount) {
        Intrinsics.h(filterList, "filterList");
        Intrinsics.h(sortList, "sortList");
        Intrinsics.h(originalSortList, "originalSortList");
        return new ProductListOptions(filterList, sortList, originalSortList, sortOptionsInsetBanner, marketplaceProductsSwitch, productsCount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductListOptions)) {
            return false;
        }
        ProductListOptions productListOptions = (ProductListOptions) other;
        return Intrinsics.c(this.filterList, productListOptions.filterList) && Intrinsics.c(this.sortList, productListOptions.sortList) && Intrinsics.c(this.originalSortList, productListOptions.originalSortList) && Intrinsics.c(this.sortOptionsInsetBanner, productListOptions.sortOptionsInsetBanner) && Intrinsics.c(this.marketplaceProductsSwitch, productListOptions.marketplaceProductsSwitch) && this.productsCount == productListOptions.productsCount;
    }

    @NotNull
    public final List<FilterOption> getFilterList() {
        return this.filterList;
    }

    @Nullable
    public final ProductFilterSwitch getMarketplaceProductsSwitch() {
        return this.marketplaceProductsSwitch;
    }

    @NotNull
    public final List<SortOption> getOriginalSortList() {
        return this.originalSortList;
    }

    public final int getProductsCount() {
        return this.productsCount;
    }

    @NotNull
    public final List<SortOption> getSortList() {
        return this.sortList;
    }

    @Nullable
    public final InsetBannerData getSortOptionsInsetBanner() {
        return this.sortOptionsInsetBanner;
    }

    public int hashCode() {
        int iD = b.d(b.d(this.filterList.hashCode() * 31, 31, this.sortList), 31, this.originalSortList);
        InsetBannerData insetBannerData = this.sortOptionsInsetBanner;
        int iHashCode = (iD + (insetBannerData == null ? 0 : insetBannerData.hashCode())) * 31;
        ProductFilterSwitch productFilterSwitch = this.marketplaceProductsSwitch;
        return Integer.hashCode(this.productsCount) + ((iHashCode + (productFilterSwitch != null ? productFilterSwitch.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "ProductListOptions(filterList=" + this.filterList + ", sortList=" + this.sortList + ", originalSortList=" + this.originalSortList + ", sortOptionsInsetBanner=" + this.sortOptionsInsetBanner + ", marketplaceProductsSwitch=" + this.marketplaceProductsSwitch + ", productsCount=" + this.productsCount + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        Iterator itU = au.com.woolworths.android.onesite.a.u(this.filterList, dest);
        while (itU.hasNext()) {
            ((FilterOption) itU.next()).writeToParcel(dest, flags);
        }
        Iterator itU2 = au.com.woolworths.android.onesite.a.u(this.sortList, dest);
        while (itU2.hasNext()) {
            ((SortOption) itU2.next()).writeToParcel(dest, flags);
        }
        Iterator itU3 = au.com.woolworths.android.onesite.a.u(this.originalSortList, dest);
        while (itU3.hasNext()) {
            ((SortOption) itU3.next()).writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.sortOptionsInsetBanner, flags);
        ProductFilterSwitch productFilterSwitch = this.marketplaceProductsSwitch;
        if (productFilterSwitch == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            productFilterSwitch.writeToParcel(dest, flags);
        }
        dest.writeInt(this.productsCount);
    }
}
