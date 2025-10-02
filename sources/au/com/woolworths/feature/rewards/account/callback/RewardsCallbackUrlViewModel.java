package au.com.woolworths.feature.rewards.account.callback;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.rewards.account.callback.RewardsCallbackUrlContract;
import au.com.woolworths.feature.rewards.account.sso.RewardsMagicLinkInteractor;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/account/callback/RewardsCallbackUrlViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsCallbackUrlViewModel extends ViewModel implements FullPageErrorStateClickHandler {
    public final RewardsMagicLinkInteractor e;
    public final RewardsAccountInteractor f;
    public final MutableLiveData g;
    public final MutableLiveData h;
    public final SharedFlowImpl i;
    public final Flow j;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5680a;

        static {
            int[] iArr = new int[Activities.RewardsCallbackUrlActivity.CallbackType.values().length];
            try {
                Activities.RewardsCallbackUrlActivity.CallbackType callbackType = Activities.RewardsCallbackUrlActivity.CallbackType.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f5680a = iArr;
        }
    }

    public RewardsCallbackUrlViewModel(RewardsMagicLinkInteractor rewardsMagicLinkInteractor, RewardsAccountInteractor accountInteractor) {
        Intrinsics.h(accountInteractor, "accountInteractor");
        this.e = rewardsMagicLinkInteractor;
        this.f = accountInteractor;
        MutableLiveData mutableLiveData = new MutableLiveData(new RewardsCallbackUrlContract.ViewState(false, "", "", null));
        this.g = mutableLiveData;
        this.h = mutableLiveData;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.i = sharedFlowImplB;
        this.j = FlowKt.a(sharedFlowImplB);
    }

    public static void p6(RewardsCallbackUrlViewModel rewardsCallbackUrlViewModel, MutableLiveData mutableLiveData, boolean z, String title, String url, RewardsCallbackUrlErrorState rewardsCallbackUrlErrorState, int i) {
        if ((i & 1) != 0) {
            RewardsCallbackUrlContract.ViewState viewState = (RewardsCallbackUrlContract.ViewState) mutableLiveData.e();
            z = viewState != null ? viewState.f5679a : false;
        }
        if ((i & 2) != 0) {
            RewardsCallbackUrlContract.ViewState viewState2 = (RewardsCallbackUrlContract.ViewState) mutableLiveData.e();
            title = viewState2 != null ? viewState2.b : "";
        }
        if ((i & 4) != 0) {
            RewardsCallbackUrlContract.ViewState viewState3 = (RewardsCallbackUrlContract.ViewState) mutableLiveData.e();
            url = viewState3 != null ? viewState3.c : "";
        }
        int i2 = i & 8;
        RewardsCallbackUrlContract.ViewState viewState4 = null;
        if (i2 != 0) {
            RewardsCallbackUrlContract.ViewState viewState5 = (RewardsCallbackUrlContract.ViewState) mutableLiveData.e();
            rewardsCallbackUrlErrorState = viewState5 != null ? viewState5.d : null;
        }
        if (((RewardsCallbackUrlContract.ViewState) mutableLiveData.e()) != null) {
            Intrinsics.h(title, "title");
            Intrinsics.h(url, "url");
            viewState4 = new RewardsCallbackUrlContract.ViewState(z, title, url, rewardsCallbackUrlErrorState);
        }
        mutableLiveData.m(viewState4);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        this.i.f(RewardsCallbackUrlContract.Actions.Retry.f5678a);
    }
}
