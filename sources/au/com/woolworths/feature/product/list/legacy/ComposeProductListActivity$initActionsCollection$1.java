package au.com.woolworths.feature.product.list.legacy;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.feature.product.list.legacy.ComposeProductListActivityContract;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ComposeProductListActivity$initActionsCollection$1", f = "ComposeProductListActivity.kt", l = {340}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ComposeProductListActivity$initActionsCollection$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ComposeProductListActivity q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.product.list.legacy.ComposeProductListActivity$initActionsCollection$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<ComposeProductListActivityContract.Action, Continuation<? super Unit>, Object>, SuspendFunction {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ComposeProductListActivityContract.Action action = (ComposeProductListActivityContract.Action) obj;
            ComposeProductListActivity composeProductListActivity = (ComposeProductListActivity) this.d;
            int i = ComposeProductListActivity.H;
            composeProductListActivity.getClass();
            if (Intrinsics.c(action, ComposeProductListActivityContract.Action.NavigateUp.f5280a)) {
                composeProductListActivity.finish();
            } else {
                if (!Intrinsics.c(action, ComposeProductListActivityContract.Action.LaunchSearch.f5279a)) {
                    throw new NoWhenBranchMatchedException();
                }
                composeProductListActivity.finish();
                composeProductListActivity.U4();
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeProductListActivity$initActionsCollection$1(ComposeProductListActivity composeProductListActivity, Continuation continuation) {
        super(2, continuation);
        this.q = composeProductListActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ComposeProductListActivity$initActionsCollection$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ComposeProductListActivity$initActionsCollection$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            int i2 = ComposeProductListActivity.H;
            ComposeProductListActivity composeProductListActivity = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, composeProductListActivity, ComposeProductListActivity.class, "handleActivityActions", "handleActivityActions(Lau/com/woolworths/feature/product/list/legacy/ComposeProductListActivityContract$Action;)V", 4), FlowExtKt.a(composeProductListActivity.Q4().m, composeProductListActivity.getD(), Lifecycle.State.h));
            this.p = 1;
            if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
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
