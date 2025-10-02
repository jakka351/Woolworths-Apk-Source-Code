package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(int i, int i2, Object obj) {
        this.d = i2;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                CheckoutSectionTitleKt.a((String) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ProductMessageRowKt.a((String) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            default:
                ((Integer) obj2).getClass();
                PreferenceTextUiKt.a((TextInputError) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }
}
