package au.com.woolworths.shop.lists.ui.magicmatch.interactor;

import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.product.models.TagLabel;
import au.com.woolworths.product.models.TagStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductCardTagLabelExtKt {
    public static final TagLabel a(ProductCard.TagLabel tagLabel) {
        TagStyle tagStyle;
        Intrinsics.h(tagLabel, "<this>");
        String str = tagLabel.f8973a;
        au.com.woolworths.shop.graphql.type.TagStyle tagStyle2 = tagLabel.b;
        if (tagStyle2 != null) {
            int iOrdinal = tagStyle2.ordinal();
            tagStyle = iOrdinal != 0 ? iOrdinal != 1 ? TagStyle.UNKNOWN : TagStyle.FEATURED : TagStyle.UNAVAILABLE;
        } else {
            tagStyle = null;
        }
        return new TagLabel(str, tagStyle);
    }
}
