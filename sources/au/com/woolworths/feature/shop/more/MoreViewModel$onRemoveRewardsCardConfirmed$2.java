package au.com.woolworths.feature.shop.more;

import au.com.woolworths.feature.shop.more.MoreContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class MoreViewModel$onRemoveRewardsCardConfirmed$2 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable p0 = (Throwable) obj;
        Intrinsics.h(p0, "p0");
        MoreViewModel moreViewModel = (MoreViewModel) this.receiver;
        moreViewModel.r6(Boolean.FALSE);
        moreViewModel.v.f(new MoreContract.Actions.RewardsUnlinkMessage(com.woolworths.R.string.rewards_remove_error));
        return Unit.f24250a;
    }
}
