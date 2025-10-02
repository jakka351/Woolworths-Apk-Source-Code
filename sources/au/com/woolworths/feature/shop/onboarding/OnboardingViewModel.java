package au.com.woolworths.feature.shop.onboarding;

import androidx.camera.lifecycle.b;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.branch.BranchDeepLinkInteractorImpl;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.network.NetworkExceptions;
import au.com.woolworths.feature.shop.delivery.address.a;
import au.com.woolworths.feature.shop.login.guest.GuestLoginInteractorImpl;
import au.com.woolworths.feature.shop.onboarding.OnboardingContract;
import au.com.woolworths.feature.shop.onboarding.analytics.CallToActionVariant;
import au.com.woolworths.feature.shop.onboarding.analytics.OnboardingActionData;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import au.com.woolworths.foundation.shop.onboarding.data.OnboardingInteractorImpl;
import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.CallbackCompletableObserver;
import io.reactivex.internal.operators.completable.CompletableAndThenCompletable;
import io.reactivex.internal.operators.completable.CompletableEmpty;
import io.reactivex.internal.operators.completable.CompletablePeek;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.PublishSubject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@HiltViewModel
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/OnboardingViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/feature/shop/onboarding/OnboardingClickHandler;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Lau/com/woolworths/feature/shop/onboarding/OnboardingFullPageErrorAction;", "RetryFailedAction", "Companion", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OnboardingViewModel extends ViewModel implements OnboardingClickHandler, FullPageErrorStateClickHandler, OnboardingFullPageErrorAction {
    public final AnalyticsManager e;
    public final BranchDeepLinkInteractorImpl f;
    public final FeatureToggleManager g;
    public final OnboardingInteractorImpl h;
    public final GuestLoginInteractorImpl i;
    public final NetworkExceptions j;
    public final ShopAppRegionInteractor k;
    public final CompositeDisposable l;
    public final MutableLiveData m;
    public final PublishSubject n;
    public RetryFailedAction o;
    public String p;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/OnboardingViewModel$Companion;", "", "", "REMOTE_TOGGLE_TIMEOUT_MILLIS", "J", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/OnboardingViewModel$RetryFailedAction;", "", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RetryFailedAction {
        public static final RetryFailedAction d;
        public static final /* synthetic */ RetryFailedAction[] e;
        public static final /* synthetic */ EnumEntries f;

        static {
            RetryFailedAction retryFailedAction = new RetryFailedAction("GUEST_LOGIN", 0);
            d = retryFailedAction;
            RetryFailedAction[] retryFailedActionArr = {retryFailedAction, new RetryFailedAction("SIGN_UP", 1)};
            e = retryFailedActionArr;
            f = EnumEntriesKt.a(retryFailedActionArr);
        }

        public static RetryFailedAction valueOf(String str) {
            return (RetryFailedAction) Enum.valueOf(RetryFailedAction.class, str);
        }

        public static RetryFailedAction[] values() {
            return (RetryFailedAction[]) e.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7960a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[Region.values().length];
            try {
                Region.Companion companion = Region.h;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f7960a = iArr;
            int[] iArr2 = new int[RetryFailedAction.values().length];
            try {
                RetryFailedAction retryFailedAction = RetryFailedAction.d;
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                RetryFailedAction retryFailedAction2 = RetryFailedAction.d;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            b = iArr2;
        }
    }

    public OnboardingViewModel(AnalyticsManager analyticsManager, BranchDeepLinkInteractorImpl branchDeepLinkInteractorImpl, FeatureToggleManager featureToggleManager, OnboardingInteractorImpl onboardingInteractorImpl, GuestLoginInteractorImpl guestLoginInteractorImpl, NetworkExceptions networkExceptions, ShopAppRegionInteractor shopAppRegionInteractor) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(networkExceptions, "networkExceptions");
        Intrinsics.h(shopAppRegionInteractor, "shopAppRegionInteractor");
        this.e = analyticsManager;
        this.f = branchDeepLinkInteractorImpl;
        this.g = featureToggleManager;
        this.h = onboardingInteractorImpl;
        this.i = guestLoginInteractorImpl;
        this.j = networkExceptions;
        this.k = shopAppRegionInteractor;
        this.l = new CompositeDisposable();
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.m = mutableLiveData;
        this.n = new PublishSubject();
        mutableLiveData.m(new OnboardingContract.ViewState(false, WhenMappings.f7960a[shopAppRegionInteractor.b().ordinal()] == 1 ? CollectionsKt.G0(OnboardingContract.OnboardingDataNZ.f) : CollectionsKt.G0(OnboardingContract.OnboardingData.f), CollectionsKt.R(OnboardingContract.CallToAction.d, OnboardingContract.CallToAction.e, OnboardingContract.CallToAction.f), null));
    }

    @Override // au.com.woolworths.feature.shop.onboarding.OnboardingClickHandler
    public final void D2() {
        this.n.onNext(OnboardingContract.NavigationActions.LogIn.f7955a);
        this.e.j(OnboardingActionData.f, TrackingMetadata.Companion.a(TrackableValue.b1, CallToActionVariant.e));
    }

    @Override // au.com.woolworths.feature.shop.onboarding.OnboardingClickHandler
    public final void g0() {
        this.n.onNext(OnboardingContract.NavigationActions.CreateAccount.f7954a);
        this.e.j(OnboardingActionData.e, TrackingMetadata.Companion.a(TrackableValue.b1, CallToActionVariant.e));
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onPrimaryActionClicked() {
        OnboardingErrorState onboardingErrorState;
        OnboardingContract.ViewState viewState = (OnboardingContract.ViewState) this.m.e();
        if (viewState == null || (onboardingErrorState = viewState.d) == null) {
            return;
        }
        onboardingErrorState.a(this);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        OnboardingErrorState onboardingErrorState;
        OnboardingContract.ViewState viewState = (OnboardingContract.ViewState) this.m.e();
        if (viewState == null || (onboardingErrorState = viewState.d) == null) {
            return;
        }
        onboardingErrorState.b(this);
    }

    public final void p6() {
        RetryFailedAction retryFailedAction = this.o;
        int i = retryFailedAction == null ? -1 : WhenMappings.b[retryFailedAction.ordinal()];
        if (i == -1) {
            throw new IllegalStateException("No error should mean no button, so what did we click?");
        }
        if (i == 1) {
            t4();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            q6();
        }
    }

    public final void q6() {
        this.h.a();
        BranchDeepLinkInteractorImpl branchDeepLinkInteractorImpl = this.f;
        boolean zE = branchDeepLinkInteractorImpl.e(branchDeepLinkInteractorImpl.b());
        PublishSubject publishSubject = this.n;
        if (zE) {
            publishSubject.onNext(new OnboardingContract.NavigationActions.NavigateToBranchLink(branchDeepLinkInteractorImpl.b()));
        } else {
            publishSubject.onNext(OnboardingContract.NavigationActions.NavigateToHomePage.f7958a);
        }
    }

    @Override // au.com.woolworths.feature.shop.onboarding.OnboardingClickHandler
    public final void t4() {
        this.o = RetryFailedAction.d;
        CompletableAndThenCompletable completableAndThenCompletable = new CompletableAndThenCompletable(new CompletablePeek(this.i.d(), new a(new au.com.woolworths.feature.shop.instore.navigation.map.utils.a(this, 7), 14), Functions.c), CompletableEmpty.d);
        CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver(new b(5, new OnboardingViewModel$onBeOurGuestClick$3(1, this, OnboardingViewModel.class, "onLoginIfNeededFailure", "onLoginIfNeededFailure(Ljava/lang/Throwable;)V", 0)), new au.com.woolworths.feature.shop.account.viewmodel.delete.a(this, 3));
        completableAndThenCompletable.a(callbackCompletableObserver);
        DisposableKt.a(this.l, callbackCompletableObserver);
        this.e.j(OnboardingActionData.g, TrackingMetadata.Companion.a(TrackableValue.b1, CallToActionVariant.e));
    }
}
