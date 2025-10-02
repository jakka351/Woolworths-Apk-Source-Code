package au.com.woolworths.feature.product.list.data;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003HÆ\u0003J<\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lau/com/woolworths/feature/product/list/data/ProductListByRewardsOfferApiData;", "", "customMessages", "", "Lau/com/woolworths/feature/product/list/data/CustomMessage;", "totalNumberOfProducts", "", "productsFeed", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;)V", "getCustomMessages", "()Ljava/util/List;", "getTotalNumberOfProducts", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProductsFeed", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;)Lau/com/woolworths/feature/product/list/data/ProductListByRewardsOfferApiData;", "equals", "", "other", "hashCode", "toString", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductListByRewardsOfferApiData {
    public static final int $stable = 8;

    @NotNull
    private final List<CustomMessage> customMessages;

    @Nullable
    private final List<Object> productsFeed;

    @Nullable
    private final Integer totalNumberOfProducts;

    /* JADX WARN: Multi-variable type inference failed */
    public ProductListByRewardsOfferApiData(@NotNull List<? extends CustomMessage> customMessages, @Nullable Integer num, @Nullable List<? extends Object> list) {
        Intrinsics.h(customMessages, "customMessages");
        this.customMessages = customMessages;
        this.totalNumberOfProducts = num;
        this.productsFeed = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductListByRewardsOfferApiData copy$default(ProductListByRewardsOfferApiData productListByRewardsOfferApiData, List list, Integer num, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = productListByRewardsOfferApiData.customMessages;
        }
        if ((i & 2) != 0) {
            num = productListByRewardsOfferApiData.totalNumberOfProducts;
        }
        if ((i & 4) != 0) {
            list2 = productListByRewardsOfferApiData.productsFeed;
        }
        return productListByRewardsOfferApiData.copy(list, num, list2);
    }

    @NotNull
    public final List<CustomMessage> component1() {
        return this.customMessages;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getTotalNumberOfProducts() {
        return this.totalNumberOfProducts;
    }

    @Nullable
    public final List<Object> component3() {
        return this.productsFeed;
    }

    @NotNull
    public final ProductListByRewardsOfferApiData copy(@NotNull List<? extends CustomMessage> customMessages, @Nullable Integer totalNumberOfProducts, @Nullable List<? extends Object> productsFeed) {
        Intrinsics.h(customMessages, "customMessages");
        return new ProductListByRewardsOfferApiData(customMessages, totalNumberOfProducts, productsFeed);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductListByRewardsOfferApiData)) {
            return false;
        }
        ProductListByRewardsOfferApiData productListByRewardsOfferApiData = (ProductListByRewardsOfferApiData) other;
        return Intrinsics.c(this.customMessages, productListByRewardsOfferApiData.customMessages) && Intrinsics.c(this.totalNumberOfProducts, productListByRewardsOfferApiData.totalNumberOfProducts) && Intrinsics.c(this.productsFeed, productListByRewardsOfferApiData.productsFeed);
    }

    @NotNull
    public final List<CustomMessage> getCustomMessages() {
        return this.customMessages;
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
        int iHashCode = this.customMessages.hashCode() * 31;
        Integer num = this.totalNumberOfProducts;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<Object> list = this.productsFeed;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<CustomMessage> list = this.customMessages;
        Integer num = this.totalNumberOfProducts;
        List<Object> list2 = this.productsFeed;
        StringBuilder sb = new StringBuilder("ProductListByRewardsOfferApiData(customMessages=");
        sb.append(list);
        sb.append(", totalNumberOfProducts=");
        sb.append(num);
        sb.append(", productsFeed=");
        return a.t(sb, list2, ")");
    }
}
