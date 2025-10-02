package au.com.woolworths.feature.shop.wpay.ui.wpay;

import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodItem;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderViewModel", f = "WPayForOrderViewModel.kt", l = {242}, m = "getGooglePayUiState")
/* loaded from: classes3.dex */
final class WPayForOrderViewModel$getGooglePayUiState$1 extends ContinuationImpl {
    public PaymentMethodItem.GooglePay p;
    public /* synthetic */ Object q;
    public final /* synthetic */ WPayForOrderViewModel r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WPayForOrderViewModel$getGooglePayUiState$1(WPayForOrderViewModel wPayForOrderViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = wPayForOrderViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return WPayForOrderViewModel.q6(this.r, null, this);
    }
}
