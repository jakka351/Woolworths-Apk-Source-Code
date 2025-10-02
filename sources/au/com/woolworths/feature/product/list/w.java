package au.com.woolworths.feature.product.list;

import au.com.woolworths.feature.product.list.ProductListContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class w implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProductListFragment e;
    public final /* synthetic */ ProductListContract.CoachMark f;

    public /* synthetic */ w(ProductListFragment productListFragment, ProductListContract.CoachMark coachMark, int i) {
        this.d = i;
        this.e = productListFragment;
        this.f = coachMark;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        ProductListContract.CoachMark coachMark = this.f;
        ProductListFragment productListFragment = this.e;
        switch (i) {
            case 0:
                float f = ProductListFragment.u;
                productListFragment.m3().y6(coachMark);
                break;
            default:
                float f2 = ProductListFragment.u;
                productListFragment.m3().y6(coachMark);
                break;
        }
        return unit;
    }
}
