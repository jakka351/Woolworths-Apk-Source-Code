package au.com.woolworths.feature.product.list.legacy;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class z implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProductListViewModel e;

    public /* synthetic */ z(ProductListViewModel productListViewModel, int i) {
        this.d = i;
        this.e = productListViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                androidx.constraintlayout.core.state.a.v(this.e.e.f5328a.f5342a, "for_you_coach_mark_seen", true);
                break;
            default:
                androidx.constraintlayout.core.state.a.v(this.e.e.f5328a.f5342a, "best_value_coach_mark_seen", true);
                break;
        }
        return Unit.f24250a;
    }
}
