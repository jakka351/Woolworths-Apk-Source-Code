package androidx.constraintlayout.compose.carousel;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableState$animateTo$2", f = "CarouselSwipeable.kt", l = {315}, m = "emit")
/* loaded from: classes2.dex */
final class CarouselSwipeableState$animateTo$2$emit$1 extends ContinuationImpl {
    public Object p;
    public Map q;
    public /* synthetic */ Object r;
    public final /* synthetic */ CarouselSwipeableState$animateTo$2 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselSwipeableState$animateTo$2$emit$1(CarouselSwipeableState$animateTo$2 carouselSwipeableState$animateTo$2, Continuation continuation) {
        super(continuation);
        this.s = carouselSwipeableState$animateTo$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.emit(null, this);
    }
}
