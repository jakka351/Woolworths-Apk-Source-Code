package com.woolworths.scanlibrary.ui.reward;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import com.woolworths.scanlibrary.ui.entry.launcher.errors.FetchSngErrorState;
import com.woolworths.scanlibrary.ui.reward.SngRewardSetupContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class SngRewardSetupViewModel$fetchScanAndGoData$3 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable p0 = (Throwable) obj;
        Intrinsics.h(p0, "p0");
        SngRewardSetupViewModel sngRewardSetupViewModel = (SngRewardSetupViewModel) this.receiver;
        sngRewardSetupViewModel.k.getClass();
        sngRewardSetupViewModel.n.j(new SngRewardSetupContract.ViewState(false, p0 instanceof NoConnectivityException ? FetchSngErrorState.d : FetchSngErrorState.e));
        return Unit.f24250a;
    }
}
