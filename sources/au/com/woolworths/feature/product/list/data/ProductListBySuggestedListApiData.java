package au.com.woolworths.feature.product.list.data;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.MappedName;
import au.com.woolworths.pagingutils.NumericPageData;
import au.com.woolworths.product.models.ProductCard;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003J6\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lau/com/woolworths/feature/product/list/data/ProductListBySuggestedListApiData;", "Lau/com/woolworths/pagingutils/NumericPageData;", "Lau/com/woolworths/product/models/ProductCard;", "totalNumberOfProducts", "", "nextPageKey", "items", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "getTotalNumberOfProducts", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNextPageKey", "getItems", "()Ljava/util/List;", "totalCount", "getTotalCount", "()I", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lau/com/woolworths/feature/product/list/data/ProductListBySuggestedListApiData;", "equals", "", "other", "", "hashCode", "toString", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductListBySuggestedListApiData implements NumericPageData<ProductCard> {
    public static final int $stable = 8;

    @MappedName
    @NotNull
    private final List<ProductCard> items;

    @MappedName
    @Nullable
    private final Integer nextPageKey;

    @Nullable
    private final Integer totalNumberOfProducts;

    public ProductListBySuggestedListApiData(@Nullable Integer num, @Nullable Integer num2, @NotNull List<ProductCard> items) {
        Intrinsics.h(items, "items");
        this.totalNumberOfProducts = num;
        this.nextPageKey = num2;
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductListBySuggestedListApiData copy$default(ProductListBySuggestedListApiData productListBySuggestedListApiData, Integer num, Integer num2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = productListBySuggestedListApiData.totalNumberOfProducts;
        }
        if ((i & 2) != 0) {
            num2 = productListBySuggestedListApiData.nextPageKey;
        }
        if ((i & 4) != 0) {
            list = productListBySuggestedListApiData.items;
        }
        return productListBySuggestedListApiData.copy(num, num2, list);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getTotalNumberOfProducts() {
        return this.totalNumberOfProducts;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getNextPageKey() {
        return this.nextPageKey;
    }

    @NotNull
    public final List<ProductCard> component3() {
        return this.items;
    }

    @NotNull
    public final ProductListBySuggestedListApiData copy(@Nullable Integer totalNumberOfProducts, @Nullable Integer nextPageKey, @NotNull List<ProductCard> items) {
        Intrinsics.h(items, "items");
        return new ProductListBySuggestedListApiData(totalNumberOfProducts, nextPageKey, items);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductListBySuggestedListApiData)) {
            return false;
        }
        ProductListBySuggestedListApiData productListBySuggestedListApiData = (ProductListBySuggestedListApiData) other;
        return Intrinsics.c(this.totalNumberOfProducts, productListBySuggestedListApiData.totalNumberOfProducts) && Intrinsics.c(this.nextPageKey, productListBySuggestedListApiData.nextPageKey) && Intrinsics.c(this.items, productListBySuggestedListApiData.items);
    }

    @Override // au.com.woolworths.pagingutils.PageData
    @NotNull
    /* renamed from: getItems */
    public List<ProductCard> getC() {
        return this.items;
    }

    @Override // au.com.woolworths.pagingutils.PageData
    /* renamed from: getTotalCount */
    public int getD() {
        Integer num = this.totalNumberOfProducts;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Nullable
    public final Integer getTotalNumberOfProducts() {
        return this.totalNumberOfProducts;
    }

    public int hashCode() {
        Integer num = this.totalNumberOfProducts;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.nextPageKey;
        return this.items.hashCode() + ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        Integer num = this.totalNumberOfProducts;
        Integer num2 = this.nextPageKey;
        return a.t(d.v("ProductListBySuggestedListApiData(totalNumberOfProducts=", num, ", nextPageKey=", num2, ", items="), this.items, ")");
    }

    @Override // au.com.woolworths.pagingutils.PageData
    @Nullable
    public Integer getNextPageKey() {
        return this.nextPageKey;
    }

    public /* synthetic */ ProductListBySuggestedListApiData(Integer num, Integer num2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, num2, list);
    }
}
