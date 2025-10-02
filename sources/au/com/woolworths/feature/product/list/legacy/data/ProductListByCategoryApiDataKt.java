package au.com.woolworths.feature.product.list.legacy.data;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiDataExtKt;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListByCategoryApiDataKt {
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    public static final ProductListData a(ProductListByCategoryApiData productListByCategoryApiData) {
        ?? r3 = productListByCategoryApiData.f5356a;
        ArrayList arrayList = productListByCategoryApiData.d;
        Integer num = productListByCategoryApiData.b;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = productListByCategoryApiData.c;
        ArrayList arrayList2 = productListByCategoryApiData.e;
        ArrayList arrayList3 = productListByCategoryApiData.f;
        ProductFilterSwitch productFilterSwitch = productListByCategoryApiData.h;
        InfoSection infoSection = productListByCategoryApiData.i;
        BottomSheetContent.Marketplace marketplace = productListByCategoryApiData.j;
        ?? r14 = productListByCategoryApiData.k;
        InsetBannerApiData insetBannerApiData = productListByCategoryApiData.g;
        return new ProductListData(null, arrayList, r3, iIntValue, num2, arrayList2, arrayList3, insetBannerApiData != null ? InsetBannerApiDataExtKt.toUiModel(insetBannerApiData) : null, productFilterSwitch, null, infoSection, marketplace, null, r14, null, null, null, 119296);
    }
}
