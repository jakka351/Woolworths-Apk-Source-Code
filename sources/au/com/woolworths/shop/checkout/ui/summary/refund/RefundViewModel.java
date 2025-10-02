package au.com.woolworths.shop.checkout.ui.summary.refund;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetViewModel;
import au.com.woolworths.shop.checkout.ui.summary.refund.RefundBottomSheetContract;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/summary/refund/RefundViewModel;", "Lau/com/woolworths/foundation/shop/bottomsheet/BaseBottomSheetViewModel;", "<init>", "()V", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RefundViewModel extends BaseBottomSheetViewModel {
    public final SharedFlowImpl i;
    public final SharedFlowImpl j;

    @Inject
    public RefundViewModel() {
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.i = sharedFlowImplB;
        this.j = sharedFlowImplB;
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetViewModel, au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetContract.CtaClickListener
    public final void c4(ContentCta cta) {
        Intrinsics.h(cta, "cta");
        this.i.f(RefundBottomSheetContract.Actions.OnPrimaryCtaClick.f10828a);
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetViewModel
    public final void q6(ContentCta contentCta) {
        Intrinsics.h(contentCta, "contentCta");
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetViewModel
    public final void r6(String label) {
        Intrinsics.h(label, "label");
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetViewModel
    public final void s6() {
    }
}
