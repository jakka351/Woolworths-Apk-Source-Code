package au.com.woolworths.feature.shop.instore.navigation.onboarding.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.shop.cart.ui.shared.LoadingScreenKt;
import au.com.woolworths.shop.lists.ui.ListTitleRowKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ a(int i, int i2, long j) {
        this.d = i2;
        this.e = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                PageIndicatorKt.a(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
            case 1:
                LoadingScreenKt.a(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
            case 2:
                au.com.woolworths.shop.checkout.ui.common.component.LoadingScreenKt.a(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
            default:
                ListTitleRowKt.b(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }
}
