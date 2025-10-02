package au.com.woolworths.feature.product.list.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005HÆ\u0003J,\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lau/com/woolworths/feature/product/list/data/ProductListByPriceFamilyApiData;", "", "totalNumberOfProducts", "", "productsFeed", "", "<init>", "(Ljava/lang/Integer;Ljava/util/List;)V", "getTotalNumberOfProducts", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProductsFeed", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/util/List;)Lau/com/woolworths/feature/product/list/data/ProductListByPriceFamilyApiData;", "equals", "", "other", "hashCode", "toString", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductListByPriceFamilyApiData {
    public static final int $stable = 8;

    @Nullable
    private final List<Object> productsFeed;

    @Nullable
    private final Integer totalNumberOfProducts;

    public ProductListByPriceFamilyApiData(@Nullable Integer num, @Nullable List<? extends Object> list) {
        this.totalNumberOfProducts = num;
        this.productsFeed = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductListByPriceFamilyApiData copy$default(ProductListByPriceFamilyApiData productListByPriceFamilyApiData, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = productListByPriceFamilyApiData.totalNumberOfProducts;
        }
        if ((i & 2) != 0) {
            list = productListByPriceFamilyApiData.productsFeed;
        }
        return productListByPriceFamilyApiData.copy(num, list);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getTotalNumberOfProducts() {
        return this.totalNumberOfProducts;
    }

    @Nullable
    public final List<Object> component2() {
        return this.productsFeed;
    }

    @NotNull
    public final ProductListByPriceFamilyApiData copy(@Nullable Integer totalNumberOfProducts, @Nullable List<? extends Object> productsFeed) {
        return new ProductListByPriceFamilyApiData(totalNumberOfProducts, productsFeed);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductListByPriceFamilyApiData)) {
            return false;
        }
        ProductListByPriceFamilyApiData productListByPriceFamilyApiData = (ProductListByPriceFamilyApiData) other;
        return Intrinsics.c(this.totalNumberOfProducts, productListByPriceFamilyApiData.totalNumberOfProducts) && Intrinsics.c(this.productsFeed, productListByPriceFamilyApiData.productsFeed);
    }

    @Nullable
    public final List<Object> getProductsFeed() {
        return this.productsFeed;
    }

    @Nullable
    public final Integer getTotalNumberOfProducts() {
        return this.totalNumberOfProducts;
    }

    public int hashCode() {
        Integer num = this.totalNumberOfProducts;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<Object> list = this.productsFeed;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ProductListByPriceFamilyApiData(totalNumberOfProducts=" + this.totalNumberOfProducts + ", productsFeed=" + this.productsFeed + ")";
    }
}
