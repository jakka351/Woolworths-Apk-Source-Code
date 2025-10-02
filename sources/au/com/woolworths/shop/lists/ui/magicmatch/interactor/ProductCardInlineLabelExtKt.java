package au.com.woolworths.shop.lists.ui.magicmatch.interactor;

import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.product.models.ProductInlineLabelApiData;
import au.com.woolworths.product.models.ProductInlineTypeApiData;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductCardInlineLabelExtKt {
    public static final ProductInlineLabelApiData a(ProductCard.InlineLabel inlineLabel) {
        String str = inlineLabel.f8962a;
        return new ProductInlineLabelApiData(str.equals("NEW") ? ProductInlineTypeApiData.NEW : str.equals("SPONSORED") ? ProductInlineTypeApiData.SPONSORED : ProductInlineTypeApiData.UNKNOWN, inlineLabel.b, inlineLabel.c);
    }
}
