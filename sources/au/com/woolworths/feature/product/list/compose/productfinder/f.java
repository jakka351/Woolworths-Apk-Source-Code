package au.com.woolworths.feature.product.list.compose.productfinder;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.tile.ProductClickListener;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProductCard e;
    public final /* synthetic */ ProductClickListener f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ List h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ Integer l;
    public final /* synthetic */ Function0 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;

    public /* synthetic */ f(ProductCard productCard, ProductClickListener productClickListener, boolean z, List list, boolean z2, boolean z3, boolean z4, Integer num, Function0 function0, int i, int i2, int i3) {
        this.d = i3;
        this.e = productCard;
        this.f = productClickListener;
        this.g = z;
        this.h = list;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = num;
        this.m = function0;
        this.n = i;
        this.o = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                ProductCardListTileUiKt.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (Composer) obj, RecomposeScopeImplKt.a(this.n | 1), this.o);
                break;
            default:
                ((Integer) obj2).getClass();
                au.com.woolworths.feature.product.list.legacy.compose.productfinder.ProductCardListTileUiKt.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (Composer) obj, RecomposeScopeImplKt.a(this.n | 1), this.o);
                break;
        }
        return Unit.f24250a;
    }
}
