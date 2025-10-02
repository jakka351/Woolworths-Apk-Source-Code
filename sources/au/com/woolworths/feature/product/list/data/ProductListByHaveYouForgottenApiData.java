package au.com.woolworths.feature.product.list.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.graphql.MappedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ,\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lau/com/woolworths/feature/product/list/data/ProductListByHaveYouForgottenApiData;", "", "productsFeed", "", "totalCount", "", "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "getProductsFeed", "()Ljava/util/List;", "getTotalCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Integer;)Lau/com/woolworths/feature/product/list/data/ProductListByHaveYouForgottenApiData;", "equals", "", "other", "hashCode", "toString", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductListByHaveYouForgottenApiData {
    public static final int $stable = 8;

    @Nullable
    private final List<Object> productsFeed;

    @MappedName
    @Nullable
    private final Integer totalCount;

    public ProductListByHaveYouForgottenApiData(@Nullable List<? extends Object> list, @Nullable Integer num) {
        this.productsFeed = list;
        this.totalCount = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductListByHaveYouForgottenApiData copy$default(ProductListByHaveYouForgottenApiData productListByHaveYouForgottenApiData, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = productListByHaveYouForgottenApiData.productsFeed;
        }
        if ((i & 2) != 0) {
            num = productListByHaveYouForgottenApiData.totalCount;
        }
        return productListByHaveYouForgottenApiData.copy(list, num);
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

    @NotNull
    public final ProductListByHaveYouForgottenApiData copy(@Nullable List<? extends Object> productsFeed, @Nullable Integer totalCount) {
        return new ProductListByHaveYouForgottenApiData(productsFeed, totalCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductListByHaveYouForgottenApiData)) {
            return false;
        }
        ProductListByHaveYouForgottenApiData productListByHaveYouForgottenApiData = (ProductListByHaveYouForgottenApiData) other;
        return Intrinsics.c(this.productsFeed, productListByHaveYouForgottenApiData.productsFeed) && Intrinsics.c(this.totalCount, productListByHaveYouForgottenApiData.totalCount);
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
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ProductListByHaveYouForgottenApiData(productsFeed=" + this.productsFeed + ", totalCount=" + this.totalCount + ")";
    }

    public /* synthetic */ ProductListByHaveYouForgottenApiData(List list, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? 0 : num);
    }
}
