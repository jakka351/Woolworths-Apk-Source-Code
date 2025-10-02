package androidx.work.impl.constraints.controllers;

import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.constraints.trackers.ConstraintTrackerKt;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/channels/ProducerScope;", "Landroidx/work/impl/constraints/ConstraintsState;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.work.impl.constraints.controllers.BaseConstraintController$track$1", f = "ContraintControllers.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class BaseConstraintController$track$1 extends SuspendLambda implements Function2<ProducerScope<? super ConstraintsState>, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ BaseConstraintController r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseConstraintController$track$1(BaseConstraintController baseConstraintController, Continuation continuation) {
        super(2, continuation);
        this.r = baseConstraintController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BaseConstraintController$track$1 baseConstraintController$track$1 = new BaseConstraintController$track$1(this.r, continuation);
        baseConstraintController$track$1.q = obj;
        return baseConstraintController$track$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseConstraintController$track$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.work.impl.constraints.controllers.BaseConstraintController$track$1$listener$1, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final ProducerScope producerScope = (ProducerScope) this.q;
            final BaseConstraintController baseConstraintController = this.r;
            final ?? r1 = new ConstraintListener<Object>() { // from class: androidx.work.impl.constraints.controllers.BaseConstraintController$track$1$listener$1
                @Override // androidx.work.impl.constraints.ConstraintListener
                public final void a(Object obj2) {
                    BaseConstraintController baseConstraintController2 = baseConstraintController;
                    producerScope.b().k(baseConstraintController2.e(obj2) ? new ConstraintsState.ConstraintsNotMet(baseConstraintController2.getB()) : ConstraintsState.ConstraintsMet.f3958a);
                }
            };
            ConstraintTracker constraintTracker = baseConstraintController.f3966a;
            constraintTracker.getClass();
            synchronized (constraintTracker.c) {
                try {
                    if (constraintTracker.d.add(r1)) {
                        if (constraintTracker.d.size() == 1) {
                            constraintTracker.e = constraintTracker.a();
                            Logger.e().a(ConstraintTrackerKt.f3973a, constraintTracker.getClass().getSimpleName() + ": initial state = " + constraintTracker.e);
                            constraintTracker.c();
                        }
                        r1.a(constraintTracker.e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            final BaseConstraintController baseConstraintController2 = this.r;
            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.work.impl.constraints.controllers.BaseConstraintController$track$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    ConstraintTracker constraintTracker2 = baseConstraintController2.f3966a;
                    BaseConstraintController$track$1$listener$1 baseConstraintController$track$1$listener$1 = r1;
                    constraintTracker2.getClass();
                    synchronized (constraintTracker2.c) {
                        if (constraintTracker2.d.remove(baseConstraintController$track$1$listener$1) && constraintTracker2.d.isEmpty()) {
                            constraintTracker2.d();
                        }
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (ProduceKt.a(producerScope, function0, this) == coroutineSingletons) {
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
