package au.com.woolworths.foundation.shop.nhp.ui.edr;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.foundation.shop.nhp.model.edr.EdrOfferBannerData;
import au.com.woolworths.foundation.shop.nhp.model.edr.EdrOfferBoostState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ EdrOfferBannerData e;
    public final /* synthetic */ EdrOfferBoostState f;
    public final /* synthetic */ Function1 g;

    public /* synthetic */ a(EdrOfferBannerData edrOfferBannerData, EdrOfferBoostState edrOfferBoostState, Function1 function1, int i, int i2) {
        this.d = i2;
        this.e = edrOfferBannerData;
        this.f = edrOfferBoostState;
        this.g = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                EdrOfferBannerKt.b(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(1));
                break;
            default:
                EdrOfferBannerKt.f(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }
}
