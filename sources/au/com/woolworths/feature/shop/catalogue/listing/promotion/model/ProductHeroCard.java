package au.com.woolworths.feature.shop.catalogue.listing.promotion.model;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/promotion/model/ProductHeroCard;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductHeroCard {

    /* renamed from: a, reason: collision with root package name */
    public final ProductCard f6905a;

    static {
        int i = ProductCard.$stable;
    }

    public ProductHeroCard(ProductCard productCard) {
        this.f6905a = productCard;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductHeroCard) && Intrinsics.c(this.f6905a, ((ProductHeroCard) obj).f6905a);
    }

    public final int hashCode() {
        return this.f6905a.hashCode();
    }

    public final String toString() {
        return d.n("ProductHeroCard(product=", this.f6905a, ")");
    }
}
