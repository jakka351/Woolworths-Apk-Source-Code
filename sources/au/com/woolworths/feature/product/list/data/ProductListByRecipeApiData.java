package au.com.woolworths.feature.product.list.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.graphql.MappedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ8\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lau/com/woolworths/feature/product/list/data/ProductListByRecipeApiData;", "", "productsFeed", "", "totalCount", "", "nextPageKey", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getProductsFeed", "()Ljava/util/List;", "getTotalCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNextPageKey", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)Lau/com/woolworths/feature/product/list/data/ProductListByRecipeApiData;", "equals", "", "other", "hashCode", "toString", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductListByRecipeApiData {
    public static final int $stable = 8;

    @MappedName
    @Nullable
    private final Integer nextPageKey;

    @Nullable
    private final List<Object> productsFeed;

    @MappedName
    @Nullable
    private final Integer totalCount;

    public ProductListByRecipeApiData(@Nullable List<? extends Object> list, @Nullable Integer num, @Nullable Integer num2) {
        this.productsFeed = list;
        this.totalCount = num;
        this.nextPageKey = num2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductListByRecipeApiData copy$default(ProductListByRecipeApiData productListByRecipeApiData, List list, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = productListByRecipeApiData.productsFeed;
        }
        if ((i & 2) != 0) {
            num = productListByRecipeApiData.totalCount;
        }
        if ((i & 4) != 0) {
            num2 = productListByRecipeApiData.nextPageKey;
        }
        return productListByRecipeApiData.copy(list, num, num2);
    }

    @Nullable
    public final List<Object> component1() {
        return this.productsFeed;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getTotalCount() {
        return this.totalCount;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getNextPageKey() {
        return this.nextPageKey;
    }

    @NotNull
    public final ProductListByRecipeApiData copy(@Nullable List<? extends Object> productsFeed, @Nullable Integer totalCount, @Nullable Integer nextPageKey) {
        return new ProductListByRecipeApiData(productsFeed, totalCount, nextPageKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductListByRecipeApiData)) {
            return false;
        }
        ProductListByRecipeApiData productListByRecipeApiData = (ProductListByRecipeApiData) other;
        return Intrinsics.c(this.productsFeed, productListByRecipeApiData.productsFeed) && Intrinsics.c(this.totalCount, productListByRecipeApiData.totalCount) && Intrinsics.c(this.nextPageKey, productListByRecipeApiData.nextPageKey);
    }

    @Nullable
    public final Integer getNextPageKey() {
        return this.nextPageKey;
    }

    @Nullable
    public final List<Object> getProductsFeed() {
        return this.productsFeed;
    }

    @Nullable
    public final Integer getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        List<Object> list = this.productsFeed;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.totalCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.nextPageKey;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<Object> list = this.productsFeed;
        Integer num = this.totalCount;
        Integer num2 = this.nextPageKey;
        StringBuilder sb = new StringBuilder("ProductListByRecipeApiData(productsFeed=");
        sb.append(list);
        sb.append(", totalCount=");
        sb.append(num);
        sb.append(", nextPageKey=");
        return a.p(sb, num2, ")");
    }

    public /* synthetic */ ProductListByRecipeApiData(List list, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? 0 : num, (i & 4) != 0 ? null : num2);
    }
}
