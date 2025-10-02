package au.com.woolworths.feature.product.list.legacy;

import au.com.woolworths.feature.product.list.legacy.ui.MarketplaceSwitchListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                break;
            case 1:
                ((MarketplaceSwitchListener) this.e).E();
                break;
            default:
                ((ProductListOptionsFilterFragment) this.e).requireActivity().getF().d();
                break;
        }
        return Unit.f24250a;
    }
}
