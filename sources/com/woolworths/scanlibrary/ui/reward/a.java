package com.woolworths.scanlibrary.ui.reward;

import com.woolworths.scanlibrary.ui.reward.SngRewardSetupContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ SngRewardSetupViewModel e;

    public /* synthetic */ a(SngRewardSetupViewModel sngRewardSetupViewModel, int i) {
        this.d = i;
        this.e = sngRewardSetupViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                this.e.n.j(new SngRewardSetupContract.ViewState(true, null));
                break;
            default:
                this.e.o.f(SngRewardSetupContract.Actions.LaunchSng.f21316a);
                break;
        }
        return Unit.f24250a;
    }
}
