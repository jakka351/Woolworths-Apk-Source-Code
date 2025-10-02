package au.com.woolworths.shop.checkout.ui.details;

import au.com.woolworths.shop.checkout.domain.model.CollectionMethodOption;
import au.com.woolworths.shop.checkout.domain.model.PackagingMethodOption;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ CheckoutDetailsListener e;

    public /* synthetic */ b(CheckoutDetailsListener checkoutDetailsListener, int i) {
        this.d = i;
        this.e = checkoutDetailsListener;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                PackagingMethodOption selected = (PackagingMethodOption) obj;
                Intrinsics.h(selected, "selected");
                this.e.N3(selected);
                break;
            default:
                CollectionMethodOption it = (CollectionMethodOption) obj;
                Intrinsics.h(it, "it");
                this.e.f4(it);
                break;
        }
        return Unit.f24250a;
    }
}
