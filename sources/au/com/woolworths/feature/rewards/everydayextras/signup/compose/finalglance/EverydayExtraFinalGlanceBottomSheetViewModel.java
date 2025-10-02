package au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.rewards.everydayextrasignup.EdxFinalglanceAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.finalglance.EverydayExtraFinalGlanceContent;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.finalglance.EverydayExtrasFinalGlanceContentItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.finalglance.OfferActivationState;
import au.com.woolworths.feature.rewards.everydayextras.signup.finalglance.EverydayExtrasFinalGlanceInteractorImpl;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/finalglance/EverydayExtraFinalGlanceBottomSheetViewModel;", "Landroidx/lifecycle/ViewModel;", "Companion", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EverydayExtraFinalGlanceBottomSheetViewModel extends ViewModel {
    public final EverydayExtrasFinalGlanceInteractorImpl e;
    public final AnalyticsManager f;
    public final MutableStateFlow g;
    public final StateFlow h;
    public final BufferedChannel i;
    public final Flow j;
    public String k;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/finalglance/EverydayExtraFinalGlanceBottomSheetViewModel$Companion;", "", "", "DEFAULT_ANALYTICS_CATEGORY", "Ljava/lang/String;", "DEFAULT_ANALYTICS_DESCRIPTION", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public EverydayExtraFinalGlanceBottomSheetViewModel(EverydayExtrasFinalGlanceInteractorImpl everydayExtrasFinalGlanceInteractorImpl, AnalyticsManager analyticsManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = everydayExtrasFinalGlanceInteractorImpl;
        this.f = analyticsManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(EverydayExtraFinalGlanceContract.ViewState.Loading.f6088a);
        this.g = mutableStateFlowA;
        this.h = FlowKt.b(mutableStateFlowA);
        BufferedChannel bufferedChannelA = ChannelKt.a(0, 7, null);
        this.i = bufferedChannelA;
        this.j = FlowKt.I(bufferedChannelA);
        analyticsManager.f(EdxFinalglanceAnalytics.Finalglance.d);
    }

    public static final void p6(EverydayExtraFinalGlanceBottomSheetViewModel everydayExtraFinalGlanceBottomSheetViewModel, EverydayExtraFinalGlanceContent everydayExtraFinalGlanceContent) {
        List list = everydayExtraFinalGlanceContent.f6149a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof EverydayExtrasFinalGlanceContentItem.TitleTextItem) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EverydayExtrasFinalGlanceContentItem.TitleTextItem) it.next()).d);
        }
        final String str = (String) CollectionsKt.F(arrayList2);
        if (str == null) {
            str = "No title found";
        }
        AnalyticsManager analyticsManager = everydayExtraFinalGlanceBottomSheetViewModel.f;
        EdxFinalglanceAnalytics.Finalglance.Action.d.getClass();
        analyticsManager.g(new Event(str) { // from class: au.com.woolworths.analytics.rewards.everydayextrasignup.EdxFinalglanceAnalytics$Finalglance$Action$Companion$load$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                spreadBuilder.b(EdxFinalglanceAnalytics.Finalglance.f);
                spreadBuilder.a(new Pair("event.Action", "bottomsheet_impression"));
                spreadBuilder.a(new Pair("event.Category", "Final Glance"));
                a.y("event.Label", str, spreadBuilder);
                ArrayList arrayList3 = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList3.toArray(new Pair[arrayList3.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "finalglance_bottomsheet_impression";
            }

            public final boolean equals(Object obj2) {
                if (!(obj2 instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj2;
                return "finalglance_bottomsheet_impression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
    }

    public final void q6(String str) {
        BuildersKt.c(ViewModelKt.a(this), null, null, new EverydayExtraFinalGlanceBottomSheetViewModel$fetchFinalGlanceFeed$1(this, str, null), 3);
    }

    public final void r6() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new EverydayExtraFinalGlanceBottomSheetViewModel$onBottomSheetDismissed$1(this, null), 3);
    }

    public final void s6() {
        Object value;
        MutableStateFlow mutableStateFlow = this.g;
        EverydayExtraFinalGlanceContract.ViewState.Content contentB = ((EverydayExtraFinalGlanceContract.ViewState) mutableStateFlow.getValue()).b();
        if (contentB != null) {
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value, EverydayExtraFinalGlanceContract.ViewState.Content.c(contentB, OfferActivationState.e)));
        }
        BuildersKt.c(ViewModelKt.a(this), null, null, new EverydayExtraFinalGlanceBottomSheetViewModel$onCtaClicked$2(this, null), 3);
    }

    public final void t6() {
        Object value;
        MutableStateFlow mutableStateFlow = this.g;
        EverydayExtraFinalGlanceContract.ViewState.Content contentB = ((EverydayExtraFinalGlanceContract.ViewState) mutableStateFlow.getValue()).b();
        if (contentB != null) {
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value, EverydayExtraFinalGlanceContract.ViewState.Content.c(contentB, OfferActivationState.d)));
        }
    }

    public final void u6(final String ctaLabel, final String str, final String str2) {
        Intrinsics.h(ctaLabel, "ctaLabel");
        EdxFinalglanceAnalytics.Finalglance.Action.Companion companion = EdxFinalglanceAnalytics.Finalglance.Action.d;
        if (str2 == null) {
            str2 = "Final Glance";
        }
        if (str == null) {
            str = "SWOP";
        }
        companion.getClass();
        this.f.g(new Event(str2, str, ctaLabel) { // from class: au.com.woolworths.analytics.rewards.everydayextrasignup.EdxFinalglanceAnalytics$Finalglance$Action$Companion$alertClick$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(EdxFinalglanceAnalytics.Finalglance.f);
                spreadBuilder.a(new Pair("event.Action", "alert_click"));
                spreadBuilder.a(new Pair("event.Category", str2));
                spreadBuilder.a(new Pair("event.Label", androidx.compose.ui.input.pointer.a.m("event.Description", str, spreadBuilder, ctaLabel)));
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "finalglance_alert_click";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "finalglance_alert_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
    }

    public final void v6(final String dialogTitle, final String str, final String str2) {
        Intrinsics.h(dialogTitle, "dialogTitle");
        EdxFinalglanceAnalytics.Finalglance.Action.Companion companion = EdxFinalglanceAnalytics.Finalglance.Action.d;
        if (str2 == null) {
            str2 = "Final Glance";
        }
        if (str == null) {
            str = "SWOP";
        }
        companion.getClass();
        this.f.g(new Event(str2, str, dialogTitle) { // from class: au.com.woolworths.analytics.rewards.everydayextrasignup.EdxFinalglanceAnalytics$Finalglance$Action$Companion$alertImpression$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(EdxFinalglanceAnalytics.Finalglance.f);
                spreadBuilder.a(new Pair("event.Action", "alert_impression"));
                spreadBuilder.a(new Pair("event.Category", str2));
                spreadBuilder.a(new Pair("event.Label", androidx.compose.ui.input.pointer.a.m("event.Description", str, spreadBuilder, dialogTitle)));
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "finalglance_alert_impression";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "finalglance_alert_impression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
    }
}
