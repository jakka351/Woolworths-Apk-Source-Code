package au.com.woolworths.shop.cart.ui.cart;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.cart.CartAnalytics;
import au.com.woolworths.shop.cart.ui.cart.CartContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ CartFragment e;

    public /* synthetic */ a(CartFragment cartFragment, int i) {
        this.d = i;
        this.e = cartFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                CartViewModel cartViewModelI1 = this.e.I1();
                BuildersKt.c(ViewModelKt.a(cartViewModelI1), null, null, new CartViewModel$onSaveAsListClick$1(cartViewModelI1, null), 3);
                break;
            case 1:
                CartViewModel cartViewModelI12 = this.e.I1();
                cartViewModelI12.g.g((Event) new CartAnalytics.Cart().f.d.getD());
                cartViewModelI12.l.k(CartContract.Actions.ShowConfirmDeleteAll.f10475a);
                break;
            default:
                this.e.requireActivity().onBackPressed();
                break;
        }
        return Unit.f24250a;
    }
}
