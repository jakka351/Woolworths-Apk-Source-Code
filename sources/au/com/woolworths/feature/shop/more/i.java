package au.com.woolworths.feature.shop.more;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.feature.shop.more.MoreContract;
import io.reactivex.functions.Action;
import kotlinx.coroutines.BuildersKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Action {
    public final /* synthetic */ int d;
    public final /* synthetic */ MoreViewModel e;

    public /* synthetic */ i(MoreViewModel moreViewModel, int i) {
        this.d = i;
        this.e = moreViewModel;
    }

    @Override // io.reactivex.functions.Action
    public final void run() {
        switch (this.d) {
            case 0:
                MoreViewModel moreViewModel = this.e;
                moreViewModel.e.clearRewardsData();
                BuildersKt.c(ViewModelKt.a(moreViewModel), null, null, new MoreViewModel$onUnlinkRewardsSuccess$1(moreViewModel, null), 3);
                break;
            default:
                Boolean bool = Boolean.FALSE;
                MoreViewModel moreViewModel2 = this.e;
                moreViewModel2.r6(bool);
                moreViewModel2.v.f(MoreContract.Actions.LaunchHomepage.f7563a);
                break;
        }
    }
}
