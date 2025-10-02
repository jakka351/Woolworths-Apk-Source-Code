package androidx.constraintlayout.compose.carousel;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableState", f = "CarouselSwipeable.kt", l = {146, 171, 174}, m = "processNewAnchors$constraintlayout_compose_release")
/* loaded from: classes2.dex */
final class CarouselSwipeableState$processNewAnchors$1 extends ContinuationImpl {
    public CarouselSwipeableState p;
    public Map q;
    public float r;
    public /* synthetic */ Object s;
    public final /* synthetic */ CarouselSwipeableState t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselSwipeableState$processNewAnchors$1(CarouselSwipeableState carouselSwipeableState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.t = carouselSwipeableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.b(null, null, this);
    }
}
