package au.com.woolworths.feature.product.list.legacy.data;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiDataExtKt;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListApiDataKt {
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    public static final ProductListData a(ProductListApiData productListApiData) {
        ArrayList arrayList = productListApiData.f5355a;
        ?? r3 = productListApiData.b;
        Integer num = productListApiData.c;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = productListApiData.d;
        ArrayList arrayList2 = productListApiData.e;
        ArrayList arrayList3 = productListApiData.f;
        ProductFilterSwitch productFilterSwitch = productListApiData.h;
        InfoSection infoSection = productListApiData.i;
        BottomSheetContent.Marketplace marketplace = productListApiData.j;
        ?? r14 = productListApiData.k;
        ?? r15 = productListApiData.l;
        String str = productListApiData.m;
        InsetBannerApiData insetBannerApiData = productListApiData.g;
        return new ProductListData(null, arrayList, r3, iIntValue, num2, arrayList2, arrayList3, insetBannerApiData != null ? InsetBannerApiDataExtKt.toUiModel(insetBannerApiData) : null, productFilterSwitch, null, infoSection, marketplace, productListApiData.n, r14, r15, str, productListApiData.o, 512);
    }
}
