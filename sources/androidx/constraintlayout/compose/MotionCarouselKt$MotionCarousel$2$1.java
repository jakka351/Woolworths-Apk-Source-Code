package androidx.constraintlayout.compose;

import androidx.compose.runtime.MutableState;
import androidx.constraintlayout.compose.carousel.CarouselSwipeableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.constraintlayout.compose.MotionCarouselKt$MotionCarousel$2$1", f = "MotionCarousel.kt", l = {209}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class MotionCarouselKt$MotionCarousel$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ CarouselSwipeableState q;
    public final /* synthetic */ MutableState r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionCarouselKt$MotionCarousel$2$1(CarouselSwipeableState carouselSwipeableState, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.q = carouselSwipeableState;
        this.r = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MotionCarouselKt$MotionCarousel$2$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MotionCarouselKt$MotionCarousel$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        MutableState mutableState = this.r;
        if (i == 0) {
            ResultKt.b(obj);
            if (((CarouselState) mutableState.getD()).b > 0) {
                CarouselState carouselState = (CarouselState) mutableState.getD();
                carouselState.b--;
            }
            this.p = 1;
            if (this.q.e(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        ((CarouselState) mutableState.getD()).f2233a = MotionCarouselDirection.d;
        return Unit.f24250a;
    }
}
