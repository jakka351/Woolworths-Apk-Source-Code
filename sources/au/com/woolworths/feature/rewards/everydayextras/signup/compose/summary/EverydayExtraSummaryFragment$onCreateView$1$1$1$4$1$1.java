package au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary;

import androidx.compose.material.ModalBottomSheetState;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.rewards.everydayextrasignup.EdxSummaryAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import java.util.ArrayList;
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
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryFragment$onCreateView$1$1$1$4$1$1", f = "EverydayExtraSummaryFragment.kt", l = {140}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EverydayExtraSummaryFragment$onCreateView$1$1$1$4$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ EverydayExtraSummaryFragment q;
    public final /* synthetic */ String r;
    public final /* synthetic */ ModalBottomSheetState s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EverydayExtraSummaryFragment$onCreateView$1$1$1$4$1$1(EverydayExtraSummaryFragment everydayExtraSummaryFragment, String str, ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
        super(2, continuation);
        this.q = everydayExtraSummaryFragment;
        this.r = str;
        this.s = modalBottomSheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EverydayExtraSummaryFragment$onCreateView$1$1$1$4$1$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EverydayExtraSummaryFragment$onCreateView$1$1$1$4$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            EverydayExtraSummaryFragment everydayExtraSummaryFragment = this.q;
            EverydayExtraSummaryViewModel everydayExtraSummaryViewModelI1 = everydayExtraSummaryFragment.I1();
            final String buttonLabel = this.r;
            Intrinsics.h(buttonLabel, "buttonLabel");
            AnalyticsManager analyticsManager = everydayExtraSummaryViewModelI1.i;
            EdxSummaryAnalytics.Summary.Action.d.getClass();
            analyticsManager.g(new Event(buttonLabel) { // from class: au.com.woolworths.analytics.rewards.everydayextrasignup.EdxSummaryAnalytics$Summary$Action$Companion$changeMyPlan$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(EdxSummaryAnalytics.Summary.f);
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    a.y("event.Label", YU.a.A("EDX ", buttonLabel), spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "button_click";
                }

                public final boolean equals(Object obj2) {
                    if (!(obj2 instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj2;
                    return "button_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
            ((EverydayExtraChoosePlanBottomSheetViewModel) everydayExtraSummaryFragment.j.getD()).p6();
            this.p = 1;
            if (this.s.e(this) == coroutineSingletons) {
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
