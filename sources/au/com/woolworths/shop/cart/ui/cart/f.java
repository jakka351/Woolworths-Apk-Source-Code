package au.com.woolworths.shop.cart.ui.cart;

import au.com.woolworths.foundation.shop.cart.data.model.SectionHeader;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ CartViewModel e;
    public final /* synthetic */ SectionHeader f;

    public /* synthetic */ f(CartViewModel cartViewModel, SectionHeader sectionHeader, int i) {
        this.d = i;
        this.e = cartViewModel;
        this.f = sectionHeader;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.e6(this.f.f8699a, true);
                break;
            default:
                this.e.e6(this.f.f8699a, false);
                break;
        }
        return Unit.f24250a;
    }
}
