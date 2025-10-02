package au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.rewards.everydayextrasignup.EdxLandingAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpInteractor;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.EverydayExtraLandingContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasLandingFooterItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.AlertDialogAnalytics;
import au.com.woolworths.feature.rewards.everydayextras.signup.landing.EverydayExtrasLandingInteractorImpl;
import au.com.woolworths.foundation.rewards.common.ui.errors.data.FullPageError;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessageInteractorImpl;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/landing/EverydayExtraLandingViewModel;", "Landroidx/lifecycle/ViewModel;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EverydayExtraLandingViewModel extends ViewModel {
    public final EverydayExtrasSignUpInteractor e;
    public final EverydayExtrasLandingInteractorImpl f;
    public final RewardsServiceMessageInteractorImpl g;
    public final AnalyticsManager h;
    public final MutableStateFlow i;
    public final StateFlow j;
    public RewardsServiceMessage k;

    public EverydayExtraLandingViewModel(EverydayExtrasSignUpInteractor signUpInteractor, EverydayExtrasLandingInteractorImpl everydayExtrasLandingInteractorImpl, RewardsServiceMessageInteractorImpl rewardsServiceMessageInteractorImpl, AnalyticsManager analyticsManager) {
        Intrinsics.h(signUpInteractor, "signUpInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = signUpInteractor;
        this.f = everydayExtrasLandingInteractorImpl;
        this.g = rewardsServiceMessageInteractorImpl;
        this.h = analyticsManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(EverydayExtraLandingContract.ViewState.Loading.f6095a);
        this.i = mutableStateFlowA;
        this.j = FlowKt.b(mutableStateFlowA);
        BuildersKt.c(ViewModelKt.a(this), null, null, new EverydayExtraLandingViewModel$observeServiceMessage$1(this, null), 3);
        q6();
    }

    public static final void p6(EverydayExtraLandingViewModel everydayExtraLandingViewModel, FullPageError fullPageError) {
        Object value;
        Object value2;
        MutableStateFlow mutableStateFlow = everydayExtraLandingViewModel.i;
        EverydayExtraLandingContract.ViewState viewState = (EverydayExtraLandingContract.ViewState) mutableStateFlow.getValue();
        if (viewState instanceof EverydayExtraLandingContract.ViewState.Content) {
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value2, EverydayExtraLandingContract.ViewState.Content.c((EverydayExtraLandingContract.ViewState.Content) viewState, null, null, false, 3)));
        } else {
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value, new EverydayExtraLandingContract.ViewState.Error(fullPageError)));
        }
    }

    public final void q6() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new EverydayExtraLandingViewModel$fetchLandingFeed$1(this, null), 3);
    }

    public final void r6(ContentCta contentCta, AlertDialogAnalytics alertDialogAnalytics) {
        final String label = contentCta != null ? contentCta.getLabel() : null;
        EdxLandingAnalytics.Landing.Action.Companion companion = EdxLandingAnalytics.Landing.Action.d;
        if (label == null) {
            label = "no label";
        }
        final String str = alertDialogAnalytics != null ? alertDialogAnalytics.d : null;
        final String str2 = alertDialogAnalytics != null ? alertDialogAnalytics.e : null;
        companion.getClass();
        this.h.g(new Event(str, label, str2) { // from class: au.com.woolworths.analytics.rewards.everydayextrasignup.EdxLandingAnalytics$Landing$Action$Companion$alertClick$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(EdxLandingAnalytics.Landing.f);
                a.y("event.Action", "alert_click", spreadBuilder);
                a.z("event.Category", str == null ? "" : str, spreadBuilder, "event.Label", label);
                spreadBuilder.a(new Pair("event.Description", str2 == null ? "" : str2));
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "everydayextralanding_alert_click";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "everydayextralanding_alert_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        BuildersKt.c(ViewModelKt.a(this), null, null, new EverydayExtraLandingViewModel$onCloseAlertDialogClick$1(contentCta, this, null), 3);
    }

    public final void s6(EverydayExtrasLandingFooterItem.Button button) {
        Intrinsics.h(button, "button");
        BuildersKt.c(ViewModelKt.a(this), null, null, new EverydayExtraLandingViewModel$onPrimaryActionClicked$1(this, button, null), 3);
    }
}
