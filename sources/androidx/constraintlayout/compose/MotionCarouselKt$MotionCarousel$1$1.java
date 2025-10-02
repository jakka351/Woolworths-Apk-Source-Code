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
@DebugMetadata(c = "androidx.constraintlayout.compose.MotionCarouselKt$MotionCarousel$1$1", f = "MotionCarousel.kt", l = {197}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class MotionCarouselKt$MotionCarousel$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ androidx.compose.runtime.State q;
    public final /* synthetic */ CarouselSwipeableState r;
    public final /* synthetic */ MutableState s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionCarouselKt$MotionCarousel$1$1(androidx.compose.runtime.State state, CarouselSwipeableState carouselSwipeableState, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.q = state;
        this.r = carouselSwipeableState;
        this.s = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MotionCarouselKt$MotionCarousel$1$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MotionCarouselKt$MotionCarousel$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        MutableState mutableState = this.s;
        if (i == 0) {
            ResultKt.b(obj);
            int i2 = ((CarouselState) mutableState.getD()).b + 1;
            ((MotionItemsProvider) this.q.getD()).getClass();
            if (i2 < 0) {
                ((CarouselState) mutableState.getD()).b++;
                this.p = 1;
                if (this.r.e(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Unit.f24250a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        ((CarouselState) mutableState.getD()).f2233a = MotionCarouselDirection.d;
        return Unit.f24250a;
    }
}
