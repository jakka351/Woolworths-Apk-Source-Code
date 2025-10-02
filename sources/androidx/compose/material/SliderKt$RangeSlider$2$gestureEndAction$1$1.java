package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import com.dynatrace.android.compose.slider.RangeSliderValueFinishedCallback;
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
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isStart", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SliderKt$RangeSlider$2$gestureEndAction$1$1 extends Lambda implements Function1<Boolean, Unit> {

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1$1", f = "Slider.kt", l = {467}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ float q;
        public final /* synthetic */ float r;
        public final /* synthetic */ RangeSliderValueFinishedCallback s;
        public final /* synthetic */ boolean t;
        public final /* synthetic */ MutableFloatState u;
        public final /* synthetic */ MutableFloatState v;
        public final /* synthetic */ MutableState w;
        public final /* synthetic */ Ref.FloatRef x;
        public final /* synthetic */ Ref.FloatRef y;
        public final /* synthetic */ ClosedFloatingPointRange z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f, float f2, RangeSliderValueFinishedCallback rangeSliderValueFinishedCallback, boolean z, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, MutableState mutableState, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, ClosedFloatingPointRange closedFloatingPointRange, Continuation continuation) {
            super(2, continuation);
            this.q = f;
            this.r = f2;
            this.s = rangeSliderValueFinishedCallback;
            this.t = z;
            this.u = mutableFloatState;
            this.v = mutableFloatState2;
            this.w = mutableState;
            this.x = floatRef;
            this.y = floatRef2;
            this.z = closedFloatingPointRange;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, continuation);
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
                Animatable animatableA = AnimatableKt.a(this.q);
                Float f = new Float(this.r);
                TweenSpec tweenSpec = SliderKt.g;
                Float f2 = new Float(BitmapDescriptorFactory.HUE_RED);
                final Ref.FloatRef floatRef = this.y;
                final ClosedFloatingPointRange closedFloatingPointRange = this.z;
                final boolean z = this.t;
                final MutableFloatState mutableFloatState = this.u;
                final MutableFloatState mutableFloatState2 = this.v;
                final MutableState mutableState = this.w;
                final Ref.FloatRef floatRef2 = this.x;
                Function1<Animatable<Float, AnimationVector1D>, Unit> function1 = new Function1<Animatable<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material.SliderKt.RangeSlider.2.gestureEndAction.1.1.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Animatable animatable = (Animatable) obj2;
                        boolean z2 = z;
                        MutableFloatState mutableFloatState3 = mutableFloatState2;
                        MutableFloatState mutableFloatState4 = mutableFloatState;
                        (z2 ? mutableFloatState4 : mutableFloatState3).p(((Number) animatable.f()).floatValue());
                        Function1 function12 = (Function1) mutableState.getD();
                        ClosedFloatingPointRange closedFloatingPointRangeJ = RangesKt.j(mutableFloatState4.a(), mutableFloatState3.a());
                        float f3 = floatRef2.d;
                        float f4 = floatRef.d;
                        ClosedFloatingPointRange closedFloatingPointRange2 = closedFloatingPointRange;
                        float fFloatValue = ((Number) closedFloatingPointRange2.getStart()).floatValue();
                        float fFloatValue2 = ((Number) closedFloatingPointRange2.getEndInclusive()).floatValue();
                        float f5 = SliderKt.f1325a;
                        function12.invoke(RangesKt.j(SliderKt.i(f3, f4, ((Number) closedFloatingPointRangeJ.getStart()).floatValue(), fFloatValue, fFloatValue2), SliderKt.i(f3, f4, ((Number) closedFloatingPointRangeJ.getEndInclusive()).floatValue(), fFloatValue, fFloatValue2)));
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (animatableA.c(f, tweenSpec, f2, function1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            this.s.invoke();
            return Unit.f24250a;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((Boolean) obj).booleanValue();
        throw null;
    }
}
