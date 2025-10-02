package au.com.woolworths.shop.product.details.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.aem.components.model.paragraph.ParagraphTextItemData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/data/ProductDetailsRowAccordionProductList;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductDetailsRowAccordionProductList {

    /* renamed from: a, reason: collision with root package name */
    public final ParagraphTextItemData f12611a;
    public final ProductDetailsRowAccordionProductListCta b;
    public final ProductHorizontalList c;

    public ProductDetailsRowAccordionProductList(ParagraphTextItemData paragraphTextItemData, ProductDetailsRowAccordionProductListCta productDetailsRowAccordionProductListCta, ProductHorizontalList productHorizontalList) {
        this.f12611a = paragraphTextItemData;
        this.b = productDetailsRowAccordionProductListCta;
        this.c = productHorizontalList;
    }

    public static ProductDetailsRowAccordionProductList a(ProductDetailsRowAccordionProductList productDetailsRowAccordionProductList, ProductHorizontalList productHorizontalList) {
        ParagraphTextItemData paragraphTextItemData = productDetailsRowAccordionProductList.f12611a;
        ProductDetailsRowAccordionProductListCta productDetailsRowAccordionProductListCta = productDetailsRowAccordionProductList.b;
        productDetailsRowAccordionProductList.getClass();
        return new ProductDetailsRowAccordionProductList(paragraphTextItemData, productDetailsRowAccordionProductListCta, productHorizontalList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetailsRowAccordionProductList)) {
            return false;
        }
        ProductDetailsRowAccordionProductList productDetailsRowAccordionProductList = (ProductDetailsRowAccordionProductList) obj;
        return Intrinsics.c(this.f12611a, productDetailsRowAccordionProductList.f12611a) && Intrinsics.c(this.b, productDetailsRowAccordionProductList.b) && Intrinsics.c(this.c, productDetailsRowAccordionProductList.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f12611a.hashCode() * 31)) * 31;
        ProductHorizontalList productHorizontalList = this.c;
        return iHashCode + (productHorizontalList == null ? 0 : productHorizontalList.hashCode());
    }

    public final String toString() {
        return "ProductDetailsRowAccordionProductList(productDetailsRowAccordionProductListTextItem=" + this.f12611a + ", productDetailsRowAccordionProductListCta=" + this.b + ", productDetailsRowAccordionProductList=" + this.c + ")";
    }
}
