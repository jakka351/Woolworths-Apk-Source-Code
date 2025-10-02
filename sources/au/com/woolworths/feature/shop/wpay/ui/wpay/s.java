package au.com.woolworths.feature.shop.wpay.ui.wpay;

import au.com.woolworths.analytics.supers.payments.PaymentAnalytics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class s implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ WPayForOrderViewModel e;

    public /* synthetic */ s(WPayForOrderViewModel wPayForOrderViewModel, int i) {
        this.d = i;
        this.e = wPayForOrderViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.p.f8369a.g(PaymentAnalytics.Payment.Action.p);
                break;
            case 1:
                this.e.p.f8369a.g(PaymentAnalytics.Payment.Action.q);
                break;
            case 2:
                this.e.p.f8369a.g(PaymentAnalytics.Payment.Action.p);
                break;
            default:
                this.e.p.f8369a.g(PaymentAnalytics.Payment.Action.q);
                break;
        }
        return Unit.f24250a;
    }
}
