package au.com.woolworths.shop.lists.data.entity;

import androidx.room.Embedded;
import androidx.room.Relation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lau/com/woolworths/shop/lists/data/entity/ProductsWithCategory;", "", "productEntity", "Lau/com/woolworths/shop/lists/data/entity/ProductEntity;", "categories", "", "Lau/com/woolworths/shop/lists/data/entity/CategoryByProductEntity;", "<init>", "(Lau/com/woolworths/shop/lists/data/entity/ProductEntity;Ljava/util/List;)V", "getProductEntity", "()Lau/com/woolworths/shop/lists/data/entity/ProductEntity;", "getCategories", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductsWithCategory {

    @Relation
    @NotNull
    private final List<CategoryByProductEntity> categories;

    @Embedded
    @NotNull
    private final ProductEntity productEntity;

    public ProductsWithCategory(@NotNull ProductEntity productEntity, @NotNull List<CategoryByProductEntity> categories) {
        Intrinsics.h(productEntity, "productEntity");
        Intrinsics.h(categories, "categories");
        this.productEntity = productEntity;
        this.categories = categories;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductsWithCategory copy$default(ProductsWithCategory productsWithCategory, ProductEntity productEntity, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            productEntity = productsWithCategory.productEntity;
        }
        if ((i & 2) != 0) {
            list = productsWithCategory.categories;
        }
        return productsWithCategory.copy(productEntity, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ProductEntity getProductEntity() {
        return this.productEntity;
    }

    @NotNull
    public final List<CategoryByProductEntity> component2() {
        return this.categories;
    }

    @NotNull
    public final ProductsWithCategory copy(@NotNull ProductEntity productEntity, @NotNull List<CategoryByProductEntity> categories) {
        Intrinsics.h(productEntity, "productEntity");
        Intrinsics.h(categories, "categories");
        return new ProductsWithCategory(productEntity, categories);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductsWithCategory)) {
            return false;
        }
        ProductsWithCategory productsWithCategory = (ProductsWithCategory) other;
        return Intrinsics.c(this.productEntity, productsWithCategory.productEntity) && Intrinsics.c(this.categories, productsWithCategory.categories);
    }

    @NotNull
    public final List<CategoryByProductEntity> getCategories() {
        return this.categories;
    }

    @NotNull
    public final ProductEntity getProductEntity() {
        return this.productEntity;
    }

    public int hashCode() {
        return this.categories.hashCode() + (this.productEntity.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ProductsWithCategory(productEntity=" + this.productEntity + ", categories=" + this.categories + ")";
    }
}
