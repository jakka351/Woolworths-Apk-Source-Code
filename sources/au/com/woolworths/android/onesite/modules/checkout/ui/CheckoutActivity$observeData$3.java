package au.com.woolworths.android.onesite.modules.checkout.ui;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.android.onesite.modules.checkout.CheckOutContract;
import au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutContract;
import au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel;
import au.com.woolworths.shop.checkout.CheckoutFeature;
import au.com.woolworths.shop.checkout.ui.bridge.CheckoutBridgeContract;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import io.reactivex.internal.operators.single.SingleObserveOn;
import io.reactivex.rxkotlin.DisposableKt;
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
@DebugMetadata(c = "au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutActivity$observeData$3", f = "CheckoutActivity.kt", l = {167}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CheckoutActivity$observeData$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ CheckoutActivity q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutActivity$observeData$3$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<CheckoutBridgeContract.Action, Continuation<? super Unit>, Object>, SuspendFunction {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CheckoutBridgeContract.Action action = (CheckoutBridgeContract.Action) obj;
            CheckoutActivity checkoutActivity = (CheckoutActivity) this.d;
            int i = CheckoutActivity.I;
            final int i2 = 0;
            final int i3 = 1;
            if (action instanceof CheckoutBridgeContract.Action.LaunchPaymentScreen) {
                CheckoutViewModel checkoutViewModelS4 = checkoutActivity.S4();
                boolean z = ((CheckoutBridgeContract.Action.LaunchPaymentScreen) action).f10674a;
                CheckoutStep checkoutStep = checkoutViewModelS4.k;
                if ((checkoutStep == null ? -1 : CheckoutViewModel.WhenMappings.f4313a[checkoutStep.ordinal()]) == 1) {
                    if (checkoutViewModelS4.i.c(CheckoutFeature.m) && z) {
                        checkoutViewModelS4.l.f(CheckoutContract.Action.LaunchWPayPaymentScreen.f4308a);
                    } else {
                        checkoutViewModelS4.e.d(false);
                    }
                }
            } else {
                checkoutActivity.getClass();
                if (!Intrinsics.c(action, CheckoutBridgeContract.Action.LaunchZeroPayment.f10675a)) {
                    throw new NoWhenBranchMatchedException();
                }
                CheckoutViewModel checkoutViewModelS42 = checkoutActivity.S4();
                checkoutViewModelS42.p6(CheckOutContract.LoadingState.d);
                CompositeDisposable compositeDisposable = checkoutViewModelS42.j;
                SingleObserveOn singleObserveOnA = checkoutViewModelS42.g.a();
                final e eVar = new e(checkoutViewModelS42, i2);
                Consumer consumer = new Consumer() { // from class: au.com.woolworths.android.onesite.modules.checkout.ui.f
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj3) {
                        switch (i2) {
                            case 0:
                                ((e) eVar).invoke(obj3);
                                break;
                            default:
                                ((e) eVar).invoke(obj3);
                                break;
                        }
                    }
                };
                final e eVar2 = new e(checkoutViewModelS42, i3);
                ConsumerSingleObserver consumerSingleObserver = new ConsumerSingleObserver(consumer, new Consumer() { // from class: au.com.woolworths.android.onesite.modules.checkout.ui.f
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj3) {
                        switch (i3) {
                            case 0:
                                ((e) eVar2).invoke(obj3);
                                break;
                            default:
                                ((e) eVar2).invoke(obj3);
                                break;
                        }
                    }
                });
                singleObserveOnA.a(consumerSingleObserver);
                DisposableKt.a(compositeDisposable, consumerSingleObserver);
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutActivity$observeData$3(CheckoutActivity checkoutActivity, Continuation continuation) {
        super(2, continuation);
        this.q = checkoutActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckoutActivity$observeData$3(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckoutActivity$observeData$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            int i2 = CheckoutActivity.I;
            CheckoutActivity checkoutActivity = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, checkoutActivity, CheckoutActivity.class, "handleBridgeActions", "handleBridgeActions(Lau/com/woolworths/shop/checkout/ui/bridge/CheckoutBridgeContract$Action;)V", 4), FlowExtKt.a(checkoutActivity.R4().i, checkoutActivity.getD(), Lifecycle.State.g));
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
