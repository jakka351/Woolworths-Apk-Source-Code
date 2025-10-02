package au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui;

import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryViewModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class SummaryScreenKt$SummaryScreen$3$1$5$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        EverydayExtraSummaryViewModel everydayExtraSummaryViewModel = (EverydayExtraSummaryViewModel) this.receiver;
        int iOrdinal = everydayExtraSummaryViewModel.m.ordinal();
        if (iOrdinal == 0) {
            everydayExtraSummaryViewModel.v6();
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            everydayExtraSummaryViewModel.B6(everydayExtraSummaryViewModel.k, everydayExtraSummaryViewModel.l, null);
        }
        return Unit.f24250a;
    }
}
