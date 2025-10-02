package au.com.woolworths.product.composeui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProductCard e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ int g;

    public /* synthetic */ a(ProductCard productCard, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.e = productCard;
        this.f = modifier;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                LowestMarketPriceDescriptionKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(this.g | 1));
                break;
            case 1:
                au.com.woolworths.shop.product.details.ui.ProductAisleInfoKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(this.g | 1));
                break;
            default:
                com.woolworths.shop.product.ui.ProductWasPriceLabelKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(this.g | 1));
                break;
        }
        return Unit.f24250a;
    }
}
