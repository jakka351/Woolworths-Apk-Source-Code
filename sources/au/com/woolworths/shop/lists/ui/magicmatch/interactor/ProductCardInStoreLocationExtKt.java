package au.com.woolworths.shop.lists.ui.magicmatch.interactor;

import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.product.models.AisleSide;
import au.com.woolworths.product.models.InStoreLocationData;
import au.com.woolworths.product.models.InStoreLocationType;
import au.com.woolworths.product.models.InstoreDetailsData;
import au.com.woolworths.product.models.InstoreLocationDetailsData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductCardInStoreLocationExtKt {
    public static final InStoreLocationData a(ProductCard.InStoreLocation inStoreLocation) {
        InstoreLocationDetailsData instoreLocationDetailsData;
        InstoreDetailsData instoreDetailsData;
        InStoreLocationType inStoreLocationType;
        Intrinsics.h(inStoreLocation, "<this>");
        ProductCard.Details details = inStoreLocation.f8960a;
        if (details != null) {
            int i = details.f8956a;
            int iOrdinal = details.b.ordinal();
            AisleSide aisleSide = (iOrdinal == 0 || iOrdinal != 1) ? AisleSide.LEFT : AisleSide.RIGHT;
            instoreLocationDetailsData = new InstoreLocationDetailsData(i, aisleSide, details.f, details.c, details.d, details.e, details.g, details.h, details.i);
        } else {
            instoreLocationDetailsData = null;
        }
        ProductCard.DisplayInfo displayInfo = inStoreLocation.b;
        if (displayInfo != null) {
            String str = displayInfo.f8957a;
            au.com.woolworths.shop.graphql.type.InStoreLocationType inStoreLocationType2 = displayInfo.b;
            if (inStoreLocationType2 != null) {
                int iOrdinal2 = inStoreLocationType2.ordinal();
                inStoreLocationType = (iOrdinal2 == 0 || iOrdinal2 != 1) ? InStoreLocationType.AVAILABLE : InStoreLocationType.UNAVAILABLE;
            } else {
                inStoreLocationType = null;
            }
            instoreDetailsData = new InstoreDetailsData(str, inStoreLocationType);
        } else {
            instoreDetailsData = null;
        }
        return new InStoreLocationData(instoreLocationDetailsData, instoreDetailsData);
    }
}
