package au.com.woolworths.shop.deliveryunlimited.signup.confirmation;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmation.ConfirmationContract;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.deliveryunlimited.signup.confirmation.ConfirmationActivity$observeActions$1", f = "ConfirmationActivity.kt", l = {81}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ConfirmationActivity$observeActions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ConfirmationActivity q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.deliveryunlimited.signup.confirmation.ConfirmationActivity$observeActions$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<ConfirmationContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ConfirmationActivity confirmationActivity = (ConfirmationActivity) this.d;
            int i = ConfirmationActivity.A;
            if (!(((ConfirmationContract.Actions) obj) instanceof ConfirmationContract.Actions.LaunchHomePage)) {
                confirmationActivity.getClass();
                throw new NoWhenBranchMatchedException();
            }
            confirmationActivity.getClass();
            Activities.MainActivity.f4487a.d(confirmationActivity, Activities.MainActivity.Tab.d);
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmationActivity$observeActions$1(ConfirmationActivity confirmationActivity, Continuation continuation) {
        super(2, continuation);
        this.q = confirmationActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ConfirmationActivity$observeActions$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ConfirmationActivity$observeActions$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            int i2 = ConfirmationActivity.A;
            ConfirmationActivity confirmationActivity = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, confirmationActivity, ConfirmationActivity.class, "handleActions", "handleActions(Lau/com/woolworths/shop/deliveryunlimited/signup/confirmation/ConfirmationContract$Actions;)V", 4), FlowExtKt.a(FlowKt.a(((ConfirmationViewModel) confirmationActivity.x.getD()).h), confirmationActivity.getD(), Lifecycle.State.h));
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
