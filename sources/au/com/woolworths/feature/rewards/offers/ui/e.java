package au.com.woolworths.feature.rewards.offers.ui;

import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ RewardsOfferData f;

    public /* synthetic */ e(Function1 function1, RewardsOfferData rewardsOfferData, int i) {
        this.d = i;
        this.e = function1;
        this.f = rewardsOfferData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.invoke(this.f);
                break;
            case 1:
                this.e.invoke(this.f);
                break;
            case 2:
                this.e.invoke(this.f);
                break;
            default:
                this.e.invoke(this.f);
                break;
        }
        return Unit.f24250a;
    }
}
