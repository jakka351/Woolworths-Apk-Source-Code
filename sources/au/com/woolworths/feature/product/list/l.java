package au.com.woolworths.feature.product.list;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.feature.shop.banners.imagetextbanner.data.ImageTextBanner;
import au.com.woolworths.foundation.shop.nhp.model.edr.EdrOfferBannerData;
import au.com.woolworths.foundation.shop.nhp.model.personalisedproducts.PersonalisedProductsBannerData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class l implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProductListFragment e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l(ProductListFragment productListFragment, Object obj, int i, int i2) {
        this.d = i2;
        this.e = productListFragment;
        this.f = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj3 = this.f;
        ProductListFragment productListFragment = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                float f = ProductListFragment.u;
                productListFragment.o2((PersonalisedProductsBannerData) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                float f2 = ProductListFragment.u;
                productListFragment.R1((EdrOfferBannerData) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            default:
                ((Integer) obj2).getClass();
                float f3 = ProductListFragment.u;
                productListFragment.P2((ImageTextBanner) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
        }
        return unit;
    }
}
