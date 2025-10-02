package au.com.woolworths.feature.shared.instore.wifi.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.feature.shop.catalogue.browse.page.promotion.PromotionPageKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ int g;

    public /* synthetic */ m(MutableState mutableState, Function1 function1, int i, int i2) {
        this.d = i2;
        this.e = mutableState;
        this.f = function1;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.d) {
            case 0:
                num.intValue();
                InstoreWifiScreenKt.i(this.e, this.f, composer, RecomposeScopeImplKt.a(this.g | 1));
                break;
            default:
                num.getClass();
                PromotionPageKt.c(this.e, this.f, composer, RecomposeScopeImplKt.a(this.g | 1));
                break;
        }
        return Unit.f24250a;
    }
}
