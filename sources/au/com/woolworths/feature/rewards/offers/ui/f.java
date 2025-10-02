package au.com.woolworths.feature.rewards.offers.ui;

import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsCta;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ RewardsOfferData f;
    public final /* synthetic */ OfferDetailsCta g;

    public /* synthetic */ f(Function2 function2, RewardsOfferData rewardsOfferData, OfferDetailsCta offerDetailsCta, int i) {
        this.d = i;
        this.e = function2;
        this.f = rewardsOfferData;
        this.g = offerDetailsCta;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.invoke(this.f, this.g.getCta());
                break;
            case 1:
                this.e.invoke(this.f, this.g.getCta());
                break;
            default:
                this.e.invoke(this.f, this.g.getCta());
                break;
        }
        return Unit.f24250a;
    }
}
