package androidx.constraintlayout.compose.carousel;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableState$snapTo$2", f = "CarouselSwipeable.kt", l = {299}, m = "emit")
/* loaded from: classes2.dex */
final class CarouselSwipeableState$snapTo$2$emit$1 extends ContinuationImpl {
    public Object p;
    public /* synthetic */ Object q;
    public final /* synthetic */ CarouselSwipeableState$snapTo$2 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselSwipeableState$snapTo$2$emit$1(CarouselSwipeableState$snapTo$2 carouselSwipeableState$snapTo$2, Continuation continuation) {
        super(continuation);
        this.r = carouselSwipeableState$snapTo$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.emit(null, this);
    }
}
