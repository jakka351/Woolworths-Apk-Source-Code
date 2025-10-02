package au.com.woolworths.shop.checkout.ui.summary;

import androidx.lifecycle.ViewModelKt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class CheckoutSummaryFragment$updateBottomSheet$1$1$1$6$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        m();
        return Unit.f24250a;
    }

    public final void m() {
        CheckoutSummaryViewModel checkoutSummaryViewModel = (CheckoutSummaryViewModel) this.receiver;
        Job job = checkoutSummaryViewModel.h;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        checkoutSummaryViewModel.h = BuildersKt.c(ViewModelKt.a(checkoutSummaryViewModel), null, null, new CheckoutSummaryViewModel$onReloadStoreCredit$1(checkoutSummaryViewModel, null), 3);
    }
}
