package au.com.woolworths.feature.product.list.legacy.data;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiDataExtKt;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListByFacetApiDataKt {
    public static final ProductListData a(ProductListByFacetApiData productListByFacetApiData) {
        Integer num = productListByFacetApiData.b;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = productListByFacetApiData.c;
        ArrayList arrayList = productListByFacetApiData.d;
        ArrayList arrayList2 = productListByFacetApiData.e;
        ArrayList arrayList3 = productListByFacetApiData.f5357a;
        InfoSection infoSection = productListByFacetApiData.g;
        BottomSheetContent.Marketplace marketplace = productListByFacetApiData.h;
        InsetBannerApiData insetBannerApiData = productListByFacetApiData.f;
        return new ProductListData(arrayList3, null, null, iIntValue, num2, arrayList, arrayList2, insetBannerApiData != null ? InsetBannerApiDataExtKt.toUiModel(insetBannerApiData) : null, null, null, infoSection, marketplace, null, null, null, null, null, 127744);
    }
}
