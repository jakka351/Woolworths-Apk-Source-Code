package au.com.woolworths.feature.product.list.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.feature.shop.marketplace.ui.categories.CategoryTileKt;
import au.com.woolworths.shop.cart.ui.cart.CartSectionHeaderLargeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class l implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ int h;

    public /* synthetic */ l(String str, String str2, Function0 function0, int i, int i2) {
        this.d = i2;
        this.e = str;
        this.f = str2;
        this.g = function0;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                FilterChipCoachMarkKt.a(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(this.h | 1));
                break;
            case 1:
                au.com.woolworths.feature.product.list.legacy.compose.FilterChipCoachMarkKt.a(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(this.h | 1));
                break;
            case 2:
                CategoryTileKt.a(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(this.h | 1));
                break;
            default:
                CartSectionHeaderLargeKt.a(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(this.h | 1));
                break;
        }
        return Unit.f24250a;
    }
}
