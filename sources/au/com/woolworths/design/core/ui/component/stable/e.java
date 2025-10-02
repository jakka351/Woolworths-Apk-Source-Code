package au.com.woolworths.design.core.ui.component.stable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.shop.account.ui.delete.DeleteAccountAcceptConditionsKt;
import au.com.woolworths.product.composeui.ProductUnavailableLabelKt;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function2 {
    public final /* synthetic */ int d = 2;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ e(ProductCard productCard, Modifier modifier, boolean z, boolean z2, int i, int i2) {
        this.i = productCard;
        this.j = modifier;
        this.e = z;
        this.f = z2;
        this.g = i;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                RadioButtonKt.a(this.e, (Function0) this.i, (Modifier) this.j, this.f, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            case 1:
                ((Integer) obj2).getClass();
                DeleteAccountAcceptConditionsKt.a((String) this.i, this.e, this.f, (Function1) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            default:
                ((Integer) obj2).getClass();
                ProductUnavailableLabelKt.a((ProductCard) this.i, (Modifier) this.j, this.e, this.f, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ e(String str, boolean z, boolean z2, Function1 function1, int i, int i2) {
        this.i = str;
        this.e = z;
        this.f = z2;
        this.j = function1;
        this.g = i;
        this.h = i2;
    }

    public /* synthetic */ e(boolean z, Function0 function0, Modifier modifier, boolean z2, int i, int i2) {
        this.e = z;
        this.i = function0;
        this.j = modifier;
        this.f = z2;
        this.g = i;
        this.h = i2;
    }
}
