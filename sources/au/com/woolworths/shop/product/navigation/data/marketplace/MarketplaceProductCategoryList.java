package au.com.woolworths.shop.product.navigation.data.marketplace;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.product.navigation.data.ProductCategory;
import au.com.woolworths.shop.product.navigation.data.ProductCategoryList;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/shop/product/navigation/data/marketplace/MarketplaceProductCategoryList;", "Lau/com/woolworths/shop/product/navigation/data/ProductCategoryList;", "", "headerTitle", "", "Lau/com/woolworths/shop/product/navigation/data/ProductCategory;", "categories", "Lau/com/woolworths/shop/product/navigation/data/marketplace/MarketplaceCategoriesInfo;", "marketplace", "<init>", "(Ljava/lang/String;Ljava/util/List;Lau/com/woolworths/shop/product/navigation/data/marketplace/MarketplaceCategoriesInfo;)V", "Ljava/lang/String;", "getHeaderTitle", "()Ljava/lang/String;", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lau/com/woolworths/shop/product/navigation/data/marketplace/MarketplaceCategoriesInfo;", "b", "()Lau/com/woolworths/shop/product/navigation/data/marketplace/MarketplaceCategoriesInfo;", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MarketplaceProductCategoryList extends ProductCategoryList {

    @SerializedName("categories")
    @NotNull
    private final List<ProductCategory> categories;

    @SerializedName("headerTitle")
    @NotNull
    private final String headerTitle;

    @SerializedName("marketplace")
    @NotNull
    private final MarketplaceCategoriesInfo marketplace;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketplaceProductCategoryList(@NotNull String headerTitle, @NotNull List<ProductCategory> categories, @NotNull MarketplaceCategoriesInfo marketplace) {
        super(headerTitle, categories);
        Intrinsics.h(headerTitle, "headerTitle");
        Intrinsics.h(categories, "categories");
        Intrinsics.h(marketplace, "marketplace");
        this.headerTitle = headerTitle;
        this.categories = categories;
        this.marketplace = marketplace;
    }

    @Override // au.com.woolworths.shop.product.navigation.data.ProductCategoryList
    /* renamed from: a, reason: from getter */
    public final List getCategories() {
        return this.categories;
    }

    /* renamed from: b, reason: from getter */
    public final MarketplaceCategoriesInfo getMarketplace() {
        return this.marketplace;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketplaceProductCategoryList)) {
            return false;
        }
        MarketplaceProductCategoryList marketplaceProductCategoryList = (MarketplaceProductCategoryList) obj;
        return Intrinsics.c(this.headerTitle, marketplaceProductCategoryList.headerTitle) && Intrinsics.c(this.categories, marketplaceProductCategoryList.categories) && Intrinsics.c(this.marketplace, marketplaceProductCategoryList.marketplace);
    }

    public final int hashCode() {
        return this.marketplace.hashCode() + b.d(this.headerTitle.hashCode() * 31, 31, this.categories);
    }

    public final String toString() {
        String str = this.headerTitle;
        List<ProductCategory> list = this.categories;
        MarketplaceCategoriesInfo marketplaceCategoriesInfo = this.marketplace;
        StringBuilder sbS = a.s("MarketplaceProductCategoryList(headerTitle=", str, ", categories=", ", marketplace=", list);
        sbS.append(marketplaceCategoriesInfo);
        sbS.append(")");
        return sbS.toString();
    }
}
