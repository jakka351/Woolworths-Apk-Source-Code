package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", l = {135, 151}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class SnapFlingBehavior$fling$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AnimationResult<Float, AnimationVector1D>>, Object> {
    public Ref.FloatRef p;
    public int q;
    public final /* synthetic */ SnapFlingBehavior r;
    public final /* synthetic */ float s;
    public final /* synthetic */ Function1 t;
    public final /* synthetic */ ScrollScope u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$fling$result$1(SnapFlingBehavior snapFlingBehavior, float f, Function1 function1, ScrollScope scrollScope, Continuation continuation) {
        super(2, continuation);
        this.r = snapFlingBehavior;
        this.s = f;
        this.t = function1;
        this.u = scrollScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SnapFlingBehavior$fling$result$1(this.r, this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SnapFlingBehavior$fling$result$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final Ref.FloatRef floatRef;
        Object objC;
        SnapFlingBehavior snapFlingBehavior = this.r;
        SnapLayoutInfoProvider snapLayoutInfoProvider = snapFlingBehavior.f914a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        final Function1 function1 = this.t;
        if (i == 0) {
            ResultKt.b(obj);
            DecayAnimationSpec decayAnimationSpec = snapFlingBehavior.b;
            float f = this.s;
            float fB = snapLayoutInfoProvider.b(f, DecayAnimationSpecKt.a(decayAnimationSpec, BitmapDescriptorFactory.HUE_RED, f));
            if (Float.isNaN(fB)) {
                InlineClassHelperKt.c("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            floatRef = new Ref.FloatRef();
            float fSignum = Math.signum(f) * Math.abs(fB);
            floatRef.d = fSignum;
            function1.invoke(new Float(fSignum));
            float f2 = floatRef.d;
            Function1<Float, Unit> function12 = new Function1<Float, Unit>() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1$animationState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    float fFloatValue = ((Number) obj2).floatValue();
                    Ref.FloatRef floatRef2 = floatRef;
                    float f3 = floatRef2.d - fFloatValue;
                    floatRef2.d = f3;
                    function1.invoke(Float.valueOf(f3));
                    return Unit.f24250a;
                }
            };
            this.p = floatRef;
            this.q = 1;
            objC = SnapFlingBehavior.c(snapFlingBehavior, this.u, f2, this.s, function12, this);
            if (objC != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        Ref.FloatRef floatRef2 = this.p;
        ResultKt.b(obj);
        floatRef = floatRef2;
        objC = obj;
        AnimationState animationState = (AnimationState) objC;
        float fA = snapLayoutInfoProvider.a(((Number) animationState.b()).floatValue());
        if (Float.isNaN(fA)) {
            InlineClassHelperKt.c("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        floatRef.d = fA;
        AnimationState animationStateB = AnimationStateKt.b(animationState, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 30);
        AnimationSpec animationSpec = snapFlingBehavior.c;
        Function1<Float, Unit> function13 = new Function1<Float, Unit>() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                float fFloatValue = ((Number) obj2).floatValue();
                Ref.FloatRef floatRef3 = floatRef;
                float f3 = floatRef3.d - fFloatValue;
                floatRef3.d = f3;
                function1.invoke(Float.valueOf(f3));
                return Unit.f24250a;
            }
        };
        this.p = null;
        this.q = 2;
        Object objC2 = SnapFlingBehaviorKt.c(this.u, fA, fA, animationStateB, animationSpec, function13, this);
        return objC2 == coroutineSingletons ? coroutineSingletons : objC2;
    }
}
