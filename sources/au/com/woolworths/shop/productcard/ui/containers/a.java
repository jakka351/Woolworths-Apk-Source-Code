package au.com.woolworths.shop.productcard.ui.containers;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shop.productcard.data.ProductTile;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProductTile e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ Function3 g;

    public /* synthetic */ a(ProductTile productTile, Modifier modifier, Function3 function3, int i, int i2) {
        this.d = i2;
        this.e = productTile;
        this.f = modifier;
        this.g = function3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ProductTileGridUiKt.a(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(433));
                break;
            default:
                ProductTileListUiKt.a(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(433));
                break;
        }
        return Unit.f24250a;
    }
}
