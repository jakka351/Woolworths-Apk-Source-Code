package au.com.woolworths.feature.shop.instore.cart.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.feature.shop.marketplace.ui.personalised.HowItWorksCardKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function2 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ int g;

    public /* synthetic */ e(int i, int i2, String str, Function0 function0) {
        this.f = function0;
        this.e = str;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                InstoreCartScreenKt.m(RecomposeScopeImplKt.a(1), this.g, composer, this.e, this.f);
                break;
            default:
                HowItWorksCardKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(this.g | 1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ e(String str, Function0 function0, int i) {
        this.e = str;
        this.f = function0;
        this.g = i;
    }
}
