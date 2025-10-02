package au.com.woolworths.foundation.shop.nhp.ui.edr;

import au.com.woolworths.foundation.shop.nhp.model.edr.EdrOfferBannerData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ EdrOfferBannerData f;

    public /* synthetic */ b(Function1 function1, EdrOfferBannerData edrOfferBannerData, int i) {
        this.d = i;
        this.e = function1;
        this.f = edrOfferBannerData;
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
