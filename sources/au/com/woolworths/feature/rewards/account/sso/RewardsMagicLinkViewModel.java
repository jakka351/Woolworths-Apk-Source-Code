package au.com.woolworths.feature.rewards.account.sso;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsTokenInfo;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticator;
import au.com.woolworths.feature.rewards.account.settings.AccountSettingsInteractorOld;
import au.com.woolworths.feature.rewards.account.sso.RewardsMagicLinkContract;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/account/sso/RewardsMagicLinkViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Lau/com/woolworths/feature/rewards/account/sso/MagicLinkSessionProvider;", "Lau/com/woolworths/feature/rewards/account/sso/MagicLinkTokenProvider;", "Companion", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsMagicLinkViewModel extends ViewModel implements FullPageErrorStateClickHandler, MagicLinkSessionProvider, MagicLinkTokenProvider {
    public static final ArrayList p = ArraysKt.F(new String[]{"woolworthsrewards.com.au", "everydayrewards.com.au", "everyday.com.au", "liveperson.net", "lpsnmedia.net", "look.io", "liveper.sn", null});
    public final RewardsMagicLinkInteractor e;
    public final AccountSettingsInteractorOld f;
    public final RewardsAccountInteractor g;
    public final RewardsAppTokenAuthenticator h;
    public final MutableLiveData i;
    public final SharedFlowImpl j;
    public final MutableLiveData k;
    public final Flow l;
    public Activities.MagicLinkActivity.PreferredLaunchMode m;
    public int n;
    public Job o;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lau/com/woolworths/feature/rewards/account/sso/RewardsMagicLinkViewModel$Companion;", "", "", "", "WHITELISTED_HOSTS", "Ljava/util/List;", "", "chatbotSessionIdMaxRetries", "I", "", "chatbotSessionIdRetryDelayMs", "J", "FIVE_MINUTES_IN_MILLIS", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public RewardsMagicLinkViewModel(RewardsMagicLinkInteractor rewardsMagicLinkInteractor, AccountSettingsInteractorOld accountSettingsInteractorOld, RewardsAccountInteractor rewardsAccountInteractor, RewardsAppTokenAuthenticator rewardsAppTokenAuthenticator) {
        Intrinsics.h(accountSettingsInteractorOld, "accountSettingsInteractorOld");
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        Intrinsics.h(rewardsAppTokenAuthenticator, "rewardsAppTokenAuthenticator");
        this.e = rewardsMagicLinkInteractor;
        this.f = accountSettingsInteractorOld;
        this.g = rewardsAccountInteractor;
        this.h = rewardsAppTokenAuthenticator;
        MutableLiveData mutableLiveData = new MutableLiveData(new RewardsMagicLinkContract.ViewState(false, "", null, ""));
        this.i = mutableLiveData;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.j = sharedFlowImplB;
        this.k = mutableLiveData;
        this.l = FlowKt.a(sharedFlowImplB);
        this.m = Activities.MagicLinkActivity.PreferredLaunchMode.d;
    }

    public static void p6(RewardsMagicLinkViewModel rewardsMagicLinkViewModel, MutableLiveData mutableLiveData, boolean z, String str, RewardsMagicLinkErrorState rewardsMagicLinkErrorState, String str2, int i) {
        if ((i & 1) != 0) {
            RewardsMagicLinkContract.ViewState viewState = (RewardsMagicLinkContract.ViewState) mutableLiveData.e();
            z = viewState != null ? viewState.f5807a : false;
        }
        if ((i & 2) != 0) {
            RewardsMagicLinkContract.ViewState viewState2 = (RewardsMagicLinkContract.ViewState) mutableLiveData.e();
            str = viewState2 != null ? viewState2.b : "";
        }
        if ((i & 4) != 0) {
            RewardsMagicLinkContract.ViewState viewState3 = (RewardsMagicLinkContract.ViewState) mutableLiveData.e();
            rewardsMagicLinkErrorState = viewState3 != null ? viewState3.c : null;
        }
        if ((i & 8) != 0) {
            RewardsMagicLinkContract.ViewState viewState4 = (RewardsMagicLinkContract.ViewState) mutableLiveData.e();
            str2 = viewState4 != null ? viewState4.d : "";
        }
        mutableLiveData.m(((RewardsMagicLinkContract.ViewState) mutableLiveData.e()) != null ? new RewardsMagicLinkContract.ViewState(z, str, rewardsMagicLinkErrorState, str2) : null);
    }

    @Override // au.com.woolworths.feature.rewards.account.sso.MagicLinkTokenProvider
    public final void a() {
        String accessToken;
        RewardsTokenInfo tokenData = this.g.getTokenData();
        if (tokenData == null || (accessToken = tokenData.getAccessToken()) == null) {
            return;
        }
        this.j.f(new RewardsMagicLinkContract.Actions.ForwardAccessTokenToWebview(accessToken));
    }

    @Override // au.com.woolworths.feature.rewards.account.sso.MagicLinkTokenProvider
    public final void j0() {
        RewardsTokenInfo tokenData = this.g.getTokenData();
        Job job = this.o;
        if (job == null || !((AbstractCoroutine) job).isActive()) {
            Job jobC = BuildersKt.c(ViewModelKt.a(this), null, null, new RewardsMagicLinkViewModel$refreshToken$1(tokenData, this, null), 3);
            ((JobSupport) jobC).invokeOnCompletion(new e(this, 2));
            this.o = jobC;
        }
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        RewardsMagicLinkContract.ViewState viewState = (RewardsMagicLinkContract.ViewState) this.k.e();
        if (viewState != null) {
            String str = viewState.b;
            Activities.MagicLinkActivity.PreferredLaunchMode preferredLaunchMode = this.m;
            this.m = preferredLaunchMode;
            BuildersKt.c(ViewModelKt.a(this), null, null, new RewardsMagicLinkViewModel$getMagicLink$1(this, str, preferredLaunchMode, null), 3);
        }
    }
}
