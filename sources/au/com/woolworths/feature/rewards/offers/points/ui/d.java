package au.com.woolworths.feature.rewards.offers.points.ui;

import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.rewards.offers.list.RewardsOfferListFullPageErrorState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d(int i, Object obj, Function1 function1) {
        this.d = i;
        this.e = function1;
        this.f = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.invoke((RewardsOfferListFullPageErrorState) this.f);
                break;
            default:
                this.e.invoke((ContentCta) this.f);
                break;
        }
        return Unit.f24250a;
    }
}
