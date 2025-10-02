package au.com.woolworths.shop.lists.ui.substitutions;

import au.com.woolworths.shop.lists.data.model.AlternativeProductsDisclaimer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ AlternativeProductsDisclaimer f;

    public /* synthetic */ d(Function1 function1, AlternativeProductsDisclaimer alternativeProductsDisclaimer, int i) {
        this.d = i;
        this.e = function1;
        this.f = alternativeProductsDisclaimer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.invoke(this.f);
                break;
            default:
                this.e.invoke(this.f);
                break;
        }
        return Unit.f24250a;
    }
}
