package au.com.woolworths.shop.checkout.ui.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ BrandLabel e;
    public final /* synthetic */ Modifier f;

    public /* synthetic */ h(BrandLabel brandLabel, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.e = brandLabel;
        this.f = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                FulfilmentSelectionOptionsUiKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(49));
                break;
            default:
                FulfilmentSelectionOptionsUiKt.e(this.e, this.f, composer, RecomposeScopeImplKt.a(49));
                break;
        }
        return Unit.f24250a;
    }
}
