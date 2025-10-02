package au.com.woolworths.shop.product.navigation.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lau/com/woolworths/shop/product/navigation/data/ProductCategoryList;", "", "", "headerTitle", "", "Lau/com/woolworths/shop/product/navigation/data/ProductCategory;", "categories", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getHeaderTitle", "()Ljava/lang/String;", "Ljava/util/List;", "a", "()Ljava/util/List;", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class ProductCategoryList {

    @SerializedName("categories")
    @NotNull
    private final List<ProductCategory> categories;

    @SerializedName("headerTitle")
    @NotNull
    private final String headerTitle;

    public ProductCategoryList(@NotNull String headerTitle, @NotNull List<ProductCategory> categories) {
        Intrinsics.h(headerTitle, "headerTitle");
        Intrinsics.h(categories, "categories");
        this.headerTitle = headerTitle;
        this.categories = categories;
    }

    /* renamed from: a, reason: from getter */
    public List getCategories() {
        return this.categories;
    }
}
