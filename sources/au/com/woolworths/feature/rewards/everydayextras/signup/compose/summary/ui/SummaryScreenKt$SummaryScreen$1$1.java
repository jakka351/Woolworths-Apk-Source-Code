package au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.State;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryViewModel;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.summary.EverydayExtrasSummaryContentItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.summary.EverydayExtrasSummaryFeed;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.SummaryScreenKt$SummaryScreen$1$1", f = "SummaryScreen.kt", l = {100}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SummaryScreenKt$SummaryScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Function1 A;
    public final /* synthetic */ LazyListState B;
    public final /* synthetic */ State C;
    public int p;
    public final /* synthetic */ EverydayExtraSummaryViewModel q;
    public final /* synthetic */ Function0 r;
    public final /* synthetic */ Function0 s;
    public final /* synthetic */ Function0 t;
    public final /* synthetic */ Function0 u;
    public final /* synthetic */ Function0 v;
    public final /* synthetic */ Function0 w;
    public final /* synthetic */ Function1 x;
    public final /* synthetic */ Function1 y;
    public final /* synthetic */ Function2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryScreenKt$SummaryScreen$1$1(EverydayExtraSummaryViewModel everydayExtraSummaryViewModel, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function1 function1, Function1 function12, Function2 function2, Function1 function13, LazyListState lazyListState, State state, Continuation continuation) {
        super(2, continuation);
        this.q = everydayExtraSummaryViewModel;
        this.r = function0;
        this.s = function02;
        this.t = function03;
        this.u = function04;
        this.v = function05;
        this.w = function06;
        this.x = function1;
        this.y = function12;
        this.z = function2;
        this.A = function13;
        this.B = lazyListState;
        this.C = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummaryScreenKt$SummaryScreen$1$1(this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryScreenKt$SummaryScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flow = this.q.o;
            final LazyListState lazyListState = this.B;
            final State state = this.C;
            final Function0 function0 = this.r;
            final Function0 function02 = this.s;
            final Function0 function03 = this.t;
            final Function0 function04 = this.u;
            final Function0 function05 = this.v;
            final Function0 function06 = this.w;
            final Function1 function1 = this.x;
            final Function1 function12 = this.y;
            final Function2 function2 = this.z;
            final Function1 function13 = this.A;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.SummaryScreenKt$SummaryScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    EverydayExtraSummaryContract.Action action = (EverydayExtraSummaryContract.Action) obj2;
                    boolean z = action instanceof EverydayExtraSummaryContract.Action.ClearWPayFramesForm;
                    Unit unit = Unit.f24250a;
                    if (z) {
                        function0.invoke();
                        return unit;
                    }
                    if (action instanceof EverydayExtraSummaryContract.Action.SubmitWPayFramesForm) {
                        function02.invoke();
                        return unit;
                    }
                    if (action instanceof EverydayExtraSummaryContract.Action.ScanCard) {
                        function03.invoke();
                        return unit;
                    }
                    if (action instanceof EverydayExtraSummaryContract.Action.RequestCameraPermission) {
                        function04.invoke();
                        return unit;
                    }
                    if (action instanceof EverydayExtraSummaryContract.Action.ShowCameraPermissionRationale) {
                        function05.invoke();
                        return unit;
                    }
                    if (action instanceof EverydayExtraSummaryContract.Action.ShowGoogleWalletScanner) {
                        function06.invoke();
                        return unit;
                    }
                    if (action instanceof EverydayExtraSummaryContract.Action.InjectCardDetails) {
                        function1.invoke(((EverydayExtraSummaryContract.Action.InjectCardDetails) action).f6121a);
                        return unit;
                    }
                    if (action instanceof EverydayExtraSummaryContract.Action.ShowSubscribeAlert) {
                        function12.invoke(((EverydayExtraSummaryContract.Action.ShowSubscribeAlert) action).f6129a);
                        return unit;
                    }
                    if (action instanceof EverydayExtraSummaryContract.Action.ShowErrorAlert) {
                        EverydayExtraSummaryContract.Action.ShowErrorAlert showErrorAlert = (EverydayExtraSummaryContract.Action.ShowErrorAlert) action;
                        function2.invoke(new Integer(showErrorAlert.f6127a), new Integer(showErrorAlert.b));
                        return unit;
                    }
                    if (action instanceof EverydayExtraSummaryContract.Action.OpenUrl) {
                        function13.invoke(((EverydayExtraSummaryContract.Action.OpenUrl) action).f6122a);
                        return unit;
                    }
                    if (!Intrinsics.c(action, EverydayExtraSummaryContract.Action.ScrollToCardPayment.f6125a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    State state2 = state;
                    if (((EverydayExtraSummaryContract.ViewState) state2.getD()) instanceof EverydayExtraSummaryContract.ViewState.Content) {
                        EverydayExtraSummaryContract.ViewState viewState = (EverydayExtraSummaryContract.ViewState) state2.getD();
                        Intrinsics.f(viewState, "null cannot be cast to non-null type au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract.ViewState.Content");
                        EverydayExtrasSummaryFeed everydayExtrasSummaryFeed = ((EverydayExtraSummaryContract.ViewState.Content) viewState).f6131a;
                        if (!everydayExtrasSummaryFeed.b.b.isEmpty()) {
                            Iterator it = everydayExtrasSummaryFeed.b.b.iterator();
                            int i2 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i2 = -1;
                                    break;
                                }
                                if (((EverydayExtrasSummaryContentItem) it.next()) instanceof EverydayExtrasSummaryContentItem.WpayPayment) {
                                    break;
                                }
                                i2++;
                            }
                            Object objL = lazyListState.l(i2, 0, continuation);
                            if (objL == CoroutineSingletons.d) {
                                return objL;
                            }
                        }
                    }
                    return unit;
                }
            };
            this.p = 1;
            if (flow.collect(flowCollector, this) == coroutineSingletons) {
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
