package au.com.woolworths.feature.shop.onboarding.sdui;

import androidx.compose.runtime.Stable;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.branch.BranchDeepLinkInteractorImpl;
import au.com.woolworths.feature.shop.login.guest.GuestLoginInteractorImpl;
import au.com.woolworths.feature.shop.onboarding.sdui.OnboardingSduiContract;
import au.com.woolworths.feature.shop.onboarding.sdui.analytics.CallToActionVariant;
import au.com.woolworths.feature.shop.onboarding.sdui.analytics.OnboardingActionData;
import au.com.woolworths.feature.shop.onboarding.sdui.data.ButtonActionData;
import au.com.woolworths.feature.shop.onboarding.sdui.data.GetOnboardingContentPageQueryGetOnboardingContentPageExtKt;
import au.com.woolworths.feature.shop.onboarding.sdui.data.OnboardingContentPageData;
import au.com.woolworths.feature.shop.onboarding.sdui.data.OnboardingFooterButtonAction;
import au.com.woolworths.feature.shop.onboarding.sdui.util.ApolloOperationExtKt;
import au.com.woolworths.foundation.shop.onboarding.data.OnboardingInteractorImpl;
import au.com.woolworths.shop.onboarding.sdui.GetOnboardingContentPageQuery;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import timber.log.Timber;

@Stable
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/sdui/OnboardingSduiViewModel;", "Landroidx/lifecycle/ViewModel;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OnboardingSduiViewModel extends ViewModel {
    public final AnalyticsManager e;
    public final BranchDeepLinkInteractorImpl f;
    public final OnboardingInteractorImpl g;
    public final GuestLoginInteractorImpl h;
    public final SharedFlowImpl i;
    public final Flow j;
    public final MutableStateFlow k;
    public final StateFlow l;
    public FunctionReferenceImpl m;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7972a;

        static {
            int[] iArr = new int[OnboardingFooterButtonAction.values().length];
            try {
                OnboardingFooterButtonAction onboardingFooterButtonAction = OnboardingFooterButtonAction.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OnboardingFooterButtonAction onboardingFooterButtonAction2 = OnboardingFooterButtonAction.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OnboardingFooterButtonAction onboardingFooterButtonAction3 = OnboardingFooterButtonAction.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                OnboardingFooterButtonAction onboardingFooterButtonAction4 = OnboardingFooterButtonAction.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f7972a = iArr;
        }
    }

    public OnboardingSduiViewModel(AnalyticsManager analyticsManager, BranchDeepLinkInteractorImpl branchDeepLinkInteractorImpl, OnboardingInteractorImpl onboardingInteractorImpl, GuestLoginInteractorImpl guestLoginInteractorImpl, DefaultOnboardingContentPageDataProviderImpl defaultOnboardingContentPageDataProviderImpl) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = analyticsManager;
        this.f = branchDeepLinkInteractorImpl;
        this.g = onboardingInteractorImpl;
        this.h = guestLoginInteractorImpl;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.i = sharedFlowImplB;
        this.j = FlowKt.a(sharedFlowImplB);
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(OnboardingSduiContract.ViewState.Loading.f7970a);
        this.k = mutableStateFlowA;
        this.l = FlowKt.b(mutableStateFlowA);
        OnboardingContentPageData onboardingContentPageDataA = null;
        try {
            GetOnboardingContentPageQuery.Data data = (GetOnboardingContentPageQuery.Data) ApolloOperationExtKt.a(new GetOnboardingContentPageQuery(), defaultOnboardingContentPageDataProviderImpl.f7963a).c;
            if (data != null) {
                onboardingContentPageDataA = GetOnboardingContentPageQueryGetOnboardingContentPageExtKt.a(data.f12501a);
            }
        } catch (Exception e) {
            Timber.f27013a.d("error parseFromAssets", e, new Object[0]);
        }
        if (onboardingContentPageDataA != null) {
            mutableStateFlowA.setValue(new OnboardingSduiContract.ViewState.OnboardingContent(onboardingContentPageDataA));
        }
    }

    public final void p6(ButtonActionData buttonActionData) {
        Timber.f27013a.b("onFooterButtonClick " + buttonActionData, new Object[0]);
        OnboardingFooterButtonAction onboardingFooterButtonAction = buttonActionData != null ? buttonActionData.b : null;
        int i = onboardingFooterButtonAction == null ? -1 : WhenMappings.f7972a[onboardingFooterButtonAction.ordinal()];
        if (i != -1) {
            AnalyticsManager analyticsManager = this.e;
            SharedFlowImpl sharedFlowImpl = this.i;
            if (i == 1) {
                this.m = new OnboardingSduiViewModel$onLoginClicked$1(0, this, OnboardingSduiViewModel.class, "onboardingFinished", "onboardingFinished()V", 0);
                sharedFlowImpl.f(OnboardingSduiContract.NavigationAction.LaunchLogin.f7965a);
                analyticsManager.j(OnboardingActionData.f, TrackingMetadata.Companion.a(TrackableValue.b1, CallToActionVariant.d));
                return;
            } else if (i == 2) {
                this.m = new OnboardingSduiViewModel$onSignupClicked$1(0, this, OnboardingSduiViewModel.class, "onboardingFinished", "onboardingFinished()V", 0);
                sharedFlowImpl.f(OnboardingSduiContract.NavigationAction.LaunchSignup.f7966a);
                analyticsManager.j(OnboardingActionData.e, TrackingMetadata.Companion.a(TrackableValue.b1, CallToActionVariant.d));
                return;
            } else if (i == 3) {
                q6();
                return;
            } else if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.m = null;
    }

    public final void q6() {
        this.m = new OnboardingSduiViewModel$onLoginAsGuestClicked$1(this);
        BuildersKt.c(ViewModelKt.a(this), null, null, new OnboardingSduiViewModel$onLoginAsGuestClicked$2(this, null), 3);
        this.e.j(OnboardingActionData.g, TrackingMetadata.Companion.a(TrackableValue.b1, CallToActionVariant.d));
    }

    public final void r6() {
        this.g.a();
        BranchDeepLinkInteractorImpl branchDeepLinkInteractorImpl = this.f;
        boolean zE = branchDeepLinkInteractorImpl.e(branchDeepLinkInteractorImpl.b());
        SharedFlowImpl sharedFlowImpl = this.i;
        if (zE) {
            sharedFlowImpl.f(new OnboardingSduiContract.NavigationAction.NavigateToBranchLink(branchDeepLinkInteractorImpl.b()));
        } else {
            sharedFlowImpl.f(OnboardingSduiContract.NavigationAction.NavigateToHomePage.f7969a);
        }
    }
}
