package au.com.woolworths.foundation.rewards.onboarding;

import android.app.Application;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/rewards/onboarding/ProgressiveCoachMarkManager;", "", "Action", "Companion", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProgressiveCoachMarkManager {

    /* renamed from: a, reason: collision with root package name */
    public final Application f8634a;
    public final ContextScope b;
    public final ContextScope c;
    public final MutexImpl d;
    public CoachMarkBanner e;
    public final MutableStateFlow f;
    public final StateFlow g;
    public final MutableStateFlow h;
    public final MutableStateFlow i;
    public final MutableStateFlow j;
    public final StateFlow k;
    public final SharedFlowImpl l;
    public final SharedFlow m;
    public final SharedFlowImpl n;
    public final SharedFlow o;
    public final SharedFlow p;
    public final SharedFlow q;
    public final FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 r;
    public final Json s;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$1", f = "ProgressiveCoachMarkManager.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ProgressiveCoachMarkManager.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ProgressiveCoachMarkManager progressiveCoachMarkManager = ProgressiveCoachMarkManager.this;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            try {
                Application application = progressiveCoachMarkManager.f8634a;
                String string = application.getSharedPreferences(application.getPackageName() + ".progressive_onboarding", 0).getString("steps", "");
                if (string != null) {
                    if (StringsKt.D(string)) {
                        string = null;
                    }
                    if (string != null) {
                        ProgressiveCoachMarkManager.a(progressiveCoachMarkManager, string);
                    }
                }
            } catch (Exception e) {
                Bark.Companion companion = Bark.f8483a;
                Bark.Barker.c(new ReportOwner(ReportOwner.Squad.d), e, "invalid Onboarding loaded", 8);
            }
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$2", f = "ProgressiveCoachMarkManager.kt", l = {164}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "pending", "Lau/com/woolworths/foundation/rewards/onboarding/ProgressiveCoachMarkContent;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$2$1", f = "ProgressiveCoachMarkManager.kt", l = {165}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$2$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements Function2<ProgressiveCoachMarkContent, Continuation<? super Unit>, Object> {
            public int p;
            public /* synthetic */ Object q;
            public final /* synthetic */ ProgressiveCoachMarkManager r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ProgressiveCoachMarkManager progressiveCoachMarkManager, Continuation continuation) {
                super(2, continuation);
                this.r = progressiveCoachMarkManager;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, continuation);
                anonymousClass1.q = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((ProgressiveCoachMarkContent) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                ProgressiveCoachMarkContent progressiveCoachMarkContent;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                int i = this.p;
                if (i == 0) {
                    ResultKt.b(obj);
                    ProgressiveCoachMarkContent progressiveCoachMarkContent2 = (ProgressiveCoachMarkContent) this.q;
                    this.q = progressiveCoachMarkContent2;
                    this.p = 1;
                    if (DelayKt.b(500L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    progressiveCoachMarkContent = progressiveCoachMarkContent2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    progressiveCoachMarkContent = (ProgressiveCoachMarkContent) this.q;
                    ResultKt.b(obj);
                }
                ProgressiveCoachMarkManager progressiveCoachMarkManager = this.r;
                if (Intrinsics.c(CoachMarkBannerKt.a(progressiveCoachMarkManager.e), progressiveCoachMarkContent) && progressiveCoachMarkContent != null) {
                    progressiveCoachMarkManager.e(1);
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ProgressiveCoachMarkManager.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                ProgressiveCoachMarkManager progressiveCoachMarkManager = ProgressiveCoachMarkManager.this;
                Flow flowR = FlowKt.r(progressiveCoachMarkManager.r);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(progressiveCoachMarkManager, null);
                this.p = 1;
                if (FlowKt.h(flowR, anonymousClass1, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/rewards/onboarding/ProgressiveCoachMarkManager$Action;", "", "Dismissed", "CtaClicked", "Lau/com/woolworths/foundation/rewards/onboarding/ProgressiveCoachMarkManager$Action$CtaClicked;", "Lau/com/woolworths/foundation/rewards/onboarding/ProgressiveCoachMarkManager$Action$Dismissed;", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Action {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/onboarding/ProgressiveCoachMarkManager$Action$CtaClicked;", "Lau/com/woolworths/foundation/rewards/onboarding/ProgressiveCoachMarkManager$Action;", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CtaClicked implements Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f8635a;
            public final ContentCta b;

            public CtaClicked(String title, ContentCta cta) {
                Intrinsics.h(title, "title");
                Intrinsics.h(cta, "cta");
                this.f8635a = title;
                this.b = cta;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CtaClicked)) {
                    return false;
                }
                CtaClicked ctaClicked = (CtaClicked) obj;
                return Intrinsics.c(this.f8635a, ctaClicked.f8635a) && Intrinsics.c(this.b, ctaClicked.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f8635a.hashCode() * 31);
            }

            public final String toString() {
                return "CtaClicked(title=" + this.f8635a + ", cta=" + this.b + ")";
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/onboarding/ProgressiveCoachMarkManager$Action$Dismissed;", "Lau/com/woolworths/foundation/rewards/onboarding/ProgressiveCoachMarkManager$Action;", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Dismissed implements Action {

            /* renamed from: a, reason: collision with root package name */
            public final ProgressiveCoachMarkContent f8636a;

            public Dismissed(ProgressiveCoachMarkContent progressiveCoachMarkContent) {
                this.f8636a = progressiveCoachMarkContent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Dismissed) && Intrinsics.c(this.f8636a, ((Dismissed) obj).f8636a);
            }

            public final int hashCode() {
                return this.f8636a.hashCode();
            }

            public final String toString() {
                return "Dismissed(coachMark=" + this.f8636a + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lau/com/woolworths/foundation/rewards/onboarding/ProgressiveCoachMarkManager$Companion;", "", "", "ONBOARDING_PREFERENCES", "Ljava/lang/String;", "KEY_ONBOARDING_STEPS", "NEXT_COACH_MARK", "PREVIOUS_COACH_MARK", "RESTART_COACH_MARK", "FIRST_COACH_MARK", "", "WaitForPendingCoachMark", "J", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ProgressiveCoachMarkManager(Application application, DispatcherProvider dispatcher) {
        Intrinsics.h(dispatcher, "dispatcher");
        this.f8634a = application;
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        ContextScope contextScopeA = CoroutineScopeKt.a(DefaultIoScheduler.f);
        this.b = contextScopeA;
        ContextScope contextScopeA2 = CoroutineScopeKt.a(Dispatchers.f24691a);
        this.c = contextScopeA2;
        this.d = MutexKt.a();
        CoachMarkBanner.INSTANCE.getClass();
        CoachMarkBanner coachMarkBanner = CoachMarkBanner.m;
        this.e = coachMarkBanner;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(coachMarkBanner);
        this.f = mutableStateFlowA;
        final StateFlow stateFlowB = FlowKt.b(mutableStateFlowA);
        this.g = stateFlowB;
        MutableStateFlow mutableStateFlowA2 = StateFlowKt.a(Boolean.FALSE);
        this.h = mutableStateFlowA2;
        MutableStateFlow mutableStateFlowA3 = StateFlowKt.a(null);
        this.i = mutableStateFlowA3;
        MutableStateFlow mutableStateFlowA4 = StateFlowKt.a(null);
        this.j = mutableStateFlowA4;
        this.k = FlowKt.b(mutableStateFlowA4);
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(1, 0, null, 6);
        this.l = sharedFlowImplB;
        this.m = FlowKt.a(sharedFlowImplB);
        SharedFlowImpl sharedFlowImplB2 = SharedFlowKt.b(0, 1, null, 5);
        this.n = sharedFlowImplB2;
        this.o = FlowKt.a(sharedFlowImplB2);
        SharedFlow sharedFlowM = FlowKt.M(FlowKt.r(FlowKt.C(FlowKt.G(new Flow<ProgressiveCoachMarkContent>() { // from class: au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$special$$inlined$map$1

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$special$$inlined$map$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$special$$inlined$map$1$2", f = "ProgressiveCoachMarkManager.kt", l = {50}, m = "emit")
                /* renamed from: au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$special$$inlined$map$1$2$1, reason: invalid class name */
                public final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object p;
                    public int q;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.p = obj;
                        this.q |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.d = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$special$$inlined$map$1$2$1 r0 = (au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$special$$inlined$map$1$2$1 r0 = new au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.p
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r2 = r0.q
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.ResultKt.b(r6)
                        goto L43
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        kotlin.ResultKt.b(r6)
                        au.com.woolworths.foundation.rewards.onboarding.CoachMarkBanner r5 = (au.com.woolworths.foundation.rewards.onboarding.CoachMarkBanner) r5
                        au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkContent r5 = au.com.woolworths.foundation.rewards.onboarding.CoachMarkBannerKt.a(r5)
                        r0.q = r3
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        kotlin.Unit r5 = kotlin.Unit.f24250a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = stateFlowB.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        }, mutableStateFlowA3), mutableStateFlowA2, new ProgressiveCoachMarkManager$visibleCoachMarkFlow$2(3, null))), contextScopeA2, SharingStarted.Companion.a(3), 1);
        this.p = sharedFlowM;
        this.q = FlowKt.M(FlowKt.r(new Flow<Boolean>() { // from class: au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$special$$inlined$map$2

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$special$$inlined$map$2$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$special$$inlined$map$2$2", f = "ProgressiveCoachMarkManager.kt", l = {50}, m = "emit")
                /* renamed from: au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$special$$inlined$map$2$2$1, reason: invalid class name */
                public final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object p;
                    public int q;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.p = obj;
                        this.q |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.d = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$special$$inlined$map$2$2$1 r0 = (au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$special$$inlined$map$2$2$1 r0 = new au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$special$$inlined$map$2$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.p
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r2 = r0.q
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.ResultKt.b(r6)
                        goto L52
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        kotlin.ResultKt.b(r6)
                        au.com.woolworths.foundation.rewards.onboarding.CoachMarkBanner r5 = (au.com.woolworths.foundation.rewards.onboarding.CoachMarkBanner) r5
                        boolean r6 = r5.k
                        if (r6 != 0) goto L42
                        boolean r6 = r5.h
                        if (r6 == 0) goto L42
                        boolean r5 = r5.i
                        if (r5 != 0) goto L42
                        r5 = r3
                        goto L43
                    L42:
                        r5 = 0
                    L43:
                        java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                        r0.q = r3
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L52
                        return r1
                    L52:
                        kotlin.Unit r5 = kotlin.Unit.f24250a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = stateFlowB.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        }), contextScopeA2, SharingStarted.Companion.a(3), 1);
        this.r = FlowKt.C(sharedFlowM, mutableStateFlowA4, new ProgressiveCoachMarkManager$pendingCoachMarkFlow$1(3, null));
        this.s = JsonKt.a(new a(15));
        BuildersKt.c(contextScopeA, null, null, new AnonymousClass1(null), 3);
        BuildersKt.c(contextScopeA2, null, null, new AnonymousClass2(null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "invalid Onboarding"
            kotlinx.serialization.json.Json$Default r1 = kotlinx.serialization.json.Json.d
            kotlinx.serialization.json.JsonElement r5 = r1.d(r5)
            kotlinx.serialization.json.JsonObject r5 = kotlinx.serialization.json.JsonElementKt.j(r5)
            r1 = 8
            kotlinx.serialization.json.Json r2 = r4.s     // Catch: java.lang.IllegalArgumentException -> L22 kotlinx.serialization.SerializationException -> L24
            r2.getClass()     // Catch: java.lang.IllegalArgumentException -> L22 kotlinx.serialization.SerializationException -> L24
            au.com.woolworths.foundation.rewards.onboarding.CoachMarkBanner$Companion r3 = au.com.woolworths.foundation.rewards.onboarding.CoachMarkBanner.INSTANCE     // Catch: java.lang.IllegalArgumentException -> L22 kotlinx.serialization.SerializationException -> L24
            kotlinx.serialization.KSerializer r3 = r3.serializer()     // Catch: java.lang.IllegalArgumentException -> L22 kotlinx.serialization.SerializationException -> L24
            kotlinx.serialization.DeserializationStrategy r3 = (kotlinx.serialization.DeserializationStrategy) r3     // Catch: java.lang.IllegalArgumentException -> L22 kotlinx.serialization.SerializationException -> L24
            java.lang.Object r5 = r2.a(r3, r5)     // Catch: java.lang.IllegalArgumentException -> L22 kotlinx.serialization.SerializationException -> L24
            au.com.woolworths.foundation.rewards.onboarding.CoachMarkBanner r5 = (au.com.woolworths.foundation.rewards.onboarding.CoachMarkBanner) r5     // Catch: java.lang.IllegalArgumentException -> L22 kotlinx.serialization.SerializationException -> L24
            goto L40
        L22:
            r5 = move-exception
            goto L26
        L24:
            r5 = move-exception
            goto L33
        L26:
            au.com.woolworths.foundation.bark.Bark$Companion r2 = au.com.woolworths.foundation.bark.Bark.f8483a
            au.com.woolworths.foundation.bark.common.ReportOwner$Squad r2 = au.com.woolworths.foundation.bark.common.ReportOwner.Squad.d
            au.com.woolworths.foundation.bark.common.ReportOwner r3 = new au.com.woolworths.foundation.bark.common.ReportOwner
            r3.<init>(r2)
            au.com.woolworths.foundation.bark.Bark.Barker.c(r3, r5, r0, r1)
            goto L3f
        L33:
            au.com.woolworths.foundation.bark.Bark$Companion r2 = au.com.woolworths.foundation.bark.Bark.f8483a
            au.com.woolworths.foundation.bark.common.ReportOwner$Squad r2 = au.com.woolworths.foundation.bark.common.ReportOwner.Squad.d
            au.com.woolworths.foundation.bark.common.ReportOwner r3 = new au.com.woolworths.foundation.bark.common.ReportOwner
            r3.<init>(r2)
            au.com.woolworths.foundation.bark.Bark.Barker.c(r3, r5, r0, r1)
        L3f:
            r5 = 0
        L40:
            if (r5 == 0) goto L46
            r0 = 0
            r4.f(r5, r0)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager.a(au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$consumeAction$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$consumeAction$1 r0 = (au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$consumeAction$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$consumeAction$1 r0 = new au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$consumeAction$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlinx.coroutines.sync.MutexImpl r5 = r0.q
            java.lang.String r0 = r0.p
            kotlin.ResultKt.b(r6)
            r6 = r5
            r5 = r0
            goto L47
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.b(r6)
            r0.p = r5
            kotlinx.coroutines.sync.MutexImpl r6 = r4.d
            r0.q = r6
            r0.t = r3
            java.lang.Object r0 = r6.a(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r0 = 0
            boolean r5 = r4.c(r5)     // Catch: java.lang.Throwable -> L52
            if (r5 == 0) goto L54
            r4.g(r3)     // Catch: java.lang.Throwable -> L52
            goto L54
        L52:
            r5 = move-exception
            goto L5a
        L54:
            r6.c(r0)
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        L5a:
            r6.c(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager.b(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public final boolean c(String str) {
        switch (str.hashCode()) {
            case -1273775369:
                if (str.equals("previous")) {
                    return e(-1);
                }
                break;
            case 3377907:
                if (str.equals("next")) {
                    return e(1);
                }
                break;
            case 97440432:
                if (str.equals("first")) {
                    return d(0);
                }
                break;
            case 1097506319:
                if (str.equals("restart")) {
                    f(CoachMarkBanner.a(this.e, false, false, "", 1407), true);
                    return false;
                }
                break;
        }
        Object obj = null;
        if (str.length() == 0) {
            ProgressiveCoachMarkContent progressiveCoachMarkContent = (ProgressiveCoachMarkContent) CollectionsKt.F(this.e.g);
            str = progressiveCoachMarkContent != null ? progressiveCoachMarkContent.b : null;
        }
        Iterator it = this.e.g.iterator();
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (Intrinsics.c(((ProgressiveCoachMarkContent) next).b, str)) {
                    obj = next;
                }
            }
        }
        ProgressiveCoachMarkContent progressiveCoachMarkContent2 = (ProgressiveCoachMarkContent) obj;
        if (progressiveCoachMarkContent2 == null) {
            return false;
        }
        f(CoachMarkBanner.a(this.e, false, false, progressiveCoachMarkContent2.b, 1407), true);
        return true;
    }

    public final boolean d(int i) {
        ProgressiveCoachMarkContent progressiveCoachMarkContent = (ProgressiveCoachMarkContent) CollectionsKt.J(i, this.e.g);
        if (progressiveCoachMarkContent != null) {
            f(CoachMarkBanner.a(this.e, false, false, progressiveCoachMarkContent.b, 1407), true);
            return true;
        }
        if (i >= this.e.g.size()) {
            f(CoachMarkBanner.a(this.e, true, false, null, 1919), true);
        }
        return false;
    }

    public final boolean e(int i) {
        CoachMarkBanner coachMarkBanner = this.e;
        if (!coachMarkBanner.h) {
            int iB = CoachMarkBannerKt.b(coachMarkBanner);
            if (iB >= 0) {
                return d(iB + i);
            }
            if (i >= 0 && this.e.j.length() == 0) {
                return d(0);
            }
        }
        return false;
    }

    public final void f(CoachMarkBanner coachMarkBanner, boolean z) {
        this.e = coachMarkBanner;
        this.f.setValue(coachMarkBanner);
        if (!z || coachMarkBanner.k) {
            return;
        }
        try {
            Json.Default r4 = Json.d;
            r4.getClass();
            BuildersKt.c(this.b, null, null, new ProgressiveCoachMarkManager$saveBannerCoachMarks$1(this, r4.c(CoachMarkBanner.INSTANCE.serializer(), coachMarkBanner), null), 3);
        } catch (Exception e) {
            Timber.f27013a.f(e);
        }
    }

    public final void g(boolean z) {
        MutableStateFlow mutableStateFlow;
        Object value;
        Boolean bool;
        do {
            mutableStateFlow = this.h;
            value = mutableStateFlow.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!mutableStateFlow.d(value, Boolean.valueOf(z)));
        if (!bool.booleanValue() || z) {
            return;
        }
        MutableStateFlow mutableStateFlow2 = this.j;
        ProgressiveCoachMarkContent progressiveCoachMarkContent = (ProgressiveCoachMarkContent) mutableStateFlow2.getValue();
        if (progressiveCoachMarkContent != null) {
            this.l.f(new Action.Dismissed(progressiveCoachMarkContent));
            mutableStateFlow2.setValue(null);
            if (this.e.k) {
                String str = progressiveCoachMarkContent.h;
                if (str != null) {
                    this.n.f(str);
                }
                BuildersKt.c(this.c, null, null, new ProgressiveCoachMarkManager$isCoachMarkVisible$1$2(this, null), 3);
            }
        }
        CoachMarkBanner coachMarkBanner = this.e;
        Intrinsics.h(coachMarkBanner, "<this>");
        int iB = CoachMarkBannerKt.b(coachMarkBanner);
        if (iB <= 0 || iB != coachMarkBanner.g.size() - 1 || this.e.k) {
            return;
        }
        e(1);
    }
}
