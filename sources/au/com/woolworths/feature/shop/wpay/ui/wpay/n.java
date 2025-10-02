package au.com.woolworths.feature.shop.wpay.ui.wpay;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.AddPayPalAlert;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.GiftCardItem;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                WPayForOrderViewModel wPayForOrderViewModel = (WPayForOrderViewModel) this.e;
                AnalyticsData analyticsData = ((AddPayPalAlert) this.f).e;
                wPayForOrderViewModel.getClass();
                wPayForOrderViewModel.p.c(analyticsData);
                BuildersKt.c(ViewModelKt.a(wPayForOrderViewModel), null, null, new WPayForOrderViewModel$onConfirmLinkPayPal$1(wPayForOrderViewModel, null), 3);
                break;
            default:
                ((Function1) this.e).invoke(new WPayForOrderContract.UiEvent.GiftCard.Add((GiftCardItem.AddGiftCard) ((GiftCardItem) this.f)));
                break;
        }
        return Unit.f24250a;
    }
}
