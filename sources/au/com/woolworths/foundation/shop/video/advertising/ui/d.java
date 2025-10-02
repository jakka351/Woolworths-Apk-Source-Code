package au.com.woolworths.foundation.shop.video.advertising.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.product.composeui.ProductNameKt;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ d(ProductCard productCard, boolean z, Modifier modifier, int i, Integer num, int i2, int i3) {
        this.j = productCard;
        this.e = z;
        this.f = modifier;
        this.g = i;
        this.k = num;
        this.h = i2;
        this.i = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                VideoAdTopPanelKt.a(this.e, this.g, this.h, (Function1) this.j, (Function0) this.k, this.f, (Composer) obj, RecomposeScopeImplKt.a(this.i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ProductNameKt.b((ProductCard) this.j, this.e, this.f, this.g, (Integer) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ d(boolean z, int i, int i2, Function1 function1, Function0 function0, Modifier modifier, int i3) {
        this.e = z;
        this.g = i;
        this.h = i2;
        this.j = function1;
        this.k = function0;
        this.f = modifier;
        this.i = i3;
    }
}
