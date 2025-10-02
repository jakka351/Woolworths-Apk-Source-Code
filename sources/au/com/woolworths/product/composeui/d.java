package au.com.woolworths.product.composeui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ ProductCard e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    public /* synthetic */ d(ProductCard productCard, Function0 function0, Modifier modifier, boolean z, int i, int i2) {
        this.e = productCard;
        this.f = function0;
        this.g = modifier;
        this.h = z;
        this.i = i;
        this.j = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                ProductCardButtonsKt.a(RecomposeScopeImplKt.a(this.i | 1), this.j, (Composer) obj, this.g, this.e, this.f, this.h);
                break;
            default:
                ((Integer) obj2).getClass();
                ProductVarietiesLinkKt.a(RecomposeScopeImplKt.a(this.i | 1), this.j, (Composer) obj, this.g, this.e, this.f, this.h);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ d(ProductCard productCard, boolean z, Function0 function0, Modifier modifier, int i, int i2) {
        this.e = productCard;
        this.h = z;
        this.f = function0;
        this.g = modifier;
        this.i = i;
        this.j = i2;
    }
}
