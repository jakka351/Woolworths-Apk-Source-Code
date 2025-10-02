package au.com.woolworths.feature.product.list.legacy.data;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiDataExtKt;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListByPastShopApiDataKt {
    public static final ProductListData a(ProductListByPastShopApiData productListByPastShopApiData) {
        ArrayList arrayList = productListByPastShopApiData.c;
        Integer num = productListByPastShopApiData.f5359a;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = productListByPastShopApiData.b;
        InsetBannerApiData insetBannerApiData = productListByPastShopApiData.f;
        InsetBannerData uiModel = insetBannerApiData != null ? InsetBannerApiDataExtKt.toUiModel(insetBannerApiData) : null;
        EmptyList emptyList = EmptyList.d;
        return new ProductListData(null, arrayList, null, iIntValue, num2, emptyList, emptyList, uiModel, null, null, null, null, null, null, null, null, null, 130816);
    }
}
