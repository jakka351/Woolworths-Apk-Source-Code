package au.com.woolworths.feature.shop.voc.score;

import android.widget.RatingBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import androidx.lifecycle.CoroutineLiveData;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.vocsurvey.VocSurveyAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.feature.shop.voc.data.SurveyData;
import au.com.woolworths.feature.shop.voc.data.SurveyQuestion;
import au.com.woolworths.feature.shop.voc.data.SurveyQuestionType;
import au.com.woolworths.feature.shop.voc.data.SurveySubmitData;
import au.com.woolworths.feature.shop.voc.score.VocContract;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/voc/score/VocViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroid/widget/RatingBar$OnRatingBarChangeListener;", "Companion", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class VocViewModel extends ViewModel implements RatingBar.OnRatingBarChangeListener {
    public final VocInteractor e;
    public final AnalyticsManager f;
    public final FeatureToggleManager g;
    public final MutableStateFlow h;
    public final SharedFlowImpl i;
    public final CoroutineLiveData j;
    public final StateFlow k;
    public final Flow l;
    public Long m;
    public SurveyData n;
    public int o;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.voc.score.VocViewModel$1", f = "VocViewModel.kt", l = {71}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.voc.score.VocViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return VocViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                this.p = 1;
                if (VocViewModel.q6(VocViewModel.this, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/shop/voc/score/VocViewModel$Companion;", "", "", "VOC_ANIMATION_SHOW_DELAY", "J", "VOC_ANIMATION_BUTTON_SELECTED_DELAY", "VOC_ANIMATION_DISMISS_WITH_COMMENT_DELAY", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8238a;

        static {
            int[] iArr = new int[SurveyQuestionType.values().length];
            try {
                SurveyQuestionType surveyQuestionType = SurveyQuestionType.e;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SurveyQuestionType surveyQuestionType2 = SurveyQuestionType.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                SurveyQuestionType surveyQuestionType3 = SurveyQuestionType.e;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f8238a = iArr;
        }
    }

    public VocViewModel(VocInteractor vocInteractor, AnalyticsManager analyticsManager, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.e = vocInteractor;
        this.f = analyticsManager;
        this.g = featureToggleManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(VocContract.ViewState.m);
        this.h = mutableStateFlowA;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.i = sharedFlowImplB;
        this.j = FlowLiveDataConversions.b(mutableStateFlowA, null, 3);
        this.k = FlowKt.b(mutableStateFlowA);
        this.l = FlowKt.a(sharedFlowImplB);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object p6(au.com.woolworths.feature.shop.voc.score.VocViewModel r4, au.com.woolworths.feature.shop.voc.score.VocContract.ViewState r5, long r6, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r4.getClass()
            boolean r0 = r8 instanceof au.com.woolworths.feature.shop.voc.score.VocViewModel$changeStateWithDelay$1
            if (r0 == 0) goto L16
            r0 = r8
            au.com.woolworths.feature.shop.voc.score.VocViewModel$changeStateWithDelay$1 r0 = (au.com.woolworths.feature.shop.voc.score.VocViewModel$changeStateWithDelay$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.s = r1
            goto L1b
        L16:
            au.com.woolworths.feature.shop.voc.score.VocViewModel$changeStateWithDelay$1 r0 = new au.com.woolworths.feature.shop.voc.score.VocViewModel$changeStateWithDelay$1
            r0.<init>(r4, r8)
        L1b:
            java.lang.Object r8 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            au.com.woolworths.feature.shop.voc.score.VocContract$ViewState r5 = r0.p
            kotlin.ResultKt.b(r8)
            goto L42
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.ResultKt.b(r8)
            r0.p = r5
            r0.s = r3
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.b(r6, r0)
            if (r6 != r1) goto L42
            return r1
        L42:
            r4.r6(r5)
            kotlin.Unit r4 = kotlin.Unit.f24250a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.voc.score.VocViewModel.p6(au.com.woolworths.feature.shop.voc.score.VocViewModel, au.com.woolworths.feature.shop.voc.score.VocContract$ViewState, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object q6(au.com.woolworths.feature.shop.voc.score.VocViewModel r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) throws java.lang.Exception {
        /*
            boolean r0 = r5 instanceof au.com.woolworths.feature.shop.voc.score.VocViewModel$fetchSurveyData$1
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.feature.shop.voc.score.VocViewModel$fetchSurveyData$1 r0 = (au.com.woolworths.feature.shop.voc.score.VocViewModel$fetchSurveyData$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.voc.score.VocViewModel$fetchSurveyData$1 r0 = new au.com.woolworths.feature.shop.voc.score.VocViewModel$fetchSurveyData$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            au.com.woolworths.feature.shop.voc.score.VocViewModel r0 = r0.p
            kotlin.ResultKt.b(r5)
            goto L42
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.b(r5)
            au.com.woolworths.feature.shop.voc.score.VocInteractor r5 = r4.e
            r0.p = r4
            r0.s = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r0 = r4
        L42:
            au.com.woolworths.feature.shop.voc.data.SurveyData r5 = (au.com.woolworths.feature.shop.voc.data.SurveyData) r5
            r0.n = r5
            au.com.woolworths.feature.shop.voc.data.SurveyData r5 = r4.n
            if (r5 == 0) goto L62
            kotlinx.coroutines.flow.MutableStateFlow r5 = r4.h
            java.lang.Object r5 = r5.getValue()
            au.com.woolworths.feature.shop.voc.score.VocContract$ViewState r5 = (au.com.woolworths.feature.shop.voc.score.VocContract.ViewState) r5
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.h(r5, r0)
            boolean r5 = r5.f8234a
            if (r5 != 0) goto L62
            kotlinx.coroutines.flow.SharedFlowImpl r4 = r4.i
            au.com.woolworths.feature.shop.voc.score.VocContract$Actions$ShowVocSurvey r5 = au.com.woolworths.feature.shop.voc.score.VocContract.Actions.ShowVocSurvey.f8233a
            r4.f(r5)
        L62:
            kotlin.Unit r4 = kotlin.Unit.f24250a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.voc.score.VocViewModel.q6(au.com.woolworths.feature.shop.voc.score.VocViewModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void A6() {
        MutableStateFlow mutableStateFlow = this.h;
        VocContract.ViewState viewState = (VocContract.ViewState) mutableStateFlow.getValue();
        Intrinsics.h(viewState, "<this>");
        if (viewState.f == -1 || viewState.g) {
            return;
        }
        int i = ((VocContract.ViewState) mutableStateFlow.getValue()).f;
        SurveySubmitData surveySubmitDataT6 = t6();
        if (surveySubmitDataT6 == null || i == -1) {
            return;
        }
        BuildersKt.c(ViewModelKt.a(this), null, null, new VocViewModel$submitScoreIfRequired$1(this, surveySubmitDataT6, i, null), 3);
    }

    @Override // android.widget.RatingBar.OnRatingBarChangeListener
    public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
        y6((int) Math.ceil(f));
    }

    public final void r6(VocContract.ViewState viewState) {
        MutableStateFlow mutableStateFlow;
        Object value;
        do {
            mutableStateFlow = this.h;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, viewState));
    }

    public final SurveyQuestion s6() {
        List list;
        try {
            SurveyData surveyData = this.n;
            if (surveyData != null && (list = surveyData.e) != null) {
                return (SurveyQuestion) list.get(this.o);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return null;
    }

    public final SurveySubmitData t6() {
        String str;
        Long l = this.m;
        SurveyData surveyData = this.n;
        SurveyQuestion surveyQuestionS6 = s6();
        if (l == null || surveyData == null) {
            return null;
        }
        String str2 = surveyData.f8221a;
        String str3 = surveyData.b;
        if (surveyQuestionS6 == null || (str = surveyQuestionS6.f8222a) == null) {
            str = "dummy";
        }
        return new SurveySubmitData(str2, l.longValue(), str3, str);
    }

    public final void u6() {
        r6(VocContract.ViewState.a((VocContract.ViewState) this.h.getValue(), false, false, false, false, false, 0, null, null, null, null, null, 4031));
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v6() {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.voc.score.VocViewModel.v6():void");
    }

    public final void w6(String surveyUrl, String screenTitle, final String buttonLabel) {
        Intrinsics.h(surveyUrl, "surveyUrl");
        Intrinsics.h(screenTitle, "screenTitle");
        Intrinsics.h(buttonLabel, "buttonLabel");
        VocSurveyAnalytics.VocSurvey.Action.d.getClass();
        this.f.g(new Event(buttonLabel) { // from class: au.com.woolworths.analytics.supers.vocsurvey.VocSurveyAnalytics$VocSurvey$Action$Companion$startSurveyClick$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                spreadBuilder.b(VocSurveyAnalytics.VocSurvey.e);
                a.z("event.Category", "voc survey", spreadBuilder, "event.Action", "button_click");
                a.y("event.Label", String.valueOf(buttonLabel), spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "vocsurvey_buttonclick";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "vocsurvey_buttonclick".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        BuildersKt.c(ViewModelKt.a(this), null, null, new VocViewModel$onGiveFeedback$1(this, null), 3);
        this.i.f(new VocContract.Actions.LaunchSurveyUrl(surveyUrl, screenTitle));
    }

    public final void x6() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new VocViewModel$onLeaveComment$1(this, null), 3);
        SurveySubmitData surveySubmitDataT6 = t6();
        if (surveySubmitDataT6 != null) {
            this.i.f(new VocContract.Actions.ShowVocFreeText(surveySubmitDataT6, ((VocContract.ViewState) this.h.getValue()).f));
        }
    }

    public final void y6(int i) {
        BuildersKt.c(ViewModelKt.a(this), null, null, new VocViewModel$onPickScore$1(this, i, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z6(kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof au.com.woolworths.feature.shop.voc.score.VocViewModel$showSurveyInitialState$1
            if (r0 == 0) goto L13
            r0 = r14
            au.com.woolworths.feature.shop.voc.score.VocViewModel$showSurveyInitialState$1 r0 = (au.com.woolworths.feature.shop.voc.score.VocViewModel$showSurveyInitialState$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.voc.score.VocViewModel$showSurveyInitialState$1 r0 = new au.com.woolworths.feature.shop.voc.score.VocViewModel$showSurveyInitialState$1
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r14)
            goto L3d
        L27:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L2f:
            kotlin.ResultKt.b(r14)
            r0.r = r3
            r2 = 700(0x2bc, double:3.46E-321)
            java.lang.Object r14 = kotlinx.coroutines.DelayKt.b(r2, r0)
            if (r14 != r1) goto L3d
            return r1
        L3d:
            r14 = -1
            r13.o = r14
            au.com.woolworths.feature.shop.voc.data.SurveyData r14 = r13.n
            kotlinx.coroutines.flow.MutableStateFlow r0 = r13.h
            if (r14 == 0) goto L65
            java.lang.Object r14 = r0.getValue()
            r0 = r14
            au.com.woolworths.feature.shop.voc.score.VocContract$ViewState r0 = (au.com.woolworths.feature.shop.voc.score.VocContract.ViewState) r0
            r11 = 0
            r12 = 4094(0xffe, float:5.737E-42)
            r1 = 1
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            au.com.woolworths.feature.shop.voc.score.VocContract$ViewState r14 = au.com.woolworths.feature.shop.voc.score.VocContract.ViewState.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.r6(r14)
            r13.v6()
            goto L80
        L65:
            java.lang.Object r14 = r0.getValue()
            r0 = r14
            au.com.woolworths.feature.shop.voc.score.VocContract$ViewState r0 = (au.com.woolworths.feature.shop.voc.score.VocContract.ViewState) r0
            r11 = 0
            r12 = 4094(0xffe, float:5.737E-42)
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            au.com.woolworths.feature.shop.voc.score.VocContract$ViewState r14 = au.com.woolworths.feature.shop.voc.score.VocContract.ViewState.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.r6(r14)
        L80:
            kotlin.Unit r14 = kotlin.Unit.f24250a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.voc.score.VocViewModel.z6(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
