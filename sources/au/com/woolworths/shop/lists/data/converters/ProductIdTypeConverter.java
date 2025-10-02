package au.com.woolworths.shop.lists.data.converters;

import au.com.woolworths.product.models.ProductId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/data/converters/ProductIdTypeConverter;", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProductIdTypeConverter {
    public static String a(ProductId type) {
        Intrinsics.h(type, "type");
        return type.getValue();
    }
}
