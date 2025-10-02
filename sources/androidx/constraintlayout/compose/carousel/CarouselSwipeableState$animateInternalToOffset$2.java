package androidx.constraintlayout.compose.carousel;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import com.google.android.gms.ads.RequestConfiguration;
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

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/foundation/gestures/DragScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableState$animateInternalToOffset$2", f = "CarouselSwipeable.kt", l = {209}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CarouselSwipeableState$animateInternalToOffset$2 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ CarouselSwipeableState r;
    public final /* synthetic */ float s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselSwipeableState$animateInternalToOffset$2(float f, CarouselSwipeableState carouselSwipeableState, Continuation continuation) {
        super(2, continuation);
        SpringSpec springSpec = SwipeableDefaults.f2258a;
        this.r = carouselSwipeableState;
        this.s = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SpringSpec springSpec = SwipeableDefaults.f2258a;
        CarouselSwipeableState$animateInternalToOffset$2 carouselSwipeableState$animateInternalToOffset$2 = new CarouselSwipeableState$animateInternalToOffset$2(this.s, this.r, continuation);
        carouselSwipeableState$animateInternalToOffset$2.q = obj;
        return carouselSwipeableState$animateInternalToOffset$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CarouselSwipeableState$animateInternalToOffset$2) create((DragScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CarouselSwipeableState carouselSwipeableState = this.r;
        MutableState mutableState = carouselSwipeableState.c;
        MutableState mutableState2 = carouselSwipeableState.g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                final DragScope dragScope = (DragScope) this.q;
                final Ref.FloatRef floatRef = new Ref.FloatRef();
                floatRef.d = ((SnapshotMutableFloatStateImpl) carouselSwipeableState.f).a();
                float f = this.s;
                ((SnapshotMutableStateImpl) mutableState2).setValue(new Float(f));
                ((SnapshotMutableStateImpl) mutableState).setValue(Boolean.TRUE);
                Animatable animatableA = AnimatableKt.a(floatRef.d);
                Float f2 = new Float(f);
                SpringSpec springSpec = SwipeableDefaults.f2258a;
                Function1<Animatable<Float, AnimationVector1D>, Unit> function1 = new Function1<Animatable<Float, AnimationVector1D>, Unit>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$animateInternalToOffset$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Animatable animatable = (Animatable) obj2;
                        float fFloatValue = ((Number) animatable.f()).floatValue();
                        Ref.FloatRef floatRef2 = floatRef;
                        dragScope.a(fFloatValue - floatRef2.d);
                        floatRef2.d = ((Number) animatable.f()).floatValue();
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (Animatable.d(animatableA, f2, springSpec, null, function1, this, 4) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            mutableState2 = (SnapshotMutableStateImpl) mutableState2;
            mutableState2.setValue(null);
            mutableState = (SnapshotMutableStateImpl) mutableState;
            mutableState.setValue(Boolean.FALSE);
            return Unit.f24250a;
        } catch (Throwable th) {
            ((SnapshotMutableStateImpl) mutableState2).setValue(null);
            ((SnapshotMutableStateImpl) mutableState).setValue(Boolean.FALSE);
            throw th;
        }
    }
}
