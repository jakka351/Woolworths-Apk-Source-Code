package au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.rewards.everydayextrasignup.EdxOnboardingAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpInteractor;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.EverydayExtraOnboardingContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtrasSubscribeFooterItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonActionType;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/onboarding/EverydayExtraOnboardingViewModel;", "Landroidx/lifecycle/ViewModel;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EverydayExtraOnboardingViewModel extends ViewModel {
    public final EverydayExtrasSignUpInteractor e;
    public final AnalyticsManager f;
    public final FeatureToggleManager g;
    public final SharedFlowImpl h;
    public final Flow i;
    public final MutableStateFlow j;
    public final StateFlow k;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[EverydayExtrasButtonActionType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EverydayExtrasButtonActionType everydayExtrasButtonActionType = EverydayExtrasButtonActionType.d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EverydayExtrasButtonActionType everydayExtrasButtonActionType2 = EverydayExtrasButtonActionType.d;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public EverydayExtraOnboardingViewModel(EverydayExtrasSignUpInteractor signUpInteractor, AnalyticsManager analyticsManager, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(signUpInteractor, "signUpInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.e = signUpInteractor;
        this.f = analyticsManager;
        this.g = featureToggleManager;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.h = sharedFlowImplB;
        this.i = FlowKt.a(sharedFlowImplB);
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(EverydayExtraOnboardingContract.ViewState.Loading.f6113a);
        this.j = mutableStateFlowA;
        this.k = FlowKt.b(mutableStateFlowA);
    }

    public final void p6(EverydayExtrasSubscribeFooterItem footerItem) {
        Object openUrl;
        Intrinsics.h(footerItem, "footerItem");
        boolean z = footerItem instanceof EverydayExtrasSubscribeFooterItem.Button;
        AnalyticsManager analyticsManager = this.f;
        SharedFlowImpl sharedFlowImpl = this.h;
        if (!z) {
            if (!(footerItem instanceof EverydayExtrasSubscribeFooterItem.SubscribeContentCta)) {
                throw new NoWhenBranchMatchedException();
            }
            ContentCta contentCta = ((EverydayExtrasSubscribeFooterItem.SubscribeContentCta) footerItem).d;
            String url = contentCta != null ? contentCta.getUrl() : null;
            if (url == null) {
                url = "";
            }
            sharedFlowImpl.f(new EverydayExtraOnboardingContract.Action.OpenUrl(url));
            EdxOnboardingAnalytics.Onboarding.Action.Companion companion = EdxOnboardingAnalytics.Onboarding.Action.d;
            String label = contentCta != null ? contentCta.getLabel() : null;
            final String str = label != null ? label : "";
            companion.getClass();
            analyticsManager.g(new Event(str) { // from class: au.com.woolworths.analytics.rewards.everydayextrasignup.EdxOnboardingAnalytics$Onboarding$Action$Companion$cta$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(EdxOnboardingAnalytics.Onboarding.f);
                    a.z("event.Category", "Everyday extra", spreadBuilder, "event.Action", "button_click");
                    a.y("event.Label", String.valueOf(str), spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "everydayextrawelcome_click";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj;
                    return "everydayextrawelcome_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
            return;
        }
        EverydayExtrasSubscribeFooterItem.Button button = (EverydayExtrasSubscribeFooterItem.Button) footerItem;
        int iOrdinal = button.e.ordinal();
        if (iOrdinal == 0) {
            openUrl = EverydayExtraOnboardingContract.Action.GetStarted.f6110a;
        } else if (iOrdinal == 1) {
            openUrl = EverydayExtraOnboardingContract.Action.Cancel.f6109a;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            String str2 = button.f;
            openUrl = new EverydayExtraOnboardingContract.Action.OpenUrl(str2 != null ? str2 : "");
        }
        sharedFlowImpl.f(openUrl);
        EdxOnboardingAnalytics.Onboarding.Action.Companion companion2 = EdxOnboardingAnalytics.Onboarding.Action.d;
        final String buttonLabel = button.d;
        companion2.getClass();
        Intrinsics.h(buttonLabel, "buttonLabel");
        analyticsManager.g(new Event(buttonLabel) { // from class: au.com.woolworths.analytics.rewards.everydayextrasignup.EdxOnboardingAnalytics$Onboarding$Action$Companion$cta$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                spreadBuilder.b(EdxOnboardingAnalytics.Onboarding.f);
                a.z("event.Category", "Everyday extra", spreadBuilder, "event.Action", "button_click");
                a.y("event.Label", String.valueOf(buttonLabel), spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "everydayextrawelcome_click";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "everydayextrawelcome_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
    }

    public final void q6() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new EverydayExtraOnboardingViewModel$onSignUpCloseBtnClicked$1(this, null), 3);
    }
}
