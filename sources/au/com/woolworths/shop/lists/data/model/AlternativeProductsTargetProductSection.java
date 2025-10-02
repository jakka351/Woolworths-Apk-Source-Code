package au.com.woolworths.shop.lists.data.model;

import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.MappedName;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/shop/lists/data/model/AlternativeProductsTargetProductSection;", "Lau/com/woolworths/shop/lists/data/model/AlternativeProductsSection;", "product", "Lau/com/woolworths/product/models/ProductCard;", "<init>", "(Lau/com/woolworths/product/models/ProductCard;)V", "getProduct", "()Lau/com/woolworths/product/models/ProductCard;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AlternativeProductsTargetProductSection implements AlternativeProductsSection {

    @MappedName
    @NotNull
    private final ProductCard product;

    public AlternativeProductsTargetProductSection(@NotNull ProductCard product) {
        Intrinsics.h(product, "product");
        this.product = product;
    }

    public static /* synthetic */ AlternativeProductsTargetProductSection copy$default(AlternativeProductsTargetProductSection alternativeProductsTargetProductSection, ProductCard productCard, int i, Object obj) {
        if ((i & 1) != 0) {
            productCard = alternativeProductsTargetProductSection.product;
        }
        return alternativeProductsTargetProductSection.copy(productCard);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ProductCard getProduct() {
        return this.product;
    }

    @NotNull
    public final AlternativeProductsTargetProductSection copy(@NotNull ProductCard product) {
        Intrinsics.h(product, "product");
        return new AlternativeProductsTargetProductSection(product);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AlternativeProductsTargetProductSection) && Intrinsics.c(this.product, ((AlternativeProductsTargetProductSection) other).product);
    }

    @NotNull
    public final ProductCard getProduct() {
        return this.product;
    }

    public int hashCode() {
        return this.product.hashCode();
    }

    @NotNull
    public String toString() {
        return d.n("AlternativeProductsTargetProductSection(product=", this.product, ")");
    }
}
