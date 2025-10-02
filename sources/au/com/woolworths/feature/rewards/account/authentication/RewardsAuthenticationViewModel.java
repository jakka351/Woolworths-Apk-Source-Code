package au.com.woolworths.feature.rewards.account.authentication;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsLiteCardData;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.network.NetworkExceptions;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.SharedHeaders;
import au.com.woolworths.android.onesite.rxutils.ResultKt;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationContract;
import au.com.woolworths.feature.rewards.account.authentication.analytics.RewardsAuthenticationActionData;
import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import io.reactivex.internal.operators.single.SingleDoOnSubscribe;
import io.reactivex.internal.operators.single.SingleObserveOn;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.PublishSubject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationFullPageErrorActionInterface;", "CallBackUrlMatch", "Companion", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsAuthenticationViewModel extends ViewModel implements FullPageErrorStateClickHandler, RewardsAuthenticationFullPageErrorActionInterface {
    public final RewardsAccountInteractor e;
    public final SchedulersProvider f;
    public final NetworkExceptions g;
    public final AnalyticsManager h;
    public final SharedHeaders i;
    public final FeatureToggleManager j;
    public final CompositeDisposable k;
    public final PublishSubject l;
    public final MutableLiveData m;
    public final MutableLiveData n;
    public final PublishSubject o;
    public String p;
    public String q;
    public CallBackUrlMatch r;
    public RewardsAuthenticationContract.AuthType s;
    public Activities.Authentication.Extras t;
    public Activities.Authentication.ExtrasStepUp u;
    public boolean v;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationViewModel$CallBackUrlMatch;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CallBackUrlMatch {

        /* renamed from: a, reason: collision with root package name */
        public final String f5667a;
        public final String b;

        public CallBackUrlMatch(String callbackUrlPattern, String str) {
            Intrinsics.h(callbackUrlPattern, "callbackUrlPattern");
            this.f5667a = callbackUrlPattern;
            this.b = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationViewModel$Companion;", "", "", "REWARD_AUTH_QUERY_PARAM_AUTH_CODE", "Ljava/lang/String;", "REWARD_AUTH_QUERY_PARAM_AUTH_CODE_ALT", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public RewardsAuthenticationViewModel(RewardsAccountInteractor rewardsAccountInteractor, SchedulersProvider schedulersProvider, NetworkExceptions networkExceptions, AnalyticsManager analyticsManager, SharedHeaders sharedHeaders, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        Intrinsics.h(schedulersProvider, "schedulersProvider");
        Intrinsics.h(networkExceptions, "networkExceptions");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(sharedHeaders, "sharedHeaders");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.e = rewardsAccountInteractor;
        this.f = schedulersProvider;
        this.g = networkExceptions;
        this.h = analyticsManager;
        this.i = sharedHeaders;
        this.j = featureToggleManager;
        this.k = new CompositeDisposable();
        PublishSubject publishSubject = new PublishSubject();
        this.l = publishSubject;
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.m = mutableLiveData;
        this.n = mutableLiveData;
        this.o = publishSubject;
        this.s = RewardsAuthenticationContract.AuthType.e;
    }

    public final void g() {
        Activities.Authentication.Extras extras = this.t;
        if (extras != null) {
            p6(extras, this.u, this.v);
        } else {
            Intrinsics.p("extras");
            throw null;
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public final void o6() {
        this.k.e();
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onPrimaryActionClicked() {
        RewardsAuthenticationFullPageErrorState rewardsAuthenticationFullPageErrorState;
        RewardsAuthenticationContract.ViewState viewState = (RewardsAuthenticationContract.ViewState) this.n.e();
        if (viewState == null || (rewardsAuthenticationFullPageErrorState = viewState.b) == null) {
            return;
        }
        rewardsAuthenticationFullPageErrorState.a(this);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        RewardsAuthenticationFullPageErrorState rewardsAuthenticationFullPageErrorState;
        this.h.c(RewardsAuthenticationActionData.i);
        RewardsAuthenticationContract.ViewState viewState = (RewardsAuthenticationContract.ViewState) this.n.e();
        if (viewState == null || (rewardsAuthenticationFullPageErrorState = viewState.b) == null) {
            return;
        }
        rewardsAuthenticationFullPageErrorState.b(this);
    }

    public final void p6(Activities.Authentication.Extras extras, Activities.Authentication.ExtrasStepUp extrasStepUp, boolean z) {
        Intrinsics.h(extras, "extras");
        this.t = extras;
        this.u = extrasStepUp;
        this.v = z;
        boolean z2 = extras.e;
        Consumer consumer = Functions.e;
        SchedulersProvider schedulersProvider = this.f;
        CompositeDisposable compositeDisposable = this.k;
        RewardsAccountInteractor rewardsAccountInteractor = this.e;
        if (z2) {
            RewardsLiteCardData liteCardData = rewardsAccountInteractor.getLiteCardData();
            Single rewardsSignupDetails = rewardsAccountInteractor.getRewardsSignupDetails(z, liteCardData != null ? liteCardData.f : null);
            h hVar = new h(1, new i(this, 0));
            rewardsSignupDetails.getClass();
            SingleObserveOn singleObserveOnF = ResultKt.a(new SingleDoOnSubscribe(rewardsSignupDetails, hVar)).f(schedulersProvider.b());
            ConsumerSingleObserver consumerSingleObserver = new ConsumerSingleObserver(new c(2, new RewardsAuthenticationViewModel$fetchRewardsSignupDetails$2(1, this, RewardsAuthenticationViewModel.class, "processRewardsSignUpDetails", "processRewardsSignUpDetails(Lau/com/woolworths/android/onesite/rxutils/Result;)V", 0)), consumer);
            singleObserveOnF.a(consumerSingleObserver);
            DisposableKt.a(compositeDisposable, consumerSingleObserver);
            return;
        }
        if (extrasStepUp != null) {
            String str = extrasStepUp.d;
            this.s = RewardsAuthenticationContract.AuthType.d;
            this.p = str;
        }
        Single rewardsLinkDetails = rewardsAccountInteractor.getRewardsLinkDetails();
        h hVar2 = new h(2, new i(this, 1));
        rewardsLinkDetails.getClass();
        SingleObserveOn singleObserveOnF2 = ResultKt.a(new SingleDoOnSubscribe(rewardsLinkDetails, hVar2)).f(schedulersProvider.b());
        ConsumerSingleObserver consumerSingleObserver2 = new ConsumerSingleObserver(new c(3, new RewardsAuthenticationViewModel$fetchRewardsLinkDetails$2(1, this, RewardsAuthenticationViewModel.class, "processRewardsLinkDetails", "processRewardsLinkDetails(Lau/com/woolworths/android/onesite/rxutils/Result;)V", 0)), consumer);
        singleObserveOnF2.a(consumerSingleObserver2);
        DisposableKt.a(compositeDisposable, consumerSingleObserver2);
    }

    public final void q6(Throwable th) {
        RewardsAuthenticationFullPageErrorState rewardsAuthenticationFullPageErrorState;
        this.g.getClass();
        boolean z = th instanceof NoConnectivityException;
        AnalyticsManager analyticsManager = this.h;
        if (z) {
            analyticsManager.c(RewardsAuthenticationActionData.h);
            rewardsAuthenticationFullPageErrorState = RewardsAuthenticationFullPageErrorState.d;
        } else {
            analyticsManager.c(RewardsAuthenticationActionData.g);
            rewardsAuthenticationFullPageErrorState = RewardsAuthenticationFullPageErrorState.e;
        }
        this.m.m(new RewardsAuthenticationContract.ViewState(false, rewardsAuthenticationFullPageErrorState));
    }
}
