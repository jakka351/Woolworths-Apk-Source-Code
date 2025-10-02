package au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.rewards.everydayextrasignup.EdxSummaryAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.base.wallet.digipay.framesview.CardDetails;
import au.com.woolworths.base.wallet.digipay.framesview.FramesWebView;
import au.com.woolworths.base.wallet.digipay.framesview.ThreeDSError;
import au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpInteractor;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.l;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtraSubscribeAlertDialog;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.AlertDialogAnalytics;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.summary.EverydayExtrasSummaryContentItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.summary.EverydayExtrasSummaryFeed;
import au.com.woolworths.feature.rewards.everydayextras.signup.summary.EverydayExtrasSummaryInteractorImpl;
import au.com.woolworths.feature.rewards.everydayextras.signup.summary.wpay.WPayLoadingState;
import au.com.woolworths.feature.rewards.everydayextras.signup.summary.wpay.WPayManagerImpl;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.rewards.common.ui.errors.data.FullPageError;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessageInteractorImpl;
import com.google.gson.JsonParseException;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryViewModel;", "Landroidx/lifecycle/ViewModel;", "RequestingStep", "Companion", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EverydayExtraSummaryViewModel extends ViewModel {
    public final EverydayExtrasSignUpInteractor e;
    public final EverydayExtrasSummaryInteractorImpl f;
    public final RewardsServiceMessageInteractorImpl g;
    public final WPayManagerImpl h;
    public final AnalyticsManager i;
    public final FeatureToggleManager j;
    public String k;
    public String l;
    public RequestingStep m;
    public final SharedFlowImpl n;
    public final Flow o;
    public final MutableStateFlow p;
    public final StateFlow q;
    public RewardsServiceMessage r;
    public final Lazy s;
    public boolean t;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryViewModel$Companion;", "", "", "SCAN_CARD_LIBRARY_OCR", "Ljava/lang/String;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryViewModel$RequestingStep;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RequestingStep {
        public static final RequestingStep d;
        public static final RequestingStep e;
        public static final /* synthetic */ RequestingStep[] f;
        public static final /* synthetic */ EnumEntries g;

        static {
            RequestingStep requestingStep = new RequestingStep("REQUEST_SUMMARY_FEED", 0);
            d = requestingStep;
            RequestingStep requestingStep2 = new RequestingStep("REQUEST_SUBSCRIBE", 1);
            e = requestingStep2;
            RequestingStep[] requestingStepArr = {requestingStep, requestingStep2};
            f = requestingStepArr;
            g = EnumEntriesKt.a(requestingStepArr);
        }

        public static RequestingStep valueOf(String str) {
            return (RequestingStep) Enum.valueOf(RequestingStep.class, str);
        }

        public static RequestingStep[] values() {
            return (RequestingStep[]) f.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[RequestingStep.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RequestingStep requestingStep = RequestingStep.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ThreeDSError.values().length];
            try {
                iArr2[5] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ThreeDSError.Companion companion = ThreeDSError.INSTANCE;
                iArr2[3] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ThreeDSError.Companion companion2 = ThreeDSError.INSTANCE;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ThreeDSError.Companion companion3 = ThreeDSError.INSTANCE;
                iArr2[6] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ThreeDSError.Companion companion4 = ThreeDSError.INSTANCE;
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public EverydayExtraSummaryViewModel(EverydayExtrasSignUpInteractor signUpInteractor, EverydayExtrasSummaryInteractorImpl everydayExtrasSummaryInteractorImpl, RewardsServiceMessageInteractorImpl rewardsServiceMessageInteractorImpl, WPayManagerImpl wPayManagerImpl, AnalyticsManager analyticsManager, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(signUpInteractor, "signUpInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.e = signUpInteractor;
        this.f = everydayExtrasSummaryInteractorImpl;
        this.g = rewardsServiceMessageInteractorImpl;
        this.h = wPayManagerImpl;
        this.i = analyticsManager;
        this.j = featureToggleManager;
        this.m = RequestingStep.d;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.n = sharedFlowImplB;
        this.o = FlowKt.a(sharedFlowImplB);
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(EverydayExtraSummaryContract.ViewState.Loading.f6133a);
        this.p = mutableStateFlowA;
        this.q = FlowKt.b(mutableStateFlowA);
        this.s = LazyKt.b(new androidx.lifecycle.a(this, 28));
        BuildersKt.c(ViewModelKt.a(this), null, null, new EverydayExtraSummaryViewModel$observeServiceMessage$1(this, null), 3);
    }

    public static final void p6(EverydayExtraSummaryViewModel everydayExtraSummaryViewModel, EverydayExtrasSummaryFeed everydayExtrasSummaryFeed, boolean z) {
        Object value;
        EverydayExtraSummaryContract.ViewState.Content content;
        MutableStateFlow mutableStateFlow = everydayExtraSummaryViewModel.p;
        do {
            value = mutableStateFlow.getValue();
            EverydayExtraSummaryContract.ViewState.Content contentB = ((EverydayExtraSummaryContract.ViewState) mutableStateFlow.getValue()).b();
            if (contentB != null) {
                content = EverydayExtraSummaryContract.ViewState.Content.c(contentB, everydayExtrasSummaryFeed, false, z ? WPayLoadingState.e : WPayLoadingState.d, null, null, false, false, false, null, everydayExtraSummaryViewModel.r, 504);
            } else {
                content = new EverydayExtraSummaryContract.ViewState.Content(everydayExtrasSummaryFeed, z ? WPayLoadingState.e : WPayLoadingState.d, everydayExtraSummaryViewModel.r, 504);
            }
        } while (!mutableStateFlow.d(value, content));
    }

    public static final void q6(EverydayExtraSummaryViewModel everydayExtraSummaryViewModel, boolean z) {
        try {
            everydayExtraSummaryViewModel.h.a(z, new l(everydayExtraSummaryViewModel, 2), new h(29), (FramesWebView.Callback) everydayExtraSummaryViewModel.s.getD());
        } catch (JsonParseException e) {
            Bark.Companion companion = Bark.f8483a;
            Bark.Barker.c(new ReportOwner(ReportOwner.Squad.e), e, "JSON: Could not create Digipay token", 8);
            everydayExtraSummaryViewModel.u6(FullPageError.ServerError.f8582a);
        }
    }

    public static final boolean r6(EverydayExtraSummaryViewModel everydayExtraSummaryViewModel, EverydayExtrasSummaryFeed everydayExtrasSummaryFeed) {
        List list = everydayExtrasSummaryFeed.b.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof EverydayExtrasSummaryContentItem.WpayPayment) {
                arrayList.add(obj);
            }
        }
        return !arrayList.isEmpty();
    }

    public static final void s6(EverydayExtraSummaryViewModel everydayExtraSummaryViewModel, EverydayExtraSubscribeAlertDialog everydayExtraSubscribeAlertDialog) {
        Object value;
        MutableStateFlow mutableStateFlow = everydayExtraSummaryViewModel.p;
        AnalyticsManager analyticsManager = everydayExtraSummaryViewModel.i;
        EdxSummaryAnalytics.Summary.Action.Companion companion = EdxSummaryAnalytics.Summary.Action.d;
        final String label = everydayExtraSubscribeAlertDialog.d;
        AlertDialogAnalytics alertDialogAnalytics = everydayExtraSubscribeAlertDialog.h;
        final String str = alertDialogAnalytics != null ? alertDialogAnalytics.e : null;
        final String str2 = alertDialogAnalytics != null ? alertDialogAnalytics.d : null;
        companion.getClass();
        Intrinsics.h(label, "label");
        analyticsManager.g(new Event(str2, str, label) { // from class: au.com.woolworths.analytics.rewards.everydayextrasignup.EdxSummaryAnalytics$Summary$Action$Companion$alertImpression$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(EdxSummaryAnalytics.Summary.f);
                a.y("event.Action", "alert_impression", spreadBuilder);
                a.y("event.Category", str2 == null ? "" : str2, spreadBuilder);
                spreadBuilder.a(new Pair("event.Label", androidx.compose.ui.input.pointer.a.m("event.Description", str == null ? "" : str, spreadBuilder, label)));
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "everydayextrasummary_alert_impression";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "everydayextrasummary_alert_impression".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        EverydayExtraSummaryContract.ViewState.Content contentB = ((EverydayExtraSummaryContract.ViewState) mutableStateFlow.getValue()).b();
        if (contentB != null) {
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value, EverydayExtraSummaryContract.ViewState.Content.c(contentB, null, false, null, null, null, false, false, false, null, null, 991)));
        }
        everydayExtraSummaryViewModel.n.f(new EverydayExtraSummaryContract.Action.ShowSubscribeAlert(everydayExtraSubscribeAlertDialog));
    }

    public static final void t6(EverydayExtraSummaryViewModel everydayExtraSummaryViewModel, int i, int i2) {
        Object value;
        everydayExtraSummaryViewModel.i.g(EdxSummaryAnalytics.Summary.Action.f);
        MutableStateFlow mutableStateFlow = everydayExtraSummaryViewModel.p;
        EverydayExtraSummaryContract.ViewState.Content contentB = ((EverydayExtraSummaryContract.ViewState) mutableStateFlow.getValue()).b();
        if (contentB != null) {
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value, EverydayExtraSummaryContract.ViewState.Content.c(contentB, null, false, null, null, null, false, false, false, null, null, 991)));
        }
        everydayExtraSummaryViewModel.n.f(new EverydayExtraSummaryContract.Action.ShowErrorAlert(i, i2));
    }

    public final void A6() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new EverydayExtraSummaryViewModel$onSignUpCloseBtnClicked$1(this, null), 3);
    }

    public final void B6(String str, String str2, String str3) {
        this.m = RequestingStep.e;
        FullPageError.ServerError serverError = FullPageError.ServerError.f8582a;
        if (str == null) {
            Bark.Companion companion = Bark.f8483a;
            Bark.f8483a.f(new ReportOwner(ReportOwner.Squad.e), "planIdentifier can not be null", null);
            u6(serverError);
        } else if (str2 == null) {
            Bark.Companion companion2 = Bark.f8483a;
            Bark.f8483a.f(new ReportOwner(ReportOwner.Squad.e), "paymentInstrumentId can not be null", null);
            u6(serverError);
        } else {
            if (str3 != null) {
                BuildersKt.c(ViewModelKt.a(this), null, null, new EverydayExtraSummaryViewModel$requestSubscribe$1(this, str, str2, str3, null), 3);
                return;
            }
            Bark.Companion companion3 = Bark.f8483a;
            Bark.f8483a.f(new ReportOwner(ReportOwner.Squad.e), "stepUpToken can not be null", null);
            u6(serverError);
        }
    }

    public final void u6(FullPageError fullPageError) {
        Object value;
        Object value2;
        MutableStateFlow mutableStateFlow = this.p;
        EverydayExtraSummaryContract.ViewState viewState = (EverydayExtraSummaryContract.ViewState) mutableStateFlow.getValue();
        if (viewState instanceof EverydayExtraSummaryContract.ViewState.Content) {
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value2, EverydayExtraSummaryContract.ViewState.Content.c((EverydayExtraSummaryContract.ViewState.Content) viewState, null, false, null, null, null, false, false, false, null, null, 1021)));
        } else {
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value, new EverydayExtraSummaryContract.ViewState.Error(fullPageError)));
        }
    }

    public final void v6() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new EverydayExtraSummaryViewModel$fetchSummaryFeed$1(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010b A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w6(au.com.woolworths.base.wallet.digipay.framesview.Error r19) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryViewModel.w6(au.com.woolworths.base.wallet.digipay.framesview.Error):void");
    }

    public final void x6(CardDetails cardDetails, boolean z) {
        if (z) {
            this.n.f(new EverydayExtraSummaryContract.Action.InjectCardDetails(cardDetails));
        } else {
            MutableStateFlow mutableStateFlow = this.p;
            EverydayExtraSummaryContract.ViewState.Content contentB = ((EverydayExtraSummaryContract.ViewState) mutableStateFlow.getValue()).b();
            if (contentB != null) {
                while (true) {
                    Object value = mutableStateFlow.getValue();
                    CardDetails cardDetails2 = cardDetails;
                    if (mutableStateFlow.d(value, EverydayExtraSummaryContract.ViewState.Content.c(contentB, null, false, null, null, null, false, false, false, cardDetails2, null, 767))) {
                        break;
                    } else {
                        cardDetails = cardDetails2;
                    }
                }
            }
        }
        this.i.g(EdxSummaryAnalytics.Summary.Action.m);
    }

    public final void y6(ContentCta contentCta) {
        Intrinsics.h(contentCta, "contentCta");
        EdxSummaryAnalytics.Summary.Action.Companion companion = EdxSummaryAnalytics.Summary.Action.d;
        AnalyticsData onCtaClickAnalytics = contentCta.getOnCtaClickAnalytics();
        final String eventLabel = onCtaClickAnalytics != null ? onCtaClickAnalytics.getEventLabel() : null;
        if (eventLabel == null) {
            eventLabel = "";
        }
        AnalyticsData onCtaClickAnalytics2 = contentCta.getOnCtaClickAnalytics();
        String eventDescription = onCtaClickAnalytics2 != null ? onCtaClickAnalytics2.getEventDescription() : null;
        final String str = eventDescription != null ? eventDescription : "";
        companion.getClass();
        this.i.g(new Event(eventLabel, str) { // from class: au.com.woolworths.analytics.rewards.everydayextrasignup.EdxSummaryAnalytics$Summary$Action$Companion$alertClick$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(EdxSummaryAnalytics.Summary.f);
                spreadBuilder.a(new Pair("event.Action", "alert_click"));
                spreadBuilder.a(new Pair("event.Category", ""));
                a.z("event.Label", eventLabel, spreadBuilder, "event.Description", str);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "everydayextrasummary_alert_click";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "everydayextrasummary_alert_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        String url = contentCta.getUrl();
        if (url != null) {
            this.n.f(new EverydayExtraSummaryContract.Action.OpenUrl(url));
        }
    }

    public final void z6() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new EverydayExtraSummaryViewModel$onSignUpBackBtnClicked$1(this, null), 3);
    }
}
