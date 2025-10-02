package au.com.woolworths.feature.product.list.compose.productfinder;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.tile.ProductClickListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProductCard e;
    public final /* synthetic */ ProductClickListener f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ Function0 l;
    public final /* synthetic */ Function0 m;
    public final /* synthetic */ Integer n;
    public final /* synthetic */ SharedIntrinsicHeightState o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;

    public /* synthetic */ e(ProductCard productCard, ProductClickListener productClickListener, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Function0 function0, Function0 function02, Integer num, SharedIntrinsicHeightState sharedIntrinsicHeightState, int i, int i2, int i3) {
        this.d = i3;
        this.e = productCard;
        this.f = productClickListener;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = function0;
        this.m = function02;
        this.n = num;
        this.o = sharedIntrinsicHeightState;
        this.p = i;
        this.q = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                ProductCardGridTileUiKt.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, composer, RecomposeScopeImplKt.a(this.p | 1), this.q);
                break;
            default:
                ((Integer) obj2).getClass();
                au.com.woolworths.feature.product.list.legacy.compose.productfinder.ProductCardGridTileUiKt.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, composer, RecomposeScopeImplKt.a(this.p | 1), this.q);
                break;
        }
        return Unit.f24250a;
    }
}
