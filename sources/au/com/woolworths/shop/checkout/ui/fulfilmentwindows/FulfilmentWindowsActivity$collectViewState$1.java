package au.com.woolworths.shop.checkout.ui.fulfilmentwindows;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsActivity$collectViewState$1", f = "FulfilmentWindowsActivity.kt", l = {96}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FulfilmentWindowsActivity$collectViewState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ FulfilmentWindowsActivity q;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsActivity$collectViewState$1$1", f = "FulfilmentWindowsActivity.kt", l = {97}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsActivity$collectViewState$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ FulfilmentWindowsActivity q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FulfilmentWindowsActivity fulfilmentWindowsActivity, Continuation continuation) {
            super(2, continuation);
            this.q = fulfilmentWindowsActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.q, continuation);
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
                int i2 = FulfilmentWindowsActivity.B;
                final FulfilmentWindowsActivity fulfilmentWindowsActivity = this.q;
                FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = fulfilmentWindowsActivity.O4().l;
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsActivity.collectViewState.1.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        FulfilmentWindowsActivity fulfilmentWindowsActivity2 = fulfilmentWindowsActivity;
                        boolean z = fulfilmentWindowsActivity2.A;
                        boolean z2 = ((FulfilmentWindowsContract.ViewState) obj2).b;
                        if (z != z2) {
                            fulfilmentWindowsActivity2.A = z2;
                            fulfilmentWindowsActivity2.invalidateOptionsMenu();
                        }
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.collect(flowCollector, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FulfilmentWindowsActivity$collectViewState$1(FulfilmentWindowsActivity fulfilmentWindowsActivity, Continuation continuation) {
        super(2, continuation);
        this.q = fulfilmentWindowsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FulfilmentWindowsActivity$collectViewState$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FulfilmentWindowsActivity$collectViewState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        Unit unit = Unit.f24250a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        Lifecycle.State state = Lifecycle.State.g;
        FulfilmentWindowsActivity fulfilmentWindowsActivity = this.q;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(fulfilmentWindowsActivity, null);
        this.p = 1;
        Object objA = RepeatOnLifecycleKt.a(fulfilmentWindowsActivity.getD(), state, anonymousClass1, this);
        if (objA != coroutineSingletons) {
            objA = unit;
        }
        return objA == coroutineSingletons ? coroutineSingletons : unit;
    }
}
