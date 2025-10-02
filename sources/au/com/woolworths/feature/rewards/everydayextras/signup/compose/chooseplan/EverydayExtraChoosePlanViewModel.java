package au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.rewards.everydayextrasignup.EdxChooseplanAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpInteractor;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.EverydayExtraChoosePlanContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasChoosePlanContent;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasChoosePlanContentItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasChoosePlanFeed;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonActionType;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessageInteractorImpl;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0011\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/chooseplan/EverydayExtraChoosePlanViewModel;", "Landroidx/lifecycle/ViewModel;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public class EverydayExtraChoosePlanViewModel extends ViewModel {
    public final EverydayExtrasSignUpInteractor e;
    public final EverydayExtraChoosePlanInteractorImpl f;
    public final RewardsServiceMessageInteractorImpl g;
    public final AnalyticsManager h;
    public final MutableStateFlow i;
    public final StateFlow j;
    public EverydayExtrasChoosePlanFeed k;
    public RewardsServiceMessage l;

    public EverydayExtraChoosePlanViewModel(EverydayExtrasSignUpInteractor signUpInteractor, EverydayExtraChoosePlanInteractorImpl everydayExtraChoosePlanInteractorImpl, RewardsServiceMessageInteractorImpl rewardsServiceMessageInteractorImpl, AnalyticsManager analyticsManager) {
        Intrinsics.h(signUpInteractor, "signUpInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = signUpInteractor;
        this.f = everydayExtraChoosePlanInteractorImpl;
        this.g = rewardsServiceMessageInteractorImpl;
        this.h = analyticsManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(EverydayExtraChoosePlanContract.ViewState.Loading.f6070a);
        this.i = mutableStateFlowA;
        this.j = FlowKt.b(mutableStateFlowA);
        BuildersKt.c(ViewModelKt.a(this), null, null, new EverydayExtraChoosePlanViewModel$observeServiceMessage$1(this, null), 3);
    }

    public static EverydayExtrasChoosePlanFeed r6(EverydayExtrasChoosePlanContentItem.SubscribePlan subscribePlan, EverydayExtrasChoosePlanFeed everydayExtrasChoosePlanFeed) {
        EverydayExtrasChoosePlanContent everydayExtrasChoosePlanContent;
        if (subscribePlan == null) {
            EverydayExtrasChoosePlanContent everydayExtrasChoosePlanContent2 = everydayExtrasChoosePlanFeed.b;
            List list = everydayExtrasChoosePlanContent2.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                EverydayExtrasChoosePlanContentItem everydayExtrasChoosePlanContentItem = (EverydayExtrasChoosePlanContentItem) obj;
                if (!(everydayExtrasChoosePlanContentItem instanceof EverydayExtrasChoosePlanContentItem.Button) || ((EverydayExtrasChoosePlanContentItem.Button) everydayExtrasChoosePlanContentItem).e != EverydayExtrasButtonActionType.d) {
                    arrayList.add(obj);
                }
            }
            everydayExtrasChoosePlanContent = new EverydayExtrasChoosePlanContent(everydayExtrasChoosePlanContent2.f6145a, arrayList);
        } else {
            everydayExtrasChoosePlanContent = everydayExtrasChoosePlanFeed.b;
        }
        return EverydayExtrasChoosePlanFeed.a(everydayExtrasChoosePlanFeed, everydayExtrasChoosePlanContent, subscribePlan == null ? null : everydayExtrasChoosePlanFeed.c, 1);
    }

    public void p6() {
        q6(new EverydayExtraChoosePlanViewModel$fetchChoosePlanFeed$1(this, null));
    }

    public final void q6(Function1 function1) {
        BuildersKt.c(ViewModelKt.a(this), null, null, new EverydayExtraChoosePlanViewModel$fetchChoosePlanFeedProcess$1(this, function1, null), 3);
    }

    public final void s6() {
        EverydayExtraChoosePlanContract.ViewState.Content contentB = ((EverydayExtraChoosePlanContract.ViewState) this.i.getValue()).b();
        EverydayExtrasChoosePlanContentItem.SubscribePlan subscribePlan = contentB != null ? contentB.d : null;
        if (subscribePlan != null) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new EverydayExtraChoosePlanViewModel$navigateToSummaryScreen$1$1(this, subscribePlan, null), 3);
        }
    }

    public final void t6() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new EverydayExtraChoosePlanViewModel$onSignUpBackBtnClicked$1(this, null), 3);
    }

    public final void u6() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new EverydayExtraChoosePlanViewModel$onSignUpCloseBtnClicked$1(this, null), 3);
    }

    public final void v6(EverydayExtrasChoosePlanContentItem.SubscribePlan subscribePlan) {
        Object value;
        Intrinsics.h(subscribePlan, "subscribePlan");
        MutableStateFlow mutableStateFlow = this.i;
        EverydayExtraChoosePlanContract.ViewState.Content contentB = ((EverydayExtraChoosePlanContract.ViewState) mutableStateFlow.getValue()).b();
        if (contentB != null) {
            if (Intrinsics.c(contentB.d, subscribePlan)) {
                subscribePlan = null;
            }
            EverydayExtrasChoosePlanFeed everydayExtrasChoosePlanFeed = this.k;
            if (everydayExtrasChoosePlanFeed != null) {
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value, EverydayExtraChoosePlanContract.ViewState.Content.c(contentB, r6(subscribePlan, everydayExtrasChoosePlanFeed), null, subscribePlan, 6)));
            }
        }
    }

    public final void w6(String str) {
        BuildersKt.c(ViewModelKt.a(this), null, null, new EverydayExtraChoosePlanViewModel$openUrl$1(this, str, null), 3);
    }

    public final void x6(final String buttonLabel) {
        Intrinsics.h(buttonLabel, "buttonLabel");
        EdxChooseplanAnalytics.ChoosePlan.Action.Companion companion = EdxChooseplanAnalytics.ChoosePlan.Action.d;
        EverydayExtraChoosePlanContract.ViewState.Content contentB = ((EverydayExtraChoosePlanContract.ViewState) this.i.getValue()).b();
        EverydayExtrasChoosePlanContentItem.SubscribePlan subscribePlan = contentB != null ? contentB.d : null;
        final String str = subscribePlan != null ? subscribePlan.e : null;
        if (str == null) {
            str = "";
        }
        companion.getClass();
        this.h.g(new Event(buttonLabel, str) { // from class: au.com.woolworths.analytics.rewards.everydayextrasignup.EdxChooseplanAnalytics$ChoosePlan$Action$Companion$submitClick$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(EdxChooseplanAnalytics.ChoosePlan.f);
                spreadBuilder.a(new Pair("event.Action", "click"));
                spreadBuilder.a(new Pair("event.Category", "button"));
                a.z("event.Label", YU.a.A("EDX ", buttonLabel), spreadBuilder, "event.Description", str);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "button_click";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "button_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
    }
}
