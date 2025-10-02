package au.com.woolworths.base.rewards.account;

import au.com.woolworths.android.onesite.network.Component;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ RewardsAccountInteractorImpl e;

    public /* synthetic */ a(RewardsAccountInteractorImpl rewardsAccountInteractorImpl, int i) {
        this.d = i;
        this.e = rewardsAccountInteractorImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                return RewardsAccountInteractorImpl.login$lambda$5(this.e, (Component) obj);
            default:
                return RewardsAccountInteractorImpl.linkRewardsCard$lambda$3(this.e, (Component) obj);
        }
    }
}
