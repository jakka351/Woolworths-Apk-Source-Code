package au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection;

import au.com.woolworths.feature.rewards.offers.OfferSectionViewItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ OfferSectionViewItem f;

    public /* synthetic */ d(Function1 function1, OfferSectionViewItem offerSectionViewItem, int i) {
        this.d = i;
        this.e = function1;
        this.f = offerSectionViewItem;
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
