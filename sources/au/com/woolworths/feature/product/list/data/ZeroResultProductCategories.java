package au.com.woolworths.feature.product.list.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.aem.components.model.productcategorytile.ProductCategoryTileData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/feature/product/list/data/ZeroResultProductCategories;", "", "zeroResultProductCategoriesTitle", "", "zeroResultProductCategoriesItems", "", "Lau/com/woolworths/shop/aem/components/model/productcategorytile/ProductCategoryTileData;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getZeroResultProductCategoriesTitle", "()Ljava/lang/String;", "getZeroResultProductCategoriesItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ZeroResultProductCategories {
    public static final int $stable = 8;

    @NotNull
    private final List<ProductCategoryTileData> zeroResultProductCategoriesItems;

    @Nullable
    private final String zeroResultProductCategoriesTitle;

    public ZeroResultProductCategories(@Nullable String str, @NotNull List<ProductCategoryTileData> zeroResultProductCategoriesItems) {
        Intrinsics.h(zeroResultProductCategoriesItems, "zeroResultProductCategoriesItems");
        this.zeroResultProductCategoriesTitle = str;
        this.zeroResultProductCategoriesItems = zeroResultProductCategoriesItems;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ZeroResultProductCategories copy$default(ZeroResultProductCategories zeroResultProductCategories, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zeroResultProductCategories.zeroResultProductCategoriesTitle;
        }
        if ((i & 2) != 0) {
            list = zeroResultProductCategories.zeroResultProductCategoriesItems;
        }
        return zeroResultProductCategories.copy(str, list);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getZeroResultProductCategoriesTitle() {
        return this.zeroResultProductCategoriesTitle;
    }

    @NotNull
    public final List<ProductCategoryTileData> component2() {
        return this.zeroResultProductCategoriesItems;
    }

    @NotNull
    public final ZeroResultProductCategories copy(@Nullable String zeroResultProductCategoriesTitle, @NotNull List<ProductCategoryTileData> zeroResultProductCategoriesItems) {
        Intrinsics.h(zeroResultProductCategoriesItems, "zeroResultProductCategoriesItems");
        return new ZeroResultProductCategories(zeroResultProductCategoriesTitle, zeroResultProductCategoriesItems);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ZeroResultProductCategories)) {
            return false;
        }
        ZeroResultProductCategories zeroResultProductCategories = (ZeroResultProductCategories) other;
        return Intrinsics.c(this.zeroResultProductCategoriesTitle, zeroResultProductCategories.zeroResultProductCategoriesTitle) && Intrinsics.c(this.zeroResultProductCategoriesItems, zeroResultProductCategories.zeroResultProductCategoriesItems);
    }

    @NotNull
    public final List<ProductCategoryTileData> getZeroResultProductCategoriesItems() {
        return this.zeroResultProductCategoriesItems;
    }

    @Nullable
    public final String getZeroResultProductCategoriesTitle() {
        return this.zeroResultProductCategoriesTitle;
    }

    public int hashCode() {
        String str = this.zeroResultProductCategoriesTitle;
        return this.zeroResultProductCategoriesItems.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return a.i("ZeroResultProductCategories(zeroResultProductCategoriesTitle=", this.zeroResultProductCategoriesTitle, ", zeroResultProductCategoriesItems=", ")", this.zeroResultProductCategoriesItems);
    }
}
