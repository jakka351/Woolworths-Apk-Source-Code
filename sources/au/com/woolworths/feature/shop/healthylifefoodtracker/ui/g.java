package au.com.woolworths.feature.shop.healthylifefoodtracker.ui;

import au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerEventListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ FoodTrackerEventListener e;

    public /* synthetic */ g(FoodTrackerEventListener foodTrackerEventListener, int i) {
        this.d = i;
        this.e = foodTrackerEventListener;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.R();
                break;
            case 1:
                this.e.l1();
                break;
            default:
                this.e.E2();
                break;
        }
        return Unit.f24250a;
    }
}
