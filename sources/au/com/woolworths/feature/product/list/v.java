package au.com.woolworths.feature.product.list;

import au.com.woolworths.product.models.ProductCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class v implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProductListFragment e;
    public final /* synthetic */ ProductCard f;

    public /* synthetic */ v(ProductListFragment productListFragment, ProductCard productCard, int i) {
        this.d = i;
        this.e = productListFragment;
        this.f = productCard;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        ProductCard productCard = this.f;
        ProductListFragment productListFragment = this.e;
        switch (i) {
            case 0:
                float f = ProductListFragment.u;
                productListFragment.m3().T0(productCard);
                break;
            case 1:
                float f2 = ProductListFragment.u;
                productListFragment.m3().z6(productCard);
                break;
            default:
                float f3 = ProductListFragment.u;
                productListFragment.m3().z6(productCard);
                break;
        }
        return unit;
    }
}
