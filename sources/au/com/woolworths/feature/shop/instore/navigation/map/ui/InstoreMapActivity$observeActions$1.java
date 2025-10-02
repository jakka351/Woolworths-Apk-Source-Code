package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import android.content.Context;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract;
import au.com.woolworths.geolocation.location.LocationsKt;
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
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapActivity$observeActions$1", f = "InstoreMapActivity.kt", l = {174}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InstoreMapActivity$observeActions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ InstoreMapActivity q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapActivity$observeActions$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<InstoreMapContract.Action, Continuation<? super Unit>, Object>, SuspendFunction {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            InstoreMapContract.Action action = (InstoreMapContract.Action) obj;
            InstoreMapActivity instoreMapActivity = (InstoreMapActivity) this.d;
            int i = InstoreMapActivity.B;
            instoreMapActivity.getClass();
            if (Intrinsics.c(action, InstoreMapContract.Action.TurnOnDeviceLocation.f7381a)) {
                LocationsKt.a(instoreMapActivity, instoreMapActivity);
            } else if (Intrinsics.c(action, InstoreMapContract.Action.ShowNavigationFeedback.f7380a)) {
                instoreMapActivity.P4();
            } else {
                if (!Intrinsics.c(action, InstoreMapContract.Action.PerformHaptic.f7379a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Context applicationContext = instoreMapActivity.getApplicationContext();
                if (applicationContext != null) {
                    ContextExtKt.k(applicationContext, 200L, null);
                }
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstoreMapActivity$observeActions$1(InstoreMapActivity instoreMapActivity, Continuation continuation) {
        super(2, continuation);
        this.q = instoreMapActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InstoreMapActivity$observeActions$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstoreMapActivity$observeActions$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            int i2 = InstoreMapActivity.B;
            InstoreMapActivity instoreMapActivity = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, instoreMapActivity, InstoreMapActivity.class, "handleAction", "handleAction(Lau/com/woolworths/feature/shop/instore/navigation/map/ui/InstoreMapContract$Action;)V", 4), FlowExtKt.a(instoreMapActivity.O4().x, instoreMapActivity.getD(), Lifecycle.State.h));
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
