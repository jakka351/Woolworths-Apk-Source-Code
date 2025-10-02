package au.com.woolworths.feature.product.list;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProductListFragment e;
    public final /* synthetic */ ProductCard f;
    public final /* synthetic */ ProductCardConfig g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int i;

    public /* synthetic */ n(ProductListFragment productListFragment, ProductCard productCard, ProductCardConfig productCardConfig, boolean z, int i, int i2) {
        this.d = i2;
        this.e = productListFragment;
        this.f = productCard;
        this.g = productCardConfig;
        this.h = z;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        int i2 = this.i;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                float f = ProductListFragment.u;
                int iA = RecomposeScopeImplKt.a(i2 | 1);
                this.e.p2(this.f, this.g, this.h, (Composer) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                float f2 = ProductListFragment.u;
                int iA2 = RecomposeScopeImplKt.a(i2 | 1);
                this.e.q2(this.f, this.g, this.h, (Composer) obj, iA2);
                break;
        }
        return unit;
    }
}
